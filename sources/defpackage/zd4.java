package defpackage;

import defpackage.ymb;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class zd4 implements KSerializer<wd4> {
    public static final zd4 a = new zd4();
    public static final anb b = new anb("kotlin.time.Duration", ymb.i.a);

    @Override // defpackage.i04
    public final Object deserialize(Decoder decoder) {
        int i = wd4.d;
        String strC = decoder.C();
        strC.getClass();
        try {
            return new wd4(pg8.i(strC));
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(l5.m("Invalid ISO duration string format: '", strC, "'."), e);
        }
    }

    @Override // defpackage.r7e, defpackage.i04
    /* JADX INFO: renamed from: getDescriptor */
    public final SerialDescriptor get$$serialDesc() {
        return b;
    }

    @Override // defpackage.r7e
    public final void serialize(Encoder encoder, Object obj) {
        long j = ((wd4) obj).a;
        int i = wd4.d;
        StringBuilder sb = new StringBuilder();
        if (j < 0) {
            sb.append('-');
        }
        sb.append("PT");
        long jR = j < 0 ? wd4.r(j) : j;
        long jP = wd4.p(jR, be4.HOURS);
        boolean z = false;
        int iP = wd4.m(jR) ? 0 : (int) (wd4.p(jR, be4.MINUTES) % 60);
        int iP2 = wd4.m(jR) ? 0 : (int) (wd4.p(jR, be4.SECONDS) % 60);
        int iH = wd4.h(jR);
        if (wd4.m(j)) {
            jP = 9999999999999L;
        }
        boolean z2 = jP != 0;
        boolean z3 = (iP2 == 0 && iH == 0) ? false : true;
        if (iP != 0 || (z3 && z2)) {
            z = true;
        }
        if (z2) {
            sb.append(jP);
            sb.append('H');
        }
        if (z) {
            sb.append(iP);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            wd4.c(sb, iP2, iH, 9, "S", true);
        }
        encoder.E(sb.toString());
    }
}
