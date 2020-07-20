package com.raywenderlich.android.droidwiki.dagger;

import com.raywenderlich.android.droidwiki.network.Wiki;
import com.raywenderlich.android.droidwiki.ui.search.EntryPresenter;
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
public final class PresenterModule_ProvideSearchPresenterFactory implements Factory<EntryPresenter> {
  private final PresenterModule module;

  private final Provider<Wiki> wikiProvider;

  public PresenterModule_ProvideSearchPresenterFactory(PresenterModule module,
      Provider<Wiki> wikiProvider) {
    this.module = module;
    this.wikiProvider = wikiProvider;
  }

  @Override
  public EntryPresenter get() {
    return provideSearchPresenter(module, wikiProvider.get());
  }

  public static PresenterModule_ProvideSearchPresenterFactory create(PresenterModule module,
      Provider<Wiki> wikiProvider) {
    return new PresenterModule_ProvideSearchPresenterFactory(module, wikiProvider);
  }

  public static EntryPresenter provideSearchPresenter(PresenterModule instance, Wiki wiki) {
    return Preconditions.checkNotNull(instance.provideSearchPresenter(wiki), "Cannot return null from a non-@Nullable @Provides method");
  }
}
