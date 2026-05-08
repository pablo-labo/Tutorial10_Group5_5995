package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hsf implements l74 {
    public final /* synthetic */ csf a;
    public final /* synthetic */ csf b;

    public hsf(csf csfVar, csf csfVar2) {
        this.a = csfVar;
        this.b = csfVar2;
    }

    @Override // defpackage.l74
    public final void dispose() {
        this.a.j.remove(this.b);
    }
}
