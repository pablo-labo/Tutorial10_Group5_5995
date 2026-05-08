package defpackage;

import defpackage.iq2;

/* JADX INFO: loaded from: classes.dex */
public final class zm8 {
    public static final long a(long j, boolean z, int i, float f) {
        int iH = ((z || i == 2 || i == 4 || i == 5) && iq2.d(j)) ? iq2.h(j) : Integer.MAX_VALUE;
        if (iq2.j(j) != iH) {
            iH = nic.C(rdf.a(f), iq2.j(j), iH);
        }
        return iq2.a.b(0, iH, 0, iq2.g(j));
    }
}
