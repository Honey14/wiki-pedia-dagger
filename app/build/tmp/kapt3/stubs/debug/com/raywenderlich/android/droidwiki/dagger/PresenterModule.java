package com.raywenderlich.android.droidwiki.dagger;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/raywenderlich/android/droidwiki/dagger/PresenterModule;", "", "()V", "provideHomePagePresenter", "Lcom/raywenderlich/android/droidwiki/ui/homepage/HomepagePresenter;", "provideSearchPresenter", "Lcom/raywenderlich/android/droidwiki/ui/search/EntryPresenter;", "app_debug"})
@dagger.Module()
public final class PresenterModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.raywenderlich.android.droidwiki.ui.homepage.HomepagePresenter provideHomePagePresenter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.raywenderlich.android.droidwiki.ui.search.EntryPresenter provideSearchPresenter() {
        return null;
    }
    
    public PresenterModule() {
        super();
    }
}