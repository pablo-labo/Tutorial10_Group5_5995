package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public interface e49 {
    boolean a();

    void b(RuntimeException runtimeException);

    boolean c();

    boolean d();

    boolean e();

    void f(String str, NumberFormatException numberFormatException);

    boolean g();

    String getName();

    void h(Object... objArr);

    void i(String str);

    default boolean j(su8 su8Var) {
        int iA = su8Var.a();
        if (iA == 0) {
            return e();
        }
        if (iA == 10) {
            return c();
        }
        if (iA == 20) {
            return d();
        }
        if (iA == 30) {
            return a();
        }
        if (iA == 40) {
            return g();
        }
        w40.m("Level [", su8Var, "] not recognized.");
        return false;
    }
}
