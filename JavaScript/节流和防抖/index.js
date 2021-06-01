/**
 * 防抖：多次触发只有最后一次有效
 * @param {Function} fn
 * @param {Number} time
 * @returns {Function}
 */
function debounce(fn, time = 1000) {
  let timer
  return function () {
    if (timer) {
      clearTimeout(timer)
    }

    timer = setTimeout(() => {
      fn()
    }, time)
  }
}

/**
 * 节流：在一定时间内只触发一次
 * @param {Function} fn
 * @param {Number} time
 * @returns {Function}
 */
function throttle (fn, time = 1000) {
  let t = 0
  return function () {
    const currentTime = Date.now()
    if (currentTime - t < time) {
      return
    }

    fn()
    t = currentTime
  }
}

function func () {
  console.log('hello')
}

const df = debounce(func)
df()
df()
df()
df()
df()
df()

const tf = throttle(func, 5000)

setInterval(() => {
  tf()
}, 200)
