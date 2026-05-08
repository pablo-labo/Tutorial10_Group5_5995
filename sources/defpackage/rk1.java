package defpackage;

import androidx.navigation.d;

/* JADX INFO: loaded from: classes.dex */
public final class rk1 extends mj8 implements gu5<j6g> {
    final /* synthetic */ ese<d> $retainedEntry$delegate;
    final /* synthetic */ pk1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rk1(pk1 pk1Var, g4a g4aVar) {
        super(0);
        this.this$0 = pk1Var;
        this.$retainedEntry$delegate = g4aVar;
    }

    @Override // defpackage.gu5
    public final j6g invoke() {
        nea neaVarB = this.this$0.b();
        d value = this.$retainedEntry$delegate.getValue();
        value.getClass();
        neaVarB.e(value, false);
        return j6g.a;
    }
}
