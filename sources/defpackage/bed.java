package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bed {
    public final boolean a;
    public final Integer b;

    public bed(Integer num, boolean z) {
        this.a = z;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bed)) {
            return false;
        }
        bed bedVar = (bed) obj;
        return this.a == bedVar.a && wl7.b(this.b, bedVar.b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "RnAceChatState(shouldShowDownloadReportToast=" + this.a + ", downloadResortStringResId=" + this.b + ")";
    }

    public /* synthetic */ bed(int i) {
        this(null, false);
    }

    public bed() {
        this(0);
    }
}
