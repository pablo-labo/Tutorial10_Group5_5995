package defpackage;

import defpackage.drf;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class uze implements drf, tic {
    public final qze a;

    public final class a<T> implements crf<T>, tic {
        public a() {
        }

        @Override // defpackage.dgb
        public final Object b(String str, Function1 function1, pu2 pu2Var) {
            return uze.this.b(str, function1, pu2Var);
        }

        @Override // defpackage.tic
        public final zhd d() {
            return uze.this.a;
        }
    }

    public uze(qze qzeVar) {
        this.a = qzeVar;
    }

    @Override // defpackage.drf
    public final Object a(drf.a aVar, Function2 function2, c1f c1fVar) {
        return e(aVar, function2, c1fVar);
    }

    @Override // defpackage.dgb
    public final Object b(String str, Function1 function1, pu2 pu2Var) {
        yze yzeVarQ1 = this.a.Q1(str);
        try {
            Object objInvoke = function1.invoke(yzeVarQ1);
            pi3.d(yzeVarQ1, null);
            return objInvoke;
        } finally {
        }
    }

    @Override // defpackage.drf
    public final Object c(c1f c1fVar) {
        return Boolean.valueOf(this.a.a.y1());
    }

    @Override // defpackage.tic
    public final zhd d() {
        return this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(drf.a r6, kotlin.jvm.functions.Function2 r7, defpackage.pu2 r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.vze
            if (r0 == 0) goto L13
            r0 = r8
            vze r0 = (defpackage.vze) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            vze r0 = new vze
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L39
            if (r1 != r3) goto L33
            java.lang.Object r5 = r0.L$1
            sze r5 = (defpackage.sze) r5
            java.lang.Object r6 = r0.L$0
            uze r6 = (defpackage.uze) r6
            defpackage.r7d.b(r8)     // Catch: java.lang.Throwable -> L2e qo2.a -> L31
            goto L75
        L2e:
            r7 = move-exception
            goto L9d
        L31:
            r7 = move-exception
            goto L8c
        L33:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r5)
            return r2
        L39:
            defpackage.r7d.b(r8)
            qze r8 = r5.a
            sze r8 = r8.a
            r8.y1()
            int r6 = r6.ordinal()
            if (r6 == 0) goto L5a
            if (r6 == r3) goto L56
            r1 = 2
            if (r6 != r1) goto L52
            r8.y()
            goto L5d
        L52:
            defpackage.l.g()
            return r2
        L56:
            r8.U()
            goto L5d
        L5a:
            r8.U0()
        L5d:
            uze$a r6 = new uze$a     // Catch: java.lang.Throwable -> L85 qo2.a -> L89
            r6.<init>()     // Catch: java.lang.Throwable -> L85 qo2.a -> L89
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L85 qo2.a -> L89
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L85 qo2.a -> L89
            r0.label = r3     // Catch: java.lang.Throwable -> L85 qo2.a -> L89
            java.lang.Object r6 = r7.invoke(r6, r0)     // Catch: java.lang.Throwable -> L85 qo2.a -> L89
            g13 r7 = defpackage.g13.a
            if (r6 != r7) goto L71
            return r7
        L71:
            r4 = r6
            r6 = r5
            r5 = r8
            r8 = r4
        L75:
            r5.T()     // Catch: java.lang.Throwable -> L2e qo2.a -> L31
            r5.c0()
            boolean r5 = r5.y1()
            if (r5 != 0) goto L84
            r6.getClass()
        L84:
            return r8
        L85:
            r7 = move-exception
            r6 = r5
            r5 = r8
            goto L9d
        L89:
            r7 = move-exception
            r6 = r5
            r5 = r8
        L8c:
            java.lang.Object r7 = r7.a()     // Catch: java.lang.Throwable -> L2e
            r5.c0()
            boolean r5 = r5.y1()
            if (r5 != 0) goto L9c
            r6.getClass()
        L9c:
            return r7
        L9d:
            r5.c0()
            boolean r5 = r5.y1()
            if (r5 != 0) goto La9
            r6.getClass()
        La9:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uze.e(drf$a, kotlin.jvm.functions.Function2, pu2):java.lang.Object");
    }
}
