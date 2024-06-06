package Closures

class ItExamples {
    var name = "It Class";
    var numbers = [1,2,3,4,5,6,7,8,9,10,11,12]

    ItExamples() {
        Show.call numbers.collect {
            it % 2 == 0 || it
        }
        Show.call numbers.each {
            Show.call it
        }
        Show.call numbers.findAll {
            it % 2 == 0
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
