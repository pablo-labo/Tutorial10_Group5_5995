package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vpe<T> implements jf5<T> {
    public final float a;
    public final float b;
    public final T c;

    public /* synthetic */ vpe(Object obj, int i) {
        this(1.0f, 1500.0f, (i & 4) != 0 ? null : obj);
    }

    @Override // defpackage.yd0
    public final lmg a(lvf lvfVar) {
        T t = this.c;
        return new v(this.a, this.b, t == null ? null : (ge0) lvfVar.a().invoke(t));
    }

    @Override // defpackage.jf5
    public final omg b() {
        mvf mvfVar = q92.c0;
        T t = this.c;
        return new v(this.a, this.b, t == null ? null : (ge0) mvfVar.a().invoke(t));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vpe) {
            vpe vpeVar = (vpe) obj;
            if (vpeVar.a == this.a && vpeVar.b == this.b && wl7.b(vpeVar.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        T t = this.c;
        return Float.hashCode(this.b) + k6.c((t != null ? t.hashCode() : 0) * 31, this.a, 31);
    }

    public vpe(float f, float f2, T t) {
        this.a = f;
        this.b = f2;
        this.c = t;
    }

    public vpe() {
        this(null, 7);
    }
}
