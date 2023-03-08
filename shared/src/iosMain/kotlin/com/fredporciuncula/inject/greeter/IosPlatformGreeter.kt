package com.fredporciuncula.inject.greeter

import me.tatarka.inject.annotations.Inject
import platform.Foundation.NSCharacterSet
import platform.Foundation.NSString
import platform.Foundation.NSURL
import platform.Foundation.URLQueryAllowedCharacterSet
import platform.Foundation.stringByAddingPercentEncodingWithAllowedCharacters
import platform.UIKit.UIApplication

@Inject @Singleton
class IosPlatformGreeter : PlatformGreeter {
  // On iOS, instead of a Toast, we open the browser with the greeting.
  override fun greet(finalGreeting: String) {
    val encodedGreeting = (finalGreeting as NSString)
      .stringByAddingPercentEncodingWithAllowedCharacters(NSCharacterSet.URLQueryAllowedCharacterSet)
    val url = "https://www.google.com/search?q=$encodedGreeting"
    val nsUrl = NSURL.URLWithString(url)
    UIApplication.sharedApplication.openURL(nsUrl!!)
  }
}
