package defpackage;

import defpackage.khf;

/* JADX INFO: loaded from: classes.dex */
public final class goe {
    public static final long a = hh2.t(14);
    public static final long b = hh2.t(0);
    public static final long c = da2.h;
    public static final khf d;

    static {
        long j = da2.b;
        d = j != 16 ? new bb2(j) : khf.a.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.foe a(defpackage.foe r24, long r25, defpackage.sn1 r27, float r28, long r29, defpackage.to5 r31, defpackage.mo5 r32, defpackage.no5 r33, defpackage.pn5 r34, java.lang.String r35, long r36, defpackage.lc1 r38, defpackage.lhf r39, defpackage.b19 r40, long r41, defpackage.odf r43, defpackage.vbe r44, defpackage.lcb r45, defpackage.ib4 r46) {
        /*
            Method dump skipped, instruction units count: 470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.goe.a(foe, long, sn1, float, long, to5, mo5, no5, pn5, java.lang.String, long, lc1, lhf, b19, long, odf, vbe, lcb, ib4):foe");
    }

    public static final Object b(float f, Object obj, Object obj2) {
        return ((double) f) < 0.5d ? obj : obj2;
    }

    public static final long c(long j, long j2, float f) {
        ckf[] ckfVarArr = bkf.b;
        long j3 = j & 1095216660480L;
        if (j3 != 0) {
            long j4 = 1095216660480L & j2;
            if (j4 != 0) {
                if (j3 == 0 || j4 == 0) {
                    ce7.a("Cannot perform operation for Unspecified type.");
                }
                if (!ckf.a(bkf.b(j), bkf.b(j2))) {
                    ce7.a("Cannot perform operation for " + ((Object) ckf.b(bkf.b(j))) + " and " + ((Object) ckf.b(bkf.b(j2))));
                }
                return hh2.y(j3, w74.t(bkf.c(j), bkf.c(j2), f));
            }
        }
        return ((bkf) b(f, new bkf(j), new bkf(j2))).a;
    }
}
