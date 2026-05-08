package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vcb {
    public final lcb a;
    public final acb b;

    public vcb(boolean z) {
        this(null, new acb(z));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vcb)) {
            return false;
        }
        vcb vcbVar = (vcb) obj;
        return wl7.b(this.b, vcbVar.b) && wl7.b(this.a, vcbVar.a);
    }

    public final int hashCode() {
        lcb lcbVar = this.a;
        int iHashCode = (lcbVar != null ? lcbVar.hashCode() : 0) * 31;
        acb acbVar = this.b;
        return iHashCode + (acbVar != null ? acbVar.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.a + ", paragraphSyle=" + this.b + ')';
    }

    public vcb(lcb lcbVar, acb acbVar) {
        this.a = lcbVar;
        this.b = acbVar;
    }
}
