package saha.com.data.api.response

/**
 * Created by chinmoy-saha on 2019-05-12.
 */
interface JobItemResponse {
    val id: Int
    val memberId: Int
    val title: Int
    val description: String
    val company: String
    val location: String
    val type: Int
    val minPay: Float
    val maxPay: Float
    val payType: Int
    val payTime: Int
    val referralFee: Float
    val expiration: Int
    val createdAt: Int
    val updatedAt: Int
}