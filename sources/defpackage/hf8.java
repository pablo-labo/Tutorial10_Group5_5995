package defpackage;

import defpackage.df8;
import defpackage.gf8;
import defpackage.xf8;
import kotlin.Lazy;
import kotlin.reflect.full.IllegalCallableAccessException;

/* JADX INFO: loaded from: classes3.dex */
public final class hf8<T, V> extends uf8<T, V> implements gf8<T, V> {
    public final Lazy<a<T, V>> e0;

    public static final class a<T, V> extends xf8.c<V> implements gf8.a<T, V> {
        public final hf8<T, V> Y;

        public a(hf8<T, V> hf8Var) {
            this.Y = hf8Var;
        }

        @Override // xf8.a
        public final xf8 E() {
            return this.Y;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(Object obj, Object obj2) throws IllegalCallableAccessException {
            this.Y.e0.getValue().call(obj, obj2);
            return j6g.a;
        }

        @Override // qf8.a
        public final qf8 o() {
            return this.Y;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf8(te8 te8Var, String str, String str2, Object obj) {
        super(te8Var, str, str2, obj);
        te8Var.getClass();
        str.getClass();
        str2.getClass();
        this.e0 = boa.E(qt8.b, new i14(this, 2));
    }

    @Override // defpackage.df8
    public final df8.a e() {
        return this.e0.getValue();
    }

    @Override // defpackage.gf8, defpackage.df8
    public final gf8.a e() {
        return this.e0.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf8(te8 te8Var, d4c d4cVar) {
        super(te8Var, d4cVar);
        d4cVar.getClass();
        this.e0 = boa.E(qt8.b, new i14(this, 2));
    }
}
