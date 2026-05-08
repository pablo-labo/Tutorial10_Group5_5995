package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class zw9 extends wpa {
    public final /* synthetic */ yw9 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zw9(yw9 yw9Var) {
        super(true);
        this.d = yw9Var;
    }

    @Override // defpackage.wpa
    public final void b() {
        yw9 yw9Var = this.d;
        if (yw9Var.N().canGoBack()) {
            yw9Var.N().goBack();
        } else {
            yw9Var.F(false, false);
        }
    }
}
