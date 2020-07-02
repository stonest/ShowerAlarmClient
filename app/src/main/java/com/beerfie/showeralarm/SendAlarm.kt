package com.beerfie.showeralarm

import com.beerfie.grpc.showeralarm.AlarmStoreGrpcKt.AlarmStoreCoroutineStub
import io.grpc.ManagedChannel
import java.io.Closeable
import java.util.concurrent.TimeUnit

class SendAlarm constructor(
    private val channel: ManagedChannel
) : Closeable {
    private val stub: AlarmStoreCoroutineStub = AlarmStoreCoroutineStub(channel)

    override fun close() {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS)
    }
}