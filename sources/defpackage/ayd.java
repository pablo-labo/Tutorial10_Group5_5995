package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ayd {
    public static final ayd c;
    public final long a;
    public final long b;

    static {
        ayd aydVar = new ayd(0L, 0L);
        new ayd(Long.MAX_VALUE, Long.MAX_VALUE);
        new ayd(Long.MAX_VALUE, 0L);
        new ayd(0L, Long.MAX_VALUE);
        c = aydVar;
    }

    public ayd(long j, long j2) {
        ka2.l(j >= 0);
        ka2.l(j2 >= 0);
        this.a = j;
        this.b = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x005d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(long r12, long r14, long r16) {
        /*
            r11 = this;
            long r0 = r11.a
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            long r5 = r11.b
            if (r4 != 0) goto Lf
            int r11 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r11 != 0) goto Lf
            return r12
        Lf:
            java.lang.String r11 = defpackage.vjg.a
            long r7 = r12 - r0
            long r0 = r0 ^ r12
            long r9 = r12 ^ r7
            long r0 = r0 & r9
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 >= 0) goto L1d
            r7 = -9223372036854775808
        L1d:
            long r0 = r12 + r5
            long r9 = r12 ^ r0
            long r4 = r5 ^ r0
            long r4 = r4 & r9
            int r11 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r11 >= 0) goto L2d
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L2d:
            int r11 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            r2 = 0
            r3 = 1
            if (r11 > 0) goto L39
            int r11 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r11 > 0) goto L39
            r11 = r3
            goto L3a
        L39:
            r11 = r2
        L3a:
            int r4 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r4 > 0) goto L43
            int r0 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r0 > 0) goto L43
            r2 = r3
        L43:
            if (r11 == 0) goto L58
            if (r2 == 0) goto L58
            long r0 = r14 - r12
            long r0 = java.lang.Math.abs(r0)
            long r11 = r16 - r12
            long r11 = java.lang.Math.abs(r11)
            int r11 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r11 > 0) goto L5d
            goto L5a
        L58:
            if (r11 == 0) goto L5b
        L5a:
            return r14
        L5b:
            if (r2 == 0) goto L5e
        L5d:
            return r16
        L5e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayd.a(long, long, long):long");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ayd.class == obj.getClass()) {
            ayd aydVar = (ayd) obj;
            if (this.a == aydVar.a && this.b == aydVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
