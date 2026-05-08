package defpackage;

import androidx.compose.ui.focus.FocusTargetNode;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class km5 extends mj8 implements Function1<FocusTargetNode, Boolean> {
    final /* synthetic */ int $focusDirection;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public km5(int i) {
        super(1);
        this.$focusDirection = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(FocusTargetNode focusTargetNode) {
        return Boolean.valueOf(focusTargetNode.A(this.$focusDirection));
    }
}
