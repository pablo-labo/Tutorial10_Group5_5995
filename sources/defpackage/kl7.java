package defpackage;

import com.indeed.android.myjobs.data.model.dto.InterviewJobsDto;
import defpackage.lx5;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class kl7 implements Function1<lx5.b, j6g> {
    public final /* synthetic */ InterviewJobsDto a;

    public kl7(InterviewJobsDto interviewJobsDto) {
        this.a = interviewJobsDto;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(lx5.b bVar) {
        lx5.b bVar2 = bVar;
        bVar2.getClass();
        String str = (String) z92.Q0(this.a.getMostLikelySuids());
        if (str != null) {
            bVar2.a("jobOccupationMostRelevant", str);
        }
        return j6g.a;
    }
}
