package com.example.firstproject

class CalculRator(var num1: Double) {
    open fun inputnum() {
        println("원하는 등호를 선택해달라냥(+,-,/,*, %)")
        var operator = readLine()
        when (operator) {
            "+" -> println("더할 숫자를 내놔라냥")
            "-" -> println("뺄 숫자를 내놔라냥")
            "/" -> println("나눌 숫자를 내놔라냥")
            "*" -> println("곱할 숫자를 내놔라냥")
            "%" -> println("나머지를 구하고 싶은 숫자를 내놔라냥")
            else -> println("내가 원하는 답이 아니다냥")
        }
        var num2 = readLine()!!.toDouble()
        var _num1 = num1
        var a = AddOperation(_num1, num2)
        var b = SubstractOperation(_num1, num2)
        var c = MultiplyOperation(_num1, num2)
        var d = DivideOperation(_num1, num2)

        if (operator == "+") {

            println("'${num1}'와 '${num2}'를 더했더니 ${a.plusResult}가 나왔다냥!")
        } else if (operator == "-") {
            var minusResult = num1 - num2
            println("'${num1}'와 '${num2}'를 뺐더니 ${b.minusResult}가 나왔다냥!")
        } else if (operator == "*") {
            var multiplyResult = num1 * num2
            println("'${num1}'와 '${num2}'를 곱했더니 ${c.multiplyResult}가 나왔다냥!")
        } else if (operator == "/") {
            var divideResult = num1 / num2
            println("'${num1}'와 '${num2}'를 나눴더니 ${d.divideResult}가 나왔다냥!")
        }
    }
}
