package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class gn {
    public final String a;
    public final List<uk> b;

    public gn(String str, List<uk> list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gn)) {
            return false;
        }
        gn gnVar = (gn) obj;
        return wl7.b(this.a, gnVar.a) && wl7.b(this.b, gnVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return h5.c("AddJobSeekerProfileResumeLicensesInput(resumeId=", this.a, ", licenses=", ")", this.b);
    }
}
