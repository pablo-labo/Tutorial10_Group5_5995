package defpackage;

import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class pz {
    public final hva<List<String>> a;
    public final hva<List<fja>> b;

    public pz() {
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
        if (!(obj instanceof pz)) {
            return false;
        }
        pz pzVar = (pz) obj;
        return wl7.b(this.a, pzVar.a) && wl7.b(this.b, pzVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AdditionalParticipantsInput(accountKeys=" + this.a + ", nonAccountUsers=" + this.b + ")";
    }
}
