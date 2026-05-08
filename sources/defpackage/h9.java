package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h9 implements l74 {
    public final /* synthetic */ a9 a;

    public h9(a9 a9Var) {
        this.a = a9Var;
    }

    @Override // defpackage.l74
    public final void dispose() {
        j6g j6gVar;
        f9 f9Var = this.a.a;
        if (f9Var != null) {
            f9Var.b();
            j6gVar = j6g.a;
        } else {
            j6gVar = null;
        }
        if (j6gVar != null) {
            return;
        }
        r6.g("Launcher has not been initialized");
    }
}
