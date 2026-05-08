package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ncg {
    public final String a;
    public final List<hag> b;

    public ncg(String str, List<hag> list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ncg)) {
            return false;
        }
        ncg ncgVar = (ncg) obj;
        return wl7.b(this.a, ncgVar.a) && wl7.b(this.b, ncgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return h5.c("UpdateJobSeekerProfileResumeLicensesInput(resumeId=", this.a, ", licenses=", ")", this.b);
    }
}
