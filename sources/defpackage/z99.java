package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class z99 implements l74 {
    public final /* synthetic */ iba a;
    public final /* synthetic */ p99 b;

    public z99(iba ibaVar, p99 p99Var) {
        this.a = ibaVar;
        this.b = p99Var;
    }

    @Override // defpackage.l74
    public final void dispose() {
        iba ibaVar = this.a;
        ibaVar.getClass();
        ibaVar.q.remove(this.b);
    }
}
