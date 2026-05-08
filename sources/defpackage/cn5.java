package defpackage;

import androidx.compose.ui.focus.FocusTargetNode;

/* JADX INFO: loaded from: classes.dex */
public final class cn5 extends mj8 implements gu5<j6g> {
    final /* synthetic */ FocusTargetNode $this_grantFocus;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cn5(FocusTargetNode focusTargetNode) {
        super(0);
        this.$this_grantFocus = focusTargetNode;
    }

    @Override // defpackage.gu5
    public final j6g invoke() {
        this.$this_grantFocus.d2();
        return j6g.a;
    }
}
