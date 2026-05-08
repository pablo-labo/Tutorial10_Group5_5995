package com.infra.eventlogger.model;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.infra.eventlogger.model.EventPayload;
import com.infra.eventlogger.model.avro.NullableString;
import com.infra.eventlogger.model.avro.NullableString$$serializer;
import defpackage.b0;
import defpackage.by8;
import defpackage.mve;
import defpackage.p59;
import defpackage.qp1;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/infra/eventlogger/model/EventPayload.GenericLifecycleEvent.GenericLifecycleEventData.$serializer", "Lsw5;", "Lcom/infra/eventlogger/model/EventPayload$GenericLifecycleEvent$GenericLifecycleEventData;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/infra/eventlogger/model/EventPayload$GenericLifecycleEvent$GenericLifecycleEventData;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lj6g;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/infra/eventlogger/model/EventPayload$GenericLifecycleEvent$GenericLifecycleEventData;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@sy3
public final class EventPayload$GenericLifecycleEvent$GenericLifecycleEventData$$serializer implements sw5<EventPayload.GenericLifecycleEvent.GenericLifecycleEventData> {
    public static final EventPayload$GenericLifecycleEvent$GenericLifecycleEventData$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        EventPayload$GenericLifecycleEvent$GenericLifecycleEventData$$serializer eventPayload$GenericLifecycleEvent$GenericLifecycleEventData$$serializer = new EventPayload$GenericLifecycleEvent$GenericLifecycleEventData$$serializer();
        INSTANCE = eventPayload$GenericLifecycleEvent$GenericLifecycleEventData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.infra.eventlogger.model.EventPayload.GenericLifecycleEvent.GenericLifecycleEventData", eventPayload$GenericLifecycleEvent$GenericLifecycleEventData$$serializer, 16);
        pluginGeneratedSerialDescriptor.k("device", false);
        pluginGeneratedSerialDescriptor.k("properties", false);
        pluginGeneratedSerialDescriptor.k("commonDetails", false);
        pluginGeneratedSerialDescriptor.k("eventName", false);
        pluginGeneratedSerialDescriptor.k("eventCount", false);
        pluginGeneratedSerialDescriptor.k("lastInstallTimestamp", false);
        pluginGeneratedSerialDescriptor.k("firstInstallTimestamp", false);
        pluginGeneratedSerialDescriptor.k("firstInstallVersion", false);
        pluginGeneratedSerialDescriptor.k("upgradedFromVersion", false);
        pluginGeneratedSerialDescriptor.k("appStore", false);
        pluginGeneratedSerialDescriptor.k("installerPackage", false);
        pluginGeneratedSerialDescriptor.k("systemUserAgent", false);
        pluginGeneratedSerialDescriptor.k("installReferrer", false);
        pluginGeneratedSerialDescriptor.k("attributionToken", false);
        pluginGeneratedSerialDescriptor.k("entityData", false);
        pluginGeneratedSerialDescriptor.k("extraProperties", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private EventPayload$GenericLifecycleEvent$GenericLifecycleEventData$$serializer() {
    }

    @Override // defpackage.sw5
    public KSerializer<?>[] childSerializers() {
        mve mveVar = mve.a;
        KSerializer<?> kSerializerB = qp1.b(mveVar);
        NullableString$$serializer nullableString$$serializer = NullableString$$serializer.INSTANCE;
        KSerializer<?> kSerializerB2 = qp1.b(nullableString$$serializer);
        KSerializer<?> kSerializerB3 = qp1.b(nullableString$$serializer);
        KSerializer<?> kSerializerB4 = qp1.b(nullableString$$serializer);
        KSerializer<?> kSerializerB5 = qp1.b(nullableString$$serializer);
        KSerializer<?> kSerializerB6 = qp1.b(nullableString$$serializer);
        KSerializer<?> kSerializerB7 = qp1.b(nullableString$$serializer);
        KSerializer<?> kSerializerB8 = qp1.b(nullableString$$serializer);
        by8 by8Var = new by8(mveVar, JsmaDynamicProperty$$serializer.INSTANCE);
        p59 p59Var = p59.a;
        return new KSerializer[]{DeviceProperties$$serializer.INSTANCE, EventProperties$$serializer.INSTANCE, kSerializerB, mveVar, p59Var, p59Var, p59Var, mveVar, kSerializerB2, kSerializerB3, kSerializerB4, kSerializerB5, kSerializerB6, kSerializerB7, kSerializerB8, by8Var};
    }

    @Override // defpackage.i04
    public EventPayload.GenericLifecycleEvent.GenericLifecycleEventData deserialize(Decoder decoder) {
        long j;
        Object obj;
        decoder.getClass();
        SerialDescriptor serialDescriptor = get$$serialDesc();
        ul2 ul2VarB = decoder.b(serialDescriptor);
        long jF = 0;
        long jF2 = 0;
        long jF3 = 0;
        Object objH = null;
        Object objH2 = null;
        Object objH3 = null;
        Object objH4 = null;
        Object objZ = null;
        Object objZ2 = null;
        int i = 0;
        Object objH5 = null;
        Object objH6 = null;
        Object objH7 = null;
        Object objH8 = null;
        Object objZ3 = null;
        String strO = null;
        boolean z = true;
        String strO2 = null;
        while (z) {
            int iP = ul2VarB.p(serialDescriptor);
            switch (iP) {
                case -1:
                    j = jF;
                    z = false;
                    jF = j;
                    break;
                case 0:
                    j = jF;
                    objZ = ul2VarB.z(serialDescriptor, 0, DeviceProperties$$serializer.INSTANCE, objZ);
                    i |= 1;
                    jF = j;
                    break;
                case 1:
                    j = jF;
                    obj = objZ;
                    objZ2 = ul2VarB.z(serialDescriptor, 1, EventProperties$$serializer.INSTANCE, objZ2);
                    i |= 2;
                    objZ = obj;
                    jF = j;
                    break;
                case 2:
                    j = jF;
                    obj = objZ;
                    objH5 = ul2VarB.h(serialDescriptor, 2, mve.a, objH5);
                    i |= 4;
                    objZ = obj;
                    jF = j;
                    break;
                case 3:
                    j = jF;
                    obj = objZ;
                    strO2 = ul2VarB.o(serialDescriptor, 3);
                    i |= 8;
                    objZ = obj;
                    jF = j;
                    break;
                case 4:
                    j = jF;
                    obj = objZ;
                    jF3 = ul2VarB.f(serialDescriptor, 4);
                    i |= 16;
                    objZ = obj;
                    jF = j;
                    break;
                case 5:
                    i |= 32;
                    objZ = objZ;
                    jF = ul2VarB.f(serialDescriptor, 5);
                    break;
                case 6:
                    j = jF;
                    obj = objZ;
                    jF2 = ul2VarB.f(serialDescriptor, 6);
                    i |= 64;
                    objZ = obj;
                    jF = j;
                    break;
                case 7:
                    j = jF;
                    obj = objZ;
                    strO = ul2VarB.o(serialDescriptor, 7);
                    i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                    objZ = obj;
                    jF = j;
                    break;
                case 8:
                    j = jF;
                    obj = objZ;
                    objH6 = ul2VarB.h(serialDescriptor, 8, NullableString$$serializer.INSTANCE, objH6);
                    i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                    objZ = obj;
                    jF = j;
                    break;
                case DatadogLogGenerator.CRASH /* 9 */:
                    j = jF;
                    obj = objZ;
                    objH7 = ul2VarB.h(serialDescriptor, 9, NullableString$$serializer.INSTANCE, objH7);
                    i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                    objZ = obj;
                    jF = j;
                    break;
                case 10:
                    j = jF;
                    obj = objZ;
                    objH3 = ul2VarB.h(serialDescriptor, 10, NullableString$$serializer.INSTANCE, objH3);
                    i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                    objZ = obj;
                    jF = j;
                    break;
                case 11:
                    j = jF;
                    obj = objZ;
                    objH2 = ul2VarB.h(serialDescriptor, 11, NullableString$$serializer.INSTANCE, objH2);
                    i |= 2048;
                    objZ = obj;
                    jF = j;
                    break;
                case 12:
                    j = jF;
                    obj = objZ;
                    objH = ul2VarB.h(serialDescriptor, 12, NullableString$$serializer.INSTANCE, objH);
                    i |= 4096;
                    objZ = obj;
                    jF = j;
                    break;
                case 13:
                    j = jF;
                    obj = objZ;
                    objH4 = ul2VarB.h(serialDescriptor, 13, NullableString$$serializer.INSTANCE, objH4);
                    i |= 8192;
                    objZ = obj;
                    jF = j;
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 14 */:
                    j = jF;
                    obj = objZ;
                    objH8 = ul2VarB.h(serialDescriptor, 14, NullableString$$serializer.INSTANCE, objH8);
                    i |= 16384;
                    objZ = obj;
                    jF = j;
                    break;
                case 15:
                    j = jF;
                    obj = objZ;
                    objZ3 = ul2VarB.z(serialDescriptor, 15, new by8(mve.a, JsmaDynamicProperty$$serializer.INSTANCE), objZ3);
                    i |= 32768;
                    objZ = obj;
                    jF = j;
                    break;
                default:
                    b0.m(iP);
                    return null;
            }
        }
        long j2 = jF;
        ul2VarB.c(serialDescriptor);
        return new EventPayload.GenericLifecycleEvent.GenericLifecycleEventData(i, (DeviceProperties) objZ, (EventProperties) objZ2, (String) objH5, strO2, jF3, j2, jF2, strO, (NullableString) objH6, (NullableString) objH7, (NullableString) objH3, (NullableString) objH2, (NullableString) objH, (NullableString) objH4, (NullableString) objH8, (Map) objZ3);
    }

    @Override // defpackage.r7e, defpackage.i04
    /* JADX INFO: renamed from: getDescriptor */
    public SerialDescriptor get$$serialDesc() {
        return descriptor;
    }

    @Override // defpackage.r7e
    public void serialize(Encoder encoder, EventPayload.GenericLifecycleEvent.GenericLifecycleEventData value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = get$$serialDesc();
        vl2 vl2VarB = encoder.b(serialDescriptor);
        vl2VarB.y(serialDescriptor, 0, DeviceProperties$$serializer.INSTANCE, value.a);
        vl2VarB.y(serialDescriptor, 1, EventProperties$$serializer.INSTANCE, value.b);
        mve mveVar = mve.a;
        vl2VarB.k(serialDescriptor, 2, mveVar, value.c);
        vl2VarB.x(serialDescriptor, 3, value.d);
        vl2VarB.D(serialDescriptor, 4, value.e);
        vl2VarB.D(serialDescriptor, 5, value.f);
        vl2VarB.D(serialDescriptor, 6, value.g);
        vl2VarB.x(serialDescriptor, 7, value.h);
        NullableString$$serializer nullableString$$serializer = NullableString$$serializer.INSTANCE;
        vl2VarB.k(serialDescriptor, 8, nullableString$$serializer, value.i);
        vl2VarB.k(serialDescriptor, 9, nullableString$$serializer, value.j);
        vl2VarB.k(serialDescriptor, 10, nullableString$$serializer, value.k);
        vl2VarB.k(serialDescriptor, 11, nullableString$$serializer, value.l);
        vl2VarB.k(serialDescriptor, 12, nullableString$$serializer, value.m);
        vl2VarB.k(serialDescriptor, 13, nullableString$$serializer, value.n);
        vl2VarB.k(serialDescriptor, 14, nullableString$$serializer, value.o);
        vl2VarB.y(serialDescriptor, 15, new by8(mveVar, JsmaDynamicProperty$$serializer.INSTANCE), value.p);
        vl2VarB.c(serialDescriptor);
    }

    @Override // defpackage.sw5
    public KSerializer<?>[] typeParametersSerializers() {
        return ypd.V;
    }
}
