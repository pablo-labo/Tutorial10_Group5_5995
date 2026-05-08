package com.infra.eventlogger.model;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.infra.eventlogger.model.EventPayload;
import com.infra.eventlogger.model.avro.NullableString;
import com.infra.eventlogger.model.avro.NullableString$$serializer;
import defpackage.b0;
import defpackage.mve;
import defpackage.p59;
import defpackage.qp1;
import defpackage.sw5;
import defpackage.sy3;
import defpackage.ul2;
import defpackage.vl2;
import defpackage.ypd;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/infra/eventlogger/model/EventPayload.NativeHttpMetricsEvent.NativeHttpMetricsEventData.$serializer", "Lsw5;", "Lcom/infra/eventlogger/model/EventPayload$NativeHttpMetricsEvent$NativeHttpMetricsEventData;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/infra/eventlogger/model/EventPayload$NativeHttpMetricsEvent$NativeHttpMetricsEventData;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lj6g;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/infra/eventlogger/model/EventPayload$NativeHttpMetricsEvent$NativeHttpMetricsEventData;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@sy3
public final class EventPayload$NativeHttpMetricsEvent$NativeHttpMetricsEventData$$serializer implements sw5<EventPayload.NativeHttpMetricsEvent.NativeHttpMetricsEventData> {
    public static final EventPayload$NativeHttpMetricsEvent$NativeHttpMetricsEventData$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        EventPayload$NativeHttpMetricsEvent$NativeHttpMetricsEventData$$serializer eventPayload$NativeHttpMetricsEvent$NativeHttpMetricsEventData$$serializer = new EventPayload$NativeHttpMetricsEvent$NativeHttpMetricsEventData$$serializer();
        INSTANCE = eventPayload$NativeHttpMetricsEvent$NativeHttpMetricsEventData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.infra.eventlogger.model.EventPayload.NativeHttpMetricsEvent.NativeHttpMetricsEventData", eventPayload$NativeHttpMetricsEvent$NativeHttpMetricsEventData$$serializer, 10);
        pluginGeneratedSerialDescriptor.k("device", false);
        pluginGeneratedSerialDescriptor.k("properties", false);
        pluginGeneratedSerialDescriptor.k("url", false);
        pluginGeneratedSerialDescriptor.k("method", false);
        pluginGeneratedSerialDescriptor.k("request", false);
        pluginGeneratedSerialDescriptor.k("response", false);
        pluginGeneratedSerialDescriptor.k("responseLatencyMs", false);
        pluginGeneratedSerialDescriptor.k("message", false);
        pluginGeneratedSerialDescriptor.k("urlType", false);
        pluginGeneratedSerialDescriptor.k("graphQLOperation", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private EventPayload$NativeHttpMetricsEvent$NativeHttpMetricsEventData$$serializer() {
    }

    @Override // defpackage.sw5
    public KSerializer<?>[] childSerializers() {
        KSerializer<?> kSerializerB = qp1.b(EventPayload$NativeHttpMetricsEvent$NullableNativeHttpResponseDebug$$serializer.INSTANCE);
        NullableString$$serializer nullableString$$serializer = NullableString$$serializer.INSTANCE;
        KSerializer<?> kSerializerB2 = qp1.b(nullableString$$serializer);
        KSerializer<?> kSerializerB3 = qp1.b(nullableString$$serializer);
        mve mveVar = mve.a;
        return new KSerializer[]{DeviceProperties$$serializer.INSTANCE, EventProperties$$serializer.INSTANCE, mveVar, mveVar, EventPayload$NativeHttpMetricsEvent$NativeHttpRequestDebug$$serializer.INSTANCE, kSerializerB, p59.a, mveVar, kSerializerB2, kSerializerB3};
    }

    @Override // defpackage.i04
    public EventPayload.NativeHttpMetricsEvent.NativeHttpMetricsEventData deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = get$$serialDesc();
        ul2 ul2VarB = decoder.b(serialDescriptor);
        EventPayload.NativeHttpMetricsEvent.NativeHttpMetricsEventData nativeHttpMetricsEventData = null;
        Object objZ = null;
        Object objZ2 = null;
        Object objH = null;
        String strO = null;
        String strO2 = null;
        Object objH2 = null;
        Object objH3 = null;
        String strO3 = null;
        long jF = 0;
        int i = 0;
        boolean z = true;
        Object objZ3 = null;
        while (z) {
            int iP = ul2VarB.p(serialDescriptor);
            switch (iP) {
                case -1:
                    z = false;
                    break;
                case 0:
                    objZ3 = ul2VarB.z(serialDescriptor, 0, DeviceProperties$$serializer.INSTANCE, objZ3);
                    i |= 1;
                    break;
                case 1:
                    objZ = ul2VarB.z(serialDescriptor, 1, EventProperties$$serializer.INSTANCE, objZ);
                    i |= 2;
                    break;
                case 2:
                    strO = ul2VarB.o(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    strO2 = ul2VarB.o(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    objZ2 = ul2VarB.z(serialDescriptor, 4, EventPayload$NativeHttpMetricsEvent$NativeHttpRequestDebug$$serializer.INSTANCE, objZ2);
                    i |= 16;
                    break;
                case 5:
                    objH = ul2VarB.h(serialDescriptor, 5, EventPayload$NativeHttpMetricsEvent$NullableNativeHttpResponseDebug$$serializer.INSTANCE, objH);
                    i |= 32;
                    break;
                case 6:
                    jF = ul2VarB.f(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    strO3 = ul2VarB.o(serialDescriptor, 7);
                    i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                    break;
                case 8:
                    objH2 = ul2VarB.h(serialDescriptor, 8, NullableString$$serializer.INSTANCE, objH2);
                    i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                    break;
                case DatadogLogGenerator.CRASH /* 9 */:
                    objH3 = ul2VarB.h(serialDescriptor, 9, NullableString$$serializer.INSTANCE, objH3);
                    i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                    break;
                default:
                    b0.m(iP);
                    return nativeHttpMetricsEventData;
            }
            nativeHttpMetricsEventData = null;
        }
        ul2VarB.c(serialDescriptor);
        return new EventPayload.NativeHttpMetricsEvent.NativeHttpMetricsEventData(i, (DeviceProperties) objZ3, (EventProperties) objZ, strO, strO2, (EventPayload.NativeHttpMetricsEvent.NativeHttpRequestDebug) objZ2, (EventPayload.NativeHttpMetricsEvent.NullableNativeHttpResponseDebug) objH, jF, strO3, (NullableString) objH2, (NullableString) objH3);
    }

    @Override // defpackage.r7e, defpackage.i04
    /* JADX INFO: renamed from: getDescriptor */
    public SerialDescriptor get$$serialDesc() {
        return descriptor;
    }

    @Override // defpackage.r7e
    public void serialize(Encoder encoder, EventPayload.NativeHttpMetricsEvent.NativeHttpMetricsEventData value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = get$$serialDesc();
        vl2 vl2VarB = encoder.b(serialDescriptor);
        vl2VarB.y(serialDescriptor, 0, DeviceProperties$$serializer.INSTANCE, value.a);
        vl2VarB.y(serialDescriptor, 1, EventProperties$$serializer.INSTANCE, value.b);
        vl2VarB.x(serialDescriptor, 2, value.c);
        vl2VarB.x(serialDescriptor, 3, value.d);
        vl2VarB.y(serialDescriptor, 4, EventPayload$NativeHttpMetricsEvent$NativeHttpRequestDebug$$serializer.INSTANCE, value.e);
        vl2VarB.k(serialDescriptor, 5, EventPayload$NativeHttpMetricsEvent$NullableNativeHttpResponseDebug$$serializer.INSTANCE, value.f);
        vl2VarB.D(serialDescriptor, 6, value.g);
        vl2VarB.x(serialDescriptor, 7, value.h);
        NullableString$$serializer nullableString$$serializer = NullableString$$serializer.INSTANCE;
        vl2VarB.k(serialDescriptor, 8, nullableString$$serializer, value.i);
        vl2VarB.k(serialDescriptor, 9, nullableString$$serializer, value.j);
        vl2VarB.c(serialDescriptor);
    }

    @Override // defpackage.sw5
    public KSerializer<?>[] typeParametersSerializers() {
        return ypd.V;
    }
}
