package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ame {
    public static final nf a = new nf(25);
    public static final sme<wle> b = new sme<>();
    public static final Object c = new Object();
    public static zle d;
    public static long e;
    public static final yle f;
    public static final f3a g;
    public static List<? extends Function2<? super Set<? extends Object>, ? super wle, j6g>> h;
    public static List<? extends Function1<Object, j6g>> i;
    public static final ca6 j;
    public static final iw0 k;

    static {
        zle zleVar = zle.e;
        d = zleVar;
        e = 2L;
        yle yleVar = new yle();
        yleVar.b = new long[16];
        yleVar.c = new int[16];
        int[] iArr = new int[16];
        int i2 = 0;
        while (i2 < 16) {
            int i3 = i2 + 1;
            iArr[i2] = i3;
            i2 = i3;
        }
        yleVar.d = iArr;
        f = yleVar;
        f3a f3aVar = new f3a();
        f3aVar.b = new int[16];
        f3aVar.c = new rug[16];
        g = f3aVar;
        zr4 zr4Var = zr4.a;
        h = zr4Var;
        i = zr4Var;
        long j2 = e;
        e = 1 + j2;
        ca6 ca6Var = new ca6(j2, zleVar, null, new hs(8));
        d = d.g(ca6Var.b);
        j = ca6Var;
        k = new iw0(0);
    }

    public static final Function1 a(Function1 function1, Function1 function12) {
        return (function1 == null || function12 == null || function1 == function12) ? function1 == null ? function12 : function1 : new o72(8, function1, function12, false);
    }

    public static final HashMap b(long j2, d4a d4aVar, zle zleVar) {
        long[] jArr;
        zle zleVar2;
        long[] jArr2;
        zle zleVar3;
        int i2;
        rse rseVarR;
        long j3 = j2;
        a4a<pse> a4aVarX = d4aVar.x();
        if (a4aVarX != null) {
            zle zleVarF = d4aVar.d().g(d4aVar.g()).f(d4aVar.k);
            Object[] objArr = a4aVarX.b;
            long[] jArr3 = a4aVarX.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i3 = 0;
                HashMap map = null;
                while (true) {
                    long j4 = jArr3[i3];
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8;
                        int i5 = 8 - ((~(i3 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j4 & 255) < 128) {
                                pse pseVar = (pse) objArr[(i3 << 3) + i6];
                                rse rseVarN = pseVar.n();
                                jArr2 = jArr3;
                                i2 = i4;
                                rse rseVarR2 = r(rseVarN, j3, zleVar);
                                if (rseVarR2 == null || (rseVarR = r(rseVarN, j3, zleVarF)) == null || rseVarR2.equals(rseVarR)) {
                                    zleVar3 = zleVarF;
                                } else {
                                    zleVar3 = zleVarF;
                                    rse rseVarR3 = r(rseVarN, d4aVar.g(), d4aVar.d());
                                    if (rseVarR3 == null) {
                                        q();
                                        throw null;
                                    }
                                    rse rseVarO = pseVar.o(rseVarR, rseVarR2, rseVarR3);
                                    if (rseVarO == null) {
                                        return null;
                                    }
                                    if (map == null) {
                                        map = new HashMap();
                                    }
                                    map.put(rseVarR2, rseVarO);
                                    map = map;
                                }
                            } else {
                                jArr2 = jArr3;
                                zleVar3 = zleVarF;
                                i2 = i4;
                            }
                            j4 >>= i2;
                            i6++;
                            j3 = j2;
                            i4 = i2;
                            jArr3 = jArr2;
                            zleVarF = zleVar3;
                        }
                        jArr = jArr3;
                        zleVar2 = zleVarF;
                        if (i5 != i4) {
                            return map;
                        }
                    } else {
                        jArr = jArr3;
                        zleVar2 = zleVarF;
                    }
                    if (i3 == length) {
                        return map;
                    }
                    i3++;
                    j3 = j2;
                    jArr3 = jArr;
                    zleVarF = zleVar2;
                }
            }
        }
        return null;
    }

    public static final void c(wle wleVar) {
        long j2;
        if (d.d(wleVar.g())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: snapshotId=");
        sb.append(wleVar.g());
        sb.append(", disposed=");
        sb.append(wleVar.c);
        sb.append(", applied=");
        d4a d4aVar = wleVar instanceof d4a ? (d4a) wleVar : null;
        sb.append(d4aVar != null ? Boolean.valueOf(d4aVar.n) : "read-only");
        sb.append(", lowestPin=");
        synchronized (c) {
            yle yleVar = f;
            j2 = yleVar.a > 0 ? yleVar.b[0] : -1L;
        }
        sb.append(j2);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final zle d(zle zleVar, long j2, long j3) {
        while (wl7.d(j2, j3) < 0) {
            zleVar = zleVar.g(j2);
            j2++;
        }
        return zleVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> T e(kotlin.jvm.functions.Function1<? super defpackage.zle, ? extends T> r15) {
        /*
            ca6 r0 = defpackage.ame.j
            java.lang.Object r1 = defpackage.ame.c
            monitor-enter(r1)
            a4a<pse> r2 = r0.i     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto L13
            iw0 r3 = defpackage.ame.k     // Catch: java.lang.Throwable -> L10
            r4 = 1
            r3.addAndGet(r4)     // Catch: java.lang.Throwable -> L10
            goto L13
        L10:
            r15 = move-exception
            goto L9c
        L13:
            java.lang.Object r15 = u(r0, r15)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)
            r1 = 0
            if (r2 == 0) goto L47
            r3 = -1
            java.util.List<? extends kotlin.jvm.functions.Function2<? super java.util.Set<? extends java.lang.Object>, ? super wle, j6g>> r4 = defpackage.ame.h     // Catch: java.lang.Throwable -> L39
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5     // Catch: java.lang.Throwable -> L39
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L39
            r6 = r1
        L26:
            if (r6 >= r5) goto L3b
            java.lang.Object r7 = r4.get(r6)     // Catch: java.lang.Throwable -> L39
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7     // Catch: java.lang.Throwable -> L39
            ond r8 = new ond     // Catch: java.lang.Throwable -> L39
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L39
            r7.invoke(r8, r0)     // Catch: java.lang.Throwable -> L39
            int r6 = r6 + 1
            goto L26
        L39:
            r15 = move-exception
            goto L41
        L3b:
            iw0 r0 = defpackage.ame.k
            r0.addAndGet(r3)
            goto L47
        L41:
            iw0 r0 = defpackage.ame.k
            r0.addAndGet(r3)
            throw r15
        L47:
            java.lang.Object r0 = defpackage.ame.c
            monitor-enter(r0)
            f()     // Catch: java.lang.Throwable -> L89
            if (r2 == 0) goto L98
            java.lang.Object[] r3 = r2.b     // Catch: java.lang.Throwable -> L89
            long[] r2 = r2.a     // Catch: java.lang.Throwable -> L89
            int r4 = r2.length     // Catch: java.lang.Throwable -> L89
            int r4 = r4 + (-2)
            if (r4 < 0) goto L96
            r5 = r1
        L59:
            r6 = r2[r5]     // Catch: java.lang.Throwable -> L89
            long r8 = ~r6     // Catch: java.lang.Throwable -> L89
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L91
            int r8 = r5 - r4
            int r8 = ~r8     // Catch: java.lang.Throwable -> L89
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r1
        L73:
            if (r10 >= r8) goto L8f
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.32E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L8b
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r3[r11]     // Catch: java.lang.Throwable -> L89
            pse r11 = (defpackage.pse) r11     // Catch: java.lang.Throwable -> L89
            p(r11)     // Catch: java.lang.Throwable -> L89
            goto L8b
        L89:
            r15 = move-exception
            goto L9a
        L8b:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L73
        L8f:
            if (r8 != r9) goto L96
        L91:
            if (r5 == r4) goto L96
            int r5 = r5 + 1
            goto L59
        L96:
            j6g r1 = defpackage.j6g.a     // Catch: java.lang.Throwable -> L89
        L98:
            monitor-exit(r0)
            return r15
        L9a:
            monitor-exit(r0)
            throw r15
        L9c:
            monitor-exit(r1)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ame.e(kotlin.jvm.functions.Function1):java.lang.Object");
    }

    public static final void f() {
        f3a f3aVar = g;
        int i2 = f3aVar.a;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            rug rugVar = ((rug[]) f3aVar.c)[i3];
            Object obj = rugVar != null ? rugVar.get() : null;
            if (obj != null && o((pse) obj)) {
                if (i4 != i3) {
                    ((rug[]) f3aVar.c)[i4] = rugVar;
                    int[] iArr = (int[]) f3aVar.b;
                    iArr[i4] = iArr[i3];
                }
                i4++;
            }
            i3++;
        }
        for (int i5 = i4; i5 < i2; i5++) {
            ((rug[]) f3aVar.c)[i5] = null;
            ((int[]) f3aVar.b)[i5] = 0;
        }
        if (i4 != i2) {
            f3aVar.a = i4;
        }
    }

    public static final wle g(wle wleVar, Function1<Object, j6g> function1, boolean z) {
        boolean z2 = wleVar instanceof d4a;
        if (z2 || wleVar == null) {
            return new wsf(z2 ? (d4a) wleVar : null, function1, null, false, z);
        }
        return new xsf(wleVar, function1, false, z);
    }

    public static final <T extends rse> T h(T t) {
        T t2;
        wle.e.getClass();
        wle wleVarJ = j();
        T t3 = (T) r(t, wleVarJ.g(), wleVarJ.d());
        if (t3 != null) {
            return t3;
        }
        synchronized (c) {
            wle wleVarJ2 = j();
            t2 = (T) r(t, wleVarJ2.g(), wleVarJ2.d());
        }
        if (t2 != null) {
            return t2;
        }
        q();
        throw null;
    }

    public static final <T extends rse> T i(T t, wle wleVar) {
        T t2;
        T t3 = (T) r(t, wleVar.g(), wleVar.d());
        if (t3 != null) {
            return t3;
        }
        synchronized (c) {
            t2 = (T) r(t, wleVar.g(), wleVar.d());
        }
        if (t2 != null) {
            return t2;
        }
        q();
        throw null;
    }

    public static final wle j() {
        wle wleVarA = b.a();
        return wleVarA == null ? j : wleVarA;
    }

    public static final Function1<Object, j6g> k(Function1<Object, j6g> function1, Function1<Object, j6g> function12, boolean z) {
        if (!z) {
            function12 = null;
        }
        return (function1 == null || function12 == null || function1 == function12) ? function1 == null ? function12 : function1 : new m72(8, function1, function12, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        r3 = (T) r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T extends defpackage.rse> T l(T r10, defpackage.pse r11) {
        /*
            rse r0 = r11.n()
            long r1 = defpackage.ame.e
            yle r3 = defpackage.ame.f
            int r4 = r3.a
            if (r4 <= 0) goto L12
            long[] r1 = r3.b
            r2 = 0
            r2 = r1[r2]
            r1 = r2
        L12:
            r3 = 1
            long r1 = r1 - r3
            r3 = 0
            r4 = r3
        L17:
            if (r0 == 0) goto L49
            long r5 = r0.a
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L22
            goto L42
        L22:
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 == 0) goto L46
            int r7 = defpackage.wl7.d(r5, r1)
            if (r7 > 0) goto L46
            zle r7 = defpackage.zle.e
            boolean r5 = r7.d(r5)
            if (r5 != 0) goto L46
            if (r4 != 0) goto L38
            r4 = r0
            goto L46
        L38:
            long r1 = r0.a
            long r5 = r4.a
            int r1 = defpackage.wl7.d(r1, r5)
            if (r1 >= 0) goto L44
        L42:
            r3 = r0
            goto L49
        L44:
            r3 = r4
            goto L49
        L46:
            rse r0 = r0.b
            goto L17
        L49:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r3 == 0) goto L53
            r3.a = r0
            return r3
        L53:
            rse r10 = r10.c(r0)
            rse r0 = r11.n()
            r10.b = r0
            r11.i(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ame.l(rse, pse):rse");
    }

    public static final void m(wle wleVar, pse pseVar) {
        wleVar.t(wleVar.h() + 1);
        Function1<Object, j6g> function1I = wleVar.i();
        if (function1I != null) {
            function1I.invoke(pseVar);
        }
    }

    public static final rse n(rse rseVar, qse qseVar, wle wleVar, rse rseVar2) {
        rse rseVarL;
        if (wleVar.f()) {
            wleVar.n(qseVar);
        }
        long jG = wleVar.g();
        if (rseVar2.a == jG) {
            return rseVar2;
        }
        synchronized (c) {
            rseVarL = l(rseVar, qseVar);
        }
        rseVarL.a = jG;
        if (rseVar2.a != 1) {
            wleVar.n(qseVar);
        }
        return rseVarL;
    }

    public static final boolean o(pse pseVar) {
        rse rseVar;
        long j2 = e;
        yle yleVar = f;
        if (yleVar.a > 0) {
            j2 = yleVar.b[0];
        }
        rse rseVar2 = null;
        rse rseVarN = null;
        int i2 = 0;
        for (rse rseVarN2 = pseVar.n(); rseVarN2 != null; rseVarN2 = rseVarN2.b) {
            long j3 = rseVarN2.a;
            if (j3 != 0) {
                if (wl7.d(j3, j2) >= 0) {
                    i2++;
                } else if (rseVar2 == null) {
                    i2++;
                    rseVar2 = rseVarN2;
                } else {
                    if (wl7.d(rseVarN2.a, rseVar2.a) < 0) {
                        rseVar = rseVar2;
                        rseVar2 = rseVarN2;
                    } else {
                        rseVar = rseVarN2;
                    }
                    if (rseVarN == null) {
                        rseVarN = pseVar.n();
                        rse rseVar3 = rseVarN;
                        while (true) {
                            if (rseVarN == null) {
                                rseVarN = rseVar3;
                                break;
                            }
                            if (wl7.d(rseVarN.a, j2) >= 0) {
                                break;
                            }
                            if (wl7.d(rseVar3.a, rseVarN.a) < 0) {
                                rseVar3 = rseVarN;
                            }
                            rseVarN = rseVarN.b;
                        }
                    }
                    rseVar2.a = 0L;
                    rseVar2.a(rseVarN);
                    rseVar2 = rseVar;
                }
            }
        }
        return i2 > 1;
    }

    public static final void p(pse pseVar) {
        if (o(pseVar)) {
            f3a f3aVar = g;
            int i2 = f3aVar.a;
            int iIdentityHashCode = System.identityHashCode(pseVar);
            int i3 = -1;
            if (i2 > 0) {
                int i4 = f3aVar.a - 1;
                int i5 = 0;
                while (true) {
                    if (i5 > i4) {
                        i3 = -(i5 + 1);
                        break;
                    }
                    int i6 = (i5 + i4) >>> 1;
                    int i7 = ((int[]) f3aVar.b)[i6];
                    if (i7 < iIdentityHashCode) {
                        i5 = i6 + 1;
                    } else if (i7 > iIdentityHashCode) {
                        i4 = i6 - 1;
                    } else {
                        rug rugVar = ((rug[]) f3aVar.c)[i6];
                        if (pseVar == (rugVar != null ? rugVar.get() : null)) {
                            i3 = i6;
                        } else {
                            for (int i8 = i6 - 1; -1 < i8 && ((int[]) f3aVar.b)[i8] == iIdentityHashCode; i8--) {
                                rug rugVar2 = ((rug[]) f3aVar.c)[i8];
                                if ((rugVar2 != null ? rugVar2.get() : null) == pseVar) {
                                    i3 = i8;
                                    break;
                                }
                            }
                            i6++;
                            int i9 = f3aVar.a;
                            while (true) {
                                if (i6 >= i9) {
                                    i3 = -(f3aVar.a + 1);
                                    break;
                                } else {
                                    if (((int[]) f3aVar.b)[i6] != iIdentityHashCode) {
                                        i3 = -(i6 + 1);
                                        break;
                                    }
                                    rug rugVar3 = ((rug[]) f3aVar.c)[i6];
                                    if ((rugVar3 != null ? rugVar3.get() : null) == pseVar) {
                                        break;
                                    } else {
                                        i6++;
                                    }
                                }
                            }
                            i3 = i6;
                        }
                    }
                }
                if (i3 >= 0) {
                    return;
                }
            }
            int i10 = -(i3 + 1);
            rug[] rugVarArr = (rug[]) f3aVar.c;
            int length = rugVarArr.length;
            if (i2 == length) {
                int i11 = length * 2;
                rug[] rugVarArr2 = new rug[i11];
                int[] iArr = new int[i11];
                int i12 = i10 + 1;
                System.arraycopy(rugVarArr, i10, rugVarArr2, i12, i2 - i10);
                System.arraycopy((rug[]) f3aVar.c, 0, rugVarArr2, 0, i10);
                pyd.h(i12, i10, i2, (int[]) f3aVar.b, iArr);
                pyd.k(0, i10, 6, (int[]) f3aVar.b, iArr);
                f3aVar.c = rugVarArr2;
                f3aVar.b = iArr;
            } else {
                int i13 = i10 + 1;
                System.arraycopy(rugVarArr, i10, rugVarArr, i13, i2 - i10);
                int[] iArr2 = (int[]) f3aVar.b;
                pyd.h(i13, i10, i2, iArr2, iArr2);
            }
            ((rug[]) f3aVar.c)[i10] = new rug(pseVar);
            ((int[]) f3aVar.b)[i10] = iIdentityHashCode;
            f3aVar.a++;
        }
    }

    public static final void q() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final <T extends rse> T r(T t, long j2, zle zleVar) {
        T t2 = null;
        while (t != null) {
            long j3 = t.a;
            if (j3 != 0 && wl7.d(j3, j2) <= 0 && !zleVar.d(j3) && (t2 == null || wl7.d(t2.a, t.a) < 0)) {
                t2 = t;
            }
            t = (T) t.b;
        }
        if (t2 != null) {
            return t2;
        }
        return null;
    }

    public static final <T extends rse> T s(T t, pse pseVar) {
        T t2;
        wle.e.getClass();
        wle wleVarJ = j();
        Function1<Object, j6g> function1E = wleVarJ.e();
        if (function1E != null) {
            function1E.invoke(pseVar);
        }
        T t3 = (T) r(t, wleVarJ.g(), wleVarJ.d());
        if (t3 != null) {
            return t3;
        }
        synchronized (c) {
            wle wleVarJ2 = j();
            rse rseVarN = pseVar.n();
            rseVarN.getClass();
            t2 = (T) r(rseVarN, wleVarJ2.g(), wleVarJ2.d());
            if (t2 == null) {
                q();
                throw null;
            }
        }
        return t2;
    }

    public static final void t(int i2) {
        yle yleVar = f;
        int i3 = yleVar.d[i2];
        yleVar.b(i3, yleVar.a - 1);
        yleVar.a--;
        long[] jArr = yleVar.b;
        long j2 = jArr[i3];
        int i4 = i3;
        while (i4 > 0) {
            int i5 = ((i4 + 1) >> 1) - 1;
            if (wl7.d(jArr[i5], j2) <= 0) {
                break;
            }
            yleVar.b(i5, i4);
            i4 = i5;
        }
        long[] jArr2 = yleVar.b;
        int i6 = yleVar.a >> 1;
        while (i3 < i6) {
            int i7 = (i3 + 1) << 1;
            int i8 = i7 - 1;
            if (i7 < yleVar.a && wl7.d(jArr2[i7], jArr2[i8]) < 0) {
                if (wl7.d(jArr2[i7], jArr2[i3]) >= 0) {
                    break;
                }
                yleVar.b(i7, i3);
                i3 = i7;
            } else {
                if (wl7.d(jArr2[i8], jArr2[i3]) >= 0) {
                    break;
                }
                yleVar.b(i8, i3);
                i3 = i8;
            }
        }
        yleVar.d[i2] = yleVar.e;
        yleVar.e = i2;
    }

    public static final <T> T u(ca6 ca6Var, Function1<? super zle, ? extends T> function1) {
        long j2 = ca6Var.b;
        T tInvoke = function1.invoke(d.b(j2));
        long j3 = e;
        e = 1 + j3;
        zle zleVarB = d.b(j2);
        d = zleVarB;
        ca6Var.b = j3;
        ca6Var.a = zleVarB;
        ca6Var.h = 0;
        ca6Var.i = null;
        ca6Var.o();
        d = d.g(j3);
        return tInvoke;
    }

    public static final <T extends rse> T v(T t, pse pseVar, wle wleVar) {
        T t2;
        if (wleVar.f()) {
            wleVar.n(pseVar);
        }
        long jG = wleVar.g();
        T t3 = (T) r(t, jG, wleVar.d());
        if (t3 == null) {
            q();
            throw null;
        }
        if (t3.a == wleVar.g()) {
            return t3;
        }
        synchronized (c) {
            t2 = (T) r(pseVar.n(), jG, wleVar.d());
            if (t2 == null) {
                q();
                throw null;
            }
            if (t2.a != jG) {
                rse rseVarL = l(t2, pseVar);
                rseVarL.a(t2);
                rseVarL.a = wleVar.g();
                t2 = (T) rseVarL;
            }
        }
        if (t3.a != 1) {
            wleVar.n(pseVar);
        }
        return t2;
    }
}
