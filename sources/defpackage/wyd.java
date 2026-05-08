package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wyd {
    public final String a;

    public wyd(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wyd) && this.a.equals(((wyd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return l5.m("SegmentationLeverExperimentInput(leverId=", this.a, ")");
    }
}
