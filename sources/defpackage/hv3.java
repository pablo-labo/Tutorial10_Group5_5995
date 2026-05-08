package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class hv3 {
    public final String a;
    public final List<String> b;

    public hv3(String str, List<String> list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hv3)) {
            return false;
        }
        hv3 hv3Var = (hv3) obj;
        return wl7.b(this.a, hv3Var.a) && wl7.b(this.b, hv3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return h5.c("DeleteJobSeekerProfileResumeLanguagesInput(resumeId=", this.a, ", languageIds=", ")", this.b);
    }
}
