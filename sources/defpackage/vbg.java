package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class vbg {
    public final String a;
    public final List<l9g> b;

    public vbg(String str, List<l9g> list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vbg)) {
            return false;
        }
        vbg vbgVar = (vbg) obj;
        return wl7.b(this.a, vbgVar.a) && wl7.b(this.b, vbgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return h5.c("UpdateJobSeekerProfileResumeCertificationsInput(resumeId=", this.a, ", certifications=", ")", this.b);
    }
}
