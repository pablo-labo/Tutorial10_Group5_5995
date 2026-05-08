package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cmg {
    public static final cmg d = new cmg(-1.0d, 0.0d);
    public static final cmg e = new cmg(1.0d, 0.0d);
    public static final cmg f = new cmg(0.0d, -1.0d);
    public static final cmg g = new cmg(0.0d, 1.0d);
    public static final cmg h = new cmg(1.0d, -1.0d);
    public static final cmg i = new cmg(1.0d, 1.0d);
    public static final cmg j = new cmg(-1.0d, -1.0d);
    public static final cmg k = new cmg(-1.0d, 1.0d);
    public static final cmg l = new cmg(0.0d, 0.0d);
    public final double a;
    public final double b;
    public final double c;

    public cmg(double d2, double d3) {
        double dHypot = Math.hypot(d2, d3);
        this.c = dHypot;
        boolean z = dHypot > 0.1d;
        this.a = z ? d2 / dHypot : 0.0d;
        this.b = z ? d3 / dHypot : 0.0d;
    }
}
