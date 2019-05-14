package saha.com.data.db.entity

/**
 * Copyright (C) 2019 DMM.com. All Rights Reserved.
 * Created by chinmoy-saha on 2019-05-14.
 */

interface JobInfoEntity {
    var id: Int
    var memberId: Int
    var title: Int
    var description: String
    var company: String
    var location: String
    var type: Int
    var minPay: Float
    var maxPay: Float
    var payType: Int
    var payTime: Int
    var referralFee: Float
    var expiration: Int
    var createdAt: Int
    var updatedAt: Int
}