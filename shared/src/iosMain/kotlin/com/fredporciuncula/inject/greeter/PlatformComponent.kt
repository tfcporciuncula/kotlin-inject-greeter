package com.fredporciuncula.inject.greeter

import me.tatarka.inject.annotations.Provides

interface PlatformComponent {
  @Provides
  fun IosPlatformGreeter.bind(): PlatformGreeter = this
}
