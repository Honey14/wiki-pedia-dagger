package com.raywenderlich.android.droidwiki.dagger

import com.raywenderlich.android.droidwiki.utils.Const
import dagger.Module
import dagger.Provides
import okhttp3.HttpUrl
import okhttp3.OkHttpClient
import javax.inject.Named
import javax.inject.Singleton

@Module
class NetworkModule {
  
  companion object {
    private const val BASE_URL = "NAME_BASE_URL"
  }

  @Provides
  @Named(BASE_URL)
  fun provideBaseUrlString() = "${Const.PROTOCOL}://${Const.LANGUAGE}.${Const.BASE_URL}"

  @Provides
  @Singleton
  fun provideHttpClient() = OkHttpClient()

  @Provides
  @Singleton
  fun provideRequestBuilder(@Named(BASE_URL) baseUrl: String) =
      HttpUrl.parse(baseUrl)?.newBuilder()

  //  @Provides
  //  @Singleton
  //  fun provideWikiApi(okHttpClient: OkHttpClient, requestBuilder : HttpUrl.Builder) = WikiApi(okHttpClient,requestBuilder)
}
