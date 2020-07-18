package com.raywenderlich.android.droidwiki.ui.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0013B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u001e\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0018\u00010\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u001e\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/raywenderlich/android/droidwiki/ui/search/EntryAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/raywenderlich/android/droidwiki/ui/search/EntryAdapter$EntryHolder;", "context", "Landroid/content/Context;", "results", "", "Lcom/raywenderlich/android/droidwiki/model/Entry;", "(Landroid/content/Context;Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "EntryHolder", "app_debug"})
public final class EntryAdapter extends android.support.v7.widget.RecyclerView.Adapter<com.raywenderlich.android.droidwiki.ui.search.EntryAdapter.EntryHolder> {
    private final android.content.Context context = null;
    private final java.util.List<com.raywenderlich.android.droidwiki.model.Entry> results = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.raywenderlich.android.droidwiki.ui.search.EntryAdapter.EntryHolder onCreateViewHolder(@org.jetbrains.annotations.Nullable()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.Nullable()
    com.raywenderlich.android.droidwiki.ui.search.EntryAdapter.EntryHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public EntryAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<com.raywenderlich.android.droidwiki.model.Entry> results) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lcom/raywenderlich/android/droidwiki/ui/search/EntryAdapter$EntryHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/raywenderlich/android/droidwiki/ui/search/EntryAdapter;Landroid/view/View;)V", "snippetView", "Landroid/widget/TextView;", "getSnippetView", "()Landroid/widget/TextView;", "titleView", "getTitleView", "app_debug"})
    public final class EntryHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView titleView = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView snippetView = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTitleView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getSnippetView() {
            return null;
        }
        
        public EntryHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
}