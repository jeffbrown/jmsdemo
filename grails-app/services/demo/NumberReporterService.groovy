package demo

class NumberReporterService {

    static expose = ['jms']

    def onMessage(msg) {
        log.debug "The Following Message Was Received: [$msg]"
    }
}
