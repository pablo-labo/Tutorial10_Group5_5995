package defpackage;

import androidx.navigation.NavBackStackEntryState;
import androidx.navigation.d;
import androidx.navigation.e;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class waa extends mj8 implements Function1<d, j6g> {
    final /* synthetic */ huc $popped;
    final /* synthetic */ huc $receivedPop;
    final /* synthetic */ boolean $saveState;
    final /* synthetic */ zs0<NavBackStackEntryState> $savedState;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public waa(huc hucVar, huc hucVar2, e eVar, boolean z, zs0<NavBackStackEntryState> zs0Var) {
        super(1);
        this.$receivedPop = hucVar;
        this.$popped = hucVar2;
        this.this$0 = eVar;
        this.$saveState = z;
        this.$savedState = zs0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(d dVar) {
        d dVar2 = dVar;
        dVar2.getClass();
        this.$receivedPop.element = true;
        this.$popped.element = true;
        this.this$0.u(dVar2, this.$saveState, this.$savedState);
        return j6g.a;
    }
}
