package saha.com.data.db.entity.mapper

import saha.com.data.api.response.JobItemResponse
import saha.com.data.db.entity.JobInfoEntityImpl

/**
 * Created by chinmoy-saha@dmm.com on 2019-05-18.
 */

fun List<JobItemResponse>.toJobInfoEntities (): List<JobInfoEntityImpl> =
        mapIndexed {index, responseJobInfo ->
            JobInfoEntityImpl(responseJobInfo.id,
                responseJobInfo.memberId,
                responseJobInfo.title,
                responseJobInfo.description,
                responseJobInfo.company,
                responseJobInfo.location,
                responseJobInfo.type,
                responseJobInfo.minPay,
                responseJobInfo.maxPay,
                responseJobInfo.payType,
                responseJobInfo.payTime,
                responseJobInfo.referralFee,
                responseJobInfo.expiration,
                responseJobInfo.createdAt,
                responseJobInfo.updatedAt)
        }