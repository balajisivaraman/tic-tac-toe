package com.balajisivaraman.tictactoe

sealed trait Square {
  def position: Position
}
case class Empty(position: Position) extends Square
case class OccupiedBy(position: Position, player: Player) extends Square