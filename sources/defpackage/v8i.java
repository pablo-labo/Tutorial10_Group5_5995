package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class v8i implements Runnable {
    public final /* synthetic */ f8i a;
    public final /* synthetic */ long b;
    public final /* synthetic */ c8i c;

    public v8i(c8i c8iVar, f8i f8iVar, long j) {
        this.c = c8iVar;
        this.a = f8iVar;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j = this.b;
        c8i c8iVar = this.c;
        c8iVar.t(this.a, false, j);
        c8iVar.e = null;
        y8i y8iVarM = c8iVar.a.m();
        y8iVarM.b();
        y8iVarM.k();
        y8iVarM.p(new s9i(y8iVarM, (f8i) null));
    }
}
