package androidx.compose.ui.layout;

import androidx.compose.ui.layout.w;
import defpackage.bg9;
import defpackage.bs4;
import defpackage.iq2;
import defpackage.j6g;
import defpackage.mj8;
import defpackage.mq2;
import defpackage.pm8;
import defpackage.vf9;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class y extends pm8.e {
    public static final y b = new y("Undefined intrinsics block and it is required");

    public static final class a extends mj8 implements Function1<w.a, j6g> {
        public static final a a = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ j6g invoke(w.a aVar) {
            return j6g.a;
        }
    }

    public static final class b extends mj8 implements Function1<w.a, j6g> {
        final /* synthetic */ w $placeable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(w wVar) {
            super(1);
            this.$placeable = wVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(w.a aVar) {
            w.a.z(aVar, this.$placeable, 0, 0);
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
            List<w> list = this.$placeables;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                w.a.z(aVar2, list.get(i), 0, 0);
            }
            return j6g.a;
        }
    }

    @Override // defpackage.ag9
    public final bg9 c(q qVar, List<? extends vf9> list, long j) {
        int size = list.size();
        bs4 bs4Var = bs4.a;
        if (size == 0) {
            return qVar.Y0(iq2.j(j), iq2.i(j), bs4Var, a.a);
        }
        if (size == 1) {
            w wVarR = list.get(0).R(j);
            return qVar.Y0(mq2.g(wVarR.a, j), mq2.f(wVarR.b, j), bs4Var, new b(wVarR));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size2; i++) {
            w wVarR2 = list.get(i).R(j);
            iMax = Math.max(wVarR2.a, iMax);
            iMax2 = Math.max(wVarR2.b, iMax2);
            arrayList.add(wVarR2);
        }
        return qVar.Y0(mq2.g(iMax, j), mq2.f(iMax2, j), bs4Var, new c(arrayList));
    }
}
