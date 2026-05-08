package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kae {
    public final boolean a;

    public kae(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kae) && this.a == ((kae) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return "SetOnlineStatusPreferenceInput(isEnabled=" + this.a + ")";
    }
}
