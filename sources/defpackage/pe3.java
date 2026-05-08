package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pe3<T> {
    public static final a a = new a();

    public static final class a {
        /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
        /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.Throwable] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0088 -> B:25:0x006b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x008b -> B:25:0x006b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final java.lang.Object a(pe3.a r5, java.util.List r6, defpackage.od7 r7, defpackage.pu2 r8) {
            /*
                r5.getClass()
                boolean r0 = r8 instanceof defpackage.ne3
                if (r0 == 0) goto L16
                r0 = r8
                ne3 r0 = (defpackage.ne3) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L16
                int r1 = r1 - r2
                r0.label = r1
                goto L1b
            L16:
                ne3 r0 = new ne3
                r0.<init>(r5, r8)
            L1b:
                java.lang.Object r5 = r0.result
                int r8 = r0.label
                r1 = 0
                r2 = 2
                r3 = 1
                g13 r4 = defpackage.g13.a
                if (r8 == 0) goto L46
                if (r8 == r3) goto L3e
                if (r8 != r2) goto L38
                java.lang.Object r6 = r0.L$1
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r7 = r0.L$0
                luc r7 = (defpackage.luc) r7
                defpackage.r7d.b(r5)     // Catch: java.lang.Throwable -> L36
                goto L6b
            L36:
                r5 = move-exception
                goto L84
            L38:
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r5)
                return r1
            L3e:
                java.lang.Object r6 = r0.L$0
                java.util.List r6 = (java.util.List) r6
                defpackage.r7d.b(r5)
                goto L5f
            L46:
                defpackage.r7d.b(r5)
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                oe3 r8 = new oe3
                r8.<init>(r6, r5, r1)
                r0.L$0 = r5
                r0.label = r3
                java.lang.Object r6 = r7.a(r8, r0)
                if (r6 != r4) goto L5e
                goto L99
            L5e:
                r6 = r5
            L5f:
                luc r5 = new luc
                r5.<init>()
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                java.util.Iterator r6 = r6.iterator()
                r7 = r5
            L6b:
                boolean r5 = r6.hasNext()
                if (r5 == 0) goto L91
                java.lang.Object r5 = r6.next()
                kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
                r0.L$0 = r7     // Catch: java.lang.Throwable -> L36
                r0.L$1 = r6     // Catch: java.lang.Throwable -> L36
                r0.label = r2     // Catch: java.lang.Throwable -> L36
                java.lang.Object r5 = r5.invoke(r0)     // Catch: java.lang.Throwable -> L36
                if (r5 != r4) goto L6b
                goto L99
            L84:
                T r8 = r7.element
                if (r8 != 0) goto L8b
                r7.element = r5
                goto L6b
            L8b:
                java.lang.Throwable r8 = (java.lang.Throwable) r8
                defpackage.boa.h(r8, r5)
                goto L6b
            L91:
                T r5 = r7.element
                java.lang.Throwable r5 = (java.lang.Throwable) r5
                if (r5 != 0) goto L9a
                j6g r4 = defpackage.j6g.a
            L99:
                return r4
            L9a:
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: pe3.a.a(pe3$a, java.util.List, od7, pu2):java.lang.Object");
        }
    }
}
