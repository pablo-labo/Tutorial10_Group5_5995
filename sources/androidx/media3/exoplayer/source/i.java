package androidx.media3.exoplayer.source;

import android.os.Handler;
import androidx.media3.exoplayer.source.h;
import defpackage.dq3;
import defpackage.fm9;
import defpackage.fr3;
import defpackage.gm9;
import defpackage.hm9;
import defpackage.nj9;
import defpackage.uz8;
import defpackage.vjg;
import defpackage.wq2;
import defpackage.yi0;
import defpackage.z65;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public interface i {

    public static class a {
        public final int a;
        public final h.b b;
        public final CopyOnWriteArrayList<C0050a> c;

        /* JADX INFO: renamed from: androidx.media3.exoplayer.source.i$a$a, reason: collision with other inner class name */
        public static final class C0050a {
            public Handler a;
            public i b;
        }

        public a(CopyOnWriteArrayList<C0050a> copyOnWriteArrayList, int i, h.b bVar) {
            this.c = copyOnWriteArrayList;
            this.a = i;
            this.b = bVar;
        }

        public final void a(wq2<i> wq2Var) {
            for (C0050a c0050a : this.c) {
                vjg.T(c0050a.a, new yi0(6, wq2Var, c0050a.b));
            }
        }

        public final void b(int i, androidx.media3.common.a aVar, int i2, Object obj, long j) {
            a(new z65(2, this, new nj9(1, i, aVar, i2, obj, vjg.c0(j), -9223372036854775807L)));
        }

        public final void c(uz8 uz8Var, int i, int i2, androidx.media3.common.a aVar, int i3, Object obj, long j, long j2) {
            a(new dq3(this, uz8Var, new nj9(i, i2, aVar, i3, obj, vjg.c0(j), vjg.c0(j2))));
        }

        public final void d(uz8 uz8Var, int i, int i2, androidx.media3.common.a aVar, int i3, Object obj, long j, long j2) {
            a(new gm9(this, uz8Var, new nj9(i, i2, aVar, i3, obj, vjg.c0(j), vjg.c0(j2))));
        }

        public final void e(uz8 uz8Var, int i, int i2, androidx.media3.common.a aVar, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
            a(new hm9(this, uz8Var, new nj9(i, i2, aVar, i3, obj, vjg.c0(j), vjg.c0(j2)), iOException, z));
        }

        public final void f(uz8 uz8Var, int i, IOException iOException, boolean z) {
            e(uz8Var, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z);
        }

        public final void g(uz8 uz8Var, int i, int i2, androidx.media3.common.a aVar, int i3, Object obj, long j, long j2, int i4) {
            a(new fm9(this, uz8Var, new nj9(i, i2, aVar, i3, obj, vjg.c0(j), vjg.c0(j2)), i4));
        }

        public final void h(long j, int i, long j2) {
            nj9 nj9Var = new nj9(1, i, null, 3, null, vjg.c0(j), vjg.c0(j2));
            h.b bVar = this.b;
            bVar.getClass();
            a(new fr3(this, bVar, nj9Var));
        }
    }

    default void C(int i, h.b bVar, nj9 nj9Var) {
    }

    default void G(int i, h.b bVar, nj9 nj9Var) {
    }

    default void e0(int i, h.b bVar, uz8 uz8Var, nj9 nj9Var, int i2) {
    }

    default void m0(int i, h.b bVar, uz8 uz8Var, nj9 nj9Var, IOException iOException, boolean z) {
    }

    default void t0(int i, h.b bVar, uz8 uz8Var, nj9 nj9Var) {
    }

    default void x(int i, h.b bVar, uz8 uz8Var, nj9 nj9Var) {
    }
}
