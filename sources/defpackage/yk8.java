package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class yk8 {
    public final boolean a;
    public final Integer b;

    public yk8(Integer num, boolean z) {
        this.a = z;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yk8)) {
            return false;
        }
        yk8 yk8Var = (yk8) obj;
        return this.a == yk8Var.a && wl7.b(this.b, yk8Var.b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "LaunchActivityState(shouldShowDownloadReportToast=" + this.a + ", downloadResortStringResId=" + this.b + ")";
    }

    public /* synthetic */ yk8(int i) {
        this(null, false);
    }

    public yk8() {
        this(0);
    }
}
