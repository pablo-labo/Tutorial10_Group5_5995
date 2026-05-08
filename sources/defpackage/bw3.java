package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class bw3 {
    public final String a;
    public final List<String> b;

    public bw3(String str, List<String> list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bw3)) {
            return false;
        }
        bw3 bw3Var = (bw3) obj;
        return wl7.b(this.a, bw3Var.a) && wl7.b(this.b, bw3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return h5.c("DeleteJobSeekerProfileResumeMilitaryInput(resumeId=", this.a, ", militaryIds=", ")", this.b);
    }
}
