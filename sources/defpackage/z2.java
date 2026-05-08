package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z2 implements e49, Serializable {
    private static final long serialVersionUID = -2529255052481744503L;
    protected String name;

    @Override // defpackage.e49
    public final void b(RuntimeException runtimeException) {
        k(su8.DEBUG, null);
    }

    @Override // defpackage.e49
    public final void f(String str, NumberFormatException numberFormatException) {
        k(su8.WARN, null);
    }

    @Override // defpackage.e49
    public String getName() {
        return this.name;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0010  */
    @Override // defpackage.e49
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(java.lang.Object... r5) {
        /*
            r4 = this;
            int r0 = r5.length
            if (r0 != 0) goto L4
            goto L10
        L4:
            int r0 = r5.length
            int r0 = r0 + (-1)
            r0 = r5[r0]
            boolean r1 = r0 instanceof java.lang.Throwable
            if (r1 == 0) goto L10
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            goto L11
        L10:
            r0 = 0
        L11:
            su8 r1 = defpackage.su8.WARN
            if (r0 == 0) goto L2d
            int r0 = r5.length
            if (r0 == 0) goto L27
            int r0 = r5.length
            int r0 = r0 + (-1)
            java.lang.Object[] r2 = new java.lang.Object[r0]
            if (r0 <= 0) goto L23
            r3 = 0
            java.lang.System.arraycopy(r5, r3, r2, r3, r0)
        L23:
            r4.k(r1, r2)
            return
        L27:
            java.lang.String r4 = "non-sensical empty or null argument array"
            defpackage.r6.g(r4)
            return
        L2d:
            r4.k(r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z2.h(java.lang.Object[]):void");
    }

    @Override // defpackage.e49
    public final void i(String str) {
        k(su8.WARN, new Object[]{str});
    }

    public abstract void k(su8 su8Var, Object[] objArr);

    public Object readResolve() {
        return h49.c(getName());
    }
}
