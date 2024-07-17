fun voteEligibility(age: Int) {
    if (age >= 18) {
        println("You're eligible to vote")
    } else {
        println("You're too young")
    }
}

var a = 10
val greetings = if(a >= 10) "Good morning..." else "Go home...."

val day = 5
val result = when (day) {
    1 -> "Monday"
    2 -> "Tuesday"
    3 -> "Wednesday"
    4 -> "Thursday"
    5 -> "Friday"
    6 -> "Saturday"
    7 -> "Sunday"
    else -> "invalid day number"
}


fun main(args: Array<String>) {
    voteEligibility(20)
    println(greetings)
    println("The day is $day : "+result)
}
