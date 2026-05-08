package androidx.compose.ui.layout;

import defpackage.bg9;
import defpackage.bxe;
import defpackage.dm2;
import defpackage.iq2;
import defpackage.j6g;
import defpackage.l5;
import defpackage.mj8;
import defpackage.pm8;
import defpackage.rlb;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class e0 {
    public final f0 a;
    public j b;
    public final e c;
    public final c d;
    public final d e;

    public interface a {
        b apply();

        boolean b();

        void cancel();
    }

    public interface b {
        default long a(int i) {
            return 0L;
        }

        default int b() {
            return 0;
        }

        default void c(rlb rlbVar) {
        }

        default void d(int i, long j) {
        }

        void dispose();
    }

    public static final class c extends mj8 implements Function2<pm8, dm2, j6g> {
        public c() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(pm8 pm8Var, dm2 dm2Var) {
            e0.this.a().b = dm2Var;
            return j6g.a;
        }
    }

    public static final class d extends mj8 implements Function2<pm8, Function2<? super bxe, ? super iq2, ? extends bg9>, j6g> {
        public d() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(pm8 pm8Var, Function2<? super bxe, ? super iq2, ? extends bg9> function2) {
            j jVarA = e0.this.a();
            pm8Var.m(new k(jVarA, function2, jVarA.e0));
            return j6g.a;
        }
    }

    public static final class e extends mj8 implements Function2<pm8, e0, j6g> {
        public e() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(pm8 pm8Var, e0 e0Var) {
            pm8 pm8Var2 = pm8Var;
            e0 e0Var2 = e0.this;
            j jVar = pm8Var2.v0;
            if (jVar == null) {
                jVar = new j(pm8Var2, e0Var2.a);
                pm8Var2.v0 = jVar;
            }
            e0Var2.b = jVar;
            e0.this.a().e();
            j jVarA = e0.this.a();
            f0 f0Var = e0.this.a;
            if (jVarA.c != f0Var) {
                jVarA.c = f0Var;
                jVarA.g(false);
                pm8.j0(jVarA.a, false, 7);
            }
            return j6g.a;
        }
    }

    public e0(f0 f0Var) {
        this.a = f0Var;
        this.c = new e();
        this.d = new c();
        this.e = new d();
    }

    public final j a() {
        j jVar = this.b;
        if (jVar != null) {
            return jVar;
        }
        l5.q("SubcomposeLayoutState is not attached to SubcomposeLayout");
        return null;
    }

    public e0() {
        this(r.a);
    }
}
