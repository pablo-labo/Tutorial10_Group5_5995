package defpackage;

import com.indeed.android.myjobs.data.model.dto.InvitedJobDto;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
@uh3(c = "com.indeed.android.myjobs.data.repository.JobsLocalRepositoryImpl$fetchFilteredInvitations$1", f = "JobsLocalRepositoryImpl.kt", l = {}, m = "invokeSuspend")
public final class g88 extends c1f implements wu5<List<? extends InvitedJobDto>, Long, lu2<? super List<? extends InvitedJobDto>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ h88 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g88(h88 h88Var, lu2<? super g88> lu2Var) {
        super(3, lu2Var);
        this.this$0 = h88Var;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        String upperCase;
        List list = (List) this.L$0;
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        this.this$0.getClass();
        Set setG = h88.G();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            InvitedJobDto invitedJobDto = (InvitedJobDto) obj2;
            String status = invitedJobDto.getInvite().getStatus();
            if (status != null) {
                upperCase = status.toUpperCase(Locale.ROOT);
                upperCase.getClass();
            } else {
                upperCase = null;
            }
            if (wl7.b(upperCase, "INTERESTED") || (wl7.b(upperCase, "INITIATED") && !setG.contains(invitedJobDto.getInvite().getId()))) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    @Override // defpackage.wu5
    public final Object q(List<? extends InvitedJobDto> list, Long l, lu2<? super List<? extends InvitedJobDto>> lu2Var) {
        l.longValue();
        g88 g88Var = new g88(this.this$0, lu2Var);
        g88Var.L$0 = list;
        return g88Var.invokeSuspend(j6g.a);
    }
}
