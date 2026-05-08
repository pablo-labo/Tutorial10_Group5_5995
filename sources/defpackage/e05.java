package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e05 extends f05 implements js3 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater V = AtomicReferenceFieldUpdater.newUpdater(e05.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater W = AtomicReferenceFieldUpdater.newUpdater(e05.class, Object.class, "_delayed$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater X = AtomicIntegerFieldUpdater.newUpdater(e05.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    public final class a extends c {
        public final qw1 c;

        public a(long j, qw1 qw1Var) {
            super(j);
            this.c = qw1Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.c.D(e05.this, j6g.a);
        }

        @Override // e05.c
        public final String toString() {
            return super.toString() + this.c;
        }
    }

    public static final class b extends c {
        public final lmf c;

        public b(long j, lmf lmfVar) {
            super(j);
            this.c = lmfVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.c.run();
        }

        @Override // e05.c
        public final String toString() {
            return super.toString() + this.c;
        }
    }

    public static abstract class c implements Runnable, Comparable<c>, o74, alf {
        private volatile Object _heap;
        public long a;
        public int b = -1;

        public c(long j) {
            this.a = j;
        }

        @Override // defpackage.alf
        public final void a(d dVar) {
            if (this._heap != q92.e) {
                this._heap = dVar;
            } else {
                l5.q("Failed requirement.");
            }
        }

        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            long j = this.a - cVar.a;
            if (j > 0) {
                return 1;
            }
            return j < 0 ? -1 : 0;
        }

        @Override // defpackage.o74
        public final void dispose() {
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    ux0 ux0Var = q92.e;
                    if (obj == ux0Var) {
                        return;
                    }
                    d dVar = obj instanceof d ? (d) obj : null;
                    if (dVar != null) {
                        synchronized (dVar) {
                            Object obj2 = this._heap;
                            if ((obj2 instanceof zkf ? (zkf) obj2 : null) != null) {
                                dVar.b(this.b);
                            }
                        }
                    }
                    this._heap = ux0Var;
                    j6g j6gVar = j6g.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final int e(long j, d dVar, e05 e05Var) {
            synchronized (this) {
                if (this._heap == q92.e) {
                    return 2;
                }
                synchronized (dVar) {
                    try {
                        Object[] objArr = dVar.a;
                        c cVar = (c) (objArr != null ? objArr[0] : null);
                        if (e05.X.get(e05Var) == 1) {
                            return 1;
                        }
                        if (cVar == null) {
                            dVar.c = j;
                        } else {
                            long j2 = cVar.a;
                            if (j2 - j < 0) {
                                j = j2;
                            }
                            if (j - dVar.c > 0) {
                                dVar.c = j;
                            }
                        }
                        long j3 = this.a;
                        long j4 = dVar.c;
                        if (j3 - j4 < 0) {
                            this.a = j4;
                        }
                        dVar.a(this);
                        return 0;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        @Override // defpackage.alf
        public final void setIndex(int i) {
            this.b = i;
        }

        public String toString() {
            return "Delayed[nanos=" + this.a + ']';
        }
    }

    public static final class d extends zkf<c> {
        public long c;
    }

    @Override // defpackage.js3
    public o74 R0(long j, lmf lmfVar, v03 v03Var) {
        return fn3.a.R0(j, lmfVar, v03Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r7 = null;
     */
    @Override // defpackage.d05
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long R1() {
        /*
            r10 = this;
            ux0 r0 = defpackage.q92.f
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = defpackage.e05.V
            boolean r2 = r10.S1()
            r3 = 0
            if (r2 == 0) goto Le
            goto Lb6
        Le:
            r10.W1()
        L11:
            java.lang.Object r2 = r1.get(r10)
            r5 = 0
            if (r2 != 0) goto L1a
        L18:
            r7 = r5
            goto L4a
        L1a:
            boolean r6 = r2 instanceof defpackage.q29
            if (r6 == 0) goto L3e
            r6 = r2
            q29 r6 = (defpackage.q29) r6
            java.lang.Object r7 = r6.d()
            ux0 r8 = defpackage.q29.g
            if (r7 == r8) goto L2c
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            goto L4a
        L2c:
            q29 r6 = r6.c()
        L30:
            boolean r5 = r1.compareAndSet(r10, r2, r6)
            if (r5 == 0) goto L37
            goto L11
        L37:
            java.lang.Object r5 = r1.get(r10)
            if (r5 == r2) goto L30
            goto L11
        L3e:
            if (r2 != r0) goto L41
            goto L18
        L41:
            boolean r6 = r1.compareAndSet(r10, r2, r5)
            if (r6 == 0) goto Lbb
            r7 = r2
            java.lang.Runnable r7 = (java.lang.Runnable) r7
        L4a:
            if (r7 == 0) goto L50
            r7.run()
            return r3
        L50:
            zs0<x64<?>> r2 = r10.e
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 != 0) goto L5b
        L59:
            r8 = r6
            goto L63
        L5b:
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L62
            goto L59
        L62:
            r8 = r3
        L63:
            int r2 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r2 != 0) goto L68
            goto Lb6
        L68:
            java.lang.Object r1 = r1.get(r10)
            if (r1 == 0) goto L90
            boolean r2 = r1 instanceof defpackage.q29
            if (r2 == 0) goto L8d
            q29 r1 = (defpackage.q29) r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.q29.f
            long r0 = r0.get(r1)
            r8 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r8 = r8 & r0
            int r2 = (int) r8
            r8 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r0 = r0 & r8
            r8 = 30
            long r0 = r0 >> r8
            int r0 = (int) r0
            if (r2 != r0) goto L8c
            goto L90
        L8c:
            return r3
        L8d:
            if (r1 != r0) goto Lb6
            goto Lba
        L90:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.e05.W
            java.lang.Object r10 = r0.get(r10)
            e05$d r10 = (e05.d) r10
            if (r10 == 0) goto Lba
            monitor-enter(r10)
            T extends alf & java.lang.Comparable<? super T>[] r0 = r10.a     // Catch: java.lang.Throwable -> La3
            if (r0 == 0) goto La5
            r1 = 0
            r5 = r0[r1]     // Catch: java.lang.Throwable -> La3
            goto La5
        La3:
            r0 = move-exception
            goto Lb8
        La5:
            monitor-exit(r10)
            e05$c r5 = (e05.c) r5
            if (r5 != 0) goto Lab
            goto Lba
        Lab:
            long r0 = r5.a
            long r5 = java.lang.System.nanoTime()
            long r0 = r0 - r5
            int r10 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r10 >= 0) goto Lb7
        Lb6:
            return r3
        Lb7:
            return r0
        Lb8:
            monitor-exit(r10)
            throw r0
        Lba:
            return r6
        Lbb:
            java.lang.Object r6 = r1.get(r10)
            if (r6 == r2) goto L41
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e05.R1():long");
    }

    public void V1(Runnable runnable) {
        W1();
        if (!X1(runnable)) {
            en3.Y.V1(runnable);
            return;
        }
        Thread threadT1 = T1();
        if (Thread.currentThread() != threadT1) {
            LockSupport.unpark(threadT1);
        }
    }

    public final void W1() {
        c cVarB;
        d dVar = (d) W.get(this);
        if (dVar == null || zkf.b.get(dVar) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (dVar) {
                try {
                    Object[] objArr = dVar.a;
                    Object obj = objArr != null ? objArr[0] : null;
                    if (obj != null) {
                        c cVar = (c) obj;
                        cVarB = ((jNanoTime - cVar.a) > 0L ? 1 : ((jNanoTime - cVar.a) == 0L ? 0 : -1)) >= 0 ? X1(cVar) : false ? dVar.b(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (cVarB != null);
    }

    public final boolean X1(Runnable runnable) {
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = V;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (X.get(this) != 1) {
                if (obj != null) {
                    if (!(obj instanceof q29)) {
                        if (obj != q92.f) {
                            q29 q29Var = new q29(8, true);
                            q29Var.a((Runnable) obj);
                            q29Var.a(runnable);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, q29Var)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        return false;
                    }
                    q29 q29Var2 = (q29) obj;
                    int iA = q29Var2.a(runnable);
                    if (iA == 0) {
                        break;
                    }
                    if (iA == 1) {
                        q29 q29VarC = q29Var2.c();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, q29VarC) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (iA == 2) {
                        return false;
                    }
                } else {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                        if (atomicReferenceFieldUpdater.get(this) != null) {
                            break;
                        }
                    }
                    break loop0;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean Y1() {
        /*
            r7 = this;
            zs0<x64<?>> r0 = r7.e
            r1 = 1
            if (r0 == 0) goto La
            boolean r0 = r0.isEmpty()
            goto Lb
        La:
            r0 = r1
        Lb:
            r2 = 0
            if (r0 != 0) goto Lf
            goto L54
        Lf:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.e05.W
            java.lang.Object r0 = r0.get(r7)
            e05$d r0 = (e05.d) r0
            if (r0 == 0) goto L27
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = defpackage.zkf.b
            int r0 = r3.get(r0)
            if (r0 != 0) goto L23
            r0 = r1
            goto L24
        L23:
            r0 = r2
        L24:
            if (r0 != 0) goto L27
            goto L54
        L27:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.e05.V
            java.lang.Object r7 = r0.get(r7)
            if (r7 != 0) goto L30
            goto L53
        L30:
            boolean r0 = r7 instanceof defpackage.q29
            if (r0 == 0) goto L4f
            q29 r7 = (defpackage.q29) r7
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.q29.f
            long r3 = r0.get(r7)
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r5 = r5 & r3
            int r7 = (int) r5
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r3 = r3 & r5
            r0 = 30
            long r3 = r3 >> r0
            int r0 = (int) r3
            if (r7 != r0) goto L4e
            return r1
        L4e:
            return r2
        L4f:
            ux0 r0 = defpackage.q92.f
            if (r7 != r0) goto L54
        L53:
            return r1
        L54:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e05.Y1():boolean");
    }

    public final void Z1(long j, c cVar) {
        int iE;
        Thread threadT1;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = W;
        if (X.get(this) == 1) {
            iE = 1;
        } else {
            d dVar = (d) atomicReferenceFieldUpdater.get(this);
            if (dVar == null) {
                d dVar2 = new d();
                dVar2.c = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, dVar2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                obj.getClass();
                dVar = (d) obj;
            }
            iE = cVar.e(j, dVar, this);
        }
        if (iE != 0) {
            if (iE == 1) {
                U1(j, cVar);
                return;
            } else {
                if (iE == 2) {
                    return;
                }
                r6.g("unexpected result");
                return;
            }
        }
        d dVar3 = (d) atomicReferenceFieldUpdater.get(this);
        if (dVar3 != null) {
            synchronized (dVar3) {
                alf[] alfVarArr = dVar3.a;
                alfVar = alfVarArr != null ? alfVarArr[0] : null;
            }
            alfVar = (c) alfVar;
        }
        if (alfVar != cVar || Thread.currentThread() == (threadT1 = T1())) {
            return;
        }
        LockSupport.unpark(threadT1);
    }

    @Override // defpackage.js3
    public final void b0(long j, qw1 qw1Var) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            a aVar = new a(j2 + jNanoTime, qw1Var);
            Z1(jNanoTime, aVar);
            qw1Var.u(new u74(aVar));
        }
    }

    @Override // defpackage.d05
    public void shutdown() {
        c cVarB;
        ukf.a.set(null);
        X.set(this, 1);
        ux0 ux0Var = q92.f;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = V;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof q29)) {
                    if (obj != ux0Var) {
                        q29 q29Var = new q29(8, true);
                        q29Var.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, q29Var)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((q29) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, ux0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (R1() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) W.get(this);
            if (dVar == null) {
                return;
            }
            synchronized (dVar) {
                cVarB = zkf.b.get(dVar) > 0 ? dVar.b(0) : null;
            }
            c cVar = cVarB;
            if (cVar == null) {
                return;
            } else {
                U1(jNanoTime, cVar);
            }
        }
    }

    @Override // defpackage.y03
    public final void v1(v03 v03Var, Runnable runnable) {
        V1(runnable);
    }
}
