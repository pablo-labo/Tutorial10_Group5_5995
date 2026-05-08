package com.infra.eventlogger.model;

import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.datadog.android.rum.internal.domain.scope.RumSessionScope;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.infra.eventlogger.model.avro.NullableString;
import com.infra.eventlogger.model.avro.NullableString$$serializer;
import defpackage.aw4;
import defpackage.b0;
import defpackage.bna;
import defpackage.gt0;
import defpackage.mve;
import defpackage.p59;
import defpackage.qp1;
import defpackage.rh7;
import defpackage.sw5;
import defpackage.sy3;
import defpackage.ul2;
import defpackage.vk0;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/infra/eventlogger/model/EventProperties.$serializer", "Lsw5;", "Lcom/infra/eventlogger/model/EventProperties;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/infra/eventlogger/model/EventProperties;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lj6g;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/infra/eventlogger/model/EventProperties;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@sy3
public final class EventProperties$$serializer implements sw5<EventProperties> {
    public static final EventProperties$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        EventProperties$$serializer eventProperties$$serializer = new EventProperties$$serializer();
        INSTANCE = eventProperties$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.infra.eventlogger.model.EventProperties", eventProperties$$serializer, 20);
        pluginGeneratedSerialDescriptor.k("appId", false);
        pluginGeneratedSerialDescriptor.k("appVersion", false);
        pluginGeneratedSerialDescriptor.k("appBuildNum", false);
        pluginGeneratedSerialDescriptor.k("appVariant", false);
        pluginGeneratedSerialDescriptor.k("appEnvironment", false);
        pluginGeneratedSerialDescriptor.k("appCountry", false);
        pluginGeneratedSerialDescriptor.k("ipCountry", false);
        pluginGeneratedSerialDescriptor.k("osVersion", false);
        pluginGeneratedSerialDescriptor.k("clientEventId", false);
        pluginGeneratedSerialDescriptor.k("appInstallId", false);
        pluginGeneratedSerialDescriptor.k("appSessionId", false);
        pluginGeneratedSerialDescriptor.k(RumSessionScope.RUM_SESSION_ID_BUS_MESSAGE_KEY, false);
        pluginGeneratedSerialDescriptor.k("clientCreatedTimestamp", false);
        pluginGeneratedSerialDescriptor.k("groups", false);
        pluginGeneratedSerialDescriptor.k("accountId", false);
        pluginGeneratedSerialDescriptor.k("ctk", false);
        pluginGeneratedSerialDescriptor.k("deviceId", false);
        pluginGeneratedSerialDescriptor.k("userLocale", false);
        pluginGeneratedSerialDescriptor.k("deviceOrientation", false);
        pluginGeneratedSerialDescriptor.k("secondaryAccountId", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private EventProperties$$serializer() {
    }

    @Override // defpackage.sw5
    public KSerializer<?>[] childSerializers() {
        aw4 aw4Var = new aw4(vk0.values(), "com.infra.eventlogger.config.AppIdentifier");
        mve mveVar = mve.a;
        NullableString$$serializer nullableString$$serializer = NullableString$$serializer.INSTANCE;
        return new KSerializer[]{aw4Var, mveVar, rh7.a, mveVar, mveVar, qp1.b(nullableString$$serializer), qp1.b(nullableString$$serializer), qp1.b(nullableString$$serializer), mveVar, mveVar, mveVar, mveVar, p59.a, new gt0(mveVar, 0), qp1.b(nullableString$$serializer), qp1.b(nullableString$$serializer), qp1.b(nullableString$$serializer), qp1.b(nullableString$$serializer), new aw4(bna.values(), "com.infra.eventlogger.model.ORIENTATION"), qp1.b(nullableString$$serializer)};
    }

    @Override // defpackage.i04
    public EventProperties deserialize(Decoder decoder) {
        String str;
        Object obj;
        String str2;
        String str3;
        String str4;
        int i;
        decoder.getClass();
        SerialDescriptor serialDescriptor = get$$serialDesc();
        ul2 ul2VarB = decoder.b(serialDescriptor);
        long jF = 0;
        Object objH = null;
        Object objH2 = null;
        Object objH3 = null;
        Object objH4 = null;
        Object objZ = null;
        Object objH5 = null;
        int i2 = 0;
        Object objH6 = null;
        Object objZ2 = null;
        Object objH7 = null;
        String strO = null;
        String strO2 = null;
        Object objH8 = null;
        Object objZ3 = null;
        String strO3 = null;
        String strO4 = null;
        String strO5 = null;
        String strO6 = null;
        boolean z = true;
        String strO7 = null;
        int iM = 0;
        while (z) {
            int iP = ul2VarB.p(serialDescriptor);
            switch (iP) {
                case -1:
                    str = strO2;
                    z = false;
                    strO2 = str;
                    break;
                case 0:
                    obj = objH7;
                    str2 = strO;
                    str3 = strO2;
                    objZ = ul2VarB.z(serialDescriptor, 0, new aw4(vk0.values(), "com.infra.eventlogger.config.AppIdentifier"), objZ);
                    i2 |= 1;
                    strO = str2;
                    strO2 = str3;
                    objH7 = obj;
                    break;
                case 1:
                    obj = objH7;
                    strO7 = ul2VarB.o(serialDescriptor, 1);
                    i2 |= 2;
                    objH7 = obj;
                    break;
                case 2:
                    obj = objH7;
                    iM = ul2VarB.m(serialDescriptor, 2);
                    i2 |= 4;
                    objH7 = obj;
                    break;
                case 3:
                    obj = objH7;
                    strO = ul2VarB.o(serialDescriptor, 3);
                    i2 |= 8;
                    objH7 = obj;
                    break;
                case 4:
                    obj = objH7;
                    strO2 = ul2VarB.o(serialDescriptor, 4);
                    i2 |= 16;
                    objH7 = obj;
                    break;
                case 5:
                    obj = objH7;
                    str4 = strO;
                    objH5 = ul2VarB.h(serialDescriptor, 5, NullableString$$serializer.INSTANCE, objH5);
                    i2 |= 32;
                    strO = str4;
                    objH7 = obj;
                    break;
                case 6:
                    obj = objH7;
                    str4 = strO;
                    objH6 = ul2VarB.h(serialDescriptor, 6, NullableString$$serializer.INSTANCE, objH6);
                    i2 |= 64;
                    strO = str4;
                    objH7 = obj;
                    break;
                case 7:
                    obj = objH7;
                    str4 = strO;
                    objH8 = ul2VarB.h(serialDescriptor, 7, NullableString$$serializer.INSTANCE, objH8);
                    i2 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                    strO = str4;
                    objH7 = obj;
                    break;
                case 8:
                    obj = objH7;
                    strO3 = ul2VarB.o(serialDescriptor, 8);
                    i2 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                    objH7 = obj;
                    break;
                case DatadogLogGenerator.CRASH /* 9 */:
                    obj = objH7;
                    strO4 = ul2VarB.o(serialDescriptor, 9);
                    i2 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                    objH7 = obj;
                    break;
                case 10:
                    obj = objH7;
                    strO5 = ul2VarB.o(serialDescriptor, 10);
                    i2 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                    objH7 = obj;
                    break;
                case 11:
                    obj = objH7;
                    strO6 = ul2VarB.o(serialDescriptor, 11);
                    i2 |= 2048;
                    objH7 = obj;
                    break;
                case 12:
                    obj = objH7;
                    jF = ul2VarB.f(serialDescriptor, 12);
                    i2 |= 4096;
                    objH7 = obj;
                    break;
                case 13:
                    obj = objH7;
                    str2 = strO;
                    str3 = strO2;
                    objZ3 = ul2VarB.z(serialDescriptor, 13, new gt0(mve.a, 0), objZ3);
                    i2 |= 8192;
                    strO = str2;
                    strO2 = str3;
                    objH7 = obj;
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 14 */:
                    obj = objH7;
                    str4 = strO;
                    objH3 = ul2VarB.h(serialDescriptor, 14, NullableString$$serializer.INSTANCE, objH3);
                    i2 |= 16384;
                    strO = str4;
                    objH7 = obj;
                    break;
                case 15:
                    obj = objH7;
                    str4 = strO;
                    objH = ul2VarB.h(serialDescriptor, 15, NullableString$$serializer.INSTANCE, objH);
                    i = 32768;
                    i2 |= i;
                    strO = str4;
                    objH7 = obj;
                    break;
                case 16:
                    obj = objH7;
                    str4 = strO;
                    objH2 = ul2VarB.h(serialDescriptor, 16, NullableString$$serializer.INSTANCE, objH2);
                    i = 65536;
                    i2 |= i;
                    strO = str4;
                    objH7 = obj;
                    break;
                case 17:
                    obj = objH7;
                    str4 = strO;
                    objH4 = ul2VarB.h(serialDescriptor, 17, NullableString$$serializer.INSTANCE, objH4);
                    i = 131072;
                    i2 |= i;
                    strO = str4;
                    objH7 = obj;
                    break;
                case 18:
                    str2 = strO;
                    str3 = strO2;
                    obj = objH7;
                    objZ2 = ul2VarB.z(serialDescriptor, 18, new aw4(bna.values(), "com.infra.eventlogger.model.ORIENTATION"), objZ2);
                    i2 |= 262144;
                    strO = str2;
                    strO2 = str3;
                    objH7 = obj;
                    break;
                case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                    str = strO2;
                    objH7 = ul2VarB.h(serialDescriptor, 19, NullableString$$serializer.INSTANCE, objH7);
                    i2 |= 524288;
                    strO = strO;
                    strO2 = str;
                    break;
                default:
                    b0.m(iP);
                    return null;
            }
        }
        ul2VarB.c(serialDescriptor);
        return new EventProperties(i2, (vk0) objZ, strO7, iM, strO, strO2, (NullableString) objH5, (NullableString) objH6, (NullableString) objH8, strO3, strO4, strO5, strO6, jF, (List) objZ3, (NullableString) objH3, (NullableString) objH, (NullableString) objH2, (NullableString) objH4, (bna) objZ2, (NullableString) objH7);
    }

    @Override // defpackage.r7e, defpackage.i04
    /* JADX INFO: renamed from: getDescriptor */
    public SerialDescriptor get$$serialDesc() {
        return descriptor;
    }

    @Override // defpackage.r7e
    public void serialize(Encoder encoder, EventProperties value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = get$$serialDesc();
        vl2 vl2VarB = encoder.b(serialDescriptor);
        vl2VarB.y(serialDescriptor, 0, new aw4(vk0.values(), "com.infra.eventlogger.config.AppIdentifier"), value.a);
        vl2VarB.x(serialDescriptor, 1, value.b);
        vl2VarB.r(2, value.c, serialDescriptor);
        vl2VarB.x(serialDescriptor, 3, value.d);
        vl2VarB.x(serialDescriptor, 4, value.e);
        NullableString$$serializer nullableString$$serializer = NullableString$$serializer.INSTANCE;
        vl2VarB.k(serialDescriptor, 5, nullableString$$serializer, value.f);
        vl2VarB.k(serialDescriptor, 6, nullableString$$serializer, value.g);
        vl2VarB.k(serialDescriptor, 7, nullableString$$serializer, value.h);
        vl2VarB.x(serialDescriptor, 8, value.i);
        vl2VarB.x(serialDescriptor, 9, value.j);
        vl2VarB.x(serialDescriptor, 10, value.k);
        vl2VarB.x(serialDescriptor, 11, value.l);
        vl2VarB.D(serialDescriptor, 12, value.m);
        vl2VarB.y(serialDescriptor, 13, new gt0(mve.a, 0), value.n);
        vl2VarB.k(serialDescriptor, 14, nullableString$$serializer, value.o);
        vl2VarB.k(serialDescriptor, 15, nullableString$$serializer, value.p);
        vl2VarB.k(serialDescriptor, 16, nullableString$$serializer, value.q);
        vl2VarB.k(serialDescriptor, 17, nullableString$$serializer, value.r);
        vl2VarB.y(serialDescriptor, 18, new aw4(bna.values(), "com.infra.eventlogger.model.ORIENTATION"), value.s);
        vl2VarB.k(serialDescriptor, 19, nullableString$$serializer, value.t);
        vl2VarB.c(serialDescriptor);
    }

    @Override // defpackage.sw5
    public KSerializer<?>[] typeParametersSerializers() {
        return ypd.V;
    }
}
