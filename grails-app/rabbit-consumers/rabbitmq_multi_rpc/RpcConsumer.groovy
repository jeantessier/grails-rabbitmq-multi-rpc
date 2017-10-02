package rabbitmq_multi_rpc

import com.budjb.rabbitmq.consumer.MessageContext

class RpcConsumer {

    static rabbitConfig = [
        exchange: "rpc.exchange",
        consumers: 10,
    ]

    def handleMessage(def body, MessageContext messageContext) {
        log.info "Processing ${body}"
        def currentThread = Thread.currentThread()
        return "Hello from \"${currentThread.name}\" (${currentThread.id})"
    }

}
