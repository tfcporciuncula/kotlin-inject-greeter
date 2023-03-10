package com.fredporciuncula.inject.greeter

import android.content.Context
import android.widget.Toast

class PlatformGreeter(
  private val context: Context
) {
  fun greet(finalGreeting: String) {
    Toast.makeText(context, finalGreeting, Toast.LENGTH_SHORT).show()
  }
}
