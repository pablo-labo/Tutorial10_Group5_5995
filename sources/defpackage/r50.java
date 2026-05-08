package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class r50 extends mj8 implements Function1 {
    public static final r50 b;
    public static final r50 c;
    public static final r50 d;
    public final /* synthetic */ int a;

    static {
        int i = 1;
        b = new r50(i, 0);
        c = new r50(i, 1);
        d = new r50(i, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r50(int i, int i2) {
        super(i);
        this.a = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r2) {
        /*
            r1 = this;
            int r1 = r1.a
            switch(r1) {
                case 0: goto L19;
                case 1: goto L11;
                default: goto L5;
            }
        L5:
            androidx.navigation.k r2 = (androidx.navigation.k) r2
            r2.getClass()
            int r1 = r2.W
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
        L11:
            lx5$b r2 = (lx5.b) r2
            r2.getClass()
            j6g r1 = defpackage.j6g.a
            return r1
        L19:
            pm8 r2 = (defpackage.pm8) r2
            w4e r1 = r2.g()
            if (r1 == 0) goto L31
            boolean r2 = r1.c
            r0 = 1
            if (r2 != r0) goto L31
            r5e<le0> r2 = defpackage.k5e.E
            z3a<r5e<?>, java.lang.Object> r1 = r1.a
            boolean r1 = r1.b(r2)
            if (r1 == 0) goto L31
            goto L32
        L31:
            r0 = 0
        L32:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r50.invoke(java.lang.Object):java.lang.Object");
    }
}
