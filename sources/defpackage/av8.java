package defpackage;

import defpackage.cv8;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class av8 {
    public final String a;
    public final String b;
    public final List<String> c;
    public final cv8.d d;
    public final cv8.b e;
    public final k38 f;
    public final ig3 g;
    public final cv8.c h;

    public /* synthetic */ av8(String str, String str2, List list, cv8.d dVar, cv8.b bVar, k38 k38Var, ig3 ig3Var, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (List<String>) ((i & 4) != 0 ? null : list), (i & 8) != 0 ? null : dVar, (i & 16) != 0 ? null : bVar, (i & 32) != 0 ? null : k38Var, (i & 64) != 0 ? null : ig3Var, (cv8.c) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof av8)) {
            return false;
        }
        av8 av8Var = (av8) obj;
        return wl7.b(this.a, av8Var.a) && wl7.b(this.b, av8Var.b) && wl7.b(this.c, av8Var.c) && wl7.b(this.d, av8Var.d) && wl7.b(this.e, av8Var.e) && this.f == av8Var.f && wl7.b(this.g, av8Var.g) && wl7.b(this.h, av8Var.h);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        cv8.d dVar = this.d;
        int iHashCode4 = (iHashCode3 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        cv8.b bVar = this.e;
        int iHashCode5 = (iHashCode4 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        k38 k38Var = this.f;
        int iHashCode6 = (iHashCode5 + (k38Var == null ? 0 : k38Var.hashCode())) * 31;
        ig3 ig3Var = this.g;
        int iHashCode7 = (iHashCode6 + (ig3Var == null ? 0 : ig3Var.hashCode())) * 31;
        cv8.c cVar = this.h;
        return iHashCode7 + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("LicenseItem(id=", this.a, ", title=", this.b, ", endorsements=");
        sbF.append(this.c);
        sbF.append(", taxonomyConceptTitle=");
        sbF.append(this.d);
        sbF.append(", location=");
        sbF.append(this.e);
        sbF.append(", type=");
        sbF.append(this.f);
        sbF.append(", dateRange=");
        sbF.append(this.g);
        sbF.append(", metadata=");
        sbF.append(this.h);
        sbF.append(")");
        return sbF.toString();
    }

    public av8() {
        this((String) null, (String) null, (List) null, (cv8.d) null, (cv8.b) null, (k38) null, (ig3) null, 255);
    }

    public av8(String str, String str2, List<String> list, cv8.d dVar, cv8.b bVar, k38 k38Var, ig3 ig3Var, cv8.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = dVar;
        this.e = bVar;
        this.f = k38Var;
        this.g = ig3Var;
        this.h = cVar;
    }
}
