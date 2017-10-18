package rabbitmq_multi_rpc

class FooGoodbyeConsumer extends GoodbyeConsumer {

    static rabbitConfig = [
        exchange: "rpc.exchange",
        binding: "foo.*",
    ]

}
