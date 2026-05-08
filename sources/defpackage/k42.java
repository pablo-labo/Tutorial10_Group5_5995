package defpackage;

import androidx.media3.common.a;
import androidx.media3.exoplayer.upstream.Loader;

/* JADX INFO: loaded from: classes.dex */
public abstract class k42 implements Loader.d {
    public final long a = uz8.c.getAndIncrement();
    public final gf3 b;
    public final int c;
    public final a d;
    public final int e;
    public final Object f;
    public final long g;
    public final long h;
    public final ote i;

    public k42(androidx.media3.datasource.a aVar, gf3 gf3Var, int i, a aVar2, int i2, Object obj, long j, long j2) {
        this.i = new ote(aVar);
        this.b = gf3Var;
        this.c = i;
        this.d = aVar2;
        this.e = i2;
        this.f = obj;
        this.g = j;
        this.h = j2;
    }
}
