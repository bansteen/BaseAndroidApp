package saha.com.data.api.response

import kotlinx.serialization.Serializable


/**
 * Created by chinmoy-saha on 2019-05-12.
 */
@Serializable
data class JobListResponseImpl(
    override val jobList: List<JobItemResponseImpl>)
    : JobListResponse