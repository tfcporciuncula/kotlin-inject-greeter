package com.fredporciuncula.inject.greeter.android

import android.app.Application

class GreeterApplication : Application(), ApplicationComponentProvider {
  override val component by lazy(LazyThreadSafetyMode.NONE) {
    DaggerApplicationComponent.factory().build(applicationContext)
  }
}
