package defpackage;

import android.graphics.Matrix;
import android.graphics.Outline;
import defpackage.xc6;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public interface zc6 {
    public static final a a = a.a;

    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final C0490a b = C0490a.a;

        /* JADX INFO: renamed from: zc6$a$a, reason: collision with other inner class name */
        public static final class C0490a extends mj8 implements Function1<gb4, j6g> {
            public static final C0490a a = new C0490a(1);

            @Override // kotlin.jvm.functions.Function1
            public final j6g invoke(gb4 gb4Var) {
                gb4.o1(gb4Var, da2.h, 0L, 0L, 0.0f, null, 126);
                return j6g.a;
            }
        }
    }

    void A(int i, int i2, long j);

    float B();

    default boolean C() {
        return true;
    }

    float D();

    long E();

    long F();

    float G();

    Matrix H();

    int I();

    float J();

    void K(Outline outline, long j);

    void L(ww1 ww1Var);

    void M(long j);

    float N();

    void O(iy3 iy3Var, vl8 vl8Var, xc6 xc6Var, xc6.a aVar);

    float P();

    float Q();

    void R(int i);

    float S();

    float T();

    float a();

    void b(float f);

    void e(float f);

    void f(int i);

    ga2 g();

    void h();

    void i();

    void j(long j);

    void l();

    void m(float f);

    void n(boolean z);

    void o(long j);

    void q(float f);

    void s(float f);

    void t(float f);

    void u(float f);

    void x(float f);

    void y();

    int z();
}
