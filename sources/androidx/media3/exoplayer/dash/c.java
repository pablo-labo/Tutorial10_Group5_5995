package androidx.media3.exoplayer.dash;

import android.os.SystemClock;
import androidx.media3.common.a;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.datasource.a;
import androidx.media3.exoplayer.dash.a;
import androidx.media3.exoplayer.dash.d;
import androidx.media3.exoplayer.g;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import androidx.media3.exoplayer.upstream.b;
import defpackage.cq1;
import defpackage.d09;
import defpackage.e47;
import defpackage.ea;
import defpackage.fa1;
import defpackage.g98;
import defpackage.gf3;
import defpackage.grf;
import defpackage.heb;
import defpackage.js2;
import defpackage.k42;
import defpackage.ka2;
import defpackage.l3d;
import defpackage.l42;
import defpackage.ld7;
import defpackage.lf9;
import defpackage.lg9;
import defpackage.m42;
import defpackage.m55;
import defpackage.mg9;
import defpackage.mic;
import defpackage.n42;
import defpackage.od3;
import defpackage.p35;
import defpackage.ps5;
import defpackage.qd3;
import defpackage.qq3;
import defpackage.rd3;
import defpackage.ryc;
import defpackage.sd3;
import defpackage.sdb;
import defpackage.she;
import defpackage.st9;
import defpackage.tb1;
import defpackage.vb1;
import defpackage.vjg;
import defpackage.zxe;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes.dex */
public final class c implements androidx.media3.exoplayer.dash.a {
    public final d09 a;
    public final vb1 b;
    public final int[] c;
    public final int d;
    public final androidx.media3.datasource.a e;
    public final long f;
    public final int g;
    public final d.c h;
    public final b[] i;
    public p35 j;
    public od3 k;
    public int l;
    public BehindLiveWindowException m;
    public boolean n;

    public static final class a implements a.InterfaceC0041a {
        public final a.InterfaceC0038a a;
        public final int b;
        public final cq1.b c;

        public a(a.InterfaceC0038a interfaceC0038a) {
            cq1.b bVar = new cq1.b();
            bVar.a = new qq3();
            this.c = bVar;
            this.a = interfaceC0038a;
            this.b = 1;
        }

        @Override // androidx.media3.exoplayer.dash.a.InterfaceC0041a
        public final androidx.media3.common.a a(androidx.media3.common.a aVar) {
            cq1.b bVar = this.c;
            if (!bVar.b || !bVar.a.a(aVar)) {
                return aVar;
            }
            a.C0036a c0036aA = aVar.a();
            String str = aVar.k;
            c0036aA.m = st9.p("application/x-media3-cues");
            c0036aA.K = bVar.a.b(aVar);
            StringBuilder sb = new StringBuilder();
            sb.append(aVar.n);
            sb.append(str != null ? " ".concat(str) : "");
            c0036aA.j = sb.toString();
            c0036aA.r = Long.MAX_VALUE;
            return new androidx.media3.common.a(c0036aA);
        }

        @Override // androidx.media3.exoplayer.dash.a.InterfaceC0041a
        public final c b(d09 d09Var, od3 od3Var, vb1 vb1Var, int i, int[] iArr, p35 p35Var, int i2, long j, boolean z, ArrayList arrayList, d.c cVar, grf grfVar, sdb sdbVar) {
            androidx.media3.datasource.a aVarA = this.a.a();
            if (grfVar != null) {
                aVarA.i(grfVar);
            }
            return new c(this.c, d09Var, od3Var, vb1Var, i, iArr, p35Var, i2, aVarA, j, this.b, z, arrayList, cVar);
        }
    }

    public static final class b {
        public final l42 a;
        public final l3d b;
        public final tb1 c;
        public final qd3 d;
        public final long e;
        public final long f;

        public b(long j, l3d l3dVar, tb1 tb1Var, l42 l42Var, long j2, qd3 qd3Var) {
            this.e = j;
            this.b = l3dVar;
            this.c = tb1Var;
            this.f = j2;
            this.a = l42Var;
            this.d = qd3Var;
        }

