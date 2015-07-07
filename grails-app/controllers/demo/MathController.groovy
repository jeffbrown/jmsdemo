package demo

class MathController {

    def addNumbers(int x, int y) {
        def sum = x + y
        render "The sum of $x and $y is $sum"
    }
}
