package com.raywenderlich.android.droidwiki.dagger;

import com.raywenderlich.android.droidwiki.ui.search.EntryPresenter;
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
public final class PresenterModule_ProvideSearchPresenterFactory implements Factory<EntryPresenter> {
  private final PresenterModule module;

  public PresenterModule_ProvideSearchPresenterFactory(PresenterModule module) {
    this.module = module;
  }

  @Override
  public EntryPresenter get() {
    return provideSearchPresenter(module);
  }

  public static PresenterModule_ProvideSearchPresenterFactory create(PresenterModule module) {
    return new PresenterModule_ProvideSearchPresenterFactory(module);
  }

  public static EntryPresenter provideSearchPresenter(PresenterModule instance) {
    return Preconditions.checkNotNull(instance.provideSearchPresenter(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
