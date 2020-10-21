package com.train
import java.util.*
fun main(args:Array<String>){
    val scanner =Scanner(System.`in`)
    print("Please enter number of tickets:")
    var firstticket = scanner.nextInt()

    print("How many round-trip tickets:")
    var seconedticket = scanner.nextInt()

    val kypaymoney = KTicket(firstticket,seconedticket)

}
class KTicket(var oneticket:Int,var twoticket:Int){
    val lastticket = oneticket - twoticket
    fun kpaymoney():Int{
        val money = (lastticket*1000)+((twoticket*2000*9)/10)
        return money
    }
    init {
        println("Total tickets: "+ oneticket)
        println("Round-trip: " + lastticket)
        println("Total: " + kpaymoney())
    }
}