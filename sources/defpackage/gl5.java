package defpackage;

import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.w;
import defpackage.al5;
import defpackage.k73;
import defpackage.vs0;
import defpackage.wk5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gl5 implements h1a, dl5 {
    public final vs0.e a;
    public final vs0.l b;
    public final float c;
    public final k73.e d;
    public final float e;
    public final bl5 f;

    public gl5(vs0.e eVar, vs0.l lVar, float f, k73.e eVar2, float f2, bl5 bl5Var) {
        this.a = eVar;
        this.b = lVar;
        this.c = f;
        this.d = eVar2;
        this.e = f2;
        this.f = bl5Var;
    }

    @Override // defpackage.h1a
    public final int a(ql7 ql7Var, List<? extends List<? extends pl7>> list, int i) {
        List list2 = (List) z92.R0(1, list);
        pl7 pl7Var = list2 != null ? (pl7) z92.Q0(list2) : null;
        List list3 = (List) z92.R0(2, list);
        this.f.b(pl7Var, list3 != null ? (pl7) z92.Q0(list3) : null, mq2.b(0, i, 7));
        List list4 = (List) z92.Q0(list);
        if (list4 == null) {
            list4 = zr4.a;
        }
        int iX0 = ql7Var.x0(this.c);
        int size = list4.size();
        int i2 = 0;
        int iMax = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < size) {
            int iP = ((pl7) list4.get(i2)).P(i) + iX0;
            int i5 = i2 + 1;
            if (i5 - i3 == Integer.MAX_VALUE || i5 == list4.size()) {
                iMax = Math.max(iMax, (i4 + iP) - iX0);
                i3 = i2;
                i4 = 0;
            } else {
                i4 += iP;
            }
            i2 = i5;
        }
        return iMax;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [dl5, gl5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [dl5] */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r13v19, types: [T, androidx.compose.ui.layout.w] */
    /* JADX WARN: Type inference failed for: r1v39, types: [T, androidx.compose.ui.layout.w] */
    /* JADX WARN: Type inference failed for: r21v4, types: [pl7] */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r22v4, types: [java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r22v8 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42, types: [T] */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v64 */
    /* JADX WARN: Type inference failed for: r2v65 */
    /* JADX WARN: Type inference failed for: r2v66 */
    /* JADX WARN: Type inference failed for: r2v8, types: [pl7, vf9] */
    /* JADX WARN: Type inference failed for: r33v0, types: [wk5] */
    /* JADX WARN: Type inference failed for: r34v1 */
    /* JADX WARN: Type inference failed for: r38v0, types: [eh7] */
    /* JADX WARN: Type inference failed for: r48v0 */
    /* JADX WARN: Type inference failed for: r48v1, types: [java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r48v4 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [eh7] */
    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.compose.ui.layout.w[]] */
    @Override // defpackage.h1a
    public final bg9 c(q qVar, List<? extends List<? extends vf9>> list, long j) throws Throwable {
        Throwable th;
        j4a j4aVar;
        Object ypdVar;
        ?? r2;
        int i;
        long j2;
        ?? eh7Var;
        wk5.b bVar;
        wk5.a aVarA;
        int i2;
        char c;
        int iG;
        int i3;
        vf9 vf9Var;
        vf9 vf9Var2;
        ?? r22;
        Iterator it;
        int i4;
        eh7 eh7Var2;
        Integer num;
        Integer numValueOf;
        eh7 eh7Var3;
        wk5.b bVar2;
        int i5;
        int i6;
        long jA;
        int i7;
        int i8;
        long jA2;
        ?? r0 = this;
        boolean zIsEmpty = ((ArrayList) list).isEmpty();
        bs4 bs4Var = bs4.a;
        if (!zIsEmpty) {
            int iG2 = iq2.g(j);
            bl5 bl5Var = r0.f;
            if (iG2 != 0 || bl5Var.a == al5.a.a) {
                List list2 = (List) z92.O0(list);
                if (list2.isEmpty()) {
                    return qVar.Y0(0, 0, bs4Var, new kd(7));
                }
                List list3 = (List) z92.R0(1, list);
                vf9 vf9Var3 = list3 != null ? (vf9) z92.Q0(list3) : null;
                List list4 = (List) z92.R0(2, list);
                vf9 vf9Var4 = list4 != null ? (vf9) z92.Q0(list4) : null;
                list2.size();
                bl5Var.getClass();
                wm8 wm8Var = wm8.a;
                long jN = ewa.N(ewa.p(10, ewa.m(j, wm8Var)), wm8Var);
                if (vf9Var3 != null) {
                    th = null;
                    zk5.c(vf9Var3, r0, jN, new m72(3, bl5Var, r0));
                    bl5Var.b = vf9Var3;
                } else {
                    th = null;
                }
                if (vf9Var4 != null) {
                    zk5.c(vf9Var4, r0, jN, new mz4(1, bl5Var, r0));
                    bl5Var.d = vf9Var4;
                }
                Iterator it2 = list2.iterator();
                long jM = ewa.m(j, wm8Var);
                int i9 = zk5.a;
                j4a j4aVar2 = new j4a(new bg9[16]);
                int iH = iq2.h(jM);
                int iJ = iq2.j(jM);
                int iG3 = iq2.g(jM);
                a3a a3aVar = kh7.a;
                a3a a3aVar2 = new a3a();
                ArrayList arrayList = new ArrayList();
                int iCeil = (int) Math.ceil(qVar.t1(r0.c));
                int iCeil2 = (int) Math.ceil(qVar.t1(r0.e));
                long jA3 = mq2.a(0, iH, 0, iG3);
                long jN2 = ewa.N(ewa.p(14, jA3), wm8Var);
                luc lucVar = new luc();
                if (it2 instanceof gu2) {
                    qVar.k1(iH);
                    qVar.k1(iG3);
                    j4aVar = j4aVar2;
                    ypdVar = new ypd(25);
                } else {
                    j4aVar = j4aVar2;
                    ypdVar = th;
                }
                if (it2.hasNext()) {
                    try {
                        if (it2 instanceof gu2) {
                            ypdVar.getClass();
                            throw th;
                        }
                        r2 = (vf9) it2.next();
                    } catch (IndexOutOfBoundsException unused) {
                        r2 = th;
                    }
                } else {
                    r2 = th;
                }
                if (r2 != 0) {
                    if (q92.n(q92.l(r2)) == 0.0f) {
                        q92.l(r2);
                        ?? R = r2.R(jN2);
                        lucVar.element = R;
                        j6g j6gVar = j6g.a;
                        i = iJ;
                        jA2 = eh7.a(r0.g(R), r0.j(R));
                    } else {
                        i = iJ;
                        int iO = r2.O(Integer.MAX_VALUE);
                        jA2 = eh7.a(iO, r2.K(iO));
                    }
                    j2 = jA3;
                    eh7Var = new eh7(jA2);
                } else {
                    i = iJ;
                    j2 = jA3;
                    eh7Var = th;
                }
                Object objValueOf = eh7Var != 0 ? Integer.valueOf((int) (eh7Var.a >> 32)) : th;
                Object objValueOf2 = eh7Var != 0 ? Integer.valueOf((int) (eh7Var.a & 4294967295L)) : th;
                z2a z2aVar = new z2a();
                z2a z2aVar2 = new z2a();
                int[] iArr = sh7.a;
                ?? r48 = objValueOf2;
                b3a b3aVar = new b3a(th);
                bl5 bl5Var2 = r0.f;
                ?? wk5Var = new wk5(bl5Var2, jM, iCeil, iCeil2);
                ?? r38 = eh7Var;
                wk5.b bVarB = wk5Var.b(it2.hasNext(), 0, eh7.a(iH, iG3), r38, 0, 0, 0, false, false);
                ?? r34 = r2;
                if (bVarB.b) {
                    bVar = bVarB;
                    aVarA = wk5Var.a(bVar, r38 != 0, -1, 0, iH, 0);
                } else {
                    bVar = bVarB;
                    aVarA = null;
                }
                wk5.a aVar = aVarA;
                int i10 = iH;
                int i11 = iCeil;
                Object obj = ypdVar;
                b3a b3aVar2 = b3aVar;
                ?? r23 = r34;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                int i18 = iG3;
                wk5.b bVar3 = bVar;
                ?? r222 = objValueOf;
                int i19 = i;
                ?? r02 = r0;
                while (!bVar3.b && r23 != 0) {
                    r222.getClass();
                    int iIntValue = r222.intValue();
                    r48.getClass();
                    int iIntValue2 = r48.intValue();
                    wk5.a aVar2 = aVar;
                    int i20 = i14 + iIntValue;
                    int iMax = Math.max(i12, iIntValue2);
                    int i21 = i10 - iIntValue;
                    int i22 = i13 + 1;
                    bl5Var2.getClass();
                    arrayList.add(r23);
                    a3aVar2.h(i13, lucVar.element);
                    r23.g();
                    int i23 = i22 - i15;
                    boolean z = i23 < Integer.MAX_VALUE;
                    if (obj != null) {
                        if (z) {
                            int i24 = i21 - i11;
                            i3 = i23;
                            i7 = i24 < 0 ? 0 : i24;
                        } else {
                            i3 = i23;
                            i7 = iH;
                        }
                        qVar.k1(i7);
                        if (z) {
                            i8 = i18;
                        } else {
                            i8 = (i18 - iMax) - iCeil2;
                            if (i8 < 0) {
                                i8 = 0;
                            }
                        }
                        qVar.k1(i8);
                        j6g j6gVar2 = j6g.a;
                    } else {
                        i3 = i23;
                    }
                    if (it2.hasNext()) {
                        try {
                            if (it2 instanceof gu2) {
                                obj.getClass();
                                vf9Var = null;
                                try {
                                    throw null;
                                } catch (IndexOutOfBoundsException unused2) {
                                }
                            } else {
                                vf9Var2 = (vf9) it2.next();
                                r22 = 0;
                            }
                        } catch (IndexOutOfBoundsException unused3) {
                            vf9Var = null;
                        }
                        vf9Var2 = vf9Var;
                        r22 = vf9Var;
                    } else {
                        r22 = 0;
                        vf9Var2 = null;
                    }
                    lucVar.element = r22;
                    if (vf9Var2 != null) {
                        if (q92.n(q92.l(vf9Var2)) == 0.0f) {
                            q92.l(vf9Var2);
                            it = it2;
                            i4 = iH;
                            ?? R2 = vf9Var2.R(jN2);
                            lucVar.element = R2;
                            j6g j6gVar3 = j6g.a;
                            jA = eh7.a(r02.g(R2), r02.j(R2));
                        } else {
                            it = it2;
                            i4 = iH;
                            int iO2 = vf9Var2.O(Integer.MAX_VALUE);
                            jA = eh7.a(iO2, vf9Var2.K(iO2));
                        }
                        eh7Var2 = new eh7(jA);
                    } else {
                        it = it2;
                        i4 = iH;
                        eh7Var2 = null;
                    }
                    Integer numValueOf2 = eh7Var2 != null ? Integer.valueOf(((int) (eh7Var2.a >> 32)) + i11) : null;
                    Integer numValueOf3 = eh7Var2 != null ? Integer.valueOf((int) (eh7Var2.a & 4294967295L)) : null;
                    boolean zHasNext = it.hasNext();
                    int i25 = i16;
                    long jA4 = eh7.a(i21, i18);
                    if (eh7Var2 == null) {
                        num = numValueOf3;
                        numValueOf = numValueOf2;
                        eh7Var3 = null;
                    } else {
                        numValueOf2.getClass();
                        int iIntValue3 = numValueOf2.intValue();
                        numValueOf3.getClass();
                        num = numValueOf3;
                        numValueOf = numValueOf2;
                        eh7Var3 = new eh7(eh7.a(iIntValue3, num.intValue()));
                    }
                    wk5.b bVarB2 = wk5Var.b(zHasNext, i3, jA4, eh7Var3, i25, i17, iMax, false, false);
                    int i26 = iMax;
                    if (bVarB2.a) {
                        int iMax2 = Math.max(i19, i20);
                        int i27 = i4;
                        int iMin = Math.min(iMax2, i27);
                        int i28 = i17 + i26;
                        bVar2 = bVarB2;
                        wk5.a aVarA2 = wk5Var.a(bVar2, eh7Var2 != null, i25, i28, i21, i3);
                        z2aVar2.c(i26);
                        i18 = (i18 - i28) - iCeil2;
                        z2aVar.c(i22);
                        i16 = i25 + 1;
                        i17 = i28 + iCeil2;
                        numValueOf = numValueOf != null ? Integer.valueOf(numValueOf.intValue() - i11) : null;
                        i19 = iMin;
                        i4 = i27;
                        i5 = i4;
                        i15 = i22;
                        i26 = 0;
                        aVar = aVarA2;
                        i6 = 0;
                    } else {
                        bVar2 = bVarB2;
                        i5 = i21;
                        i6 = i20;
                        i16 = i25;
                        aVar = aVar2;
                    }
                    r23 = vf9Var2;
                    iH = i4;
                    r48 = num;
                    bVar3 = bVar2;
                    i10 = i5;
                    i14 = i6;
                    i13 = i22;
                    r02 = this;
                    i12 = i26;
                    it2 = it;
                    r222 = numValueOf;
                }
                wk5.a aVar3 = aVar;
                if (aVar3 != null) {
                    long j3 = aVar3.c;
                    arrayList.add(aVar3.a);
                    a3aVar2.h(arrayList.size() - 1, aVar3.b);
                    int i29 = z2aVar.b - 1;
                    if (aVar3.d) {
                        z2aVar2.f(i29, Math.max(z2aVar2.a(i29), (int) (j3 & 4294967295L)));
                        z2aVar.f(i29, z2aVar.b() + 1);
                        j6g j6gVar4 = j6g.a;
                    } else {
                        z2aVar2.c((int) (j3 & 4294967295L));
                        z2aVar.c(z2aVar.b() + 1);
                    }
                }
                int size = arrayList.size();
                ArrayList arrayList2 = arrayList;
                ?? r8 = new w[size];
                for (int i30 = 0; i30 < size; i30++) {
                    r8[i30] = a3aVar2.b(i30);
                }
                int i31 = z2aVar.b;
                int[] iArr2 = new int[i31];
                int[] iArr3 = new int[i31];
                int[] iArr4 = z2aVar.a;
                int i32 = 0;
                int i33 = 0;
                int i34 = 0;
                while (i33 < i31) {
                    ArrayList arrayList3 = arrayList2;
                    int i35 = i19;
                    int i36 = iArr4[i33];
                    int iA = z2aVar2.a(i33);
                    b3a b3aVar3 = b3aVar2;
                    if (b3aVar3.b(i33)) {
                        b3aVar2 = b3aVar3;
                        iG = iA;
                        c = 65535;
                    } else {
                        c = 65535;
                        if (iq2.g(j2) == Integer.MAX_VALUE) {
                            b3aVar2 = b3aVar3;
                            iG = Integer.MAX_VALUE;
                        } else {
                            iG = iq2.g(j2) - i34;
                            b3aVar2 = b3aVar3;
                        }
                    }
                    int[] iArr5 = iArr4;
                    int i37 = i11;
                    int[] iArr6 = iArr3;
                    bg9 bg9VarY = cr8.y(this, i35, iq2.i(j2), iq2.h(j2), iG, i37, qVar, arrayList3, r8, i32, i36, iArr2, i33);
                    int width = bg9VarY.getWidth();
                    int height = bg9VarY.getHeight();
                    iArr6[i33] = height;
                    i34 += height;
                    int iMax3 = Math.max(i35, width);
                    j4aVar.b(bg9VarY);
                    i33++;
                    i32 = i36;
                    i11 = i37;
                    iArr3 = iArr6;
                    i31 = i31;
                    iArr4 = iArr5;
                    iArr2 = iArr2;
                    i19 = iMax3;
                    arrayList2 = arrayList3;
                }
                j4a j4aVar3 = j4aVar;
                int[] iArr7 = iArr3;
                int i38 = i19;
                int[] iArr8 = iArr2;
                if (j4aVar3.c == 0) {
                    i2 = 0;
                    i38 = 0;
                } else {
                    i2 = i34;
                }
                vs0.l lVar = this.b;
                int iC = l5.c(j4aVar3.c, 1, qVar.x0(lVar.a()), i2);
                int i39 = iq2.i(jM);
                int iG4 = iq2.g(jM);
                if (iC < i39) {
                    iC = i39;
                }
                if (iC <= iG4) {
                    iG4 = iC;
                }
                lVar.c(qVar, iG4, iArr7, iArr8);
                int iJ2 = iq2.j(jM);
                int iH2 = iq2.h(jM);
                if (i38 < iJ2) {
                    i38 = iJ2;
                }
                if (i38 <= iH2) {
                    iH2 = i38;
                }
                return qVar.Y0(iH2, iG4, bs4Var, new or(j4aVar3, 8));
            }
        }
        return qVar.Y0(0, 0, bs4Var, new vg(9));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x026c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0258 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    @Override // defpackage.h1a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(defpackage.ql7 r37, java.util.List<? extends java.util.List<? extends defpackage.pl7>> r38, int r39) {
        /*
            Method dump skipped, instruction units count: 634
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gl5.e(ql7, java.util.List, int):int");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gl5)) {
            return false;
        }
        gl5 gl5Var = (gl5) obj;
        return this.a.equals(gl5Var.a) && this.b.equals(gl5Var.b) && j94.c(this.c, gl5Var.c) && this.d.equals(gl5Var.d) && j94.c(this.e, gl5Var.e) && wl7.b(this.f, gl5Var.f);
    }

    @Override // defpackage.h1a
    public final int f(ql7 ql7Var, List<? extends List<? extends pl7>> list, int i) {
        List list2 = (List) z92.R0(1, list);
        pl7 pl7Var = list2 != null ? (pl7) z92.Q0(list2) : null;
        List list3 = (List) z92.R0(2, list);
        this.f.b(pl7Var, list3 != null ? (pl7) z92.Q0(list3) : null, mq2.b(i, 0, 13));
        List list4 = (List) z92.Q0(list);
        if (list4 == null) {
            list4 = zr4.a;
        }
        return l(list4, i, ql7Var.x0(this.c), ql7Var.x0(this.e), this.f);
    }

    @Override // defpackage.h1a
    public final int h(ql7 ql7Var, List<? extends List<? extends pl7>> list, int i) {
        List list2 = (List) z92.R0(1, list);
        pl7 pl7Var = list2 != null ? (pl7) z92.Q0(list2) : null;
        List list3 = (List) z92.R0(2, list);
        this.f.b(pl7Var, list3 != null ? (pl7) z92.Q0(list3) : null, mq2.b(i, 0, 13));
        List list4 = (List) z92.Q0(list);
        if (list4 == null) {
            list4 = zr4.a;
        }
        return l(list4, i, ql7Var.x0(this.c), ql7Var.x0(this.e), this.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + w40.c(Integer.MAX_VALUE, w40.c(Integer.MAX_VALUE, k6.c((this.d.b.hashCode() + k6.c((this.b.hashCode() + ((this.a.hashCode() + (Boolean.hashCode(true) * 31)) * 31)) * 31, this.c, 31)) * 31, this.e, 31), 31), 31);
    }

    @Override // defpackage.dl5
    public final k73 k() {
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int l(List list, int i, int i2, int i3, bl5 bl5Var) {
        int i4;
        long jA;
        int i5 = 0;
        if (list.isEmpty()) {
            jA = eh7.a(0, 0);
        } else {
            int i6 = Integer.MAX_VALUE;
            wk5 wk5Var = new wk5(bl5Var, mq2.a(0, i, 0, Integer.MAX_VALUE), i2, i3);
            pl7 pl7Var = (pl7) z92.R0(0, list);
            int iK = pl7Var != null ? pl7Var.K(i) : 0;
            int iO = pl7Var != null ? pl7Var.O(iK) : 0;
            boolean z = true;
            if (list.size() > 1) {
                i4 = 1;
            } else {
                i4 = 1;
                z = false;
            }
            int i7 = 0;
            if (wk5Var.b(z, 0, eh7.a(i, Integer.MAX_VALUE), pl7Var == null ? null : new eh7(eh7.a(iO, iK)), 0, 0, 0, false, false).b) {
                eh7 eh7VarA = bl5Var.a(0, 0, pl7Var != null ? i4 : 0);
                jA = eh7.a(eh7VarA != null ? (int) (eh7VarA.a & 4294967295L) : 0, 0);
            } else {
                int size = list.size();
                int i8 = i;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    if (i9 >= size) {
                        break;
                    }
                    int i14 = i8 - iO;
                    int i15 = i9 + 1;
                    int iMax = Math.max(i13, iK);
                    pl7 pl7Var2 = (pl7) z92.R0(i15, list);
                    int iK2 = pl7Var2 != null ? pl7Var2.K(i) : i5;
                    int iO2 = pl7Var2 != null ? pl7Var2.O(iK2) + i2 : i5;
                    int i16 = i15 - i11;
                    boolean z2 = i9 + 2 < list.size() ? i4 : i5;
                    int i17 = i12;
                    int i18 = iK2;
                    int i19 = iO2;
                    wk5.b bVarB = wk5Var.b(z2, i16, eh7.a(i14, i6), pl7Var2 == null ? null : new eh7(eh7.a(iO2, iK2)), i17, i7, iMax, false, false);
                    if (bVarB.a) {
                        int i20 = iMax + i3 + i7;
                        wk5.a aVarA = wk5Var.a(bVarB, pl7Var2 != null, i17, i20, i14, i16);
                        int i21 = i19 - i2;
                        i12 = i17 + 1;
                        if (bVarB.b) {
                            if (aVarA != null) {
                                long j = aVarA.c;
                                if (!aVarA.d) {
                                    i20 += ((int) (j & 4294967295L)) + i3;
                                }
                            }
                            i7 = i20;
                            i10 = i15;
                        } else {
                            i11 = i15;
                            i7 = i20;
                            iO = i21;
                            i13 = 0;
                            i8 = i;
                        }
                    } else {
                        iO = i19;
                        i8 = i14;
                        i12 = i17;
                        i13 = iMax;
                    }
                    i9 = i15;
                    i10 = i9;
                    iK = i18;
                    i6 = Integer.MAX_VALUE;
                    i5 = 0;
                    i4 = 1;
                }
                jA = eh7.a(i7 - i3, i10);
            }
        }
        return (int) (jA >> 32);
    }

    @Override // defpackage.dl5
    public final boolean n() {
        return true;
    }

    @Override // defpackage.dl5
    public final vs0.e q() {
        return this.a;
    }

    @Override // defpackage.dl5
    public final vs0.l r() {
        return this.b;
    }

    public final String toString() {
        return "FlowMeasurePolicy(isHorizontal=true, horizontalArrangement=" + this.a + ", verticalArrangement=" + this.b + ", mainAxisSpacing=" + ((Object) j94.e(this.c)) + ", crossAxisAlignment=" + this.d + ", crossAxisArrangementSpacing=" + ((Object) j94.e(this.e)) + ", maxItemsInMainAxis=2147483647, maxLines=2147483647, overflow=" + this.f + ')';
    }
}
