package com.raywenderlich.android.droidwiki.dagger;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideBaseUrlStringFactory implements Factory<String> {
  private final NetworkModule module;

  public NetworkModule_ProvideBaseUrlStringFactory(NetworkModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return provideBaseUrlString(module);
  }

  public static NetworkModule_ProvideBaseUrlStringFactory create(NetworkModule module) {
    return new NetworkModule_ProvideBaseUrlStringFactory(module);
  }

  public static String provideBaseUrlString(NetworkModule instance) {
    return Preconditions.checkNotNull(instance.provideBaseUrlString(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
