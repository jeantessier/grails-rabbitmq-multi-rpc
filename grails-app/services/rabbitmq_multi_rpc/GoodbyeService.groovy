package rabbitmq_multi_rpc

class GoodbyeService {

    def goodbye(body) {
        log.info "Processing ${body}"
        def currentThread = Thread.currentThread()
        return "Goodbye from \"${currentThread.name}\" (${currentThread.id})"
    }

}
