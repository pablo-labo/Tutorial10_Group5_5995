package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class d5i implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ long d;
    public final /* synthetic */ m4i e;

    public d5i(m4i m4iVar, String str, String str2, Object obj, long j) {
        this.e = m4iVar;
        this.a = str;
        this.b = str2;
        this.c = obj;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.c;
        this.e.o(this.d, obj, this.a, this.b);
    }
}
