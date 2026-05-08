package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class il {
    public final String a;
    public final List<tj> b;

    public il(String str, List<tj> list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof il)) {
            return false;
        }
        il ilVar = (il) obj;
        return wl7.b(this.a, ilVar.a) && wl7.b(this.b, ilVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return h5.c("AddJobSeekerProfileResumeAssociationsInput(resumeId=", this.a, ", associations=", ")", this.b);
    }
}
