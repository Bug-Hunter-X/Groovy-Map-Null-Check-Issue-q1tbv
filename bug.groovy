```groovy
def myMethod(arg) {
  if (arg == null) {
    return null
  }
  // ... rest of the method
}

println myMethod(null) // Output: null
println myMethod([:]) // Output: null
```