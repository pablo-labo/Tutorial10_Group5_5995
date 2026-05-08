package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ra9<I, O> extends z8<I> {
    public final a9<I> a;
    public final g4a b;

    public ra9(a9 a9Var, g4a g4aVar) {
        this.a = a9Var;
        this.b = g4aVar;
    }

    @Override // defpackage.z8
    public final void a(Object obj) {
        j6g j6gVar;
        f9 f9Var = this.a.a;
        if (f9Var != null) {
            f9Var.a(obj);
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
