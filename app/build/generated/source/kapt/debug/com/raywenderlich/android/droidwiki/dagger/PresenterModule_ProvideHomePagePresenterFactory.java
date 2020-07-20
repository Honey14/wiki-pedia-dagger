package com.raywenderlich.android.droidwiki.dagger;

import com.raywenderlich.android.droidwiki.network.Homepage;
import com.raywenderlich.android.droidwiki.ui.homepage.HomepagePresenter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

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

  private final Provider<Homepage> homepageProvider;

  public PresenterModule_ProvideHomePagePresenterFactory(PresenterModule module,
      Provider<Homepage> homepageProvider) {
    this.module = module;
    this.homepageProvider = homepageProvider;
  }

  @Override
  public HomepagePresenter get() {
    return provideHomePagePresenter(module, homepageProvider.get());
  }

  public static PresenterModule_ProvideHomePagePresenterFactory create(PresenterModule module,
      Provider<Homepage> homepageProvider) {
    return new PresenterModule_ProvideHomePagePresenterFactory(module, homepageProvider);
  }

  public static HomepagePresenter provideHomePagePresenter(PresenterModule instance,
      Homepage homepage) {
    return Preconditions.checkNotNull(instance.provideHomePagePresenter(homepage), "Cannot return null from a non-@Nullable @Provides method");
  }
}
