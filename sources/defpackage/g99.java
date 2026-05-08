package defpackage;

import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes2.dex */
public final class g99 extends mj8 implements gu5<irg> {
    final /* synthetic */ Fragment $this_activityViewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g99(f91 f91Var) {
        super(0);
        this.$this_activityViewModels = f91Var;
    }

    @Override // defpackage.gu5
    public final irg invoke() {
        return this.$this_activityViewModels.requireActivity().getViewModelStore();
    }
}
