package defpackage;

import com.indeed.android.myjobs.data.model.APIError;
import com.indeed.android.myjobs.data.model.dto.EmployerInvitationDto;

/* JADX INFO: loaded from: classes3.dex */
public final class an7 implements xo6 {
    public final EmployerInvitationDto a;
    public final boolean b;
    public final APIError c;
    public final boolean d;
    public final int e;

    public an7(EmployerInvitationDto employerInvitationDto, boolean z, APIError aPIError, boolean z2, int i) {
        this.a = employerInvitationDto;
        this.b = z;
        this.c = aPIError;
        this.d = z2;
        this.e = i;
    }

    public static an7 a(an7 an7Var, EmployerInvitationDto employerInvitationDto, boolean z, APIError aPIError, boolean z2, int i, int i2) {
        if ((i2 & 1) != 0) {
            employerInvitationDto = an7Var.a;
        }
        EmployerInvitationDto employerInvitationDto2 = employerInvitationDto;
        if ((i2 & 2) != 0) {
            z = an7Var.b;
        }
        boolean z3 = z;
        if ((i2 & 4) != 0) {
            aPIError = an7Var.c;
        }
        APIError aPIError2 = aPIError;
        if ((i2 & 8) != 0) {
            z2 = an7Var.d;
        }
        boolean z4 = z2;
        if ((i2 & 16) != 0) {
            i = an7Var.e;
        }
        an7Var.getClass();
        return new an7(employerInvitationDto2, z3, aPIError2, z4, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof an7)) {
            return false;
        }
        an7 an7Var = (an7) obj;
        return wl7.b(this.a, an7Var.a) && this.b == an7Var.b && wl7.b(this.c, an7Var.c) && this.d == an7Var.d && this.e == an7Var.e;
    }

    public final int hashCode() {
        EmployerInvitationDto employerInvitationDto = this.a;
        int iF = ia.f((employerInvitationDto == null ? 0 : employerInvitationDto.hashCode()) * 31, 31, this.b);
        APIError aPIError = this.c;
        return Integer.hashCode(this.e) + ia.f((iF + (aPIError != null ? aPIError.hashCode() : 0)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InvitationTabState(invitations=");
        sb.append(this.a);
        sb.append(", isLoading=");
        sb.append(this.b);
        sb.append(", error=");
        sb.append(this.c);
        sb.append(", shouldShowBadge=");
        sb.append(this.d);
        sb.append(", hasActionableNextStep=");
        return w20.k(sb, this.e, ")");
    }

    public /* synthetic */ an7(int i) {
        this(null, false, null, false, 0);
    }

    public an7() {
        this(0);
    }
}
