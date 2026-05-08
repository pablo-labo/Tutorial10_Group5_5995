package defpackage;

import android.view.inputmethod.BaseInputConnection;

/* JADX INFO: loaded from: classes.dex */
public final class thf extends mj8 implements gu5<BaseInputConnection> {
    final /* synthetic */ shf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public thf(shf shfVar) {
        super(0);
        this.this$0 = shfVar;
    }

    @Override // defpackage.gu5
    public final BaseInputConnection invoke() {
        return new BaseInputConnection(this.this$0.a, false);
    }
}
