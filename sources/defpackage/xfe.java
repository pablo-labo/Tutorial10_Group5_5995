package defpackage;

import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.w;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xfe implements ag9 {
    public static final xfe a = new xfe();

    @Override // defpackage.ag9
    public final bg9 c(q qVar, List<? extends vf9> list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size; i++) {
            w wVarR = list.get(i).R(j);
            iMax = Math.max(iMax, wVarR.a);
            iMax2 = Math.max(iMax2, wVarR.b);
            arrayList.add(wVarR);
        }
        return qVar.Y0(iMax, iMax2, bs4.a, new cd(arrayList, 16));
    }
}
