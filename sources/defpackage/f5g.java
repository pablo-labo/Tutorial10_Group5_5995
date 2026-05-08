package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class f5g {
    public final int a;
    public int b;
    public long c;

    public f5g(int i) {
        this.a = i;
        if (i < 0 || i >= 33554432) {
            h5.k(p6.c(i, "invalid sourceId (max=33554431): "));
            throw null;
        }
    }
}
