package com.balajisivaraman.tictactoe

object Api {

  def move(player: Player, board: IsMovable, position: Position): Response = {
    def successfulMove(player: Player, board: Board, position: Position): SuccessfulMove = ???
    playerAt(board, position).map(_ => FailedMove).getOrElse(successfulMove(player, board, position))
  }

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
