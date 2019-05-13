package saha.com.data.api

import io.ktor.client.HttpClient
import io.ktor.client.request.accept
import io.ktor.client.request.get
import io.ktor.client.request.url
import io.ktor.http.ContentType
import kotlinx.serialization.json.Json
import saha.com.api.JobApi
import saha.com.api.response.JobListResponse
import saha.com.api.response.JobListResponseImpl
import kotlin.coroutines.CoroutineContext

/**
 * Created by chinmoy-saha on 2019-05-13.
 */
open class KtorJobApi constructor(
    val httpClient: HttpClient,
    val apiEndpoint: String,
    val coroutineDispatcherForCallback: CoroutineContext?
) : JobApi {
    override suspend fun getJobList(): JobListResponse {
        val rawResponse = httpClient.get<String> {
            url(apiEndpoint)
            accept(ContentType.Application.Json)
        }
        return Json.nonstrict.parse(JobListResponseImpl.serializer(), rawResponse)
    }
}
