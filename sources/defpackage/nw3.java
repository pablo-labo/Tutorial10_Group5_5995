package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class nw3 {
    public final String a;
    public final List<String> b;

    public nw3(String str, List<String> list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nw3)) {
            return false;
        }
        nw3 nw3Var = (nw3) obj;
        return wl7.b(this.a, nw3Var.a) && wl7.b(this.b, nw3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return h5.c("DeleteJobSeekerProfileResumePublicationsInput(resumeId=", this.a, ", publicationIds=", ")", this.b);
    }
}
