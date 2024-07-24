package com.example.android_factorypattern

import android.view.View
import androidx.lifecycle.ViewModel

class MainViewModel(
    private val notificationFactory: NotificationFactory
) : ViewModel() {

    fun showNotification(type: String, view: View) {
        val notification = notificationFactory.createNotification(type, view)
        notification.notifyUser()
    }
}