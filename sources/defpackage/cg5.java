package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class cg5 {
    public final String a;

    public cg5(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cg5) && wl7.b(this.a, ((cg5) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return w40.f(new StringBuilder("FirebaseSessionsData(sessionId="), this.a, ')');
    }
}
