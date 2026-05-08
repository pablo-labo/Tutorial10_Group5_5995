package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class bdg {
    public final String a;
    public final List<cdg> b;

    public bdg(String str, List<cdg> list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bdg)) {
            return false;
        }
        bdg bdgVar = (bdg) obj;
        return wl7.b(this.a, bdgVar.a) && wl7.b(this.b, bdgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return h5.c("UpdateJobSeekerProfileResumeMilitaryInput(resumeId=", this.a, ", military=", ")", this.b);
    }
}
