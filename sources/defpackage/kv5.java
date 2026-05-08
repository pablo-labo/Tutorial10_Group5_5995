package defpackage;

import defpackage.hv1;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: loaded from: classes3.dex */
public interface kv5 extends hv1 {

    public interface a<D extends kv5> {
        a<D> a(List<rlg> list);

        a<D> b(e04 e04Var);

        D build();

        a<D> c(hsc hscVar);

        a<D> d(byf byfVar);

        a<D> e();

        a<D> f(lf0 lf0Var);

        a g();

        a<D> h(ax9 ax9Var);

        a i();

        a<D> j();

        a<D> k(aj3 aj3Var);

        a l(m52 m52Var);

        a<D> m(hv1.a aVar);

        a<D> n();

        a o();

        a<D> p(ui8 ui8Var);

        a<D> q(n8a n8aVar);

        a<D> r();
    }

    boolean B();

    boolean B0();

    boolean E0();

    a<? extends kv5> F0();

    @Override // defpackage.hv1, defpackage.fv1, defpackage.aj3
    kv5 a();

    @Override // defpackage.qxe
    kv5 b(TypeSubstitutor typeSubstitutor);

    boolean isInfix();

    boolean isInline();

    boolean isOperator();

    boolean isSuspend();

    kv5 s0();
}
