package io.scalajs.npm.csvtojson

import io.scalajs.nodejs.stream.Readable

import scala.scalajs.js

/**
  * Csv-To-Json Implementation
  * ParsingOptions
  */
@js.native
trait CsvToJsonImpl extends js.Object {

  def fromString(csvString: String): Readable = js.native

}