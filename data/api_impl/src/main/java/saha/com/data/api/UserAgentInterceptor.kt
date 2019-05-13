package saha.com.data.api

import okhttp3.Interceptor
import okhttp3.Response

/**
 * Created by chinmoy-saha on 2019-05-13.
 */
internal class UserAgentInterceptor: Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.proceed(chain.request().newBuilder().apply {
            addHeader("User-Agent", "saha-base-android-app")
        }.build())
    }
}