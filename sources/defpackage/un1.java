package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class un1 implements khf {
    public final tbe a;
    public final float b;

    public un1(tbe tbeVar, float f) {
        this.a = tbeVar;
        this.b = f;
    }

    @Override // defpackage.khf
    public final float a() {
        return this.b;
    }

    @Override // defpackage.khf
    public final long c() {
        int i = da2.j;
        return da2.i;
    }

    @Override // defpackage.khf
    public final sn1 e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof un1)) {
            return false;
        }
        un1 un1Var = (un1) obj;
        return wl7.b(this.a, un1Var.a) && Float.compare(this.b, un1Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrushStyle(value=");
        sb.append(this.a);
        sb.append(", alpha=");
        return l6.h(sb, this.b, ')');
    }
}
