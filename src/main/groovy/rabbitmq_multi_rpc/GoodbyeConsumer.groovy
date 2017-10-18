package rabbitmq_multi_rpc

import com.budjb.rabbitmq.consumer.MessageContext

class GoodbyeConsumer {

    def goodbyeService

    def handleMessage(def body, MessageContext messageContext) {
        goodbyeService.goodbye(body)
    }

}
