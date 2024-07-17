open class ParentClass {
    var a = 10
}

class ChildClass: ParentClass() {
    fun addition(b: Int): Int {
        return b + a
    }
}

fun main(args: Array<String>) {
    var myObj = ChildClass()
    println("The addition is:   "+myObj.addition(11))
}