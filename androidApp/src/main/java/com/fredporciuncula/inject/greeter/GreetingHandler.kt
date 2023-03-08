package com.fredporciuncula.inject.greeter

import android.util.Log
import me.tatarka.inject.annotations.Assisted
import me.tatarka.inject.annotations.Inject

@Inject
class GreetingHandler(
  @Assisted private val assistedArg: String,
  private val specialGreeting1: SpecialGreeting1,
  private val specialGreeting2: SpecialGreeting2,
  private val greetings: Set<String>,
  private val greetingConcatenator: Lazy<GreetingConcatenator>,
  private val platformGreeter: () -> PlatformGreeter,
) {
  fun handleAllGreetings() {
    val concatenatedGreeting = greetingConcatenator.value.concatenate(greetings)
    platformGreeter().greet(finalGreeting = concatenatedGreeting)
    Log.d("GreetingHandler", "assistedArg = $assistedArg")
  }

  fun handleSpecialGreeting1() {
    platformGreeter().greet(finalGreeting = specialGreeting1)
    Log.d("GreetingHandler", "assistedArg = $assistedArg")
  }

  fun handleSpecialGreeting2() {
    platformGreeter().greet(finalGreeting = specialGreeting2)
    Log.d("GreetingHandler", "assistedArg = $assistedArg")
  }
}
