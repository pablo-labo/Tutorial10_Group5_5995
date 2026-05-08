package androidx.media3.exoplayer.source;

import androidx.media3.common.a;
import androidx.media3.exoplayer.source.g;
import defpackage.ayd;
import defpackage.bm2;
import defpackage.e47;
import defpackage.ee3;
import defpackage.iq5;
import defpackage.ka2;
import defpackage.nz8;
import defpackage.p35;
import defpackage.p6;
import defpackage.qyc;
import defpackage.r6;
import defpackage.rjd;
import defpackage.wpf;
import defpackage.xpf;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class j implements g, g.a {
    public g.a V;
    public xpf W;
    public g[] X;
    public bm2 Y;
    public final g[] a;
    public final boolean[] b;
    public final IdentityHashMap<rjd, Integer> c;
    public final ee3 d;
    public final ArrayList<g> e = new ArrayList<>();
    public final HashMap<wpf, wpf> f = new HashMap<>();

    public static final class a extends iq5 {
        public final wpf b;

        public a(p35 p35Var, wpf wpfVar) {
            super(p35Var);
            this.b = wpfVar;
        }

        @Override // defpackage.bqf
        public final int b(androidx.media3.common.a aVar) {
            return this.a.k(this.b.b(aVar));
        }

        @Override // defpackage.bqf
        public final androidx.media3.common.a e(int i) {
            return this.b.d[this.a.f(i)];
        }

        @Override // defpackage.iq5
        public final boolean equals(Object obj) {
            if (super.equals(obj) && (obj instanceof a)) {
                return this.b.equals(((a) obj).b);
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        @Override // defpackage.bqf
        public final wpf m() {
            return this.b;
        }

        @Override // defpackage.p35
        public final androidx.media3.common.a q() {
            return this.b.d[this.a.p()];
        }
    }

    public j(ee3 ee3Var, long[] jArr, g... gVarArr) {
        this.d = ee3Var;
        this.a = gVarArr;
        ee3Var.getClass();
        e47.b bVar = e47.b;
        qyc qycVar = qyc.e;
        this.Y = new bm2(qycVar, qycVar);
        this.c = new IdentityHashMap<>();
        this.X = new g[0];
        this.b = new boolean[gVarArr.length];
        for (int i = 0; i < gVarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.b[i] = true;
                this.a[i] = new s(gVarArr[i], j);
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.g.a
    public final void a(g gVar) {
        ArrayList<g> arrayList = this.e;
        arrayList.remove(gVar);
        if (arrayList.isEmpty()) {
            g[] gVarArr = this.a;
            int i = 0;
            for (g gVar2 : gVarArr) {
                i += gVar2.q().a;
            }
            wpf[] wpfVarArr = new wpf[i];
            int i2 = 0;
            for (int i3 = 0; i3 < gVarArr.length; i3++) {
                xpf xpfVarQ = gVarArr[i3].q();
                int i4 = xpfVarQ.a;
                int i5 = 0;
                while (i5 < i4) {
                    wpf wpfVarA = xpfVarQ.a(i5);
                    int i6 = wpfVarA.a;
                    androidx.media3.common.a[] aVarArr = new androidx.media3.common.a[i6];
                    for (int i7 = 0; i7 < i6; i7++) {
                        androidx.media3.common.a aVar = wpfVarA.d[i7];
                        a.C0036a c0036aA = aVar.a();
                        StringBuilder sb = new StringBuilder();
                        sb.append(i3);
                        sb.append(":");
                        String str = aVar.a;
                        if (str == null) {
                            str = "";
                        }
                        sb.append(str);
                        c0036aA.a = sb.toString();
                        aVarArr[i7] = new androidx.media3.common.a(c0036aA);
                    }
                    wpf wpfVar = new wpf(i3 + ":" + wpfVarA.b, aVarArr);
                    this.f.put(wpfVar, wpfVarA);
                    wpfVarArr[i2] = wpfVar;
                    i5++;
                    i2++;
                }
            }
            this.W = new xpf(wpfVarArr);
            g.a aVar2 = this.V;
            aVar2.getClass();
            aVar2.a(this);
        }
    }

    @Override // androidx.media3.exoplayer.source.p.a
    public final void b(p pVar) {
        g.a aVar = this.V;
        aVar.getClass();
        aVar.b(this);
    }

    @Override // androidx.media3.exoplayer.source.g
    public final long c(long j, ayd aydVar) {
        g[] gVarArr = this.X;
        return (gVarArr.length > 0 ? gVarArr[0] : this.a[0]).c(j, aydVar);
    }

    @Override // androidx.media3.exoplayer.source.p
    public final boolean d() {
        return this.Y.d();
    }

    @Override // androidx.media3.exoplayer.source.p
    public final boolean e(androidx.media3.exoplayer.g gVar) {
        ArrayList<g> arrayList = this.e;
        if (arrayList.isEmpty()) {
            return this.Y.e(gVar);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).e(gVar);
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.g
    public final long f(p35[] p35VarArr, boolean[] zArr, rjd[] rjdVarArr, boolean[] zArr2, long j) {
        IdentityHashMap<rjd, Integer> identityHashMap;
        int[] iArr;
        int[] iArr2 = new int[p35VarArr.length];
        int[] iArr3 = new int[p35VarArr.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = p35VarArr.length;
            identityHashMap = this.c;
            if (i2 >= length) {
                break;
            }
            rjd rjdVar = rjdVarArr[i2];
            Integer num = rjdVar == null ? null : identityHashMap.get(rjdVar);
            iArr2[i2] = num == null ? -1 : num.intValue();
            p35 p35Var = p35VarArr[i2];
            if (p35Var != null) {
                String str = p35Var.m().b;
                iArr3[i2] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr3[i2] = -1;
            }
            i2++;
        }
        identityHashMap.clear();
        int length2 = p35VarArr.length;
        rjd[] rjdVarArr2 = new rjd[length2];
        rjd[] rjdVarArr3 = new rjd[p35VarArr.length];
        p35[] p35VarArr2 = new p35[p35VarArr.length];
        g[] gVarArr = this.a;
        ArrayList arrayList = new ArrayList(gVarArr.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < gVarArr.length) {
            int i4 = i;
            while (i4 < p35VarArr.length) {
                rjdVarArr3[i4] = iArr2[i4] == i3 ? rjdVarArr[i4] : null;
                if (iArr3[i4] == i3) {
                    p35 p35Var2 = p35VarArr[i4];
                    p35Var2.getClass();
                    iArr = iArr2;
                    wpf wpfVar = this.f.get(p35Var2.m());
                    wpfVar.getClass();
                    p35VarArr2[i4] = new a(p35Var2, wpfVar);
                } else {
                    iArr = iArr2;
                    p35VarArr2[i4] = null;
                }
                i4++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr2;
            g[] gVarArr2 = gVarArr;
            int i5 = i3;
            long jF = gVarArr2[i3].f(p35VarArr2, zArr, rjdVarArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = jF;
            } else if (jF != j2) {
                r6.g("Children enabled at different positions.");
                return 0L;
            }
            boolean z = false;
            for (int i6 = 0; i6 < p35VarArr.length; i6++) {
                if (iArr3[i6] == i5) {
                    rjd rjdVar2 = rjdVarArr3[i6];
                    rjdVar2.getClass();
                    rjdVarArr2[i6] = rjdVarArr3[i6];
                    identityHashMap.put(rjdVar2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr4[i6] == i5) {
                    ka2.q(rjdVarArr3[i6] == null);
                }
            }
            if (z) {
                arrayList.add(gVarArr2[i5]);
            }
            i3 = i5 + 1;
            gVarArr = gVarArr2;
            iArr2 = iArr4;
            i = 0;
        }
        int i7 = i;
        System.arraycopy(rjdVarArr2, i7, rjdVarArr, i7, length2);
        this.X = (g[]) arrayList.toArray(new g[i7]);
        AbstractList abstractListB = nz8.b(new p6(9), arrayList);
        this.d.getClass();
        this.Y = new bm2(arrayList, abstractListB);
        return j2;
    }

    @Override // androidx.media3.exoplayer.source.p
    public final long h() {
        return this.Y.h();
    }

    @Override // androidx.media3.exoplayer.source.g
    public final long i(long j) {
        long jI = this.X[0].i(j);
        int i = 1;
        while (true) {
            g[] gVarArr = this.X;
            if (i >= gVarArr.length) {
                return jI;
            }
            if (gVarArr[i].i(jI) != jI) {
                r6.g("Unexpected child seekToUs result.");
                return 0L;
            }
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        r7 = r10;
     */
    @Override // androidx.media3.exoplayer.source.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long j() {
        /*
            r18 = this;
            r0 = r18
            androidx.media3.exoplayer.source.g[] r1 = r0.X
            int r2 = r1.length
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = 0
            r7 = r3
            r6 = r5
        Ld:
            if (r6 >= r2) goto L66
            r9 = r1[r6]
            long r10 = r9.j()
            int r12 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            r13 = 0
            java.lang.String r15 = "Unexpected child seekToUs result."
            if (r12 == 0) goto L4e
            int r12 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r12 != 0) goto L41
            androidx.media3.exoplayer.source.g[] r7 = r0.X
            int r8 = r7.length
            r12 = r5
        L25:
            r16 = r3
            if (r12 >= r8) goto L3f
            r3 = r7[r12]
            if (r3 != r9) goto L2e
            goto L3f
        L2e:
            long r3 = r3.i(r10)
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r3 != 0) goto L3b
            int r12 = r12 + 1
            r3 = r16
            goto L25
        L3b:
            defpackage.r6.g(r15)
            return r13
        L3f:
            r7 = r10
            goto L61
        L41:
            r16 = r3
            int r3 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r3 != 0) goto L48
            goto L61
        L48:
            java.lang.String r0 = "Conflicting discontinuities."
            defpackage.r6.g(r0)
            return r13
        L4e:
            r16 = r3
            int r3 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r3 == 0) goto L61
            long r3 = r9.i(r7)
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 != 0) goto L5d
            goto L61
        L5d:
            defpackage.r6.g(r15)
            return r13
        L61:
            int r6 = r6 + 1
            r3 = r16
            goto Ld
        L66:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.j.j():long");
    }

    @Override // androidx.media3.exoplayer.source.g
    public final void l() {
        for (g gVar : this.a) {
            gVar.l();
        }
    }

    @Override // androidx.media3.exoplayer.source.g
    public final void p(g.a aVar, long j) {
        this.V = aVar;
        ArrayList<g> arrayList = this.e;
        g[] gVarArr = this.a;
        Collections.addAll(arrayList, gVarArr);
        for (g gVar : gVarArr) {
            gVar.p(this, j);
        }
    }

    @Override // androidx.media3.exoplayer.source.g
    public final xpf q() {
        xpf xpfVar = this.W;
        xpfVar.getClass();
        return xpfVar;
    }

    @Override // androidx.media3.exoplayer.source.p
    public final long s() {
        return this.Y.s();
    }

    @Override // androidx.media3.exoplayer.source.g
    public final void t(long j, boolean z) {
        for (g gVar : this.X) {
            gVar.t(j, z);
        }
    }

    @Override // androidx.media3.exoplayer.source.p
    public final void u(long j) {
        this.Y.u(j);
    }
}
