package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class gi0 extends mj8 implements Function2<b, Integer, j6g> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ wu5<fhd, b, Integer, j6g> $actions;
    final /* synthetic */ boolean $centeredTitle;
    final /* synthetic */ snf $colors;
    final /* synthetic */ float $expandedHeight;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function2<b, Integer, j6g> $navigationIcon;
    final /* synthetic */ unf $scrollBehavior;
    final /* synthetic */ Function2<b, Integer, j6g> $title;
    final /* synthetic */ tjf $titleTextStyle;
    final /* synthetic */ mzg $windowInsets;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gi0(e eVar, Function2 function2, tjf tjfVar, boolean z, Function2 function22, wu5 wu5Var, float f, mzg mzgVar, snf snfVar, int i, int i2) {
        super(2);
        this.$modifier = eVar;
        this.$title = function2;
        this.$titleTextStyle = tjfVar;
        this.$centeredTitle = z;
        this.$navigationIcon = function22;
        this.$actions = wu5Var;
        this.$expandedHeight = f;
        this.$windowInsets = mzgVar;
        this.$colors = snfVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        num.intValue();
        qi0.b(this.$modifier, this.$title, this.$titleTextStyle, this.$centeredTitle, this.$navigationIcon, this.$actions, this.$expandedHeight, this.$windowInsets, this.$colors, bVar, ka2.L(this.$$changed | 1), this.$$default);
        return j6g.a;
    }
}
