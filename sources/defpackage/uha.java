package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class uha {
    public final List<mkd> a;
    public final List<mkd> b;
    public final List<vy7> c;
    public final List<pj7> d;
    public final long e;
    public final boolean f;

    public uha(List<mkd> list, List<mkd> list2, List<vy7> list3, List<pj7> list4, long j, boolean z) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = j;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uha)) {
            return false;
        }
        uha uhaVar = (uha) obj;
        return wl7.b(this.a, uhaVar.a) && wl7.b(this.b, uhaVar.b) && wl7.b(this.c, uhaVar.c) && wl7.b(this.d, uhaVar.d) && this.e == uhaVar.e && this.f == uhaVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ia.d(ia.g(this.d, ia.g(this.c, ia.g(this.b, this.a.hashCode() * 31, 31), 31), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NextStepsDashboardData(savedJobs=");
        sb.append(this.a);
        sb.append(", appliedJobs=");
        sb.append(this.b);
        sb.append(", invitations=");
        l6.q(sb, this.c, ", interviews=", this.d, ", currentTimestamp=");
        sb.append(this.e);
        sb.append(", pushEnabled=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
