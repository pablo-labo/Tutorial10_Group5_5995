package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ov3 {
    public final String a;
    public final List<String> b;

    public ov3(String str, List<String> list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ov3)) {
            return false;
        }
        ov3 ov3Var = (ov3) obj;
        return wl7.b(this.a, ov3Var.a) && wl7.b(this.b, ov3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return h5.c("DeleteJobSeekerProfileResumeLicensesInput(resumeId=", this.a, ", licenseIds=", ")", this.b);
    }
}
