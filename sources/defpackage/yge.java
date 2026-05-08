package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class yge<T> implements if3<T> {
    public static final LinkedHashSet Y = new LinkedHashSet();
    public static final Object Z = new Object();
    public List<? extends Function2<? super od7<T>, ? super lu2<? super j6g>, ? extends Object>> W;
    public final ife<a<T>> X;
    public final mjb a;
    public final okc b;
    public final e13 c;
    public final kjd d = new kjd(new che(this, null));
    public final String e = ".tmp";
    public final d2f f = new d2f(new ehe(this));
    public final gse V = hh2.e(t5g.a);

    public static abstract class a<T> {

        /* JADX INFO: renamed from: yge$a$a, reason: collision with other inner class name */
        public static final class C0483a<T> extends a<T> {
            public final bse<T> a;

            public C0483a(bse<T> bseVar) {
                this.a = bseVar;
            }
        }

        public static final class b<T> extends a<T> {
            public final Function2<T, lu2<? super T>, Object> a;
            public final yd2 b;
            public final bse<T> c;
            public final v03 d;

            public b(Function2 function2, yd2 yd2Var, bse bseVar, v03 v03Var) {
                v03Var.getClass();
                this.a = function2;
                this.b = yd2Var;
                this.c = bseVar;
                this.d = v03Var;
            }
        }
    }

    public yge(mjb mjbVar, List list, okc okcVar, e13 e13Var) {
        this.a = mjbVar;
        this.b = okcVar;
        this.c = e13Var;
        this.W = z92.z1(list);
        this.X = new ife<>(e13Var, new zge(this), ahe.a, new bhe(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a5, code lost:
    
        if (r9 != r6) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, yge] */
    /* JADX WARN: Type inference failed for: r9v10, types: [xd2] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [yge] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(defpackage.yge r9, yge.a.b r10, defpackage.pu2 r11) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yge.b(yge, yge$a$b, pu2):java.lang.Object");
    }

    @Override // defpackage.if3
    public final Object a(Function2 function2, pu2 pu2Var) {
        yd2 yd2VarE = hh1.e();
        this.X.a(new a.b(function2, yd2VarE, (bse) this.V.getValue(), pu2Var.getContext()));
        return yd2VarE.o(pu2Var);
    }

    public final File c() {
        return (File) this.f.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.pu2 r12) throws androidx.datastore.core.CorruptionException, java.io.FileNotFoundException {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yge.d(pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.pu2 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.jhe
            if (r0 == 0) goto L13
            r0 = r5
            jhe r0 = (defpackage.jhe) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            jhe r0 = new jhe
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L32
            if (r1 != r3) goto L2c
            java.lang.Object r4 = r0.L$0
            yge r4 = (defpackage.yge) r4
            defpackage.r7d.b(r5)     // Catch: java.lang.Throwable -> L2a
            goto L42
        L2a:
            r5 = move-exception
            goto L45
        L2c:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            return r2
        L32:
            defpackage.r7d.b(r5)
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L2a
            r0.label = r3     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r4 = r4.d(r0)     // Catch: java.lang.Throwable -> L2a
            g13 r5 = defpackage.g13.a
            if (r4 != r5) goto L42
            return r5
        L42:
            j6g r4 = defpackage.j6g.a
            return r4
        L45:
            gse r4 = r4.V
            aqc r0 = new aqc
            r0.<init>(r5)
            r4.getClass()
            r4.m(r2, r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yge.e(pu2):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, yge, yge<T>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [yge] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.pu2 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.khe
            if (r0 == 0) goto L13
            r0 = r5
            khe r0 = (defpackage.khe) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            khe r0 = new khe
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L32
            if (r1 != r3) goto L2c
            java.lang.Object r4 = r0.L$0
            yge r4 = (defpackage.yge) r4
            defpackage.r7d.b(r5)     // Catch: java.lang.Throwable -> L2a
            goto L4f
        L2a:
            r5 = move-exception
            goto L42
        L2c:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            return r2
        L32:
            defpackage.r7d.b(r5)
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L2a
            r0.label = r3     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r4 = r4.d(r0)     // Catch: java.lang.Throwable -> L2a
            g13 r5 = defpackage.g13.a
            if (r4 != r5) goto L4f
            return r5
        L42:
            gse r4 = r4.V
            aqc r0 = new aqc
            r0.<init>(r5)
            r4.getClass()
            r4.m(r2, r0)
        L4f:
            j6g r4 = defpackage.j6g.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yge.f(pu2):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v12, types: [yge] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2, types: [lhe] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [yge] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(defpackage.pu2 r6) throws java.io.FileNotFoundException {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.lhe
            if (r0 == 0) goto L13
            r0 = r6
            lhe r0 = (defpackage.lhe) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            lhe r0 = new lhe
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L3b
            if (r1 != r3) goto L35
            java.lang.Object r5 = r0.L$2
            r2 = r5
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Object r5 = r0.L$1
            java.io.Closeable r5 = (java.io.Closeable) r5
            java.lang.Object r0 = r0.L$0
            yge r0 = (defpackage.yge) r0
            defpackage.r7d.b(r6)     // Catch: java.lang.Throwable -> L33
            goto L5e
        L33:
            r6 = move-exception
            goto L69
        L35:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r5)
            return r2
        L3b:
            defpackage.r7d.b(r6)
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L6f
            java.io.File r1 = r5.c()     // Catch: java.io.FileNotFoundException -> L6f
            r6.<init>(r1)     // Catch: java.io.FileNotFoundException -> L6f
            bkb r1 = defpackage.bkb.a     // Catch: java.lang.Throwable -> L64
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L64
            r0.L$1 = r6     // Catch: java.lang.Throwable -> L64
            r0.L$2 = r2     // Catch: java.lang.Throwable -> L64
            r0.label = r3     // Catch: java.lang.Throwable -> L64
            s3a r0 = r1.a(r6)     // Catch: java.lang.Throwable -> L64
            g13 r1 = defpackage.g13.a
            if (r0 != r1) goto L5a
            return r1
        L5a:
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L5e:
            defpackage.c0h.q(r5, r2)     // Catch: java.io.FileNotFoundException -> L62
            return r6
        L62:
            r5 = move-exception
            goto L72
        L64:
            r0 = move-exception
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L69:
            throw r6     // Catch: java.lang.Throwable -> L6a
        L6a:
            r1 = move-exception
            defpackage.c0h.q(r5, r6)     // Catch: java.io.FileNotFoundException -> L62
            throw r1     // Catch: java.io.FileNotFoundException -> L62
        L6f:
            r6 = move-exception
            r0 = r5
            r5 = r6
        L72:
            java.io.File r6 = r0.c()
            boolean r6 = r6.exists()
            if (r6 != 0) goto L82
            s3a r5 = new s3a
            r5.<init>(r3, r3)
            return r5
        L82:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yge.g(pu2):java.lang.Object");
    }

    @Override // defpackage.if3
    public final vi5<T> getData() {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(defpackage.pu2 r8) throws androidx.datastore.core.CorruptionException, java.io.FileNotFoundException {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.mhe
            if (r0 == 0) goto L13
            r0 = r8
            mhe r0 = (defpackage.mhe) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            mhe r0 = new mhe
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 3
            r3 = 2
            r4 = 1
            g13 r5 = defpackage.g13.a
            if (r1 == 0) goto L52
            if (r1 == r4) goto L48
            if (r1 == r3) goto L3c
            if (r1 != r2) goto L35
            java.lang.Object r7 = r0.L$1
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.CorruptionException r0 = (androidx.datastore.core.CorruptionException) r0
            defpackage.r7d.b(r8)     // Catch: java.io.IOException -> L33
            return r7
        L33:
            r7 = move-exception
            goto L89
        L35:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r7)
            r7 = 0
            return r7
        L3c:
            java.lang.Object r7 = r0.L$1
            androidx.datastore.core.CorruptionException r7 = (androidx.datastore.core.CorruptionException) r7
            java.lang.Object r1 = r0.L$0
            yge r1 = (defpackage.yge) r1
            defpackage.r7d.b(r8)
            goto L78
        L48:
            java.lang.Object r7 = r0.L$0
            yge r7 = (defpackage.yge) r7
            defpackage.r7d.b(r8)     // Catch: androidx.datastore.core.CorruptionException -> L50
            return r8
        L50:
            r8 = move-exception
            goto L61
        L52:
            defpackage.r7d.b(r8)
            r0.L$0 = r7     // Catch: androidx.datastore.core.CorruptionException -> L50
            r0.label = r4     // Catch: androidx.datastore.core.CorruptionException -> L50
            java.lang.Object r7 = r7.g(r0)     // Catch: androidx.datastore.core.CorruptionException -> L50
            if (r7 != r5) goto L60
            goto L84
        L60:
            return r7
        L61:
            okc r1 = r7.b
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r3
            java.lang.Object r1 = r1.a
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            java.lang.Object r1 = r1.invoke(r8)
            if (r1 != r5) goto L74
            goto L84
        L74:
            r6 = r1
            r1 = r7
            r7 = r8
            r8 = r6
        L78:
            r0.L$0 = r7     // Catch: java.io.IOException -> L86
            r0.L$1 = r8     // Catch: java.io.IOException -> L86
            r0.label = r2     // Catch: java.io.IOException -> L86
            java.lang.Object r7 = r1.j(r8, r0)     // Catch: java.io.IOException -> L86
            if (r7 != r5) goto L85
        L84:
            return r5
        L85:
            return r8
        L86:
            r8 = move-exception
            r0 = r7
            r7 = r8
        L89:
            defpackage.boa.h(r0, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yge.h(pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(kotlin.jvm.functions.Function2 r10, defpackage.v03 r11, defpackage.pu2 r12) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.nhe
            if (r0 == 0) goto L13
            r0 = r12
            nhe r0 = (defpackage.nhe) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            nhe r0 = new nhe
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.result
            int r1 = r0.label
            java.lang.String r2 = "Data in DataStore was mutated but DataStore is only compatible with Immutable types."
            r3 = 0
            r4 = 2
            r5 = 1
            r6 = 0
            g13 r7 = defpackage.g13.a
            if (r1 == 0) goto L49
            if (r1 == r5) goto L3b
            if (r1 != r4) goto L35
            java.lang.Object r9 = r0.L$1
            java.lang.Object r10 = r0.L$0
            yge r10 = (defpackage.yge) r10
            defpackage.r7d.b(r12)
            goto La3
        L35:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r9)
            return r6
        L3b:
            java.lang.Object r9 = r0.L$2
            java.lang.Object r10 = r0.L$1
            td3 r10 = (defpackage.td3) r10
            java.lang.Object r11 = r0.L$0
            yge r11 = (defpackage.yge) r11
            defpackage.r7d.b(r12)
            goto L7d
        L49:
            defpackage.r7d.b(r12)
            gse r12 = r9.V
            java.lang.Object r12 = r12.getValue()
            td3 r12 = (defpackage.td3) r12
            T r1 = r12.a
            if (r1 == 0) goto L5d
            int r1 = r1.hashCode()
            goto L5e
        L5d:
            r1 = r3
        L5e:
            int r8 = r12.b
            if (r1 != r8) goto Lbb
            T r1 = r12.a
            ohe r8 = new ohe
            r8.<init>(r10, r1, r6)
            r0.L$0 = r9
            r0.L$1 = r12
            r0.L$2 = r1
            r0.label = r5
            java.lang.Object r10 = defpackage.u63.q0(r11, r8, r0)
            if (r10 != r7) goto L78
            goto La0
        L78:
            r11 = r12
            r12 = r10
            r10 = r11
            r11 = r9
            r9 = r1
        L7d:
            T r1 = r10.a
            if (r1 == 0) goto L86
            int r1 = r1.hashCode()
            goto L87
        L86:
            r1 = r3
        L87:
            int r10 = r10.b
            if (r1 != r10) goto Lb7
            boolean r10 = defpackage.wl7.b(r9, r12)
            if (r10 == 0) goto L92
            return r9
        L92:
            r0.L$0 = r11
            r0.L$1 = r12
            r0.L$2 = r6
            r0.label = r4
            java.lang.Object r9 = r11.j(r12, r0)
            if (r9 != r7) goto La1
        La0:
            return r7
        La1:
            r10 = r11
            r9 = r12
        La3:
            gse r10 = r10.V
            td3 r11 = new td3
            if (r9 == 0) goto Lad
            int r3 = r9.hashCode()
        Lad:
            r11.<init>(r9, r3)
            r10.getClass()
            r10.m(r6, r11)
            return r9
        Lb7:
            defpackage.r6.g(r2)
            return r6
        Lbb:
            defpackage.r6.g(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yge.i(kotlin.jvm.functions.Function2, v03, pu2):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.StringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(java.lang.Object r8, defpackage.pu2 r9) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yge.j(java.lang.Object, pu2):java.lang.Object");
    }

    public static final class b extends OutputStream {
        public final FileOutputStream a;

        public b(FileOutputStream fileOutputStream) {
            this.a = fileOutputStream;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() throws IOException {
            this.a.flush();
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr) throws IOException {
            bArr.getClass();
            this.a.write(bArr);
        }

        @Override // java.io.OutputStream
        public final void write(int i) throws IOException {
            this.a.write(i);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i, int i2) {
            bArr.getClass();
            this.a.write(bArr, i, i2);
        }
    }
}
