package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class d8f {
    public static final d8f b = new d8f(bs4.a);
    public final Map<Class<?>, Object> a;

    public d8f(Map<Class<?>, ? extends Object> map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d8f) {
            return wl7.b(this.a, ((d8f) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Tags(tags=" + this.a + ')';
    }
}
