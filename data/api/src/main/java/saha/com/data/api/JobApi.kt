package saha.com.data.api
import saha.com.data.api.response.JobListResponse

/**
 * Created by chinmoy-saha on 2019-05-12.
 */

interface  JobApi {
    suspend fun getJobList(): JobListResponse
}