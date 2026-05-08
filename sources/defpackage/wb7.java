package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class wb7 {
    public final List<String> a;
    public final String b;

    public wb7(List<String> list, String str) {
        this.a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wb7)) {
            return false;
        }
        wb7 wb7Var = (wb7) obj;
        return this.a.equals(wb7Var.a) && this.b.equals(wb7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InferredApplicationStatusForJobsInput(jobKeys=" + this.a + ", proctorGroups=" + this.b + ")";
    }
}
