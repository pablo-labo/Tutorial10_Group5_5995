package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class on {
    public final String a;
    public final List<wk> b;

    public on(String str, List<wk> list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof on)) {
            return false;
        }
        on onVar = (on) obj;
        return wl7.b(this.a, onVar.a) && wl7.b(this.b, onVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return h5.c("AddJobSeekerProfileResumeLinksInput(resumeId=", this.a, ", links=", ")", this.b);
    }
}
