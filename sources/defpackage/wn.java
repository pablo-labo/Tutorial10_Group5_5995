package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class wn {
    public final String a;
    public final List<yn> b;

    public wn(String str, List<yn> list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wn)) {
            return false;
        }
        wn wnVar = (wn) obj;
        return wl7.b(this.a, wnVar.a) && wl7.b(this.b, wnVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return h5.c("AddJobSeekerProfileResumeMilitaryInput(resumeId=", this.a, ", military=", ")", this.b);
    }
}
