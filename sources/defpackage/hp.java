package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class hp {
    public final String a;
    public final List<mq> b;

    public hp(String str, List<mq> list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hp)) {
            return false;
        }
        hp hpVar = (hp) obj;
        return wl7.b(this.a, hpVar.a) && wl7.b(this.b, hpVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return h5.c("AddJobSeekerProfileResumeWorkExperiencesInput(resumeId=", this.a, ", workExperiences=", ")", this.b);
    }
}
