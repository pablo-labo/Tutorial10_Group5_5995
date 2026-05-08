package defpackage;

import defpackage.v33;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class t21 extends v33.e.d.f {
    public final List<v33.e.d.AbstractC0448e> a;

    public t21() {
        throw null;
    }

    public t21(List list) {
        this.a = list;
    }

    @Override // v33.e.d.f
    public final List<v33.e.d.AbstractC0448e> a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v33.e.d.f) {
            return this.a.equals(((v33.e.d.f) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return g7.i(new StringBuilder("RolloutsState{rolloutAssignments="), this.a, "}");
    }
}
