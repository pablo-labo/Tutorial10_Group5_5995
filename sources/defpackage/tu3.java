package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class tu3 {
    public final String a;
    public final List<String> b;

    public tu3(String str, List<String> list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tu3)) {
            return false;
        }
        tu3 tu3Var = (tu3) obj;
        return wl7.b(this.a, tu3Var.a) && wl7.b(this.b, tu3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return h5.c("DeleteJobSeekerProfileResumeCertificationsInput(resumeId=", this.a, ", certificationIds=", ")", this.b);
    }
}
