package demo

class MathController {

    def jmsService

    def addNumbers(int x, int y) {
        def sum = x + y
        def msg = "The sum of $x and $y is $sum"

        // this will post a message that should be received by the NumberReporterService
        jmsService.send 'jmsdemo.numberReporter', msg

        render msg
    }
}
