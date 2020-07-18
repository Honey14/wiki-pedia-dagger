package com.raywenderlich.android.droidwiki.ui.homepage;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/raywenderlich/android/droidwiki/ui/homepage/HomepagePresenterImpl;", "Lcom/raywenderlich/android/droidwiki/ui/homepage/HomepagePresenter;", "()V", "api", "Lcom/raywenderlich/android/droidwiki/network/WikiApi;", "client", "Lokhttp3/OkHttpClient;", "homepage", "Lcom/raywenderlich/android/droidwiki/network/Homepage;", "homepageView", "Lcom/raywenderlich/android/droidwiki/ui/homepage/HomepageView;", "loadHomepage", "", "setView", "app_debug"})
public final class HomepagePresenterImpl implements com.raywenderlich.android.droidwiki.ui.homepage.HomepagePresenter {
    private com.raywenderlich.android.droidwiki.ui.homepage.HomepageView homepageView;
    private final okhttp3.OkHttpClient client = null;
    private final com.raywenderlich.android.droidwiki.network.WikiApi api = null;
    private final com.raywenderlich.android.droidwiki.network.Homepage homepage = null;
    
    @java.lang.Override()
    public void setView(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.droidwiki.ui.homepage.HomepageView homepageView) {
    }
    
    @java.lang.Override()
    public void loadHomepage() {
    }
    
    public HomepagePresenterImpl() {
        super();
    }
}