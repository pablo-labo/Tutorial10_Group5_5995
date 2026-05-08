package defpackage;

import defpackage.vu5;

/* JADX INFO: loaded from: classes.dex */
public final class r5<T extends vu5<? extends Boolean>> {
    public final String a;
    public final T b;

    public r5(String str, T t) {
        this.a = str;
        this.b = t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r5)) {
            return false;
        }
        r5 r5Var = (r5) obj;
        return wl7.b(this.a, r5Var.a) && wl7.b(this.b, r5Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        T t = this.b;
        return iHashCode + (t != null ? t.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.a + ", action=" + this.b + ')';
    }
}
