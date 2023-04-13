package toyproblems



object ToyProblems {
  def finalPrices(prices: Array[Int]): Array[Int] = {
    prices.zipWithIndex.map {case (price, index) =>
      val discount = prices.slice(index+1, prices.length).find( _ <= price).getOrElse(0)
      price-discount
    }
  }

//  class SubrectangleQueries(_rectangle: Array[Array[Int]]) {
//    import scala.util.Try
//    val rectangle = _rectangle
//    def updateSubrectangle(row1: Int, col1: Int, row2: Int, col2: Int, newValue: Int) {
//      for( i <- 0 to rectangle.length-1) {
//        for( j <- 0 to rectangle(0).length ){
//          if(i >= row1 && i <= row2 && j >= col1 && j <= col2){
//            rectangle(i)(j) = newValue
//          }
//        }
//      }
//    }
//
//    def getValue(row: Int, col: Int): Int = {
//      Try{rectangle(row)(col)}.getOrElse(0)
//    }
//
//  }

  class SubrectangleQueries(_rectangle: Array[Array[Int]]) {
    def updateSubrectangle(row1: Int, col1: Int, row2: Int, col2: Int, newValue: Int) {
      for {
        i <- row1 to row2
        j <- col1 to col2
      } {
        _rectangle(i)(j) = newValue
      }
    }

    def getValue(row: Int, col: Int): Int = {
      _rectangle.lift(row).flatMap(_.lift(col)).getOrElse(0)
    }

  }
  def minSumOfLengths(arr: Array[Int], target: Int): Int ={
    val subarrs = arr.tails.toArray.flatMap(_.inits).map(_.sum).filter(_ == target)
    if(subarrs.length < 2) -1 else 2
  }
}
