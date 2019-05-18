package saha.com.data.repository

import saha.com.data.api.JobApi
import saha.com.data.db.JobListDatabase
import saha.com.model.JobInfo
import saha.com.model.JobType
import saha.com.model.PayTime
import saha.com.model.PayType
import javax.inject.Inject

/**
 * Created by chinmoy-saha@dmm.com on 2019-05-18.
 */
class JobListDataRepo @Inject constructor(
    private val api: JobApi,
    private val jobListDatabase: JobListDatabase
) : JobListRepository {
    override suspend fun jobs() = jobListDatabase
        .jobs()
        .mapNotNull { jobInfoEntity ->
            JobInfo(
                jobInfoEntity.id,
                jobInfoEntity.memberId,
                jobInfoEntity.title,
                jobInfoEntity.description,
                jobInfoEntity.company,
                jobInfoEntity.location,
                JobType.values()[jobInfoEntity.type],
                jobInfoEntity.minPay,
                jobInfoEntity.maxPay,
                PayType.values()[jobInfoEntity.payType],
                PayTime.values()[jobInfoEntity.payTime],
                jobInfoEntity.referralFee,
                jobInfoEntity.expiration,
                jobInfoEntity.createdAt,
                jobInfoEntity.updatedAt
                )
        }

    override suspend fun refresh() {
        val response = api.getJobList()
        jobListDatabase.save(response)
    }
}