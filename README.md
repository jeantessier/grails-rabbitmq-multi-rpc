# RabbitMQ Multi-RPC

This app demonstrates how to do RPCs to multiple consumers in parallel.

Normally, you call RPCs on a exchange that routes to a queue.  The consumers
feed off of the queue, so each one gets invoked in turn as RPCs come in.

I wanted to see what would happen if I used a `fanout` exchange and let the
consumers register directly to it, using temporary, dedicated queues.  An
incoming RPC would be sent to all consumers in parallel and they would all
respond to it.  The caller would most likely take the first response to come
back and ignore the others.

## Running It

    $ ./gradlew bootRun

Point your browser to http://localhost:8080/rpc and send a message.  The page
will show whether the `hello` or the `goodbye` consumer responded.  The logs
will show that both consumers are being activated.
