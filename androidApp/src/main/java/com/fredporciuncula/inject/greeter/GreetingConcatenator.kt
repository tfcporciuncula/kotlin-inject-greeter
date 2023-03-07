package com.fredporciuncula.inject.greeter

interface GreetingConcatenator {
  fun concatenate(greetings: Set<String>): String
}

class GreetingConcatenatorImpl : GreetingConcatenator {
  override fun concatenate(greetings: Set<String>): String {
    return greetings.sorted().joinToString()
  }
}
