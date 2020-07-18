package com.raywenderlich.android.droidwiki.dagger;

import android.content.Context;
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
public final class AppModule_ProvideContextFactory implements Factory<Context> {
  private final AppModule module;

  public AppModule_ProvideContextFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public Context get() {
    return provideContext(module);
  }

  public static AppModule_ProvideContextFactory create(AppModule module) {
    return new AppModule_ProvideContextFactory(module);
  }

  public static Context provideContext(AppModule instance) {
    return Preconditions.checkNotNull(instance.provideContext(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
