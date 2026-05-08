package com.infra.eventlogger.model;

import com.datadog.android.ndk.internal.NdkCrashLog;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.infra.eventlogger.model.EventPayload;
import com.infra.eventlogger.model.avro.NullableLong;
import com.infra.eventlogger.model.avro.NullableLong$$serializer;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/infra/eventlogger/model/EventPayload.HttpErrorEvent.HttpResponseDebug.$serializer", "Lsw5;", "Lcom/infra/eventlogger/model/EventPayload$HttpErrorEvent$HttpResponseDebug;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/infra/eventlogger/model/EventPayload$HttpErrorEvent$HttpResponseDebug;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lj6g;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/infra/eventlogger/model/EventPayload$HttpErrorEvent$HttpResponseDebug;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@sy3
public final class EventPayload$HttpErrorEvent$HttpResponseDebug$$serializer implements sw5<EventPayload.HttpErrorEvent.HttpResponseDebug> {
    public static final EventPayload$HttpErrorEvent$HttpResponseDebug$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        EventPayload$HttpErrorEvent$HttpResponseDebug$$serializer eventPayload$HttpErrorEvent$HttpResponseDebug$$serializer = new EventPayload$HttpErrorEvent$HttpResponseDebug$$serializer();
        INSTANCE = eventPayload$HttpErrorEvent$HttpResponseDebug$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.infra.eventlogger.model.EventPayload.HttpErrorEvent.HttpResponseDebug", eventPayload$HttpErrorEvent$HttpResponseDebug$$serializer, 9);
        pluginGeneratedSerialDescriptor.k(NdkCrashLog.TIMESTAMP_KEY_NAME, false);
        pluginGeneratedSerialDescriptor.k("headerLength", false);
        pluginGeneratedSerialDescriptor.k("contentLength", false);
        pluginGeneratedSerialDescriptor.k("contentType", false);
        pluginGeneratedSerialDescriptor.k("setCookiesLength", false);
        pluginGeneratedSerialDescriptor.k("statusCode", false);
        pluginGeneratedSerialDescriptor.k("errDomain", false);
        pluginGeneratedSerialDescriptor.k("errCode", false);
        pluginGeneratedSerialDescriptor.k("urlType", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private EventPayload$HttpErrorEvent$HttpResponseDebug$$serializer() {
    }

    @Override // defpackage.sw5
    public KSerializer<?>[] childSerializers() {
        NullableString$$serializer nullableString$$serializer = NullableString$$serializer.INSTANCE;
        KSerializer<?> kSerializerB = qp1.b(nullableString$$serializer);
        KSerializer<?> kSerializerB2 = qp1.b(NullableLong$$serializer.INSTANCE);
        KSerializer<?> kSerializerB3 = qp1.b(nullableString$$serializer);
        p59 p59Var = p59.a;
        return new KSerializer[]{p59Var, p59Var, p59Var, mve.a, p59Var, p59Var, kSerializerB, kSerializerB2, kSerializerB3};
    }

    @Override // defpackage.i04
    public EventPayload.HttpErrorEvent.HttpResponseDebug deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = get$$serialDesc();
        ul2 ul2VarB = decoder.b(serialDescriptor);
        EventPayload.HttpErrorEvent.HttpResponseDebug httpResponseDebug = null;
        long jF = 0;
        long jF2 = 0;
        long jF3 = 0;
        long jF4 = 0;
        long jF5 = 0;
        Object objH = null;
        Object objH2 = null;
        Object objH3 = null;
        String strO = null;
        int i = 0;
        boolean z = true;
        while (z) {
            int iP = ul2VarB.p(serialDescriptor);
            switch (iP) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    jF = ul2VarB.f(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    jF2 = ul2VarB.f(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    jF3 = ul2VarB.f(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    strO = ul2VarB.o(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    jF4 = ul2VarB.f(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    jF5 = ul2VarB.f(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    objH = ul2VarB.h(serialDescriptor, 6, NullableString$$serializer.INSTANCE, objH);
                    i |= 64;
                    break;
                case 7:
                    objH2 = ul2VarB.h(serialDescriptor, 7, NullableLong$$serializer.INSTANCE, objH2);
                    i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                    break;
                case 8:
                    objH3 = ul2VarB.h(serialDescriptor, 8, NullableString$$serializer.INSTANCE, objH3);
                    i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                    break;
                default:
                    b0.m(iP);
                    return httpResponseDebug;
            }
            httpResponseDebug = null;
        }
        ul2VarB.c(serialDescriptor);
        return new EventPayload.HttpErrorEvent.HttpResponseDebug(i, jF, jF2, jF3, strO, jF4, jF5, (NullableString) objH, (NullableLong) objH2, (NullableString) objH3);
    }

    @Override // defpackage.r7e, defpackage.i04
    /* JADX INFO: renamed from: getDescriptor */
    public SerialDescriptor get$$serialDesc() {
        return descriptor;
    }

    @Override // defpackage.r7e
    public void serialize(Encoder encoder, EventPayload.HttpErrorEvent.HttpResponseDebug value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = get$$serialDesc();
        vl2 vl2VarB = encoder.b(serialDescriptor);
        vl2VarB.D(serialDescriptor, 0, value.a);
        vl2VarB.D(serialDescriptor, 1, value.b);
        vl2VarB.D(serialDescriptor, 2, value.c);
        vl2VarB.x(serialDescriptor, 3, value.d);
        vl2VarB.D(serialDescriptor, 4, value.e);
        vl2VarB.D(serialDescriptor, 5, value.f);
        NullableString$$serializer nullableString$$serializer = NullableString$$serializer.INSTANCE;
        vl2VarB.k(serialDescriptor, 6, nullableString$$serializer, value.g);
        vl2VarB.k(serialDescriptor, 7, NullableLong$$serializer.INSTANCE, value.h);
        vl2VarB.k(serialDescriptor, 8, nullableString$$serializer, value.i);
        vl2VarB.c(serialDescriptor);
    }

    @Override // defpackage.sw5
    public KSerializer<?>[] typeParametersSerializers() {
        return ypd.V;
    }
}
