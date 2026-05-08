package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class uia extends mj8 implements Function2<ww1, xc6, j6g> {
    final /* synthetic */ gu5<j6g> $drawBlockCallToDrawModifiers;
    final /* synthetic */ tia this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uia(tia tiaVar, via viaVar) {
        super(2);
        this.this$0 = tiaVar;
        this.$drawBlockCallToDrawModifiers = viaVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(ww1 ww1Var, xc6 xc6Var) {
        ww1 ww1Var2 = ww1Var;
        xc6 xc6Var2 = xc6Var;
        boolean zK = this.this$0.e0.k();
        tia tiaVar = this.this$0;
        if (zK) {
            tiaVar.w0 = ww1Var2;
            tiaVar.v0 = xc6Var2;
            tm8.a(tiaVar.e0).getSnapshotObserver().a(this.this$0, tia.D0, this.$drawBlockCallToDrawModifiers);
            this.this$0.z0 = false;
        } else {
            tiaVar.z0 = true;
        }
        return j6g.a;
    }
}
