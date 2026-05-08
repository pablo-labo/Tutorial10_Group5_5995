package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wk {
    public final String a;

    public wk(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wk) && wl7.b(this.a, ((wk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return l5.m("AddJobSeekerProfileLinkInput(link=", this.a, ")");
    }
}
