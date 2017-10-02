package rabbitmq_multi_rpc

import com.budjb.rabbitmq.consumer.MessageContext

class GoodbyeConsumer {

    static rabbitConfig = [
        exchange: "rpc.exchange",
    ]

    def handleMessage(def body, MessageContext messageContext) {
        log.info "Processing ${body}"
        def currentThread = Thread.currentThread()
        return "Goodbye from \"${currentThread.name}\" (${currentThread.id})"
    }

}
