class ClassAndObject{
    var brand = ""
    var model = ""
    var year = ""
}

class Person(var name: String, var age: Int) {
    fun drive() {
        println("Drivinggggggggggg")
    }

    fun speed(maxSpeed: Int): Int {
        return maxSpeed
    }
}

fun main(args: Array<String>) {
    val c1 = ClassAndObject();
    c1.brand = "Mercedes Benz"
    c1.model = "X1"
    c1.year = "2016"

    val c2 = ClassAndObject();
    c1.brand = "Audi"
    c1.model = "v4"
    c1.year = "2018"

    println(c1.brand+" "+c1.model+" "+c1.year)
    println(c2.brand+" "+c2.model+" "+c2.year)

    val c3 = Person("Kamran", 24)
    println(c3.name+" "+c3.age)
    c3.drive()
    println(c3.speed(80))
}