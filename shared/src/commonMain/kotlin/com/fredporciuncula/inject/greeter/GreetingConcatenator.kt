package com.fredporciuncula.inject.greeter

import me.tatarka.inject.annotations.Inject

interface GreetingConcatenator {
  fun concatenate(greetings: Set<String>): String
}

@Inject
class GreetingConcatenatorImpl : GreetingConcatenator {
  override fun concatenate(greetings: Set<String>): String {
    return greetings.sorted().joinToString()
  }
}
