package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class gve extends n3b {
    public final String a;
    public final Map<String, String> b;

    public gve(String str, Map<String, String> map) {
        map.getClass();
        this.a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gve)) {
            return false;
        }
        gve gveVar = (gve) obj;
        return wl7.b(this.a, gveVar.a) && wl7.b(this.b, gveVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.a + "='" + this.b + "'";
    }
}
