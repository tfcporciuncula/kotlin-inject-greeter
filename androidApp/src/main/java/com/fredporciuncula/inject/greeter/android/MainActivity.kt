package com.fredporciuncula.inject.greeter.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

class MainActivity : ComponentActivity() {
  // TODO: inject greeting handler here!
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      Column(
        modifier = Modifier
          .fillMaxSize()
          .background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
      ) {
        Button(onClick = { /*greetingHandler.handleAllGreetings()*/ }) {
          Text(text = "Handle greetings")
        }
        Button(onClick = { /*greetingHandler.handleSpecialGreeting1()*/ }) {
          Text(text = "Handle special greeting 1")
        }
        Button(onClick = { /*greetingHandler.handleSpecialGreeting2()*/ }) {
          Text(text = "Handle special greeting 2")
        }
      }
    }
  }
}
