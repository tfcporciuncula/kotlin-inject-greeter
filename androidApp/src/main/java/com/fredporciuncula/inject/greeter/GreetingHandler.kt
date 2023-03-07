package com.fredporciuncula.inject.greeter

import android.util.Log
import dagger.Lazy
import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject
import javax.inject.Provider

class GreetingHandler @AssistedInject constructor(
  @Assisted private val assistedArg: String,
  @SpecialGreeting1 private val specialGreeting1: String,
  @SpecialGreeting2 private val specialGreeting2: String,
  private val greetings: Set<String>,
  private val greetingConcatenator: Lazy<GreetingConcatenator>,
  private val platformGreeter: Provider<PlatformGreeter>,
) {
  @AssistedFactory
  interface Factory {
    fun create(assistedArg: String): GreetingHandler
  }

  fun handleAllGreetings() {
    val concatenatedGreeting = greetingConcatenator.get().concatenate(greetings)
    platformGreeter.get().greet(finalGreeting = concatenatedGreeting)
    Log.d("GreetingHandler", "assistedArg = $assistedArg")
  }

  fun handleSpecialGreeting1() {
    platformGreeter.get().greet(finalGreeting = specialGreeting1)
    Log.d("GreetingHandler", "assistedArg = $assistedArg")
  }

  fun handleSpecialGreeting2() {
    platformGreeter.get().greet(finalGreeting = specialGreeting2)
    Log.d("GreetingHandler", "assistedArg = $assistedArg")
  }
}
