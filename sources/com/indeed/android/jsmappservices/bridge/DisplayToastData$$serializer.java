package com.indeed.android.jsmappservices.bridge;

import defpackage.b0;
import defpackage.mve;
import defpackage.qp1;
import defpackage.sw5;
import defpackage.sy3;
import defpackage.ul2;
import defpackage.vl2;
import defpackage.y84;
import defpackage.ypd;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/indeed/android/jsmappservices/bridge/DisplayToastData.$serializer", "Lsw5;", "Lcom/indeed/android/jsmappservices/bridge/DisplayToastData;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lj6g;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/indeed/android/jsmappservices/bridge/DisplayToastData;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/indeed/android/jsmappservices/bridge/DisplayToastData;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "jsmappservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@sy3
public final /* synthetic */ class DisplayToastData$$serializer implements sw5<DisplayToastData> {
    public static final int $stable;
    public static final DisplayToastData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        DisplayToastData$$serializer displayToastData$$serializer = new DisplayToastData$$serializer();
        INSTANCE = displayToastData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.jsmappservices.bridge.DisplayToastData", displayToastData$$serializer, 7);
        pluginGeneratedSerialDescriptor.k("message", false);
        pluginGeneratedSerialDescriptor.k("title", false);
        pluginGeneratedSerialDescriptor.k("icon", false);
        pluginGeneratedSerialDescriptor.k("durationSeconds", false);
        pluginGeneratedSerialDescriptor.k("theme", false);
        pluginGeneratedSerialDescriptor.k("style", false);
        pluginGeneratedSerialDescriptor.k("position", false);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    private DisplayToastData$$serializer() {
    }

    @Override // defpackage.sw5
    public final KSerializer<?>[] childSerializers() {
        Lazy<KSerializer<Object>>[] lazyArr = DisplayToastData.h;
        mve mveVar = mve.a;
        return new KSerializer[]{mveVar, qp1.b(mveVar), qp1.b(mveVar), y84.a, qp1.b(lazyArr[4].getValue()), qp1.b(lazyArr[5].getValue()), qp1.b(lazyArr[6].getValue())};
    }

    @Override // defpackage.i04
    public final DisplayToastData deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ul2 ul2VarB = decoder.b(serialDescriptor);
        Lazy<KSerializer<Object>>[] lazyArr = DisplayToastData.h;
        DisplayToastData displayToastData = null;
        ToastPosition toastPosition = null;
        String strO = null;
        String str = null;
        String str2 = null;
        ToastTheme toastTheme = null;
        double dG = 0.0d;
        int i = 0;
        boolean z = true;
        ToastStyle toastStyle = null;
        while (z) {
            int iP = ul2VarB.p(serialDescriptor);
            switch (iP) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    strO = ul2VarB.o(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str = (String) ul2VarB.h(serialDescriptor, 1, mve.a, str);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) ul2VarB.h(serialDescriptor, 2, mve.a, str2);
                    i |= 4;
                    break;
                case 3:
                    dG = ul2VarB.G(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    toastTheme = (ToastTheme) ul2VarB.h(serialDescriptor, 4, lazyArr[4].getValue(), toastTheme);
                    i |= 16;
                    break;
                case 5:
                    toastStyle = (ToastStyle) ul2VarB.h(serialDescriptor, 5, lazyArr[5].getValue(), toastStyle);
                    i |= 32;
                    break;
                case 6:
                    toastPosition = (ToastPosition) ul2VarB.h(serialDescriptor, 6, lazyArr[6].getValue(), toastPosition);
                    i |= 64;
                    break;
                default:
                    b0.m(iP);
                    return displayToastData;
            }
            displayToastData = null;
        }
        ul2VarB.c(serialDescriptor);
        return new DisplayToastData(i, strO, str, str2, dG, toastTheme, toastStyle, toastPosition);
    }

    @Override // defpackage.r7e, defpackage.i04
    /* JADX INFO: renamed from: getDescriptor */
    public final SerialDescriptor get$$serialDesc() {
        return descriptor;
    }

    @Override // defpackage.r7e
    public final void serialize(Encoder encoder, DisplayToastData value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vl2 vl2VarB = encoder.b(serialDescriptor);
        Lazy<KSerializer<Object>>[] lazyArr = DisplayToastData.h;
        vl2VarB.x(serialDescriptor, 0, value.a);
        mve mveVar = mve.a;
        vl2VarB.k(serialDescriptor, 1, mveVar, value.b);
        vl2VarB.k(serialDescriptor, 2, mveVar, value.c);
        vl2VarB.C(serialDescriptor, 3, value.d);
        vl2VarB.k(serialDescriptor, 4, lazyArr[4].getValue(), value.e);
        vl2VarB.k(serialDescriptor, 5, lazyArr[5].getValue(), value.f);
        vl2VarB.k(serialDescriptor, 6, lazyArr[6].getValue(), value.g);
        vl2VarB.c(serialDescriptor);
    }

    @Override // defpackage.sw5
    public KSerializer<?>[] typeParametersSerializers() {
        return ypd.V;
    }
}
