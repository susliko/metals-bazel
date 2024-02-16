package gogo

import foobar.*
import cats.effect.IOApp
import cats.effect.IO

object Gogo extends IOApp.Simple:
  def run: IO[Unit] =
    IO(println(FooBar.a)) *>
      IO(println(FooBar.b))
