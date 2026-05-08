package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface k15 {

    public interface a extends k15 {
        @Override // defpackage.k15
        default k15 a(b<?> bVar) {
            bVar.getClass();
            return getKey().equals(bVar) ? wr4.a : this;
        }

        @Override // defpackage.k15
        default Object b(k15 k15Var, fj2 fj2Var) {
            return fj2Var.invoke(k15Var, this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.k15
        default <E extends a> E c(b<E> bVar) {
            bVar.getClass();
            if (getKey().equals(bVar)) {
                return this;
            }
            return null;
        }

        b<?> getKey();
    }

    public interface b<E extends a> {
    }

    k15 a(b<?> bVar);

    Object b(k15 k15Var, fj2 fj2Var);

    <E extends a> E c(b<E> bVar);

    default k15 d(k15 k15Var) {
        k15Var.getClass();
        return k15Var == wr4.a ? this : (k15) k15Var.b(this, new fj2(5, (byte) 0));
    }
}
