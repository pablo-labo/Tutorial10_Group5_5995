package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mx3 {
    public final String a;

    public mx3(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mx3) && wl7.b(this.a, ((mx3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return l5.m("DeleteResumeBundleInput(resumeId=", this.a, ")");
    }
}
