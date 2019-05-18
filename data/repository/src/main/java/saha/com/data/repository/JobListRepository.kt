package saha.com.data.repository

import saha.com.model.JobInfo


/**
 * Created by chinmoy-saha on 2019-05-18.
 */
interface JobListRepository {
    suspend fun jobs(): List<JobInfo>
    suspend fun refresh()
}