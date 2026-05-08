package defpackage;

import androidx.compose.runtime.d;
import androidx.compose.runtime.r;
import defpackage.wle;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class qme {
    public final Function1<gu5<j6g>, j6g> a;
    public boolean c;
    public vle h;
    public a i;
    public final AtomicReference<Object> b = new AtomicReference<>(null);
    public final ey d = new ey(this, 10);
    public final ui e = new ui(this, 14);
    public final j4a<a> f = new j4a<>(new a[16]);
    public final Object g = new Object();
    public long j = -1;

    public static final class a {
        public final Function1<Object, j6g> a;
        public Object b;
        public o3a<Object> c;
        public int j;
        public int d = -1;
        public final z3a<Object, Object> e = lnd.b();
        public final z3a<Object, o3a<Object>> f = new z3a<>((Object) null);
        public final a4a<Object> g = new a4a<>((Object) null);
        public final j4a<bz3<?>> h = new j4a<>(new bz3[16]);
        public final C0394a i = new C0394a();
        public final z3a<Object, Object> k = lnd.b();
        public final HashMap<bz3<?>, Object> l = new HashMap<>();

        /* JADX INFO: renamed from: qme$a$a, reason: collision with other inner class name */
        public static final class C0394a implements cz3 {
            public C0394a() {
            }

            @Override // defpackage.cz3
            public final void a() {
                a aVar = a.this;
                aVar.j--;
            }

            @Override // defpackage.cz3
            public final void start() {
                a.this.j++;
            }
        }

        public a(Function1<Object, j6g> function1) {
            this.a = function1;
        }

        public final void a(Object obj, ui uiVar, gu5 gu5Var) {
            boolean z;
            int i;
            int i2;
            Object obj2 = this.b;
            o3a<Object> o3aVar = this.c;
            int i3 = this.d;
            this.b = obj;
            this.c = this.f.d(obj);
            if (this.d == -1) {
                this.d = Long.hashCode(ame.j().g());
            }
            C0394a c0394a = this.i;
            j4a<cz3> j4aVarB = r.b();
            boolean z2 = true;
            try {
                j4aVarB.b(c0394a);
                wle.e.getClass();
                wle.a.c(uiVar, gu5Var);
                j4aVarB.k(j4aVarB.c - 1);
                Object obj3 = this.b;
                obj3.getClass();
                int i4 = this.d;
                o3a<Object> o3aVar2 = this.c;
                if (o3aVar2 != null) {
                    long[] jArr = o3aVar2.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i6 = 8;
                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                z = z2;
                                int i8 = 0;
                                while (i8 < i7) {
                                    if ((j & 255) < 128) {
                                        int i9 = (i5 << 3) + i8;
                                        i2 = i6;
                                        Object obj4 = o3aVar2.b[i9];
                                        i = i8;
                                        boolean z3 = o3aVar2.c[i9] != i4 ? z : false;
                                        if (z3) {
                                            d(obj3, obj4);
                                        }
                                        if (z3) {
                                            o3aVar2.g(i9);
                                        }
                                    } else {
                                        i = i8;
                                        i2 = i6;
                                    }
                                    j >>= i2;
                                    i8 = i + 1;
                                    i6 = i2;
                                }
                                if (i7 != i6) {
                                    break;
                                }
                            } else {
                                z = z2;
                            }
                            if (i5 == length) {
                                break;
                            }
                            i5++;
                            z2 = z;
                        }
                    }
                }
                this.b = obj2;
                this.c = o3aVar;
                this.d = i3;
            } catch (Throwable th) {
                j4aVarB.k(j4aVarB.c - 1);
                throw th;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:122:0x02b4 A[PHI: r12
  0x02b4: PHI (r12v47 boolean) = (r12v46 boolean), (r12v48 boolean) binds: [B:113:0x028d, B:121:0x02b2] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:191:0x0439  */
        /* JADX WARN: Removed duplicated region for block: B:226:0x04ef A[PHI: r12
  0x04ef: PHI (r12v15 boolean) = (r12v14 boolean), (r12v16 boolean) binds: [B:217:0x04c8, B:225:0x04ed] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:231:0x04ff  */
        /* JADX WARN: Removed duplicated region for block: B:234:0x0509  */
        /* JADX WARN: Removed duplicated region for block: B:249:0x054c A[EDGE_INSN: B:249:0x054c->B:329:0x0555 BREAK  A[LOOP:18: B:239:0x051b->B:250:0x054e], PHI: r12
  0x054c: PHI (r12v5 boolean) = (r12v4 boolean), (r12v6 boolean) binds: [B:240:0x0525, B:248:0x054a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:326:0x0555 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:62:0x015f  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x024e A[PHI: r12
  0x024e: PHI (r12v57 boolean) = (r12v56 boolean), (r12v58 boolean) binds: [B:90:0x0227, B:98:0x024c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean b(java.util.Set<? extends java.lang.Object> r45) {
            /*
                Method dump skipped, instruction units count: 1616
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: qme.a.b(java.util.Set):boolean");
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void c(java.lang.Object r21, int r22, java.lang.Object r23, defpackage.o3a<java.lang.Object> r24) {
            /*
                r20 = this;
                r0 = r20
                r1 = r21
                r2 = r22
                r3 = r24
                int r4 = r0.j
                if (r4 <= 0) goto Le
                goto La4
            Le:
                int r4 = r3.c(r1)
                if (r4 >= 0) goto L17
                int r4 = ~r4
                r6 = -1
                goto L1b
            L17:
                int[] r6 = r3.c
                r6 = r6[r4]
            L1b:
                java.lang.Object[] r7 = r3.b
                r7[r4] = r1
                int[] r3 = r3.c
                r3[r4] = r2
                boolean r3 = r1 instanceof defpackage.bz3
                r4 = 2
                if (r3 == 0) goto L90
                if (r6 == r2) goto L90
                r2 = r1
                bz3 r2 = (defpackage.bz3) r2
                az3$a r2 = r2.w()
                java.util.HashMap<bz3<?>, java.lang.Object> r3 = r0.l
                java.lang.Object r7 = r2.f
                r3.put(r1, r7)
                o3a r2 = r2.e
                z3a<java.lang.Object, java.lang.Object> r3 = r0.k
                defpackage.ypd.R(r3, r1)
                java.lang.Object[] r7 = r2.b
                long[] r2 = r2.a
                int r8 = r2.length
                int r8 = r8 - r4
                if (r8 < 0) goto L90
                r10 = 0
            L48:
                r11 = r2[r10]
                long r13 = ~r11
                r15 = 7
                long r13 = r13 << r15
                long r13 = r13 & r11
                r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r13 = r13 & r15
                int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                if (r13 == 0) goto L8b
                int r13 = r10 - r8
                int r13 = ~r13
                int r13 = r13 >>> 31
                r14 = 8
                int r13 = 8 - r13
                r15 = 0
            L62:
                if (r15 >= r13) goto L89
                r16 = 255(0xff, double:1.26E-321)
                long r16 = r11 & r16
                r18 = 128(0x80, double:6.32E-322)
                int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
                if (r16 >= 0) goto L85
                int r16 = r10 << 3
                int r16 = r16 + r15
                r16 = r7[r16]
                r9 = r16
                pse r9 = (defpackage.pse) r9
                boolean r5 = r9 instanceof defpackage.qse
                if (r5 == 0) goto L82
                r5 = r9
                qse r5 = (defpackage.qse) r5
                r5.z(r4)
            L82:
                defpackage.ypd.r(r3, r9, r1)
            L85:
                long r11 = r11 >> r14
                int r15 = r15 + 1
                goto L62
            L89:
                if (r13 != r14) goto L90
            L8b:
                if (r10 == r8) goto L90
                int r10 = r10 + 1
                goto L48
            L90:
                r2 = -1
                if (r6 != r2) goto La4
                boolean r2 = r1 instanceof defpackage.qse
                if (r2 == 0) goto L9d
                r2 = r1
                qse r2 = (defpackage.qse) r2
                r2.z(r4)
            L9d:
                z3a<java.lang.Object, java.lang.Object> r0 = r0.e
                r2 = r23
                defpackage.ypd.r(r0, r1, r2)
            La4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qme.a.c(java.lang.Object, int, java.lang.Object, o3a):void");
        }

        public final void d(Object obj, Object obj2) {
            z3a<Object, Object> z3aVar = this.e;
            ypd.Q(z3aVar, obj2, obj);
            if (!(obj2 instanceof bz3) || z3aVar.b(obj2)) {
                return;
            }
            ypd.R(this.k, obj2);
            this.l.remove(obj2);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void e(kotlin.jvm.functions.Function1<java.lang.Object, java.lang.Boolean> r34) {
            /*
                Method dump skipped, instruction units count: 225
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: qme.a.e(kotlin.jvm.functions.Function1):void");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public qme(Function1<? super gu5<j6g>, j6g> function1) {
        this.a = function1;
    }

    public final void a() {
        synchronized (this.g) {
            try {
                j4a<a> j4aVar = this.f;
                a[] aVarArr = j4aVar.a;
                int i = j4aVar.c;
                for (int i2 = 0; i2 < i; i2++) {
                    a aVar = aVarArr[i2];
                    aVar.e.g();
                    aVar.f.g();
                    aVar.k.g();
                    aVar.l.clear();
                }
                j6g j6gVar = j6g.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            java.lang.Object r2 = r0.g
            monitor-enter(r2)
            j4a<qme$a> r0 = r0.f     // Catch: java.lang.Throwable -> L8e
            int r3 = r0.c     // Catch: java.lang.Throwable -> L8e
            r5 = 0
            r6 = 0
        Ld:
            T[] r7 = r0.a
            if (r5 >= r3) goto L94
            r7 = r7[r5]     // Catch: java.lang.Throwable -> L8e
            qme$a r7 = (qme.a) r7     // Catch: java.lang.Throwable -> L8e
            z3a<java.lang.Object, o3a<java.lang.Object>> r8 = r7.f     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r8 = r8.k(r1)     // Catch: java.lang.Throwable -> L8e
            o3a r8 = (defpackage.o3a) r8     // Catch: java.lang.Throwable -> L8e
            if (r8 != 0) goto L21
        L1f:
            r15 = r5
            goto L78
        L21:
            java.lang.Object[] r9 = r8.b     // Catch: java.lang.Throwable -> L8e
            int[] r10 = r8.c     // Catch: java.lang.Throwable -> L8e
            long[] r8 = r8.a     // Catch: java.lang.Throwable -> L8e
            int r11 = r8.length     // Catch: java.lang.Throwable -> L8e
            int r11 = r11 + (-2)
            if (r11 < 0) goto L1f
            r12 = 0
        L2d:
            r13 = r8[r12]     // Catch: java.lang.Throwable -> L8e
            r15 = r5
            long r4 = ~r13     // Catch: java.lang.Throwable -> L8e
            r16 = 7
            long r4 = r4 << r16
            long r4 = r4 & r13
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r4 = r4 & r16
            int r4 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r4 == 0) goto L72
            int r4 = r12 - r11
            int r4 = ~r4     // Catch: java.lang.Throwable -> L8e
            int r4 = r4 >>> 31
            r5 = 8
            int r4 = 8 - r4
            r16 = r5
            r5 = 0
        L4d:
            if (r5 >= r4) goto L6e
            r17 = 255(0xff, double:1.26E-321)
            long r17 = r13 & r17
            r19 = 128(0x80, double:6.32E-322)
            int r17 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r17 >= 0) goto L67
            int r17 = r12 << 3
            int r17 = r17 + r5
            r18 = r5
            r5 = r9[r17]     // Catch: java.lang.Throwable -> L8e
            r17 = r10[r17]     // Catch: java.lang.Throwable -> L8e
            r7.d(r1, r5)     // Catch: java.lang.Throwable -> L8e
            goto L69
        L67:
            r18 = r5
        L69:
            long r13 = r13 >> r16
            int r5 = r18 + 1
            goto L4d
        L6e:
            r5 = r16
            if (r4 != r5) goto L78
        L72:
            if (r12 == r11) goto L78
            int r12 = r12 + 1
            r5 = r15
            goto L2d
        L78:
            z3a<java.lang.Object, o3a<java.lang.Object>> r4 = r7.f     // Catch: java.lang.Throwable -> L8e
            boolean r4 = r4.f()     // Catch: java.lang.Throwable -> L8e
            if (r4 != 0) goto L83
            int r6 = r6 + 1
            goto L90
        L83:
            if (r6 <= 0) goto L90
            T[] r4 = r0.a     // Catch: java.lang.Throwable -> L8e
            int r5 = r15 - r6
            r7 = r4[r15]     // Catch: java.lang.Throwable -> L8e
            r4[r5] = r7     // Catch: java.lang.Throwable -> L8e
            goto L90
        L8e:
            r0 = move-exception
            goto La0
        L90:
            int r5 = r15 + 1
            goto Ld
        L94:
            int r1 = r3 - r6
            r4 = 0
            java.util.Arrays.fill(r7, r1, r3, r4)     // Catch: java.lang.Throwable -> L8e
            r0.c = r1     // Catch: java.lang.Throwable -> L8e
            j6g r0 = defpackage.j6g.a     // Catch: java.lang.Throwable -> L8e
            monitor-exit(r2)
            return
        La0:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qme.b(java.lang.Object):void");
    }

    public final boolean c() {
        boolean z;
        Set<? extends Object> set;
        Set<? extends Object> set2;
        synchronized (this.g) {
            z = this.c;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            AtomicReference<Object> atomicReference = this.b;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                objSubList = null;
                Object objSubList = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        d.d("Unexpected notification");
                        r40.e();
                        return false;
                    }
                    List list = (List) obj;
                    Set<? extends Object> set3 = (Set) list.get(0);
                    if (list.size() == 2) {
                        objSubList = list.get(1);
                    } else if (list.size() > 2) {
                        objSubList = list.subList(1, list.size());
                    }
                    set2 = set3;
                }
                while (!atomicReference.compareAndSet(obj, objSubList)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                set = set2;
                break;
            }
            if (set == null) {
                return z2;
            }
            synchronized (this.g) {
                try {
                    j4a<a> j4aVar = this.f;
                    a[] aVarArr = j4aVar.a;
                    int i = j4aVar.c;
                    for (int i2 = 0; i2 < i; i2++) {
                        z2 = aVarArr[i2].b(set) || z2;
                    }
                    j6g j6gVar = j6g.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final <T> void d(T t, Function1<? super T, j6g> function1, gu5<j6g> gu5Var) {
        a aVar;
        a aVar2;
        synchronized (this.g) {
            j4a<a> j4aVar = this.f;
            a[] aVarArr = j4aVar.a;
            int i = j4aVar.c;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    aVar = null;
                    break;
                }
                aVar = aVarArr[i2];
                if (aVar.a == function1) {
                    break;
                } else {
                    i2++;
                }
            }
            aVar2 = aVar;
            if (aVar2 == null) {
                function1.getClass();
                pxf.d(1, function1);
                aVar2 = new a(function1);
                j4aVar.b(aVar2);
            }
        }
        a aVar3 = this.i;
        long j = this.j;
        if (j != -1 && j != hh1.u()) {
            StringBuilder sbI = w40.i(j, "Detected multithreaded access to SnapshotStateObserver: previousThreadId=", "), currentThread={id=");
            sbI.append(hh1.u());
            sbI.append(", name=");
            sbI.append(Thread.currentThread().getName());
            sbI.append("}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
            gib.a(sbI.toString());
        }
        try {
            this.i = aVar2;
            this.j = hh1.u();
            aVar2.a(t, this.e, gu5Var);
        } finally {
            this.i = aVar3;
            this.j = j;
        }
    }
}
