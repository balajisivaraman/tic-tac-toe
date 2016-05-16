package com.balajisivaraman.tictactoe

case class Position(x: Int, y: Int)

object Position {
  val getStartingPositions: List[Position] =
    for {
      r <- List.range(0, 2)
      c <- List.range(0, 2)
    } yield Position(r, c)
}
