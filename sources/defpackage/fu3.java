package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class fu3 {
    public final String a;
    public final List<String> b;

    public fu3(String str, List<String> list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fu3)) {
            return false;
        }
        fu3 fu3Var = (fu3) obj;
        return wl7.b(this.a, fu3Var.a) && wl7.b(this.b, fu3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return h5.c("DeleteJobSeekerProfileResumeAssociationsInput(resumeId=", this.a, ", associationIds=", ")", this.b);
    }
}
