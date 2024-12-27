def myMethod(String a, Integer b) {
    if (!(a instanceof String && b instanceof Integer)) {
        throw new IllegalArgumentException("Invalid argument types. a must be a String, b must be an Integer")
    }
    println "a is: "+a
    println "b is: "+b
}

myMethod(10, "hello") // throws exception
myMethod("hello", 10) //works correctly