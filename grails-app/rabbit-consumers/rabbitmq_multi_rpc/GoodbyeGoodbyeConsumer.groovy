package rabbitmq_multi_rpc

class GoodbyeGoodbyeConsumer extends GoodbyeConsumer {

    static rabbitConfig = [
        exchange: "rpc.exchange",
        binding: "goodbye",
    ]

}
