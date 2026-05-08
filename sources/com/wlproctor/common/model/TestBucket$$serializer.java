package com.wlproctor.common.model;

import defpackage.b0;
import defpackage.mve;
import defpackage.qp1;
import defpackage.rh7;
import defpackage.sw5;
import defpackage.sy3;
import defpackage.ul2;
import defpackage.ypd;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/wlproctor/common/model/TestBucket.$serializer", "Lsw5;", "Lcom/wlproctor/common/model/TestBucket;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/wlproctor/common/model/TestBucket;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lj6g;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/wlproctor/common/model/TestBucket;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "wlproctor-consumer_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@sy3
public final class TestBucket$$serializer implements sw5<TestBucket> {
    public static final TestBucket$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        TestBucket$$serializer testBucket$$serializer = new TestBucket$$serializer();
        INSTANCE = testBucket$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.wlproctor.common.model.TestBucket", testBucket$$serializer, 4);
        pluginGeneratedSerialDescriptor.k("name", false);
        pluginGeneratedSerialDescriptor.k("value", false);
        pluginGeneratedSerialDescriptor.k("description", true);
        pluginGeneratedSerialDescriptor.k("payload", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private TestBucket$$serializer() {
    }

    @Override // defpackage.sw5
    public KSerializer<?>[] childSerializers() {
        mve mveVar = mve.a;
        return new KSerializer[]{mveVar, rh7.a, qp1.b(mveVar), a.a};
    }

    @Override // defpackage.i04
    public TestBucket deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor descriptor2 = get$$serialDesc();
        ul2 ul2VarB = decoder.b(descriptor2);
        boolean z = true;
        int i = 0;
        int iM = 0;
        Object objH = null;
        String strO = null;
        Object objZ = null;
        while (z) {
            int iP = ul2VarB.p(descriptor2);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                strO = ul2VarB.o(descriptor2, 0);
                i |= 1;
            } else if (iP == 1) {
                iM = ul2VarB.m(descriptor2, 1);
                i |= 2;
            } else if (iP == 2) {
                objH = ul2VarB.h(descriptor2, 2, mve.a, objH);
                i |= 4;
            } else {
                if (iP != 3) {
                    b0.m(iP);
                    return null;
                }
                objZ = ul2VarB.z(descriptor2, 3, a.a, objZ);
                i |= 8;
            }
        }
        ul2VarB.c(descriptor2);
        return new TestBucket(i, strO, iM, (String) objH, (Payload) objZ);
    }

    @Override // defpackage.r7e, defpackage.i04
    /* JADX INFO: renamed from: getDescriptor */
    public SerialDescriptor get$$serialDesc() {
        return descriptor;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    @Override // defpackage.r7e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void serialize(kotlinx.serialization.encoding.Encoder r5, com.wlproctor.common.model.TestBucket r6) {
        /*
            r4 = this;
            r5.getClass()
            r6.getClass()
            kotlinx.serialization.descriptors.SerialDescriptor r4 = r4.get$$serialDesc()
            vl2 r5 = r5.b(r4)
            com.wlproctor.common.model.Payload r0 = r6.d
            java.lang.String r1 = r6.c
            r2 = 0
            java.lang.String r3 = r6.a
            r5.x(r4, r2, r3)
            r2 = 1
            int r6 = r6.b
            r5.r(r2, r6, r4)
            boolean r6 = r5.m(r4)
            if (r6 == 0) goto L25
            goto L27
        L25:
            if (r1 == 0) goto L2d
        L27:
            mve r6 = defpackage.mve.a
            r2 = 2
            r5.k(r4, r2, r6, r1)
        L2d:
            boolean r6 = r5.m(r4)
            if (r6 == 0) goto L34
            goto L43
        L34:
            com.wlproctor.common.model.Payload$Companion r6 = com.wlproctor.common.model.Payload.INSTANCE
            r6.getClass()
            com.wlproctor.common.model.Payload r6 = com.wlproctor.common.model.Payload.access$getEMPTY$cp()
            boolean r6 = defpackage.wl7.b(r0, r6)
            if (r6 != 0) goto L49
        L43:
            com.wlproctor.common.model.a r6 = com.wlproctor.common.model.a.a
            r1 = 3
            r5.y(r4, r1, r6, r0)
        L49:
            r5.c(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wlproctor.common.model.TestBucket$$serializer.serialize(kotlinx.serialization.encoding.Encoder, com.wlproctor.common.model.TestBucket):void");
    }

    @Override // defpackage.sw5
    public KSerializer<?>[] typeParametersSerializers() {
        return ypd.V;
    }
}
