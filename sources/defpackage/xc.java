package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xc implements l74 {
    public final /* synthetic */ iba a;
    public final /* synthetic */ qc b;

    public xc(iba ibaVar, qc qcVar) {
        this.a = ibaVar;
        this.b = qcVar;
    }

    @Override // defpackage.l74
    public final void dispose() {
        iba ibaVar = this.a;
        ibaVar.getClass();
        ibaVar.q.remove(this.b);
    }
}
