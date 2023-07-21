package com.example.firstproject

fun main() {
    println("나는 츄르냥이다냥 계산을 하고 싶다면 츄르를 달라.")
    println("알았다냥 / 싫다냥 중에 하나를 입력해라냥냥냥♪")
    var rightAnswer = readLine()
    when (rightAnswer) {
        "알았다냥" -> {
            println("첫번째 숫자를 달라냥!")
            var num1 = readLine()!!.toDouble()
            val calculator = CalculRator(num1)
            calculator.inputnum()
        }
        "싫다냥" -> {
            println("나도 싫다냥")
        }
        else -> {
            println("다른 츄르를 찾아봐라냥")
        }
    }
}






