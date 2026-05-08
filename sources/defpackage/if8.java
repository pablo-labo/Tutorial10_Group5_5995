package defpackage;

import defpackage.df8;
import defpackage.xf8;
import kotlin.Lazy;
import kotlin.reflect.full.IllegalCallableAccessException;

/* JADX INFO: loaded from: classes3.dex */
public final class if8<D, E, V> extends wf8<D, E, V> implements df8 {
    public final Lazy<a<D, E, V>> e0;

    public static final class a<D, E, V> extends xf8.c<V> implements wu5 {
        public final if8<D, E, V> Y;

        public a(if8<D, E, V> if8Var) {
            this.Y = if8Var;
        }

        @Override // xf8.a
        public final xf8 E() {
            return this.Y;
        }

        @Override // qf8.a
        public final qf8 o() {
            return this.Y;
        }

        @Override // defpackage.wu5
        public final Object q(Object obj, Object obj2, Object obj3) throws IllegalCallableAccessException {
            this.Y.e0.getValue().call(obj, obj2, obj3);
            return j6g.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public if8(te8 te8Var, d4c d4cVar) {
        super(te8Var, d4cVar);
        d4cVar.getClass();
        this.e0 = boa.E(qt8.b, new c5(this, 2));
    }

    @Override // defpackage.df8
    public final df8.a e() {
        return this.e0.getValue();
    }
}
