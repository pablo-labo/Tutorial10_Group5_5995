package defpackage;

import defpackage.v33;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class a21 extends v33.d {
    public final List<v33.d.a> a;
    public final String b;

    public a21() {
        throw null;
    }

    public a21(List list, String str) {
        this.a = list;
        this.b = str;
    }

    @Override // v33.d
    public final List<v33.d.a> a() {
        return this.a;
    }

    @Override // v33.d
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v33.d)) {
            return false;
        }
        v33.d dVar = (v33.d) obj;
        if (!this.a.equals(dVar.a())) {
            return false;
        }
        String str = this.b;
        return str == null ? dVar.b() == null : str.equals(dVar.b());
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        return (str == null ? 0 : str.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilesPayload{files=");
        sb.append(this.a);
        sb.append(", orgId=");
        return l6.i(sb, this.b, "}");
    }
}
