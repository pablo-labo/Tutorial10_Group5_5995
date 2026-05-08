package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qh7 {
    public int a;

    public qh7(int i) {
        this.a = 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRef(element = ");
        sb.append(this.a);
        sb.append(")@");
        int iHashCode = hashCode();
        ypd.s(16);
        String string = Integer.toString(iHashCode, 16);
        string.getClass();
        sb.append(string);
        return sb.toString();
    }

    public qh7() {
        this(0);
    }
}
