package saha.com.data.api

import dagger.Binds
import dagger.Module
import dagger.Provides
import io.ktor.client.HttpClient
import io.ktor.client.engine.okhttp.OkHttp
import io.ktor.client.features.json.JsonFeature
import io.ktor.client.features.json.serializer.KotlinxSerializer
import kotlinx.serialization.json.Json
import okhttp3.logging.HttpLoggingInterceptor
import javax.inject.Named

/**
 * Created by chinmoy-saha on 2019-05-13.
 */
@Module(includes = [ApiModule.Providers::class])
internal abstract class ApiModule {

    @Binds abstract fun JobApi(impl: InjectableKtorJobApi): JobApi

    @Module
    internal object Providers {
        @JvmStatic @Provides fun httpClient(): HttpClient {
            return HttpClient(OkHttp) {
                engine {
                    if (BuildConfig.DEBUG) {
                        val loggingInterceptor = HttpLoggingInterceptor()
                        loggingInterceptor.level = HttpLoggingInterceptor.Level.HEADERS
                        addInterceptor(loggingInterceptor)
                    }

                    addInterceptor(UserAgentInterceptor())
                }
                install(JsonFeature) {
                    serializer = KotlinxSerializer(Json.nonstrict)
                }
            }
        }

        @JvmStatic @Provides @Named("apiEndpoint") fun apiEndpoint(): String {
            return saha.com.data.api_impl.apiEndpoint()
        }
    }
}