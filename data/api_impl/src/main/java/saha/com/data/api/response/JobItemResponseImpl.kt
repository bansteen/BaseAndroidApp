package saha.com.data.api.response

import kotlinx.serialization.Serializable

/**
 * Created by chinmoy-saha on 2019-05-12.
 */
@Serializable
data class JobItemResponseImpl(
    override val id: Int,
    override val memberId: Int,
    override val title: Int,
    override val description: String,
    override val company: String,
    override val location: String,
    override val type: Int,
    override val minPay: Float,
    override val maxPay: Float,
    override val payType: Int,
    override val payTime: Int,
    override val referralFee: Float,
    override val expiration: Int,
    override val createdAt: Int,
    override val updatedAt: Int
): JobItemResponse