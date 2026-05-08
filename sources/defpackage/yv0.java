package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yv0 {
    public final a89<b, a> a = new a89<>(16);
    public final z3a<b, a> b = lnd.b();
    public final awd c = new awd();

    @fd8
    public static final class a {
        public final Object a;

        public /* synthetic */ a(Object obj) {
            this.a = obj;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return wl7.b(this.a, ((a) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            Object obj = this.a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final String toString() {
            return "AsyncTypefaceResult(result=" + this.a + ')';
        }
    }

    public static final class b {
        public final jn5 a;
        public final Object b;

        public b(jn5 jn5Var, Object obj) {
            this.a = jn5Var;
            this.b = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return wl7.b(this.a, bVar.a) && wl7.b(this.b, bVar.b);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            Object obj = this.b;
            return iHashCode + (obj == null ? 0 : obj.hashCode());
        }

        public final String toString() {
            return "Key(font=" + this.a + ", loaderKey=" + this.b + ')';
        }
    }

    public static void a(yv0 yv0Var, jn5 jn5Var, o70 o70Var, Object obj) {
        yv0Var.getClass();
        o70Var.getClass();
        Object obj2 = null;
        b bVar = new b(jn5Var, null);
        synchronized (yv0Var.c) {
            try {
                if (obj == null) {
                    yv0Var.b.m(bVar, new a(obj2));
                    j6g j6gVar = j6g.a;
                } else {
                    yv0Var.a.c(bVar, new a(obj));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.jn5 r7, defpackage.o70 r8, defpackage.su0 r9, defpackage.pu2 r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof defpackage.zv0
            if (r0 == 0) goto L13
            r0 = r10
            zv0 r0 = (defpackage.zv0) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zv0 r0 = new zv0
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.result
            g13 r1 = defpackage.g13.a
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2e
            boolean r7 = r0.Z$0
            java.lang.Object r8 = r0.L$0
            yv0$b r8 = (yv0.b) r8
            defpackage.r7d.b(r10)
            goto L71
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r6)
            return r3
        L34:
            defpackage.r7d.b(r10)
            yv0$b r10 = new yv0$b
            r8.getClass()
            r10.<init>(r7, r3)
            awd r7 = r6.c
            monitor-enter(r7)
            a89<yv0$b, yv0$a> r8 = r6.a     // Catch: java.lang.Throwable -> L55
            java.lang.Object r8 = r8.b(r10)     // Catch: java.lang.Throwable -> L55
            yv0$a r8 = (yv0.a) r8     // Catch: java.lang.Throwable -> L55
            if (r8 != 0) goto L57
            z3a<yv0$b, yv0$a> r8 = r6.b     // Catch: java.lang.Throwable -> L55
            java.lang.Object r8 = r8.d(r10)     // Catch: java.lang.Throwable -> L55
            yv0$a r8 = (yv0.a) r8     // Catch: java.lang.Throwable -> L55
            goto L57
        L55:
            r6 = move-exception
            goto La0
        L57:
            if (r8 == 0) goto L5d
            java.lang.Object r6 = r8.a     // Catch: java.lang.Throwable -> L55
            monitor-exit(r7)
            return r6
        L5d:
            j6g r8 = defpackage.j6g.a     // Catch: java.lang.Throwable -> L55
            monitor-exit(r7)
            r0.L$0 = r10
            r7 = 0
            r0.Z$0 = r7
            r0.label = r4
            java.lang.Object r8 = r9.invoke(r0)
            if (r8 != r1) goto L6e
            return r1
        L6e:
            r5 = r10
            r10 = r8
            r8 = r5
        L71:
            awd r9 = r6.c
            monitor-enter(r9)
            if (r10 != 0) goto L83
            z3a<yv0$b, yv0$a> r6 = r6.b     // Catch: java.lang.Throwable -> L81
            yv0$a r7 = new yv0$a     // Catch: java.lang.Throwable -> L81
            r7.<init>(r3)     // Catch: java.lang.Throwable -> L81
            r6.m(r8, r7)     // Catch: java.lang.Throwable -> L81
            goto L9a
        L81:
            r6 = move-exception
            goto L9e
        L83:
            if (r7 == 0) goto L90
            z3a<yv0$b, yv0$a> r6 = r6.b     // Catch: java.lang.Throwable -> L81
            yv0$a r7 = new yv0$a     // Catch: java.lang.Throwable -> L81
            r7.<init>(r10)     // Catch: java.lang.Throwable -> L81
            r6.m(r8, r7)     // Catch: java.lang.Throwable -> L81
            goto L9a
        L90:
            a89<yv0$b, yv0$a> r6 = r6.a     // Catch: java.lang.Throwable -> L81
            yv0$a r7 = new yv0$a     // Catch: java.lang.Throwable -> L81
            r7.<init>(r10)     // Catch: java.lang.Throwable -> L81
            r6.c(r8, r7)     // Catch: java.lang.Throwable -> L81
        L9a:
            j6g r6 = defpackage.j6g.a     // Catch: java.lang.Throwable -> L81
            monitor-exit(r9)
            return r10
        L9e:
            monitor-exit(r9)
            throw r6
        La0:
            monitor-exit(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv0.b(jn5, o70, su0, pu2):java.lang.Object");
    }
}
