package com.fredporciuncula.inject.greeter.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.fredporciuncula.inject.greeter.Greeting

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      Box(
        modifier = Modifier
          .background(color = Color.White)
          .fillMaxSize(),
      ) {
        Text(text = Greeting().greet())
      }
    }
  }
}