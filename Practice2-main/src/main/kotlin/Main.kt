fun main(args: Array<String>) {
    // Задание 1
    val age1 = 42
    val age2 = 21
    //-------------

    // Задание 2
    var avg1 = (age1 + age2) / 2
    //-------------

    // Задание 3
    var avg2 = (age1.toDouble() + age2.toDouble()) / 2
    //-------------

    // Задание 4
    val firstName = "Nikita"
    val lastName = "ProTop"
    //-------------

    // Задание 5
    val fullName = firstName + " " + lastName;
    println(fullName)
    //-------------

    // Задание 6
    val myDetails: String = "Привет, меня зовут $fullName"
    println(myDetails)
    //-------------

    // Задание 7
    val date: Triple<Int, Int, Int> = Triple(12,4,2005)
    println(date)
    //-------------


    // Задание 8
    val day = date.first
    val month = date.second
    val year = date.third
    //-------------

    // Задание 9
    val date2 = Pair(date.second, date.third)
    println(date2.second+"\n\n"+date2.thrid)
    //-------------

    // Задание 10
    val pair: Pair<Int, Int>  = Pair(7,year);
    println(pair)
    //-------------
}
