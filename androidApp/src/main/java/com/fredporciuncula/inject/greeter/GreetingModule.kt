package com.fredporciuncula.inject.greeter

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoSet
import javax.inject.Qualifier

@Qualifier annotation class SpecialGreeting1
@Qualifier annotation class SpecialGreeting2

@Module(includes = [GreetingModule.Bindings::class])
object GreetingModule {
  @Provides @SpecialGreeting1
  fun provideSpecialGreeting1(): String = "Heeeeey"

  @Provides @SpecialGreeting2
  fun provideSpecialGreeting2(): String = "Oieeeee"

  @Provides @IntoSet
  fun provideEnglishGreeting(): String = "Hello"

  @Provides @IntoSet
  fun provideGermanGreeting(): String = "Hallo"

  @Provides @IntoSet
  fun providePortugueseGreeting(): String = "Olá"

  @Module
  interface Bindings {
    @Binds fun bind(impl: GreetingConcatenatorImpl): GreetingConcatenator
  }
}
