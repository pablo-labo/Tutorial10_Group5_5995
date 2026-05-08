package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class bx3 {
    public final String a;
    public final List<String> b;

    public bx3(String str, List<String> list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bx3)) {
            return false;
        }
        bx3 bx3Var = (bx3) obj;
        return wl7.b(this.a, bx3Var.a) && wl7.b(this.b, bx3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return h5.c("DeleteJobSeekerProfileResumeWorkExperiencesInput(resumeId=", this.a, ", workExperienceIds=", ")", this.b);
    }
}
