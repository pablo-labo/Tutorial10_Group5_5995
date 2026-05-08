package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class a71 extends b71 {
    public final Set<String> a;

    public a71(Set<String> set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a71) && wl7.b(this.a, ((a71) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BPossibleTypes(possibleTypes=" + this.a + ')';
    }
}
