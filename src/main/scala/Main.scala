object Main {
  def isSorted[E](sortedSeq: Seq[E])(ordered: (E, E) => Boolean): Boolean = {
    var result: Boolean = true
    for (i <- 0 until sortedSeq.length - 1) {
      if (!ordered(sortedSeq(i), sortedSeq(i + 1))) {
        result = false
      }
    }
    result
  }
}
