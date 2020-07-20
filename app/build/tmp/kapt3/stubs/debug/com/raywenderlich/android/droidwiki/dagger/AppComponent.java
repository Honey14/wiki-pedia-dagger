package com.raywenderlich.android.droidwiki.dagger;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/raywenderlich/android/droidwiki/dagger/AppComponent;", "", "inject", "", "target", "Lcom/raywenderlich/android/droidwiki/ui/homepage/HomepageActivity;", "Lcom/raywenderlich/android/droidwiki/ui/search/SearchActivity;", "app_debug"})
@dagger.Component(modules = {com.raywenderlich.android.droidwiki.dagger.AppModule.class, com.raywenderlich.android.droidwiki.dagger.PresenterModule.class, com.raywenderlich.android.droidwiki.dagger.NetworkModule.class, com.raywenderlich.android.droidwiki.dagger.WikiModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.droidwiki.ui.homepage.HomepageActivity target);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.droidwiki.ui.search.SearchActivity target);
}