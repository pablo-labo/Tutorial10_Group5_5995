package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yr0 extends ka6 {
    public static volatile yr0 e;
    public static final xr0 f = new xr0(0);
    public final sq3 d = new sq3();

    public static yr0 J1() {
        if (e != null) {
            return e;
        }
        synchronized (yr0.class) {
            try {
                if (e == null) {
                    e = new yr0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return e;
    }
}
