package defpackage;

import defpackage.v03;

/* JADX INFO: loaded from: classes3.dex */
public final class c13 extends q1 {
    public static final a c = new a();
    public final String b;

    public static final class a implements v03.b<c13> {
    }

    public c13(String str) {
        super(c);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c13) && wl7.b(this.b, ((c13) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return w40.f(new StringBuilder("CoroutineName("), this.b, ')');
    }
}
