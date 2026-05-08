package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zt3 {
    public final String a;

    public zt3(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zt3) && wl7.b(this.a, ((zt3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return l5.m("DeleteJobSeekerProfileFileInput(id=", this.a, ")");
    }
}
