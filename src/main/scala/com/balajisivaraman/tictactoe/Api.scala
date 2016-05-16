package com.balajisivaraman.tictactoe

import Position.winningPositions

object Api {

  def move(player: Player, board: IsMovable, position: Position): Response = {

    def isEmpty(square: Square): Boolean = square match {
      case Empty(_) => true
      case _        => false
    }

    def isOccupiedBy(square: Square, player: Player): Boolean = square match {
      case OccupiedBy(_, p: Player) if p == player => true
      case _                                       => false
    }

    val successfulMove: SuccessfulMove = {
      val movedBoard = InProgress(board.squares.map(square => if (square.position == position) OccupiedBy(position, player) else square))
      val hasPlayerWon = winningPositions.exists(winningPosition => movedBoard.squares.filter(square => winningPosition.contains(square.position)).forall(isOccupiedBy(_, player)))
      val newBoard =
        if(hasPlayerWon) {
          GameOver(movedBoard.squares)
        } else if (movedBoard.squares.forall(!isEmpty(_))) {
          NoMoreMoves(movedBoard.squares.map{case square: OccupiedBy => square})
        } else movedBoard
      SuccessfulMove(newBoard)
    }

    playerAt(board, position).map(_ => FailedMove).getOrElse(successfulMove)
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
