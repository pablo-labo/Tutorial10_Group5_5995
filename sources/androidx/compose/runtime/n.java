package androidx.compose.runtime;

import androidx.compose.runtime.b;
import defpackage.a3a;
import defpackage.b3a;
import defpackage.gib;
import defpackage.gke;
import defpackage.p3a;
import defpackage.pnb;
import defpackage.pyd;
import defpackage.qd6;
import defpackage.s6;
import defpackage.vh7;
import defpackage.wl7;
import defpackage.x20;
import defpackage.z2a;
import defpackage.zr4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class n {
    public final m a;
    public int[] b;
    public Object[] c;
    public ArrayList<x20> d;
    public HashMap<x20, qd6> e;
    public a3a<b3a> f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final vh7 p;
    public final vh7 q;
    public final vh7 r;
    public a3a<p3a<Object>> s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public z2a x;

    public static final class a {
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public static List a(n nVar, int i, n nVar2, boolean z, boolean z2, boolean z3) {
            List list;
            List list2;
            boolean z4;
            List list3;
            int i2;
            x20 x20VarS;
            List list4;
            int i3;
            int i4;
            int iT = nVar.t(i);
            int i5 = i + iT;
            int iF = nVar.f(i);
            int iF2 = nVar.f(i5);
            int i6 = iF2 - iF;
            boolean z5 = i >= 0 && (nVar.b[(nVar.r(i) * 5) + 1] & 201326592) != 0;
            nVar2.v(iT);
            nVar2.w(i6, nVar2.t);
            if (nVar.g < i5) {
                nVar.A(i5);
            }
            if (nVar.k < iF2) {
                nVar.B(iF2, i5);
            }
            int[] iArr = nVar2.b;
            int i7 = nVar2.t;
            int i8 = i7 * 5;
            pyd.h(i8, i * 5, i5 * 5, nVar.b, iArr);
            Object[] objArr = nVar2.c;
            int i9 = nVar2.i;
            System.arraycopy(nVar.c, iF, objArr, i9, i6);
            int i10 = nVar2.v;
            iArr[i8 + 2] = i10;
            int i11 = i7 - i;
            int i12 = i7 + iT;
            int iG = i9 - nVar2.g(i7, iArr);
            int i13 = nVar2.m;
            int i14 = nVar2.l;
            int length = objArr.length;
            boolean z6 = z5;
            int i15 = i13;
            int i16 = i7;
            while (i16 < i12) {
                if (i16 != i7) {
                    int i17 = (i16 * 5) + 2;
                    iArr[i17] = iArr[i17] + i11;
                }
                int[] iArr2 = iArr;
                int iG2 = nVar2.g(i16, iArr) + iG;
                if (i15 < i16) {
                    i3 = i7;
                    i4 = 0;
                } else {
                    i3 = i7;
                    i4 = nVar2.k;
                }
                iArr2[(i16 * 5) + 4] = n.i(iG2, i4, i14, length);
                if (i16 == i15) {
                    i15++;
                }
                i16++;
                i7 = i3;
                iArr = iArr2;
            }
            int[] iArr3 = iArr;
            nVar2.m = i15;
            int iA = gke.a(nVar.d, i, nVar.p());
            int iA2 = gke.a(nVar.d, i5, nVar.p());
            if (iA < iA2) {
                ArrayList<x20> arrayList = nVar.d;
                ArrayList arrayList2 = new ArrayList(iA2 - iA);
                for (int i18 = iA; i18 < iA2; i18++) {
                    x20 x20Var = arrayList.get(i18);
                    x20Var.a += i11;
                    arrayList2.add(x20Var);
                }
                nVar2.d.addAll(gke.a(nVar2.d, nVar2.t, nVar2.p()), arrayList2);
                arrayList.subList(iA, iA2).clear();
                list = arrayList2;
            } else {
                list = zr4.a;
            }
            List list5 = list;
            if (!list5.isEmpty()) {
                HashMap<x20, qd6> map = nVar.e;
                HashMap<x20, qd6> map2 = nVar2.e;
                if (map != null && map2 != null) {
                    int size = list5.size();
                    for (int i19 = 0; i19 < size; i19++) {
                        x20 x20Var2 = (x20) list.get(i19);
                        qd6 qd6Var = map.get(x20Var2);
                        if (qd6Var != null) {
                            map.remove(x20Var2);
                            map2.put(x20Var2, qd6Var);
                        }
                    }
                }
            }
            int i20 = nVar2.v;
            qd6 qd6VarP = nVar2.P(i10);
            if (qd6VarP != null) {
                int i21 = i20 + 1;
                int i22 = nVar2.t;
                int i23 = -1;
                while (i21 < i22) {
                    i23 = i21;
                    i21 = nVar2.b[(i21 * 5) + 3] + i21;
                }
                ArrayList<Object> arrayList3 = qd6VarP.a;
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList<>();
                    qd6VarP.a = arrayList3;
                }
                if (i23 < 0 || (x20VarS = nVar2.S(i23)) == null) {
                    list3 = list;
                    i2 = 0;
                } else {
                    int size2 = arrayList3.size();
                    int i24 = 0;
                    List list6 = list;
                    while (i24 < size2) {
                        Object obj = arrayList3.get(i24);
                        if (wl7.b(obj, x20VarS)) {
                            list4 = list6;
                        } else {
                            list4 = list6;
                            if (!(obj instanceof qd6) || !((qd6) obj).a(x20VarS)) {
                                i24++;
                                list6 = list4;
                            }
                        }
                        i2 = i24;
                        list3 = list4;
                        break;
                    }
                    list3 = list6;
                    i2 = -1;
                }
                arrayList3.add(i2, nVar2.b(i22));
                list2 = list3;
            } else {
                list2 = list;
            }
            int iF3 = nVar.F(i, nVar.b);
            if (!z3) {
                z4 = false;
            } else if (z) {
                boolean z7 = iF3 >= 0;
                if (z7) {
                    nVar.Q();
                    nVar.a(iF3 - nVar.t);
                    nVar.Q();
                }
                nVar.a(i - nVar.t);
                boolean zI = nVar.I();
                if (z7) {
                    nVar.N();
                    nVar.j();
                    nVar.N();
                    nVar.j();
                }
                z4 = zI;
            } else {
                boolean zJ = nVar.J(i, iT);
                nVar.K(iF, i6, i - 1);
                z4 = zJ;
            }
            if (z4) {
                d.c("Unexpectedly removed anchors");
            }
            int i25 = nVar2.o;
            int i26 = iArr3[i8 + 1];
            nVar2.o = i25 + ((1073741824 & i26) != 0 ? 1 : i26 & 67108863);
            if (z2) {
                nVar2.t = i12;
                nVar2.i = i9 + i6;
            }
            if (z6) {
                nVar2.V(i10);
            }
            return list2;
        }
    }

    public n(m mVar) {
        this.a = mVar;
        int[] iArr = mVar.a;
        this.b = iArr;
        Object[] objArr = mVar.c;
        this.c = objArr;
        this.d = mVar.X;
        this.e = mVar.Y;
        this.f = mVar.Z;
        int i = mVar.b;
        this.g = i;
        this.h = (iArr.length / 5) - i;
        int i2 = mVar.d;
        this.k = i2;
        this.l = objArr.length - i2;
        this.m = i;
        this.p = new vh7();
        this.q = new vh7();
        this.r = new vh7();
        this.u = i;
        this.v = -1;
    }

    public static int i(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    public static void y(n nVar) {
        int i = nVar.v;
        int iR = nVar.r(i);
        int[] iArr = nVar.b;
        int i2 = (iR * 5) + 1;
        int i3 = iArr[i2];
        if ((i3 & 134217728) != 0) {
            return;
        }
        int i4 = (i3 & (-134217729)) | 134217728;
        iArr[i2] = i4;
        if ((67108864 & i4) != 0) {
            return;
        }
        nVar.V(nVar.F(i, iArr));
    }

    public final void A(int i) {
        x20 x20Var;
        int i2;
        x20 x20Var2;
        int i3;
        int i4;
        int i5 = this.h;
        int i6 = this.g;
        if (i6 != i) {
            if (!this.d.isEmpty()) {
                int iO = o() - this.h;
                ArrayList<x20> arrayList = this.d;
                if (i6 < i) {
                    for (int iA = gke.a(arrayList, i6, iO); iA < this.d.size() && (i3 = (x20Var2 = this.d.get(iA)).a) < 0 && (i4 = i3 + iO) < i; iA++) {
                        x20Var2.a = i4;
                    }
                } else {
                    for (int iA2 = gke.a(arrayList, i, iO); iA2 < this.d.size() && (i2 = (x20Var = this.d.get(iA2)).a) >= 0; iA2++) {
                        x20Var.a = -(iO - i2);
                    }
                }
            }
            if (i5 > 0) {
                int[] iArr = this.b;
                int i7 = i * 5;
                int i8 = i5 * 5;
                int i9 = i6 * 5;
                if (i < i6) {
                    pyd.h(i8 + i7, i7, i9, iArr, iArr);
                } else {
                    pyd.h(i9, i9 + i8, i7 + i8, iArr, iArr);
                }
            }
            if (i < i6) {
                i6 = i + i5;
            }
            int iO2 = o();
            if (i6 >= iO2) {
                d.c("Check failed");
            }
            while (i6 < iO2) {
                int i10 = (i6 * 5) + 2;
                int i11 = this.b[i10];
                int iP = i11 > -2 ? i11 : (p() + i11) - (-2);
                if (iP >= i) {
                    iP = -((p() - iP) - (-2));
                }
                if (iP != i11) {
                    this.b[i10] = iP;
                }
                i6++;
                if (i6 == i) {
                    i6 += i5;
                }
            }
        }
        this.g = i;
    }

    public final void B(int i, int i2) {
        int i3 = this.l;
        int i4 = this.k;
        int i5 = this.m;
        if (i4 != i) {
            Object[] objArr = this.c;
            if (i < i4) {
                System.arraycopy(objArr, i, objArr, i + i3, i4 - i);
            } else {
                int i6 = i4 + i3;
                System.arraycopy(objArr, i6, objArr, i4, (i + i3) - i6);
            }
        }
        int iMin = Math.min(i2 + 1, p());
        if (i5 != iMin) {
            int length = this.c.length - i3;
            if (iMin < i5) {
                int iR = r(iMin);
                int iR2 = r(i5);
                int i7 = this.g;
                while (iR < iR2) {
                    int i8 = (iR * 5) + 4;
                    int i9 = this.b[i8];
                    if (i9 < 0) {
                        d.c("Unexpected anchor value, expected a positive anchor");
                    }
                    this.b[i8] = -((length - i9) + 1);
                    iR++;
                    if (iR == i7) {
                        iR += this.h;
                    }
                }
            } else {
                int iR3 = r(i5);
                int iR4 = r(iMin);
                while (iR3 < iR4) {
                    int i10 = (iR3 * 5) + 4;
                    int i11 = this.b[i10];
                    if (i11 >= 0) {
                        d.c("Unexpected anchor value, expected a negative anchor");
                    }
                    this.b[i10] = i11 + length + 1;
                    iR3++;
                    if (iR3 == this.g) {
                        iR3 += this.h;
                    }
                }
            }
            this.m = iMin;
        }
        this.k = i;
    }

    public final List C(x20 x20Var, n nVar) {
        if (nVar.n <= 0) {
            d.c("Check failed");
        }
        if (this.n != 0) {
            d.c("Check failed");
        }
        if (!x20Var.a()) {
            d.c("Check failed");
        }
        int iC = c(x20Var) + 1;
        int i = this.t;
        if (i > iC || iC >= this.u) {
            d.c("Check failed");
        }
        int iF = F(iC, this.b);
        int iT = t(iC);
        int iE = x(iC) ? 1 : E(iC);
        List listA = a.a(this, iC, nVar, false, false, true);
        V(iF);
        boolean z = iE > 0;
        while (iF >= i) {
            int iR = r(iF);
            int[] iArr = this.b;
            int i2 = iR * 5;
            int i3 = i2 + 3;
            iArr[i3] = iArr[i3] - iT;
            if (z) {
                int i4 = iArr[i2 + 1];
                if ((1073741824 & i4) != 0) {
                    z = false;
                } else {
                    gke.c(iR, (i4 & 67108863) - iE, iArr);
                }
            }
            iF = F(iF, this.b);
        }
        if (z) {
            if (this.o < iE) {
                d.c("Check failed");
            }
            this.o -= iE;
        }
        return listA;
    }

    public final Object D(int i) {
        int iR = r(i);
        int[] iArr = this.b;
        if ((iArr[(iR * 5) + 1] & 1073741824) != 0) {
            return this.c[h(g(iR, iArr))];
        }
        return null;
    }

    public final int E(int i) {
        return this.b[(r(i) * 5) + 1] & 67108863;
    }

    public final int F(int i, int[] iArr) {
        int i2 = iArr[(r(i) * 5) + 2];
        return i2 > -2 ? i2 : (p() + i2) - (-2);
    }

    public final Object G(Object obj) {
        if (this.n > 0) {
            w(1, this.v);
        }
        Object[] objArr = this.c;
        int i = this.i;
        this.i = i + 1;
        Object obj2 = objArr[h(i)];
        if (this.i > this.j) {
            d.c("Writing to an invalid slot");
        }
        this.c[h(this.i - 1)] = obj;
        return obj2;
    }

    public final void H() {
        int i;
        z2a z2aVar = this.x;
        if (z2aVar != null) {
            while (z2aVar.b != 0) {
                int iO = pnb.O(z2aVar);
                int iR = r(iO);
                int iT = iO + 1;
                int iT2 = t(iO) + iO;
                while (true) {
                    if (iT >= iT2) {
                        i = 0;
                        break;
                    } else {
                        if ((this.b[(r(iT) * 5) + 1] & 201326592) != 0) {
                            i = 1;
                            break;
                        }
                        iT += t(iT);
                    }
                }
                int[] iArr = this.b;
                int i2 = (iR * 5) + 1;
                int i3 = iArr[i2];
                if (((67108864 & i3) != 0 ? 1 : 0) != i) {
                    iArr[i2] = (i << 26) | ((-67108865) & i3);
                    int iF = F(iO, iArr);
                    if (iF >= 0) {
                        pnb.m(z2aVar, iF);
                    }
                }
            }
        }
    }

    public final boolean I() {
        x20 x20VarS;
        if (this.n != 0) {
            d.c("Cannot remove group while inserting");
        }
        int i = this.t;
        int i2 = this.i;
        int iG = g(r(i), this.b);
        int iM = M();
        qd6 qd6VarP = P(this.v);
        if (qd6VarP != null && (x20VarS = S(i)) != null) {
            qd6VarP.c(x20VarS);
        }
        z2a z2aVar = this.x;
        if (z2aVar != null) {
            while (true) {
                int i3 = z2aVar.b;
                if (i3 == 0) {
                    break;
                }
                if (i3 == 0) {
                    s6.j("IntList is empty.");
                    return false;
                }
                if (z2aVar.a[0] < i) {
                    break;
                }
                pnb.O(z2aVar);
            }
        }
        boolean zJ = J(i, this.t - i);
        K(iG, this.i - iG, i - 1);
        this.t = i;
        this.i = i2;
        this.o -= iM;
        return zJ;
    }

    public final boolean J(int i, int i2) {
        if (i2 > 0) {
            ArrayList<x20> arrayList = this.d;
            A(i);
            if (!arrayList.isEmpty()) {
                HashMap<x20, qd6> map = this.e;
                int i3 = i + i2;
                int iA = gke.a(this.d, i3, o() - this.h);
                if (iA >= this.d.size()) {
                    iA--;
                }
                int i4 = iA + 1;
                int i5 = 0;
                while (iA >= 0) {
                    x20 x20Var = this.d.get(iA);
                    int iC = c(x20Var);
                    if (iC < i) {
                        break;
                    }
                    if (iC < i3) {
                        x20Var.a = Integer.MIN_VALUE;
                        if (map != null) {
                            map.remove(x20Var);
                        }
                        if (i5 == 0) {
                            i5 = iA + 1;
                        }
                        i4 = iA;
                    }
                    iA--;
                }
                z = i4 < i5;
                if (z) {
                    this.d.subList(i4, i5).clear();
                }
            }
            this.g = i;
            this.h += i2;
            int i6 = this.m;
            if (i6 > i) {
                this.m = Math.max(i, i6 - i2);
            }
            int i7 = this.u;
            if (i7 >= this.g) {
                this.u = i7 - i2;
            }
            int i8 = this.v;
            if (i8 >= 0 && (this.b[(r(i8) * 5) + 1] & 67108864) != 0) {
                V(i8);
            }
        }
        return z;
    }

    public final void K(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.l;
            int i5 = i + i2;
            B(i5, i3);
            this.k = i;
            this.l = i4 + i2;
            Arrays.fill(this.c, i, i5, (Object) null);
            int i6 = this.j;
            if (i6 >= i) {
                this.j = i6 - i2;
            }
        }
    }

    public final Object L(Object obj, int i, int i2) {
        int iO = O(r(i), this.b);
        int iG = g(r(i + 1), this.b);
        int i3 = iO + i2;
        if (i3 < iO || i3 >= iG) {
            d.c("Write to an invalid slot index " + i2 + " for group " + i);
        }
        int iH = h(i3);
        Object[] objArr = this.c;
        Object obj2 = objArr[iH];
        objArr[iH] = obj;
        return obj2;
    }

    public final int M() {
        int iR = r(this.t);
        int i = this.t;
        int[] iArr = this.b;
        int i2 = iR * 5;
        int i3 = iArr[i2 + 3] + i;
        this.t = i3;
        this.i = g(r(i3), iArr);
        int i4 = this.b[i2 + 1];
        if ((1073741824 & i4) != 0) {
            return 1;
        }
        return i4 & 67108863;
    }

    public final void N() {
        int i = this.u;
        this.t = i;
        this.i = g(r(i), this.b);
    }

    public final int O(int i, int[] iArr) {
        if (i >= o()) {
            return this.c.length - this.l;
        }
        int iB = gke.b(i, iArr);
        return iB < 0 ? (this.c.length - this.l) + iB + 1 : iB;
    }

    public final qd6 P(int i) {
        x20 x20VarS;
        HashMap<x20, qd6> map = this.e;
        if (map == null || (x20VarS = S(i)) == null) {
            return null;
        }
        return map.get(x20VarS);
    }

    public final void Q() {
        if (this.n != 0) {
            d.c("Key must be supplied when inserting");
        }
        b.a.C0020a c0020a = b.a.a;
        R(0, c0020a, c0020a, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void R(int i, Object obj, Object obj2, boolean z) {
        int i2;
        qd6 qd6VarP;
        int i3 = this.v;
        byte b = this.n > 0;
        this.r.c(this.o);
        b.a.C0020a c0020a = b.a.a;
        if (b == true) {
            int i4 = this.t;
            int iG = g(r(i4), this.b);
            v(1);
            this.i = iG;
            this.j = iG;
            int iR = r(i4);
            int i5 = obj != c0020a ? 1 : 0;
            int i6 = (z || obj2 == c0020a) ? 0 : 1;
            int i7 = i(iG, this.k, this.l, this.c.length);
            if (i7 >= 0 && this.m < i4) {
                i7 = -(((this.c.length - this.l) - i7) + 1);
            }
            int[] iArr = this.b;
            int i8 = this.v;
            int i9 = iR * 5;
            iArr[i9] = i;
            iArr[i9 + 1] = ((z ? 1 : 0) << 30) | (i5 << 29) | (i6 << 28);
            iArr[i9 + 2] = i8;
            iArr[i9 + 3] = 0;
            iArr[i9 + 4] = i7;
            int i10 = (z ? 1 : 0) + i5 + i6;
            if (i10 > 0) {
                w(i10, i4);
                Object[] objArr = this.c;
                int i11 = this.i;
                if (z) {
                    objArr[i11] = obj2;
                    i11++;
                }
                if (i5 != 0) {
                    objArr[i11] = obj;
                    i11++;
                }
                if (i6 != 0) {
                    objArr[i11] = obj2;
                    i11++;
                }
                this.i = i11;
            }
            this.o = 0;
            i2 = i4 + 1;
            this.v = i4;
            this.t = i2;
            if (i3 >= 0 && (qd6VarP = P(i3)) != null) {
                qd6 qd6VarB = qd6VarP.b();
                x20 x20VarB = b(i4);
                ArrayList<Object> arrayList = qd6VarB.a;
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                qd6VarB.a = arrayList;
                arrayList.add(x20VarB);
            }
        } else {
            this.p.c(i3);
            this.q.c((o() - this.h) - this.u);
            int i12 = this.t;
            int iR2 = r(i12);
            if (!wl7.b(obj2, c0020a)) {
                if (z) {
                    W(this.t, obj2);
                } else {
                    U(obj2);
                }
            }
            this.i = O(iR2, this.b);
            this.j = g(r(this.t + 1), this.b);
            int[] iArr2 = this.b;
            int i13 = iR2 * 5;
            this.o = iArr2[i13 + 1] & 67108863;
            this.v = i12;
            this.t = i12 + 1;
            i2 = i12 + iArr2[i13 + 3];
        }
        this.u = i2;
    }

    public final x20 S(int i) {
        ArrayList<x20> arrayList;
        int iD;
        if (i < 0 || i >= p() || (iD = gke.d((arrayList = this.d), i, p())) < 0) {
            return null;
        }
        return arrayList.get(iD);
    }

    public final void T(Object obj) {
        if (this.n <= 0 || this.i == this.k) {
            G(obj);
            return;
        }
        a3a<p3a<Object>> a3aVar = this.s;
        if (a3aVar == null) {
            a3aVar = new a3a<>();
        }
        this.s = a3aVar;
        int i = this.v;
        p3a<Object> p3aVarB = a3aVar.b(i);
        if (p3aVarB == null) {
            p3aVarB = new p3a<>((Object) null);
            a3aVar.h(i, p3aVarB);
        }
        p3aVarB.g(obj);
    }

    public final void U(Object obj) {
        int iR = r(this.t);
        int i = (iR * 5) + 1;
        if ((this.b[i] & 268435456) == 0) {
            d.c("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.c;
        int[] iArr = this.b;
        objArr[h(Integer.bitCount(iArr[i] >> 29) + g(iR, iArr))] = obj;
    }

    public final void V(int i) {
        if (i >= 0) {
            z2a z2aVar = this.x;
            if (z2aVar == null) {
                z2aVar = new z2a();
                this.x = z2aVar;
            }
            pnb.m(z2aVar, i);
        }
    }

    public final void W(int i, Object obj) {
        int iR = r(i);
        int[] iArr = this.b;
        if (iR >= iArr.length || (iArr[(iR * 5) + 1] & 1073741824) == 0) {
            d.c("Updating the node of a group at " + i + " that was not created with as a node group");
        }
        this.c[h(g(iR, this.b))] = obj;
    }

    public final void a(int i) {
        if (i < 0) {
            d.c("Cannot seek backwards");
        }
        if (this.n > 0) {
            gib.b("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.t + i;
        if (i2 < this.v || i2 > this.u) {
            d.c("Cannot seek outside the current group (" + this.v + '-' + this.u + ')');
        }
        this.t = i2;
        int iG = g(r(i2), this.b);
        this.i = iG;
        this.j = iG;
    }

    public final x20 b(int i) {
        ArrayList<x20> arrayList = this.d;
        int iD = gke.d(arrayList, i, p());
        if (iD >= 0) {
            return arrayList.get(iD);
        }
        if (i > this.g) {
            i = -(p() - i);
        }
        x20 x20Var = new x20(i);
        arrayList.add(-(iD + 1), x20Var);
        return x20Var;
    }

    public final int c(x20 x20Var) {
        int i = x20Var.a;
        return i < 0 ? p() + i : i;
    }

    public final void d() {
        int i = this.n;
        this.n = i + 1;
        if (i == 0) {
            this.q.c((o() - this.h) - this.u);
        }
    }

    public final void e(boolean z) {
        this.w = true;
        if (z && this.p.b == 0) {
            A(p());
            B(this.c.length - this.l, this.g);
            int i = this.k;
            Arrays.fill(this.c, i, this.l + i, (Object) null);
            H();
        }
        int[] iArr = this.b;
        int i2 = this.g;
        Object[] objArr = this.c;
        int i3 = this.k;
        ArrayList<x20> arrayList = this.d;
        HashMap<x20, qd6> map = this.e;
        a3a<b3a> a3aVar = this.f;
        m mVar = this.a;
        if (!mVar.V) {
            gib.a("Unexpected writer close()");
        }
        mVar.V = false;
        mVar.a = iArr;
        mVar.b = i2;
        mVar.c = objArr;
        mVar.d = i3;
        mVar.X = arrayList;
        mVar.Y = map;
        mVar.Z = a3aVar;
    }

    public final int f(int i) {
        return g(r(i), this.b);
    }

    public final int g(int i, int[] iArr) {
        if (i >= o()) {
            return this.c.length - this.l;
        }
        int i2 = iArr[(i * 5) + 4];
        return i2 < 0 ? (this.c.length - this.l) + i2 + 1 : i2;
    }

    public final int h(int i) {
        return (this.l * (i < this.k ? 0 : 1)) + i;
    }

    public final void j() {
        p3a<Object> p3aVarB;
        boolean z = this.n > 0;
        int i = this.t;
        int i2 = this.u;
        int i3 = this.v;
        int iR = r(i3);
        int i4 = this.o;
        int i5 = i - i3;
        int i6 = iR * 5;
        int i7 = i6 + 1;
        boolean z2 = (this.b[i7] & 1073741824) != 0;
        vh7 vh7Var = this.r;
        if (z) {
            a3a<p3a<Object>> a3aVar = this.s;
            if (a3aVar != null && (p3aVarB = a3aVar.b(i3)) != null) {
                Object[] objArr = p3aVarB.a;
                int i8 = p3aVarB.b;
                for (int i9 = 0; i9 < i8; i9++) {
                    G(objArr[i9]);
                }
                a3aVar.g(i3);
            }
            int[] iArr = this.b;
            iArr[i6 + 3] = i5;
            gke.c(iR, i4, iArr);
            int iB = vh7Var.b();
            if (z2) {
                i4 = 1;
            }
            this.o = iB + i4;
            int iF = F(i3, this.b);
            this.v = iF;
            int iP = iF < 0 ? p() : r(iF + 1);
            int iG = iP >= 0 ? g(iP, this.b) : 0;
            this.i = iG;
            this.j = iG;
            return;
        }
        if (i != i2) {
            d.c("Expected to be at the end of a group");
        }
        int[] iArr2 = this.b;
        int i10 = i6 + 3;
        int i11 = iArr2[i10];
        int i12 = iArr2[i7] & 67108863;
        iArr2[i10] = i5;
        gke.c(iR, i4, iArr2);
        int iB2 = this.p.b();
        this.u = (o() - this.h) - this.q.b();
        this.v = iB2;
        int iF2 = F(i3, this.b);
        int iB3 = vh7Var.b();
        this.o = iB3;
        if (iF2 == iB2) {
            this.o = iB3 + (z2 ? 0 : i4 - i12);
            return;
        }
        int i13 = i5 - i11;
        int i14 = z2 ? 0 : i4 - i12;
        if (i13 != 0 || i14 != 0) {
            while (iF2 != 0 && iF2 != iB2 && (i14 != 0 || i13 != 0)) {
                int iR2 = r(iF2);
                if (i13 != 0) {
                    int[] iArr3 = this.b;
                    int i15 = (iR2 * 5) + 3;
                    iArr3[i15] = iArr3[i15] + i13;
                }
                if (i14 != 0) {
                    int[] iArr4 = this.b;
                    gke.c(iR2, (iArr4[(iR2 * 5) + 1] & 67108863) + i14, iArr4);
                }
                int[] iArr5 = this.b;
                if ((iArr5[(iR2 * 5) + 1] & 1073741824) != 0) {
                    i14 = 0;
                }
                iF2 = F(iF2, iArr5);
            }
        }
        this.o += i14;
    }

    public final void k() {
        if (this.n <= 0) {
            gib.b("Unbalanced begin/end insert");
        }
        int i = this.n - 1;
        this.n = i;
        if (i == 0) {
            if (this.r.b != this.p.b) {
                d.c("startGroup/endGroup mismatch while inserting");
            }
            this.u = (o() - this.h) - this.q.b();
        }
    }

    public final void l(int i) {
        boolean z = false;
        if (!(this.n <= 0)) {
            d.c("Cannot call ensureStarted() while inserting");
        }
        int i2 = this.v;
        if (i2 != i) {
            if (i >= i2 && i < this.u) {
                z = true;
            }
            if (!z) {
                d.c("Started group at " + i + " must be a subgroup of the group at " + i2);
            }
            int i3 = this.t;
            int i4 = this.i;
            int i5 = this.j;
            this.t = i;
            Q();
            this.t = i3;
            this.i = i4;
            this.j = i5;
        }
    }

    public final void m(int i, int i2, int i3) {
        if (i >= this.g) {
            i = -((p() - i) + 2);
        }
        while (i3 < i2) {
            this.b[(r(i3) * 5) + 2] = i;
            int i4 = this.b[(r(i3) * 5) + 3] + i3;
            m(i3, i4, i3 + 1);
            i3 = i4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e9, code lost:
    
        defpackage.l5.s("Index must be between 0 and size");
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ee, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(int r19, kotlin.jvm.functions.Function2<? super java.lang.Integer, java.lang.Object, defpackage.j6g> r20) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.n.n(int, kotlin.jvm.functions.Function2):void");
    }

    public final int o() {
        return this.b.length / 5;
    }

    public final int p() {
        return o() - this.h;
    }

    public final Object q(int i) {
        int iR = r(i);
        int[] iArr = this.b;
        int i2 = (iR * 5) + 1;
        if ((iArr[i2] & 268435456) == 0) {
            return b.a.a;
        }
        return this.c[Integer.bitCount(iArr[i2] >> 29) + g(iR, iArr)];
    }

    public final int r(int i) {
        return (this.h * (i < this.g ? 0 : 1)) + i;
    }

    public final Object s(int i) {
        int iR = r(i);
        int[] iArr = this.b;
        int i2 = iR * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            return null;
        }
        return this.c[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
    }

    public final int t(int i) {
        return this.b[(r(i) * 5) + 3];
    }

    public final String toString() {
        return "SlotWriter(current = " + this.t + " end=" + this.u + " size = " + p() + " gap=" + this.g + '-' + (this.g + this.h) + ')';
    }

    public final boolean u(int i, int i2) {
        int iO;
        int iT;
        if (i2 == this.v) {
            iO = this.u;
        } else {
            vh7 vh7Var = this.p;
            if (i2 > vh7Var.a(0)) {
                iT = t(i2);
            } else {
                int[] iArr = vh7Var.a;
                int iMin = Math.min(iArr.length, vh7Var.b);
                int i3 = 0;
                while (true) {
                    if (i3 >= iMin) {
                        i3 = -1;
                        break;
                    }
                    if (iArr[i3] == i2) {
                        break;
                    }
                    i3++;
                }
                if (i3 < 0) {
                    iT = t(i2);
                } else {
                    iO = (o() - this.h) - this.q.a[i3];
                }
            }
            iO = iT + i2;
        }
        return i > i2 && i < iO;
    }

    public final void v(int i) {
        if (i > 0) {
            int i2 = this.t;
            A(i2);
            int i3 = this.g;
            int i4 = this.h;
            int[] iArr = this.b;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
                int[] iArr2 = new int[iMax * 5];
                int i6 = iMax - i5;
                pyd.h(0, 0, i3 * 5, iArr, iArr2);
                pyd.h((i3 + i6) * 5, (i4 + i3) * 5, length * 5, iArr, iArr2);
                this.b = iArr2;
                i4 = i6;
            }
            int i7 = this.u;
            if (i7 >= i3) {
                this.u = i7 + i;
            }
            int i8 = i3 + i;
            this.g = i8;
            this.h = i4 - i;
            int i9 = i(i5 > 0 ? f(i2 + i) : 0, this.m >= i3 ? this.k : 0, this.l, this.c.length);
            for (int i10 = i3; i10 < i8; i10++) {
                this.b[(i10 * 5) + 4] = i9;
            }
            int i11 = this.m;
            if (i11 >= i3) {
                this.m = i11 + i;
            }
        }
    }

    public final void w(int i, int i2) {
        if (i > 0) {
            B(this.i, i2);
            int i3 = this.k;
            int i4 = this.l;
            if (i4 < i) {
                Object[] objArr = this.c;
                int length = objArr.length;
                int i5 = length - i4;
                int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i6 = 0; i6 < iMax; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = iMax - i5;
                int i8 = i4 + i3;
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                System.arraycopy(objArr, i8, objArr2, i3 + i7, length - i8);
                this.c = objArr2;
                i4 = i7;
            }
            int i9 = this.j;
            if (i9 >= i3) {
                this.j = i9 + i;
            }
            this.k = i3 + i;
            this.l = i4 - i;
        }
    }

    public final boolean x(int i) {
        return (this.b[(r(i) * 5) + 1] & 1073741824) != 0;
    }

    public final void z(m mVar, int i) {
        if (this.n <= 0) {
            d.c("Check failed");
        }
        if (i == 0 && this.t == 0 && this.a.b == 0) {
            int[] iArr = mVar.a;
            int i2 = iArr[(i * 5) + 3];
            int i3 = mVar.b;
            if (i2 == i3) {
                int[] iArr2 = this.b;
                Object[] objArr = this.c;
                ArrayList<x20> arrayList = this.d;
                HashMap<x20, qd6> map = this.e;
                a3a<b3a> a3aVar = this.f;
                Object[] objArr2 = mVar.c;
                int i4 = mVar.d;
                HashMap<x20, qd6> map2 = mVar.Y;
                a3a<b3a> a3aVar2 = mVar.Z;
                this.b = iArr;
                this.c = objArr2;
                this.d = mVar.X;
                this.g = i3;
                this.h = (iArr.length / 5) - i3;
                this.k = i4;
                this.l = objArr2.length - i4;
                this.m = i3;
                this.e = map2;
                this.f = a3aVar2;
                mVar.a = iArr2;
                mVar.b = 0;
                mVar.c = objArr;
                mVar.d = 0;
                mVar.X = arrayList;
                mVar.Y = map;
                mVar.Z = a3aVar;
                return;
            }
        }
        n nVarF = mVar.f();
        try {
            a.a(nVarF, i, this, true, true, false);
            nVarF.e(true);
        } catch (Throwable th) {
            nVarF.e(false);
            throw th;
        }
    }
}
