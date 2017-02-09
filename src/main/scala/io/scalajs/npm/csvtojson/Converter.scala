package io.scalajs.npm.csvtojson

import io.scalajs.RawOptions
import io.scalajs.nodejs.stream.Writable

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}
import scala.scalajs.js.|

/**
  * Converter
  * @author lawrence.daniels@gmail.com
  */
@js.native
@JSImport("csvtojson", "Converter")
class Converter(options: ConverterOptions | RawOptions) extends Writable

/**
  * Converter Options
  * @param constructResult ???
  * @param delimiter       the field separator
  */
@ScalaJSDefined
class ConverterOptions(var constructResult: js.UndefOr[Boolean] = js.undefined,
                       var delimiter: js.UndefOr[String] = js.undefined)
  extends js.Object
