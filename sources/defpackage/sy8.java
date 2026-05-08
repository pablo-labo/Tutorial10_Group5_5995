package defpackage;

import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.w;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class sy8 implements ag9 {
    public final /* synthetic */ List<j94> a;

    public sy8(List<j94> list) {
        this.a = list;
    }

    @Override // defpackage.ag9
    public final bg9 c(q qVar, List<? extends vf9> list, long j) {
        int iV;
        long jA = iq2.a(0, 0, 0, Integer.MAX_VALUE, 3, j);
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(list.get(i).R(jA));
        }
        Integer numValueOf = 0;
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            numValueOf = Integer.valueOf(Math.max(numValueOf.intValue(), ((w) arrayList.get(i2)).a));
        }
        int iIntValue = numValueOf.intValue();
        int[] iArr = new int[arrayList.size()];
        int size3 = arrayList.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size3; i4++) {
            w wVar = (w) arrayList.get(i4);
            if (i4 > 0) {
                int i5 = i4 - 1;
                iV = ((w) arrayList.get(i5)).b - ((w) arrayList.get(i5)).V(e20.b);
            } else {
                iV = 0;
            }
            int iMax = Math.max(0, (qVar.x0(this.a.get(i4).a) - wVar.V(e20.a)) - iV);
            iArr[i4] = iMax + i3;
            i3 += iMax + wVar.b;
        }
        return qVar.Y0(iIntValue, i3, bs4.a, new aj(1, arrayList, iArr));
    }
}
