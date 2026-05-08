package androidx.paging;

import defpackage.a5a;
import defpackage.ex7;
import defpackage.pnb;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
public final class SingleRunner {
    public final a a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/paging/SingleRunner$CancelIsolatedRunnerException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Landroidx/paging/SingleRunner;", "runner", "Landroidx/paging/SingleRunner;", "a", "()Landroidx/paging/SingleRunner;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CancelIsolatedRunnerException extends CancellationException {
        private final SingleRunner runner;

        public CancelIsolatedRunnerException(SingleRunner singleRunner) {
            super("Cancelled isolated runner");
            this.runner = singleRunner;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final SingleRunner getRunner() {
            return this.runner;
        }
    }

    public static final class a {
        public final SingleRunner a;
        public final boolean b;
        public final a5a c = pnb.i();
        public ex7 d;
        public int e;

        public a(SingleRunner singleRunner, boolean z) {
            this.a = singleRunner;
            this.b = z;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(defpackage.ex7 r5, defpackage.pu2 r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof androidx.paging.a
                if (r0 == 0) goto L13
                r0 = r6
                androidx.paging.a r0 = (androidx.paging.a) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.paging.a r0 = new androidx.paging.a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.result
                int r1 = r0.label
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L3a
                if (r1 != r2) goto L34
                java.lang.Object r4 = r0.L$2
                z4a r4 = (defpackage.z4a) r4
                java.lang.Object r5 = r0.L$1
                ex7 r5 = (defpackage.ex7) r5
                java.lang.Object r0 = r0.L$0
                androidx.paging.SingleRunner$a r0 = (androidx.paging.SingleRunner.a) r0
                defpackage.r7d.b(r6)
                r6 = r4
                r4 = r0
                goto L50
            L34:
                java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r4)
                return r3
            L3a:
                defpackage.r7d.b(r6)
                r0.L$0 = r4
                r0.L$1 = r5
                a5a r6 = r4.c
                r0.L$2 = r6
                r0.label = r2
                java.lang.Object r0 = r6.h(r0)
                g13 r1 = defpackage.g13.a
                if (r0 != r1) goto L50
                return r1
            L50:
                ex7 r0 = r4.d     // Catch: java.lang.Throwable -> L57
                if (r5 != r0) goto L59
                r4.d = r3     // Catch: java.lang.Throwable -> L57
                goto L59
            L57:
                r4 = move-exception
                goto L61
            L59:
                j6g r4 = defpackage.j6g.a     // Catch: java.lang.Throwable -> L57
                r6.p(r3)
                j6g r4 = defpackage.j6g.a
                return r4
            L61:
                r6.p(r3)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SingleRunner.a.a(ex7, pu2):java.lang.Object");
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object b(int r9, defpackage.ex7 r10, defpackage.pu2 r11) {
            /*
                r8 = this;
                boolean r0 = r11 instanceof androidx.paging.b
                if (r0 == 0) goto L13
                r0 = r11
                androidx.paging.b r0 = (androidx.paging.b) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.paging.b r0 = new androidx.paging.b
                r0.<init>(r8, r11)
            L18:
                java.lang.Object r11 = r0.result
                int r1 = r0.label
                r2 = 2
                r3 = 1
                r4 = 0
                g13 r5 = defpackage.g13.a
                if (r1 == 0) goto L57
                if (r1 == r3) goto L43
                if (r1 != r2) goto L3d
                int r8 = r0.I$0
                java.lang.Object r9 = r0.L$2
                z4a r9 = (defpackage.z4a) r9
                java.lang.Object r10 = r0.L$1
                ex7 r10 = (defpackage.ex7) r10
                java.lang.Object r0 = r0.L$0
                androidx.paging.SingleRunner$a r0 = (androidx.paging.SingleRunner.a) r0
                defpackage.r7d.b(r11)     // Catch: java.lang.Throwable -> L3a
                goto Laa
            L3a:
                r8 = move-exception
                goto Lba
            L3d:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r8)
                return r4
            L43:
                int r9 = r0.I$0
                java.lang.Object r8 = r0.L$2
                z4a r8 = (defpackage.z4a) r8
                java.lang.Object r10 = r0.L$1
                ex7 r10 = (defpackage.ex7) r10
                java.lang.Object r1 = r0.L$0
                androidx.paging.SingleRunner$a r1 = (androidx.paging.SingleRunner.a) r1
                defpackage.r7d.b(r11)
                r11 = r8
                r8 = r1
                goto L6d
            L57:
                defpackage.r7d.b(r11)
                r0.L$0 = r8
                r0.L$1 = r10
                a5a r11 = r8.c
                r0.L$2 = r11
                r0.I$0 = r9
                r0.label = r3
                java.lang.Object r1 = r11.h(r0)
                if (r1 != r5) goto L6d
                goto La6
            L6d:
                ex7 r1 = r8.d     // Catch: java.lang.Throwable -> L82
                if (r1 == 0) goto L88
                boolean r6 = r1.isActive()     // Catch: java.lang.Throwable -> L82
                if (r6 == 0) goto L88
                int r6 = r8.e     // Catch: java.lang.Throwable -> L82
                if (r6 < r9) goto L88
                if (r6 != r9) goto L85
                boolean r6 = r8.b     // Catch: java.lang.Throwable -> L82
                if (r6 == 0) goto L85
                goto L88
            L82:
                r8 = move-exception
                r9 = r11
                goto Lba
            L85:
                r3 = 0
            L86:
                r9 = r11
                goto Lb2
            L88:
                if (r1 == 0) goto L94
                androidx.paging.SingleRunner$CancelIsolatedRunnerException r6 = new androidx.paging.SingleRunner$CancelIsolatedRunnerException     // Catch: java.lang.Throwable -> L82
                androidx.paging.SingleRunner r7 = r8.a     // Catch: java.lang.Throwable -> L82
                r6.<init>(r7)     // Catch: java.lang.Throwable -> L82
                r1.h(r6)     // Catch: java.lang.Throwable -> L82
            L94:
                if (r1 == 0) goto Lad
                r0.L$0 = r8     // Catch: java.lang.Throwable -> L82
                r0.L$1 = r10     // Catch: java.lang.Throwable -> L82
                r0.L$2 = r11     // Catch: java.lang.Throwable -> L82
                r0.I$0 = r9     // Catch: java.lang.Throwable -> L82
                r0.label = r2     // Catch: java.lang.Throwable -> L82
                java.lang.Object r0 = r1.s0(r0)     // Catch: java.lang.Throwable -> L82
                if (r0 != r5) goto La7
            La6:
                return r5
            La7:
                r0 = r8
                r8 = r9
                r9 = r11
            Laa:
                r11 = r9
                r9 = r8
                r8 = r0
            Lad:
                r8.d = r10     // Catch: java.lang.Throwable -> L82
                r8.e = r9     // Catch: java.lang.Throwable -> L82
                goto L86
            Lb2:
                java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L3a
                r9.p(r4)
                return r8
            Lba:
                r9.p(r4)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SingleRunner.a.b(int, ex7, pu2):java.lang.Object");
        }
    }

    public SingleRunner(boolean z) {
        this.a = new a(this, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.paging.SingleRunner, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(int r5, kotlin.jvm.functions.Function1 r6, defpackage.pu2 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.paging.c
            if (r0 == 0) goto L13
            r0 = r7
            androidx.paging.c r0 = (androidx.paging.c) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.paging.c r0 = new androidx.paging.c
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L32
            if (r1 != r3) goto L2c
            java.lang.Object r4 = r0.L$0
            androidx.paging.SingleRunner r4 = (androidx.paging.SingleRunner) r4
            defpackage.r7d.b(r7)     // Catch: androidx.paging.SingleRunner.CancelIsolatedRunnerException -> L2a
            goto L4d
        L2a:
            r5 = move-exception
            goto L47
        L2c:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            return r2
        L32:
            defpackage.r7d.b(r7)
            androidx.paging.d r7 = new androidx.paging.d     // Catch: androidx.paging.SingleRunner.CancelIsolatedRunnerException -> L2a
            r7.<init>(r4, r5, r6, r2)     // Catch: androidx.paging.SingleRunner.CancelIsolatedRunnerException -> L2a
            r0.L$0 = r4     // Catch: androidx.paging.SingleRunner.CancelIsolatedRunnerException -> L2a
            r0.label = r3     // Catch: androidx.paging.SingleRunner.CancelIsolatedRunnerException -> L2a
            java.lang.Object r4 = defpackage.f13.d(r7, r0)     // Catch: androidx.paging.SingleRunner.CancelIsolatedRunnerException -> L2a
            g13 r5 = defpackage.g13.a
            if (r4 != r5) goto L4d
            return r5
        L47:
            androidx.paging.SingleRunner r6 = r5.getRunner()
            if (r6 != r4) goto L50
        L4d:
            j6g r4 = defpackage.j6g.a
            return r4
        L50:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SingleRunner.a(int, kotlin.jvm.functions.Function1, pu2):java.lang.Object");
    }

    public SingleRunner() {
        this(true);
    }
}
