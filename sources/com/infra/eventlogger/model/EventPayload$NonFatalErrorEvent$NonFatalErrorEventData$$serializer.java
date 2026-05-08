package com.infra.eventlogger.model;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.infra.eventlogger.model.EventPayload;
import com.infra.eventlogger.model.avro.NullableLong$$serializer;
import com.infra.eventlogger.model.avro.NullableString$$serializer;
import defpackage.b0;
import defpackage.gt0;
import defpackage.mve;
import defpackage.p59;
import defpackage.qp1;
import defpackage.sw5;
import defpackage.sy3;
import defpackage.ul2;
import defpackage.vl2;
import defpackage.ypd;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/infra/eventlogger/model/EventPayload.NonFatalErrorEvent.NonFatalErrorEventData.$serializer", "Lsw5;", "Lcom/infra/eventlogger/model/EventPayload$NonFatalErrorEvent$NonFatalErrorEventData;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/infra/eventlogger/model/EventPayload$NonFatalErrorEvent$NonFatalErrorEventData;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lj6g;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/infra/eventlogger/model/EventPayload$NonFatalErrorEvent$NonFatalErrorEventData;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@sy3
public final class EventPayload$NonFatalErrorEvent$NonFatalErrorEventData$$serializer implements sw5<EventPayload.NonFatalErrorEvent.NonFatalErrorEventData> {
    public static final EventPayload$NonFatalErrorEvent$NonFatalErrorEventData$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        EventPayload$NonFatalErrorEvent$NonFatalErrorEventData$$serializer eventPayload$NonFatalErrorEvent$NonFatalErrorEventData$$serializer = new EventPayload$NonFatalErrorEvent$NonFatalErrorEventData$$serializer();
        INSTANCE = eventPayload$NonFatalErrorEvent$NonFatalErrorEventData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.infra.eventlogger.model.EventPayload.NonFatalErrorEvent.NonFatalErrorEventData", eventPayload$NonFatalErrorEvent$NonFatalErrorEventData$$serializer, 11);
        pluginGeneratedSerialDescriptor.k("device", false);
        pluginGeneratedSerialDescriptor.k("properties", false);
        pluginGeneratedSerialDescriptor.k("message", false);
        pluginGeneratedSerialDescriptor.k("stackTrace", false);
        pluginGeneratedSerialDescriptor.k("breadcrumbs", false);
        pluginGeneratedSerialDescriptor.k("errCode", false);
        pluginGeneratedSerialDescriptor.k("errDomain", false);
        pluginGeneratedSerialDescriptor.k("stringParams", false);
        pluginGeneratedSerialDescriptor.k("stringValues", false);
        pluginGeneratedSerialDescriptor.k("intParams", false);
        pluginGeneratedSerialDescriptor.k("intValues", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private EventPayload$NonFatalErrorEvent$NonFatalErrorEventData$$serializer() {
    }

    @Override // defpackage.sw5
    public KSerializer<?>[] childSerializers() {
        mve mveVar = mve.a;
        return new KSerializer[]{DeviceProperties$$serializer.INSTANCE, EventProperties$$serializer.INSTANCE, mveVar, mveVar, mveVar, p59.a, mveVar, new gt0(mveVar, 0), new gt0(qp1.b(NullableString$$serializer.INSTANCE), 0), new gt0(mveVar, 0), new gt0(qp1.b(NullableLong$$serializer.INSTANCE), 0)};
    }

    @Override // defpackage.i04
    public EventPayload.NonFatalErrorEvent.NonFatalErrorEventData deserialize(Decoder decoder) {
        boolean z;
        String str;
        decoder.getClass();
        SerialDescriptor serialDescriptor = get$$serialDesc();
        ul2 ul2VarB = decoder.b(serialDescriptor);
        long jF = 0;
        Object objZ = null;
        Object objZ2 = null;
        boolean z2 = true;
        Object objZ3 = null;
        Object objZ4 = null;
        int i = 0;
        Object objZ5 = null;
        Object objZ6 = null;
        String strO = null;
        String strO2 = null;
        String strO3 = null;
        String strO4 = null;
        while (z2) {
            int iP = ul2VarB.p(serialDescriptor);
            switch (iP) {
                case -1:
                    z2 = false;
                    strO = strO;
                    break;
                case 0:
                    z = z2;
                    str = strO;
                    objZ3 = ul2VarB.z(serialDescriptor, 0, DeviceProperties$$serializer.INSTANCE, objZ3);
                    i |= 1;
                    strO = str;
                    z2 = z;
                    break;
                case 1:
                    z = z2;
                    objZ4 = ul2VarB.z(serialDescriptor, 1, EventProperties$$serializer.INSTANCE, objZ4);
                    i |= 2;
                    z2 = z;
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
                    strO3 = ul2VarB.o(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    jF = ul2VarB.f(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    strO4 = ul2VarB.o(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    z = z2;
                    str = strO;
                    objZ5 = ul2VarB.z(serialDescriptor, 7, new gt0(mve.a, 0), objZ5);
                    i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                    strO = str;
                    z2 = z;
                    break;
                case 8:
                    z = z2;
                    str = strO;
                    objZ6 = ul2VarB.z(serialDescriptor, 8, new gt0(qp1.b(NullableString$$serializer.INSTANCE), 0), objZ6);
                    i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                    strO = str;
                    z2 = z;
                    break;
                case DatadogLogGenerator.CRASH /* 9 */:
                    z = z2;
                    str = strO;
                    objZ2 = ul2VarB.z(serialDescriptor, 9, new gt0(mve.a, 0), objZ2);
                    i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                    strO = str;
                    z2 = z;
                    break;
                case 10:
                    z = z2;
                    str = strO;
                    objZ = ul2VarB.z(serialDescriptor, 10, new gt0(qp1.b(NullableLong$$serializer.INSTANCE), 0), objZ);
                    i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                    strO = str;
                    z2 = z;
                    break;
                default:
                    b0.m(iP);
                    return null;
            }
        }
        ul2VarB.c(serialDescriptor);
        return new EventPayload.NonFatalErrorEvent.NonFatalErrorEventData(i, (DeviceProperties) objZ3, (EventProperties) objZ4, strO, strO2, strO3, jF, strO4, (List) objZ5, (List) objZ6, (List) objZ2, (List) objZ);
    }

    @Override // defpackage.r7e, defpackage.i04
    /* JADX INFO: renamed from: getDescriptor */
    public SerialDescriptor get$$serialDesc() {
        return descriptor;
    }

    @Override // defpackage.r7e
    public void serialize(Encoder encoder, EventPayload.NonFatalErrorEvent.NonFatalErrorEventData value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = get$$serialDesc();
        vl2 vl2VarB = encoder.b(serialDescriptor);
        vl2VarB.y(serialDescriptor, 0, DeviceProperties$$serializer.INSTANCE, value.a);
        vl2VarB.y(serialDescriptor, 1, EventProperties$$serializer.INSTANCE, value.b);
        vl2VarB.x(serialDescriptor, 2, value.c);
        vl2VarB.x(serialDescriptor, 3, value.d);
        vl2VarB.x(serialDescriptor, 4, value.e);
        vl2VarB.D(serialDescriptor, 5, value.f);
        vl2VarB.x(serialDescriptor, 6, value.g);
        mve mveVar = mve.a;
        vl2VarB.y(serialDescriptor, 7, new gt0(mveVar, 0), value.h);
        vl2VarB.y(serialDescriptor, 8, new gt0(qp1.b(NullableString$$serializer.INSTANCE), 0), value.i);
        vl2VarB.y(serialDescriptor, 9, new gt0(mveVar, 0), value.j);
        vl2VarB.y(serialDescriptor, 10, new gt0(qp1.b(NullableLong$$serializer.INSTANCE), 0), value.k);
        vl2VarB.c(serialDescriptor);
    }

    @Override // defpackage.sw5
    public KSerializer<?>[] typeParametersSerializers() {
        return ypd.V;
    }
}
