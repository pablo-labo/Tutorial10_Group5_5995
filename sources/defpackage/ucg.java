package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ucg {
    public final String a;
    public final List<jag> b;

    public ucg(String str, List<jag> list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ucg)) {
            return false;
        }
        ucg ucgVar = (ucg) obj;
        return wl7.b(this.a, ucgVar.a) && wl7.b(this.b, ucgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return h5.c("UpdateJobSeekerProfileResumeLinksInput(resumeId=", this.a, ", links=", ")", this.b);
    }
}
