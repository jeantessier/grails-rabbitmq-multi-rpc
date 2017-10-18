package rabbitmq_multi_rpc

class RpcController {

    def rabbitMessagePublisher

    def index() {}

    def send(String key, String message) {
        flash.message = rabbitMessagePublisher.rpc {
            exchange = "rpc.exchange"
            routingKey = key
            body = message
        }
        redirect action: "index"
    }

}
