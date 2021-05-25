function curry (fn) {
  const ctx = this

  return function inner (...args) {
    if (fn.length === args.length) {
      return fn.call(ctx, ...args)
    }

    return inner.bind(ctx, ...args)
  }
}

function add (a, b, c) {
  return a + b + c
}

const curryAdd = curry(add)

console.log(curryAdd(1, 2, 3))
console.log(curryAdd(1)(2, 3))
console.log(curryAdd(1)(2)(3))
