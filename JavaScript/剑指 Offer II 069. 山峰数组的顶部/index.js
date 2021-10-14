/**
 * 符合下列属性的数组 arr 称为 山峰数组（山脉数组） ：
 * 
 * arr.length >= 3
 * 存在 i（0 < i < arr.length - 1）使得：
 * arr[0] < arr[1] < ... arr[i-1] < arr[i]
 * arr[i] > arr[i+1] > ... > arr[arr.length - 1]
 * 给定由整数组成的山峰数组 arr ，返回任何满足 arr[0] < arr[1] < ... arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1] 的下标 i ，即山峰顶部。
 * 
 * 示例 1：
 * 输入：arr = [0,1,0]
 * 输出：1
 * 
 * 示例 2：
 * 输入：arr = [1,3,5,4,2]
 * 输出：2
 * 
 * 示例 3：
 * 输入：arr = [0,10,5,2]
 * 输出：1
 * 
 * 示例 4：
 * 输入：arr = [3,4,5,1]
 * 输出：2
 * 
 * 示例 5：
 * 输入：arr = [24,69,100,99,79,78,67,36,26,19]
 * 输出：2
 *  
 * 提示：
 * 
 * 3 <= arr.length <= 104
 * 0 <= arr[i] <= 106
 * 题目数据保证 arr 是一个山脉数组
 * 
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/B1IidL
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

/**
 * @param {number[]} arr
 * @return {number}
 */
var peakIndexInMountainArray = function(arr) {
  let left = 1, right = arr.length - 1, center

  while(left <= right) {
    center = Math.floor((left + right) / 2)
    if (arr[center] > arr[center + 1] && arr[center] > arr[center - 1]) {
      break
    } else if (arr[center - 1] < arr[center] && arr[center] < arr[center + 1]) {
      // 在右边
      left = center + 1
    } else if (arr[center - 1] > arr[center] && arr[center] > arr[center + 1]) {
      // 在左边
      right = center - 1
    }
  }

  return center
}

console.log(peakIndexInMountainArray([0,1,0]))
console.log(peakIndexInMountainArray([1,3,5,4,2]))
console.log(peakIndexInMountainArray([0,10,5,2]))
console.log(peakIndexInMountainArray([3,4,5,1]))
console.log(peakIndexInMountainArray([24,69,100,99,79,78,67,36,26,19]))
console.log(peakIndexInMountainArray([40,48,61,75,100,99,98,39,30,10]))
