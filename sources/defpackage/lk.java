package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class lk {
    public final String a;
    public final List<jk> b;

    public lk(String str, List<jk> list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lk)) {
            return false;
        }
        lk lkVar = (lk) obj;
        return wl7.b(this.a, lkVar.a) && wl7.b(this.b, lkVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return h5.c("AddJobSeekerProfileEducationsInput(resumeId=", this.a, ", educations=", ")", this.b);
    }
}
