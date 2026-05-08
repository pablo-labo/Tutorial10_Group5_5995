package androidx.media3.exoplayer.drm;

import android.os.Handler;
import androidx.media3.exoplayer.drm.a;
import androidx.media3.exoplayer.source.h;
import defpackage.n4;
import defpackage.vjg;
import defpackage.w71;
import defpackage.x71;
import defpackage.yc4;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public interface a {
    default void F(int i, h.b bVar) {
    }

    default void P(int i, h.b bVar, int i2) {
    }

    default void R(int i, h.b bVar, Exception exc) {
    }

    default void Z(int i, h.b bVar) {
    }

    default void s0(int i, h.b bVar) {
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.drm.a$a, reason: collision with other inner class name */
    public static class C0043a {
        public final int a;
        public final h.b b;
        public final CopyOnWriteArrayList<C0044a> c;

        /* JADX INFO: renamed from: androidx.media3.exoplayer.drm.a$a$a, reason: collision with other inner class name */
        public static final class C0044a {
            public Handler a;
            public a b;
        }

        public C0043a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public final void a() {
            for (C0044a c0044a : this.c) {
                vjg.T(c0044a.a, new x71(1, this, c0044a.b));
            }
        }

        public final void b() {
            for (C0044a c0044a : this.c) {
                vjg.T(c0044a.a, new w71(2, this, c0044a.b));
            }
        }

        public final void c(final int i) {
            for (C0044a c0044a : this.c) {
                final a aVar = c0044a.b;
                vjg.T(c0044a.a, new Runnable() { // from class: xc4
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.C0043a c0043a = this.a;
                        aVar.P(c0043a.a, c0043a.b, i);
                    }
                });
            }
        }

        public final void d(Exception exc) {
            for (C0044a c0044a : this.c) {
                vjg.T(c0044a.a, new n4(1, this, c0044a.b, exc));
            }
        }

        public final void e() {
            for (C0044a c0044a : this.c) {
                vjg.T(c0044a.a, new yc4(0, this, c0044a.b));
            }
        }

        public C0043a(CopyOnWriteArrayList<C0044a> copyOnWriteArrayList, int i, h.b bVar) {
            this.c = copyOnWriteArrayList;
            this.a = i;
            this.b = bVar;
        }
    }
}