        public final b a(long j, l3d l3dVar) throws BehindLiveWindowException {
            long jG;
            long jG2;
            qd3 qd3VarL = this.b.l();
            qd3 qd3VarL2 = l3dVar.l();
            if (qd3VarL == null) {
                return new b(j, l3dVar, this.c, this.a, this.f, qd3VarL);
            }
            if (!qd3VarL.b()) {
                return new b(j, l3dVar, this.c, this.a, this.f, qd3VarL2);
            }
            long jH = qd3VarL.h(j);
            if (jH == 0) {
                return new b(j, l3dVar, this.c, this.a, this.f, qd3VarL2);
            }
            ka2.r(qd3VarL2);
            long jI = qd3VarL.i();
            long jA = qd3VarL.a(jI);
            long j2 = jH + jI;
            long j3 = j2 - 1;
            long jC = qd3VarL.c(j3, j) + qd3VarL.a(j3);
            long jI2 = qd3VarL2.i();
            long jA2 = qd3VarL2.a(jI2);
            long j4 = this.f;
            if (jC == jA2) {
                jG = j2 - jI2;
            } else {
                if (jC < jA2) {
                    throw new BehindLiveWindowException();
                }
                if (jA2 < jA) {
                    jG2 = j4 - (qd3VarL2.g(jA, j) - jI);
                    return new b(j, l3dVar, this.c, this.a, jG2, qd3VarL2);
                }
                jG = qd3VarL.g(jA2, j) - jI2;
            }
            jG2 = jG + j4;
            return new b(j, l3dVar, this.c, this.a, jG2, qd3VarL2);
        }

        public final long b(long j) {
            qd3 qd3Var = this.d;
            ka2.r(qd3Var);
            return qd3Var.d(this.e, j) + this.f;
        }

        public final long c(long j) {
            long jB = b(j);
            qd3 qd3Var = this.d;
            ka2.r(qd3Var);
            return (qd3Var.j(this.e, j) + jB) - 1;
        }

        public final long d() {
            qd3 qd3Var = this.d;
            ka2.r(qd3Var);
            return qd3Var.h(this.e);
        }

        public final long e(long j) {
            long jF = f(j);
            qd3 qd3Var = this.d;
            ka2.r(qd3Var);
            return qd3Var.c(j - this.f, this.e) + jF;
        }

        public final long f(long j) {
            qd3 qd3Var = this.d;
            ka2.r(qd3Var);
            return qd3Var.a(j - this.f);
        }

