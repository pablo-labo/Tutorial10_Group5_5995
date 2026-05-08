package defpackage;

import androidx.compose.runtime.r;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class az3<T> extends qse implements bz3<T> {
    public final gu5<T> b;
    public final hme<T> c;
    public a<T> d = new a<>(ame.j().g());

    public static final class a<T> extends rse {
        public static final Object h = new Object();
        public long c;
        public int d;
        public o3a e;
        public Object f;
        public int g;

        public a(long j) {
            super(j);
            o3a<Object> o3aVar = mna.a;
            o3aVar.getClass();
            this.e = o3aVar;
            this.f = h;
        }

        @Override // defpackage.rse
        public final void a(rse rseVar) {
            rseVar.getClass();
            a aVar = (a) rseVar;
            this.e = aVar.e;
            this.f = aVar.f;
            this.g = aVar.g;
        }

        @Override // defpackage.rse
        public final rse b() {
            return new a(ame.j().g());
        }

        @Override // defpackage.rse
        public final rse c(long j) {
            return new a(j);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean d(defpackage.az3 r7, defpackage.wle r8) {
            /*
                r6 = this;
                java.lang.Object r0 = defpackage.ame.c
                monitor-enter(r0)
                long r1 = r6.c     // Catch: java.lang.Throwable -> L1a
                long r3 = r8.g()     // Catch: java.lang.Throwable -> L1a
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                r2 = 1
                r3 = 0
                if (r1 != 0) goto L1c
                int r1 = r6.d     // Catch: java.lang.Throwable -> L1a
                int r4 = r8.h()     // Catch: java.lang.Throwable -> L1a
                if (r1 == r4) goto L18
                goto L1c
            L18:
                r1 = r3
                goto L1d
            L1a:
                r6 = move-exception
                goto L49
            L1c:
                r1 = r2
            L1d:
                monitor-exit(r0)
                java.lang.Object r4 = r6.f
                java.lang.Object r5 = az3.a.h
                if (r4 == r5) goto L2f
                if (r1 == 0) goto L30
                int r4 = r6.g
                int r7 = r6.e(r7, r8)
                if (r4 != r7) goto L2f
                goto L30
            L2f:
                r2 = r3
            L30:
                if (r2 == 0) goto L48
                if (r1 == 0) goto L48
                monitor-enter(r0)
                long r3 = r8.g()     // Catch: java.lang.Throwable -> L45
                r6.c = r3     // Catch: java.lang.Throwable -> L45
                int r7 = r8.h()     // Catch: java.lang.Throwable -> L45
                r6.d = r7     // Catch: java.lang.Throwable -> L45
                j6g r6 = defpackage.j6g.a     // Catch: java.lang.Throwable -> L45
                monitor-exit(r0)
                return r2
            L45:
                r6 = move-exception
                monitor-exit(r0)
                throw r6
            L48:
                return r2
            L49:
                monitor-exit(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: az3.a.d(az3, wle):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r14v1 */
        /* JADX WARN: Type inference failed for: r14v2, types: [int] */
        /* JADX WARN: Type inference failed for: r14v4 */
        public final int e(az3 az3Var, wle wleVar) {
            o3a o3aVar;
            int iIdentityHashCode;
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            rse rseVarI;
            synchronized (ame.c) {
                o3aVar = this.e;
            }
            int i6 = 7;
            if (o3aVar.e == 0) {
                return 7;
            }
            j4a<cz3> j4aVarB = r.b();
            cz3[] cz3VarArr = j4aVarB.a;
            int i7 = j4aVarB.c;
            boolean z = false;
            for (int i8 = 0; i8 < i7; i8++) {
                cz3VarArr[i8].start();
            }
            try {
                Object[] objArr = o3aVar.b;
                int[] iArr = o3aVar.c;
                long[] jArr = o3aVar.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    iIdentityHashCode = 7;
                    int i9 = 0;
                    while (true) {
                        long j = jArr[i9];
                        if ((((~j) << i6) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i10 = 8;
                            int i11 = 8 - ((~(i9 - length)) >>> 31);
                            for (?? r14 = z; r14 < i11; r14++) {
                                if ((255 & j) < 128) {
                                    int i12 = (i9 << 3) + r14;
                                    i3 = i6;
                                    pse pseVar = (pse) objArr[i12];
                                    i5 = i10;
                                    if (iArr[i12] != 1) {
                                        i4 = length;
                                    } else {
                                        if (pseVar instanceof az3) {
                                            az3 az3Var2 = (az3) pseVar;
                                            rseVarI = az3Var2.A((a) ame.i(az3Var2.d, wleVar), wleVar, z, az3Var2.b);
                                        } else {
                                            rseVarI = ame.i(pseVar.n(), wleVar);
                                        }
                                        i4 = length;
                                        iIdentityHashCode = (((iIdentityHashCode * 31) + System.identityHashCode(rseVarI)) * 31) + Long.hashCode(rseVarI.a);
                                    }
                                } else {
                                    i3 = i6;
                                    i4 = length;
                                    i5 = i10;
                                }
                                j >>= i5;
                                i6 = i3;
                                i10 = i5;
                                length = i4;
                                z = false;
                            }
                            i = i6;
                            i2 = length;
                            if (i11 != i10) {
                                break;
                            }
                        } else {
                            i = i6;
                            i2 = length;
                        }
                        if (i9 == i2) {
                            i6 = iIdentityHashCode;
                            break;
                        }
                        i9++;
                        i6 = i;
                        length = i2;
                        z = false;
                    }
                }
                iIdentityHashCode = i6;
                j6g j6gVar = j6g.a;
                cz3[] cz3VarArr2 = j4aVarB.a;
                int i13 = j4aVarB.c;
                for (int i14 = 0; i14 < i13; i14++) {
                    cz3VarArr2[i14].a();
                }
                return iIdentityHashCode;
            } catch (Throwable th) {
                cz3[] cz3VarArr3 = j4aVarB.a;
                int i15 = j4aVarB.c;
                for (int i16 = 0; i16 < i15; i16++) {
                    cz3VarArr3[i16].a();
                }
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public az3(gu5<? extends T> gu5Var, hme<T> hmeVar) {
        this.b = gu5Var;
        this.c = hmeVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final az3.a<T> A(az3.a<T> r21, defpackage.wle r22, boolean r23, defpackage.gu5<? extends T> r24) {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.az3.A(az3$a, wle, boolean, gu5):az3$a");
    }

    @Override // defpackage.bz3
    public final hme<T> d() {
        return this.c;
    }

    @Override // defpackage.ese
    public final T getValue() {
        wle.e.getClass();
        Function1<Object, j6g> function1E = ame.j().e();
        if (function1E != null) {
            function1E.invoke(this);
        }
        wle wleVarJ = ame.j();
        return (T) A((a) ame.i(this.d, wleVarJ), wleVarJ, true, this.b).f;
    }

    @Override // defpackage.pse
    public final void i(rse rseVar) {
        this.d = (a) rseVar;
    }

    @Override // defpackage.pse
    public final rse n() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        a aVar = (a) ame.h(this.d);
        wle.e.getClass();
        sb.append(aVar.d(this, ame.j()) ? String.valueOf(aVar.f) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }

    @Override // defpackage.bz3
    public final a w() {
        wle.e.getClass();
        wle wleVarJ = ame.j();
        return A((a) ame.i(this.d, wleVarJ), wleVarJ, false, this.b);
    }
}
