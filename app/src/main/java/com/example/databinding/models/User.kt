package com.example.databinding.models

import androidx.databinding.ObservableField

data class User(
    var waterName: ObservableField<String> = ObservableField(),
)