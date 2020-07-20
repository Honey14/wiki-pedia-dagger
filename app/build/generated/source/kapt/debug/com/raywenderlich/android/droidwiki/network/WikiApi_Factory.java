package com.raywenderlich.android.droidwiki.network;

import dagger.internal.Factory;
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
public final class WikiApi_Factory implements Factory<WikiApi> {
  private final Provider<OkHttpClient> clientProvider;

  private final Provider<HttpUrl.Builder> requestBuilderProvider;

  public WikiApi_Factory(Provider<OkHttpClient> clientProvider,
      Provider<HttpUrl.Builder> requestBuilderProvider) {
    this.clientProvider = clientProvider;
    this.requestBuilderProvider = requestBuilderProvider;
  }

  @Override
  public WikiApi get() {
    return newInstance(clientProvider.get(), requestBuilderProvider.get());
  }

  public static WikiApi_Factory create(Provider<OkHttpClient> clientProvider,
      Provider<HttpUrl.Builder> requestBuilderProvider) {
    return new WikiApi_Factory(clientProvider, requestBuilderProvider);
  }

  public static WikiApi newInstance(OkHttpClient client, HttpUrl.Builder requestBuilder) {
    return new WikiApi(client, requestBuilder);
  }
}
