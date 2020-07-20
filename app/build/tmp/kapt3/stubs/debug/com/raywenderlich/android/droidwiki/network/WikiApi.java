package com.raywenderlich.android.droidwiki.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/raywenderlich/android/droidwiki/network/WikiApi;", "", "client", "Lokhttp3/OkHttpClient;", "requestBuilder", "Lokhttp3/HttpUrl$Builder;", "(Lokhttp3/OkHttpClient;Lokhttp3/HttpUrl$Builder;)V", "getHomepage", "Lokhttp3/Call;", "search", "query", "", "app_debug"})
public final class WikiApi {
    private final okhttp3.OkHttpClient client = null;
    private final okhttp3.HttpUrl.Builder requestBuilder = null;
    
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.Call search(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.Call getHomepage() {
        return null;
    }
    
    @javax.inject.Inject()
    public WikiApi(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient client, @org.jetbrains.annotations.Nullable()
    okhttp3.HttpUrl.Builder requestBuilder) {
        super();
    }
}