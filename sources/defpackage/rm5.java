package defpackage;

import androidx.compose.ui.focus.FocusTargetNode;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class rm5 extends mj8 implements Function1<FocusTargetNode, Boolean> {
    final /* synthetic */ int $focusDirection = 7;

    public rm5() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(FocusTargetNode focusTargetNode) {
        return Boolean.valueOf(focusTargetNode.A(this.$focusDirection));
    }
}
