package defpackage;

import defpackage.qf8;
import defpackage.tf8;
import defpackage.xf8;
import java.lang.reflect.Member;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes3.dex */
public class uf8<T, V> extends xf8<V> implements tf8<T, V> {
    public final Lazy<a<T, V>> c0;
    public final Lazy<Member> d0;

    public static final class a<T, V> extends xf8.b<V> implements tf8.a<T, V> {
        public final uf8<T, V> Y;

        /* JADX WARN: Multi-variable type inference failed */
        public a(uf8<T, ? extends V> uf8Var) {
            this.Y = uf8Var;
        }

        @Override // xf8.a
        public final xf8 E() {
            return this.Y;
        }

        @Override // kotlin.jvm.functions.Function1
        public final V invoke(T t) {
            return this.Y.get(t);
        }

        @Override // qf8.a
        public final qf8 o() {
            return this.Y;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uf8(te8 te8Var, String str, String str2, Object obj) {
        super(te8Var, str, str2, null, obj);
        te8Var.getClass();
        str.getClass();
        str2.getClass();
        int i = 2;
        n04 n04Var = new n04(this, i);
        qt8 qt8Var = qt8.b;
        this.c0 = boa.E(qt8Var, n04Var);
        this.d0 = boa.E(qt8Var, new o04(this, i));
    }

    @Override // defpackage.xf8
    public final xf8.b G() {
        return this.c0.getValue();
    }

    @Override // defpackage.qf8
    public final qf8.b c() {
        return this.c0.getValue();
    }

    @Override // defpackage.tf8
    public final V get(T t) {
        return this.c0.getValue().call(t);
    }

    @Override // kotlin.jvm.functions.Function1
    public final V invoke(T t) {
        return get(t);
    }

    @Override // defpackage.qf8
    public final tf8.a c() {
        return this.c0.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uf8(te8 te8Var, d4c d4cVar) {
        super(te8Var, d4cVar);
        d4cVar.getClass();
        int i = 2;
        n04 n04Var = new n04(this, i);
        qt8 qt8Var = qt8.b;
        this.c0 = boa.E(qt8Var, n04Var);
        this.d0 = boa.E(qt8Var, new o04(this, i));
    }
}
