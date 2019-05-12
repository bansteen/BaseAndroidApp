package saha.com.model

/**
 * Created by chinmoy-saha on 2019-05-11.
 */
data class Job(
    val id: Int,
    val memberId: Int,
    val title: Int,
    val description: String,
    val company: String,
    val location: String,
    val type: JobType,
    val minPay: Float,
    val maxPay: Float,
    val payType: PayType,
    val payTime: PayTime,
    val referralFee: Float,
    val expiration: Int,
    val createdAt: Int,
    val updatedAt: Int
) {
    enum class JobType {
        PERMANENT,
        PART_TIME,
        INTERN
    }
    enum class PayType {
        FIXED,
        FLEX
    }
    enum class PayTime {
        MONTHLY,
        HOURLY
    }
}
