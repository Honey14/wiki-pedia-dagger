package com.raywenderlich.android.droidwiki.dagger;

import com.raywenderlich.android.droidwiki.ui.homepage.HomepageActivity;
import com.raywenderlich.android.droidwiki.ui.homepage.HomepageActivity_MembersInjector;
import com.raywenderlich.android.droidwiki.ui.homepage.HomepagePresenter;
import dagger.internal.DoubleCheck;
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
public final class DaggerAppComponent implements AppComponent {
  private Provider<HomepagePresenter> provideHomePagePresenterProvider;

  private DaggerAppComponent(PresenterModule presenterModuleParam) {

    initialize(presenterModuleParam);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static AppComponent create() {
    return new Builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final PresenterModule presenterModuleParam) {
    this.provideHomePagePresenterProvider = DoubleCheck.provider(PresenterModule_ProvideHomePagePresenterFactory.create(presenterModuleParam));
  }

  @Override
  public void inject(HomepageActivity target) {
    injectHomepageActivity(target);}

  private HomepageActivity injectHomepageActivity(HomepageActivity instance) {
    HomepageActivity_MembersInjector.injectPresenter(instance, provideHomePagePresenterProvider.get());
    return instance;
  }

  public static final class Builder {
    private PresenterModule presenterModule;

    private Builder() {
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder appModule(AppModule appModule) {
      Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder presenterModule(PresenterModule presenterModule) {
      this.presenterModule = Preconditions.checkNotNull(presenterModule);
      return this;
    }

    public AppComponent build() {
      if (presenterModule == null) {
        this.presenterModule = new PresenterModule();
      }
      return new DaggerAppComponent(presenterModule);
    }
  }
}
