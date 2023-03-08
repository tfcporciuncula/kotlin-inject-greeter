package com.fredporciuncula.inject.greeter

import me.tatarka.inject.annotations.IntoSet
import me.tatarka.inject.annotations.Provides
import kotlin.jvm.JvmInline

@JvmInline value class SpecialGreeting1(val value: String)
@JvmInline value class SpecialGreeting2(val value: String)

interface GreetingComponent {
  @Provides
  fun provideSpecialGreeting1(): SpecialGreeting1 = SpecialGreeting1("Heeeeey")

  @Provides
  fun provideSpecialGreeting2(): SpecialGreeting2 = SpecialGreeting2("Oieeeee")

  @Provides @IntoSet
  fun provideEnglishGreeting(): String = "Hello"

  @Provides @IntoSet
  fun provideGermanGreeting(): String = "Hallo"

  @Provides @IntoSet
  fun providePortugueseGreeting(): String = "Olá"

  @Provides
  fun GreetingConcatenatorImpl.bind(): GreetingConcatenator = this
}
