package defpackage;

import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ayc {
    public final List<xsa> a;
    public final hva.c b;

    public ayc(List list, hva.c cVar) {
        zsa zsaVar = zsa.JOBSEEKER;
        list.getClass();
        this.a = list;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ayc)) {
            return false;
        }
        ayc aycVar = (ayc) obj;
        if (!wl7.b(this.a, aycVar.a)) {
            return false;
        }
        zsa zsaVar = zsa.JOBSEEKER;
        return this.b.equals(aycVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((zsa.JOBSEEKER.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "RegisterListenersOnlineStatusInput(accounts=" + this.a + ", listenerAccountType=" + zsa.JOBSEEKER + ", listenDurationSeconds=" + this.b + ")";
    }
}
