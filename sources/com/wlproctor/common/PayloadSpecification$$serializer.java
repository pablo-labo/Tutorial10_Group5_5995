package com.wlproctor.common;

import com.wlproctor.common.PayloadSpecification;
import defpackage.aw4;
import defpackage.b0;
import defpackage.bs4;
import defpackage.by8;
import defpackage.mve;
import defpackage.sw5;
import defpackage.sy3;
import defpackage.ul2;
import defpackage.vl2;
import defpackage.wl7;
import defpackage.ypd;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/wlproctor/common/PayloadSpecification.$serializer", "Lsw5;", "Lcom/wlproctor/common/PayloadSpecification;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/wlproctor/common/PayloadSpecification;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lj6g;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/wlproctor/common/PayloadSpecification;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "wlproctor-consumer_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@sy3
public final class PayloadSpecification$$serializer implements sw5<PayloadSpecification> {
    public static final PayloadSpecification$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        PayloadSpecification$$serializer payloadSpecification$$serializer = new PayloadSpecification$$serializer();
        INSTANCE = payloadSpecification$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.wlproctor.common.PayloadSpecification", payloadSpecification$$serializer, 2);
        pluginGeneratedSerialDescriptor.k("type", false);
        pluginGeneratedSerialDescriptor.k("schema", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PayloadSpecification$$serializer() {
    }

    @Override // defpackage.sw5
    public KSerializer<?>[] childSerializers() {
        aw4 aw4Var = new aw4(PayloadSpecification.a.values(), "com.wlproctor.common.PayloadSpecification.Type");
        mve mveVar = mve.a;
        return new KSerializer[]{aw4Var, new by8(mveVar, mveVar)};
    }

    @Override // defpackage.i04
    public PayloadSpecification deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = get$$serialDesc();
        ul2 ul2VarB = decoder.b(serialDescriptor);
        boolean z = true;
        int i = 0;
        Object objZ = null;
        Object objZ2 = null;
        while (z) {
            int iP = ul2VarB.p(serialDescriptor);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                objZ = ul2VarB.z(serialDescriptor, 0, new aw4(PayloadSpecification.a.values(), "com.wlproctor.common.PayloadSpecification.Type"), objZ);
                i |= 1;
            } else {
                if (iP != 1) {
                    b0.m(iP);
                    return null;
                }
                mve mveVar = mve.a;
                objZ2 = ul2VarB.z(serialDescriptor, 1, new by8(mveVar, mveVar), objZ2);
                i |= 2;
            }
        }
        ul2VarB.c(serialDescriptor);
        return new PayloadSpecification(i, (PayloadSpecification.a) objZ, (Map) objZ2);
    }

    @Override // defpackage.r7e, defpackage.i04
    /* JADX INFO: renamed from: getDescriptor */
    public SerialDescriptor get$$serialDesc() {
        return descriptor;
    }

    @Override // defpackage.r7e
    public void serialize(Encoder encoder, PayloadSpecification value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = get$$serialDesc();
        vl2 vl2VarB = encoder.b(serialDescriptor);
        Map<String, String> map = value.b;
        vl2VarB.y(serialDescriptor, 0, new aw4(PayloadSpecification.a.values(), "com.wlproctor.common.PayloadSpecification.Type"), value.a);
        if (vl2VarB.m(serialDescriptor) || !wl7.b(map, bs4.a)) {
            mve mveVar = mve.a;
            vl2VarB.y(serialDescriptor, 1, new by8(mveVar, mveVar), map);
        }
        vl2VarB.c(serialDescriptor);
    }

    @Override // defpackage.sw5
    public KSerializer<?>[] typeParametersSerializers() {
        return ypd.V;
    }
}
