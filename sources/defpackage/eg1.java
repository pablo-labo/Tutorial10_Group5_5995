package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class eg1 {
    public static final int a;
    public static final int b;
    public static volatile dg1 c;

    static {
        new eg1();
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        a = ((long) iMin) > 16777216 ? (iMin / 4) * 3 : iMin / 2;
        b = 384;
    }
}
