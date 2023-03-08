package com.fredporciuncula.inject.greeter

import android.content.Context
import android.widget.Toast
import me.tatarka.inject.annotations.Inject

@Inject @Singleton
class AndroidPlatformGreeter(
  private val context: Context
) : PlatformGreeter {
  override fun greet(finalGreeting: String) {
    Toast.makeText(context, finalGreeting, Toast.LENGTH_SHORT).show()
  }
}
