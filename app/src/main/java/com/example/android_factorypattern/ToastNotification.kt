package com.example.android_factorypattern

import android.content.Context
import android.widget.Toast

class ToastNotification(
    private val context: Context,
    private val message: String
) : Notification {
    override fun notifyUser() {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}