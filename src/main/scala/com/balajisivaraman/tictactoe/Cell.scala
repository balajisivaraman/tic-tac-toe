package com.balajisivaraman.tictactoe

sealed trait Cell
sealed trait NonEmpty
case class Empty(p: Position) extends Cell
case class X(p: Position) extends Cell with NonEmpty
case class O(p: Position) extends Cell with NonEmpty