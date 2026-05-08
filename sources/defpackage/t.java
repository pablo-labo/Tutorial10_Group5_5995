package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t implements q {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            return a().equals(((q) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return a().hashCode();
    }
}
