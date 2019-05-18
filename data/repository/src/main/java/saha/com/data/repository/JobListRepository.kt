package saha.com.data.repository

import android.app.job.JobInfo

/**
 * Created by chinmoy-saha on 2019-05-18.
 */
interface JobListRepository {
    suspend fun jobs(): List<JobInfo>
    suspend fun refresh()
}