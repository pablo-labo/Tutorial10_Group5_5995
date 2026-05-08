package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class kcg {
    public final h48 a;

    public kcg(h48 h48Var) {
        h48Var.getClass();
        this.a = h48Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kcg) && wl7.b(this.a, ((kcg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UpdateJobSeekerProfileResumeInput(resume=" + this.a + ")";
    }
}
