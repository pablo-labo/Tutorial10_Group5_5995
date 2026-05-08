package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class h81 {
    public static final a a = new a();
    public static final b b = b.a;
    public static final c c = c.a;

    public static final class a implements px9 {
        @Override // defpackage.px9
        public final <T> T g(kx9<T> kx9Var) {
            return kx9Var.a.invoke();
        }
    }

    public static final class b extends mj8 implements Function1<f81, j6g> {
        public static final b a = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(f81 f81Var) {
            f81 f81Var2 = f81Var;
            f81Var2.e0 = true;
            fb4.a(f81Var2);
            return j6g.a;
        }
    }

    public static final class c extends mj8 implements Function1<f81, j6g> {
        public static final c a = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(f81 f81Var) {
            f81Var.e2();
            return j6g.a;
        }
    }

    public static final boolean a(f81 f81Var) {
        f8f f8fVar = us3.f(f81Var).t0.e;
        f8fVar.getClass();
        return f8fVar.d0;
    }
}
