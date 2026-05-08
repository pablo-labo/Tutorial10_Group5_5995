package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class w4i implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ m4i b;

    public w4i(m4i m4iVar, long j) {
        this.b = m4iVar;
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m4i m4iVar = this.b;
        uyh uyhVar = m4iVar.f().f0;
        long j = this.a;
        uyhVar.b(j);
        m4iVar.zzr().b0.a(Long.valueOf(j), "Session timeout duration set");
    }
}
