package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class lcg {
    public final String a;
    public final List<fag> b;

    public lcg(String str, List<fag> list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lcg)) {
            return false;
        }
        lcg lcgVar = (lcg) obj;
        return wl7.b(this.a, lcgVar.a) && wl7.b(this.b, lcgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return h5.c("UpdateJobSeekerProfileResumeLanguagesInput(resumeId=", this.a, ", languages=", ")", this.b);
    }
}
