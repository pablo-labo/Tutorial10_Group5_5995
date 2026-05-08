package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class sjb {
    public final String a;
    public final String b;

    public sjb(String str, String str2) {
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sjb)) {
            return false;
        }
        sjb sjbVar = (sjb) obj;
        return this.a.equals(sjbVar.a) && wl7.b(this.b, sjbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return akb.k("PreferencesData(suid=", this.a, ", displayName=", this.b, ")");
    }
}
