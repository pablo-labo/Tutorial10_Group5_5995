package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class c54 implements rnc {
    public final y44 a;

    public c54(y44 y44Var) {
        this.a = y44Var;
    }

    @Override // defpackage.rnc
    public final qeb getPointerEvents() {
        return this.a.getBlockGestures$react_native_screens_release() ? qeb.e : qeb.b;
    }
}
