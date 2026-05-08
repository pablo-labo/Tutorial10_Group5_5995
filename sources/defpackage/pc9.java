package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class pc9 {
    public final String a;

    public pc9(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pc9) && wl7.b(this.a, ((pc9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return l5.m("MarkAutoMergeReviewedInput(resumeId=", this.a, ")");
    }
}
