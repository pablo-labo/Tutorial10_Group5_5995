package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class mu3 {
    public final String a;
    public final List<String> b;

    public mu3(String str, List<String> list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mu3)) {
            return false;
        }
        mu3 mu3Var = (mu3) obj;
        return wl7.b(this.a, mu3Var.a) && wl7.b(this.b, mu3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return h5.c("DeleteJobSeekerProfileResumeAwardsInput(resumeId=", this.a, ", awardIds=", ")", this.b);
    }
}
