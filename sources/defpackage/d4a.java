package defpackage;

import defpackage.xle;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public class d4a extends wle {
    public static final int[] o = new int[0];
    public final Function1<Object, j6g> f;
    public final Function1<Object, j6g> g;
    public int h;
    public a4a<pse> i;
    public ArrayList j;
    public zle k;
    public int[] l;
    public int m;
    public boolean n;

    public d4a(long j, zle zleVar, Function1<Object, j6g> function1, Function1<Object, j6g> function12) {
        super(j, zleVar);
        this.f = function1;
        this.g = function12;
        this.k = zle.e;
        this.l = o;
        this.m = 1;
    }

    public final void A(long j) {
        synchronized (ame.c) {
            this.k = this.k.g(j);
            j6g j6gVar = j6g.a;
        }
    }

    public void B(a4a<pse> a4aVar) {
        this.i = a4aVar;
    }

    public d4a C(Function1<Object, j6g> function1, Function1<Object, j6g> function12) {
        pea peaVar;
        if (this.c) {
            gib.a("Cannot use a disposed snapshot");
        }
        if (this.n && this.d < 0) {
            gib.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(g());
        Object obj = ame.c;
        synchronized (obj) {
            long j = ame.e;
            ame.e = j + 1;
            ame.d = ame.d.g(j);
            zle zleVarD = d();
            r(zleVarD.g(j));
            peaVar = new pea(j, ame.d(zleVarD, g() + 1, j), ame.k(function1, e(), true), ame.a(function12, i()), this);
        }
        if (this.n || this.c) {
            return peaVar;
        }
        long jG = g();
        synchronized (obj) {
            long j2 = ame.e;
            ame.e = j2 + 1;
            s(j2);
            ame.d = ame.d.g(g());
            j6g j6gVar = j6g.a;
        }
        r(ame.d(d(), jG + 1, g()));
        return peaVar;
    }

    @Override // defpackage.wle
    public final void b() {
        ame.d = ame.d.b(g()).a(this.k);
    }

    @Override // defpackage.wle
    public void c() {
        if (this.c) {
            return;
        }
        super.c();
        l();
    }

    @Override // defpackage.wle
    public boolean f() {
        return false;
    }

    @Override // defpackage.wle
    public int h() {
        return this.h;
    }

    @Override // defpackage.wle
    public Function1<Object, j6g> i() {
        return this.g;
    }

    @Override // defpackage.wle
    public void k() {
        this.m++;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    @Override // defpackage.wle
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l() {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.m
            if (r1 <= 0) goto L7
            goto Lc
        L7:
            java.lang.String r1 = "no pending nested snapshots"
            defpackage.gib.a(r1)
        Lc:
            int r1 = r0.m
            int r1 = r1 + (-1)
            r0.m = r1
            if (r1 != 0) goto L94
            boolean r1 = r0.n
            if (r1 != 0) goto L94
            a4a r1 = r0.x()
            if (r1 == 0) goto L91
            boolean r2 = r0.n
            if (r2 == 0) goto L27
            java.lang.String r2 = "Unsupported operation on a snapshot that has been applied"
            defpackage.gib.b(r2)
        L27:
            r2 = 0
            r0.B(r2)
            long r2 = r0.g()
            java.lang.Object[] r4 = r1.b
            long[] r1 = r1.a
            int r5 = r1.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L91
            r7 = 0
        L39:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L8c
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L53:
            if (r12 >= r10) goto L8a
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L86
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r4[r13]
            pse r13 = (defpackage.pse) r13
            rse r13 = r13.n()
        L69:
            if (r13 == 0) goto L86
            long r14 = r13.a
            int r16 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r16 == 0) goto L7d
            zle r6 = r0.k
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            boolean r6 = defpackage.z92.I0(r6, r14)
            if (r6 == 0) goto L83
        L7d:
            nf r6 = defpackage.ame.a
            r14 = 0
            r13.a = r14
        L83:
            rse r13 = r13.b
            goto L69
        L86:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L53
        L8a:
            if (r10 != r11) goto L91
        L8c:
            if (r7 == r5) goto L91
            int r7 = r7 + 1
            goto L39
        L91:
            r0.a()
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d4a.l():void");
    }

    @Override // defpackage.wle
    public void m() {
        if (this.n || this.c) {
            return;
        }
        v();
    }

    @Override // defpackage.wle
    public void n(pse pseVar) {
        a4a<pse> a4aVarX = x();
        if (a4aVarX == null) {
            a4aVarX = nnd.a();
            B(a4aVarX);
        }
        a4aVarX.d(pseVar);
    }

    @Override // defpackage.wle
    public final void p() {
        int length = this.l.length;
        for (int i = 0; i < length; i++) {
            ame.t(this.l[i]);
        }
        o();
    }

    @Override // defpackage.wle
    public void t(int i) {
        this.h = i;
    }

    @Override // defpackage.wle
    public wle u(Function1<Object, j6g> function1) {
        rea reaVar;
        if (this.c) {
            gib.a("Cannot use a disposed snapshot");
        }
        if (this.n && this.d < 0) {
            gib.b("Unsupported operation on a disposed or applied snapshot");
        }
        long jG = g();
        A(g());
        Object obj = ame.c;
        synchronized (obj) {
            long j = ame.e;
            ame.e = j + 1;
            ame.d = ame.d.g(j);
            reaVar = new rea(j, ame.d(d(), jG + 1, j), ame.k(function1, e(), true), this);
        }
        if (this.n || this.c) {
            return reaVar;
        }
        long jG2 = g();
        synchronized (obj) {
            long j2 = ame.e;
            ame.e = j2 + 1;
            s(j2);
            ame.d = ame.d.g(g());
            j6g j6gVar = j6g.a;
        }
        r(ame.d(d(), jG2 + 1, g()));
        return reaVar;
    }

    public final void v() {
        A(g());
        j6g j6gVar = j6g.a;
        if (this.n || this.c) {
            return;
        }
        long jG = g();
        synchronized (ame.c) {
            long j = ame.e;
            ame.e = j + 1;
            s(j);
            ame.d = ame.d.g(g());
        }
        r(ame.d(d(), jG + 1, g()));
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.xle w() {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d4a.w():xle");
    }

    public a4a<pse> x() {
        return this.i;
    }

    @Override // defpackage.wle
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public Function1<Object, j6g> e() {
        return this.f;
    }

    public final xle z(long j, a4a a4aVar, HashMap map, zle zleVar) {
        ArrayList arrayList;
        ArrayList arrayListH1;
        ArrayList arrayList2;
        zle zleVar2;
        Object[] objArr;
        long[] jArr;
        zle zleVar3;
        Object[] objArr2;
        long[] jArr2;
        int i;
        long j2;
        ArrayList arrayList3;
        rse rseVarO;
        zle zleVarF = d().g(g()).f(this.k);
        Object[] objArr3 = a4aVar.b;
        long[] jArr3 = a4aVar.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            arrayList2 = null;
            arrayListH1 = null;
            while (true) {
                long j3 = jArr3[i2];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((j3 & 255) < 128) {
                            objArr2 = objArr3;
                            pse pseVar = (pse) objArr3[(i2 << 3) + i4];
                            jArr2 = jArr3;
                            rse rseVarN = pseVar.n();
                            i = i4;
                            ArrayList arrayList4 = arrayList2;
                            rse rseVarR = ame.r(rseVarN, j, zleVar);
                            if (rseVarR == null) {
                                arrayList3 = arrayListH1;
                                j2 = j3;
                            } else {
                                arrayList3 = arrayListH1;
                                j2 = j3;
                                rse rseVarR2 = ame.r(rseVarN, g(), zleVarF);
                                if (rseVarR2 != null && rseVarR2.a != 1 && !rseVarR.equals(rseVarR2)) {
                                    zleVar3 = zleVarF;
                                    rse rseVarR3 = ame.r(rseVarN, g(), d());
                                    if (rseVarR3 == null) {
                                        ame.q();
                                        throw null;
                                    }
                                    if (map == null || (rseVarO = (rse) map.get(rseVarR)) == null) {
                                        rseVarO = pseVar.o(rseVarR2, rseVarR, rseVarR3);
                                    }
                                    if (rseVarO == null) {
                                        return new xle.a(this);
                                    }
                                    if (!rseVarO.equals(rseVarR3)) {
                                        if (rseVarO.equals(rseVarR)) {
                                            ArrayList arrayList5 = arrayList4 == null ? new ArrayList() : arrayList4;
                                            arrayList5.add(new Pair(pseVar, rseVarR.c(g())));
                                            arrayListH1 = arrayList3 == null ? new ArrayList() : arrayList3;
                                            arrayListH1.add(pseVar);
                                            arrayList2 = arrayList5;
                                        } else {
                                            arrayList2 = arrayList4 == null ? new ArrayList() : arrayList4;
                                            arrayList2.add(!rseVarO.equals(rseVarR2) ? new Pair(pseVar, rseVarO) : new Pair(pseVar, rseVarR2.c(g())));
                                        }
                                    }
                                    arrayListH1 = arrayList3;
                                }
                                arrayList2 = arrayList4;
                                arrayListH1 = arrayList3;
                            }
                            zleVar3 = zleVarF;
                            arrayList2 = arrayList4;
                            arrayListH1 = arrayList3;
                        } else {
                            zleVar3 = zleVarF;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i = i4;
                            j2 = j3;
                        }
                        j3 = j2 >> 8;
                        i4 = i + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        zleVarF = zleVar3;
                    }
                    zleVar2 = zleVarF;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i3 != 8) {
                        break;
                    }
                } else {
                    zleVar2 = zleVarF;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i2 == length) {
                    arrayList = arrayList2;
                    break;
                }
                i2++;
                jArr3 = jArr;
                objArr3 = objArr;
                zleVarF = zleVar2;
            }
        } else {
            arrayList = null;
            arrayListH1 = null;
        }
        arrayList2 = arrayList;
        if (arrayList2 != null) {
            v();
            int size = arrayList2.size();
            for (int i5 = 0; i5 < size; i5++) {
                Pair pair = (Pair) arrayList2.get(i5);
                pse pseVar2 = (pse) pair.a();
                rse rseVar = (rse) pair.b();
                rseVar.a = j;
                synchronized (ame.c) {
                    rseVar.b = pseVar2.n();
                    pseVar2.i(rseVar);
                    j6g j6gVar = j6g.a;
                }
            }
        }
        if (arrayListH1 != null) {
            int size2 = arrayListH1.size();
            for (int i6 = 0; i6 < size2; i6++) {
                a4aVar.l((pse) arrayListH1.get(i6));
            }
            ArrayList arrayList6 = this.j;
            if (arrayList6 != null) {
                arrayListH1 = z92.h1(arrayList6, arrayListH1);
            }
            this.j = arrayListH1;
        }
        return xle.b.a;
    }
}
