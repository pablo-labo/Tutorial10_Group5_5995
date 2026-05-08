package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jw9 implements l74 {
    public final /* synthetic */ bv9 a;

    public jw9(bv9 bv9Var) {
        this.a = bv9Var;
    }

    @Override // defpackage.l74
    public final void dispose() {
        bv9 bv9Var = this.a;
        bv9Var.dismiss();
        bv9Var.V.e();
    }
}
