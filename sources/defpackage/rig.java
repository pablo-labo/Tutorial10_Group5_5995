package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class rig {
    public final String a;
    public final List<fig> b;

    public rig(String str, List<fig> list) {
        str.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rig)) {
            return false;
        }
        rig rigVar = (rig) obj;
        return wl7.b(this.a, rigVar.a) && this.b.equals(rigVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return h5.c("UrlRegistryResponse(locale=", this.a, ", urlRegistryItems=", ")", this.b);
    }
}
