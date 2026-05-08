package defpackage;

import defpackage.drf;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class egb implements drf, tic {
    public final ap2 a;
    public final boolean b;
    public final zs0<c> c = new zs0<>();
    public final AtomicBoolean d = new AtomicBoolean(false);

    public final class a implements iid {
        public final iid a;
        public final long b;
        public final /* synthetic */ egb c;

        public a(egb egbVar, iid iidVar) {
            iidVar.getClass();
            this.c = egbVar;
            this.a = iidVar;
            this.b = xkf.a();
        }

        @Override // defpackage.iid
        public final boolean M1() {
            if (this.c.d.get()) {
                zkd.O(21, "Statement is recycled");
                throw null;
            }
            if (this.b == xkf.a()) {
                return this.a.M1();
            }
            zkd.O(21, "Attempted to use statement on a different thread");
            throw null;
        }

        @Override // defpackage.iid
        public final void R(int i, String str) {
            str.getClass();
            if (this.c.d.get()) {
                zkd.O(21, "Statement is recycled");
                throw null;
            }
            if (this.b == xkf.a()) {
                this.a.R(i, str);
            } else {
                zkd.O(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }

        @Override // java.lang.AutoCloseable
        public final void close() throws Exception {
            if (this.c.d.get()) {
                zkd.O(21, "Statement is recycled");
                throw null;
            }
            if (this.b == xkf.a()) {
                this.a.close();
            } else {
                zkd.O(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }

        @Override // defpackage.iid
        public final void e(int i, double d) {
            if (this.c.d.get()) {
                zkd.O(21, "Statement is recycled");
                throw null;
            }
            if (this.b == xkf.a()) {
                this.a.e(i, d);
            } else {
                zkd.O(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }

        @Override // defpackage.iid
        public final int getColumnCount() {
            if (this.c.d.get()) {
                zkd.O(21, "Statement is recycled");
                throw null;
            }
            if (this.b == xkf.a()) {
                return this.a.getColumnCount();
            }
            zkd.O(21, "Attempted to use statement on a different thread");
            throw null;
        }

        @Override // defpackage.iid
        public final String getColumnName(int i) {
            if (this.c.d.get()) {
                zkd.O(21, "Statement is recycled");
                throw null;
            }
            if (this.b == xkf.a()) {
                return this.a.getColumnName(i);
            }
            zkd.O(21, "Attempted to use statement on a different thread");
            throw null;
        }

        @Override // defpackage.iid
        public final double getDouble(int i) {
            if (this.c.d.get()) {
                zkd.O(21, "Statement is recycled");
                throw null;
            }
            if (this.b == xkf.a()) {
                return this.a.getDouble(i);
            }
            zkd.O(21, "Attempted to use statement on a different thread");
            throw null;
        }

        @Override // defpackage.iid
        public final long getLong(int i) {
            if (this.c.d.get()) {
                zkd.O(21, "Statement is recycled");
                throw null;
            }
            if (this.b == xkf.a()) {
                return this.a.getLong(i);
            }
            zkd.O(21, "Attempted to use statement on a different thread");
            throw null;
        }

        @Override // defpackage.iid
        public final boolean isNull(int i) {
            if (this.c.d.get()) {
                zkd.O(21, "Statement is recycled");
                throw null;
            }
            if (this.b == xkf.a()) {
                return this.a.isNull(i);
            }
            zkd.O(21, "Attempted to use statement on a different thread");
            throw null;
        }

        @Override // defpackage.iid
        public final void q(int i, long j) {
            if (this.c.d.get()) {
                zkd.O(21, "Statement is recycled");
                throw null;
            }
            if (this.b == xkf.a()) {
                this.a.q(i, j);
            } else {
                zkd.O(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }

        @Override // defpackage.iid
        public final void r(int i, byte[] bArr) {
            if (this.c.d.get()) {
                zkd.O(21, "Statement is recycled");
                throw null;
            }
            if (this.b == xkf.a()) {
                this.a.r(i, bArr);
            } else {
                zkd.O(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }

        @Override // defpackage.iid
        public final String r1(int i) {
            if (this.c.d.get()) {
                zkd.O(21, "Statement is recycled");
                throw null;
            }
            if (this.b == xkf.a()) {
                return this.a.r1(i);
            }
            zkd.O(21, "Attempted to use statement on a different thread");
            throw null;
        }

        @Override // defpackage.iid
        public final void reset() {
            if (this.c.d.get()) {
                zkd.O(21, "Statement is recycled");
                throw null;
            }
            if (this.b == xkf.a()) {
                this.a.reset();
            } else {
                zkd.O(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }

        @Override // defpackage.iid
        public final void u(int i) {
            if (this.c.d.get()) {
                zkd.O(21, "Statement is recycled");
                throw null;
            }
            if (this.b == xkf.a()) {
                this.a.u(i);
            } else {
                zkd.O(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }
    }

    public final class b<T> implements crf<T>, tic {
        public b() {
        }

        @Override // defpackage.dgb
        public final Object b(String str, Function1 function1, pu2 pu2Var) {
            return egb.this.b(str, function1, pu2Var);
        }

        @Override // defpackage.tic
        public final zhd d() {
            return egb.this.a;
        }
    }

    public static final class c {
        public final int a;

        public c(int i) {
            this.a = i;
        }
    }

    public egb(ap2 ap2Var, boolean z) {
        this.a = ap2Var;
        this.b = z;
    }

    @Override // defpackage.drf
    public final Object a(drf.a aVar, Function2 function2, c1f c1fVar) {
        if (this.d.get()) {
            zkd.O(21, "Connection is recycled");
            throw null;
        }
        po2 po2Var = (po2) c1fVar.getContext().h1(po2.b);
        if (po2Var != null && po2Var.a == this) {
            return g(aVar, function2, c1fVar);
        }
        zkd.O(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dgb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.String r6, kotlin.jvm.functions.Function1 r7, defpackage.pu2 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.igb
            if (r0 == 0) goto L13
            r0 = r8
            igb r0 = (defpackage.igb) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            igb r0 = new igb
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L3f
            if (r1 != r2) goto L39
            java.lang.Object r5 = r0.L$3
            z4a r5 = (defpackage.z4a) r5
            java.lang.Object r6 = r0.L$2
            r7 = r6
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            java.lang.Object r6 = r0.L$1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r0 = r0.L$0
            egb r0 = (defpackage.egb) r0
            defpackage.r7d.b(r8)
            r8 = r5
            r5 = r0
            goto L75
        L39:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r5)
            return r3
        L3f:
            defpackage.r7d.b(r8)
            java.util.concurrent.atomic.AtomicBoolean r8 = r5.d
            boolean r8 = r8.get()
            r1 = 21
            if (r8 != 0) goto L9e
            v03 r8 = r0.getContext()
            po2$a r4 = defpackage.po2.b
            v03$a r8 = r8.h1(r4)
            po2 r8 = (defpackage.po2) r8
            if (r8 == 0) goto L98
            egb r8 = r8.a
            if (r8 != r5) goto L98
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r7
            ap2 r8 = r5.a
            r0.L$3 = r8
            r0.label = r2
            z4a r1 = r8.b
            java.lang.Object r0 = r1.h(r0)
            g13 r1 = defpackage.g13.a
            if (r0 != r1) goto L75
            return r1
        L75:
            egb$a r0 = new egb$a     // Catch: java.lang.Throwable -> L8b
            ap2 r1 = r5.a     // Catch: java.lang.Throwable -> L8b
            iid r6 = r1.Q1(r6)     // Catch: java.lang.Throwable -> L8b
            r0.<init>(r5, r6)     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r5 = r7.invoke(r0)     // Catch: java.lang.Throwable -> L8d
            defpackage.pi3.d(r0, r3)     // Catch: java.lang.Throwable -> L8b
            r8.p(r3)
            return r5
        L8b:
            r5 = move-exception
            goto L94
        L8d:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L8f
        L8f:
            r6 = move-exception
            defpackage.pi3.d(r0, r5)     // Catch: java.lang.Throwable -> L8b
            throw r6     // Catch: java.lang.Throwable -> L8b
        L94:
            r8.p(r3)
            throw r5
        L98:
            java.lang.String r5 = "Attempted to use connection on a different coroutine"
            defpackage.zkd.O(r1, r5)
            throw r3
        L9e:
            java.lang.String r5 = "Connection is recycled"
            defpackage.zkd.O(r1, r5)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.egb.b(java.lang.String, kotlin.jvm.functions.Function1, pu2):java.lang.Object");
    }

    @Override // defpackage.drf
    public final Object c(c1f c1fVar) {
        if (this.d.get()) {
            zkd.O(21, "Connection is recycled");
            throw null;
        }
        po2 po2Var = (po2) c1fVar.getContext().h1(po2.b);
        if (po2Var != null && po2Var.a == this) {
            return Boolean.valueOf(!this.c.isEmpty());
        }
        zkd.O(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    @Override // defpackage.tic
    public final zhd d() {
        return this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(drf.a r7, defpackage.pu2 r8) {
        /*
            r6 = this;
            java.lang.String r0 = "SAVEPOINT '"
            boolean r1 = r8 instanceof defpackage.fgb
            if (r1 == 0) goto L15
            r1 = r8
            fgb r1 = (defpackage.fgb) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            fgb r1 = new fgb
            r1.<init>(r6, r8)
        L1a:
            java.lang.Object r8 = r1.result
            int r2 = r1.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L36
            java.lang.Object r6 = r1.L$2
            z4a r6 = (defpackage.z4a) r6
            java.lang.Object r7 = r1.L$1
            drf$a r7 = (drf.a) r7
            java.lang.Object r1 = r1.L$0
            egb r1 = (defpackage.egb) r1
            defpackage.r7d.b(r8)
            r8 = r6
            r6 = r1
            goto L54
        L36:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r6)
            return r4
        L3c:
            defpackage.r7d.b(r8)
            r1.L$0 = r6
            r1.L$1 = r7
            ap2 r8 = r6.a
            r1.L$2 = r8
            r1.label = r3
            z4a r2 = r8.b
            java.lang.Object r1 = r2.h(r1)
            g13 r2 = defpackage.g13.a
            if (r1 != r2) goto L54
            return r2
        L54:
            zs0<egb$c> r1 = r6.c     // Catch: java.lang.Throwable -> L71
            ap2 r6 = r6.a     // Catch: java.lang.Throwable -> L71
            int r2 = r1.c     // Catch: java.lang.Throwable -> L71
            boolean r5 = r1.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r5 == 0) goto L85
            int r7 = r7.ordinal()     // Catch: java.lang.Throwable -> L71
            if (r7 == 0) goto L7f
            if (r7 == r3) goto L79
            r0 = 2
            if (r7 != r0) goto L73
            java.lang.String r7 = "BEGIN EXCLUSIVE TRANSACTION"
            defpackage.zkd.y(r6, r7)     // Catch: java.lang.Throwable -> L71
            goto L99
        L71:
            r6 = move-exception
            goto La7
        L73:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Throwable -> L71
            r6.<init>()     // Catch: java.lang.Throwable -> L71
            throw r6     // Catch: java.lang.Throwable -> L71
        L79:
            java.lang.String r7 = "BEGIN IMMEDIATE TRANSACTION"
            defpackage.zkd.y(r6, r7)     // Catch: java.lang.Throwable -> L71
            goto L99
        L7f:
            java.lang.String r7 = "BEGIN DEFERRED TRANSACTION"
            defpackage.zkd.y(r6, r7)     // Catch: java.lang.Throwable -> L71
            goto L99
        L85:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L71
            r7.append(r2)     // Catch: java.lang.Throwable -> L71
            r0 = 39
            r7.append(r0)     // Catch: java.lang.Throwable -> L71
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L71
            defpackage.zkd.y(r6, r7)     // Catch: java.lang.Throwable -> L71
        L99:
            egb$c r6 = new egb$c     // Catch: java.lang.Throwable -> L71
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L71
            r1.addLast(r6)     // Catch: java.lang.Throwable -> L71
            j6g r6 = defpackage.j6g.a     // Catch: java.lang.Throwable -> L71
            r8.p(r4)
            return r6
        La7:
            r8.p(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.egb.e(drf$a, pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(boolean r7, defpackage.pu2 r8) {
        /*
            r6 = this;
            java.lang.String r0 = "ROLLBACK TRANSACTION TO SAVEPOINT '"
            java.lang.String r1 = "RELEASE SAVEPOINT '"
            boolean r2 = r8 instanceof defpackage.ggb
            if (r2 == 0) goto L17
            r2 = r8
            ggb r2 = (defpackage.ggb) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            ggb r2 = new ggb
            r2.<init>(r6, r8)
        L1c:
            java.lang.Object r8 = r2.result
            int r3 = r2.label
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L3c
            if (r3 != r4) goto L36
            boolean r7 = r2.Z$0
            java.lang.Object r6 = r2.L$1
            z4a r6 = (defpackage.z4a) r6
            java.lang.Object r2 = r2.L$0
            egb r2 = (defpackage.egb) r2
            defpackage.r7d.b(r8)
            r8 = r6
            r6 = r2
            goto L54
        L36:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r6)
            return r5
        L3c:
            defpackage.r7d.b(r8)
            r2.L$0 = r6
            ap2 r8 = r6.a
            r2.L$1 = r8
            r2.Z$0 = r7
            r2.label = r4
            z4a r3 = r8.b
            java.lang.Object r2 = r3.h(r2)
            g13 r3 = defpackage.g13.a
            if (r2 != r3) goto L54
            return r3
        L54:
            zs0<egb$c> r2 = r6.c     // Catch: java.lang.Throwable -> L77
            ap2 r6 = r6.a     // Catch: java.lang.Throwable -> L77
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> L77
            if (r3 != 0) goto Lb4
            java.lang.Object r3 = defpackage.w92.C0(r2)     // Catch: java.lang.Throwable -> L77
            egb$c r3 = (egb.c) r3     // Catch: java.lang.Throwable -> L77
            r4 = 39
            if (r7 == 0) goto L8e
            r3.getClass()     // Catch: java.lang.Throwable -> L77
            boolean r7 = r2.isEmpty()     // Catch: java.lang.Throwable -> L77
            if (r7 == 0) goto L79
            java.lang.String r7 = "END TRANSACTION"
            defpackage.zkd.y(r6, r7)     // Catch: java.lang.Throwable -> L77
            goto Lae
        L77:
            r6 = move-exception
            goto Lbc
        L79:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L77
            r7.<init>(r1)     // Catch: java.lang.Throwable -> L77
            int r0 = r3.a     // Catch: java.lang.Throwable -> L77
            r7.append(r0)     // Catch: java.lang.Throwable -> L77
            r7.append(r4)     // Catch: java.lang.Throwable -> L77
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L77
            defpackage.zkd.y(r6, r7)     // Catch: java.lang.Throwable -> L77
            goto Lae
        L8e:
            boolean r7 = r2.isEmpty()     // Catch: java.lang.Throwable -> L77
            if (r7 == 0) goto L9a
            java.lang.String r7 = "ROLLBACK TRANSACTION"
            defpackage.zkd.y(r6, r7)     // Catch: java.lang.Throwable -> L77
            goto Lae
        L9a:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L77
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L77
            int r0 = r3.a     // Catch: java.lang.Throwable -> L77
            r7.append(r0)     // Catch: java.lang.Throwable -> L77
            r7.append(r4)     // Catch: java.lang.Throwable -> L77
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L77
            defpackage.zkd.y(r6, r7)     // Catch: java.lang.Throwable -> L77
        Lae:
            j6g r6 = defpackage.j6g.a     // Catch: java.lang.Throwable -> L77
            r8.p(r5)
            return r6
        Lb4:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L77
            java.lang.String r7 = "Not in a transaction"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L77
            throw r6     // Catch: java.lang.Throwable -> L77
        Lbc:
            r8.p(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.egb.f(boolean, pu2):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(1:(2:22|23)(1:(2:15|16)(4:17|69|18|67)))(6:24|71|25|(1:41)|42|(1:62)(1:45)))(1:29))(5:30|(1:32)|33|(0)|62)|79|36|(4:39|(0)|42|(0))|62|(2:(1:74)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009f, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a0, code lost:
    
        r12 = r11;
        r11 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00cb, code lost:
    
        if (r12.f(false, r0) != r9) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a7 A[Catch: all -> 0x00bb, TRY_LEAVE, TryCatch #3 {all -> 0x00bb, blocks: (B:48:0x00a3, B:50:0x00a7), top: B:75:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(drf.a r12, kotlin.jvm.functions.Function2 r13, defpackage.pu2 r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.egb.g(drf$a, kotlin.jvm.functions.Function2, pu2):java.lang.Object");
    }
}
