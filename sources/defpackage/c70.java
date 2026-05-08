package defpackage;

import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.w;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class c70 implements ag9 {
    public static final c70 a = new c70();

    public static final class a extends mj8 implements Function1<w.a, j6g> {
        final /* synthetic */ List<w> $placeables;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ArrayList arrayList) {
            super(1);
            this.$placeables = arrayList;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(w.a aVar) {
            w.a aVar2 = aVar;
            List<w> list = this.$placeables;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                w.a.y(aVar2, list.get(i), 0, 0);
            }
            return j6g.a;
        }
    }

    @Override // defpackage.ag9
    public final bg9 c(q qVar, List<? extends vf9> list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iJ = 0;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            w wVarR = list.get(i2).R(j);
            iJ = Math.max(iJ, wVarR.a);
            i = Math.max(i, wVarR.b);
            arrayList.add(wVarR);
        }
        if (list.isEmpty()) {
            iJ = iq2.j(j);
            i = iq2.i(j);
        }
        return qVar.Y0(iJ, i, bs4.a, new a(arrayList));
    }
}
