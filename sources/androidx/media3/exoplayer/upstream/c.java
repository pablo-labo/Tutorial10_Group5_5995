package androidx.media3.exoplayer.upstream;

import android.net.Uri;
import androidx.media3.exoplayer.upstream.Loader;
import defpackage.df3;
import defpackage.gf3;
import defpackage.ote;
import defpackage.uz8;
import defpackage.vjg;

/* JADX INFO: loaded from: classes.dex */
public final class c<T> implements Loader.d {
    public final long a;
    public final gf3 b;
    public final int c;
    public final ote d;
    public final a<? extends T> e;
    public volatile T f;

    public interface a<T> {
        Object a(Uri uri, df3 df3Var);
    }

    public c() {
        throw null;
    }

    public c(androidx.media3.datasource.a aVar, gf3 gf3Var, int i, a<? extends T> aVar2) {
        this.d = new ote(aVar);
        this.b = gf3Var;
        this.c = i;
        this.e = aVar2;
        this.a = uz8.c.getAndIncrement();
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.d
    public final void a() {
        this.d.b = 0L;
        df3 df3Var = new df3(this.b, this.d);
        try {
            df3Var.a();
            Uri uriA = this.d.a.a();
            uriA.getClass();
            this.f = (T) this.e.a(uriA, df3Var);
        } finally {
            vjg.g(df3Var);
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.d
    public final void b() {
    }
}
