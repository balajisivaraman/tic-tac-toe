package com.balajisivaraman.tictactoe

object Api {

  def move(board: IsMovable, position: Position): Response = ???

  def whoWon(finishedBoard: Finished): Option[Player] = ???

  def playerAt(board: Board, position: Position): Option[Player] =
    board.squares
      .find(_.position == position)
      .flatMap {
        case OccupiedBy(_, player) => Some(player)
        case Empty(_)              => None
      }

  def takeBack(board: HasBeenPlayed): IsMovable = ???

  def isDraw(board: NoMoreMoves): Boolean = whoWon(board).map(_ => false).getOrElse(true)

}
