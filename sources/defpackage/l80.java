package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class l80 extends v3b {
    public final u2a b;

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class a<T> extends mj8 implements gu5<T> {
        final /* synthetic */ yd8<?> $clazz;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(yd8<?> yd8Var) {
            super(0);
            this.$clazz = yd8Var;
        }

        @Override // defpackage.gu5
        public final T invoke() {
            return (T) l80.super.a(this.$clazz);
        }
    }

    public l80(gu5 gu5Var, u2a u2aVar) {
        v3b v3bVar;
        ArrayList arrayList;
        super((gu5Var == null || (v3bVar = (v3b) gu5Var.invoke()) == null || (arrayList = v3bVar.a) == null) ? new ArrayList() : new ArrayList(arrayList));
        this.b = u2aVar;
    }

    @Override // defpackage.v3b
    public final <T> T a(yd8<?> yd8Var) {
        yd8Var.getClass();
        return yd8Var.equals(fwc.a.b(qkd.class)) ? (T) wkd.a(this.b) : (T) new a(yd8Var).invoke();
    }
}
