package com.raywenderlich.android.droidwiki.ui.homepage;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
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
public final class HomepageActivity_MembersInjector implements MembersInjector<HomepageActivity> {
  private final Provider<HomepagePresenter> presenterProvider;

  public HomepageActivity_MembersInjector(Provider<HomepagePresenter> presenterProvider) {
    this.presenterProvider = presenterProvider;
  }

  public static MembersInjector<HomepageActivity> create(
      Provider<HomepagePresenter> presenterProvider) {
    return new HomepageActivity_MembersInjector(presenterProvider);}

  @Override
  public void injectMembers(HomepageActivity instance) {
    injectPresenter(instance, presenterProvider.get());
  }

  @InjectedFieldSignature("com.raywenderlich.android.droidwiki.ui.homepage.HomepageActivity.presenter")
  public static void injectPresenter(HomepageActivity instance, HomepagePresenter presenter) {
    instance.presenter = presenter;
  }
}
