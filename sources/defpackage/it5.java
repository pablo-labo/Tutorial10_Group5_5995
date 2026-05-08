package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class it5 {
    public static final it5 a = new it5();
    public static rn3 b;

    public interface a {
    }

    public static final boolean a() {
        a.getClass();
        if (b != null) {
            return false;
        }
        synchronized (it5.class) {
            b = new rn3();
        }
        return false;
    }
}
