package com.indeed.android.jsmappservices.bridge;

import defpackage.b0;
import defpackage.mve;
import defpackage.qp1;
import defpackage.sw5;
import defpackage.sy3;
import defpackage.ul2;
import defpackage.vl2;
import defpackage.ypd;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/indeed/android/jsmappservices/bridge/ShowSearchOverlayData.$serializer", "Lsw5;", "Lcom/indeed/android/jsmappservices/bridge/ShowSearchOverlayData;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lj6g;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/indeed/android/jsmappservices/bridge/ShowSearchOverlayData;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/indeed/android/jsmappservices/bridge/ShowSearchOverlayData;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "jsmappservices_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@sy3
public final /* synthetic */ class ShowSearchOverlayData$$serializer implements sw5<ShowSearchOverlayData> {
    public static final int $stable;
    public static final ShowSearchOverlayData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ShowSearchOverlayData$$serializer showSearchOverlayData$$serializer = new ShowSearchOverlayData$$serializer();
        INSTANCE = showSearchOverlayData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.indeed.android.jsmappservices.bridge.ShowSearchOverlayData", showSearchOverlayData$$serializer, 4);
        pluginGeneratedSerialDescriptor.k("searchType", false);
        pluginGeneratedSerialDescriptor.k("whatInput", false);
        pluginGeneratedSerialDescriptor.k("whereInput", false);
        pluginGeneratedSerialDescriptor.k("origin", true);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    private ShowSearchOverlayData$$serializer() {
    }

    @Override // defpackage.sw5
    public final KSerializer<?>[] childSerializers() {
        mve mveVar = mve.a;
        return new KSerializer[]{ShowSearchOverlayData.e[0].getValue(), qp1.b(mveVar), qp1.b(mveVar), qp1.b(mveVar)};
    }

    @Override // defpackage.i04
    public final ShowSearchOverlayData deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ul2 ul2VarB = decoder.b(serialDescriptor);
        Lazy<KSerializer<Object>>[] lazyArr = ShowSearchOverlayData.e;
        boolean z = true;
        int i = 0;
        SearchType searchType = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (z) {
            int iP = ul2VarB.p(serialDescriptor);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                searchType = (SearchType) ul2VarB.z(serialDescriptor, 0, lazyArr[0].getValue(), searchType);
                i |= 1;
            } else if (iP == 1) {
                str = (String) ul2VarB.h(serialDescriptor, 1, mve.a, str);
                i |= 2;
            } else if (iP == 2) {
                str2 = (String) ul2VarB.h(serialDescriptor, 2, mve.a, str2);
                i |= 4;
            } else {
                if (iP != 3) {
                    b0.m(iP);
                    return null;
                }
                str3 = (String) ul2VarB.h(serialDescriptor, 3, mve.a, str3);
                i |= 8;
            }
        }
        ul2VarB.c(serialDescriptor);
        return new ShowSearchOverlayData(i, searchType, str, str2, str3);
    }

    @Override // defpackage.r7e, defpackage.i04
    /* JADX INFO: renamed from: getDescriptor */
    public final SerialDescriptor get$$serialDesc() {
        return descriptor;
    }

    @Override // defpackage.r7e
    public final void serialize(Encoder encoder, ShowSearchOverlayData value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vl2 vl2VarB = encoder.b(serialDescriptor);
        KSerializer<Object> value2 = ShowSearchOverlayData.e[0].getValue();
        SearchType searchType = value.a;
        String str = value.d;
        vl2VarB.y(serialDescriptor, 0, value2, searchType);
        mve mveVar = mve.a;
        vl2VarB.k(serialDescriptor, 1, mveVar, value.b);
        vl2VarB.k(serialDescriptor, 2, mveVar, value.c);
        if (vl2VarB.m(serialDescriptor) || str != null) {
            vl2VarB.k(serialDescriptor, 3, mveVar, str);
        }
        vl2VarB.c(serialDescriptor);
    }

    @Override // defpackage.sw5
    public KSerializer<?>[] typeParametersSerializers() {
        return ypd.V;
    }
}
