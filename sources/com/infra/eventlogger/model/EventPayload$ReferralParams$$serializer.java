package com.infra.eventlogger.model;

import com.datadog.android.log.LogAttributes;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.infra.eventlogger.model.EventPayload;
import com.infra.eventlogger.model.avro.NullableString;
import com.infra.eventlogger.model.avro.NullableString$$serializer;
import defpackage.b0;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/infra/eventlogger/model/EventPayload.ReferralParams.$serializer", "Lsw5;", "Lcom/infra/eventlogger/model/EventPayload$ReferralParams;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/infra/eventlogger/model/EventPayload$ReferralParams;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lj6g;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/infra/eventlogger/model/EventPayload$ReferralParams;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "EventLogger_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@sy3
public final class EventPayload$ReferralParams$$serializer implements sw5<EventPayload.ReferralParams> {
    public static final EventPayload$ReferralParams$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        EventPayload$ReferralParams$$serializer eventPayload$ReferralParams$$serializer = new EventPayload$ReferralParams$$serializer();
        INSTANCE = eventPayload$ReferralParams$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.infra.eventlogger.model.EventPayload.ReferralParams", eventPayload$ReferralParams$$serializer, 14);
        pluginGeneratedSerialDescriptor.k("affiliateKey", false);
        pluginGeneratedSerialDescriptor.k("keywords", false);
        pluginGeneratedSerialDescriptor.k("newCookieValue", false);
        pluginGeneratedSerialDescriptor.k("referrer", false);
        pluginGeneratedSerialDescriptor.k(LogAttributes.HOST, false);
        pluginGeneratedSerialDescriptor.k("refType", false);
        pluginGeneratedSerialDescriptor.k("refTime", false);
        pluginGeneratedSerialDescriptor.k("reqAffiliateKey", false);
        pluginGeneratedSerialDescriptor.k("reqKeywords", false);
        pluginGeneratedSerialDescriptor.k("reqRefType", false);
        pluginGeneratedSerialDescriptor.k("from", false);
        pluginGeneratedSerialDescriptor.k("fbclid", false);
        pluginGeneratedSerialDescriptor.k("gclid", false);
        pluginGeneratedSerialDescriptor.k("utm_source", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private EventPayload$ReferralParams$$serializer() {
    }

    @Override // defpackage.sw5
    public KSerializer<?>[] childSerializers() {
        NullableString$$serializer nullableString$$serializer = NullableString$$serializer.INSTANCE;
        return new KSerializer[]{qp1.b(nullableString$$serializer), qp1.b(nullableString$$serializer), qp1.b(nullableString$$serializer), qp1.b(nullableString$$serializer), qp1.b(nullableString$$serializer), qp1.b(nullableString$$serializer), qp1.b(nullableString$$serializer), qp1.b(nullableString$$serializer), qp1.b(nullableString$$serializer), qp1.b(nullableString$$serializer), qp1.b(nullableString$$serializer), qp1.b(nullableString$$serializer), qp1.b(nullableString$$serializer), qp1.b(nullableString$$serializer)};
    }

    @Override // defpackage.i04
    public EventPayload.ReferralParams deserialize(Decoder decoder) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object objH;
        Object obj5;
        decoder.getClass();
        SerialDescriptor serialDescriptor = get$$serialDesc();
        ul2 ul2VarB = decoder.b(serialDescriptor);
        Object objH2 = null;
        Object objH3 = null;
        Object objH4 = null;
        Object objH5 = null;
        Object objH6 = null;
        int i = 0;
        Object objH7 = null;
        Object objH8 = null;
        Object objH9 = null;
        Object objH10 = null;
        Object objH11 = null;
        Object objH12 = null;
        Object objH13 = null;
        Object objH14 = null;
        boolean z = true;
        Object obj6 = null;
        while (z) {
            int iP = ul2VarB.p(serialDescriptor);
            switch (iP) {
                case -1:
                    obj3 = objH2;
                    obj4 = objH8;
                    objH = obj6;
                    obj5 = objH3;
                    z = false;
                    objH3 = obj5;
                    objH8 = obj4;
                    obj6 = objH;
                    objH2 = obj3;
                    break;
                case 0:
                    obj3 = objH2;
                    obj4 = objH8;
                    Object obj7 = obj6;
                    obj5 = objH3;
                    objH = ul2VarB.h(serialDescriptor, 0, NullableString$$serializer.INSTANCE, obj7);
                    i |= 1;
                    objH7 = objH7;
                    objH3 = obj5;
                    objH8 = obj4;
                    obj6 = objH;
                    objH2 = obj3;
                    break;
                case 1:
                    obj3 = objH2;
                    objH7 = ul2VarB.h(serialDescriptor, 1, NullableString$$serializer.INSTANCE, objH7);
                    i |= 2;
                    objH8 = objH8;
                    objH2 = obj3;
                    break;
                case 2:
                    obj3 = objH2;
                    objH8 = ul2VarB.h(serialDescriptor, 2, NullableString$$serializer.INSTANCE, objH8);
                    i |= 4;
                    objH7 = objH7;
                    objH2 = obj3;
                    break;
                case 3:
                    obj = objH7;
                    obj2 = objH8;
                    objH9 = ul2VarB.h(serialDescriptor, 3, NullableString$$serializer.INSTANCE, objH9);
                    i |= 8;
                    objH7 = obj;
                    objH8 = obj2;
                    break;
                case 4:
                    obj = objH7;
                    obj2 = objH8;
                    objH10 = ul2VarB.h(serialDescriptor, 4, NullableString$$serializer.INSTANCE, objH10);
                    i |= 16;
                    objH7 = obj;
                    objH8 = obj2;
                    break;
                case 5:
                    obj = objH7;
                    obj2 = objH8;
                    objH11 = ul2VarB.h(serialDescriptor, 5, NullableString$$serializer.INSTANCE, objH11);
                    i |= 32;
                    objH7 = obj;
                    objH8 = obj2;
                    break;
                case 6:
                    obj = objH7;
                    obj2 = objH8;
                    objH12 = ul2VarB.h(serialDescriptor, 6, NullableString$$serializer.INSTANCE, objH12);
                    i |= 64;
                    objH7 = obj;
                    objH8 = obj2;
                    break;
                case 7:
                    obj = objH7;
                    obj2 = objH8;
                    objH13 = ul2VarB.h(serialDescriptor, 7, NullableString$$serializer.INSTANCE, objH13);
                    i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                    objH7 = obj;
                    objH8 = obj2;
                    break;
                case 8:
                    obj = objH7;
                    obj2 = objH8;
                    objH14 = ul2VarB.h(serialDescriptor, 8, NullableString$$serializer.INSTANCE, objH14);
                    i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                    objH7 = obj;
                    objH8 = obj2;
                    break;
                case DatadogLogGenerator.CRASH /* 9 */:
                    obj = objH7;
                    obj2 = objH8;
                    objH4 = ul2VarB.h(serialDescriptor, 9, NullableString$$serializer.INSTANCE, objH4);
                    i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                    objH7 = obj;
                    objH8 = obj2;
                    break;
                case 10:
                    obj = objH7;
                    obj2 = objH8;
                    objH3 = ul2VarB.h(serialDescriptor, 10, NullableString$$serializer.INSTANCE, objH3);
                    i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                    objH7 = obj;
                    objH8 = obj2;
                    break;
                case 11:
                    obj = objH7;
                    obj2 = objH8;
                    objH2 = ul2VarB.h(serialDescriptor, 11, NullableString$$serializer.INSTANCE, objH2);
                    i |= 2048;
                    objH7 = obj;
                    objH8 = obj2;
                    break;
                case 12:
                    obj = objH7;
                    obj2 = objH8;
                    objH5 = ul2VarB.h(serialDescriptor, 12, NullableString$$serializer.INSTANCE, objH5);
                    i |= 4096;
                    objH7 = obj;
                    objH8 = obj2;
                    break;
                case 13:
                    obj = objH7;
                    obj2 = objH8;
                    objH6 = ul2VarB.h(serialDescriptor, 13, NullableString$$serializer.INSTANCE, objH6);
                    i |= 8192;
                    objH7 = obj;
                    objH8 = obj2;
                    break;
                default:
                    b0.m(iP);
                    return null;
            }
        }
        Object obj8 = objH2;
        Object obj9 = objH8;
        Object obj10 = obj6;
        Object obj11 = objH7;
        ul2VarB.c(serialDescriptor);
        return new EventPayload.ReferralParams(i, (NullableString) obj10, (NullableString) obj11, (NullableString) obj9, (NullableString) objH9, (NullableString) objH10, (NullableString) objH11, (NullableString) objH12, (NullableString) objH13, (NullableString) objH14, (NullableString) objH4, (NullableString) objH3, (NullableString) obj8, (NullableString) objH5, (NullableString) objH6);
    }

