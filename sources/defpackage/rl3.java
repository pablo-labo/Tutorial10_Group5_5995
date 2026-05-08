package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import defpackage.eha;
import defpackage.k81;
import eha.c;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class rl3 implements k81, grf {
    public static final qyc p = e47.m(4300000L, 3200000L, 2400000L, 1700000L, 860000L);
    public static final qyc q = e47.m(1500000L, 980000L, 750000L, 520000L, 290000L);
    public static final qyc r = e47.m(2000000L, 1300000L, 1000000L, 860000L, 610000L);
    public static final qyc s = e47.m(2500000L, 1700000L, 1200000L, 970000L, 680000L);
    public static final qyc t = e47.m(4700000L, 2800000L, 2100000L, 1700000L, 980000L);
    public static final qyc u = e47.m(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);

    @SuppressLint({"NonFinalStaticField", "StaticFieldLeak"})
    public static rl3 v;
    public final Context a;
    public final f47<Integer, Long> b;
    public final k81.a.C0289a c;
    public final n2f d;
    public final boolean e;
    public final cke f;
    public int g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;
    public int n;
    public String o;

    public rl3() {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r6v6, types: [ql3] */
    public rl3(Context context, HashMap map) {
        boolean z;
        n2f n2fVar = d82.a;
        this.a = context == null ? null : context.getApplicationContext();
        this.b = f47.a(map);
        this.c = new k81.a.C0289a();
        this.f = new cke();
        this.d = n2fVar;
        this.e = true;
        if (context == null) {
            this.n = 0;
            this.l = 1000000L;
            return;
        }
        eha ehaVarA = eha.a(context);
        int iB = ehaVarA.b();
        this.n = iB;
        this.l = h(iB);
        ?? r6 = new eha.b() { // from class: ql3
            /* JADX WARN: Removed duplicated region for block: B:32:0x0048 A[Catch: all -> 0x000d, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:13:0x0013, B:17:0x0019, B:23:0x0025, B:25:0x0029, B:27:0x002f, B:29:0x0039, B:31:0x0043, B:33:0x0054, B:32:0x0048, B:34:0x0056, B:36:0x006a, B:38:0x0072), top: B:45:0x0003 }] */
            @Override // eha.b
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void a(int r9) {
                /*
                    r8 = this;
                    rl3 r1 = r8.a
                    monitor-enter(r1)
                    int r8 = r1.n     // Catch: java.lang.Throwable -> Ld
                    if (r8 == 0) goto L11
                    boolean r0 = r1.e     // Catch: java.lang.Throwable -> Ld
                    if (r0 != 0) goto L11
                    monitor-exit(r1)
                    return
                Ld:
                    r0 = move-exception
                    r8 = r0
                    goto L95
                L11:
                    if (r8 != r9) goto L19
                    java.lang.String r8 = r1.o     // Catch: java.lang.Throwable -> Ld
                    if (r8 == 0) goto L19
                    monitor-exit(r1)
                    return
                L19:
                    r1.n = r9     // Catch: java.lang.Throwable -> Ld
                    r8 = 1
                    if (r9 == r8) goto L93
                    if (r9 == 0) goto L93
                    r8 = 8
                    if (r9 != r8) goto L25
                    goto L93
                L25:
                    java.lang.String r8 = r1.o     // Catch: java.lang.Throwable -> Ld
                    if (r8 != 0) goto L56
                    android.content.Context r8 = r1.a     // Catch: java.lang.Throwable -> Ld
                    java.lang.String r0 = defpackage.vjg.a     // Catch: java.lang.Throwable -> Ld
                    if (r8 == 0) goto L48
                    java.lang.String r0 = "phone"
                    java.lang.Object r8 = r8.getSystemService(r0)     // Catch: java.lang.Throwable -> Ld
                    android.telephony.TelephonyManager r8 = (android.telephony.TelephonyManager) r8     // Catch: java.lang.Throwable -> Ld
                    if (r8 == 0) goto L48
                    java.lang.String r8 = r8.getNetworkCountryIso()     // Catch: java.lang.Throwable -> Ld
                    boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> Ld
                    if (r0 != 0) goto L48
                    java.lang.String r8 = defpackage.jh2.L(r8)     // Catch: java.lang.Throwable -> Ld
                    goto L54
                L48:
                    java.util.Locale r8 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> Ld
                    java.lang.String r8 = r8.getCountry()     // Catch: java.lang.Throwable -> Ld
                    java.lang.String r8 = defpackage.jh2.L(r8)     // Catch: java.lang.Throwable -> Ld
                L54:
                    r1.o = r8     // Catch: java.lang.Throwable -> Ld
                L56:
                    long r8 = r1.h(r9)     // Catch: java.lang.Throwable -> Ld
                    r1.l = r8     // Catch: java.lang.Throwable -> Ld
                    n2f r8 = r1.d     // Catch: java.lang.Throwable -> Ld
                    r8.getClass()     // Catch: java.lang.Throwable -> Ld
                    long r8 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> Ld
                    int r0 = r1.g     // Catch: java.lang.Throwable -> Ld
                    r7 = 0
                    if (r0 <= 0) goto L71
                    long r2 = r1.h     // Catch: java.lang.Throwable -> Ld
                    long r2 = r8 - r2
                    int r0 = (int) r2     // Catch: java.lang.Throwable -> Ld
                    r4 = r0
                    goto L72
                L71:
                    r4 = r7
                L72:
                    long r2 = r1.i     // Catch: java.lang.Throwable -> Ld
                    long r5 = r1.l     // Catch: java.lang.Throwable -> Ld
                    r1.i(r2, r4, r5)     // Catch: java.lang.Throwable -> Ld
                    r1.h = r8     // Catch: java.lang.Throwable -> Ld
                    r8 = 0
                    r1.i = r8     // Catch: java.lang.Throwable -> Ld
                    r1.k = r8     // Catch: java.lang.Throwable -> Ld
                    r1.j = r8     // Catch: java.lang.Throwable -> Ld
                    cke r8 = r1.f     // Catch: java.lang.Throwable -> Ld
                    java.util.ArrayList<cke$a> r9 = r8.a     // Catch: java.lang.Throwable -> Ld
                    r9.clear()     // Catch: java.lang.Throwable -> Ld
                    r9 = -1
                    r8.c = r9     // Catch: java.lang.Throwable -> Ld
                    r8.d = r7     // Catch: java.lang.Throwable -> Ld
                    r8.e = r7     // Catch: java.lang.Throwable -> Ld
                    monitor-exit(r1)
                    return
                L93:
                    monitor-exit(r1)
                    return
                L95:
                    monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
                    throw r8
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ql3.a(int):void");
            }
        };
        Executor executorA = q71.a();
        CopyOnWriteArrayList<eha.c> copyOnWriteArrayList = ehaVarA.b;
        for (eha.c cVar : copyOnWriteArrayList) {
            if (cVar.a.get() == null) {
                copyOnWriteArrayList.remove(cVar);
            }
        }
        eha.c cVar2 = ehaVarA.new c(r6, executorA);
        synchronized (ehaVarA.c) {
            ehaVarA.b.add(cVar2);
            z = ehaVarA.e;
        }
        if (z) {
            cVar2.b.execute(new ob0(cVar2, 4));
        }
    }

    @Override // defpackage.k81
    public final rl3 a() {
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x000f  */
    @Override // defpackage.grf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void b(defpackage.gf3 r3, boolean r4, int r5) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r4 == 0) goto Lf
            int r3 = r3.i     // Catch: java.lang.Throwable -> Ld
            r4 = 8
            r3 = r3 & r4
            if (r3 != r4) goto Lb
            goto Lf
        Lb:
            r3 = 1
            goto L10
        Ld:
            r3 = move-exception
            goto L1c
        Lf:
            r3 = 0
        L10:
            if (r3 != 0) goto L14
            monitor-exit(r2)
            return
        L14:
            long r3 = r2.i     // Catch: java.lang.Throwable -> Ld
            long r0 = (long) r5     // Catch: java.lang.Throwable -> Ld
            long r3 = r3 + r0
            r2.i = r3     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r2)
            return
        L1c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rl3.b(gf3, boolean, int):void");
    }

    @Override // defpackage.k81
    public final synchronized long c() {
        return this.l;
    }

    @Override // defpackage.k81
    public final void d(Handler handler, k81.a aVar) {
        aVar.getClass();
        k81.a.C0289a c0289a = this.c;
        c0289a.getClass();
        CopyOnWriteArrayList<k81.a.C0289a.C0290a> copyOnWriteArrayList = c0289a.a;
        for (k81.a.C0289a.C0290a c0290a : copyOnWriteArrayList) {
            if (c0290a.b == aVar) {
                c0290a.c = true;
                copyOnWriteArrayList.remove(c0290a);
            }
        }
        copyOnWriteArrayList.add(new k81.a.C0289a.C0290a(handler, aVar));
    }

    @Override // defpackage.k81
    public final void e(m20 m20Var) {
        CopyOnWriteArrayList<k81.a.C0289a.C0290a> copyOnWriteArrayList = this.c.a;
        for (k81.a.C0289a.C0290a c0290a : copyOnWriteArrayList) {
            if (c0290a.b == m20Var) {
                c0290a.c = true;
                copyOnWriteArrayList.remove(c0290a);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0060 A[Catch: all -> 0x007b, TRY_ENTER, TryCatch #2 {all -> 0x007b, blocks: (B:16:0x0019, B:19:0x001e, B:21:0x002a, B:23:0x003e, B:30:0x0069, B:29:0x0060), top: B:48:0x0019 }] */
    @Override // defpackage.grf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void f(defpackage.gf3 r11, boolean r12) throws java.lang.Throwable {
        /*
            r10 = this;
            monitor-enter(r10)
            r0 = 0
            r1 = 1
            if (r12 == 0) goto L14
            int r11 = r11.i     // Catch: java.lang.Throwable -> Lf
            r12 = 8
            r11 = r11 & r12
            if (r11 != r12) goto Ld
            goto L14
        Ld:
            r11 = r1
            goto L15
        Lf:
            r0 = move-exception
            r11 = r0
            r4 = r10
            goto L8a
        L14:
            r11 = r0
        L15:
            if (r11 != 0) goto L19
            monitor-exit(r10)
            return
        L19:
            int r11 = r10.g     // Catch: java.lang.Throwable -> L7b
            if (r11 <= 0) goto L1e
            r0 = r1
        L1e:
            defpackage.ka2.q(r0)     // Catch: java.lang.Throwable -> L7b
            n2f r11 = r10.d     // Catch: java.lang.Throwable -> L7b
            r11.getClass()     // Catch: java.lang.Throwable -> L86
            long r11 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L86
            long r2 = r10.h     // Catch: java.lang.Throwable -> L7b
            long r2 = r11 - r2
            int r7 = (int) r2     // Catch: java.lang.Throwable -> L7b
            long r2 = r10.j     // Catch: java.lang.Throwable -> L7b
            long r4 = (long) r7     // Catch: java.lang.Throwable -> L7b
            long r2 = r2 + r4
            r10.j = r2     // Catch: java.lang.Throwable -> L7b
            long r2 = r10.k     // Catch: java.lang.Throwable -> L7b
            long r4 = r10.i     // Catch: java.lang.Throwable -> L7b
            long r2 = r2 + r4
            r10.k = r2     // Catch: java.lang.Throwable -> L7b
            if (r7 <= 0) goto L7e
            float r0 = (float) r4     // Catch: java.lang.Throwable -> L7b
            r2 = 1174011904(0x45fa0000, float:8000.0)
            float r0 = r0 * r2
            float r2 = (float) r7     // Catch: java.lang.Throwable -> L7b
            float r0 = r0 / r2
            cke r2 = r10.f     // Catch: java.lang.Throwable -> L7b
            double r3 = (double) r4     // Catch: java.lang.Throwable -> L7b
            double r3 = java.lang.Math.sqrt(r3)     // Catch: java.lang.Throwable -> L7b
            int r3 = (int) r3     // Catch: java.lang.Throwable -> L7b
            r2.a(r0, r3)     // Catch: java.lang.Throwable -> L7b
            long r2 = r10.j     // Catch: java.lang.Throwable -> L7b
            r4 = 2000(0x7d0, double:9.88E-321)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L60
            long r2 = r10.k     // Catch: java.lang.Throwable -> Lf
            r4 = 524288(0x80000, double:2.590327E-318)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L69
        L60:
            cke r0 = r10.f     // Catch: java.lang.Throwable -> L7b
            float r0 = r0.b()     // Catch: java.lang.Throwable -> L7b
            long r2 = (long) r0     // Catch: java.lang.Throwable -> L7b
            r10.l = r2     // Catch: java.lang.Throwable -> L7b
        L69:
            long r5 = r10.i     // Catch: java.lang.Throwable -> L7b
            long r8 = r10.l     // Catch: java.lang.Throwable -> L7b
            r4 = r10
            r4.i(r5, r7, r8)     // Catch: java.lang.Throwable -> L78
            r4.h = r11     // Catch: java.lang.Throwable -> L78
            r10 = 0
            r4.i = r10     // Catch: java.lang.Throwable -> L78
            goto L7f
        L78:
            r0 = move-exception
        L79:
            r11 = r0
            goto L8a
        L7b:
            r0 = move-exception
            r4 = r10
            goto L79
        L7e:
            r4 = r10
        L7f:
            int r10 = r4.g     // Catch: java.lang.Throwable -> L78
            int r10 = r10 - r1
            r4.g = r10     // Catch: java.lang.Throwable -> L78
            monitor-exit(r4)
            return
        L86:
            r0 = move-exception
            r4 = r10
            r10 = r0
            r11 = r10
        L8a:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L78
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rl3.f(gf3, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0010  */
    @Override // defpackage.grf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void g(defpackage.gf3 r2, boolean r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            if (r3 == 0) goto L10
            int r2 = r2.i     // Catch: java.lang.Throwable -> Le
            r3 = 8
            r2 = r2 & r3
            if (r2 != r3) goto Lc
            goto L10
        Lc:
            r2 = r0
            goto L11
        Le:
            r2 = move-exception
            goto L2b
        L10:
            r2 = 0
        L11:
            if (r2 != 0) goto L15
            monitor-exit(r1)
            return
        L15:
            int r2 = r1.g     // Catch: java.lang.Throwable -> Le
            if (r2 != 0) goto L24
            n2f r2 = r1.d     // Catch: java.lang.Throwable -> Le
            r2.getClass()     // Catch: java.lang.Throwable -> Le
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> Le
            r1.h = r2     // Catch: java.lang.Throwable -> Le
        L24:
            int r2 = r1.g     // Catch: java.lang.Throwable -> Le
            int r2 = r2 + r0
            r1.g = r2     // Catch: java.lang.Throwable -> Le
            monitor-exit(r1)
            return
        L2b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rl3.g(gf3, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:1149:0x1216  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long h(int r15) {
        /*
            Method dump skipped, instruction units count: 8756
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rl3.h(int):long");
    }

    public final void i(long j, int i, long j2) {
        final long j3;
        final int i2;
        final long j4;
        if (i == 0 && j == 0 && j2 == this.m) {
            return;
        }
        this.m = j2;
        for (final k81.a.C0289a.C0290a c0290a : this.c.a) {
            if (c0290a.c) {
                j3 = j;
                i2 = i;
                j4 = j2;
            } else {
                j3 = j;
                i2 = i;
                j4 = j2;
                c0290a.a.post(new Runnable() { // from class: j81
                    @Override // java.lang.Runnable
                    public final void run() {
                        c0290a.b.O(j3, i2, j4);
                    }
                });
            }
            i = i2;
            j = j3;
            j2 = j4;
        }
    }
}
