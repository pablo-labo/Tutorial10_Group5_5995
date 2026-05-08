package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class leg {
    public final String a;
    public final List<bfg> b;

    public leg(String str, List<bfg> list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof leg)) {
            return false;
        }
        leg legVar = (leg) obj;
        return wl7.b(this.a, legVar.a) && wl7.b(this.b, legVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return h5.c("UpdateJobSeekerProfileResumeWorkExperiencesInput(resumeId=", this.a, ", workExperiences=", ")", this.b);
    }
}
