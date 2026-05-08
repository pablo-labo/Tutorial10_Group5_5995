package defpackage;

import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class l5a {
    public final hva<List<vn7>> a;
    public final hva<List<xn7>> b;

    public l5a() {
        hva.a aVar = hva.a.a;
        aVar.getClass();
        aVar.getClass();
        this.a = aVar;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l5a)) {
            return false;
        }
        l5a l5aVar = (l5a) obj;
        return wl7.b(this.a, l5aVar.a) && wl7.b(this.b, l5aVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MyJobsInvitedJobsFilterInput(statuses=" + this.a + ", types=" + this.b + ")";
    }
}
