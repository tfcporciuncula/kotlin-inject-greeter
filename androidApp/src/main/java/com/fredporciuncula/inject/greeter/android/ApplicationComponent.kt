package com.fredporciuncula.inject.greeter.android

import android.content.Context
import com.fredporciuncula.inject.greeter.GreetingHandler
import com.fredporciuncula.inject.greeter.GreetingModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [GreetingModule::class])
interface ApplicationComponent {
  @Component.Factory
  interface Factory {
    fun build(@BindsInstance context: Context): ApplicationComponent
  }

  val greetingHandlerFactory: GreetingHandler.Factory
}

interface ApplicationComponentProvider {
  val component: ApplicationComponent
}

val Context.applicationComponent get() = (applicationContext as ApplicationComponentProvider).component
