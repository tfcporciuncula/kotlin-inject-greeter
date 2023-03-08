package com.fredporciuncula.inject.greeter

import android.content.Context
import android.widget.Toast
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PlatformGreeter @Inject constructor(
  private val context: Context
) {
  fun greet(finalGreeting: String) {
    Toast.makeText(context, finalGreeting, Toast.LENGTH_SHORT).show()
  }
}
