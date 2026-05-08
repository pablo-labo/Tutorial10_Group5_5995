package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class naf implements Runnable {
    public long a;
    public boolean b;

    public naf(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public naf() {
        this(0L, false);
    }
}
