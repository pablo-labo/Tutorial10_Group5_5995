package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ek4 implements l74 {
    public final /* synthetic */ iba a;
    public final /* synthetic */ ck4 b;

    public ek4(iba ibaVar, ck4 ck4Var) {
        this.a = ibaVar;
        this.b = ck4Var;
    }

    @Override // defpackage.l74
    public final void dispose() {
        iba ibaVar = this.a;
        ibaVar.getClass();
        ibaVar.q.remove(this.b);
    }
}