    @Override // defpackage.r7e, defpackage.i04
    /* JADX INFO: renamed from: getDescriptor */
    public SerialDescriptor get$$serialDesc() {
        return descriptor;
    }

    @Override // defpackage.r7e
    public void serialize(Encoder encoder, EventPayload.ReferralParams value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = get$$serialDesc();
        vl2 vl2VarB = encoder.b(serialDescriptor);
        NullableString$$serializer nullableString$$serializer = NullableString$$serializer.INSTANCE;
        vl2VarB.k(serialDescriptor, 0, nullableString$$serializer, value.a);
        vl2VarB.k(serialDescriptor, 1, nullableString$$serializer, value.b);
        vl2VarB.k(serialDescriptor, 2, nullableString$$serializer, value.c);
        vl2VarB.k(serialDescriptor, 3, nullableString$$serializer, value.d);
        vl2VarB.k(serialDescriptor, 4, nullableString$$serializer, value.e);
        vl2VarB.k(serialDescriptor, 5, nullableString$$serializer, value.f);
        vl2VarB.k(serialDescriptor, 6, nullableString$$serializer, value.g);
        vl2VarB.k(serialDescriptor, 7, nullableString$$serializer, value.h);
        vl2VarB.k(serialDescriptor, 8, nullableString$$serializer, value.i);
        vl2VarB.k(serialDescriptor, 9, nullableString$$serializer, value.j);
        vl2VarB.k(serialDescriptor, 10, nullableString$$serializer, value.k);
        vl2VarB.k(serialDescriptor, 11, nullableString$$serializer, value.l);
        vl2VarB.k(serialDescriptor, 12, nullableString$$serializer, value.m);
        vl2VarB.k(serialDescriptor, 13, nullableString$$serializer, value.n);
        vl2VarB.c(serialDescriptor);
    }

    @Override // defpackage.sw5
    public KSerializer<?>[] typeParametersSerializers() {
        return ypd.V;
    }
}
