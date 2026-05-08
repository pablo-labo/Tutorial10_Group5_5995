package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ho {
    public final String a;
    public final List<xk> b;

    public ho(String str, List<xk> list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ho)) {
            return false;
        }
        ho hoVar = (ho) obj;
        return wl7.b(this.a, hoVar.a) && wl7.b(this.b, hoVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return h5.c("AddJobSeekerProfileResumePatentsInput(resumeId=", this.a, ", patents=", ")", this.b);
    }
}
