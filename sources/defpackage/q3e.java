package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class q3e {
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003f -> B:18:0x0042). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(defpackage.l61 r6, defpackage.x81 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.l3e
            if (r0 == 0) goto L13
            r0 = r7
            l3e r0 = (defpackage.l3e) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            l3e r0 = new l3e
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            java.lang.Object r6 = r0.L$0
            l61 r6 = (defpackage.l61) r6
            defpackage.r7d.b(r7)
            goto L42
        L29:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r6)
            r6 = 0
            return r6
        L30:
            defpackage.r7d.b(r7)
        L33:
            r0.L$0 = r6
            r0.label = r2
            peb r7 = defpackage.peb.b
            java.lang.Object r7 = r6.B1(r7, r0)
            g13 r1 = defpackage.g13.a
            if (r7 != r1) goto L42
            return r1
        L42:
            neb r7 = (defpackage.neb) r7
            java.util.List<yeb> r1 = r7.a
            r3 = r1
            java.util.Collection r3 = (java.util.Collection) r3
            int r3 = r3.size()
            r4 = 0
        L4e:
            if (r4 >= r3) goto L60
            java.lang.Object r5 = r1.get(r4)
            yeb r5 = (defpackage.yeb) r5
            boolean r5 = defpackage.mh2.g(r5)
            if (r5 != 0) goto L5d
            goto L33
        L5d:
            int r4 = r4 + 1
            goto L4e
        L60:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q3e.a(l61, x81):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(defpackage.l61 r11, defpackage.b0a r12, defpackage.r72 r13, defpackage.neb r14, defpackage.x81 r15) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q3e.b(l61, b0a, r72, neb, x81):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a8, code lost:
    
        if (r15 == r6) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(defpackage.l61 r12, defpackage.udf r13, defpackage.neb r14, defpackage.x81 r15) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q3e.c(l61, udf, neb, x81):java.lang.Object");
    }

    public static final boolean d(neb nebVar) {
        List<yeb> list = nebVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).i != 2) {
                return false;
            }
        }
        return true;
    }
}
