package com.raywenderlich.android.droidwiki.ui.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0016\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH&J\b\u0010\u000b\u001a\u00020\u0003H&\u00a8\u0006\f"}, d2 = {"Lcom/raywenderlich/android/droidwiki/ui/search/EntryView;", "", "dismissLoading", "", "displayEntries", "results", "", "Lcom/raywenderlich/android/droidwiki/model/Entry;", "displayError", "error", "", "displayLoading", "app_debug"})
public abstract interface EntryView {
    
    public abstract void displayLoading();
    
    public abstract void dismissLoading();
    
    public abstract void displayEntries(@org.jetbrains.annotations.NotNull()
    java.util.List<com.raywenderlich.android.droidwiki.model.Entry> results);
    
    public abstract void displayError(@org.jetbrains.annotations.Nullable()
    java.lang.String error);
}