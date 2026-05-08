package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fn3 {
    public static final js3 a;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        String property;
        js3 js3Var;
        int i = e3f.a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            eq3 eq3Var = a74.a;
            k89 k89Var = m89.a;
            js3Var = ((k89Var.J1() instanceof iu9) || !(k89Var instanceof js3)) ? en3.Y : (js3) k89Var;
        } else {
            js3Var = en3.Y;
        }
        a = js3Var;
    }
}
