package com.example.miranpc.lib

import java.util.*


fun main(args: Array<String>) {

    var oneToHundo = 0

    val myArray: ArrayList<Int> = ArrayList()

    var random = Random()

    loop@ while (oneToHundo < 100) {


        myArray.add(oneToHundo)

        oneToHundo++
    }

    val myNumber = 1
    println("You Guessed $myNumber")
    for (a in myArray) {

        var randomNumber = random.nextInt(myArray.size) + 1

        println("$a : Random Number generated ($randomNumber)")

        if (myNumber == randomNumber) {
            println(randomNumber)
            break

        }
    }


//    for (x in 1..100){
    for (x in 1..100) {
     /*   var haha = ""

        if (i % 3 == 0) haha += "fizz"


        if (i % 5 == 0) haha += "buzz"

        if (haha.isEmpty())
            haha = i.toString()

        println(haha)*/

//        }
         var str=""

         if (x % 3 == 0) str +=" fizz "
         if (x % 5 == 0) str += " buzz"
         if (x % 5 == 0 && x % 5==0) str += " 3 and 5"

         if(str.isEmpty()){
             str =x.toString()

         }

         println(str)

    }


}