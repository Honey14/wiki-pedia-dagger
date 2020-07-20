package com.raywenderlich.android.droidwiki.dagger;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import okhttp3.OkHttpClient;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideHttpClientFactory implements Factory<OkHttpClient> {
  private final NetworkModule module;

  public NetworkModule_ProvideHttpClientFactory(NetworkModule module) {
    this.module = module;
  }

  @Override
  public OkHttpClient get() {
    return provideHttpClient(module);
  }

  public static NetworkModule_ProvideHttpClientFactory create(NetworkModule module) {
    return new NetworkModule_ProvideHttpClientFactory(module);
  }

  public static OkHttpClient provideHttpClient(NetworkModule instance) {
    return Preconditions.checkNotNull(instance.provideHttpClient(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
