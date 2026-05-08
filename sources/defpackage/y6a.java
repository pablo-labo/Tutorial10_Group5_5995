package defpackage;

import com.indeed.android.myjobs.data.model.dto.EmployerInvitationDto;
import com.indeed.android.myjobs.data.model.dto.InvitedJobDto;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.MyJobsScreenKt$MyJobsScreen$10$1", f = "MyJobsScreen.kt", l = {387}, m = "invokeSuspend")
public final class y6a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ an7 $invitationsState;
    final /* synthetic */ boolean $isFirstOpen;
    final /* synthetic */ e2b $pagerState;
    final /* synthetic */ g4a<j7f> $selectedFilter$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6a(boolean z, an7 an7Var, e2b e2bVar, g4a<j7f> g4aVar, lu2<? super y6a> lu2Var) {
        super(2, lu2Var);
        this.$isFirstOpen = z;
        this.$invitationsState = an7Var;
        this.$pagerState = e2bVar;
        this.$selectedFilter$delegate = g4aVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new y6a(this.$isFirstOpen, this.$invitationsState, this.$pagerState, this.$selectedFilter$delegate, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((y6a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        EmployerInvitationDto employerInvitationDto;
        List<InvitedJobDto> invitedJobs;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            if (this.$isFirstOpen && i6a.e().a >= 3 && (employerInvitationDto = this.$invitationsState.a) != null && (invitedJobs = employerInvitationDto.getInvitedJobs()) != null && (!invitedJobs.isEmpty())) {
                e2b e2bVar = this.$pagerState;
                this.label = 1;
                Object objF = e2bVar.f(1, zd0.c(0.0f, null, 7), this);
                g13 g13Var = g13.a;
                if (objF == g13Var) {
                    return g13Var;
                }
            }
            return j6g.a;
        }
        if (i != 1) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        this.$selectedFilter$delegate.setValue(j7f.b);
        return j6g.a;
    }
}
