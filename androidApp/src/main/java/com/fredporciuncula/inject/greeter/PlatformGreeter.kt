package com.fredporciuncula.inject.greeter

import android.content.Context
import android.widget.Toast
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PlatformGreeter @Inject constructor(
  @ApplicationContext private val context: Context
) {
  fun greet(finalGreeting: String) {
    Toast.makeText(context, finalGreeting, Toast.LENGTH_SHORT).show()
  }
}
