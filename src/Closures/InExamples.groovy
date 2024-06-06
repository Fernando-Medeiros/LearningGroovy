package Closures

class InExamples{
    var numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]

    InExamples() {
        println 12 in numbers
        println numbers.contains(12)
    }
}
