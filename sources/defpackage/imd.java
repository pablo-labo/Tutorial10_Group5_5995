package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.runtime.b;
import androidx.compose.ui.layout.w;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class imd extends mj8 implements Function2<b, Integer, j6g> {
    final /* synthetic */ Integer $bottomBarHeight;
    final /* synthetic */ List<w> $bottomBarPlaceables;
    final /* synthetic */ wu5<gza, b, Integer, j6g> $content;
    final /* synthetic */ mzg $contentWindowInsets;
    final /* synthetic */ bxe $this_SubcomposeLayout;
    final /* synthetic */ int $topBarHeight;
    final /* synthetic */ List<w> $topBarPlaceables;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public imd(mzg mzgVar, bxe bxeVar, ArrayList arrayList, int i, ArrayList arrayList2, Integer num, wu5 wu5Var) {
        super(2);
        this.$contentWindowInsets = mzgVar;
        this.$this_SubcomposeLayout = bxeVar;
        this.$topBarPlaceables = arrayList;
        this.$topBarHeight = i;
        this.$bottomBarPlaceables = arrayList2;
        this.$bottomBarHeight = num;
        this.$content = wu5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        Integer num2;
        b bVar2 = bVar;
        if ((num.intValue() & 3) == 2 && bVar2.i()) {
            bVar2.D();
        } else {
            qf7 qf7Var = new qf7(this.$contentWindowInsets, this.$this_SubcomposeLayout);
            this.$content.q(new hza(f.d(qf7Var, this.$this_SubcomposeLayout.getLayoutDirection()), this.$topBarPlaceables.isEmpty() ? qf7Var.d() : this.$this_SubcomposeLayout.k1(this.$topBarHeight), f.c(qf7Var, this.$this_SubcomposeLayout.getLayoutDirection()), (this.$bottomBarPlaceables.isEmpty() || (num2 = this.$bottomBarHeight) == null) ? qf7Var.a() : this.$this_SubcomposeLayout.k1(num2.intValue())), bVar2, 0);
        }
        return j6g.a;
    }
}
