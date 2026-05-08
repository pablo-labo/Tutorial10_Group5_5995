package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wnf {
    public final Long a;

    public wnf(Long l) {
        this.a = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wnf) && this.a.equals(((wnf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TopChoicesAfterDateInput(timestamp=" + this.a + ")";
    }
}
