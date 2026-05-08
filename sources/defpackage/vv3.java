package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class vv3 {
    public final String a;
    public final List<String> b;

    public vv3(String str, List<String> list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vv3)) {
            return false;
        }
        vv3 vv3Var = (vv3) obj;
        return wl7.b(this.a, vv3Var.a) && wl7.b(this.b, vv3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return h5.c("DeleteJobSeekerProfileResumeLinksInput(resumeId=", this.a, ", linkIds=", ")", this.b);
    }
}
