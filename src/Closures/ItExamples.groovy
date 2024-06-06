package Closures

class ItExamples {
    var name = "Iteration Examples"
    var numbers = [1,2,3,4,5,6,7,8,9,10,11,12]

    ItExamples() {
        Show.call numbers.collect { number ->
            number % 2 == 0 || number
        }
        Show.call numbers.each { number ->
            Show.call number
        }
        Show.call numbers.eachWithIndex{ int entry, int idx ->
            Show.call "$idx: $entry"
        }
        Show.call numbers.findAll { number ->
            number % 2 == 0
        }
        Show.call numbers.find { number ->
            number == 3
        }
        Show.call numbers.sort { number ->
            number < 3
        }
        Show.call numbers.remove(9)
        Show.call numbers.contains(12)

        Show.call name
        Show.call Sum.call(50, 100)
    }

    def Show = {
        println "$it"
    }
    def Sum = { Number x, Number y ->
        return x + y
    }

}
