package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mia implements xfb {
    public static mia a;

    public static synchronized mia a() {
        try {
            if (a == null) {
                a = new mia();
            }
        } catch (Throwable th) {
            throw th;
        }
        return a;
    }
}
