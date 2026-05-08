package defpackage;

import java.util.ArrayList;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class pva extends w2<vr1> implements RandomAccess {
    public final vr1[] a;
    public final int[] b;

    public static final class a {
        public static void a(long j, zn1 zn1Var, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
            int i4;
            int i5;
            ArrayList arrayList3;
            long j2;
            int i6;
            int i7 = i;
            ArrayList arrayList4 = arrayList;
            ArrayList arrayList5 = arrayList2;
            if (i2 >= i3) {
                l5.q("Failed requirement.");
                return;
            }
            for (int i8 = i2; i8 < i3; i8++) {
                if (((vr1) arrayList4.get(i8)).h() < i7) {
                    l5.q("Failed requirement.");
                    return;
                }
            }
            vr1 vr1Var = (vr1) arrayList.get(i2);
            vr1 vr1Var2 = (vr1) arrayList4.get(i3 - 1);
            if (i7 == vr1Var.h()) {
                int iIntValue = ((Number) arrayList5.get(i2)).intValue();
                int i9 = i2 + 1;
                vr1 vr1Var3 = (vr1) arrayList4.get(i9);
                i4 = i9;
                i5 = iIntValue;
                vr1Var = vr1Var3;
            } else {
                i4 = i2;
                i5 = -1;
            }
            if (vr1Var.r(i7) == vr1Var2.r(i7)) {
                int iMin = Math.min(vr1Var.h(), vr1Var2.h());
                int i10 = 0;
                for (int i11 = i7; i11 < iMin && vr1Var.r(i11) == vr1Var2.r(i11); i11++) {
                    i10++;
                }
                long j3 = (zn1Var.b / 4) + j + 2 + ((long) i10) + 1;
                zn1Var.L0(-i10);
                zn1Var.L0(i5);
                int i12 = i7 + i10;
                while (i7 < i12) {
                    zn1Var.L0(vr1Var.r(i7) & 255);
                    i7++;
                }
                if (i4 + 1 == i3) {
                    if (i12 == ((vr1) arrayList4.get(i4)).h()) {
                        zn1Var.L0(((Number) arrayList5.get(i4)).intValue());
                        return;
                    } else {
                        r6.g("Check failed.");
                        return;
                    }
                }
                zn1 zn1Var2 = new zn1();
                zn1Var.L0(((int) ((zn1Var2.b / 4) + j3)) * (-1));
                a(j3, zn1Var2, i12, arrayList4, i4, i3, arrayList5);
                zn1Var.a1(zn1Var2);
                return;
            }
            int i13 = 1;
            for (int i14 = i4 + 1; i14 < i3; i14++) {
                if (((vr1) arrayList4.get(i14 - 1)).r(i7) != ((vr1) arrayList4.get(i14)).r(i7)) {
                    i13++;
                }
            }
            long j4 = (zn1Var.b / 4) + j + 2 + ((long) (i13 * 2));
            zn1Var.L0(i13);
            zn1Var.L0(i5);
            for (int i15 = i4; i15 < i3; i15++) {
                int iR = ((vr1) arrayList4.get(i15)).r(i7);
                if (i15 == i4 || iR != ((vr1) arrayList4.get(i15 - 1)).r(i7)) {
                    zn1Var.L0(iR & 255);
                }
            }
            zn1 zn1Var3 = new zn1();
            int i16 = i4;
            while (i16 < i3) {
                byte bR = ((vr1) arrayList4.get(i16)).r(i7);
                int i17 = i16 + 1;
                int i18 = i17;
                while (true) {
                    if (i18 >= i3) {
                        i18 = i3;
                        break;
                    } else if (bR != ((vr1) arrayList4.get(i18)).r(i7)) {
                        break;
                    } else {
                        i18++;
                    }
                }
                if (i17 == i18 && i7 + 1 == ((vr1) arrayList4.get(i16)).h()) {
                    zn1Var.L0(((Number) arrayList5.get(i16)).intValue());
                    arrayList3 = arrayList5;
                    j2 = j4;
                    i6 = i18;
                } else {
                    zn1Var.L0(((int) ((zn1Var3.b / 4) + j4)) * (-1));
                    arrayList3 = arrayList5;
                    j2 = j4;
                    i6 = i18;
                    a(j2, zn1Var3, i7 + 1, arrayList, i16, i6, arrayList3);
                    arrayList4 = arrayList;
                }
                j4 = j2;
                i16 = i6;
                arrayList5 = arrayList3;
            }
            zn1Var.a1(zn1Var3);
        }

        /* JADX WARN: Code restructure failed: missing block: B:43:0x00af, code lost:
        
            continue;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static defpackage.pva b(defpackage.vr1... r11) {
            /*
                Method dump skipped, instruction units count: 231
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: pva.a.b(vr1[]):pva");
        }
    }

    public pva(vr1[] vr1VarArr, int[] iArr) {
        this.a = vr1VarArr;
        this.b = iArr;
    }

    @Override // defpackage.l1
    public final int a() {
        return this.a.length;
    }

    @Override // defpackage.l1, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof vr1) {
            return super.contains((vr1) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.a[i];
    }

    @Override // defpackage.w2, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof vr1) {
            return super.indexOf((vr1) obj);
        }
        return -1;
    }

    @Override // defpackage.w2, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof vr1) {
            return super.lastIndexOf((vr1) obj);
        }
        return -1;
    }
}
