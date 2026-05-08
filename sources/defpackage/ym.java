package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ym {
    public final String a;
    public final List<sk> b;

    public ym(String str, List<sk> list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ym)) {
            return false;
        }
        ym ymVar = (ym) obj;
        return wl7.b(this.a, ymVar.a) && wl7.b(this.b, ymVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return h5.c("AddJobSeekerProfileResumeLanguagesInput(resumeId=", this.a, ", languages=", ")", this.b);
    }
}
