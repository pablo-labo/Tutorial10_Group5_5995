package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ut {
    public final String a;
    public final String b;
    public final u8d c;
    public final hva<String> d;

    public ut(String str, String str2, u8d u8dVar, hva<String> hvaVar) {
        str.getClass();
        str2.getClass();
        u8dVar.getClass();
        hvaVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = u8dVar;
        this.d = hvaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ut)) {
            return false;
        }
        ut utVar = (ut) obj;
        return wl7.b(this.a, utVar.a) && wl7.b(this.b, utVar.b) && this.c == utVar.c && wl7.b(this.d, utVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + akb.d(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sbF = u40.f("AddOrUpdateResumeFileSuggestionInput(resumeFileId=", this.a, ", clientName=", this.b, ", status=");
        sbF.append(this.c);
        sbF.append(", replacementResumeFileId=");
        sbF.append(this.d);
        sbF.append(")");
        return sbF.toString();
    }
}
