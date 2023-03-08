package com.fredporciuncula.inject.greeter.android

import android.content.Context
import com.fredporciuncula.inject.greeter.GreetingHandler
import com.fredporciuncula.inject.greeter.GreetingModule
import com.fredporciuncula.inject.greeter.Singleton
import me.tatarka.inject.annotations.Component
import me.tatarka.inject.annotations.Provides

@Component @Singleton
abstract class ApplicationComponent(
  @get:Provides val context: Context,
) : GreetingModule {
  abstract val greetingHandlerCreator: (String) -> GreetingHandler
}

interface ApplicationComponentProvider {
  val component: ApplicationComponent
}

val Context.applicationComponent get() = (applicationContext as ApplicationComponentProvider).component