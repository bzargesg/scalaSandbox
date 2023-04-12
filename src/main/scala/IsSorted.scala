package issorted
class IsSorted {
  def isSorted(nums: List[Int]): Boolean = {
    nums.zipWithIndex.map{case(num, index)=>if(index-1 >= 0 && num<nums(index-1)) false else true}
      .reduce((item, item2)=>item && item2)
  }
}
