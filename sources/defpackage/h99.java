package defpackage;

import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes2.dex */
public final class h99 extends mj8 implements gu5<p63> {
    final /* synthetic */ gu5 $extrasProducer = null;
    final /* synthetic */ Fragment $this_activityViewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h99(f91 f91Var) {
        super(0);
        this.$this_activityViewModels = f91Var;
    }

    @Override // defpackage.gu5
    public final p63 invoke() {
        p63 p63Var;
        gu5 gu5Var = this.$extrasProducer;
        return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : p63Var;
    }
}
