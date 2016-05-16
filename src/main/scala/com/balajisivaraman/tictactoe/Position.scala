package com.balajisivaraman.tictactoe

case class Position(x: Int, y: Int)

object Position {
  val getStartingPositions: List[Position] =
    for {
      r <- List.range(0, 3)
      c <- List.range(0, 3)
    } yield Position(r, c)
  val winningPositions: List[List[Position]] =
    List(
      List(Position(0,0), Position(0,1), Position(0,2)),
      List(Position(1,0), Position(1,1), Position(1,2)),
      List(Position(2,0), Position(2,1), Position(2,2)),
      List(Position(0,0), Position(1,0), Position(2,0)),
      List(Position(0,1), Position(1,1), Position(2,1)),
      List(Position(0,2), Position(1,2), Position(2,2)),
      List(Position(0,0), Position(1,1), Position(2,2)),
      List(Position(0,2), Position(1,1), Position(2,0))
    )
}
