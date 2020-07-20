package com.raywenderlich.android.droidwiki.dagger

import com.raywenderlich.android.droidwiki.network.Homepage
import com.raywenderlich.android.droidwiki.network.Wiki
import com.raywenderlich.android.droidwiki.ui.homepage.HomepagePresenter
import com.raywenderlich.android.droidwiki.ui.homepage.HomepagePresenterImpl
import com.raywenderlich.android.droidwiki.ui.search.EntryPresenter
import com.raywenderlich.android.droidwiki.ui.search.EntryPresenterImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class PresenterModule {

  @Provides
  @Singleton
  fun provideHomePagePresenter(homepage: Homepage): HomepagePresenter = HomepagePresenterImpl(homepage)

  @Provides
  @Singleton
  fun provideSearchPresenter(wiki: Wiki) : EntryPresenter = EntryPresenterImpl(wiki)
}