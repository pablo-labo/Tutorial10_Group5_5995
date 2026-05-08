package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class n50 extends mj8 implements Function1<e13, u80> {
    final /* synthetic */ AndroidComposeView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n50(AndroidComposeView androidComposeView) {
        super(1);
        this.this$0 = androidComposeView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final u80 invoke(e13 e13Var) {
        AndroidComposeView androidComposeView = this.this$0;
        return new u80(androidComposeView, androidComposeView.getTextInputService(), e13Var);
    }
}
