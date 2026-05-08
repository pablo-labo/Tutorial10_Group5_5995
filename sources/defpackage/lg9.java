package defpackage;

import androidx.media3.datasource.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class lg9 extends k42 {
    public final long j;

    public lg9(a aVar, gf3 gf3Var, androidx.media3.common.a aVar2, int i, Object obj, long j, long j2, long j3) {
        super(aVar, gf3Var, 1, aVar2, i, obj, j, j2);
        aVar2.getClass();
        this.j = j3;
    }

    public long c() {
        long j = this.j;
        if (j != -1) {
            return j + 1;
        }
        return -1L;
    }

    public abstract boolean d();
}
