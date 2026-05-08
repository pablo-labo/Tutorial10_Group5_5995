package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zs implements l74 {
    public final /* synthetic */ iba a;
    public final /* synthetic */ ms b;

    public zs(iba ibaVar, ms msVar) {
        this.a = ibaVar;
        this.b = msVar;
    }

    @Override // defpackage.l74
    public final void dispose() {
        iba ibaVar = this.a;
        ibaVar.getClass();
        ibaVar.q.remove(this.b);
    }
}
