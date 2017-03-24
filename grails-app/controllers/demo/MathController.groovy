package demo

import grails.plugin.jms.JmsService

class MathController {

    JmsService jmsService

    def addNumbers(int x, int y) {
        int sum = x + y
        String msg = "The sum of $x and $y is $sum"

        // this will post a message that should be received by the NumberReporterService
        jmsService.send 'jmsdemo.numberReporter', msg

        render msg
    }
}
