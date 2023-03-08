package com.fredporciuncula.inject.greeter

import me.tatarka.inject.annotations.IntoSet
import me.tatarka.inject.annotations.Provides

typealias SpecialGreeting1 = String
typealias SpecialGreeting2 = String

interface GreetingModule {
  @Provides
  fun provideSpecialGreeting1(): SpecialGreeting1 = "Heeeeey"

  @Provides
  fun provideSpecialGreeting2(): SpecialGreeting2 = "Oieeeee"

  @Provides @IntoSet
  fun provideEnglishGreeting(): String = "Hello"

  @Provides @IntoSet
  fun provideGermanGreeting(): String = "Hallo"

  @Provides @IntoSet
  fun providePortugueseGreeting(): String = "Olá"

  @Provides
  fun GreetingConcatenatorImpl.bind(): GreetingConcatenator = this
}
