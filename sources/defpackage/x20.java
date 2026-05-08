package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x20 {
    public int a;

    public x20(int i) {
        this.a = i;
    }

    public final boolean a() {
        return this.a != Integer.MIN_VALUE;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{ location = ");
        return w20.k(sb, this.a, " }");
    }
}
