```groovy
def myMethod(arg) {
  if (arg == null || arg.isEmpty()) {
    return null
  }
  // ... rest of the method
}

println myMethod(null) // Output: null
println myMethod([:]) // Output: null
println myMethod([a:1]) // Output: [a:1]
```