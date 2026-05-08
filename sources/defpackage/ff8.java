package defpackage;

import defpackage.df8;
import defpackage.ef8;
import defpackage.xf8;
import kotlin.Lazy;
import kotlin.reflect.full.IllegalCallableAccessException;

/* JADX INFO: loaded from: classes3.dex */
public final class ff8<V> extends sf8<V> implements ef8<V> {
    public final Lazy<a<V>> e0;

    public static final class a<R> extends xf8.c<R> implements ef8.a<R> {
        public final ff8<R> Y;

        public a(ff8<R> ff8Var) {
            this.Y = ff8Var;
        }

        @Override // xf8.a
        public final xf8 E() {
            return this.Y;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(Object obj) throws IllegalCallableAccessException {
            this.Y.e0.getValue().call(obj);
            return j6g.a;
        }

        @Override // qf8.a
        public final qf8 o() {
            return this.Y;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff8(te8 te8Var, String str, String str2, Object obj) {
        super(te8Var, str, str2, obj);
        te8Var.getClass();
        str.getClass();
        str2.getClass();
        this.e0 = boa.E(qt8.b, new h14(this, 3));
    }

    @Override // defpackage.df8
    public final df8.a e() {
        return this.e0.getValue();
    }

    @Override // defpackage.ef8, defpackage.df8
    public final ef8.a e() {
        return this.e0.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff8(te8 te8Var, d4c d4cVar) {
        super(te8Var, d4cVar);
        d4cVar.getClass();
        this.e0 = boa.E(qt8.b, new h14(this, 3));
    }
}
