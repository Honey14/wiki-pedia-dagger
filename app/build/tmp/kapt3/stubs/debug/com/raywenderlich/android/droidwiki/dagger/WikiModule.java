package com.raywenderlich.android.droidwiki.dagger;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\t"}, d2 = {"Lcom/raywenderlich/android/droidwiki/dagger/WikiModule;", "", "()V", "provideHomepage", "Lcom/raywenderlich/android/droidwiki/network/Homepage;", "api", "Lcom/raywenderlich/android/droidwiki/network/WikiApi;", "provideWiki", "Lcom/raywenderlich/android/droidwiki/network/Wiki;", "app_debug"})
@dagger.Module()
public final class WikiModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.raywenderlich.android.droidwiki.network.Homepage provideHomepage(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.droidwiki.network.WikiApi api) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.raywenderlich.android.droidwiki.network.Wiki provideWiki(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.droidwiki.network.WikiApi api) {
        return null;
    }
    
    public WikiModule() {
        super();
    }
}