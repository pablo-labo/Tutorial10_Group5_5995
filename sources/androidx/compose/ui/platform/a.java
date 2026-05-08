package androidx.compose.ui.platform;

import androidx.compose.ui.focus.FocusTargetNode;
import defpackage.mj8;
import defpackage.ol5;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class a extends mj8 implements Function1<FocusTargetNode, Boolean> {
    final /* synthetic */ ol5 $focusDirection;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ol5 ol5Var) {
        super(1);
        this.$focusDirection = ol5Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(FocusTargetNode focusTargetNode) {
        return Boolean.valueOf(focusTargetNode.A(this.$focusDirection.a));
    }
}
