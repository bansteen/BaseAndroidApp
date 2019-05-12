package saha.com.api
import saha.com.api.response.JobListResponse

/**
 * Created by chinmoy-saha on 2019-05-12.
 */

interface  JobApi {
    suspend fun getJobList(): JobListResponse
}