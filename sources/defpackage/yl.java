package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class yl {
    public final String a;
    public final List<xj> b;

    public yl(String str, List<xj> list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yl)) {
            return false;
        }
        yl ylVar = (yl) obj;
        return wl7.b(this.a, ylVar.a) && wl7.b(this.b, ylVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return h5.c("AddJobSeekerProfileResumeCertificationsInput(resumeId=", this.a, ", certifications=", ")", this.b);
    }
}
