package com.balajisivaraman.tictactoe

sealed trait Board
sealed trait IsMovable
sealed trait HasBeenPlayed

case object EmptyBoard extends Board with IsMovable
case class InProgress(cells: List[Cell]) extends Board with IsMovable
case class GameOver(cells: List[Cell]) extends Board with HasBeenPlayed
case class FinishedBoard(cells: List[NonEmpty]) extends Board with HasBeenPlayed