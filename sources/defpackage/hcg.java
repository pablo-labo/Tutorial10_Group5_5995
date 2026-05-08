package defpackage;

import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class hcg {
    public final String a;
    public final List<x9g> b;
    public final hva<List<k18>> c;

    public hcg() {
        throw null;
    }

    public hcg(String str, List list) {
        hva.a aVar = hva.a.a;
        str.getClass();
        list.getClass();
        aVar.getClass();
        this.a = str;
        this.b = list;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hcg)) {
            return false;
        }
        hcg hcgVar = (hcg) obj;
        return wl7.b(this.a, hcgVar.a) && wl7.b(this.b, hcgVar.b) && wl7.b(this.c, hcgVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ia.g(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdateJobSeekerProfileResumeEducationsInput(resumeId=");
        sb.append(this.a);
        sb.append(", educations=");
        sb.append(this.b);
        sb.append(", customFields=");
        return akb.l(sb, this.c, ")");
    }
}
