package defpackage;

import com.indeed.android.myjobs.data.model.UserJobStatus;
import com.indeed.android.myjobs.data.model.dto.SavedJobsDto;
import defpackage.lx5;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class c05 {
    public static final Function1<lx5, j6g> a = ie7.e0;
    public static final tx5 b = new tx5();

    public static void a(String str) {
        a.invoke(tx5.k(b, "myjobs_native_screen", "errorScreen", new vz4(str, 0), 4));
    }

    public static void b(String str, Function1 function1) {
        function1.getClass();
        a.invoke(tx5.k(b, "myjobs_native_screen", "interviewPrepCTA", new nm1(str, 3, function1), 4));
    }

    public static void c(String str, Function1 function1) {
        str.getClass();
        function1.getClass();
        a.invoke(tx5.e(b, "interviewPrepCTA", "myjobs_native_screen", new gv2(2, str, function1), 4));
    }

    public static void d(long j, String str) {
        a.invoke(tx5.g(b, "myjobs_native_screen", new rz4(j, str, (String) null), 2));
    }

    public static void e(final int i, final String str) {
        a.invoke(tx5.g(b, "myjobs_native_screen", new Function1() { // from class: sz4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                lx5.b bVar = (lx5.b) obj;
                bVar.getClass();
                bVar.a("source", str);
                bVar.b("result", Long.valueOf(i));
                return j6g.a;
            }
        }, 2));
    }

    public static void f(String str, String str2) {
        a.invoke(tx5.k(b, "myjobs_native_screen", str, new hv(str2, 1), 4));
    }

    public static void g(String str) {
        a.invoke(tx5.k(b, "myjobs_native_screen", "refresh", new yz4(str, 0), 4));
    }

    public static void h(int i, SavedJobsDto savedJobsDto, String str) {
        savedJobsDto.getClass();
        boolean indeedApplyable = savedJobsDto.getIndeedApplyable();
        int i2 = savedJobsDto.getEncryptedIaAppId() != null ? 1 : 0;
        String strF = u63.F(savedJobsDto);
        StringBuilder sbF = uz.f("indeedApplyable=", indeedApplyable ? 1 : 0, ",hosted=", i2, ",rank=");
        sbF.append(i);
        sbF.append(",currentStatus=");
        sbF.append(strF);
        a.invoke(tx5.k(b, "myjobs_native_screen", str, new yc1(4, sbF.toString(), savedJobsDto), 4));
    }

    public static void i(String str, String str2, SavedJobsDto savedJobsDto, boolean z, boolean z2) {
        String status;
        str.getClass();
        savedJobsDto.getClass();
        String str3 = !z2 ? "1" : z ? "0" : "-1";
        boolean zIsJobExpired = savedJobsDto.isJobExpired();
        boolean indeedApplyable = savedJobsDto.getIndeedApplyable();
        int i = savedJobsDto.getEncryptedIaAppId() != null ? 1 : 0;
        UserJobStatus selfReportedStatus = savedJobsDto.getSelfReportedStatus();
        if (selfReportedStatus == null || (status = selfReportedStatus.getStatus()) == null) {
            status = "Applied";
        }
        boolean shouldShowRedDot = savedJobsDto.getShouldShowRedDot();
        StringBuilder sbF = uz.f("indeedApplyable=", indeedApplyable ? 1 : 0, ",hosted=", i, ",currentStatus=");
        ia.r(sbF, status, ",primaryCTA=", str3, ",isJobExpired=");
        sbF.append(zIsJobExpired ? 1 : 0);
        sbF.append(",hasRedDot=");
        sbF.append(shouldShowRedDot ? 1 : 0);
        a.invoke(tx5.k(b, "myjobs_native_screen", (z || !z2) ? "updateApplicationStatusFromSuggestion" : "updateApplicationStatus", new w41(str, str2, "", savedJobsDto, sbF.toString(), 1), 4));
    }
}
