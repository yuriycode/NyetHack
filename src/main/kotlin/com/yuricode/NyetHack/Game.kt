package com.yuricode.NyetHack

fun main() {
    val name = "Madrigal"
    var healthPoints = 89
    val isBlessed = true

    if (healthPoints == 100) {
        println(name + " is in excellent condition")
    }
    else if (healthPoints >= 90)
        println(name + " has a few scratches")
    else if (healthPoints >= 75) {
        if (isBlessed) {
            println(name + " has some minor wounds but is healing quite quickly!")
        } else {
            println(name + "has some minor wounds")
        }
    } else if (healthPoints >= 15) {
        println(name + " looks pretty hurt")
    }
    else {
        println(name + " is in awful condition")
    }
}