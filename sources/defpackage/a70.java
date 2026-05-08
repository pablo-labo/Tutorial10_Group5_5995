package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a70 implements l74 {
    public final /* synthetic */ p44 a;

    public a70(p44 p44Var) {
        this.a = p44Var;
    }

    @Override // defpackage.l74
    public final void dispose() {
        p44 p44Var = this.a;
        p44Var.dismiss();
        p44Var.V.e();
    }
}
