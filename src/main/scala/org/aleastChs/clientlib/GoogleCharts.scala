/**
  * Created by alexa on 11/07/2017.
  */

import scala.scalajs.js
import js.annotation._
import org.scalajs.dom._
//import org.scalajs.dom.raw.{HTMLInputElement,HTMLDivElement}
import scala.scalajs.js.Date


package google {

  package charts {


    // EXAMPLE FROM
    //import google.maps.Data.Geometry
    /*
@JSName("google.maps.MVCObject")
@js.native
class MVCObject extends js.Object {
  def addListener(eventName: String, handler: js.Function): MapsEventListener = js.native

  def bindTo(key: String, target: MVCObject, targetKey: String = ???, noNotify: Boolean = ???): Unit = js.native

  def changed(key: String): Unit = js.native

  def get(key: String): js.Dynamic = js.native

  def notify(key: String): Unit = js.native

  def set(key: String, value: js.Any): Unit = js.native

  def setValues(values: js.Any): Unit = js.native

  def unbind(key: String): Unit = js.native

  def unbindAll(): Unit = js.native
}*/

  }

  package visualization {
    @JSName("google.visualization.Timeline")
    @js.native
    class Timeline(container: js.Dynamic) extends js.Object {
      def draw(data: DataTable, options: js.Object): Unit = js.native
      def clearChart(): Unit = js.native
      def getSelection(): js.Array[js.Object] = js.native
    }

    @JSName("google.visualization.DataTable")
    @js.native
    class DataTable(
                     optional_data: String = "",
                     optional_version: String = "") extends js.Object {
      def addColumn(`type`: String, opt_label: String = "", opt_id: String = ""): Unit = js.native
      def addColumn(`type`: String): Unit = js.native
      def addColumn(description_object: Array[String]): Unit = js.native
      def addRows(rows: js.Array[js.Array[js.Any]]): Unit = js.native
      def addRow(row: js.Array[js.Any]): Unit = js.native
      def addRow(): Unit = js.native
      def getNumberOfRows(): Int = js.native
      def getTableProperties(): js.Object = js.native
      def toJSON(): String = js.native
      override def clone(): DataTable = js.native
    }
  }



}