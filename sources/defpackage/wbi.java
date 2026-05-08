package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class wbi implements Runnable {
    public final /* synthetic */ ibi a;

    public wbi(ibi ibiVar) {
        this.a = ibiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y8i y8iVar = this.a.c;
        y8iVar.d = null;
        y8iVar.w();
    }
}
