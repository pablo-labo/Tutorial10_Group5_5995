package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c59 {
    public int a;
    public int b;
    public int c;
    public long[] d;
    public int e;

    public final long a() {
        int i = this.c;
        if (i == 0) {
            k20.p();
            return 0L;
        }
        long[] jArr = this.d;
        int i2 = this.a;
        long j = jArr[i2];
        this.a = this.e & (i2 + 1);
        this.c = i - 1;
        return j;
    }
}
