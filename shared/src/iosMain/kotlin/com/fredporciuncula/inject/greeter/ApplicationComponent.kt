package com.fredporciuncula.inject.greeter

import me.tatarka.inject.annotations.Component

@Component @Singleton
abstract class ApplicationComponent : GreetingComponent, PlatformComponent {
  abstract val greetingHandlerCreator: (String) -> GreetingHandler
}
