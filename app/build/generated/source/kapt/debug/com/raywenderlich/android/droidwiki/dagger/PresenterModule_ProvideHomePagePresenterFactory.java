package com.raywenderlich.android.droidwiki.dagger;

import com.raywenderlich.android.droidwiki.ui.homepage.HomepagePresenter;
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
public final class PresenterModule_ProvideHomePagePresenterFactory implements Factory<HomepagePresenter> {
  private final PresenterModule module;

  public PresenterModule_ProvideHomePagePresenterFactory(PresenterModule module) {
    this.module = module;
  }

  @Override
  public HomepagePresenter get() {
    return provideHomePagePresenter(module);
  }

  public static PresenterModule_ProvideHomePagePresenterFactory create(PresenterModule module) {
    return new PresenterModule_ProvideHomePagePresenterFactory(module);
  }

  public static HomepagePresenter provideHomePagePresenter(PresenterModule instance) {
    return Preconditions.checkNotNull(instance.provideHomePagePresenter(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
