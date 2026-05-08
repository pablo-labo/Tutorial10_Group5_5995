package defpackage;

import androidx.compose.foundation.lazy.layout.c;
import defpackage.lr8;
import defpackage.zp8;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dq8 {
    public static final List<Integer> a(c cVar, lr8 lr8Var, zp8 zp8Var) {
        oh7 oh7Var;
        j4a<zp8.a> j4aVar = zp8Var.a;
        if (!(j4aVar.c != 0) && lr8Var.a.isEmpty()) {
            return zr4.a;
        }
        ArrayList arrayList = new ArrayList();
        if (zp8Var.a.c != 0) {
            int i = j4aVar.c;
            if (i == 0) {
                s6.j("MutableVector is empty.");
                return null;
            }
            zp8.a[] aVarArr = j4aVar.a;
            int i2 = aVarArr[0].a;
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = aVarArr[i3].a;
                if (i4 < i2) {
                    i2 = i4;
                }
            }
            if (i2 < 0) {
                de7.a("negative minIndex");
            }
            int i5 = j4aVar.c;
            if (i5 == 0) {
                s6.j("MutableVector is empty.");
                return null;
            }
            zp8.a[] aVarArr2 = j4aVar.a;
            int i6 = aVarArr2[0].b;
            for (int i7 = 0; i7 < i5; i7++) {
                int i8 = aVarArr2[i7].b;
                if (i8 > i6) {
                    i6 = i8;
                }
            }
            oh7Var = new oh7(i2, Math.min(i6, cVar.a() - 1), 1);
        } else {
            oh7Var = oh7.d;
        }
        int size = lr8Var.a.size();
        for (int i9 = 0; i9 < size; i9++) {
            lr8.a aVar = (lr8.a) lr8Var.get(i9);
            int iL = ak2.l(aVar.getIndex(), cVar, aVar.getKey());
            int i10 = oh7Var.a;
            if ((iL > oh7Var.b || i10 > iL) && iL >= 0 && iL < cVar.a()) {
                arrayList.add(Integer.valueOf(iL));
            }
        }
        int i11 = oh7Var.a;
        int i12 = oh7Var.b;
        if (i11 <= i12) {
            while (true) {
                arrayList.add(Integer.valueOf(i11));
                if (i11 == i12) {
                    break;
                }
                i11++;
            }
        }
        return arrayList;
    }
}
