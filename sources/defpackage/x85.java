package defpackage;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class x85 {
    public final String a;
    public final Map<Class<?>, Object> b;

    public x85(String str, Map<Class<?>, Object> map) {
        this.a = str;
        this.b = map;
    }

    public static x85 a(String str) {
        return new x85(str, Collections.EMPTY_MAP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x85)) {
            return false;
        }
        x85 x85Var = (x85) obj;
        return this.a.equals(x85Var.a) && this.b.equals(x85Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.a + ", properties=" + this.b.values() + "}";
    }
}
