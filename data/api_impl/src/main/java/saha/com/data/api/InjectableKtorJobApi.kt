package saha.com.data.api

import io.ktor.client.HttpClient
import saha.com.data.api.KtorJobApi
import javax.inject.Inject
import javax.inject.Named

/**
 * Created by chinmoy-saha on 2019-05-13.
 */
class InjectableKtorJobApi @Inject constructor(
    httpClient: HttpClient,
    @Named("apiEndpoint") apiEndpoint: String
) : KtorJobApi(httpClient, apiEndpoint, null)