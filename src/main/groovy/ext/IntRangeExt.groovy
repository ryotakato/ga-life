package ext

@Category(IntRange)
class IntRangeExt {

  int random() {
    int from = this.isReverse() ? this.to : this.from
    int to   = this.isReverse() ? this.from : this.to
    int size = to - from + 1
    (Math.floor(Math.random() * size) + from) as int
  }

}
