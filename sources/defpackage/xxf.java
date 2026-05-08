package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xxf implements wxf {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wxf)) {
            return false;
        }
        wxf wxfVar = (wxf) obj;
        return b() == wxfVar.b() && c() == wxfVar.c() && getType().equals(wxfVar.getType());
    }

    public final int hashCode() {
        int iHashCode = c().hashCode();
        if (kyf.m(getType())) {
            return (iHashCode * 31) + 19;
        }
        return (iHashCode * 31) + (b() ? 17 : getType().hashCode());
    }

    public final String toString() {
        if (b()) {
            return "*";
        }
        if (c() == ylg.INVARIANT) {
            return getType().toString();
        }
        return c() + " " + getType();
    }
}
