package com.fredporciuncula.inject.greeter.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.fredporciuncula.inject.greeter.GreetingHandler
import me.tatarka.inject.annotations.Component

@Component
abstract class MainActivityComponent(@Component val parent: ApplicationComponent) {
  abstract val greetingHandlerCreator: (String) -> GreetingHandler
}

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    val greetingHandler = MainActivityComponent::class.create(applicationComponent)
      .greetingHandlerCreator("this is an assisted arg")
    setContent {
      Column(
        modifier = Modifier
          .fillMaxSize()
          .background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
      ) {
        Button(onClick = { greetingHandler.handleAllGreetings() }) {
          Text(text = "Handle greetings")
        }
        Button(onClick = { greetingHandler.handleSpecialGreeting1() }) {
          Text(text = "Handle special greeting 1")
        }
        Button(onClick = { greetingHandler.handleSpecialGreeting2() }) {
          Text(text = "Handle special greeting 2")
        }
      }
    }
  }
}
