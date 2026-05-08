package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hmf {
    public final String a;

    public hmf(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hmf) && this.a.equals(((hmf) obj).a);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + 47596922;
    }

    public final String toString() {
        return l5.m("TimelineModuleInput(atk=", this.a, ", telVersionUpperBound=2.3.1)");
    }
}
