package defpackage;

import defpackage.ma8;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class hp4 {
    public static final long[] e = new long[0];
    public final SerialDescriptor a;
    public final ma8.a b;
    public long c;
    public final long[] d;

    public hp4(SerialDescriptor serialDescriptor, ma8.a aVar) {
        serialDescriptor.getClass();
        this.a = serialDescriptor;
        this.b = aVar;
        int iD = serialDescriptor.d();
        if (iD <= 64) {
            this.c = iD != 64 ? (-1) << iD : 0L;
            this.d = e;
            return;
        }
        this.c = 0L;
        int i = (iD - 1) >>> 6;
        long[] jArr = new long[i];
        if ((iD & 63) != 0) {
            jArr[i - 1] = (-1) << iD;
        }
        this.d = jArr;
    }
}
