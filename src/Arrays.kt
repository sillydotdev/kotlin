fun main(args: Array<String>) {
    var names = arrayOf("Messi", "Neymar", "Iniesta", "VVD", "Pedri")
    println(names.size)

    for (i in names) {
        println(i)
    }

    println("${names[0]} is the goat")

    for (letters in 'a'..'x') {
        print(letters+" ")
    }

    println()

    val nums = arrayOf(1, 3, 4, 3, 2, 6, 6)
    if(6 in nums) println("yes it exists...") else println("no, it doesn't exist")
}