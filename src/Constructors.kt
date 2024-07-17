class Student(var name: String, var age: Int) {

    init {
        name = "Danish"
        age = 24

        println("My name is $name and I am $age years old")
    }
    fun drive() {
        println("Drivinggggggggggg")
    }

    fun speed(maxSpeed: Int): Int {
        return maxSpeed
    }
}

fun main(args: Array<String>) {
    val c3 = Student("Kamran", 24)
    println(c3.name+" "+c3.age)
    c3.drive()
    println(c3.speed(80))
}