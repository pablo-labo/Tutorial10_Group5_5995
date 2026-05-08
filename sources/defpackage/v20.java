package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.source.h;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public interface v20 {

    public static final class a {
        public final long a;
        public final emf b;
        public final int c;
        public final h.b d;
        public final long e;
        public final emf f;
        public final int g;
        public final h.b h;
        public final long i;
        public final long j;

        public a(long j, emf emfVar, int i, h.b bVar, long j2, emf emfVar2, int i2, h.b bVar2, long j3, long j4) {
            this.a = j;
            this.b = emfVar;
            this.c = i;
            this.d = bVar;
            this.e = j2;
            this.f = emfVar2;
            this.g = i2;
            this.h = bVar2;
            this.i = j3;
            this.j = j4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.a == aVar.a && this.c == aVar.c && this.e == aVar.e && this.g == aVar.g && this.i == aVar.i && this.j == aVar.j && Objects.equals(this.b, aVar.b) && Objects.equals(this.d, aVar.d) && Objects.equals(this.f, aVar.f) && Objects.equals(this.h, aVar.h)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j));
        }
    }

    public static final class b {
        public final bh5 a;
        public final SparseArray<a> b;

        public b(bh5 bh5Var, SparseArray<a> sparseArray) {
            this.a = bh5Var;
            SparseBooleanArray sparseBooleanArray = bh5Var.a;
            SparseArray<a> sparseArray2 = new SparseArray<>(sparseBooleanArray.size());
            for (int i = 0; i < sparseBooleanArray.size(); i++) {
                int iB = bh5Var.b(i);
                a aVar = sparseArray.get(iB);
                aVar.getClass();
                sparseArray2.append(iB, aVar);
            }
            this.b = sparseArray2;
        }

        public final boolean a(int i) {
            return this.a.a.get(i);
        }
    }

    default void a(tog togVar) {
    }

    default void b(ak3 ak3Var) {
    }

    default void g(PlaybackException playbackException) {
    }

    default void h(int i) {
    }

    default void i(nj9 nj9Var) {
    }

    default void j(a aVar, androidx.media3.common.a aVar2) {
    }

    default void k(int i, long j, a aVar) {
    }

    default void l(a aVar, nj9 nj9Var) {
    }

    default void m(gdb gdbVar, b bVar) {
    }
}
