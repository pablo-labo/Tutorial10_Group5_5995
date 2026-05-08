package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class l9e {
    public final String a;
    public final String b;
    public final int c;
    public final long d;
    public final ge3 e;
    public final String f;
    public final String g;

    public l9e(String str, String str2, int i, long j, ge3 ge3Var, String str3, String str4) {
        q6.m(str, str2, str4);
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
        this.e = ge3Var;
        this.f = str3;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l9e)) {
            return false;
        }
        l9e l9eVar = (l9e) obj;
        return wl7.b(this.a, l9eVar.a) && wl7.b(this.b, l9eVar.b) && this.c == l9eVar.c && this.d == l9eVar.d && this.e.equals(l9eVar.e) && this.f.equals(l9eVar.f) && wl7.b(this.g, l9eVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + akb.d((this.e.hashCode() + ia.d(w40.c(this.c, akb.d(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionInfo(sessionId=");
        sb.append(this.a);
        sb.append(", firstSessionId=");
        sb.append(this.b);
        sb.append(", sessionIndex=");
        sb.append(this.c);
        sb.append(", eventTimestampUs=");
        sb.append(this.d);
        sb.append(", dataCollectionStatus=");
        sb.append(this.e);
        sb.append(", firebaseInstallationId=");
        sb.append(this.f);
        sb.append(", firebaseAuthenticationToken=");
        return w40.f(sb, this.g, ')');
    }
}
