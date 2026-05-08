package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class lve implements a9c {
    public final String a;

    public lve(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lve) && this.a.equals(((lve) obj).a);
    }

    @Override // defpackage.a9c
    public final String getValue() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
