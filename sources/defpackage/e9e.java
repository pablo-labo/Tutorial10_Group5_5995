package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class e9e {
    public final l9e a;
    public final sn0 b;

    public e9e(l9e l9eVar, sn0 sn0Var) {
        this.a = l9eVar;
        this.b = sn0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e9e)) {
            return false;
        }
        e9e e9eVar = (e9e) obj;
        return this.a.equals(e9eVar.a) && this.b.equals(e9eVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + (v05.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + v05.SESSION_START + ", sessionData=" + this.a + ", applicationInfo=" + this.b + ')';
    }
}
