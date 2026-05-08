package defpackage;

import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.gq2;
import defpackage.pc1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class qy3 {
    public hq2 a;
    public boolean b;
    public boolean c;
    public hq2 d;
    public ArrayList<ezg> e;
    public pc1.b f;
    public pc1.a g;
    public ArrayList<nhd> h;

    public final void a(ry3 ry3Var, int i, ArrayList arrayList, nhd nhdVar) {
        ezg ezgVar = ry3Var.d;
        nhd nhdVar2 = ezgVar.c;
        ry3 ry3Var2 = ezgVar.i;
        ry3 ry3Var3 = ezgVar.h;
        if (nhdVar2 == null) {
            hq2 hq2Var = this.a;
            if (ezgVar == hq2Var.d || ezgVar == hq2Var.e) {
                return;
            }
            if (nhdVar == null) {
                nhdVar = new nhd();
                nhdVar.a = null;
                nhdVar.b = new ArrayList<>();
                nhdVar.a = ezgVar;
                arrayList.add(nhdVar);
            }
            ezgVar.c = nhdVar;
            nhdVar.b.add(ezgVar);
            for (ny3 ny3Var : ry3Var3.k) {
                if (ny3Var instanceof ry3) {
                    a((ry3) ny3Var, i, arrayList, nhdVar);
                }
            }
            for (ny3 ny3Var2 : ry3Var2.k) {
                if (ny3Var2 instanceof ry3) {
                    a((ry3) ny3Var2, i, arrayList, nhdVar);
                }
            }
            if (i == 1 && (ezgVar instanceof kng)) {
                for (ny3 ny3Var3 : ((kng) ezgVar).k.k) {
                    if (ny3Var3 instanceof ry3) {
                        a((ry3) ny3Var3, i, arrayList, nhdVar);
                    }
                }
            }
            Iterator it = ry3Var3.l.iterator();
            while (it.hasNext()) {
                a((ry3) it.next(), i, arrayList, nhdVar);
            }
            Iterator it2 = ry3Var2.l.iterator();
            while (it2.hasNext()) {
                a((ry3) it2.next(), i, arrayList, nhdVar);
            }
            if (i == 1 && (ezgVar instanceof kng)) {
                Iterator it3 = ((kng) ezgVar).k.l.iterator();
                while (it3.hasNext()) {
                    a((ry3) it3.next(), i, arrayList, nhdVar);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bf A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.hq2 r26) {
        /*
            Method dump skipped, instruction units count: 822
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qy3.b(hq2):void");
    }

    public final void c() {
        hq2 hq2Var = this.a;
        ArrayList<nhd> arrayList = this.h;
        ArrayList<ezg> arrayList2 = this.e;
        arrayList2.clear();
        hq2 hq2Var2 = this.d;
        hq2Var2.d.f();
        hq2Var2.e.f();
        arrayList2.add(hq2Var2.d);
        arrayList2.add(hq2Var2.e);
        HashSet hashSet = null;
        for (gq2 gq2Var : hq2Var2.q0) {
            if (gq2Var instanceof fe6) {
                ge6 ge6Var = new ge6(gq2Var);
                gq2Var.d.f();
                gq2Var.e.f();
                ge6Var.f = ((fe6) gq2Var).u0;
                arrayList2.add(ge6Var);
            } else {
                if (gq2Var.s()) {
                    if (gq2Var.b == null) {
                        gq2Var.b = new uz1(gq2Var, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(gq2Var.b);
                } else {
                    arrayList2.add(gq2Var.d);
                }
                if (gq2Var.t()) {
                    if (gq2Var.c == null) {
                        gq2Var.c = new uz1(gq2Var, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(gq2Var.c);
                } else {
                    arrayList2.add(gq2Var.e);
                }
                if (gq2Var instanceof oh6) {
                    arrayList2.add(new nh6(gq2Var));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        Iterator<ezg> it = arrayList2.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
        for (ezg ezgVar : arrayList2) {
            if (ezgVar.b != hq2Var2) {
                ezgVar.d();
            }
        }
        arrayList.clear();
        e(hq2Var.d, 0, arrayList);
        e(hq2Var.e, 1, arrayList);
        this.b = false;
    }

    public final int d(hq2 hq2Var, int i) {
        ArrayList<nhd> arrayList;
        int i2;
        long jMax;
        float f;
        hq2 hq2Var2 = hq2Var;
        ArrayList<nhd> arrayList2 = this.h;
        int size = arrayList2.size();
        long j = 0;
        int i3 = 0;
        long jMax2 = 0;
        while (i3 < size) {
            ezg ezgVar = arrayList2.get(i3).a;
            if (!(ezgVar instanceof uz1) ? !(i != 0 ? (ezgVar instanceof kng) : (ezgVar instanceof bk6)) : ((uz1) ezgVar).f != i) {
                ry3 ry3Var = (i == 0 ? hq2Var2.d : hq2Var2.e).h;
                ry3 ry3Var2 = (i == 0 ? hq2Var2.d : hq2Var2.e).i;
                ry3 ry3Var3 = ezgVar.h;
                ry3 ry3Var4 = ezgVar.i;
                boolean zContains = ry3Var3.l.contains(ry3Var);
                boolean zContains2 = ry3Var4.l.contains(ry3Var2);
                long j2 = ezgVar.j();
                if (zContains && zContains2) {
                    long jB = nhd.b(ry3Var3, j);
                    arrayList = arrayList2;
                    long jA = nhd.a(ry3Var4, j);
                    long j3 = jB - j2;
                    int i4 = ry3Var4.f;
                    i2 = i3;
                    if (j3 >= (-i4)) {
                        j3 += (long) i4;
                    }
                    long j4 = ry3Var3.f;
                    long j5 = ((-jA) - j2) - j4;
                    if (j5 >= j4) {
                        j5 -= j4;
                    }
                    gq2 gq2Var = ezgVar.b;
                    if (i == 0) {
                        f = gq2Var.e0;
                    } else if (i == 1) {
                        f = gq2Var.f0;
                    } else {
                        gq2Var.getClass();
                        f = -1.0f;
                    }
                    float f2 = f > 0.0f ? (long) ((j3 / (1.0f - f)) + (j5 / f)) : 0L;
                    jMax = (((long) ry3Var3.f) + ((((long) ((f2 * f) + 0.5f)) + j2) + ((long) k6.b(1.0f, f, f2, 0.5f)))) - ((long) ry3Var4.f);
                } else {
                    arrayList = arrayList2;
                    i2 = i3;
                    jMax = zContains ? Math.max(nhd.b(ry3Var3, ry3Var3.f), ((long) ry3Var3.f) + j2) : zContains2 ? Math.max(-nhd.a(ry3Var4, ry3Var4.f), ((long) (-ry3Var4.f)) + j2) : (ezgVar.j() + ((long) ry3Var3.f)) - ((long) ry3Var4.f);
                }
            } else {
                arrayList = arrayList2;
                jMax = j;
                i2 = i3;
            }
            jMax2 = Math.max(jMax2, jMax);
            i3 = i2 + 1;
            arrayList2 = arrayList;
            hq2Var2 = hq2Var;
            j = 0;
        }
        return (int) jMax2;
    }

    public final void e(ezg ezgVar, int i, ArrayList<nhd> arrayList) {
        ry3 ry3Var = ezgVar.h;
        ry3 ry3Var2 = ezgVar.i;
        for (ny3 ny3Var : ry3Var.k) {
            if (ny3Var instanceof ry3) {
                a((ry3) ny3Var, i, arrayList, null);
            } else if (ny3Var instanceof ezg) {
                a(((ezg) ny3Var).h, i, arrayList, null);
            }
        }
        for (ny3 ny3Var2 : ry3Var2.k) {
            if (ny3Var2 instanceof ry3) {
                a((ry3) ny3Var2, i, arrayList, null);
            } else if (ny3Var2 instanceof ezg) {
                a(((ezg) ny3Var2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            for (ny3 ny3Var3 : ((kng) ezgVar).k.k) {
                if (ny3Var3 instanceof ry3) {
                    a((ry3) ny3Var3, i, arrayList, null);
                }
            }
        }
    }

    public final void f(gq2 gq2Var, gq2.a aVar, int i, gq2.a aVar2, int i2) {
        pc1.a aVar3 = this.g;
        aVar3.a = aVar;
        aVar3.b = aVar2;
        aVar3.c = i;
        aVar3.d = i2;
        ((ConstraintLayout.b) this.f).b(gq2Var, aVar3);
        gq2Var.F(aVar3.e);
        gq2Var.C(aVar3.f);
        gq2Var.D = aVar3.h;
        int i3 = aVar3.g;
        gq2Var.b0 = i3;
        gq2Var.D = i3 > 0;
    }

    public final void g() {
        qy3 qy3Var;
        kc1 kc1Var;
        for (gq2 gq2Var : this.a.q0) {
            if (!gq2Var.a) {
                gq2.a[] aVarArr = gq2Var.T;
                boolean z = false;
                gq2.a aVar = aVarArr[0];
                gq2.a aVar2 = aVarArr[1];
                int i = gq2Var.q;
                int i2 = gq2Var.r;
                gq2.a aVar3 = gq2.a.c;
                gq2.a aVar4 = gq2.a.b;
                boolean z2 = aVar == aVar4 || (aVar == aVar3 && i == 1);
                if (aVar2 == aVar4 || (aVar2 == aVar3 && i2 == 1)) {
                    z = true;
                }
                v44 v44Var = gq2Var.d.e;
                boolean z3 = v44Var.j;
                v44 v44Var2 = gq2Var.e.e;
                boolean z4 = v44Var2.j;
                boolean z5 = z2;
                gq2.a aVar5 = gq2.a.a;
                if (z3 && z4) {
                    qy3Var = this;
                    qy3Var.f(gq2Var, aVar5, v44Var.g, aVar5, v44Var2.g);
                    gq2Var.a = true;
                } else if (z3 && z) {
                    qy3Var = this;
                    qy3Var.f(gq2Var, aVar5, v44Var.g, aVar4, v44Var2.g);
                    kng kngVar = gq2Var.e;
                    if (aVar2 == aVar3) {
                        kngVar.e.m = gq2Var.i();
                    } else {
                        kngVar.e.d(gq2Var.i());
                        gq2Var.a = true;
                    }
                } else {
                    qy3Var = this;
                    if (z4 && z5) {
                        qy3Var.f(gq2Var, aVar4, v44Var.g, aVar5, v44Var2.g);
                        bk6 bk6Var = gq2Var.d;
                        if (aVar == aVar3) {
                            bk6Var.e.m = gq2Var.l();
                        } else {
                            bk6Var.e.d(gq2Var.l());
                            gq2Var.a = true;
                        }
                    }
                }
                if (gq2Var.a && (kc1Var = gq2Var.e.l) != null) {
                    kc1Var.d(gq2Var.b0);
                }
                this = qy3Var;
            }
        }
    }
}
