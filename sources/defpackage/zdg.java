package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zdg {
    public final String a;
    public final List<seg> b;

    public zdg(String str, List<seg> list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zdg)) {
            return false;
        }
        zdg zdgVar = (zdg) obj;
        return wl7.b(this.a, zdgVar.a) && wl7.b(this.b, zdgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return h5.c("UpdateJobSeekerProfileResumeSkillsInput(resumeId=", this.a, ", skills=", ")", this.b);
    }
}
