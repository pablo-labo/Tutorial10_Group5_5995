package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class ixe<T> implements wi5<T> {
    public final wi5<T> a;
    public final Function2<wi5<? super T>, lu2<? super j6g>, Object> b;

    /* JADX WARN: Multi-variable type inference failed */
    public ixe(wi5<? super T> wi5Var, Function2<? super wi5<? super T>, ? super lu2<? super j6g>, ? extends Object> function2) {
        this.a = wi5Var;
        this.b = function2;
    }

    @Override // defpackage.wi5
    public final Object a(T t, lu2<? super j6g> lu2Var) {
        return this.a.a(t, lu2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0073, code lost:
    
        if (((defpackage.ixe) r8).c(r0) == r5) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.pu2 r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.hxe
            if (r0 == 0) goto L13
            r0 = r9
            hxe r0 = (defpackage.hxe) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            hxe r0 = new hxe
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 2
            r4 = 1
            g13 r5 = defpackage.g13.a
            if (r1 == 0) goto L3f
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.r7d.b(r9)
            goto L76
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r8)
            return r2
        L31:
            java.lang.Object r8 = r0.L$1
            hjd r8 = (defpackage.hjd) r8
            java.lang.Object r1 = r0.L$0
            ixe r1 = (defpackage.ixe) r1
            defpackage.r7d.b(r9)     // Catch: java.lang.Throwable -> L3d
            goto L5e
        L3d:
            r9 = move-exception
            goto L80
        L3f:
            defpackage.r7d.b(r9)
            hjd r9 = new hjd
            wi5<T> r1 = r8.a
            v03 r6 = r0.getContext()
            r9.<init>(r1, r6)
            kotlin.jvm.functions.Function2<wi5<? super T>, lu2<? super j6g>, java.lang.Object> r1 = r8.b     // Catch: java.lang.Throwable -> L7c
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L7c
            r0.L$1 = r9     // Catch: java.lang.Throwable -> L7c
            r0.label = r4     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r1 = r1.invoke(r9, r0)     // Catch: java.lang.Throwable -> L7c
            if (r1 != r5) goto L5c
            goto L75
        L5c:
            r1 = r8
            r8 = r9
        L5e:
            r8.releaseIntercepted()
            wi5<T> r8 = r1.a
            boolean r9 = r8 instanceof defpackage.ixe
            if (r9 == 0) goto L79
            ixe r8 = (defpackage.ixe) r8
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r8 = r8.c(r0)
            if (r8 != r5) goto L76
        L75:
            return r5
        L76:
            j6g r8 = defpackage.j6g.a
            return r8
        L79:
            j6g r8 = defpackage.j6g.a
            return r8
        L7c:
            r8 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
        L80:
            r8.releaseIntercepted()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ixe.c(pu2):java.lang.Object");
    }
}
