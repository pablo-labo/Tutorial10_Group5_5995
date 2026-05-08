package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jag {
    public final String a;
    public final hva<String> b;

    public jag(String str, hva<String> hvaVar) {
        hvaVar.getClass();
        this.a = str;
        this.b = hvaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jag)) {
            return false;
        }
        jag jagVar = (jag) obj;
        return this.a.equals(jagVar.a) && wl7.b(this.b, jagVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UpdateJobSeekerProfileLinkInput(id=" + this.a + ", link=" + this.b + ")";
    }
}
