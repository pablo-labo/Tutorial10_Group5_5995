package defpackage;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes2.dex */
public final class rvf<T> extends pvf<T> {
    public final ae6 a;
    public final pvf<T> b;
    public final Type c;

    public rvf(ae6 ae6Var, pvf<T> pvfVar, Type type) {
        this.a = ae6Var;
        this.b = pvfVar;
        this.c = type;
    }

    @Override // defpackage.pvf
    public final T a(nb8 nb8Var) {
        return this.b.a(nb8Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x003c  */
    @Override // defpackage.pvf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.gc8 r4, T r5) {
        /*
            r3 = this;
            java.lang.reflect.Type r0 = r3.c
            if (r5 == 0) goto L11
            boolean r1 = r0 instanceof java.lang.Class
            if (r1 != 0) goto Lc
            boolean r1 = r0 instanceof java.lang.reflect.TypeVariable
            if (r1 == 0) goto L11
        Lc:
            java.lang.Class r1 = r5.getClass()
            goto L12
        L11:
            r1 = r0
        L12:
            pvf<T> r2 = r3.b
            if (r1 == r0) goto L3d
            iyf r0 = new iyf
            r0.<init>(r1)
            ae6 r3 = r3.a
            pvf r3 = r3.c(r0)
            boolean r0 = r3 instanceof pwc.a
            if (r0 != 0) goto L26
            goto L3c
        L26:
            r0 = r2
        L27:
            boolean r1 = r0 instanceof defpackage.q7e
            if (r1 == 0) goto L37
            r1 = r0
            q7e r1 = (defpackage.q7e) r1
            pvf r1 = r1.c()
            if (r1 != r0) goto L35
            goto L37
        L35:
            r0 = r1
            goto L27
        L37:
            boolean r0 = r0 instanceof pwc.a
            if (r0 != 0) goto L3c
            goto L3d
        L3c:
            r2 = r3
        L3d:
            r2.b(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rvf.b(gc8, java.lang.Object):void");
    }
}
