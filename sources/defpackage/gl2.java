package defpackage;

import androidx.compose.ui.e;
import defpackage.pm8;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public interface gl2 {
    public static final a j = a.a;

    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final pm8.a b = pm8.G0;
        public static final h c = h.a;
        public static final e d = e.a;
        public static final b e = b.a;
        public static final f f = f.a;
        public static final d g = d.a;
        public static final c h = c.a;
        public static final g i = g.a;
        public static final C0251a j = C0251a.a;

        /* JADX INFO: renamed from: gl2$a$a, reason: collision with other inner class name */
        public static final class C0251a extends mj8 implements Function2<gl2, Integer, j6g> {
            public static final C0251a a = new C0251a(2);

            @Override // kotlin.jvm.functions.Function2
            public final j6g invoke(gl2 gl2Var, Integer num) {
                num.intValue();
                gl2Var.getClass();
                return j6g.a;
            }
        }

        public static final class b extends mj8 implements Function2<gl2, iy3, j6g> {
            public static final b a = new b(2);

            @Override // kotlin.jvm.functions.Function2
            public final j6g invoke(gl2 gl2Var, iy3 iy3Var) {
                gl2Var.i(iy3Var);
                return j6g.a;
            }
        }

        public static final class c extends mj8 implements Function2<gl2, vl8, j6g> {
            public static final c a = new c(2);

            @Override // kotlin.jvm.functions.Function2
            public final j6g invoke(gl2 gl2Var, vl8 vl8Var) {
                gl2Var.j(vl8Var);
                return j6g.a;
            }
        }

        public static final class d extends mj8 implements Function2<gl2, ag9, j6g> {
            public static final d a = new d(2);

            @Override // kotlin.jvm.functions.Function2
            public final j6g invoke(gl2 gl2Var, ag9 ag9Var) {
                gl2Var.m(ag9Var);
                return j6g.a;
            }
        }

        public static final class e extends mj8 implements Function2<gl2, androidx.compose.ui.e, j6g> {
            public static final e a = new e(2);

            @Override // kotlin.jvm.functions.Function2
            public final j6g invoke(gl2 gl2Var, androidx.compose.ui.e eVar) {
                gl2Var.n(eVar);
                return j6g.a;
            }
        }

        public static final class f extends mj8 implements Function2<gl2, sm2, j6g> {
            public static final f a = new f(2);

            @Override // kotlin.jvm.functions.Function2
            public final j6g invoke(gl2 gl2Var, sm2 sm2Var) {
                gl2Var.r(sm2Var);
                return j6g.a;
            }
        }

        public static final class g extends mj8 implements Function2<gl2, opg, j6g> {
            public static final g a = new g(2);

            @Override // kotlin.jvm.functions.Function2
            public final j6g invoke(gl2 gl2Var, opg opgVar) {
                gl2Var.s(opgVar);
                return j6g.a;
            }
        }

        public static final class h extends mj8 implements gu5<pm8> {
            public static final h a = new h(0);

            @Override // defpackage.gu5
            public final pm8 invoke() {
                return new pm8(2);
            }
        }

        public static pm8.a a() {
            return b;
        }

        public static C0251a b() {
            return j;
        }

        public static d c() {
            return g;
        }

        public static e d() {
            return d;
        }

        public static f e() {
            return f;
        }
    }

    void i(iy3 iy3Var);

    void j(vl8 vl8Var);

    void m(ag9 ag9Var);

    void n(e eVar);

    void r(sm2 sm2Var);

    void s(opg opgVar);
}
