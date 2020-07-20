package com.raywenderlich.android.droidwiki.ui.homepage;

import com.raywenderlich.android.droidwiki.network.Homepage;
import dagger.internal.Factory;
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
public final class HomepagePresenterImpl_Factory implements Factory<HomepagePresenterImpl> {
  private final Provider<Homepage> homepageProvider;

  public HomepagePresenterImpl_Factory(Provider<Homepage> homepageProvider) {
    this.homepageProvider = homepageProvider;
  }

  @Override
  public HomepagePresenterImpl get() {
    return newInstance(homepageProvider.get());
  }

  public static HomepagePresenterImpl_Factory create(Provider<Homepage> homepageProvider) {
    return new HomepagePresenterImpl_Factory(homepageProvider);
  }

  public static HomepagePresenterImpl newInstance(Homepage homepage) {
    return new HomepagePresenterImpl(homepage);
  }
}
