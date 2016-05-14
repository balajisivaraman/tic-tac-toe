package com.balajisivaraman.tictactoe

object TicTacToe {

  def move(board: IsMovable, p: Position): Response = ???

  def whoWon(finishedBoard: GameOver): Player = ???

  def playerAt(board: Board, p: Position): Option[Player] = ???

  def takeBack(board: HasBeenPlayed): IsMovable = ???

  def isDraw(board: FinishedBoard): Boolean = ???

}
