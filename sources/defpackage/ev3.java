package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ev3 {
    public final String a;
    public final List<String> b;

    public ev3(String str, List<String> list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ev3)) {
            return false;
        }
        ev3 ev3Var = (ev3) obj;
        return wl7.b(this.a, ev3Var.a) && wl7.b(this.b, ev3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return h5.c("DeleteJobSeekerProfileResumeEducationsInput(resumeId=", this.a, ", educationIds=", ")", this.b);
    }
}
