package defpackage;

import androidx.activity.ComponentActivity;
import androidx.fragment.app.testing.EmptyFragmentActivity;

/* JADX INFO: loaded from: classes.dex */
public final class ar5 extends mj8 implements gu5<p63> {
    final /* synthetic */ gu5 $extrasProducer = null;
    final /* synthetic */ ComponentActivity $this_viewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar5(EmptyFragmentActivity emptyFragmentActivity) {
        super(0);
        this.$this_viewModels = emptyFragmentActivity;
    }

    @Override // defpackage.gu5
    public final p63 invoke() {
        p63 p63Var;
        gu5 gu5Var = this.$extrasProducer;
        return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_viewModels.getDefaultViewModelCreationExtras() : p63Var;
    }
}
