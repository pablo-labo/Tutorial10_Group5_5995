package com.infra.eventlogger.model;

import com.infra.eventlogger.model.EventPayload;
import defpackage.b0;
import defpackage.mve;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/infra/eventlogger/model/EventPayload.HttpErrorEvent.HttpErrorEventData.$serializer", "Lsw5;", "Lcom/infra/eventlogger/model/EventPayload$HttpErrorEvent$HttpErrorEventData;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/infra/eventlogger/model/EventPayload$HttpErrorEvent$HttpErrorEventData;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lj6g;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/infra/eventlogger/model/EventPayload$HttpErrorEvent$HttpErrorEventData;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@sy3
public final class EventPayload$HttpErrorEvent$HttpErrorEventData$$serializer implements sw5<EventPayload.HttpErrorEvent.HttpErrorEventData> {
    public static final EventPayload$HttpErrorEvent$HttpErrorEventData$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        EventPayload$HttpErrorEvent$HttpErrorEventData$$serializer eventPayload$HttpErrorEvent$HttpErrorEventData$$serializer = new EventPayload$HttpErrorEvent$HttpErrorEventData$$serializer();
        INSTANCE = eventPayload$HttpErrorEvent$HttpErrorEventData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.infra.eventlogger.model.EventPayload.HttpErrorEvent.HttpErrorEventData", eventPayload$HttpErrorEvent$HttpErrorEventData$$serializer, 7);
        pluginGeneratedSerialDescriptor.k("device", false);
        pluginGeneratedSerialDescriptor.k("properties", false);
        pluginGeneratedSerialDescriptor.k("url", false);
        pluginGeneratedSerialDescriptor.k("method", false);
        pluginGeneratedSerialDescriptor.k("requestDebug", false);
        pluginGeneratedSerialDescriptor.k("responseDebug", false);
        pluginGeneratedSerialDescriptor.k("message", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private EventPayload$HttpErrorEvent$HttpErrorEventData$$serializer() {
    }

    @Override // defpackage.sw5
    public KSerializer<?>[] childSerializers() {
        KSerializer<?> kSerializerB = qp1.b(EventPayload$HttpErrorEvent$NullableHttpResponseDebug$$serializer.INSTANCE);
        mve mveVar = mve.a;
        return new KSerializer[]{DeviceProperties$$serializer.INSTANCE, EventProperties$$serializer.INSTANCE, mveVar, mveVar, EventPayload$HttpErrorEvent$HttpRequestDebug$$serializer.INSTANCE, kSerializerB, mveVar};
    }

    @Override // defpackage.i04
    public EventPayload.HttpErrorEvent.HttpErrorEventData deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = get$$serialDesc();
        ul2 ul2VarB = decoder.b(serialDescriptor);
        boolean z = true;
        int i = 0;
        Object objZ = null;
        Object objZ2 = null;
        Object objZ3 = null;
        String strO = null;
        String strO2 = null;
        Object objH = null;
        String strO3 = null;
        while (z) {
            int iP = ul2VarB.p(serialDescriptor);
            switch (iP) {
                case -1:
                    z = false;
                    break;
                case 0:
                    objZ = ul2VarB.z(serialDescriptor, 0, DeviceProperties$$serializer.INSTANCE, objZ);
                    i |= 1;
                    break;
                case 1:
                    objZ2 = ul2VarB.z(serialDescriptor, 1, EventProperties$$serializer.INSTANCE, objZ2);
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
                    objZ3 = ul2VarB.z(serialDescriptor, 4, EventPayload$HttpErrorEvent$HttpRequestDebug$$serializer.INSTANCE, objZ3);
                    i |= 16;
                    break;
                case 5:
                    objH = ul2VarB.h(serialDescriptor, 5, EventPayload$HttpErrorEvent$NullableHttpResponseDebug$$serializer.INSTANCE, objH);
                    i |= 32;
                    break;
                case 6:
                    strO3 = ul2VarB.o(serialDescriptor, 6);
                    i |= 64;
                    break;
                default:
                    b0.m(iP);
                    return null;
            }
        }
        ul2VarB.c(serialDescriptor);
        return new EventPayload.HttpErrorEvent.HttpErrorEventData(i, (DeviceProperties) objZ, (EventProperties) objZ2, strO, strO2, (EventPayload.HttpErrorEvent.HttpRequestDebug) objZ3, (EventPayload.HttpErrorEvent.NullableHttpResponseDebug) objH, strO3);
    }

    @Override // defpackage.r7e, defpackage.i04
    /* JADX INFO: renamed from: getDescriptor */
    public SerialDescriptor get$$serialDesc() {
        return descriptor;
    }

    @Override // defpackage.r7e
    public void serialize(Encoder encoder, EventPayload.HttpErrorEvent.HttpErrorEventData value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = get$$serialDesc();
        vl2 vl2VarB = encoder.b(serialDescriptor);
        vl2VarB.y(serialDescriptor, 0, DeviceProperties$$serializer.INSTANCE, value.a);
        vl2VarB.y(serialDescriptor, 1, EventProperties$$serializer.INSTANCE, value.b);
        vl2VarB.x(serialDescriptor, 2, value.c);
        vl2VarB.x(serialDescriptor, 3, value.d);
        vl2VarB.y(serialDescriptor, 4, EventPayload$HttpErrorEvent$HttpRequestDebug$$serializer.INSTANCE, value.e);
        vl2VarB.k(serialDescriptor, 5, EventPayload$HttpErrorEvent$NullableHttpResponseDebug$$serializer.INSTANCE, value.f);
        vl2VarB.x(serialDescriptor, 6, value.g);
        vl2VarB.c(serialDescriptor);
    }

    @Override // defpackage.sw5
    public KSerializer<?>[] typeParametersSerializers() {
        return ypd.V;
    }
}
