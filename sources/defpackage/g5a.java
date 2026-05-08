package defpackage;

import com.indeed.android.myjobs.data.model.UserJobStatus;
import com.indeed.android.myjobs.data.model.dto.SavedJobsDto;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class g5a {
    public static mkd a(SavedJobsDto savedJobsDto) {
        b78 b78Var;
        b78 b78Var2;
        savedJobsDto.getClass();
        UserJobStatus candidateStatus = savedJobsDto.getCandidateStatus();
        b78 b78VarB = candidateStatus != null ? b(candidateStatus) : null;
        UserJobStatus selfReportedStatus = savedJobsDto.getSelfReportedStatus();
        b78 b78VarB2 = selfReportedStatus != null ? b(selfReportedStatus) : null;
        UserJobStatus userJobStatus = savedJobsDto.getUserJobStatus();
        b78 b78VarB3 = userJobStatus != null ? b(userJobStatus) : null;
        String jobkey = savedJobsDto.getJobkey();
        long applyTime = savedJobsDto.getApplyTime();
        boolean zIsJobExpired = savedJobsDto.isJobExpired();
        c78 c78Var = new c78(b78VarB, b78VarB2, b78VarB3);
        UserJobStatus selfReportedStatus2 = savedJobsDto.getSelfReportedStatus();
        UserJobStatus userJobStatus2 = savedJobsDto.getUserJobStatus();
        UserJobStatus candidateStatus2 = savedJobsDto.getCandidateStatus();
        long applyTime2 = savedJobsDto.getApplyTime();
        if (selfReportedStatus2 != null) {
            b78Var2 = b(selfReportedStatus2);
        } else if (userJobStatus2 != null) {
            b78Var2 = b(userJobStatus2);
        } else {
            b78 b78VarB4 = candidateStatus2 != null ? b(candidateStatus2) : null;
            if (b78VarB4 != null) {
                b78Var = b78VarB4;
                return new mkd(jobkey, applyTime, zIsJobExpired, c78Var, b78Var, savedJobsDto.getWithdrawn());
            }
            b78Var2 = new b78("SAVED", applyTime2);
        }
        b78Var = b78Var2;
        return new mkd(jobkey, applyTime, zIsJobExpired, c78Var, b78Var, savedJobsDto.getWithdrawn());
    }

    public static b78 b(UserJobStatus userJobStatus) {
        String status = userJobStatus.getStatus();
        Locale locale = Locale.US;
        locale.getClass();
        String upperCase = status.toUpperCase(locale);
        upperCase.getClass();
        return new b78(upperCase, userJobStatus.getTimestamp());
    }
}
