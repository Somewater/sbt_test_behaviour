# sbt test behaviour

1. How to run
```
sbt test:compile
sbt testOnly
```

2. Expected behaviour: `~~ Base created ~~` will print only once because it's action inside of `object Base` initialization

3. Observed behaviour: `~~ Base created ~~` will print twice, one time from every module

# Project consists of:
#### base / src / main / scala / Base.scala
```
object Base {
  println("~~ Base created ~~")
}
```

#### foo / src / test / scala / FooTest.scala
```
import org.junit.Test

class FooTest {
  @Test
  def test1(): Unit = {
    Base
  }
}
```

#### bar / src / test / scala / BarTest.scala
```
import org.junit._

class BarTest {
  @Test
  def test1() {
    Base
  }
}
```
