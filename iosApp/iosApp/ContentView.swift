import SwiftUI
import shared

struct ContentView: View {
  private let greetingHandler = InjectApplicationComponent().greetingHandlerCreator("assisted arg!")

  var body: some View {
    VStack {
      Button {
        greetingHandler.handleAllGreetings()
      } label: {
        Text("Handle greetings")
      }
      Button {
        greetingHandler.handleSpecialGreeting1()
      } label: {
        Text("Handle special greeting 1")
      }
      Button {
        greetingHandler.handleSpecialGreeting2()
      } label: {
        Text("Handle special greeting 2")
      }
    }
  }
}

struct ContentView_Previews: PreviewProvider {
  static var previews: some View {
    ContentView()
  }
}
