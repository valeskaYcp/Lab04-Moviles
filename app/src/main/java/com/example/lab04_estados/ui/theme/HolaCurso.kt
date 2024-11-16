package com.example.lab04_estados.ui.theme

import androidx.compose.foundation.layout.Column
import java.lang.reflect.Modifier
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.padding

fun ViewHolaCurso() {
    Column(
        modifier = Modifier
            .fillMaxWith()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Welcome to the Course!",
            fontSize = 28.sp,
            fontWeight = FontWeigh.Bold
        )
        Spacer(modifier = Modifier.heigh(16.dp))
        Text(
            text = "Hello, Student!",
            fontSize = 20.xD

    }
}
