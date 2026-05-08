package defpackage;

import com.indeed.android.myjobs.data.model.dto.SavedJobsDto;

/* JADX INFO: loaded from: classes3.dex */
public final class x0h implements xo6 {
    public final SavedJobsDto a;
    public final boolean b;

    public x0h(SavedJobsDto savedJobsDto, boolean z) {
        this.a = savedJobsDto;
        this.b = z;
    }

    public static x0h a(x0h x0hVar, boolean z) {
        SavedJobsDto savedJobsDto = x0hVar.a;
        x0hVar.getClass();
        return new x0h(savedJobsDto, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0h)) {
            return false;
        }
        x0h x0hVar = (x0h) obj;
        return wl7.b(this.a, x0hVar.a) && this.b == x0hVar.b;
    }

    public final int hashCode() {
        SavedJobsDto savedJobsDto = this.a;
        return Boolean.hashCode(this.b) + ((savedJobsDto == null ? 0 : savedJobsDto.hashCode()) * 31);
    }

    public final String toString() {
        return "WithdrawApplicationState(savedJobsDto=" + this.a + ", isWithdrawalInProgress=" + this.b + ")";
    }

    public /* synthetic */ x0h(int i) {
        this(null, false);
    }

    public x0h() {
        this(0);
    }
}
