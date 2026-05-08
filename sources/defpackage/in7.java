package defpackage;

import com.indeed.android.myjobs.data.model.ServiceResultResponse;
import com.indeed.android.myjobs.data.model.dto.InvitedJobDto;
import defpackage.hf3;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.presentation.tabs.InvitationTabViewModel$submitDeclineSurveyInBackground$1", f = "InvitationTabViewModel.kt", l = {247, 249}, m = "invokeSuspend")
public final class in7 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ String $comment;
    final /* synthetic */ InvitedJobDto $invitedJob;
    final /* synthetic */ String $selectedReason;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ bn7 this$0;

    public static final class a<T> implements wi5 {
        public final /* synthetic */ InvitedJobDto a;
        public final /* synthetic */ String b;

        public a(InvitedJobDto invitedJobDto, String str) {
            this.a = invitedJobDto;
            this.b = str;
        }

        @Override // defpackage.wi5
        public final Object a(Object obj, lu2 lu2Var) {
            hf3 hf3Var = (hf3) obj;
            if (hf3Var instanceof hf3.c) {
                if (wl7.b(((ServiceResultResponse) ((hf3.c) hf3Var).a).getServiceResult().getStatusCode(), "OK")) {
                    Function1<lx5, j6g> function1 = c05.a;
                    InvitedJobDto invitedJobDto = this.a;
                    c05.a.invoke(tx5.k(c05.b, "myjobs_native_screen", "submitInvitationDeclineSurvey", new tq3(1, invitedJobDto.getInvite().getId(), invitedJobDto.getJob().getKey(), this.b), 4));
                }
            } else if (hf3Var instanceof hf3.a) {
                ArrayList arrayList = lz2.a;
                w40.n("Post Decline survey api failed ", "InvitationTabViewModel", "Post Decline survey api failed ", false);
            } else if (!(hf3Var instanceof hf3.b)) {
                l.g();
                return null;
            }
            return j6g.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public in7(String str, InvitedJobDto invitedJobDto, String str2, bn7 bn7Var, lu2<? super in7> lu2Var) {
        super(2, lu2Var);
        this.$selectedReason = str;
        this.$invitedJob = invitedJobDto;
        this.$comment = str2;
        this.this$0 = bn7Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new in7(this.$selectedReason, this.$invitedJob, this.$comment, this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((in7) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e9, code lost:
    
        if (((defpackage.vi5) r1).e(r3, r23) == r5) goto L41;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.in7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
