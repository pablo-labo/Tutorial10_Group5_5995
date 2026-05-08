package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a4e {
    public static final de0 a = new de0(Float.NaN, Float.NaN);
    public static final mvf b = new mvf(new bj(7), new li(11));
    public static final long c;
    public static final vpe<ooa> d;

    static {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.01f)) << 32) | (((long) Float.floatToRawIntBits(0.01f)) & 4294967295L);
        c = jFloatToRawIntBits;
        d = new vpe<>(new ooa(jFloatToRawIntBits), 3);
    }
}
