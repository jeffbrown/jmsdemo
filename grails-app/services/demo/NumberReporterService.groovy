package demo

class NumberReporterService {

    static expose = ['jms']

    def onMessage(msg) {
        println "The Following Message Was Received: [$msg]"
    }
}
