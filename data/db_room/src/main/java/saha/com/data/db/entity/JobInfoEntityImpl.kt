package saha.com.data.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Copyright (C) 2019 DMM.com. All Rights Reserved.
 * Created by chinmoy-saha on 2019-05-14.
 */

@Entity(tableName = "joblist")
data class JobInfoEntityImpl(
    @PrimaryKey
    override var id: Int,
    override var memberId: Int,
    override var title: Int,
    override var description: String,
    override var company: String,
    override var location: String,
    override var type: Int,
    override var minPay: Float,
    override var maxPay: Float,
    override var payType: Int,
    override var payTime: Int,
    override var referralFee: Float,
    override var expiration: Int,
    override var createdAt: Int,
    override var updatedAt: Int
) : JobInfoEntity