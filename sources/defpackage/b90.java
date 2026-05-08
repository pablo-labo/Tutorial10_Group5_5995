package defpackage;

import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.w;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class b90 implements ag9 {
    public static final b90 a = new b90();

    public static final class a extends mj8 implements Function1<w.a, j6g> {
        public static final a a = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ j6g invoke(w.a aVar) {
            return j6g.a;
        }
    }

    public static final class b extends mj8 implements Function1<w.a, j6g> {
        final /* synthetic */ w $p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(w wVar) {
            super(1);
            this.$p = wVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(w.a aVar) {
            w.a.y(aVar, this.$p, 0, 0);
            return j6g.a;
        }
    }

    public static final class c extends mj8 implements Function1<w.a, j6g> {
        final /* synthetic */ List<w> $placeables;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ArrayList arrayList) {
            super(1);
            this.$placeables = arrayList;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(w.a aVar) {
            w.a aVar2 = aVar;
            int iJ = u63.J(this.$placeables);
            if (iJ >= 0) {
                int i = 0;
                while (true) {
                    w.a.y(aVar2, this.$placeables.get(i), 0, 0);
                    if (i == iJ) {
                        break;
                    }
                    i++;
                }
            }
            return j6g.a;
        }
    }

    @Override // defpackage.ag9
    public final bg9 c(q qVar, List<? extends vf9> list, long j) {
        int size = list.size();
        bs4 bs4Var = bs4.a;
        if (size == 0) {
            return qVar.Y0(0, 0, bs4Var, a.a);
        }
        if (size == 1) {
            w wVarR = list.get(0).R(j);
            return qVar.Y0(wVarR.a, wVarR.b, bs4Var, new b(wVarR));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size2; i++) {
            w wVarR2 = list.get(i).R(j);
            iMax = Math.max(iMax, wVarR2.a);
            iMax2 = Math.max(iMax2, wVarR2.b);
            arrayList.add(wVarR2);
        }
        return qVar.Y0(iMax, iMax2, bs4Var, new c(arrayList));
    }
}
