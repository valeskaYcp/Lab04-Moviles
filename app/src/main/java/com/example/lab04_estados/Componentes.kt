package com.example.lab04_estados

import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material.icons.Icons
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.filled.Add
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.TopAppBar
import androidx.compose.ui.graphics.Color
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.window.Dialog

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.NavigationRail
import androidx.compose.material3.NavigationRailItem
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import kotlinx.coroutines.launch

@Composable
fun SimpleSwitch() {
    var isChecked by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Opción activada: ${if (isChecked) "Sí" else "No"}")
        Spacer(modifier = Modifier.height(16.dp))

        Switch(
            checked = isChecked,
            onCheckedChange = { isChecked = it }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewSimpleSwitch() {
    SimpleSwitch()
}

//slider
@Composable
fun SimpleSlider() {
    var sliderPosition by remember { mutableStateOf(0f) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Selecciona un valor: ${sliderPosition.toInt()}")
        Spacer(modifier = Modifier.height(16.dp))

        Slider(
            value = sliderPosition,
            onValueChange = { newValue -> sliderPosition = newValue },
            valueRange = 0f..100f,
            steps = 5,
            onValueChangeFinished = { /* */ },
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewSimpleSlider() {
    SimpleSlider()
}