package com.raywenderlich.android.droidwiki.dagger;

import com.raywenderlich.android.droidwiki.network.Homepage;
import com.raywenderlich.android.droidwiki.network.Wiki;
import com.raywenderlich.android.droidwiki.network.WikiApi;
import com.raywenderlich.android.droidwiki.ui.homepage.HomepageActivity;
import com.raywenderlich.android.droidwiki.ui.homepage.HomepageActivity_MembersInjector;
import com.raywenderlich.android.droidwiki.ui.homepage.HomepagePresenter;
import com.raywenderlich.android.droidwiki.ui.search.EntryPresenter;
import com.raywenderlich.android.droidwiki.ui.search.SearchActivity;
import com.raywenderlich.android.droidwiki.ui.search.SearchActivity_MembersInjector;
import dagger.internal.DoubleCheck;
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
public final class DaggerAppComponent implements AppComponent {
  private Provider<OkHttpClient> provideHttpClientProvider;

  private Provider<String> provideBaseUrlStringProvider;

  private Provider<HttpUrl.Builder> provideRequestBuilderProvider;

  private Provider<WikiApi> provideWikiApiProvider;

  private Provider<Homepage> provideHomepageProvider;

  private Provider<HomepagePresenter> provideHomePagePresenterProvider;

  private Provider<Wiki> provideWikiProvider;

  private Provider<EntryPresenter> provideSearchPresenterProvider;

  private DaggerAppComponent(PresenterModule presenterModuleParam, NetworkModule networkModuleParam,
      WikiModule wikiModuleParam) {

    initialize(presenterModuleParam, networkModuleParam, wikiModuleParam);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static AppComponent create() {
    return new Builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final PresenterModule presenterModuleParam,
      final NetworkModule networkModuleParam, final WikiModule wikiModuleParam) {
    this.provideHttpClientProvider = DoubleCheck.provider(NetworkModule_ProvideHttpClientFactory.create(networkModuleParam));
    this.provideBaseUrlStringProvider = NetworkModule_ProvideBaseUrlStringFactory.create(networkModuleParam);
    this.provideRequestBuilderProvider = DoubleCheck.provider(NetworkModule_ProvideRequestBuilderFactory.create(networkModuleParam, provideBaseUrlStringProvider));
    this.provideWikiApiProvider = DoubleCheck.provider(NetworkModule_ProvideWikiApiFactory.create(networkModuleParam, provideHttpClientProvider, provideRequestBuilderProvider));
    this.provideHomepageProvider = DoubleCheck.provider(WikiModule_ProvideHomepageFactory.create(wikiModuleParam, provideWikiApiProvider));
    this.provideHomePagePresenterProvider = DoubleCheck.provider(PresenterModule_ProvideHomePagePresenterFactory.create(presenterModuleParam, provideHomepageProvider));
    this.provideWikiProvider = DoubleCheck.provider(WikiModule_ProvideWikiFactory.create(wikiModuleParam, provideWikiApiProvider));
    this.provideSearchPresenterProvider = DoubleCheck.provider(PresenterModule_ProvideSearchPresenterFactory.create(presenterModuleParam, provideWikiProvider));
  }

  @Override
  public void inject(HomepageActivity target) {
    injectHomepageActivity(target);}

  @Override
  public void inject(SearchActivity target) {
    injectSearchActivity(target);}

  private HomepageActivity injectHomepageActivity(HomepageActivity instance) {
    HomepageActivity_MembersInjector.injectPresenter(instance, provideHomePagePresenterProvider.get());
    return instance;
  }

  private SearchActivity injectSearchActivity(SearchActivity instance) {
    SearchActivity_MembersInjector.injectPresenter(instance, provideSearchPresenterProvider.get());
    return instance;
  }

  public static final class Builder {
    private PresenterModule presenterModule;

    private NetworkModule networkModule;

    private WikiModule wikiModule;

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

    public Builder networkModule(NetworkModule networkModule) {
      this.networkModule = Preconditions.checkNotNull(networkModule);
      return this;
    }

    public Builder wikiModule(WikiModule wikiModule) {
      this.wikiModule = Preconditions.checkNotNull(wikiModule);
      return this;
    }

    public AppComponent build() {
      if (presenterModule == null) {
        this.presenterModule = new PresenterModule();
      }
      if (networkModule == null) {
        this.networkModule = new NetworkModule();
      }
      if (wikiModule == null) {
        this.wikiModule = new WikiModule();
      }
      return new DaggerAppComponent(presenterModule, networkModule, wikiModule);
    }
  }
}
