package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class obg {
    public final String a;
    public final List<j9g> b;

    public obg(String str, List<j9g> list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof obg)) {
            return false;
        }
        obg obgVar = (obg) obj;
        return wl7.b(this.a, obgVar.a) && wl7.b(this.b, obgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return h5.c("UpdateJobSeekerProfileResumeAwardsInput(resumeId=", this.a, ", awards=", ")", this.b);
    }
}
