package rabbitmq_multi_rpc

import com.budjb.rabbitmq.consumer.MessageContext

class HelloConsumer {

    def helloService

    def handleMessage(def body, MessageContext messageContext) {
        helloService.hello(body)
    }

}
