package defpackage;

import androidx.compose.ui.e;
import defpackage.tia;

/* JADX INFO: loaded from: classes.dex */
public final class wia extends mj8 implements gu5<j6g> {
    final /* synthetic */ float $distanceFromEdge;
    final /* synthetic */ qi6 $hitTestResult;
    final /* synthetic */ tia.e $hitTestSource;
    final /* synthetic */ boolean $isInLayer;
    final /* synthetic */ long $pointerPosition;
    final /* synthetic */ int $pointerType;
    final /* synthetic */ e.c $this_speculativeHit;
    final /* synthetic */ tia this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wia(tia tiaVar, e.c cVar, tia.e eVar, long j, qi6 qi6Var, int i, boolean z, float f) {
        super(0);
        this.this$0 = tiaVar;
        this.$this_speculativeHit = cVar;
        this.$hitTestSource = eVar;
        this.$pointerPosition = j;
        this.$hitTestResult = qi6Var;
        this.$pointerType = i;
        this.$isInLayer = z;
        this.$distanceFromEdge = f;
    }

    @Override // defpackage.gu5
    public final j6g invoke() {
        tia tiaVar = this.this$0;
        e.c cVarA = xia.a(this.$this_speculativeHit, this.$hitTestSource.a());
        tia.e eVar = this.$hitTestSource;
        long j = this.$pointerPosition;
        qi6 qi6Var = this.$hitTestResult;
        int i = this.$pointerType;
        boolean z = this.$isInLayer;
        float f = this.$distanceFromEdge;
        tia.d dVar = tia.C0;
        tiaVar.R1(cVarA, eVar, j, qi6Var, i, z, f, false);
        return j6g.a;
    }
}
