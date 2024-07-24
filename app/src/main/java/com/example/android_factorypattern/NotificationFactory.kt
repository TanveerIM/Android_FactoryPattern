package com.example.android_factorypattern

import android.view.View

interface NotificationFactory {
    fun createNotification(type: String, view: View): Notification
}