package twosum

object TwoSum {
  //  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
  //    nums.zipWithIndex.map{ case (num, i)=>
  //        val numberToFind = target-num
  //        if(numberToFind>0){
  //          val otherNumber = nums.indexOf(numberToFind)
  //          if(otherNumber != -1){
  //            return Array(i, otherNumber)
  //          }
  //        }
  //    }
  //    Array(-1,-1)
  //  }
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    nums.zipWithIndex.flatMap { case (num, i) =>
      val numberToFind = target - num
      nums.drop(i + 1)
        .zipWithIndex
        .find { case (otherNum, j) => otherNum == numberToFind }
        .map { case (_, j) => Array(i, i + j + 1) }
    }
      .headOption
      .getOrElse(Array(-1, -1))
  }
}
