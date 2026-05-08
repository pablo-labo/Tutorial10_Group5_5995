package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.draw.a;
import androidx.compose.ui.e;

/* JADX INFO: loaded from: classes.dex */
public final class gef extends mj8 implements wu5<e, b, Integer, e> {
    final /* synthetic */ zdf $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ float $focusedIndicatorLineThickness;
    final /* synthetic */ ei7 $interactionSource;
    final /* synthetic */ boolean $isError;
    final /* synthetic */ float $unfocusedIndicatorLineThickness;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gef(ei7 ei7Var, boolean z, boolean z2, zdf zdfVar, float f, float f2) {
        super(3);
        this.$interactionSource = ei7Var;
        this.$enabled = z;
        this.$isError = z2;
        this.$colors = zdfVar;
        this.$focusedIndicatorLineThickness = f;
        this.$unfocusedIndicatorLineThickness = f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wu5
    public final e q(e eVar, b bVar, Integer num) {
        b bVar2 = bVar;
        num.intValue();
        bVar2.L(-891038934);
        e eVarC = a.c(e.a.b, new yff(qef.d(this.$enabled, this.$isError, ((Boolean) wg2.p(this.$interactionSource, bVar2, 0).getValue()).booleanValue(), this.$colors, this.$focusedIndicatorLineThickness, this.$unfocusedIndicatorLineThickness, bVar2, 0)));
        bVar2.F();
        return eVarC;
    }
}
