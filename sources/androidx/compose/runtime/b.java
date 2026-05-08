package androidx.compose.runtime;

import androidx.compose.runtime.c;
import defpackage.fm2;
import defpackage.gu5;
import defpackage.j6g;
import defpackage.nr0;
import defpackage.t8b;
import defpackage.usc;
import defpackage.v03;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public interface b {

    public static final class a {
        public static final C0020a a = new C0020a();

        /* JADX INFO: renamed from: androidx.compose.runtime.b$a$a, reason: collision with other inner class name */
        public static final class C0020a {
            public final String toString() {
                return "Empty";
            }
        }
    }

    void A(int i, Object obj);

    void B();

    void C(usc uscVar);

    void D();

    void E(gu5<j6g> gu5Var);

    void F();

    default int G() {
        return Long.hashCode(k());
    }

    c.b H();

    void I();

    void J();

    boolean K(Object obj);

    void L(int i);

    <T> T M(h hVar);

    default boolean a(boolean z) {
        return a(z);
    }

    <V, T> void b(V v, Function2<? super T, ? super V, j6g> function2);

    default boolean c(float f) {
        return c(f);
    }

    default boolean d(int i) {
        return d(i);
    }

    default boolean e(long j) {
        return e(j);
    }

    boolean f();

    void g(boolean z);

    c h(int i);

    boolean i();

    nr0<?> j();

    long k();

    v03 l();

    t8b m();

    void n();

    boolean o(int i, boolean z);

    void p(Object obj);

    void q();

    void r();

    i s();

    void t();

    void u(int i);

    Object v();

    fm2 w();

    default boolean x(Object obj) {
        return K(obj);
    }

    <T> void y(gu5<? extends T> gu5Var);

    void z(Object obj);
}
