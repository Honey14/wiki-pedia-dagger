package com.raywenderlich.android.droidwiki.ui.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/raywenderlich/android/droidwiki/ui/search/EntryPresenterImpl;", "Lcom/raywenderlich/android/droidwiki/ui/search/EntryPresenter;", "()V", "api", "Lcom/raywenderlich/android/droidwiki/network/WikiApi;", "client", "Lokhttp3/OkHttpClient;", "entryView", "Lcom/raywenderlich/android/droidwiki/ui/search/EntryView;", "wiki", "Lcom/raywenderlich/android/droidwiki/network/Wiki;", "getEntry", "", "query", "", "setView", "app_debug"})
public final class EntryPresenterImpl implements com.raywenderlich.android.droidwiki.ui.search.EntryPresenter {
    private com.raywenderlich.android.droidwiki.ui.search.EntryView entryView;
    private final okhttp3.OkHttpClient client = null;
    private final com.raywenderlich.android.droidwiki.network.WikiApi api = null;
    private final com.raywenderlich.android.droidwiki.network.Wiki wiki = null;
    
    @java.lang.Override()
    public void setView(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.droidwiki.ui.search.EntryView entryView) {
    }
    
    @java.lang.Override()
    public void getEntry(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    public EntryPresenterImpl() {
        super();
    }
}