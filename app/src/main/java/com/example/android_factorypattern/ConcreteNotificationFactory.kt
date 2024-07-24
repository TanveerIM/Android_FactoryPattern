package com.example.android_factorypattern

import android.content.Context
import android.view.View
import java.lang.IllegalArgumentException


class ConcreteNotificationFactory(
    private val context: Context
) : NotificationFactory {
    override fun createNotification(type: String, view: View): Notification {
        return when (type) {
            "Toast" -> ToastNotification(context, "This is Toast Notification")
            "Dialog" -> DialogNotification(context, "This is Dialog Notification")
            "Snackbar" -> SnackbarNotification(view, "This is Snackbar Notification")
            else -> throw IllegalArgumentException("Unknown notification type")
        }
    }
}