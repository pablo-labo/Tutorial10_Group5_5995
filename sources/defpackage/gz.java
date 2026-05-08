package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gz implements l74 {
    public final /* synthetic */ iba a;
    public final /* synthetic */ vi b;

    public gz(iba ibaVar, vi viVar) {
        this.a = ibaVar;
        this.b = viVar;
    }

    @Override // defpackage.l74
    public final void dispose() {
        iba ibaVar = this.a;
        ibaVar.getClass();
        ibaVar.q.remove(this.b);
    }
}
