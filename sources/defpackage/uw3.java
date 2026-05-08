package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class uw3 {
    public final String a;
    public final List<String> b;

    public uw3(String str, List<String> list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uw3)) {
            return false;
        }
        uw3 uw3Var = (uw3) obj;
        return wl7.b(this.a, uw3Var.a) && wl7.b(this.b, uw3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return h5.c("DeleteJobSeekerProfileResumeSkillsInput(resumeId=", this.a, ", skillIds=", ")", this.b);
    }
}
