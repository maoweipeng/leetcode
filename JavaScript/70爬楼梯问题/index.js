/**
 * 当 n < 0 时，无解。当 n = 1 时，f(n) = 1，
 * 当 n = 2 时，有两种方法，一次 1 级爬 2 次，
 * 或一次 2 级，f(n) = 2。当 n > 2 时，第一次
 * 跳一级还是两级，决定了后面剩下的台阶的跳法数目
 * 的不同：如果第一次只跳一级，则后面剩下的 n - 1
 * 级台阶的跳法数目为 f(n - 1)；如果第一次跳两
 * 级，则后面剩下的 n - 2 级台阶的跳法数目为
 * f(n - 2)。所以，得出递归方程，f(n) = f(n - 1) + f(n - 2)。
 * 问题本质是斐波那契数列。
 */

function solution (n) {
  if (n < 0) {
    return 0
  }

  if (n <= 2) {
    return n
  }

  return solution(n - 1) + solution(n - 2)
}

function solution1 (n) {
  if (n < 0) {
    return 0
  }

  if (n <= 2) {
    return n
  }

  let a = 1
  let b = 2
  for (let i = 3; i <= n; i++) {
    const temp = a + b
    a = b
    b = temp
  }

  return b
}

function solution2 (n, a = 1, b = 2) {
  if (n < 0) {
    return 0
  }

  if (n < 2) {
    return n
  }

  if (n <= 2) {
    return b
  }

  return solution2(n - 1, b, a + b)
}

console.log(solution(30))
console.log(solution1(30))
console.log(solution2(30))
