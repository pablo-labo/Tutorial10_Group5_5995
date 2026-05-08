package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class xnc {
    public static int a;

    static {
        new xnc();
        a = 1;
    }

    public static final synchronized int a() {
        int i;
        i = a;
        a = i + 10;
        return i;
    }
}
