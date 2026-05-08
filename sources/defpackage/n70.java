package defpackage;

import com.datadog.android.rum.internal.domain.scope.RumViewScope;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.ui.text.font.AndroidFontLoader", f = "AndroidFontLoader.android.kt", l = {RumViewScope.SLOW_RENDERED_THRESHOLD_FPS, 57}, m = "awaitLoad")
public final class n70 extends pu2 {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ o70 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n70(o70 o70Var, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = o70Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
