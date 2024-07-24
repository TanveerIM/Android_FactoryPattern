package com.example.android_factorypattern

import android.view.View
import com.google.android.material.snackbar.Snackbar

class SnackbarNotification(
    private val view: View,
    private val message: String
) : Notification {
    override fun notifyUser() {
        Snackbar.make(view, message, Snackbar.LENGTH_SHORT).show()
    }
}