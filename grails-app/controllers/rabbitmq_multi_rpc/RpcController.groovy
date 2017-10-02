package rabbitmq_multi_rpc

class RpcController {

    def rabbitMessagePublisher

    def index() {}

    def send(String message) {
        flash.message = rabbitMessagePublisher.rpc {
            exchange = "rpc.exchange"
            body = message
        }
        redirect action: "index"
    }

}
