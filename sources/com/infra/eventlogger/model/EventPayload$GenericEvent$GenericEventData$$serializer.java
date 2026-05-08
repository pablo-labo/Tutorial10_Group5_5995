package com.infra.eventlogger.model;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.infra.eventlogger.model.EventPayload;
import com.infra.eventlogger.model.avro.NullableLong$$serializer;
import com.infra.eventlogger.model.avro.NullableString$$serializer;
import defpackage.b0;
import defpackage.gt0;
import defpackage.mve;
import defpackage.qp1;
import defpackage.rh7;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/infra/eventlogger/model/EventPayload.GenericEvent.GenericEventData.$serializer", "Lsw5;", "Lcom/infra/eventlogger/model/EventPayload$GenericEvent$GenericEventData;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/infra/eventlogger/model/EventPayload$GenericEvent$GenericEventData;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lj6g;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/infra/eventlogger/model/EventPayload$GenericEvent$GenericEventData;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@sy3
public final class EventPayload$GenericEvent$GenericEventData$$serializer implements sw5<EventPayload.GenericEvent.GenericEventData> {
    public static final EventPayload$GenericEvent$GenericEventData$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        EventPayload$GenericEvent$GenericEventData$$serializer eventPayload$GenericEvent$GenericEventData$$serializer = new EventPayload$GenericEvent$GenericEventData$$serializer();
        INSTANCE = eventPayload$GenericEvent$GenericEventData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.infra.eventlogger.model.EventPayload.GenericEvent.GenericEventData", eventPayload$GenericEvent$GenericEventData$$serializer, 10);
        pluginGeneratedSerialDescriptor.k("device", false);
        pluginGeneratedSerialDescriptor.k("properties", false);
        pluginGeneratedSerialDescriptor.k("eventName", false);
        pluginGeneratedSerialDescriptor.k("eventType", false);
        pluginGeneratedSerialDescriptor.k("tags", false);
        pluginGeneratedSerialDescriptor.k("eventVersion", false);
        pluginGeneratedSerialDescriptor.k("stringParams", false);
        pluginGeneratedSerialDescriptor.k("stringValues", false);
        pluginGeneratedSerialDescriptor.k("intParams", false);
        pluginGeneratedSerialDescriptor.k("intValues", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private EventPayload$GenericEvent$GenericEventData$$serializer() {
    }

    @Override // defpackage.sw5
    public KSerializer<?>[] childSerializers() {
        mve mveVar = mve.a;
        return new KSerializer[]{DeviceProperties$$serializer.INSTANCE, EventProperties$$serializer.INSTANCE, mveVar, mveVar, new gt0(mveVar, 0), rh7.a, new gt0(mveVar, 0), new gt0(qp1.b(NullableString$$serializer.INSTANCE), 0), new gt0(mveVar, 0), new gt0(qp1.b(NullableLong$$serializer.INSTANCE), 0)};
    }

    @Override // defpackage.i04
    public EventPayload.GenericEvent.GenericEventData deserialize(Decoder decoder) {
        boolean z;
        decoder.getClass();
        SerialDescriptor serialDescriptor = get$$serialDesc();
        ul2 ul2VarB = decoder.b(serialDescriptor);
        int i = 0;
        int iM = 0;
        Object objZ = null;
        boolean z2 = true;
        Object objZ2 = null;
        Object objZ3 = null;
        Object objZ4 = null;
        String strO = null;
        String strO2 = null;
        Object objZ5 = null;
        Object objZ6 = null;
        Object objZ7 = null;
        while (z2) {
            int iP = ul2VarB.p(serialDescriptor);
            switch (iP) {
                case -1:
                    z2 = false;
                    continue;
                case 0:
                    z = z2;
                    objZ2 = ul2VarB.z(serialDescriptor, 0, DeviceProperties$$serializer.INSTANCE, objZ2);
                    i |= 1;
                    break;
                case 1:
                    z = z2;
                    objZ3 = ul2VarB.z(serialDescriptor, 1, EventProperties$$serializer.INSTANCE, objZ3);
                    i |= 2;
                    break;
                case 2:
                    strO = ul2VarB.o(serialDescriptor, 2);
                    i |= 4;
                    continue;
                case 3:
                    strO2 = ul2VarB.o(serialDescriptor, 3);
                    i |= 8;
                    continue;
                case 4:
                    z = z2;
                    objZ4 = ul2VarB.z(serialDescriptor, 4, new gt0(mve.a, 0), objZ4);
                    i |= 16;
                    break;
                case 5:
                    iM = ul2VarB.m(serialDescriptor, 5);
                    i |= 32;
                    continue;
                case 6:
                    z = z2;
                    objZ5 = ul2VarB.z(serialDescriptor, 6, new gt0(mve.a, 0), objZ5);
                    i |= 64;
                    break;
                case 7:
                    z = z2;
                    objZ6 = ul2VarB.z(serialDescriptor, 7, new gt0(qp1.b(NullableString$$serializer.INSTANCE), 0), objZ6);
                    i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                    break;
                case 8:
                    z = z2;
                    objZ7 = ul2VarB.z(serialDescriptor, 8, new gt0(mve.a, 0), objZ7);
                    i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                    break;
                case DatadogLogGenerator.CRASH /* 9 */:
                    z = z2;
                    objZ = ul2VarB.z(serialDescriptor, 9, new gt0(qp1.b(NullableLong$$serializer.INSTANCE), 0), objZ);
                    i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                    break;
                default:
                    b0.m(iP);
                    return null;
            }
            z2 = z;
        }
        ul2VarB.c(serialDescriptor);
        return new EventPayload.GenericEvent.GenericEventData(i, (DeviceProperties) objZ2, (EventProperties) objZ3, strO, strO2, (List) objZ4, iM, (List) objZ5, (List) objZ6, (List) objZ7, (List) objZ);
    }

    @Override // defpackage.r7e, defpackage.i04
    /* JADX INFO: renamed from: getDescriptor */
    public SerialDescriptor get$$serialDesc() {
        return descriptor;
    }

    @Override // defpackage.r7e
    public void serialize(Encoder encoder, EventPayload.GenericEvent.GenericEventData value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = get$$serialDesc();
        vl2 vl2VarB = encoder.b(serialDescriptor);
        vl2VarB.y(serialDescriptor, 0, DeviceProperties$$serializer.INSTANCE, value.a);
        vl2VarB.y(serialDescriptor, 1, EventProperties$$serializer.INSTANCE, value.b);
        vl2VarB.x(serialDescriptor, 2, value.c);
        vl2VarB.x(serialDescriptor, 3, value.d);
        mve mveVar = mve.a;
        vl2VarB.y(serialDescriptor, 4, new gt0(mveVar, 0), value.e);
        vl2VarB.r(5, value.f, serialDescriptor);
        vl2VarB.y(serialDescriptor, 6, new gt0(mveVar, 0), value.g);
        vl2VarB.y(serialDescriptor, 7, new gt0(qp1.b(NullableString$$serializer.INSTANCE), 0), value.h);
        vl2VarB.y(serialDescriptor, 8, new gt0(mveVar, 0), value.i);
        vl2VarB.y(serialDescriptor, 9, new gt0(qp1.b(NullableLong$$serializer.INSTANCE), 0), value.j);
        vl2VarB.c(serialDescriptor);
    }

    @Override // defpackage.sw5
    public KSerializer<?>[] typeParametersSerializers() {
        return ypd.V;
    }
}
