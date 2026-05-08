package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fo3 implements ok6 {
    public final long a;
    public final /* synthetic */ vr1 b;

    public fo3(vr1 vr1Var) {
        this.b = vr1Var;
        this.a = vr1Var.h();
    }

    @Override // defpackage.ok6
    public final long a() {
        return this.a;
    }

    @Override // defpackage.ok6
    public final void b(ro1 ro1Var) {
        ro1Var.v0(this.b);
    }

    @Override // defpackage.ok6
    public final String getContentType() {
        return "application/json";
    }
}
