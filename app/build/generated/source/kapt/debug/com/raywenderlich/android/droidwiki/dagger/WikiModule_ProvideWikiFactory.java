package com.raywenderlich.android.droidwiki.dagger;

import com.raywenderlich.android.droidwiki.network.Wiki;
import com.raywenderlich.android.droidwiki.network.WikiApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class WikiModule_ProvideWikiFactory implements Factory<Wiki> {
  private final WikiModule module;

  private final Provider<WikiApi> apiProvider;

  public WikiModule_ProvideWikiFactory(WikiModule module, Provider<WikiApi> apiProvider) {
    this.module = module;
    this.apiProvider = apiProvider;
  }

  @Override
  public Wiki get() {
    return provideWiki(module, apiProvider.get());
  }

  public static WikiModule_ProvideWikiFactory create(WikiModule module,
      Provider<WikiApi> apiProvider) {
    return new WikiModule_ProvideWikiFactory(module, apiProvider);
  }

  public static Wiki provideWiki(WikiModule instance, WikiApi api) {
    return Preconditions.checkNotNull(instance.provideWiki(api), "Cannot return null from a non-@Nullable @Provides method");
  }
}
