package androidx.fragment.app.testing;

import androidx.activity.ComponentActivity;
import defpackage.gu5;
import defpackage.irg;
import defpackage.mj8;

/* JADX INFO: loaded from: classes.dex */
public final class a extends mj8 implements gu5<irg> {
    final /* synthetic */ ComponentActivity $this_viewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(EmptyFragmentActivity emptyFragmentActivity) {
        super(0);
        this.$this_viewModels = emptyFragmentActivity;
    }

    @Override // defpackage.gu5
    public final irg invoke() {
        return this.$this_viewModels.getViewModelStore();
    }
}
