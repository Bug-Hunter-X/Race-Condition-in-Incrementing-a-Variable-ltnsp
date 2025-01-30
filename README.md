# Race Condition Bug in Java

This repository demonstrates a common concurrency bug in Java: a race condition. The `MyClass` class has a method `incrementX()` that increments a private integer variable `x`.  If multiple threads call `incrementX()` simultaneously, the final value of `x` may be unexpectedly lower than expected due to the lack of synchronization. 

The `bug.java` file contains the buggy code. The `bugSolution.java` file provides a solution using `synchronized` keyword to resolve the race condition.