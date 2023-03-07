package com.fredporciuncula.inject.greeter

class GreetingModule {
  fun provideSpecialGreeting1(): String = "Heeeeey"

  fun provideSpecialGreeting2(): String = "Oieeeee"

  fun provideEnglishGreeting(): String = "Hello"

  fun provideGermanGreeting(): String = "Hallo"

  fun providePortugueseGreeting(): String = "Olá"
}
