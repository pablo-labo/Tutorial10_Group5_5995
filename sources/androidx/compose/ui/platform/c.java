package androidx.compose.ui.platform;

import defpackage.g13;
import defpackage.pu2;
import defpackage.uh3;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.ui.platform.AndroidComposeView", f = "AndroidComposeView.android.kt", l = {734}, m = "textInputSession")
public final class c extends pu2 {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidComposeView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AndroidComposeView androidComposeView, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = androidComposeView;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        this.this$0.x(null, this);
        return g13.a;
    }
}
