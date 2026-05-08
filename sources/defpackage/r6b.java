package defpackage;

import defpackage.v03;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class r6b implements ky9 {
    public final ky9 a;
    public final pk8 b = new pk8();

    @uh3(c = "androidx.compose.runtime.PausableMonotonicFrameClock", f = "PausableMonotonicFrameClock.kt", l = {61, 62}, m = "withFrameNanos")
    public static final class a<R> extends pu2 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public a(lu2<? super a> lu2Var) {
            super(lu2Var);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return r6b.this.W(null, this);
        }
    }

    public r6b(ky9 ky9Var) {
        this.a = ky9Var;
    }

    @Override // defpackage.v03
    public final v03 P(v03.b<?> bVar) {
        return v03.a.C0438a.b(this, bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.ky9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <R> java.lang.Object W(kotlin.jvm.functions.Function1<? super java.lang.Long, ? extends R> r8, defpackage.lu2<? super R> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof r6b.a
            if (r0 == 0) goto L13
            r0 = r9
            r6b$a r0 = (r6b.a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            r6b$a r0 = new r6b$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            g13 r1 = defpackage.g13.a
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            defpackage.r7d.b(r9)
            return r9
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r7)
            return r3
        L31:
            java.lang.Object r8 = r0.L$0
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            defpackage.r7d.b(r9)
            goto L76
        L39:
            defpackage.r7d.b(r9)
            pk8 r9 = r7.b
            r0.L$0 = r8
            r0.label = r5
            java.lang.Object r2 = r9.a
            monitor-enter(r2)
            boolean r6 = r9.d     // Catch: java.lang.Throwable -> L87
            monitor-exit(r2)
            if (r6 == 0) goto L4d
            j6g r9 = defpackage.j6g.a
            goto L73
        L4d:
            qw1 r2 = new qw1
            lu2 r6 = defpackage.ewa.v(r0)
            r2.<init>(r5, r6)
            r2.q()
            java.lang.Object r5 = r9.a
            monitor-enter(r5)
            java.util.ArrayList r6 = r9.b     // Catch: java.lang.Throwable -> L84
            r6.add(r2)     // Catch: java.lang.Throwable -> L84
            monitor-exit(r5)
            ok8 r5 = new ok8
            r5.<init>(r9, r2)
            r2.t(r5)
            java.lang.Object r9 = r2.p()
            if (r9 != r1) goto L71
            goto L73
        L71:
            j6g r9 = defpackage.j6g.a
        L73:
            if (r9 != r1) goto L76
            goto L82
        L76:
            ky9 r7 = r7.a
            r0.L$0 = r3
            r0.label = r4
            java.lang.Object r7 = r7.W(r8, r0)
            if (r7 != r1) goto L83
        L82:
            return r1
        L83:
            return r7
        L84:
            r7 = move-exception
            monitor-exit(r5)
            throw r7
        L87:
            r7 = move-exception
            monitor-exit(r2)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r6b.W(kotlin.jvm.functions.Function1, lu2):java.lang.Object");
    }

    @Override // defpackage.v03
    public final v03 d1(v03 v03Var) {
        return v03.a.C0438a.c(this, v03Var);
    }

    @Override // defpackage.v03
    public final <E extends v03.a> E h1(v03.b<E> bVar) {
        return (E) v03.a.C0438a.a(this, bVar);
    }

    @Override // defpackage.v03
    public final <R> R j1(R r, Function2<? super R, ? super v03.a, ? extends R> function2) {
        return function2.invoke(r, this);
    }
}
