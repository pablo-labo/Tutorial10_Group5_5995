package androidx.compose.ui.platform;

import defpackage.pu2;
import defpackage.uh3;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat", f = "AndroidComposeViewAccessibilityDelegateCompat.android.kt", l = {2096, 2131}, m = "boundsUpdatesEventLoop$ui_release")
public final class e extends pu2 {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = dVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.l(this);
    }
}
