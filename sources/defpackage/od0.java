package defpackage;

import androidx.compose.animation.i;
import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class od0 extends mj8 implements Function2<b, Integer, j6g> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ wu5<qd0, b, Integer, j6g> $content;
    final /* synthetic */ lv4 $enter;
    final /* synthetic */ r25 $exit;
    final /* synthetic */ e $modifier;
    final /* synthetic */ rqa $onLookaheadMeasured;
    final /* synthetic */ Function2<iu4, iu4, Boolean> $shouldDisposeBlock;
    final /* synthetic */ csf<Object> $transition;
    final /* synthetic */ Function1<Object, Boolean> $visible;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public od0(csf csfVar, Function1 function1, e eVar, lv4 lv4Var, r25 r25Var, Function2 function2, wu5 wu5Var, int i, int i2) {
        super(2);
        this.$transition = csfVar;
        this.$visible = function1;
        this.$modifier = eVar;
        this.$enter = lv4Var;
        this.$exit = r25Var;
        this.$shouldDisposeBlock = function2;
        this.$content = wu5Var;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        num.intValue();
        i.a(this.$transition, this.$visible, this.$modifier, this.$enter, this.$exit, this.$shouldDisposeBlock, this.$content, bVar, ka2.L(this.$$changed | 1), this.$$default);
        return j6g.a;
    }
}
