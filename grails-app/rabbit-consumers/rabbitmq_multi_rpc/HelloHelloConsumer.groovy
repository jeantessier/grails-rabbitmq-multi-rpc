package rabbitmq_multi_rpc

class HelloHelloConsumer extends HelloConsumer {

    static rabbitConfig = [
        exchange: "rpc.exchange",
        binding: "hello",
    ]

}
