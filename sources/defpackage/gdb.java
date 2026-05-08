package defpackage;

import android.os.Bundle;
import android.os.Looper;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.PlaybackException;
import defpackage.bh5;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public interface gdb {

    public static final class a {
        public static final a b;
        public static final String c;
        public final bh5 a;

        /* JADX INFO: renamed from: gdb$a$a, reason: collision with other inner class name */
        public static final class C0248a {
            public static final int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 33, 26, 34, 35, 27, 28, 29, 30, 32};
            public final bh5.a a = new bh5.a();

            public final void a(int i, boolean z) {
                bh5.a aVar = this.a;
                if (z) {
                    aVar.a(i);
                } else {
                    aVar.getClass();
                }
            }
        }

        static {
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            ka2.q(!false);
            b = new a(new bh5(sparseBooleanArray));
            String str = vjg.a;
            c = Integer.toString(0, 36);
        }

        public a(bh5 bh5Var) {
            this.a = bh5Var;
        }

        public static a b(Bundle bundle) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(c);
            if (integerArrayList == null) {
                return b;
            }
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            for (int i = 0; i < integerArrayList.size(); i++) {
                int iIntValue = integerArrayList.get(i).intValue();
                ka2.q(!false);
                sparseBooleanArray.append(iIntValue, true);
            }
            ka2.q(!false);
            return new a(new bh5(sparseBooleanArray));
        }

        public final boolean a(int i) {
            return this.a.a.get(i);
        }

        public final Bundle c() {
            Bundle bundle = new Bundle();
            ArrayList<Integer> arrayList = new ArrayList<>();
            int i = 0;
            while (true) {
                bh5 bh5Var = this.a;
                if (i >= bh5Var.a.size()) {
                    bundle.putIntegerArrayList(c, arrayList);
                    return bundle;
                }
                arrayList.add(Integer.valueOf(bh5Var.b(i)));
                i++;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                return this.a.equals(((a) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.a.hashCode();
        }
    }

    public static final class b {
        public final bh5 a;

        public b(bh5 bh5Var) {
            this.a = bh5Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.a.equals(((b) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.a.hashCode();
        }
    }

    public interface c {
        default void A(long j) {
        }

        default void B(int i, d dVar, d dVar2) {
        }

        default void E(oj9 oj9Var) {
        }

        default void H() {
        }

        default void I(boolean z) {
        }

        @Deprecated
        default void K(List<n83> list) {
        }

        default void M(js9 js9Var) {
        }

        default void N(s34 s34Var) {
        }

        default void Q(int i, int i2) {
        }

        default void S(ox0 ox0Var) {
        }

        default void T(dqf dqfVar) {
        }

        default void U(boolean z) {
        }

        default void V(int i, boolean z) {
        }

        default void W(float f) {
        }

        default void X(int i, ij9 ij9Var) {
        }

        default void a(tog togVar) {
        }

        default void b0(q83 q83Var) {
        }

        default void f0(wqf wqfVar) {
        }

        default void g(PlaybackException playbackException) {
        }

        @Deprecated
        default void h(int i) {
        }

        default void h0(oj9 oj9Var) {
        }

        default void i0(long j) {
        }

        default void j0(emf emfVar, int i) {
        }

        @Deprecated
        default void l0(int i, boolean z) {
        }

        default void m(int i) {
        }

        default void n(int i) {
        }

        default void o(b bVar) {
        }

        default void o0(cdb cdbVar) {
        }

        @Deprecated
        default void p(boolean z) {
        }

        default void p0(a aVar) {
        }

        default void q0(PlaybackException playbackException) {
        }

        default void r(int i) {
        }

        default void r0(long j) {
        }

        default void s(int i) {
        }

        default void v(boolean z) {
        }

        default void v0(boolean z) {
        }

        default void z(int i, boolean z) {
        }
    }

    public static final class d {
        public static final String j;
        public static final String k;
        public static final String l;
        public static final String m;
        public static final String n;
        public static final String o;
        public static final String p;
        public final Object a;
        public final int b;
        public final ij9 c;
        public final Object d;
        public final int e;
        public final long f;
        public final long g;
        public final int h;
        public final int i;

        static {
            String str = vjg.a;
            j = Integer.toString(0, 36);
            k = Integer.toString(1, 36);
            l = Integer.toString(2, 36);
            m = Integer.toString(3, 36);
            n = Integer.toString(4, 36);
            o = Integer.toString(5, 36);
            p = Integer.toString(6, 36);
        }

        public d(Object obj, int i, ij9 ij9Var, Object obj2, int i2, long j2, long j3, int i3, int i4) {
            this.a = obj;
            this.b = i;
            this.c = ij9Var;
            this.d = obj2;
            this.e = i2;
            this.f = j2;
            this.g = j3;
            this.h = i3;
            this.i = i4;
        }

        public static d c(Bundle bundle) {
            int i = bundle.getInt(j, 0);
            Bundle bundle2 = bundle.getBundle(k);
            return new d(null, i, bundle2 == null ? null : ij9.a(bundle2), null, bundle.getInt(l, 0), bundle.getLong(m, 0L), bundle.getLong(n, 0L), bundle.getInt(o, -1), bundle.getInt(p, -1));
        }

        public final boolean a(d dVar) {
            return this.b == dVar.b && this.e == dVar.e && this.f == dVar.f && this.g == dVar.g && this.h == dVar.h && this.i == dVar.i && Objects.equals(this.c, dVar.c);
        }

        public final d b(boolean z, boolean z2) {
            if (z && z2) {
                return this;
            }
            return new d(this.a, z2 ? this.b : 0, z ? this.c : null, this.d, z2 ? this.e : 0, z ? this.f : 0L, z ? this.g : 0L, z ? this.h : -1, z ? this.i : -1);
        }

        public final Bundle d(int i) {
            Bundle bundle = new Bundle();
            int i2 = this.b;
            if (i < 3 || i2 != 0) {
                bundle.putInt(j, i2);
            }
            ij9 ij9Var = this.c;
            if (ij9Var != null) {
                bundle.putBundle(k, ij9Var.b(false));
            }
            int i3 = this.e;
            if (i < 3 || i3 != 0) {
                bundle.putInt(l, i3);
            }
            long j2 = this.f;
            if (i < 3 || j2 != 0) {
                bundle.putLong(m, j2);
            }
            long j3 = this.g;
            if (i < 3 || j3 != 0) {
                bundle.putLong(n, j3);
            }
            int i4 = this.h;
            if (i4 != -1) {
                bundle.putInt(o, i4);
            }
            int i5 = this.i;
            if (i5 != -1) {
                bundle.putInt(p, i5);
            }
            return bundle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (a(dVar) && Objects.equals(this.a, dVar.a) && Objects.equals(this.d, dVar.d)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(this.a, Integer.valueOf(this.b), this.c, this.d, Integer.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i));
        }

        public final String toString() {
            String str = "mediaItem=" + this.b + ", period=" + this.e + ", pos=" + this.f;
            int i = this.h;
            if (i == -1) {
                return str;
            }
            StringBuilder sbG = h5.g(str, ", contentPos=");
            sbG.append(this.g);
            sbG.append(", adGroup=");
            sbG.append(i);
            sbG.append(", ad=");
            sbG.append(this.i);
            return sbG.toString();
        }
    }

    void A(boolean z);

    void A0(int i, int i2, int i3);

    void B();

    void B0(List<ij9> list);

    void C(int i);

    boolean C0();

    wqf D();

    boolean D0();

    q83 E();

    long E0();

    void F(ox0 ox0Var, boolean z);

    @Deprecated
    void F0(int i);

    void G(oj9 oj9Var);

    void G0();

    int H();

    void H0();

    @Deprecated
    void I(boolean z);

    oj9 I0();

    void J(ij9 ij9Var);

    void J0(List list);

    void K(List list, int i, int i2);

    long K0();

    int L();

    long L0();

    emf M();

    ij9 M0();

    void N(int i, ij9 ij9Var);

    gie N0();

    @Deprecated
    void O();

    boolean O0(int i);

    dqf P();

    boolean P0();

    void Q();

    Looper Q0();

    void R(TextureView textureView);

    boolean R0();

    int S();

    boolean S0();

    long T();

    void U(int i, long j);

    a V();

    boolean W();

    void X(boolean z);

    long Y();

    void Z(c cVar);

    PlaybackException a();

    long a0();

    int b();

    int b0();

    void c();

    void c0(TextureView textureView);

    boolean d();

    tog d0();

    cdb e();

    float e0();

    void f();

    ox0 f0();

    void g(cdb cdbVar);

    s34 g0();

    long getDuration();

    void h(float f);

    void h0(int i, int i2);

    int i();

    int i0();

    void j(Surface surface);

    void j0(long j);

    boolean k();

    void k0(float f);

    long l();

    void l0(List<ij9> list, int i, long j);

    void m(ij9 ij9Var, long j);

    void m0(int i);

    void n();

    long n0();

    int o();

    void p();

    long p0();

    void q();

    void q0(int i, List<ij9> list);

    void r(int i, boolean z);

    long r0();

    @Deprecated
    void s();

    oj9 s0();

    void stop();

    void t(int i);

    boolean t0();

    void u(SurfaceView surfaceView);

    void u0();

    void v(dqf dqfVar);

    int v0();

    void w(int i);

    void w0(int i);

    void x0(c cVar);

    void y(int i, int i2);

    void y0(SurfaceView surfaceView);

    void z();

    void z0(int i, int i2);
}
