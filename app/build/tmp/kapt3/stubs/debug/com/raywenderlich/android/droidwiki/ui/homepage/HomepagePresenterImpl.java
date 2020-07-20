package com.raywenderlich.android.droidwiki.ui.homepage;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/raywenderlich/android/droidwiki/ui/homepage/HomepagePresenterImpl;", "Lcom/raywenderlich/android/droidwiki/ui/homepage/HomepagePresenter;", "homepage", "Lcom/raywenderlich/android/droidwiki/network/Homepage;", "(Lcom/raywenderlich/android/droidwiki/network/Homepage;)V", "homepageView", "Lcom/raywenderlich/android/droidwiki/ui/homepage/HomepageView;", "loadHomepage", "", "setView", "app_debug"})
public final class HomepagePresenterImpl implements com.raywenderlich.android.droidwiki.ui.homepage.HomepagePresenter {
    private com.raywenderlich.android.droidwiki.ui.homepage.HomepageView homepageView;
    private final com.raywenderlich.android.droidwiki.network.Homepage homepage = null;
    
    @java.lang.Override()
    public void setView(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.droidwiki.ui.homepage.HomepageView homepageView) {
    }
    
    @java.lang.Override()
    public void loadHomepage() {
    }
    
    @javax.inject.Inject()
    public HomepagePresenterImpl(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.droidwiki.network.Homepage homepage) {
        super();
    }
}