# Groovy Map Null Check Issue

This repository demonstrates an unusual behavior in Groovy related to checking if a map is null or empty.  The standard `==` operator doesn't correctly handle this case, leading to potential errors if null checks aren't done carefully. 

The `bug.groovy` file shows the issue. `bugSolution.groovy` provides a workaround.