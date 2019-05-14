package saha.com.data.db

import saha.com.data.api.response.JobListResponse
import saha.com.data.db.entity.JobInfoEntity

/**
 * Created by chinmoy-saha on 2019-05-14.
 */
interface JobListDatabase {
    suspend  fun jobs(): List<JobInfoEntity>
    suspend fun save(apiResponse: JobListResponse)
}