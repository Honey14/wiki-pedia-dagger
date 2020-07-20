package com.raywenderlich.android.droidwiki.application;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0000H\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Lcom/raywenderlich/android/droidwiki/application/WikiApplication;", "Landroid/app/Application;", "()V", "appComponent", "Lcom/raywenderlich/android/droidwiki/dagger/AppComponent;", "getAppComponent", "()Lcom/raywenderlich/android/droidwiki/dagger/AppComponent;", "setAppComponent", "(Lcom/raywenderlich/android/droidwiki/dagger/AppComponent;)V", "initDagger", "app", "onCreate", "", "app_debug"})
public final class WikiApplication extends android.app.Application {
    @org.jetbrains.annotations.NotNull()
    public com.raywenderlich.android.droidwiki.dagger.AppComponent appComponent;
    
    @org.jetbrains.annotations.NotNull()
    public final com.raywenderlich.android.droidwiki.dagger.AppComponent getAppComponent() {
        return null;
    }
    
    public final void setAppComponent(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.droidwiki.dagger.AppComponent p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    private final com.raywenderlich.android.droidwiki.dagger.AppComponent initDagger(com.raywenderlich.android.droidwiki.application.WikiApplication app) {
        return null;
    }
    
    public WikiApplication() {
        super();
    }
}