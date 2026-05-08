package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class po {
    public final String a;
    public final List<zk> b;

    public po(String str, List<zk> list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof po)) {
            return false;
        }
        po poVar = (po) obj;
        return wl7.b(this.a, poVar.a) && wl7.b(this.b, poVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return h5.c("AddJobSeekerProfileResumePublicationsInput(resumeId=", this.a, ", publications=", ")", this.b);
    }
}
