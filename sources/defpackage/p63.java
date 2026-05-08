package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class p63 {
    public final LinkedHashMap a = new LinkedHashMap();

    public static final class a extends p63 {
        public static final a b = new a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p63) {
            return wl7.b(this.a, ((p63) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.a + ')';
    }
}
