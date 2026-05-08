package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class nde<T> extends g4<pde> implements c4a<T>, rw1<T>, xv5<T> {
    public final eo1 V;
    public Object[] W;
    public long X;
    public long Y;
    public int Z;
    public int a0;
    public final int e;
    public final int f;

    public static final class a implements o74 {
        public final nde<?> a;
        public final long b;
        public final Object c;
        public final qw1 d;

        public a(nde ndeVar, long j, Object obj, qw1 qw1Var) {
            this.a = ndeVar;
            this.b = j;
            this.c = obj;
            this.d = qw1Var;
        }

        @Override // defpackage.o74
        public final void dispose() {
            nde<?> ndeVar = this.a;
            synchronized (ndeVar) {
                if (this.b < ndeVar.s()) {
                    return;
                }
                Object[] objArr = ndeVar.W;
                objArr.getClass();
                long j = this.b;
                if (objArr[((int) j) & (objArr.length - 1)] != this) {
                    return;
                }
                wg2.f(objArr, j, wg2.b0);
                ndeVar.n();
                j6g j6gVar = j6g.a;
            }
        }
    }

    public nde(int i, int i2, eo1 eo1Var) {
        this.e = i;
        this.f = i2;
        this.V = eo1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cf, code lost:
    
        throw r1.G();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void o(defpackage.nde r8, defpackage.wi5 r9, defpackage.lu2 r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nde.o(nde, wi5, lu2):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    @Override // defpackage.c4a, defpackage.wi5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(T r8, defpackage.lu2<? super defpackage.j6g> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r7.b(r8)
            if (r0 == 0) goto L9
            j6g r7 = defpackage.j6g.a
            return r7
        L9:
            qw1 r5 = new qw1
            lu2 r9 = defpackage.ewa.v(r9)
            r6 = 1
            r5.<init>(r6, r9)
            r5.q()
            lu2[] r9 = defpackage.h4.b
            monitor-enter(r7)
            boolean r0 = r7.u(r8)     // Catch: java.lang.Throwable -> L8a
            if (r0 == 0) goto L30
            j6g r8 = defpackage.j6g.a     // Catch: java.lang.Throwable -> L2b
            r5.resumeWith(r8)     // Catch: java.lang.Throwable -> L2b
            lu2[] r8 = r7.r(r9)     // Catch: java.lang.Throwable -> L2b
            r9 = 0
            r1 = r7
            goto L59
        L2b:
            r0 = move-exception
            r8 = r0
            r1 = r7
            goto L8d
        L30:
            nde$a r0 = new nde$a     // Catch: java.lang.Throwable -> L8a
            long r1 = r7.s()     // Catch: java.lang.Throwable -> L8a
            int r3 = r7.Z     // Catch: java.lang.Throwable -> L85
            int r4 = r7.a0     // Catch: java.lang.Throwable -> L85
            int r3 = r3 + r4
            long r3 = (long) r3
            long r2 = r1 + r3
            r1 = r7
            r4 = r8
            r0.<init>(r1, r2, r4, r5)     // Catch: java.lang.Throwable -> L54
            r1.q(r0)     // Catch: java.lang.Throwable -> L54
            int r7 = r1.a0     // Catch: java.lang.Throwable -> L54
            int r7 = r7 + r6
            r1.a0 = r7     // Catch: java.lang.Throwable -> L54
            int r7 = r1.f     // Catch: java.lang.Throwable -> L54
            if (r7 != 0) goto L57
            lu2[] r9 = r1.r(r9)     // Catch: java.lang.Throwable -> L54
            goto L57
        L54:
            r0 = move-exception
        L55:
            r8 = r0
            goto L8d
        L57:
            r8 = r9
            r9 = r0
        L59:
            monitor-exit(r1)
            if (r9 == 0) goto L64
            u74 r7 = new u74
            r7.<init>(r9)
            r5.u(r7)
        L64:
            int r7 = r8.length
            r9 = 0
        L66:
            if (r9 >= r7) goto L74
            r0 = r8[r9]
            if (r0 == 0) goto L71
            j6g r1 = defpackage.j6g.a
            r0.resumeWith(r1)
        L71:
            int r9 = r9 + 1
            goto L66
        L74:
            java.lang.Object r7 = r5.p()
            g13 r8 = defpackage.g13.a
            if (r7 != r8) goto L7d
            goto L7f
        L7d:
            j6g r7 = defpackage.j6g.a
        L7f:
            if (r7 != r8) goto L82
            return r7
        L82:
            j6g r7 = defpackage.j6g.a
            return r7
        L85:
            r0 = move-exception
            r1 = r7
            r7 = r0
            r8 = r7
            goto L8d
        L8a:
            r0 = move-exception
            r1 = r7
            goto L55
        L8d:
            monitor-exit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nde.a(java.lang.Object, lu2):java.lang.Object");
    }

    @Override // defpackage.c4a
    public final boolean b(T t) {
        int i;
        boolean z;
        lu2<j6g>[] lu2VarArrR = h4.b;
        synchronized (this) {
            if (u(t)) {
                lu2VarArrR = r(lu2VarArrR);
                z = true;
            } else {
                z = false;
            }
        }
        for (lu2<j6g> lu2Var : lu2VarArrR) {
            if (lu2Var != null) {
                lu2Var.resumeWith(j6g.a);
            }
        }
        return z;
    }

    @Override // defpackage.mde
    public final List<T> c() {
        synchronized (this) {
            int iS = (int) ((s() + ((long) this.Z)) - this.X);
            if (iS == 0) {
                return zr4.a;
            }
            ArrayList arrayList = new ArrayList(iS);
            Object[] objArr = this.W;
            objArr.getClass();
            for (int i = 0; i < iS; i++) {
                arrayList.add(objArr[((int) (this.X + ((long) i))) & (objArr.length - 1)]);
            }
            return arrayList;
        }
    }

    @Override // defpackage.xv5
    public final vi5<T> d(v03 v03Var, int i, eo1 eo1Var) {
        return wg2.G(this, v03Var, i, eo1Var);
    }

    @Override // defpackage.vi5
    public final Object e(wi5<? super T> wi5Var, lu2<?> lu2Var) throws Throwable {
        o(this, wi5Var, lu2Var);
        return g13.a;
    }

    @Override // defpackage.c4a
    public final void i() throws Throwable {
        nde<T> ndeVar;
        synchronized (this) {
            try {
                ndeVar = this;
            } catch (Throwable th) {
                th = th;
                ndeVar = this;
            }
            try {
                ndeVar.x(s() + ((long) this.Z), this.Y, s() + ((long) this.Z), s() + ((long) this.Z) + ((long) this.a0));
                j6g j6gVar = j6g.a;
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                throw th3;
            }
        }
    }

    @Override // defpackage.g4
    public final i4 j() {
        return new pde();
    }

    @Override // defpackage.g4
    public final i4[] k() {
        return new pde[2];
    }

    public final Object m(pde pdeVar, ode odeVar) throws Throwable {
        qw1 qw1Var = new qw1(1, ewa.v(odeVar));
        qw1Var.q();
        synchronized (this) {
            try {
                if (v(pdeVar) < 0) {
                    pdeVar.b = qw1Var;
                } else {
                    qw1Var.resumeWith(j6g.a);
                }
                j6g j6gVar = j6g.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        Object objP = qw1Var.p();
        return objP == g13.a ? objP : j6g.a;
    }

    public final void n() {
        if (this.f != 0 || this.a0 > 1) {
            Object[] objArr = this.W;
            objArr.getClass();
            while (this.a0 > 0) {
                long jS = s();
                int i = this.Z;
                int i2 = this.a0;
                if (objArr[((int) ((jS + ((long) (i + i2))) - 1)) & (objArr.length - 1)] != wg2.b0) {
                    return;
                }
                this.a0 = i2 - 1;
                wg2.f(objArr, s() + ((long) (this.Z + this.a0)), null);
            }
        }
    }

    public final void p() {
        Object[] objArr;
        Object[] objArr2 = this.W;
        objArr2.getClass();
        wg2.f(objArr2, s(), null);
        this.Z--;
        long jS = s() + 1;
        if (this.X < jS) {
            this.X = jS;
        }
        if (this.Y < jS) {
            if (this.b != 0 && (objArr = this.a) != null) {
                for (Object obj : objArr) {
                    if (obj != null) {
                        pde pdeVar = (pde) obj;
                        long j = pdeVar.a;
                        if (j >= 0 && j < jS) {
                            pdeVar.a = jS;
                        }
                    }
                }
            }
            this.Y = jS;
        }
    }

    public final void q(Object obj) {
        int i = this.Z + this.a0;
        Object[] objArrT = this.W;
        if (objArrT == null) {
            objArrT = t(null, 0, 2);
        } else if (i >= objArrT.length) {
            objArrT = t(objArrT, i, objArrT.length * 2);
        }
        wg2.f(objArrT, s() + ((long) i), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [lu2<j6g>[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final lu2<j6g>[] r(lu2<j6g>[] lu2VarArr) {
        Object[] objArr;
        pde pdeVar;
        qw1 qw1Var;
        int length = lu2VarArr.length;
        if (this.b != 0 && (objArr = this.a) != null) {
            int length2 = objArr.length;
            int i = 0;
            lu2VarArr = lu2VarArr;
            while (i < length2) {
                Object obj = objArr[i];
                if (obj != null && (qw1Var = (pdeVar = (pde) obj).b) != null && v(pdeVar) >= 0) {
                    int length3 = lu2VarArr.length;
                    lu2VarArr = lu2VarArr;
                    if (length >= length3) {
                        lu2VarArr = Arrays.copyOf((Object[]) lu2VarArr, Math.max(2, lu2VarArr.length * 2));
                    }
                    ((lu2[]) lu2VarArr)[length] = qw1Var;
                    pdeVar.b = null;
                    length++;
                }
                i++;
                lu2VarArr = lu2VarArr;
            }
        }
        return (lu2[]) lu2VarArr;
    }

    public final long s() {
        return Math.min(this.Y, this.X);
    }

    public final Object[] t(Object[] objArr, int i, int i2) {
        if (i2 <= 0) {
            r6.g("Buffer size overflow");
            return null;
        }
        Object[] objArr2 = new Object[i2];
        this.W = objArr2;
        if (objArr != null) {
            long jS = s();
            for (int i3 = 0; i3 < i; i3++) {
                long j = ((long) i3) + jS;
                wg2.f(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean u(T r13) {
        /*
            r12 = this;
            int r1 = r12.b
            int r2 = r12.e
            r9 = 1
            if (r1 != 0) goto L23
            if (r2 != 0) goto Lb
            goto L7e
        Lb:
            r12.q(r13)
            int r1 = r12.Z
            int r1 = r1 + r9
            r12.Z = r1
            if (r1 <= r2) goto L18
            r12.p()
        L18:
            long r1 = r12.s()
            int r3 = r12.Z
            long r3 = (long) r3
            long r1 = r1 + r3
            r12.Y = r1
            return r9
        L23:
            int r1 = r12.Z
            int r3 = r12.f
            if (r1 < r3) goto L46
            long r4 = r12.Y
            long r6 = r12.X
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 > 0) goto L46
            eo1 r1 = r12.V
            int r1 = r1.ordinal()
            if (r1 == 0) goto L44
            if (r1 == r9) goto L46
            r0 = 2
            if (r1 != r0) goto L3f
            goto L7e
        L3f:
            defpackage.l.g()
            r0 = 0
            return r0
        L44:
            r0 = 0
            return r0
        L46:
            r12.q(r13)
            int r1 = r12.Z
            int r1 = r1 + r9
            r12.Z = r1
            if (r1 <= r3) goto L53
            r12.p()
        L53:
            long r3 = r12.s()
            int r1 = r12.Z
            long r5 = (long) r1
            long r3 = r3 + r5
            long r5 = r12.X
            long r3 = r3 - r5
            int r1 = (int) r3
            if (r1 <= r2) goto L7e
            r1 = 1
            long r1 = r1 + r5
            long r3 = r12.Y
            long r5 = r12.s()
            int r7 = r12.Z
            long r7 = (long) r7
            long r5 = r5 + r7
            long r7 = r12.s()
            int r10 = r12.Z
            long r10 = (long) r10
            long r7 = r7 + r10
            int r10 = r12.a0
            long r10 = (long) r10
            long r7 = r7 + r10
            r0 = r12
            r0.x(r1, r3, r5, r7)
        L7e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nde.u(java.lang.Object):boolean");
    }

    public final long v(pde pdeVar) {
        long j = pdeVar.a;
        if (j >= s() + ((long) this.Z) && (this.f > 0 || j > s() || this.a0 == 0)) {
            return -1L;
        }
        return j;
    }

    public final Object w(pde pdeVar) {
        Object obj;
        lu2<j6g>[] lu2VarArrY = h4.b;
        synchronized (this) {
            try {
                long jV = v(pdeVar);
                if (jV < 0) {
                    obj = wg2.b0;
                } else {
                    long j = pdeVar.a;
                    Object[] objArr = this.W;
                    objArr.getClass();
                    Object obj2 = objArr[((int) jV) & (objArr.length - 1)];
                    if (obj2 instanceof a) {
                        obj2 = ((a) obj2).c;
                    }
                    pdeVar.a = jV + 1;
                    Object obj3 = obj2;
                    lu2VarArrY = y(j);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (lu2<j6g> lu2Var : lu2VarArrY) {
            if (lu2Var != null) {
                lu2Var.resumeWith(j6g.a);
            }
        }
        return obj;
    }

    public final void x(long j, long j2, long j3, long j4) {
        long jMin = Math.min(j2, j);
        for (long jS = s(); jS < jMin; jS++) {
            Object[] objArr = this.W;
            objArr.getClass();
            wg2.f(objArr, jS, null);
        }
        this.X = j;
        this.Y = j2;
        this.Z = (int) (j3 - jMin);
        this.a0 = (int) (j4 - j3);
    }

    public final lu2<j6g>[] y(long j) {
        long j2;
        long j3;
        long j4;
        lu2<j6g>[] lu2VarArr;
        lu2<j6g>[] lu2VarArr2;
        Object[] objArr;
        ux0 ux0Var = wg2.b0;
        lu2<j6g>[] lu2VarArr3 = h4.b;
        if (j <= this.Y) {
            long jS = s();
            long j5 = ((long) this.Z) + jS;
            int i = this.f;
            if (i == 0 && this.a0 > 0) {
                j5++;
            }
            int i2 = 0;
            if (this.b != 0 && (objArr = this.a) != null) {
                for (Object obj : objArr) {
                    if (obj != null) {
                        long j6 = ((pde) obj).a;
                        if (j6 >= 0 && j6 < j5) {
                            j5 = j6;
                        }
                    }
                }
            }
            if (j5 > this.Y) {
                long jS2 = s() + ((long) this.Z);
                int i3 = this.b;
                int iMin = this.a0;
                if (i3 > 0) {
                    j2 = 1;
                    iMin = Math.min(iMin, i - ((int) (jS2 - j5)));
                } else {
                    j2 = 1;
                }
                long j7 = ((long) this.a0) + jS2;
                if (iMin > 0) {
                    Object[] objArr2 = this.W;
                    objArr2.getClass();
                    j3 = jS;
                    lu2<j6g>[] lu2VarArr4 = new lu2[iMin];
                    long j8 = jS2;
                    while (true) {
                        if (jS2 >= j7) {
                            lu2VarArr2 = lu2VarArr4;
                            j4 = j5;
                            break;
                        }
                        lu2VarArr2 = lu2VarArr4;
                        Object obj2 = objArr2[((int) jS2) & (objArr2.length - 1)];
                        if (obj2 != ux0Var) {
                            obj2.getClass();
                            a aVar = (a) obj2;
                            j4 = j5;
                            int i4 = i2 + 1;
                            lu2VarArr2[i2] = aVar.d;
                            wg2.f(objArr2, jS2, ux0Var);
                            wg2.f(objArr2, j8, aVar.c);
                            j8 += j2;
                            if (i4 >= iMin) {
                                break;
                            }
                            i2 = i4;
                        } else {
                            j4 = j5;
                        }
                        jS2 += j2;
                        lu2VarArr4 = lu2VarArr2;
                        j5 = j4;
                    }
                    jS2 = j8;
                    lu2VarArr = lu2VarArr2;
                } else {
                    j3 = jS;
                    j4 = j5;
                    lu2VarArr = lu2VarArr3;
                }
                int i5 = (int) (jS2 - j3);
                long j9 = this.b == 0 ? jS2 : j4;
                long jMax = Math.max(this.X, jS2 - ((long) Math.min(this.e, i5)));
                if (i == 0 && jMax < j7) {
                    Object[] objArr3 = this.W;
                    objArr3.getClass();
                    if (wl7.b(objArr3[((int) jMax) & (objArr3.length - 1)], ux0Var)) {
                        jS2 += j2;
                        jMax += j2;
                    }
                }
                x(jMax, j9, jS2, j7);
                n();
                return lu2VarArr.length == 0 ? lu2VarArr : r(lu2VarArr);
            }
        }
        return lu2VarArr3;
    }
}
