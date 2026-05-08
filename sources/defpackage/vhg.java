package defpackage;

import defpackage.le0;

/* JADX INFO: loaded from: classes.dex */
@sy3
public final class vhg implements le0.a {
    public final String a;

    public vhg(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vhg) {
            return this.a.equals(((vhg) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return w40.f(new StringBuilder("UrlAnnotation(url="), this.a, ')');
    }
}
