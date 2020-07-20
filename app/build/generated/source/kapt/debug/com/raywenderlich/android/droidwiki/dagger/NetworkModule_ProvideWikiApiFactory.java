package com.raywenderlich.android.droidwiki.dagger;

import com.raywenderlich.android.droidwiki.network.WikiApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideWikiApiFactory implements Factory<WikiApi> {
  private final NetworkModule module;

  private final Provider<OkHttpClient> okHttpClientProvider;

  private final Provider<HttpUrl.Builder> requestBuilderProvider;

  public NetworkModule_ProvideWikiApiFactory(NetworkModule module,
      Provider<OkHttpClient> okHttpClientProvider,
      Provider<HttpUrl.Builder> requestBuilderProvider) {
    this.module = module;
    this.okHttpClientProvider = okHttpClientProvider;
    this.requestBuilderProvider = requestBuilderProvider;
  }

  @Override
  public WikiApi get() {
    return provideWikiApi(module, okHttpClientProvider.get(), requestBuilderProvider.get());
  }

  public static NetworkModule_ProvideWikiApiFactory create(NetworkModule module,
      Provider<OkHttpClient> okHttpClientProvider,
      Provider<HttpUrl.Builder> requestBuilderProvider) {
    return new NetworkModule_ProvideWikiApiFactory(module, okHttpClientProvider, requestBuilderProvider);
  }

  public static WikiApi provideWikiApi(NetworkModule instance, OkHttpClient okHttpClient,
      HttpUrl.Builder requestBuilder) {
    return Preconditions.checkNotNull(instance.provideWikiApi(okHttpClient, requestBuilder), "Cannot return null from a non-@Nullable @Provides method");
  }
}
