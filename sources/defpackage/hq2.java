package defpackage;

import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.gq2;
import defpackage.pc1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class hq2 extends czg {
    public int A0;
    public tz1[] B0;
    public tz1[] C0;
    public int D0;
    public boolean E0;
    public boolean F0;
    public WeakReference<wp2> G0;
    public WeakReference<wp2> H0;
    public WeakReference<wp2> I0;
    public WeakReference<wp2> J0;
    public final HashSet<gq2> K0;
    public final pc1.a L0;
    public final pc1 r0 = new pc1(this);
    public final qy3 s0;
    public int t0;
    public pc1.b u0;
    public boolean v0;
    public final ox8 w0;
    public int x0;
    public int y0;
    public int z0;

    public hq2() {
        qy3 qy3Var = new qy3();
        qy3Var.b = true;
        qy3Var.c = true;
        qy3Var.e = new ArrayList<>();
        new ArrayList();
        qy3Var.f = null;
        qy3Var.g = new pc1.a();
        qy3Var.h = new ArrayList<>();
        qy3Var.a = this;
        qy3Var.d = this;
        this.s0 = qy3Var;
        this.u0 = null;
        this.v0 = false;
        this.w0 = new ox8();
        this.z0 = 0;
        this.A0 = 0;
        this.B0 = new tz1[4];
        this.C0 = new tz1[4];
        this.D0 = 257;
        this.E0 = false;
        this.F0 = false;
        this.G0 = null;
        this.H0 = null;
        this.I0 = null;
        this.J0 = null;
        this.K0 = new HashSet<>();
        this.L0 = new pc1.a();
    }

    public static void M(gq2 gq2Var, pc1.b bVar, pc1.a aVar) {
        int i;
        int i2;
        if (bVar == null) {
            return;
        }
        int i3 = gq2Var.h0;
        int[] iArr = gq2Var.s;
        if (i3 == 8 || (gq2Var instanceof fe6) || (gq2Var instanceof n81)) {
            aVar.e = 0;
            aVar.f = 0;
            return;
        }
        gq2.a[] aVarArr = gq2Var.T;
        aVar.a = aVarArr[0];
        aVar.b = aVarArr[1];
        aVar.c = gq2Var.l();
        aVar.d = gq2Var.i();
        aVar.i = false;
        aVar.j = 0;
        gq2.a aVar2 = aVar.a;
        gq2.a aVar3 = gq2.a.c;
        boolean z = aVar2 == aVar3;
        boolean z2 = aVar.b == aVar3;
        boolean z3 = z && gq2Var.X > 0.0f;
        boolean z4 = z2 && gq2Var.X > 0.0f;
        gq2.a aVar4 = gq2.a.b;
        gq2.a aVar5 = gq2.a.a;
        if (z && gq2Var.o(0) && gq2Var.q == 0 && !z3) {
            aVar.a = aVar4;
            if (z2 && gq2Var.r == 0) {
                aVar.a = aVar5;
            }
            z = false;
        }
        if (z2 && gq2Var.o(1) && gq2Var.r == 0 && !z4) {
            aVar.b = aVar4;
            if (z && gq2Var.q == 0) {
                aVar.b = aVar5;
            }
            z2 = false;
        }
        if (gq2Var.v()) {
            aVar.a = aVar5;
            z = false;
        }
        if (gq2Var.w()) {
            aVar.b = aVar5;
            z2 = false;
        }
        if (z3) {
            if (iArr[0] == 4) {
                aVar.a = aVar5;
            } else if (!z2) {
                if (aVar.b == aVar5) {
                    i2 = aVar.d;
                } else {
                    aVar.a = aVar4;
                    ((ConstraintLayout.b) bVar).b(gq2Var, aVar);
                    i2 = aVar.f;
                }
                aVar.a = aVar5;
                aVar.c = (int) (gq2Var.X * i2);
            }
        }
        if (z4) {
            if (iArr[1] == 4) {
                aVar.b = aVar5;
            } else if (!z) {
                if (aVar.a == aVar5) {
                    i = aVar.c;
                } else {
                    aVar.b = aVar4;
                    ((ConstraintLayout.b) bVar).b(gq2Var, aVar);
                    i = aVar.e;
                }
                aVar.b = aVar5;
                int i4 = gq2Var.Y;
                float f = gq2Var.X;
                if (i4 == -1) {
                    aVar.d = (int) (i / f);
                } else {
                    aVar.d = (int) (f * i);
                }
            }
        }
        ((ConstraintLayout.b) bVar).b(gq2Var, aVar);
        gq2Var.F(aVar.e);
        gq2Var.C(aVar.f);
        gq2Var.D = aVar.h;
        int i5 = aVar.g;
        gq2Var.b0 = i5;
        gq2Var.D = i5 > 0;
        aVar.j = 0;
    }

    @Override // defpackage.gq2
    public final void G(boolean z, boolean z2) {
        super.G(z, z2);
        int size = this.q0.size();
        for (int i = 0; i < size; i++) {
            this.q0.get(i).G(z, z2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:356:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x065a  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x06b9  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x06ee  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x075b  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x0814  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x0853  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x086f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:513:0x08d3  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x08e5  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x08ff  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x0909  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x090c  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x093c A[PHI: r15 r25
  0x093c: PHI (r15v10 ??) = (r15v9 ??), (r15v14 ??), (r15v14 ??), (r15v14 ??) binds: [B:521:0x090a, B:529:0x0926, B:530:0x0928, B:532:0x092e] A[DONT_GENERATE, DONT_INLINE]
  0x093c: PHI (r25v10 boolean) = (r25v9 boolean), (r25v12 boolean), (r25v12 boolean), (r25v12 boolean) binds: [B:521:0x090a, B:529:0x0926, B:530:0x0928, B:532:0x092e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:536:0x0942  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x0954  */
    /* JADX WARN: Removed duplicated region for block: B:609:0x0943 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v109 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v110 */
    /* JADX WARN: Type inference failed for: r15v111 */
    /* JADX WARN: Type inference failed for: r15v117 */
    /* JADX WARN: Type inference failed for: r15v118 */
    /* JADX WARN: Type inference failed for: r15v119 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v120 */
    /* JADX WARN: Type inference failed for: r15v121 */
    /* JADX WARN: Type inference failed for: r15v122 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v29 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v34 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r34v0, types: [czg, gq2, hq2] */
    @Override // defpackage.czg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void I() {
        /*
            Method dump skipped, instruction units count: 2402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hq2.I():void");
    }

    public final void J(gq2 gq2Var, int i) {
        if (i == 0) {
            int i2 = this.z0 + 1;
            tz1[] tz1VarArr = this.C0;
            if (i2 >= tz1VarArr.length) {
                this.C0 = (tz1[]) Arrays.copyOf(tz1VarArr, tz1VarArr.length * 2);
            }
            tz1[] tz1VarArr2 = this.C0;
            int i3 = this.z0;
            tz1VarArr2[i3] = new tz1(gq2Var, 0, this.v0);
            this.z0 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.A0 + 1;
            tz1[] tz1VarArr3 = this.B0;
            if (i4 >= tz1VarArr3.length) {
                this.B0 = (tz1[]) Arrays.copyOf(tz1VarArr3, tz1VarArr3.length * 2);
            }
            tz1[] tz1VarArr4 = this.B0;
            int i5 = this.A0;
            tz1VarArr4[i5] = new tz1(gq2Var, 1, this.v0);
            this.A0 = i5 + 1;
        }
    }

    public final void K(ox8 ox8Var) {
        hq2 hq2Var;
        ox8 ox8Var2;
        boolean zN = N(64);
        b(ox8Var, zN);
        int size = this.q0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            gq2 gq2Var = this.q0.get(i);
            boolean[] zArr = gq2Var.S;
            zArr[0] = false;
            zArr[1] = false;
            if (gq2Var instanceof n81) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                gq2 gq2Var2 = this.q0.get(i2);
                if (gq2Var2 instanceof n81) {
                    n81 n81Var = (n81) gq2Var2;
                    for (int i3 = 0; i3 < n81Var.r0; i3++) {
                        gq2 gq2Var3 = n81Var.q0[i3];
                        if (n81Var.t0 || gq2Var3.c()) {
                            int i4 = n81Var.s0;
                            if (i4 == 0 || i4 == 1) {
                                gq2Var3.S[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                gq2Var3.S[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet<gq2> hashSet = this.K0;
        hashSet.clear();
        for (int i5 = 0; i5 < size; i5++) {
            gq2 gq2Var4 = this.q0.get(i5);
            gq2Var4.getClass();
            boolean z2 = gq2Var4 instanceof ssg;
            if (z2 || (gq2Var4 instanceof fe6)) {
                if (z2) {
                    hashSet.add(gq2Var4);
                } else {
                    gq2Var4.b(ox8Var, zN);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator<gq2> it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ssg ssgVar = (ssg) it.next();
                for (int i6 = 0; i6 < ssgVar.r0; i6++) {
                    if (hashSet.contains(ssgVar.q0[i6])) {
                        ssgVar.b(ox8Var, zN);
                        hashSet.remove(ssgVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator<gq2> it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    it2.next().b(ox8Var, zN);
                }
                hashSet.clear();
            }
        }
        boolean z3 = ox8.p;
        gq2.a aVar = gq2.a.b;
        if (z3) {
            HashSet<gq2> hashSet2 = new HashSet<>();
            for (int i7 = 0; i7 < size; i7++) {
                gq2 gq2Var5 = this.q0.get(i7);
                gq2Var5.getClass();
                if (!(gq2Var5 instanceof ssg) && !(gq2Var5 instanceof fe6)) {
                    hashSet2.add(gq2Var5);
                }
            }
            hq2Var = this;
            ox8Var2 = ox8Var;
            hq2Var.a(this, ox8Var2, hashSet2, this.T[0] == aVar ? 0 : 1, false);
            for (gq2 gq2Var6 : hashSet2) {
                eva.a(hq2Var, ox8Var2, gq2Var6);
                gq2Var6.b(ox8Var2, zN);
            }
        } else {
            hq2Var = this;
            ox8Var2 = ox8Var;
            for (int i8 = 0; i8 < size; i8++) {
                gq2 gq2Var7 = hq2Var.q0.get(i8);
                if (gq2Var7 instanceof hq2) {
                    gq2.a[] aVarArr = gq2Var7.T;
                    gq2.a aVar2 = aVarArr[0];
                    gq2.a aVar3 = aVarArr[1];
                    gq2.a aVar4 = gq2.a.a;
                    if (aVar2 == aVar) {
                        gq2Var7.D(aVar4);
                    }
                    if (aVar3 == aVar) {
                        gq2Var7.E(aVar4);
                    }
                    gq2Var7.b(ox8Var2, zN);
                    if (aVar2 == aVar) {
                        gq2Var7.D(aVar2);
                    }
                    if (aVar3 == aVar) {
                        gq2Var7.E(aVar3);
                    }
                } else {
                    eva.a(hq2Var, ox8Var2, gq2Var7);
                    if (!(gq2Var7 instanceof ssg) && !(gq2Var7 instanceof fe6)) {
                        gq2Var7.b(ox8Var2, zN);
                    }
                }
            }
        }
        if (hq2Var.z0 > 0) {
            sz1.a(hq2Var, ox8Var2, null, 0);
        }
        if (hq2Var.A0 > 0) {
            sz1.a(hq2Var, ox8Var2, null, 1);
        }
    }

    public final boolean L(int i, boolean z) {
        boolean z2;
        gq2.a aVar;
        qy3 qy3Var = this.s0;
        ArrayList<ezg> arrayList = qy3Var.e;
        hq2 hq2Var = qy3Var.a;
        boolean z3 = false;
        gq2.a aVarH = hq2Var.h(0);
        gq2.a aVarH2 = hq2Var.h(1);
        int iM = hq2Var.m();
        int iN = hq2Var.n();
        gq2.a aVar2 = gq2.a.a;
        if (z && (aVarH == (aVar = gq2.a.b) || aVarH2 == aVar)) {
            Iterator<ezg> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ezg next = it.next();
                if (next.f == i && !next.k()) {
                    z = false;
                    break;
                }
            }
            if (i == 0) {
                if (z && aVarH == aVar) {
                    hq2Var.D(aVar2);
                    hq2Var.F(qy3Var.d(hq2Var, 0));
                    hq2Var.d.e.d(hq2Var.l());
                }
            } else if (z && aVarH2 == aVar) {
                hq2Var.E(aVar2);
                hq2Var.C(qy3Var.d(hq2Var, 1));
                hq2Var.e.e.d(hq2Var.i());
            }
        }
        gq2.a[] aVarArr = hq2Var.T;
        gq2.a aVar3 = gq2.a.d;
        if (i == 0) {
            gq2.a aVar4 = aVarArr[0];
            if (aVar4 == aVar2 || aVar4 == aVar3) {
                int iL = hq2Var.l() + iM;
                hq2Var.d.i.d(iL);
                hq2Var.d.e.d(iL - iM);
                z2 = true;
            }
            z2 = false;
        } else {
            gq2.a aVar5 = aVarArr[1];
            if (aVar5 == aVar2 || aVar5 == aVar3) {
                int i2 = hq2Var.i() + iN;
                hq2Var.e.i.d(i2);
                hq2Var.e.e.d(i2 - iN);
                z2 = true;
            }
            z2 = false;
        }
        qy3Var.g();
        for (ezg ezgVar : arrayList) {
            if (ezgVar.f == i && (ezgVar.b != hq2Var || ezgVar.g)) {
                ezgVar.e();
            }
        }
        Iterator<ezg> it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z3 = true;
                break;
            }
            ezg next2 = it2.next();
            if (next2.f == i && (z2 || next2.b != hq2Var)) {
                if (!next2.h.j || !next2.i.j || (!(next2 instanceof uz1) && !next2.e.j)) {
                    break;
                }
            }
        }
        hq2Var.D(aVarH);
        hq2Var.E(aVarH2);
        return z3;
    }

    public final boolean N(int i) {
        return (this.D0 & i) == i;
    }

    @Override // defpackage.czg, defpackage.gq2
    public final void x() {
        this.w0.t();
        this.x0 = 0;
        this.y0 = 0;
        super.x();
    }
}
