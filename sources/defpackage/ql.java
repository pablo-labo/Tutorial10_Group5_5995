package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ql {
    public final String a;
    public final List<vj> b;

    public ql(String str, List<vj> list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ql)) {
            return false;
        }
        ql qlVar = (ql) obj;
        return wl7.b(this.a, qlVar.a) && wl7.b(this.b, qlVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return h5.c("AddJobSeekerProfileResumeAwardsInput(resumeId=", this.a, ", awards=", ")", this.b);
    }
}
