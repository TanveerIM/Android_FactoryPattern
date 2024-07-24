package com.example.android_factorypattern

import android.app.AlertDialog
import android.content.Context

class DialogNotification(
    private val context: Context,
    private val message: String
) : Notification {
    override fun notifyUser() {
        AlertDialog.Builder(context)
            .setMessage(message)
            .setPositiveButton("OK", null)
            .show()
    }
}