package androidx.media3.exoplayer.source;

import android.os.Handler;
import defpackage.emf;
import defpackage.grf;
import defpackage.ij9;
import defpackage.qk3;
import defpackage.qq3;
import defpackage.sdb;

/* JADX INFO: loaded from: classes.dex */
public interface h {

    public interface a {
        h a(ij9 ij9Var);

        default void b(qq3 qq3Var) {
        }

        @Deprecated
        default void c(boolean z) {
        }

        default void d() {
        }
    }

    public interface c {
        void a(androidx.media3.exoplayer.source.a aVar, emf emfVar);
    }

    default boolean a(ij9 ij9Var) {
        return false;
    }

    void b(Handler handler, i iVar);

    void c(i iVar);

    ij9 d();

    void e(Handler handler, androidx.media3.exoplayer.drm.a aVar);

    default void f(ij9 ij9Var) {
    }

    void g(androidx.media3.exoplayer.drm.a aVar);

    void h(g gVar);

    void i(c cVar);

    void j(c cVar, grf grfVar, sdb sdbVar);

    void k(c cVar);

    void l(c cVar);

    void m();

    default boolean n() {
        return true;
    }

    g o(b bVar, qk3 qk3Var, long j);

    default emf p() {
        return null;
    }

    public static final class b {
        public final Object a;
        public final int b;
        public final int c;
        public final long d;
        public final int e;

        public b(Object obj, int i, int i2, long j, int i3) {
            this.a = obj;
            this.b = i;
            this.c = i2;
            this.d = j;
            this.e = i3;
        }

        public final b a(Object obj) {
            if (this.a.equals(obj)) {
                return this;
            }
            return new b(obj, this.b, this.c, this.d, this.e);
        }

        public final boolean b() {
            return this.b != -1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a.equals(bVar.a) && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e;
        }

        public final int hashCode() {
            return ((((((((this.a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
        }

        public b(Object obj, long j) {
            this(obj, -1, -1, j, -1);
        }

        public b(Object obj, int i, long j) {
            this(obj, -1, -1, j, i);
        }

        public b(Object obj) {
            this(obj, -1L);
        }
    }
}
