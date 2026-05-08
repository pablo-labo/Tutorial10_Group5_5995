package defpackage;

import okhttp3.CacheControl;
import okhttp3.Headers;

/* JADX INFO: loaded from: classes.dex */
public final class xt1 extends mj8 implements gu5<CacheControl> {
    final /* synthetic */ zt1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xt1(zt1 zt1Var) {
        super(0);
        this.this$0 = zt1Var;
    }

    @Override // defpackage.gu5
    public final CacheControl invoke() {
        CacheControl.Companion companion = CacheControl.n;
        Headers headers = this.this$0.f;
        companion.getClass();
        return CacheControl.Companion.a(headers);
    }
}
