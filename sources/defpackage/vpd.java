package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class vpd<T> extends p1<T> implements h13 {
    public final lu2<T> d;

    public vpd(lu2 lu2Var, v03 v03Var) {
        super(v03Var, true);
        this.d = lu2Var;
    }

    @Override // defpackage.d78
    public final boolean M() {
        return true;
    }

    @Override // defpackage.h13
    public final h13 getCallerFrame() {
        lu2<T> lu2Var = this.d;
        if (lu2Var instanceof h13) {
            return (h13) lu2Var;
        }
        return null;
    }

    @Override // defpackage.d78
    public void m(Object obj) {
        mh2.w(ewa.v(this.d), u63.g0(obj));
    }

    @Override // defpackage.d78
    public void n(Object obj) {
        this.d.resumeWith(u63.g0(obj));
    }

    public void n0() {
    }
}
