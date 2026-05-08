package com.infra.eventlogger.model;

import com.infra.eventlogger.model.EventPayload;
import defpackage.b0;
import defpackage.by8;
import defpackage.mve;
import defpackage.p59;
import defpackage.sw5;
import defpackage.sy3;
import defpackage.ul2;
import defpackage.vl2;
import defpackage.ypd;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/infra/eventlogger/model/EventPayload.AppMetricsEvent.AppMetricsEventData.$serializer", "Lsw5;", "Lcom/infra/eventlogger/model/EventPayload$AppMetricsEvent$AppMetricsEventData;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/infra/eventlogger/model/EventPayload$AppMetricsEvent$AppMetricsEventData;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lj6g;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/infra/eventlogger/model/EventPayload$AppMetricsEvent$AppMetricsEventData;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@sy3
public final class EventPayload$AppMetricsEvent$AppMetricsEventData$$serializer implements sw5<EventPayload.AppMetricsEvent.AppMetricsEventData> {
    public static final EventPayload$AppMetricsEvent$AppMetricsEventData$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        EventPayload$AppMetricsEvent$AppMetricsEventData$$serializer eventPayload$AppMetricsEvent$AppMetricsEventData$$serializer = new EventPayload$AppMetricsEvent$AppMetricsEventData$$serializer();
        INSTANCE = eventPayload$AppMetricsEvent$AppMetricsEventData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.infra.eventlogger.model.EventPayload.AppMetricsEvent.AppMetricsEventData", eventPayload$AppMetricsEvent$AppMetricsEventData$$serializer, 5);
        pluginGeneratedSerialDescriptor.k("device", false);
        pluginGeneratedSerialDescriptor.k("properties", false);
        pluginGeneratedSerialDescriptor.k("name", false);
        pluginGeneratedSerialDescriptor.k("durationsMs", false);
        pluginGeneratedSerialDescriptor.k("extraInfo", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private EventPayload$AppMetricsEvent$AppMetricsEventData$$serializer() {
    }

    @Override // defpackage.sw5
    public KSerializer<?>[] childSerializers() {
        mve mveVar = mve.a;
        return new KSerializer[]{DeviceProperties$$serializer.INSTANCE, EventProperties$$serializer.INSTANCE, mveVar, new by8(mveVar, p59.a), new by8(mveVar, mveVar)};
    }

    @Override // defpackage.i04
    public EventPayload.AppMetricsEvent.AppMetricsEventData deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = get$$serialDesc();
        ul2 ul2VarB = decoder.b(serialDescriptor);
        boolean z = true;
        int i = 0;
        Object objZ = null;
        Object objZ2 = null;
        Object objZ3 = null;
        String strO = null;
        Object objZ4 = null;
        while (z) {
            int iP = ul2VarB.p(serialDescriptor);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                objZ = ul2VarB.z(serialDescriptor, 0, DeviceProperties$$serializer.INSTANCE, objZ);
                i |= 1;
            } else if (iP == 1) {
                objZ2 = ul2VarB.z(serialDescriptor, 1, EventProperties$$serializer.INSTANCE, objZ2);
                i |= 2;
            } else if (iP == 2) {
                strO = ul2VarB.o(serialDescriptor, 2);
                i |= 4;
            } else if (iP == 3) {
                objZ3 = ul2VarB.z(serialDescriptor, 3, new by8(mve.a, p59.a), objZ3);
                i |= 8;
            } else {
                if (iP != 4) {
                    b0.m(iP);
                    return null;
                }
                mve mveVar = mve.a;
                objZ4 = ul2VarB.z(serialDescriptor, 4, new by8(mveVar, mveVar), objZ4);
                i |= 16;
            }
        }
        ul2VarB.c(serialDescriptor);
        return new EventPayload.AppMetricsEvent.AppMetricsEventData(i, (DeviceProperties) objZ, (EventProperties) objZ2, strO, (Map) objZ3, (Map) objZ4);
    }

    @Override // defpackage.r7e, defpackage.i04
    /* JADX INFO: renamed from: getDescriptor */
    public SerialDescriptor get$$serialDesc() {
        return descriptor;
    }

    @Override // defpackage.r7e
    public void serialize(Encoder encoder, EventPayload.AppMetricsEvent.AppMetricsEventData value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = get$$serialDesc();
        vl2 vl2VarB = encoder.b(serialDescriptor);
        vl2VarB.y(serialDescriptor, 0, DeviceProperties$$serializer.INSTANCE, value.a);
        vl2VarB.y(serialDescriptor, 1, EventProperties$$serializer.INSTANCE, value.b);
        vl2VarB.x(serialDescriptor, 2, value.c);
        mve mveVar = mve.a;
        vl2VarB.y(serialDescriptor, 3, new by8(mveVar, p59.a), value.d);
        vl2VarB.y(serialDescriptor, 4, new by8(mveVar, mveVar), value.e);
        vl2VarB.c(serialDescriptor);
    }

    @Override // defpackage.sw5
    public KSerializer<?>[] typeParametersSerializers() {
        return ypd.V;
    }
}
