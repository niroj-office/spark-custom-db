package com.niroj.office.utilities.db

import java.sql.ResultSet

object DbOperations extends Enumeration {
  type DbOperation = Value
  val INSERT = Value("INSERT")
  val UPDATE = Value("UPDATE")
  val UPSERT = Value("UPSERT")
}
