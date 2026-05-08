package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class b37 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0028, code lost:
    
        if (r3.equals("none") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r3.equals("repeat") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0036, code lost:
    
        return defpackage.and.b;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.h91 a(java.lang.String r3) {
        /*
            fnd r0 = defpackage.fnd.b
            if (r3 == 0) goto L4f
            int r1 = r3.hashCode()
            switch(r1) {
                case -1881872635: goto L43;
                case -1364013995: goto L37;
                case -934531685: goto L2b;
                case 3387192: goto L22;
                case 94852023: goto L18;
                case 951526612: goto Lc;
                default: goto Lb;
            }
        Lb:
            goto L4f
        Lc:
            java.lang.String r1 = "contain"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L15
            goto L4f
        L15:
            hnd r3 = defpackage.hnd.b
            return r3
        L18:
            java.lang.String r1 = "cover"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L21
            goto L4f
        L21:
            return r0
        L22:
            java.lang.String r1 = "none"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L34
            goto L4f
        L2b:
            java.lang.String r1 = "repeat"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L34
            goto L4f
        L34:
            and r3 = defpackage.and.b
            return r3
        L37:
            java.lang.String r1 = "center"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L40
            goto L4f
        L40:
            gnd r3 = defpackage.gnd.b
            return r3
        L43:
            java.lang.String r1 = "stretch"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L4c
            goto L4f
        L4c:
            ind r3 = defpackage.ind.b
            return r3
        L4f:
            if (r3 == 0) goto L69
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid resize mode: '"
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = "'"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r1 = "ReactNative"
            defpackage.s55.n(r1, r3)
        L69:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b37.a(java.lang.String):h91");
    }
}
