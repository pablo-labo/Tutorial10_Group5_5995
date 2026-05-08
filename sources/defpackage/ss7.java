package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ss7 {
    public final String a;

    public ss7(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ss7) && wl7.b(this.a, ((ss7) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return l5.m("JSTProfileSummary(summary=", this.a, ")");
    }
}
