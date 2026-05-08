package defpackage;

import androidx.compose.ui.layout.w;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class hmd extends mj8 implements Function1<w.a, j6g> {
    final /* synthetic */ List<w> $bodyContentPlaceables;
    final /* synthetic */ Integer $bottomBarHeight;
    final /* synthetic */ List<w> $bottomBarPlaceables;
    final /* synthetic */ mzg $contentWindowInsets;
    final /* synthetic */ Integer $fabOffsetFromBottom;
    final /* synthetic */ List<w> $fabPlaceables;
    final /* synthetic */ t55 $fabPlacement;
    final /* synthetic */ int $layoutHeight;
    final /* synthetic */ int $layoutWidth;
    final /* synthetic */ int $snackbarOffsetFromBottom;
    final /* synthetic */ List<w> $snackbarPlaceables;
    final /* synthetic */ int $snackbarWidth;
    final /* synthetic */ bxe $this_SubcomposeLayout;
    final /* synthetic */ List<w> $topBarPlaceables;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hmd(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, t55 t55Var, int i, int i2, mzg mzgVar, bxe bxeVar, int i3, int i4, Integer num, ArrayList arrayList5, Integer num2) {
        super(1);
        this.$bodyContentPlaceables = arrayList;
        this.$topBarPlaceables = arrayList2;
        this.$snackbarPlaceables = arrayList3;
        this.$bottomBarPlaceables = arrayList4;
        this.$fabPlacement = t55Var;
        this.$layoutWidth = i;
        this.$snackbarWidth = i2;
        this.$contentWindowInsets = mzgVar;
        this.$this_SubcomposeLayout = bxeVar;
        this.$layoutHeight = i3;
        this.$snackbarOffsetFromBottom = i4;
        this.$bottomBarHeight = num;
        this.$fabPlaceables = arrayList5;
        this.$fabOffsetFromBottom = num2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(w.a aVar) {
        w.a aVar2 = aVar;
        List<w> list = this.$bodyContentPlaceables;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            aVar2.r(list.get(i), 0, 0, 0.0f);
        }
        List<w> list2 = this.$topBarPlaceables;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            aVar2.r(list2.get(i2), 0, 0, 0.0f);
        }
        List<w> list3 = this.$snackbarPlaceables;
        int i3 = this.$layoutWidth;
        int i4 = this.$snackbarWidth;
        mzg mzgVar = this.$contentWindowInsets;
        bxe bxeVar = this.$this_SubcomposeLayout;
        int i5 = this.$layoutHeight;
        int i6 = this.$snackbarOffsetFromBottom;
        int size3 = list3.size();
        for (int i7 = 0; i7 < size3; i7++) {
            aVar2.r(list3.get(i7), mzgVar.d(bxeVar, bxeVar.getLayoutDirection()) + ((i3 - i4) / 2), i5 - i6, 0.0f);
        }
        List<w> list4 = this.$bottomBarPlaceables;
        int i8 = this.$layoutHeight;
        Integer num = this.$bottomBarHeight;
        int size4 = list4.size();
        for (int i9 = 0; i9 < size4; i9++) {
            aVar2.r(list4.get(i9), 0, i8 - (num != null ? num.intValue() : 0), 0.0f);
        }
        t55 t55Var = this.$fabPlacement;
        if (t55Var != null) {
            List<w> list5 = this.$fabPlaceables;
            int i10 = this.$layoutHeight;
            Integer num2 = this.$fabOffsetFromBottom;
            int size5 = list5.size();
            for (int i11 = 0; i11 < size5; i11++) {
                w wVar = list5.get(i11);
                int i12 = t55Var.a;
                num2.getClass();
                aVar2.r(wVar, i12, i10 - num2.intValue(), 0.0f);
            }
        }
        return j6g.a;
    }
}
