package com.indeed.android.jsmappservices.bridge.results;

import defpackage.b0;
import defpackage.mve;
import defpackage.ni1;
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

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/indeed/android/jsmappservices/bridge/results/ViewJobHintResult.$serializer", "Lsw5;", "Lcom/indeed/android/jsmappservices/bridge/results/ViewJobHintResult;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lj6g;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/indeed/android/jsmappservices/bridge/results/ViewJobHintResult;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/indeed/android/jsmappservices/bridge/results/ViewJobHintResult;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "jsmappservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@sy3
public final /* synthetic */ class ViewJobHintResult$$serializer implements sw5<ViewJobHintResult> {
    public static final int $stable;
    public static final ViewJobHintResult$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ViewJobHintResult$$serializer viewJobHintResult$$serializer = new ViewJobHintResult$$serializer();
        INSTANCE = viewJobHintResult$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.jsmappservices.bridge.results.ViewJobHintResult", viewJobHintResult$$serializer, 6);
        pluginGeneratedSerialDescriptor.k("isSaved", true);
        pluginGeneratedSerialDescriptor.k("title", true);
        pluginGeneratedSerialDescriptor.k("isFromAce", true);
        pluginGeneratedSerialDescriptor.k("jobResultTrackingKey", true);
        pluginGeneratedSerialDescriptor.k("isDisliked", true);
        pluginGeneratedSerialDescriptor.k("matchFactor", true);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    private ViewJobHintResult$$serializer() {
    }

    @Override // defpackage.sw5
    public final KSerializer<?>[] childSerializers() {
        ni1 ni1Var = ni1.a;
        KSerializer<?> kSerializerB = qp1.b(ni1Var);
        mve mveVar = mve.a;
        return new KSerializer[]{kSerializerB, qp1.b(mveVar), qp1.b(ni1Var), qp1.b(mveVar), qp1.b(ni1Var), qp1.b(mveVar)};
    }

    @Override // defpackage.i04
    public final ViewJobHintResult deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ul2 ul2VarB = decoder.b(serialDescriptor);
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        String str = null;
        Boolean bool2 = null;
        String str2 = null;
        Boolean bool3 = null;
        String str3 = null;
        while (z) {
            int iP = ul2VarB.p(serialDescriptor);
            switch (iP) {
                case -1:
                    z = false;
                    break;
                case 0:
                    bool = (Boolean) ul2VarB.h(serialDescriptor, 0, ni1.a, bool);
                    i |= 1;
                    break;
                case 1:
                    str = (String) ul2VarB.h(serialDescriptor, 1, mve.a, str);
                    i |= 2;
                    break;
                case 2:
                    bool2 = (Boolean) ul2VarB.h(serialDescriptor, 2, ni1.a, bool2);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) ul2VarB.h(serialDescriptor, 3, mve.a, str2);
                    i |= 8;
                    break;
                case 4:
                    bool3 = (Boolean) ul2VarB.h(serialDescriptor, 4, ni1.a, bool3);
                    i |= 16;
                    break;
                case 5:
                    str3 = (String) ul2VarB.h(serialDescriptor, 5, mve.a, str3);
                    i |= 32;
                    break;
                default:
                    b0.m(iP);
                    return null;
            }
        }
        ul2VarB.c(serialDescriptor);
        return new ViewJobHintResult(i, bool, str, bool2, str2, bool3, str3);
    }

    @Override // defpackage.r7e, defpackage.i04
    /* JADX INFO: renamed from: getDescriptor */
    public final SerialDescriptor get$$serialDesc() {
        return descriptor;
    }

    @Override // defpackage.r7e
    public final void serialize(Encoder encoder, ViewJobHintResult value) {
        encoder.getClass();
        value.getClass();
        String str = value.g;
        Boolean bool = value.f;
        String str2 = value.e;
        Boolean bool2 = value.d;
        String str3 = value.c;
        Boolean bool3 = value.b;
        SerialDescriptor serialDescriptor = descriptor;
        vl2 vl2VarB = encoder.b(serialDescriptor);
        if (vl2VarB.m(serialDescriptor) || bool3 != null) {
            vl2VarB.k(serialDescriptor, 0, ni1.a, bool3);
        }
        if (vl2VarB.m(serialDescriptor) || str3 != null) {
            vl2VarB.k(serialDescriptor, 1, mve.a, str3);
        }
        if (vl2VarB.m(serialDescriptor) || bool2 != null) {
            vl2VarB.k(serialDescriptor, 2, ni1.a, bool2);
        }
        if (vl2VarB.m(serialDescriptor) || str2 != null) {
            vl2VarB.k(serialDescriptor, 3, mve.a, str2);
        }
        if (vl2VarB.m(serialDescriptor) || bool != null) {
            vl2VarB.k(serialDescriptor, 4, ni1.a, bool);
        }
        if (vl2VarB.m(serialDescriptor) || str != null) {
            vl2VarB.k(serialDescriptor, 5, mve.a, str);
        }
        vl2VarB.c(serialDescriptor);
    }

    @Override // defpackage.sw5
    public KSerializer<?>[] typeParametersSerializers() {
        return ypd.V;
    }
}