        public final boolean g(long j, long j2) {
            qd3 qd3Var = this.d;
            ka2.r(qd3Var);
            return qd3Var.b() || j2 == -9223372036854775807L || e(j) <= j2;
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.dash.c$c, reason: collision with other inner class name */
    public static final class C0042c extends fa1 {
        public final b e;

        public C0042c(b bVar, long j, long j2) {
            super(j, j2);
            this.e = bVar;
        }

        @Override // defpackage.mg9
        public final long a() {
            c();
            return this.e.f(this.d);
        }

        @Override // defpackage.mg9
        public final long b() {
            c();
            return this.e.e(this.d);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.media3.exoplayer.dash.c, java.lang.Object] */
    public c(cq1.b bVar, d09 d09Var, od3 od3Var, vb1 vb1Var, int i, int[] iArr, p35 p35Var, int i2, androidx.media3.datasource.a aVar, long j, int i3, boolean z, ArrayList arrayList, d.c cVar) {
        l3d l3dVar;
        b[] bVarArr;
        androidx.media3.common.a aVar2;
        m55 ps5Var;
        cq1 cq1Var;
        ?? obj = new Object();
        obj.a = d09Var;
        obj.k = od3Var;
        obj.b = vb1Var;
        obj.c = iArr;
        obj.j = p35Var;
        obj.d = i2;
        obj.e = aVar;
        obj.l = i;
        obj.f = j;
        obj.g = i3;
        d.c cVar2 = cVar;
        obj.h = cVar2;
        long jD = od3Var.d(i);
        ArrayList<l3d> arrayListJ = obj.j();
        obj.i = new b[p35Var.length()];
        int i4 = 0;
        int i5 = 0;
        c cVar3 = obj;
        while (i5 < cVar3.i.length) {
            l3d l3dVar2 = arrayListJ.get(p35Var.f(i5));
            tb1 tb1VarC = vb1Var.c(l3dVar2.b);
            b[] bVarArr2 = cVar3.i;
            tb1 tb1Var = tb1VarC == null ? l3dVar2.b.get(i4) : tb1VarC;
            androidx.media3.common.a aVar3 = l3dVar2.a;
            bVar.getClass();
            String str = aVar3.m;
            if (!st9.n(str)) {
                if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                    l3dVar = l3dVar2;
                    aVar2 = aVar3;
                    bVarArr = bVarArr2;
                    ps5Var = new lf9(bVar.a, bVar.b ? 1 : 3);
                } else if (Objects.equals(str, "image/jpeg")) {
                    ps5Var = new g98(1);
                } else if (Objects.equals(str, "image/png")) {
                    ps5Var = new heb();
                } else {
                    int i6 = z ? 4 : 0;
                    l3dVar = l3dVar2;
                    int i7 = bVar.b ? i6 : i6 | 32;
                    bVarArr = bVarArr2;
                    aVar2 = aVar3;
                    ps5Var = new ps5(bVar.a, i7, null, arrayList, cVar2);
                }
                cq1Var = new cq1(ps5Var, i2, aVar2);
                cq1 cq1Var2 = cq1Var;
                long j2 = jD;
                int i8 = i5;
                bVarArr[i8] = new b(j2, l3dVar, tb1Var, cq1Var2, 0L, l3dVar.l());
                i5 = i8 + 1;
                cVar3 = this;
                cVar2 = cVar;
                jD = j2;
                i4 = 0;
            } else if (bVar.b) {
                ps5Var = new zxe(bVar.a.c(aVar3), aVar3);
            } else {
                cq1Var = null;
                l3dVar = l3dVar2;
                bVarArr = bVarArr2;
                cq1 cq1Var22 = cq1Var;
                long j22 = jD;
                int i82 = i5;
                bVarArr[i82] = new b(j22, l3dVar, tb1Var, cq1Var22, 0L, l3dVar.l());
                i5 = i82 + 1;
                cVar3 = this;
                cVar2 = cVar;
                jD = j22;
                i4 = 0;
            }
            l3dVar = l3dVar2;
            aVar2 = aVar3;
            bVarArr = bVarArr2;
            cq1Var = new cq1(ps5Var, i2, aVar2);
            cq1 cq1Var222 = cq1Var;
            long j222 = jD;
            int i822 = i5;
            bVarArr[i822] = new b(j222, l3dVar, tb1Var, cq1Var222, 0L, l3dVar.l());
            i5 = i822 + 1;
            cVar3 = this;
            cVar2 = cVar;
            jD = j222;
            i4 = 0;
        }
    }

    @Override // defpackage.q42
    public final void a() throws BehindLiveWindowException {
        BehindLiveWindowException behindLiveWindowException = this.m;
        if (behindLiveWindowException != null) {
            throw behindLiveWindowException;
        }
        this.a.a();
    }

    @Override // androidx.media3.exoplayer.dash.a
    public final void b(od3 od3Var, int i) {
        b[] bVarArr = this.i;
        try {
            this.k = od3Var;
            this.l = i;
            long jD = od3Var.d(i);
            ArrayList<l3d> arrayListJ = j();
            for (int i2 = 0; i2 < bVarArr.length; i2++) {
                bVarArr[i2] = bVarArr[i2].a(jD, arrayListJ.get(this.j.f(i2)));
            }
        } catch (BehindLiveWindowException e) {
            this.m = e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    @Override // defpackage.q42
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long c(long r19, defpackage.ayd r21) {
        /*
            r18 = this;
            r1 = r19
            r0 = r18
            androidx.media3.exoplayer.dash.c$b[] r0 = r0.i
            int r3 = r0.length
            r4 = 0
        L8:
            if (r4 >= r3) goto L60
            r5 = r0[r4]
            qd3 r6 = r5.d
            long r7 = r5.f
            qd3 r9 = r5.d
            if (r6 == 0) goto L5b
            long r10 = r5.d()
            r12 = 0
            int r6 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r6 != 0) goto L1f
            goto L5b
        L1f:
            defpackage.ka2.r(r9)
            long r3 = r5.e
            long r3 = r9.g(r1, r3)
            long r3 = r3 + r7
            r12 = r3
            long r3 = r5.f(r12)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L54
            r14 = -1
            int r0 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            r14 = 1
            if (r0 == 0) goto L4b
            defpackage.ka2.r(r9)
            long r16 = r9.i()
            long r16 = r16 + r7
            long r16 = r16 + r10
            long r16 = r16 - r14
            int r0 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r0 >= 0) goto L54
        L4b:
            long r6 = r12 + r14
            long r5 = r5.f(r6)
        L51:
            r0 = r21
            goto L56
        L54:
            r5 = r3
            goto L51
        L56:
            long r0 = r0.a(r1, r3, r5)
            return r0
        L5b:
            int r4 = r4 + 1
            r1 = r19
            goto L8
        L60:
            return r19
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.dash.c.c(long, ayd):long");
    }

    @Override // defpackage.q42
    public final void d(k42 k42Var) {
        if (k42Var instanceof ld7) {
            int iB = this.j.b(((ld7) k42Var).d);
            b[] bVarArr = this.i;
            b bVar = bVarArr[iB];
            if (bVar.d == null) {
                l42 l42Var = bVar.a;
                ka2.r(l42Var);
                n42 n42VarC = l42Var.c();
                if (n42VarC != null) {
                    l3d l3dVar = bVar.b;
                    bVarArr[iB] = new b(bVar.e, l3dVar, bVar.c, bVar.a, bVar.f, new sd3(n42VarC, l3dVar.c));
                }
            }
        }
        d.c cVar = this.h;
        if (cVar != null) {
            long j = cVar.d;
            if (j == -9223372036854775807L || k42Var.h > j) {
                cVar.d = k42Var.h;
            }
            d.this.V = true;
        }
    }

    @Override // defpackage.q42
    public final boolean e(long j, k42 k42Var, List<? extends lg9> list) {
        if (this.m != null) {
            return false;
        }
        return this.j.d(j, k42Var, list);
    }

    @Override // defpackage.q42
    public final boolean f(k42 k42Var, boolean z, b.c cVar, androidx.media3.exoplayer.upstream.b bVar) {
        b.C0051b c0051bC;
        long jMax;
        if (z) {
            d.c cVar2 = this.h;
            if (cVar2 != null) {
                long j = cVar2.d;
                boolean z2 = j != -9223372036854775807L && j < k42Var.g;
                d dVar = d.this;
                if (dVar.f.d) {
                    if (!dVar.W) {
                        if (z2) {
                            if (dVar.V) {
                                dVar.W = true;
                                dVar.V = false;
                                DashMediaSource dashMediaSource = DashMediaSource.this;
                                dashMediaSource.D.removeCallbacks(dashMediaSource.w);
                                dashMediaSource.C();
                                return true;
                            }
                        }
                    }
                    return true;
                }
            }
            boolean z3 = this.k.d;
            b[] bVarArr = this.i;
            if (!z3 && (k42Var instanceof lg9)) {
                IOException iOException = cVar.a;
                if ((iOException instanceof HttpDataSource$InvalidResponseCodeException) && ((HttpDataSource$InvalidResponseCodeException) iOException).responseCode == 404) {
                    b bVar2 = bVarArr[this.j.b(k42Var.d)];
                    long jD = bVar2.d();
                    if (jD != -1 && jD != 0) {
                        qd3 qd3Var = bVar2.d;
                        ka2.r(qd3Var);
                        if (((lg9) k42Var).c() > ((qd3Var.i() + bVar2.f) + jD) - 1) {
                            this.n = true;
                            return true;
                        }
                    }
                }
            }
            b bVar3 = bVarArr[this.j.b(k42Var.d)];
            l3d l3dVar = bVar3.b;
            tb1 tb1Var = bVar3.c;
            e47<tb1> e47Var = l3dVar.b;
            vb1 vb1Var = this.b;
            tb1 tb1VarC = vb1Var.c(e47Var);
            if (tb1VarC == null || tb1Var.equals(tb1VarC)) {
                p35 p35Var = this.j;
                e47<tb1> e47Var2 = bVar3.b.b;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                int length = p35Var.length();
                int i = 0;
                for (int i2 = 0; i2 < length; i2++) {
                    if (p35Var.a(i2, jElapsedRealtime)) {
                        i++;
                    }
                }
                HashSet hashSet = new HashSet();
                for (int i3 = 0; i3 < e47Var2.size(); i3++) {
                    hashSet.add(Integer.valueOf(e47Var2.get(i3).c));
                }
                int size = hashSet.size();
                HashSet hashSet2 = new HashSet();
                ArrayList arrayListA = vb1Var.a(e47Var2);
                for (int i4 = 0; i4 < arrayListA.size(); i4++) {
                    hashSet2.add(Integer.valueOf(((tb1) arrayListA.get(i4)).c));
                }
                b.a aVar = new b.a(size, size - hashSet2.size(), length, i);
                if ((aVar.a(2) || aVar.a(1)) && (c0051bC = bVar.c(aVar, cVar)) != null) {
                    long j2 = c0051bC.b;
                    int i5 = c0051bC.a;
                    if (aVar.a(i5)) {
                        if (i5 == 2) {
                            p35 p35Var2 = this.j;
                            return p35Var2.g(p35Var2.b(k42Var.d), j2);
                        }
                        if (i5 == 1) {
                            long jElapsedRealtime2 = SystemClock.elapsedRealtime() + j2;
                            String str = tb1Var.b;
                            HashMap map = vb1Var.a;
                            if (map.containsKey(str)) {
                                Long l = (Long) map.get(str);
                                String str2 = vjg.a;
                                jMax = Math.max(jElapsedRealtime2, l.longValue());
                            } else {
                                jMax = jElapsedRealtime2;
                            }
                            map.put(str, Long.valueOf(jMax));
                            int i6 = tb1Var.c;
                            if (i6 != Integer.MIN_VALUE) {
                                Integer numValueOf = Integer.valueOf(i6);
                                HashMap map2 = vb1Var.b;
                                if (map2.containsKey(numValueOf)) {
                                    Long l2 = (Long) map2.get(numValueOf);
                                    String str3 = vjg.a;
                                    jElapsedRealtime2 = Math.max(jElapsedRealtime2, l2.longValue());
                                }
                                map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.dash.a
    public final void g(p35 p35Var) {
        this.j = p35Var;
    }

    @Override // defpackage.q42
    public final int h(long j, List<? extends lg9> list) {
        return (this.m != null || this.j.length() < 2) ? list.size() : this.j.o(j, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.q42
    public final void i(g gVar, long j, List<? extends lg9> list, m42 m42Var) {
        long j2;
        long j3;
        List<? extends lg9> list2;
        lg9 lg9Var;
        b[] bVarArr;
        long j4;
        long j5;
        long jMax;
        long j6;
        int i;
        long j7;
        long j8;
        int i2;
        k42 js2Var;
        long jO;
        long j9;
        long j10;
        boolean z;
        if (this.m != null) {
            return;
        }
        long j11 = gVar.a;
        long j12 = j - j11;
        long jO2 = vjg.O(this.k.b(this.l).b) + vjg.O(this.k.a) + j;
        int i3 = 0;
        d.c cVar = this.h;
        if (cVar != null) {
            d dVar = d.this;
            od3 od3Var = dVar.f;
            j3 = -9223372036854775807L;
            d.b bVar = dVar.b;
            if (!od3Var.d) {
                j2 = j11;
                z = false;
            } else if (dVar.W) {
                j2 = j11;
                z = true;
            } else {
                j2 = j11;
                Map.Entry<Long, Long> entryCeilingEntry = dVar.e.ceilingEntry(Long.valueOf(od3Var.h));
                if (entryCeilingEntry == null || entryCeilingEntry.getValue().longValue() >= jO2) {
                    z = false;
                } else {
                    long jLongValue = entryCeilingEntry.getKey().longValue();
                    DashMediaSource dashMediaSource = DashMediaSource.this;
                    long j13 = dashMediaSource.N;
                    if (j13 == -9223372036854775807L || j13 < jLongValue) {
                        dashMediaSource.N = jLongValue;
                    }
                    z = true;
                }
                if (z && dVar.V) {
                    dVar.W = true;
                    dVar.V = false;
                    DashMediaSource dashMediaSource2 = DashMediaSource.this;
                    dashMediaSource2.D.removeCallbacks(dashMediaSource2.w);
                    dashMediaSource2.C();
                }
            }
            if (z) {
                return;
            }
        } else {
            j2 = j11;
            j3 = -9223372036854775807L;
        }
        long jO3 = vjg.O(vjg.A(this.f));
        od3 od3Var2 = this.k;
        long j14 = od3Var2.a;
        long jO4 = j14 == j3 ? j3 : jO3 - vjg.O(j14 + od3Var2.b(this.l).b);
        if (list.isEmpty()) {
            list2 = list;
            lg9Var = null;
        } else {
            list2 = list;
            lg9Var = list2.get(list.size() - 1);
        }
        int length = this.j.length();
        mg9[] mg9VarArr = new mg9[length];
        int i4 = 0;
        while (true) {
            bVarArr = this.i;
            if (i4 >= length) {
                break;
            }
            b bVar2 = bVarArr[i4];
            int i5 = i3;
            qd3 qd3Var = bVar2.d;
            mg9.a aVar = mg9.a;
            if (qd3Var == null) {
                mg9VarArr[i4] = aVar;
                j9 = jO4;
            } else {
                long jB = bVar2.b(jO3);
                long jC = bVar2.c(jO3);
                if (lg9Var != null) {
                    j10 = lg9Var.c();
                    j9 = jO4;
                } else {
                    qd3 qd3Var2 = bVar2.d;
                    ka2.r(qd3Var2);
                    j9 = jO4;
                    j10 = vjg.j(qd3Var2.g(j, bVar2.e) + bVar2.f, jB, jC);
                }
                long j15 = j10;
                if (j15 < jB) {
                    mg9VarArr[i4] = aVar;
                } else {
                    mg9VarArr[i4] = new C0042c(k(i4), j15, jC);
                }
            }
            i4++;
            i3 = i5;
            jO4 = j9;
        }
        long j16 = jO4;
        int i6 = i3;
        if (!this.k.d || bVarArr[i6].d() == 0) {
            j4 = j12;
            j5 = 0;
            jMax = j3;
        } else {
            long jE = bVarArr[i6].e(bVarArr[i6].c(jO3));
            od3 od3Var3 = this.k;
            long j17 = od3Var3.a;
            if (j17 == j3) {
                j4 = j12;
                jO = j3;
            } else {
                j4 = j12;
                jO = jO3 - vjg.O(j17 + od3Var3.b(this.l).b);
            }
            long jMin = Math.min(jO, jE) - j2;
            j5 = 0;
            jMax = Math.max(0L, jMin);
        }
        long j18 = j5;
        this.j.l(j2, j4, jMax, list2, mg9VarArr);
        int iC = this.j.c();
        SystemClock.elapsedRealtime();
        b bVarK = k(iC);
        long j19 = bVarK.e;
        long j20 = bVarK.f;
        qd3 qd3Var3 = bVarK.d;
        tb1 tb1Var = bVarK.c;
        l42 l42Var = bVarK.a;
        l3d l3dVar = bVarK.b;
        if (l42Var != null) {
            i = 1;
            mic micVar = l42Var.e() == null ? l3dVar.g : null;
            j6 = j20;
            mic micVarM = qd3Var3 == null ? l3dVar.m() : null;
            if (micVar != null || micVarM != null) {
                androidx.media3.common.a aVarQ = this.j.q();
                int iR = this.j.r();
                Object objI = this.j.i();
                if (micVar != null) {
                    mic micVarA = micVar.a(micVarM, tb1Var.a);
                    if (micVarA != null) {
                        micVar = micVarA;
                    }
                } else {
                    micVarM.getClass();
                    micVar = micVarM;
                }
                m42Var.a = new ld7(this.e, rd3.a(l3dVar, tb1Var.a, micVar, i6, ryc.V), aVarQ, iR, objI, bVarK.a);
                return;
            }
        } else {
            j6 = j20;
            i = 1;
        }
        od3 od3Var4 = this.k;
        int i7 = (od3Var4.d && this.l == od3Var4.m.size() + (-1)) ? i : i6;
        boolean z2 = (i7 == 0 || j19 != j3) ? i : i6;
        if (bVarK.d() == j18) {
            m42Var.b = z2;
            return;
        }
        long jB2 = bVarK.b(jO3);
        long jC2 = bVarK.c(jO3);
        boolean z3 = z2;
        if (i7 != 0) {
            long jE2 = bVarK.e(jC2);
            z3 = (z2 ? 1 : 0) & ((jE2 - bVarK.f(jC2)) + jE2 >= j19 ? i : i6);
        }
        if (lg9Var != null) {
            j8 = lg9Var.c();
            j7 = jC2;
        } else {
            ka2.r(qd3Var3);
            j7 = jC2;
            j8 = vjg.j(qd3Var3.g(j, j19) + j6, jB2, j7);
        }
        long j21 = j8;
        if (j21 < jB2) {
            this.m = new BehindLiveWindowException();
            return;
        }
        if (j21 > j7 || (this.n && j21 >= j7)) {
            m42Var.b = z3;
            return;
        }
        if (z3 != 0 && bVarK.f(j21) >= j19) {
            m42Var.b = i;
            return;
        }
        int iMin = (int) Math.min(this.g, (j7 - j21) + 1);
        int i8 = (j19 > j3 ? 1 : (j19 == j3 ? 0 : -1));
        int i9 = 1;
        if (i8 != 0) {
            while (iMin > 1 && bVarK.f((((long) iMin) + j21) - 1) >= j19) {
                iMin--;
            }
        }
        long j22 = list.isEmpty() ? j : j3;
        androidx.media3.common.a aVarQ2 = this.j.q();
        int iR2 = this.j.r();
        Object objI2 = this.j.i();
        long jF = bVarK.f(j21);
        ka2.r(qd3Var3);
        mic micVarF = qd3Var3.f(j21 - j6);
        androidx.media3.datasource.a aVar2 = this.e;
        if (l42Var == null) {
            js2Var = new she(aVar2, rd3.a(l3dVar, tb1Var.a, micVarF, bVarK.g(j21, j16) ? 0 : 8, ryc.V), aVarQ2, iR2, objI2, jF, bVarK.e(j21), j21, this.d, aVarQ2);
        } else {
            mic micVar2 = micVarF;
            int i10 = 1;
            while (true) {
                if (i9 >= iMin) {
                    i2 = i8;
                    break;
                }
                int i11 = iMin;
                i2 = i8;
                ka2.r(qd3Var3);
                mic micVarA2 = micVar2.a(qd3Var3.f((j21 + ((long) i9)) - j6), tb1Var.a);
                if (micVarA2 == null) {
                    break;
                }
                i10++;
                i9++;
                i8 = i2;
                micVar2 = micVarA2;
                iMin = i11;
            }
            long j23 = (j21 + ((long) i10)) - 1;
            long jE3 = bVarK.e(j23);
            long j24 = (i2 == 0 || j19 > jE3) ? j3 : j19;
            gf3 gf3VarA = rd3.a(l3dVar, tb1Var.a, micVar2, bVarK.g(j23, j16) ? 0 : 8, ryc.V);
            long j25 = -l3dVar.c;
            if (st9.m(aVarQ2.n)) {
                j25 += jF;
            }
            js2Var = new js2(aVar2, gf3VarA, aVarQ2, iR2, objI2, jF, jE3, j22, j24, j21, i10, j25, bVarK.a);
        }
        m42Var.a = js2Var;
    }

    @RequiresNonNull({"manifest", "adaptationSetIndices"})
    public final ArrayList<l3d> j() {
        List<ea> list = this.k.b(this.l).c;
        ArrayList<l3d> arrayList = new ArrayList<>();
        for (int i : this.c) {
            arrayList.addAll(list.get(i).c);
        }
        return arrayList;
    }

    public final b k(int i) {
        b[] bVarArr = this.i;
        b bVar = bVarArr[i];
        tb1 tb1VarC = this.b.c(bVar.b.b);
        if (tb1VarC == null || tb1VarC.equals(bVar.c)) {
            return bVar;
        }
        b bVar2 = new b(bVar.e, bVar.b, tb1VarC, bVar.a, bVar.f, bVar.d);
        bVarArr[i] = bVar2;
        return bVar2;
    }

    @Override // defpackage.q42
    public final void release() {
        for (b bVar : this.i) {
            l42 l42Var = bVar.a;
            if (l42Var != null) {
                l42Var.release();
            }
        }
    }
}
