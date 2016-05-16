package com.balajisivaraman.tictactoe

sealed trait Board {
  def squares: List[Square]
}
sealed trait IsMovable
sealed trait HasBeenPlayed
sealed trait Finished

case object Unplayed extends Board with IsMovable {
  val squares = Position.getStartingPositions.map(Empty(_))
}
case class InProgress(squares: List[Square]) extends Board with IsMovable with HasBeenPlayed
case class GameOver(squares: List[Square]) extends Board with HasBeenPlayed with Finished
case class NoMoreMoves(squares: List[OccupiedBy]) extends Board with HasBeenPlayed with Finished
