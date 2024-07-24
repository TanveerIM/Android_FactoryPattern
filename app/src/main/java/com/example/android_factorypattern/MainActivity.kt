package com.example.android_factorypattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android_factorypattern.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val notificationFactory = ConcreteNotificationFactory(this)
        viewModel = MainViewModel(notificationFactory)

        binding.toastButton.setOnClickListener {
            viewModel.showNotification("Toast", binding.root)
        }

        binding.dialogButton.setOnClickListener {
            viewModel.showNotification("Dialog", binding.root)
        }

        binding.snackbarButton.setOnClickListener {
            viewModel.showNotification("Snackbar", binding.root)
        }
    }
}