package com.fredporciuncula.inject.greeter

import javax.inject.Inject

interface GreetingConcatenator {
  fun concatenate(greetings: Set<String>): String
}

class GreetingConcatenatorImpl @Inject constructor(
) : GreetingConcatenator {
  override fun concatenate(greetings: Set<String>): String {
    return greetings.sorted().joinToString()
  }
}
