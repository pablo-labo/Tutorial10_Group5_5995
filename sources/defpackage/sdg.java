package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class sdg {
    public final String a;
    public final List<tag> b;

    public sdg(String str, List<tag> list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sdg)) {
            return false;
        }
        sdg sdgVar = (sdg) obj;
        return wl7.b(this.a, sdgVar.a) && wl7.b(this.b, sdgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return h5.c("UpdateJobSeekerProfileResumePublicationsInput(resumeId=", this.a, ", publications=", ")", this.b);
    }
}
