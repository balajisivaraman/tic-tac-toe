package com.balajisivaraman.tictactoe

import com.balajisivaraman.tictactoe.Position.getStartingPositions

sealed trait Board {
  def squares: List[Square]
}
sealed trait IsMovable extends Board
sealed trait HasBeenPlayed extends Board
sealed trait Finished extends Board

case object Unplayed extends IsMovable {
  val squares = getStartingPositions.map(Empty(_))
}
case class InProgress(squares: List[Square]) extends IsMovable with HasBeenPlayed
case class GameOver(squares: List[Square]) extends HasBeenPlayed with Finished
case class NoMoreMoves(squares: List[OccupiedBy]) extends HasBeenPlayed with Finished
