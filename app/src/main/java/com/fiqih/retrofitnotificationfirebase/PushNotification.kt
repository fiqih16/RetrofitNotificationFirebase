package com.fiqih.retrofitnotificationfirebase

data class PushNotification (
    val data: NotificationData,
    val to: String
        )