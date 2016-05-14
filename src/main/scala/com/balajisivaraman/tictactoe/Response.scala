package com.balajisivaraman.tictactoe

sealed trait Response
case class SuccessfulMove(b: Board) extends Response
case object FailedMove extends Response