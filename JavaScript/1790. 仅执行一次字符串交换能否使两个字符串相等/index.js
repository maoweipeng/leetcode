/**
 * 给你长度相等的两个字符串 s1 和 s2 。一次 字符串交换 操作的步骤如下：选出某个字符串中的两个下标（不必不同），并交换这两个下标所对应的字符。
 *
 * 如果对 其中一个字符串 执行 最多一次字符串交换 就可以使两个字符串相等，返回 true ；否则，返回 false 。
 *
 *
 * 示例 1：
 *
 * 输入：s1 = "bank", s2 = "kanb"
 * 输出：true
 * 解释：例如，交换 s2 中的第一个和最后一个字符可以得到 "bank"
 * 示例 2：
 *
 * 输入：s1 = "attack", s2 = "defend"
 * 输出：false
 * 解释：一次字符串交换无法使两个字符串相等
 * 示例 3：
 *
 * 输入：s1 = "kelb", s2 = "kelb"
 * 输出：true
 * 解释：两个字符串已经相等，所以不需要进行字符串交换
 * 示例 4：
 *
 * 输入：s1 = "abcd", s2 = "dcba"
 * 输出：false
 *
 *
 * 提示：
 *
 * 1 <= s1.length, s2.length <= 100
 * s1.length == s2.length
 * s1 和 s2 仅由小写英文字母组成
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/check-if-one-string-swap-can-make-strings-equal
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

/**
 * @param {string} s1
 * @param {string} s2
 * @return {boolean}
 */
var areAlmostEqual = function (s1, s2) {
  let a = -1;
  let b = -1;
  for (let i = 0; i < s1.length; i++) {
    if (s1[i] === s2[i]) {
      continue;
    }

    if (a === -1) {
      a = i;
    } else if (b === -1) {
      b = i;
    } else {
      return false;
    }
  }

  if (a === -1 && b ===-1) {
    return true;
  }

  if (a === -1 || b === -1) {
    return false;
  }

  return s1[a] === s2[b] && s1[b] === s2[a];
};

console.log(areAlmostEqual("bank", "kanb"));
console.log(areAlmostEqual("attack", "defend"));
console.log(areAlmostEqual("kelb", "kelb"));
console.log(areAlmostEqual("abcd", "dcba"));
