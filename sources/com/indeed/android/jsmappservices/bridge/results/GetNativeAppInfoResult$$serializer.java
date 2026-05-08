package com.indeed.android.jsmappservices.bridge.results;

import com.datadog.android.rum.internal.domain.scope.RumSessionScope;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.b0;
import defpackage.mve;
import defpackage.rh7;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/indeed/android/jsmappservices/bridge/results/GetNativeAppInfoResult.$serializer", "Lsw5;", "Lcom/indeed/android/jsmappservices/bridge/results/GetNativeAppInfoResult;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lj6g;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/indeed/android/jsmappservices/bridge/results/GetNativeAppInfoResult;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/indeed/android/jsmappservices/bridge/results/GetNativeAppInfoResult;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "jsmappservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@sy3
public final /* synthetic */ class GetNativeAppInfoResult$$serializer implements sw5<GetNativeAppInfoResult> {
    public static final int $stable;
    public static final GetNativeAppInfoResult$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        GetNativeAppInfoResult$$serializer getNativeAppInfoResult$$serializer = new GetNativeAppInfoResult$$serializer();
        INSTANCE = getNativeAppInfoResult$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.jsmappservices.bridge.results.GetNativeAppInfoResult", getNativeAppInfoResult$$serializer, 8);
        pluginGeneratedSerialDescriptor.k("platform", false);
        pluginGeneratedSerialDescriptor.k("osVersion", false);
        pluginGeneratedSerialDescriptor.k("appVersion", false);
        pluginGeneratedSerialDescriptor.k("appBuildNumber", false);
        pluginGeneratedSerialDescriptor.k("environment", false);
        pluginGeneratedSerialDescriptor.k("buildType", false);
        pluginGeneratedSerialDescriptor.k("appSessionId", false);
        pluginGeneratedSerialDescriptor.k(RumSessionScope.RUM_SESSION_ID_BUS_MESSAGE_KEY, false);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    private GetNativeAppInfoResult$$serializer() {
    }

    @Override // defpackage.sw5
    public final KSerializer<?>[] childSerializers() {
        mve mveVar = mve.a;
        return new KSerializer[]{mveVar, mveVar, mveVar, rh7.a, mveVar, mveVar, mveVar, mveVar};
    }

    @Override // defpackage.i04
    public final GetNativeAppInfoResult deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ul2 ul2VarB = decoder.b(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iM = 0;
        String strO = null;
        String strO2 = null;
        String strO3 = null;
        String strO4 = null;
        String strO5 = null;
        String strO6 = null;
        String strO7 = null;
        while (z) {
            int iP = ul2VarB.p(serialDescriptor);
            switch (iP) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strO = ul2VarB.o(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    strO2 = ul2VarB.o(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    strO3 = ul2VarB.o(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    iM = ul2VarB.m(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    strO4 = ul2VarB.o(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    strO5 = ul2VarB.o(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    strO6 = ul2VarB.o(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    strO7 = ul2VarB.o(serialDescriptor, 7);
                    i |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
                    break;
                default:
                    b0.m(iP);
                    return null;
            }
        }
        ul2VarB.c(serialDescriptor);
        return new GetNativeAppInfoResult(i, iM, strO, strO2, strO3, strO4, strO5, strO6, strO7);
    }

    @Override // defpackage.r7e, defpackage.i04
    /* JADX INFO: renamed from: getDescriptor */
    public final SerialDescriptor get$$serialDesc() {
        return descriptor;
    }

    @Override // defpackage.r7e
    public final void serialize(Encoder encoder, GetNativeAppInfoResult value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vl2 vl2VarB = encoder.b(serialDescriptor);
        vl2VarB.x(serialDescriptor, 0, value.b);
        vl2VarB.x(serialDescriptor, 1, value.c);
        vl2VarB.x(serialDescriptor, 2, value.d);
        vl2VarB.r(3, value.e, serialDescriptor);
        vl2VarB.x(serialDescriptor, 4, value.f);
        vl2VarB.x(serialDescriptor, 5, value.g);
        vl2VarB.x(serialDescriptor, 6, value.h);
        vl2VarB.x(serialDescriptor, 7, value.i);
        vl2VarB.c(serialDescriptor);
    }

    @Override // defpackage.sw5
    public KSerializer<?>[] typeParametersSerializers() {
        return ypd.V;
    }
}
