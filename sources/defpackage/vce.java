package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vce implements ct2 {
    public final String a;
    public final int b;
    public final lc0 c;
    public final boolean d;

    public vce(String str, int i, lc0 lc0Var, boolean z) {
        this.a = str;
        this.b = i;
        this.c = lc0Var;
        this.d = z;
    }

    @Override // defpackage.ct2
    public final ks2 a(j79 j79Var, s69 s69Var, ba1 ba1Var) {
        return new hce(j79Var, ba1Var, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapePath{name=");
        sb.append(this.a);
        sb.append(", index=");
        return k6.h(sb, this.b, '}');
    }
}
