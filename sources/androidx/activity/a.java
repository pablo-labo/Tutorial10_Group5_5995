package androidx.activity;

import defpackage.gu5;
import defpackage.j6g;
import defpackage.mj8;

/* JADX INFO: loaded from: classes.dex */
public final class a extends mj8 implements gu5<j6g> {
    final /* synthetic */ ComponentActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ComponentActivity componentActivity) {
        super(0);
        this.this$0 = componentActivity;
    }

    @Override // defpackage.gu5
    public final j6g invoke() {
        this.this$0.reportFullyDrawn();
        return j6g.a;
    }
}
