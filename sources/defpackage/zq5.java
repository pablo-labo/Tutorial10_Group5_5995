package defpackage;

import androidx.activity.ComponentActivity;
import androidx.fragment.app.testing.EmptyFragmentActivity;
import defpackage.grg;

/* JADX INFO: loaded from: classes.dex */
public final class zq5 extends mj8 implements gu5<grg.c> {
    final /* synthetic */ ComponentActivity $this_viewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zq5(EmptyFragmentActivity emptyFragmentActivity) {
        super(0);
        this.$this_viewModels = emptyFragmentActivity;
    }

    @Override // defpackage.gu5
    public final grg.c invoke() {
        grg.c defaultViewModelProviderFactory = this.$this_viewModels.getDefaultViewModelProviderFactory();
        defaultViewModelProviderFactory.getClass();
        return defaultViewModelProviderFactory;
    }
}
