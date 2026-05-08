package defpackage;

import com.indeed.android.myjobs.data.model.APIError;
import com.indeed.android.myjobs.data.model.dto.InterviewJobsDto;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ml7 implements xo6 {
    public final List<InterviewJobsDto> a;
    public final boolean b;
    public final APIError c;
    public final int d;

    public ml7(List list, boolean z, APIError aPIError, int i) {
        this.a = list;
        this.b = z;
        this.c = aPIError;
        this.d = i;
    }

    public static ml7 a(ml7 ml7Var, List list, boolean z, APIError aPIError, int i, int i2) {
        if ((i2 & 1) != 0) {
            list = ml7Var.a;
        }
        ml7Var.getClass();
        if ((i2 & 4) != 0) {
            z = ml7Var.b;
        }
        if ((i2 & 8) != 0) {
            aPIError = ml7Var.c;
        }
        ml7Var.getClass();
        if ((i2 & 32) != 0) {
            i = ml7Var.d;
        }
        ml7Var.getClass();
        return new ml7(list, z, aPIError, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ml7)) {
            return false;
        }
        ml7 ml7Var = (ml7) obj;
        return wl7.b(this.a, ml7Var.a) && this.b == ml7Var.b && wl7.b(this.c, ml7Var.c) && this.d == ml7Var.d;
    }

    public final int hashCode() {
        List<InterviewJobsDto> list = this.a;
        int iF = ia.f(w40.c(0, (list == null ? 0 : list.hashCode()) * 31, 31), 31, this.b);
        APIError aPIError = this.c;
        return Integer.hashCode(this.d) + w40.c(0, (iF + (aPIError == null ? 0 : aPIError.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "InterviewtabState(inteviewJobs=" + this.a + ", count=0, isLoading=" + this.b + ", error=" + this.c + ", state=0, hasActionableNextStep=" + this.d + ")";
    }

    public ml7() {
        this(0);
    }

    public /* synthetic */ ml7(int i) {
        this(zr4.a, false, null, 0);
    }
}
