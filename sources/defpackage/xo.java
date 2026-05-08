package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class xo {
    public final String a;
    public final List<pp> b;

    public xo(String str, List<pp> list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xo)) {
            return false;
        }
        xo xoVar = (xo) obj;
        return wl7.b(this.a, xoVar.a) && wl7.b(this.b, xoVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return h5.c("AddJobSeekerProfileResumeSkillsInput(resumeId=", this.a, ", skills=", ")", this.b);
    }
}
