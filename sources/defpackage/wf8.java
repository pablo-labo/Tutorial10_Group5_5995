package defpackage;

import defpackage.qf8;
import defpackage.vf8;
import defpackage.xf8;
import java.lang.reflect.Member;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes3.dex */
public class wf8<D, E, V> extends xf8<V> implements vf8<D, E, V> {
    public final Lazy<a<D, E, V>> c0;
    public final Lazy<Member> d0;

    public static final class a<D, E, V> extends xf8.b<V> implements vf8.a<D, E, V> {
        public final wf8<D, E, V> Y;

        /* JADX WARN: Multi-variable type inference failed */
        public a(wf8<D, E, ? extends V> wf8Var) {
            this.Y = wf8Var;
        }

        @Override // xf8.a
        public final xf8 E() {
            return this.Y;
        }

        @Override // kotlin.jvm.functions.Function2
        public final V invoke(D d, E e) {
            return this.Y.c0.getValue().call(d, e);
        }

        @Override // qf8.a
        public final qf8 o() {
            return this.Y;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wf8(te8 te8Var, String str, String str2) {
        super(te8Var, str, str2, null, iv1.NO_RECEIVER);
        te8Var.getClass();
        str.getClass();
        str2.getClass();
        yo1 yo1Var = new yo1(this, 2);
        qt8 qt8Var = qt8.b;
        this.c0 = boa.E(qt8Var, yo1Var);
        this.d0 = boa.E(qt8Var, new q73(this, 2));
    }

    @Override // defpackage.xf8
    public final xf8.b G() {
        return this.c0.getValue();
    }

    @Override // defpackage.qf8
    public final qf8.b c() {
        return this.c0.getValue();
    }

    @Override // kotlin.jvm.functions.Function2
    public final V invoke(D d, E e) {
        return this.c0.getValue().call(d, e);
    }

    @Override // defpackage.qf8
    public final vf8.a c() {
        return this.c0.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wf8(te8 te8Var, d4c d4cVar) {
        super(te8Var, d4cVar);
        d4cVar.getClass();
        yo1 yo1Var = new yo1(this, 2);
        qt8 qt8Var = qt8.b;
        this.c0 = boa.E(qt8Var, yo1Var);
        this.d0 = boa.E(qt8Var, new q73(this, 2));
    }
}
