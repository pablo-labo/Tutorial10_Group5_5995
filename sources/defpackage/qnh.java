package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qnh {
    public final Object a;
    public final Object b;
    public final Object c;

    public qnh(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.a;
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(this.b);
        return new IllegalArgumentException(m6.h(u40.f("Multiple entries with same key: ", strValueOf, "=", strValueOf2, " and "), String.valueOf(obj), "=", String.valueOf(this.c)));
    }
}
