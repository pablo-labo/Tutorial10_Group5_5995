package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes3.dex */
public final class d13 implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater W = AtomicLongFieldUpdater.newUpdater(d13.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater X = AtomicLongFieldUpdater.newUpdater(d13.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater Y = AtomicIntegerFieldUpdater.newUpdater(d13.class, "_isTerminated$volatile");
    public static final ux0 Z = new ux0("NOT_IN_STACK", 4);
    public final v4d<a> V;
    private volatile /* synthetic */ int _isTerminated$volatile;
    public final int a;
    public final int b;
    public final long c;
    private volatile /* synthetic */ long controlState$volatile;
    public final String d;
    public final aa6 e;
    public final aa6 f;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public final class a extends Thread {
        public static final /* synthetic */ AtomicIntegerFieldUpdater X = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");
        public boolean V;
        public final g3h a;
        public final luc<naf> b;
        public b c;
        public long d;
        public long e;
        public int f;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        private volatile /* synthetic */ int workerCtl$volatile;

        public a() {
            throw null;
        }

        public a(int i) {
            setDaemon(true);
            setContextClassLoader(d13.class.getClassLoader());
            this.a = new g3h();
            this.b = new luc<>();
            this.c = b.d;
            this.nextParkedWorker = d13.Z;
            int iNanoTime = (int) System.nanoTime();
            this.f = iNanoTime == 0 ? 42 : iNanoTime;
            f(i);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
        
            r12 = defpackage.g3h.d.get(r9);
            r0 = defpackage.g3h.c.get(r9);
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
        
            if (r12 == r0) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
        
            if (defpackage.g3h.e.get(r9) != 0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
        
            r0 = r0 - 1;
            r1 = r9.c(r0, true);
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
        
            if (r1 == null) goto L72;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
        
            r7 = r1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final defpackage.naf a(boolean r12) {
            /*
                r11 = this;
                d13$b r0 = r11.c
                d13 r2 = defpackage.d13.this
                r7 = 0
                r8 = 1
                g3h r9 = r11.a
                d13$b r10 = d13.b.a
                if (r0 != r10) goto Le
                goto L85
            Le:
                java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.d13.X
            L10:
                long r3 = r0.get(r2)
                r5 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
                long r5 = r5 & r3
                r1 = 42
                long r5 = r5 >> r1
                int r1 = (int) r5
                if (r1 != 0) goto L74
                r9.getClass()
            L23:
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = defpackage.g3h.b
                java.lang.Object r0 = r12.get(r9)
                naf r0 = (defpackage.naf) r0
                if (r0 != 0) goto L2e
                goto L41
            L2e:
                boolean r1 = r0.b
                if (r1 != r8) goto L41
            L32:
                boolean r1 = r12.compareAndSet(r9, r0, r7)
                if (r1 == 0) goto L3a
                r7 = r0
                goto L61
            L3a:
                java.lang.Object r1 = r12.get(r9)
                if (r1 == r0) goto L32
                goto L23
            L41:
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r12 = defpackage.g3h.d
                int r12 = r12.get(r9)
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.g3h.c
                int r0 = r0.get(r9)
            L4d:
                if (r12 == r0) goto L61
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.g3h.e
                int r1 = r1.get(r9)
                if (r1 != 0) goto L58
                goto L61
            L58:
                int r0 = r0 + (-1)
                naf r1 = r9.c(r0, r8)
                if (r1 == 0) goto L4d
                r7 = r1
            L61:
                if (r7 != 0) goto L73
                aa6 r12 = r2.f
                java.lang.Object r12 = r12.d()
                naf r12 = (defpackage.naf) r12
                if (r12 != 0) goto L72
                naf r11 = r11.i(r8)
                return r11
            L72:
                return r12
            L73:
                return r7
            L74:
                r5 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
                long r5 = r3 - r5
                java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = defpackage.d13.X
                boolean r1 = r1.compareAndSet(r2, r3, r5)
                if (r1 == 0) goto L10
                r11.c = r10
            L85:
                if (r12 == 0) goto Lb9
                int r12 = r2.a
                int r12 = r12 * 2
                int r12 = r11.d(r12)
                if (r12 != 0) goto L92
                goto L93
            L92:
                r8 = 0
            L93:
                if (r8 == 0) goto L9c
                naf r12 = r11.e()
                if (r12 == 0) goto L9c
                return r12
            L9c:
                r9.getClass()
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = defpackage.g3h.b
                java.lang.Object r12 = r12.getAndSet(r9, r7)
                naf r12 = (defpackage.naf) r12
                if (r12 != 0) goto Lad
                naf r12 = r9.b()
            Lad:
                if (r12 == 0) goto Lb0
                return r12
            Lb0:
                if (r8 != 0) goto Lc0
                naf r12 = r11.e()
                if (r12 == 0) goto Lc0
                return r12
            Lb9:
                naf r12 = r11.e()
                if (r12 == 0) goto Lc0
                return r12
            Lc0:
                r12 = 3
                naf r11 = r11.i(r12)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: d13.a.a(boolean):naf");
        }

        public final int b() {
            return this.indexInArray;
        }

        public final Object c() {
            return this.nextParkedWorker;
        }

        public final int d(int i) {
            int i2 = this.f;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.f = i5;
            int i6 = i - 1;
            return (i6 & i) == 0 ? i6 & i5 : (Integer.MAX_VALUE & i5) % i;
        }

        public final naf e() {
            int iD = d(2);
            d13 d13Var = d13.this;
            if (iD == 0) {
                naf nafVarD = d13Var.e.d();
                return nafVarD != null ? nafVarD : d13Var.f.d();
            }
            naf nafVarD2 = d13Var.f.d();
            return nafVarD2 != null ? nafVarD2 : d13Var.e.d();
        }

        public final void f(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(d13.this.d);
            sb.append("-worker-");
            sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
            setName(sb.toString());
            this.indexInArray = i;
        }

        public final void g(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean h(b bVar) {
            b bVar2 = this.c;
            boolean z = bVar2 == b.a;
            if (z) {
                d13.X.addAndGet(d13.this, 4398046511104L);
            }
            if (bVar2 != bVar) {
                this.c = bVar;
            }
            return z;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
        
            r7 = r4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x009f, code lost:
        
            r7 = -2;
            r5 = r4;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r14v1, types: [T, java.lang.Object, naf] */
        /* JADX WARN: Type inference failed for: r7v14, types: [naf] */
        /* JADX WARN: Type inference failed for: r7v4 */
        /* JADX WARN: Type inference failed for: r7v5, types: [naf] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final defpackage.naf i(int r26) {
            /*
                Method dump skipped, instruction units count: 259
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: d13.a.i(int):naf");
        }

        /* JADX WARN: Code restructure failed: missing block: B:127:0x0004, code lost:
        
            continue;
         */
        /* JADX WARN: Code restructure failed: missing block: B:128:0x0004, code lost:
        
            continue;
         */
        /* JADX WARN: Code restructure failed: missing block: B:129:0x0004, code lost:
        
            continue;
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                Method dump skipped, instruction units count: 435
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: d13.a.run():void");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b a;
        public static final b b;
        public static final b c;
        public static final b d;
        public static final b e;
        public static final /* synthetic */ b[] f;

        static {
            b bVar = new b("CPU_ACQUIRED", 0);
            a = bVar;
            b bVar2 = new b("BLOCKING", 1);
            b = bVar2;
            b bVar3 = new b("PARKING", 2);
            c = bVar3;
            b bVar4 = new b("DORMANT", 3);
            d = bVar4;
            b bVar5 = new b("TERMINATED", 4);
            e = bVar5;
            f = new b[]{bVar, bVar2, bVar3, bVar4, bVar5};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f.clone();
        }
    }

    public d13(long j, String str, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = str;
        if (i < 1) {
            h5.k(bg.d(i, "Core pool size ", " should be at least 1"));
            throw null;
        }
        if (i2 < i) {
            h5.k(k20.l("Max pool size ", i2, i, " should be greater than or equals to core pool size "));
            throw null;
        }
        if (i2 > 2097150) {
            h5.k(bg.d(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150"));
            throw null;
        }
        if (j <= 0) {
            h5.k(u40.c(j, "Idle worker keep alive time ", " must be positive"));
            throw null;
        }
        this.e = new aa6();
        this.f = new aa6();
        this.V = new v4d<>((i + 1) * 2);
        this.controlState$volatile = ((long) i) << 42;
    }

    public static /* synthetic */ void p(d13 d13Var, Runnable runnable, int i) {
        d13Var.h(runnable, false, (i & 4) == 0);
    }

    public final boolean G() {
        d13 d13Var;
        ux0 ux0Var;
        int iB;
        while (true) {
            long j = W.get(this);
            a aVarB = this.V.b((int) (2097151 & j));
            if (aVarB == null) {
                aVarB = null;
                d13Var = this;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object objC = aVarB.c();
                while (true) {
                    ux0Var = Z;
                    if (objC == ux0Var) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    a aVar = (a) objC;
                    iB = aVar.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = aVar.c();
                    j = j;
                }
                if (iB >= 0) {
                    d13 d13Var2 = this;
                    boolean zCompareAndSet = W.compareAndSet(d13Var2, j, ((long) iB) | j2);
                    d13Var = d13Var2;
                    if (zCompareAndSet) {
                        aVarB.g(ux0Var);
                    }
                    this = d13Var;
                } else {
                    continue;
                }
            }
            if (aVarB == null) {
                return false;
            }
            if (a.X.compareAndSet(aVarB, -1, 0)) {
                LockSupport.unpark(aVarB);
                return true;
            }
            this = d13Var;
        }
    }

    public final int a() {
        synchronized (this.V) {
            try {
                if (Y.get(this) == 1) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = X;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.a) {
                    return 0;
                }
                if (i >= this.b) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.V.b(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(i3);
                this.V.c(i3, aVar);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                aVar.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void close() throws java.lang.InterruptedException {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.d13.Y
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof d13.a
            r3 = 0
            if (r1 == 0) goto L17
            d13$a r0 = (d13.a) r0
            goto L18
        L17:
            r0 = r3
        L18:
            if (r0 == 0) goto L23
            d13 r1 = defpackage.d13.this
            boolean r1 = defpackage.wl7.b(r1, r8)
            if (r1 == 0) goto L23
            goto L24
        L23:
            r0 = r3
        L24:
            v4d<d13$a> r1 = r8.V
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = defpackage.d13.X     // Catch: java.lang.Throwable -> Lc3
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lc3
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L78
            r1 = r2
        L36:
            v4d<d13$a> r5 = r8.V
            java.lang.Object r5 = r5.b(r1)
            r5.getClass()
            d13$a r5 = (d13.a) r5
            if (r5 == r0) goto L73
        L43:
            java.lang.Thread$State r6 = r5.getState()
            java.lang.Thread$State r7 = java.lang.Thread.State.TERMINATED
            if (r6 == r7) goto L54
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L43
        L54:
            g3h r5 = r5.a
            aa6 r6 = r8.f
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = defpackage.g3h.b
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            naf r7 = (defpackage.naf) r7
            if (r7 == 0) goto L68
            r6.a(r7)
        L68:
            naf r7 = r5.b()
            if (r7 != 0) goto L6f
            goto L73
        L6f:
            r6.a(r7)
            goto L68
        L73:
            if (r1 == r4) goto L78
            int r1 = r1 + 1
            goto L36
        L78:
            aa6 r1 = r8.f
            r1.b()
            aa6 r1 = r8.e
            r1.b()
        L82:
            if (r0 == 0) goto L8a
            naf r1 = r0.a(r2)
            if (r1 != 0) goto Lb2
        L8a:
            aa6 r1 = r8.e
            java.lang.Object r1 = r1.d()
            naf r1 = (defpackage.naf) r1
            if (r1 != 0) goto Lb2
            aa6 r1 = r8.f
            java.lang.Object r1 = r1.d()
            naf r1 = (defpackage.naf) r1
            if (r1 != 0) goto Lb2
            if (r0 == 0) goto La5
            d13$b r1 = d13.b.e
            r0.h(r1)
        La5:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.d13.W
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.d13.X
            r0.set(r8, r1)
            return
        Lb2:
            r1.run()     // Catch: java.lang.Throwable -> Lb6
            goto L82
        Lb6:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L82
        Lc3:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d13.close():void");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        p(this, runnable, 6);
    }

    public final void h(Runnable runnable, boolean z, boolean z2) {
        naf rafVar;
        b bVar;
        uaf.f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof naf) {
            rafVar = (naf) runnable;
            rafVar.a = jNanoTime;
            rafVar.b = z;
        } else {
            rafVar = new raf(runnable, jNanoTime, z);
        }
        boolean z3 = rafVar.b;
        AtomicLongFieldUpdater atomicLongFieldUpdater = X;
        long jAddAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        a aVar = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
        if (aVar == null || !wl7.b(d13.this, this)) {
            aVar = null;
        }
        if (aVar != null && (bVar = aVar.c) != b.e && (rafVar.b || bVar != b.b)) {
            aVar.V = true;
            g3h g3hVar = aVar.a;
            if (z2) {
                rafVar = g3hVar.a(rafVar);
            } else {
                g3hVar.getClass();
                naf nafVar = (naf) g3h.b.getAndSet(g3hVar, rafVar);
                rafVar = nafVar == null ? null : g3hVar.a(nafVar);
            }
        }
        if (rafVar != null) {
            if (!(rafVar.b ? this.f.a(rafVar) : this.e.a(rafVar))) {
                throw new RejectedExecutionException(l6.i(new StringBuilder(), this.d, " was terminated"));
            }
        }
        if (z3) {
            if (G() || v(jAddAndGet)) {
                return;
            }
            G();
            return;
        }
        if (G() || v(atomicLongFieldUpdater.get(this))) {
            return;
        }
        G();
    }

    public final void s(a aVar, int i, int i2) {
        while (true) {
            long j = W.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object objC = aVar.c();
                    while (true) {
                        if (objC == Z) {
                            i3 = -1;
                            break;
                        }
                        if (objC == null) {
                            i3 = 0;
                            break;
                        }
                        a aVar2 = (a) objC;
                        int iB = aVar2.b();
                        if (iB != 0) {
                            i3 = iB;
                            break;
                        }
                        objC = aVar2.c();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                d13 d13Var = this;
                if (W.compareAndSet(d13Var, j, ((long) i3) | j2)) {
                    return;
                } else {
                    this = d13Var;
                }
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        v4d<a> v4dVar = this.V;
        int iA = v4dVar.a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iA; i6++) {
            a aVarB = v4dVar.b(i6);
            if (aVarB != null) {
                g3h g3hVar = aVarB.a;
                g3hVar.getClass();
                int i7 = g3h.b.get(g3hVar) != null ? (g3h.c.get(g3hVar) - g3h.d.get(g3hVar)) + 1 : g3h.c.get(g3hVar) - g3h.d.get(g3hVar);
                int iOrdinal = aVarB.c.ordinal();
                if (iOrdinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i7);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iOrdinal == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i7);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 2) {
                    i3++;
                } else if (iOrdinal == 3) {
                    i4++;
                    if (i7 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i7);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (iOrdinal != 4) {
                        l.g();
                        return null;
                    }
                    i5++;
                }
            }
        }
        long j = X.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.d);
        sb4.append('@');
        sb4.append(pi3.f(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.a;
        sb4.append(i8);
        sb4.append(", max = ");
        uz.i(sb4, this.b, "}, Worker States {CPU = ", i, ", blocking = ");
        uz.i(sb4, i2, ", parked = ", i3, ", dormant = ");
        uz.i(sb4, i4, ", terminated = ", i5, "}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.e.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i8 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }

    public final boolean v(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.a;
        if (i < i2) {
            int iA = a();
            if (iA == 1 && i2 > 1) {
                a();
            }
            if (iA > 0) {
                return true;
            }
        }
        return false;
    }
}
