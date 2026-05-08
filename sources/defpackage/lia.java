package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lia implements bo9 {
    public static lia a;

    public static synchronized lia a() {
        try {
            if (a == null) {
                a = new lia();
            }
        } catch (Throwable th) {
            throw th;
        }
        return a;
    }
}
