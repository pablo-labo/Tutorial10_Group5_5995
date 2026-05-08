package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class kdg {
    public final String a;
    public final List<rag> b;

    public kdg(String str, List<rag> list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kdg)) {
            return false;
        }
        kdg kdgVar = (kdg) obj;
        return wl7.b(this.a, kdgVar.a) && wl7.b(this.b, kdgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return h5.c("UpdateJobSeekerProfileResumePatentsInput(resumeId=", this.a, ", patents=", ")", this.b);
    }
}
