package com.fredporciuncula.inject.greeter

import android.util.Log

class GreetingHandler(
  private val assistedArg: String,
  private val specialGreeting1: String,
  private val specialGreeting2: String,
  private val greetings: Set<String>,
  private val greetingConcatenator: GreetingConcatenator, // should be lazy!
  private val platformGreeter: PlatformGreeter,
) {

  fun handleAllGreetings() {
    val concatenatedGreeting = greetingConcatenator.concatenate(greetings)
    platformGreeter.greet(finalGreeting = concatenatedGreeting)
    Log.d("GreetingHandler", "assistedArg = $assistedArg")
  }

  fun handleSpecialGreeting1() {
    platformGreeter.greet(finalGreeting = specialGreeting1)
    Log.d("GreetingHandler", "assistedArg = $assistedArg")
  }

  fun handleSpecialGreeting2() {
    platformGreeter.greet(finalGreeting = specialGreeting2)
    Log.d("GreetingHandler", "assistedArg = $assistedArg")
  }
}
