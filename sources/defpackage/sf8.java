package defpackage;

import defpackage.qf8;
import defpackage.rf8;
import defpackage.xf8;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes3.dex */
public class sf8<V> extends xf8<V> implements rf8<V> {
    public final Lazy<a<V>> c0;
    public final Lazy<Object> d0;

    public static final class a<R> extends xf8.b<R> implements rf8.a<R> {
        public final sf8<R> Y;

        /* JADX WARN: Multi-variable type inference failed */
        public a(sf8<? extends R> sf8Var) {
            this.Y = sf8Var;
        }

        @Override // xf8.a
        public final xf8 E() {
            return this.Y;
        }

        @Override // defpackage.gu5
        public final R invoke() {
            return this.Y.get();
        }

        @Override // qf8.a
        public final qf8 o() {
            return this.Y;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sf8(te8 te8Var, String str, String str2, Object obj) {
        super(te8Var, str, str2, null, obj);
        te8Var.getClass();
        str.getClass();
        str2.getClass();
        ge8 ge8Var = new ge8(1, this);
        qt8 qt8Var = qt8.b;
        this.c0 = boa.E(qt8Var, ge8Var);
        this.d0 = boa.E(qt8Var, new kd8(this, 2));
    }

    @Override // defpackage.xf8
    public final xf8.b G() {
        return this.c0.getValue();
    }

    @Override // defpackage.qf8
    public final qf8.b c() {
        return this.c0.getValue();
    }

    @Override // defpackage.rf8
    public final V get() {
        return this.c0.getValue().call(new Object[0]);
    }

    @Override // defpackage.gu5
    public final V invoke() {
        return get();
    }

    @Override // defpackage.qf8
    public final rf8.a c() {
        return this.c0.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sf8(te8 te8Var, d4c d4cVar) {
        super(te8Var, d4cVar);
        d4cVar.getClass();
        ge8 ge8Var = new ge8(1, this);
        qt8 qt8Var = qt8.b;
        this.c0 = boa.E(qt8Var, ge8Var);
        this.d0 = boa.E(qt8Var, new kd8(this, 2));
    }
}
