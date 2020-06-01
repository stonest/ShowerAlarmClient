package alarm

import alarm.AlarmStoreGrpc.getServiceDescriptor
import io.grpc.CallOptions
import io.grpc.CallOptions.DEFAULT
import io.grpc.Channel
import io.grpc.Metadata
import io.grpc.MethodDescriptor
import io.grpc.ServerServiceDefinition
import io.grpc.ServerServiceDefinition.builder
import io.grpc.ServiceDescriptor
import io.grpc.Status
import io.grpc.Status.UNIMPLEMENTED
import io.grpc.StatusException
import io.grpc.kotlin.AbstractCoroutineServerImpl
import io.grpc.kotlin.AbstractCoroutineStub
import io.grpc.kotlin.ClientCalls
import io.grpc.kotlin.ClientCalls.unaryRpc
import io.grpc.kotlin.ServerCalls
import io.grpc.kotlin.ServerCalls.unaryServerMethodDefinition
import io.grpc.kotlin.StubFor
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.jvm.JvmOverloads
import kotlin.jvm.JvmStatic

/**
 * Holder for Kotlin coroutine-based client and server APIs for alarm.AlarmStore.
 */
object AlarmStoreGrpcKt {
  @JvmStatic
  val serviceDescriptor: ServiceDescriptor
    get() = AlarmStoreGrpc.getServiceDescriptor()

  val deleteAlarmMethod: MethodDescriptor<AlarmOuterClass.Alarm, AlarmOuterClass.ActionResponse>
    @JvmStatic
    get() = AlarmStoreGrpc.getDeleteAlarmMethod()

  val updateAlarmMethod: MethodDescriptor<AlarmOuterClass.Alarm, AlarmOuterClass.ActionResponse>
    @JvmStatic
    get() = AlarmStoreGrpc.getUpdateAlarmMethod()

  val listAlarmsMethod: MethodDescriptor<AlarmOuterClass.ListAlarmsParams,
      AlarmOuterClass.ActionResponse>
    @JvmStatic
    get() = AlarmStoreGrpc.getListAlarmsMethod()

  val createAlarmMethod: MethodDescriptor<AlarmOuterClass.Alarm, AlarmOuterClass.ActionResponse>
    @JvmStatic
    get() = AlarmStoreGrpc.getCreateAlarmMethod()

  /**
   * A stub for issuing RPCs to a(n) alarm.AlarmStore service as suspending coroutines.
   */
  @StubFor(AlarmStoreGrpc::class)
  class AlarmStoreCoroutineStub @JvmOverloads constructor(
    channel: Channel,
    callOptions: CallOptions = DEFAULT
  ) : AbstractCoroutineStub<AlarmStoreCoroutineStub>(channel, callOptions) {
    override fun build(channel: Channel, callOptions: CallOptions): AlarmStoreCoroutineStub =
        AlarmStoreCoroutineStub(channel, callOptions)

    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @return The single response from the server.
     */
    suspend fun deleteAlarm(request: AlarmOuterClass.Alarm): AlarmOuterClass.ActionResponse =
        unaryRpc(
      channel,
      AlarmStoreGrpc.getDeleteAlarmMethod(),
      request,
      callOptions,
      Metadata()
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @return The single response from the server.
     */
    suspend fun updateAlarm(request: AlarmOuterClass.Alarm): AlarmOuterClass.ActionResponse =
        unaryRpc(
      channel,
      AlarmStoreGrpc.getUpdateAlarmMethod(),
      request,
      callOptions,
      Metadata()
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @return The single response from the server.
     */
    suspend fun listAlarms(request: AlarmOuterClass.ListAlarmsParams):
        AlarmOuterClass.ActionResponse = unaryRpc(
      channel,
      AlarmStoreGrpc.getListAlarmsMethod(),
      request,
      callOptions,
      Metadata()
    )
    /**
     * Executes this RPC and returns the response message, suspending until the RPC completes
     * with [`Status.OK`][Status].  If the RPC completes with another status, a corresponding
     * [StatusException] is thrown.  If this coroutine is cancelled, the RPC is also cancelled
     * with the corresponding exception as a cause.
     *
     * @param request The request message to send to the server.
     *
     * @return The single response from the server.
     */
    suspend fun createAlarm(request: AlarmOuterClass.Alarm): AlarmOuterClass.ActionResponse =
        unaryRpc(
      channel,
      AlarmStoreGrpc.getCreateAlarmMethod(),
      request,
      callOptions,
      Metadata()
    )}

  /**
   * Skeletal implementation of the alarm.AlarmStore service based on Kotlin coroutines.
   */
  abstract class AlarmStoreCoroutineImplBase(
    coroutineContext: CoroutineContext = EmptyCoroutineContext
  ) : AbstractCoroutineServerImpl(coroutineContext) {
    /**
     * Returns the response to an RPC for alarm.AlarmStore.DeleteAlarm.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun deleteAlarm(request: AlarmOuterClass.Alarm): AlarmOuterClass.ActionResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method alarm.AlarmStore.DeleteAlarm is unimplemented"))

    /**
     * Returns the response to an RPC for alarm.AlarmStore.UpdateAlarm.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun updateAlarm(request: AlarmOuterClass.Alarm): AlarmOuterClass.ActionResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method alarm.AlarmStore.UpdateAlarm is unimplemented"))

    /**
     * Returns the response to an RPC for alarm.AlarmStore.ListAlarms.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun listAlarms(request: AlarmOuterClass.ListAlarmsParams):
        AlarmOuterClass.ActionResponse = throw
        StatusException(UNIMPLEMENTED.withDescription("Method alarm.AlarmStore.ListAlarms is unimplemented"))

    /**
     * Returns the response to an RPC for alarm.AlarmStore.CreateAlarm.
     *
     * If this method fails with a [StatusException], the RPC will fail with the corresponding
     * [Status].  If this method fails with a [java.util.concurrent.CancellationException], the RPC
     * will fail
     * with status `Status.CANCELLED`.  If this method fails for any other reason, the RPC will
     * fail with `Status.UNKNOWN` with the exception as a cause.
     *
     * @param request The request from the client.
     */
    open suspend fun createAlarm(request: AlarmOuterClass.Alarm): AlarmOuterClass.ActionResponse =
        throw
        StatusException(UNIMPLEMENTED.withDescription("Method alarm.AlarmStore.CreateAlarm is unimplemented"))

    final override fun bindService(): ServerServiceDefinition = builder(getServiceDescriptor())
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AlarmStoreGrpc.getDeleteAlarmMethod(),
      implementation = ::deleteAlarm
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AlarmStoreGrpc.getUpdateAlarmMethod(),
      implementation = ::updateAlarm
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AlarmStoreGrpc.getListAlarmsMethod(),
      implementation = ::listAlarms
    ))
      .addMethod(unaryServerMethodDefinition(
      context = this.context,
      descriptor = AlarmStoreGrpc.getCreateAlarmMethod(),
      implementation = ::createAlarm
    )).build()
  }
}
