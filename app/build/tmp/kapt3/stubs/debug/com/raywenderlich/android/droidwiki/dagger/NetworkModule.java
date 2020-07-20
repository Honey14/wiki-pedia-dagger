package com.raywenderlich.android.droidwiki.dagger;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\t\u001a\u00020\u0004H\u0007J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0007\u00a8\u0006\u000f"}, d2 = {"Lcom/raywenderlich/android/droidwiki/dagger/NetworkModule;", "", "()V", "provideBaseUrlString", "", "provideHttpClient", "Lokhttp3/OkHttpClient;", "provideRequestBuilder", "Lokhttp3/HttpUrl$Builder;", "baseUrl", "provideWikiApi", "Lcom/raywenderlich/android/droidwiki/network/WikiApi;", "okHttpClient", "requestBuilder", "Companion", "app_debug"})
@dagger.Module()
public final class NetworkModule {
    private static final java.lang.String BASE_URL = "NAME_BASE_URL";
    public static final com.raywenderlich.android.droidwiki.dagger.NetworkModule.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "NAME_BASE_URL")
    @dagger.Provides()
    public final java.lang.String provideBaseUrlString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.OkHttpClient provideHttpClient() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.HttpUrl.Builder provideRequestBuilder(@org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "NAME_BASE_URL")
    java.lang.String baseUrl) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.raywenderlich.android.droidwiki.network.WikiApi provideWikiApi(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient, @org.jetbrains.annotations.Nullable()
    okhttp3.HttpUrl.Builder requestBuilder) {
        return null;
    }
    
    public NetworkModule() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/raywenderlich/android/droidwiki/dagger/NetworkModule$Companion;", "", "()V", "BASE_URL", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}