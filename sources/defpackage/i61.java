package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class i61 implements mqa {
    public boolean b;
    public final ArrayList c = new ArrayList();

    @Override // defpackage.mqa
    public final void B() {
        if (this.b) {
            return;
        }
        this.b = true;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((lu2) arrayList.get(i)).resumeWith(j6g.a);
        }
        arrayList.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v7, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [T, java.lang.Object, qw1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.pu2 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.h61
            if (r0 == 0) goto L13
            r0 = r5
            h61 r0 = (defpackage.h61) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            h61 r0 = new h61
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            int r1 = r0.label
            java.util.ArrayList r2 = r4.c
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            luc r4 = (defpackage.luc) r4
            defpackage.r7d.b(r5)     // Catch: java.lang.Throwable -> L2b
            goto L5e
        L2b:
            r5 = move-exception
            goto L68
        L2d:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            r4 = 0
            return r4
        L34:
            defpackage.r7d.b(r5)
            boolean r4 = r4.b
            if (r4 != 0) goto L72
            luc r4 = new luc
            r4.<init>()
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L2b
            r0.label = r3     // Catch: java.lang.Throwable -> L2b
            qw1 r5 = new qw1     // Catch: java.lang.Throwable -> L2b
            lu2 r0 = defpackage.ewa.v(r0)     // Catch: java.lang.Throwable -> L2b
            r5.<init>(r3, r0)     // Catch: java.lang.Throwable -> L2b
            r5.q()     // Catch: java.lang.Throwable -> L2b
            r4.element = r5     // Catch: java.lang.Throwable -> L2b
            r2.add(r5)     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r5 = r5.p()     // Catch: java.lang.Throwable -> L2b
            g13 r0 = defpackage.g13.a
            if (r5 != r0) goto L5e
            return r0
        L5e:
            T r4 = r4.element
            java.util.Collection r5 = defpackage.pxf.a(r2)
            r5.remove(r4)
            goto L72
        L68:
            T r4 = r4.element
            java.util.Collection r0 = defpackage.pxf.a(r2)
            r0.remove(r4)
            throw r5
        L72:
            j6g r4 = defpackage.j6g.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i61.a(pu2):java.lang.Object");
    }
}
