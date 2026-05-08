package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n7d extends m7d implements fv5<Object> {
    private final int arity;

    public n7d(int i, lu2<Object> lu2Var) {
        super(lu2Var);
        this.arity = i;
    }

    @Override // defpackage.fv5
    public final int getArity() {
        return this.arity;
    }

    @Override // defpackage.x81
    public final String toString() {
        return getCompletion() == null ? fwc.a.i(this) : super.toString();
    }
}
