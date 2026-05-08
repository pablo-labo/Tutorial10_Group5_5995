package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import defpackage.vs0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class pi0 extends mj8 implements Function2<b, Integer, j6g> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ long $actionIconContentColor;
    final /* synthetic */ Function2<b, Integer, j6g> $actions;
    final /* synthetic */ boolean $hideTitleSemantics;
    final /* synthetic */ e $modifier;
    final /* synthetic */ Function2<b, Integer, j6g> $navigationIcon;
    final /* synthetic */ long $navigationIconContentColor;
    final /* synthetic */ qsd $scrolledOffset;
    final /* synthetic */ Function2<b, Integer, j6g> $title;
    final /* synthetic */ float $titleAlpha;
    final /* synthetic */ int $titleBottomPadding;
    final /* synthetic */ long $titleContentColor;
    final /* synthetic */ vs0.e $titleHorizontalArrangement;
    final /* synthetic */ tjf $titleTextStyle;
    final /* synthetic */ vs0.l $titleVerticalArrangement;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public pi0(e eVar, qsd qsdVar, long j, long j2, long j3, Function2<? super b, ? super Integer, j6g> function2, tjf tjfVar, float f, vs0.l lVar, vs0.e eVar2, int i, boolean z, Function2<? super b, ? super Integer, j6g> function22, Function2<? super b, ? super Integer, j6g> function23, int i2, int i3) {
        super(2);
        this.$modifier = eVar;
        this.$scrolledOffset = qsdVar;
        this.$navigationIconContentColor = j;
        this.$titleContentColor = j2;
        this.$actionIconContentColor = j3;
        this.$title = function2;
        this.$titleTextStyle = tjfVar;
        this.$titleAlpha = f;
        this.$titleVerticalArrangement = lVar;
        this.$titleHorizontalArrangement = eVar2;
        this.$titleBottomPadding = i;
        this.$hideTitleSemantics = z;
        this.$navigationIcon = function22;
        this.$actions = function23;
        this.$$changed = i2;
        this.$$changed1 = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        num.intValue();
        qi0.d(this.$modifier, this.$scrolledOffset, this.$navigationIconContentColor, this.$titleContentColor, this.$actionIconContentColor, this.$title, this.$titleTextStyle, this.$titleAlpha, this.$titleVerticalArrangement, this.$titleHorizontalArrangement, this.$titleBottomPadding, this.$hideTitleSemantics, this.$navigationIcon, this.$actions, bVar, ka2.L(this.$$changed | 1), ka2.L(this.$$changed1));
        return j6g.a;
    }
}
