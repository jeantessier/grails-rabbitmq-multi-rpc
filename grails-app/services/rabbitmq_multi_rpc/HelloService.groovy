package rabbitmq_multi_rpc

class HelloService {

    def hello(body) {
        log.info "Processing ${body}"
        def currentThread = Thread.currentThread()
        return "Hello from \"${currentThread.name}\" (${currentThread.id})"
    }

}
