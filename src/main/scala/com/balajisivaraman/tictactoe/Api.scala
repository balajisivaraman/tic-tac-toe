package com.balajisivaraman.tictactoe

object Api {

  def move(board: IsMovable, p: Position): Response = ???

  def whoWon(finishedBoard: Finished): Player = ???

  def playerAt(board: Board, p: Position): Option[Player] = ???

  def takeBack(board: HasBeenPlayed): IsMovable = ???

  def isDraw(board: NoMoreMoves): Boolean = ???

}
