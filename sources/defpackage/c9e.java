package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class c9e {
    public final String a;
    public final String b;
    public final int c;
    public final long d;

    public c9e(String str, String str2, int i, long j) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c9e)) {
            return false;
        }
        c9e c9eVar = (c9e) obj;
        return wl7.b(this.a, c9eVar.a) && wl7.b(this.b, c9eVar.b) && this.c == c9eVar.c && this.d == c9eVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + w40.c(this.c, akb.d(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.a + ", firstSessionId=" + this.b + ", sessionIndex=" + this.c + ", sessionStartTimestampUs=" + this.d + ')';
    }
}
