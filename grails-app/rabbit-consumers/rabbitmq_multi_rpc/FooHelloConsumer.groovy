package rabbitmq_multi_rpc

class FooHelloConsumer extends HelloConsumer {

    static rabbitConfig = [
        exchange: "rpc.exchange",
        binding: "foo.*",
    ]

}
