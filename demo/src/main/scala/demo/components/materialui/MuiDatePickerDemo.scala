package demo
package components
package materialui

import chandu0101.macros.tojs.GhPagesMacros
import chandu0101.scalajs.react.components.materialui._
import japgolly.scalajs.react.ScalaComponent
import japgolly.scalajs.react.vdom.html_<^._

import scala.scalajs.js

object MuiDatePickerDemo {
  val code = GhPagesMacros.exampleSource

  // EXAMPLE:START

  val component = ScalaComponent
    .builder[Unit]("MuiDatePickerDemo")
    .render(P => {
      <.div(
        CodeExample(code, "MuiDatePicker")(
          MuiDatePicker(
            hintText = js.defined("Portrait Dialog"),
            onChange = CallbackDebug.f2("onChange"),
            onDismiss = CallbackDebug.f0("onDismiss"),
            onFocus = CallbackDebug.f1("onFocus"),
            onShow = CallbackDebug.f0("onShow"),
            onClick = CallbackDebug.f1("onClick")
          )(),
          MuiDatePicker(
            hintText = js.defined("Landscape Dialog"),
            mode = PortraitLandscape.landscape
          )()
        )
      )
    })
    .build

  // EXAMPLE:END

  def apply() = component()
}
