package com.balajisivaraman.tictactoe

sealed trait Board
sealed trait IsMovable
sealed trait HasBeenPlayed
sealed trait Finished

case object Unplayed extends Board with IsMovable
case class InProgress(cells: List[Square]) extends Board with IsMovable with HasBeenPlayed
case class GameOver(cells: List[Square]) extends Board with HasBeenPlayed with Finished
case class NoMoreMoves(cells: List[OccupiedBy]) extends Board with HasBeenPlayed with Finished