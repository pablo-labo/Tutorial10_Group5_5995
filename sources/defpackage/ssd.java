package defpackage;

import com.datadog.android.core.internal.system.DefaultAndroidInfoProvider;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.foundation.gestures.ScrollingLogic", f = "Scrollable.kt", l = {DefaultAndroidInfoProvider.MIN_TABLET_WIDTH_DP}, m = "doFlingAnimation-QWom1Mo")
public final class ssd extends pu2 {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ xsd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ssd(xsd xsdVar, pu2 pu2Var) {
        super(pu2Var);
        this.this$0 = xsdVar;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(0L, this);
    }
}
