package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lrd {
    public final gu5<Float> a;
    public final gu5<Float> b;
    public final boolean c;

    public lrd(gu5<Float> gu5Var, gu5<Float> gu5Var2, boolean z) {
        this.a = gu5Var;
        this.b = gu5Var2;
        this.c = z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScrollAxisRange(value=");
        sb.append(this.a.invoke().floatValue());
        sb.append(", maxValue=");
        sb.append(this.b.invoke().floatValue());
        sb.append(", reverseScrolling=");
        return m6.i(sb, this.c, ')');
    }
}
