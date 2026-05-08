package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class or7 {
    public final String a;

    public or7(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof or7) && wl7.b(this.a, ((or7) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return l5.m("JSTProfileAdditionalInfo(additionalInfo=", this.a, ")");
    }
}
