package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface v5b {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final /* synthetic */ a[] a = {new a("CounterClockwise", 0), new a("Clockwise", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        a EF5;

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) a.clone();
        }
    }

    void a(float f, float f2);

    void b(float f, float f2, float f3, float f4, float f5, float f6);

    @sy3
    void c(float f, float f2, float f3, float f4);

    void close();

    @sy3
    void d(float f, float f2, float f3, float f4);

    void e(int i);

    default void f(float f, float f2, float f3, float f4) {
        c(f, f2, f3, f4);
    }

    void g(long j);

    qtc getBounds();

    default void h(float f, float f2, float f3, float f4) {
        d(f, f2, f3, f4);
    }

    int i();

    void j(float f, float f2);

    default void k() {
        reset();
    }

    void l(float f, float f2, float f3, float f4, float f5, float f6);

    void m(float f, float f2);

    void n(float f, float f2);

    void reset();
}
