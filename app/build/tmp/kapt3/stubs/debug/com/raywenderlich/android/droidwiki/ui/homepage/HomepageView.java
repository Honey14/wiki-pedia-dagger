package com.raywenderlich.android.droidwiki.ui.homepage;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0003H&\u00a8\u0006\u000b"}, d2 = {"Lcom/raywenderlich/android/droidwiki/ui/homepage/HomepageView;", "", "dismissLoading", "", "displayError", "error", "", "displayHomepage", "result", "Lcom/raywenderlich/android/droidwiki/model/WikiHomepage;", "displayLoading", "app_debug"})
public abstract interface HomepageView {
    
    public abstract void displayLoading();
    
    public abstract void dismissLoading();
    
    public abstract void displayHomepage(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.droidwiki.model.WikiHomepage result);
    
    public abstract void displayError(@org.jetbrains.annotations.Nullable()
    java.lang.String error);
}