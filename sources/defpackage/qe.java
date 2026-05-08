package defpackage;

import android.content.Context;
import android.content.Intent;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.indeed.android.myjobs.data.model.dto.ConversationDto;
import com.indeed.android.myjobs.data.model.dto.InvitedJobDto;
import com.indeed.android.myjobs.data.model.dto.SavedJobsDto;
import com.indeed.android.rnprofile.RNProfileModalNativeModule;
import defpackage.aq3;
import defpackage.nq7;
import defpackage.oq7;
import defpackage.pld;
import defpackage.sp7;
import defpackage.vk7;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qe implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qe(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        ps7 ps7Var = ps7.b;
        int i2 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                re reVar = (re) obj2;
                hz1 hz1Var = (hz1) obj;
                hz1Var.getClass();
                String str = hz1Var.b;
                ig3 ig3Var = hz1Var.c;
                qr7 qr7Var = new qr7(str, ig3Var != null ? jsb.d(ig3Var) : null, hz1Var.d);
                reVar.close();
                Function2<? super ps7, ? super qr7, j6g> function2 = reVar.j0;
                if (function2 != null) {
                    if (reVar.k0) {
                        ps7Var = ps7.a;
                    }
                    function2.invoke(ps7Var, qr7Var);
                }
                break;
            case 1:
                ((iba) obj2).p("TIME_PERIOD");
                ((g4a) obj).setValue("");
                break;
            case 2:
                vw vwVar = (vw) obj2;
                qs7 qs7VarJ = jsb.j((zie) obj);
                vwVar.close();
                Function2<? super ps7, ? super qs7, j6g> function22 = vwVar.j0;
                if (function22 != null) {
                    function22.invoke(ps7Var, qs7VarJ);
                }
                break;
            case 3:
                u63.Y((e13) obj2, null, null, new uo0((hw9) obj, null), 3);
                break;
            case 4:
                ((g4a) obj2).setValue("");
                ((v2a) obj).m(0.0d);
                break;
            case 5:
                ((gu5) obj2).invoke();
                ((tp7) cr8.p(tp7.class)).b(new sp7.h(12, "messagingArchiveSpamFilterBanner", "messagingArchiveSpamFilterBannerSpamButton", null));
                ((Function1) obj).invoke(w47.SPAM);
                break;
            case 6:
                c05.a.invoke(tx5.k(c05.b, "myjobs_native_screen", "interviewPrepCTADismiss", new oz4((String) obj2, i2), 4));
                ((kq7) cr8.p(kq7.class)).i(System.currentTimeMillis(), "interview_prep", "banner_dismissed");
                ((g4a) obj).setValue(Boolean.FALSE);
                break;
            case 7:
                u63.Y((e13) obj2, null, null, new vk7.a((e8a) obj, null), 3);
                break;
            case 8:
                InvitedJobDto invitedJobDto = (InvitedJobDto) obj2;
                Function1 function1 = (Function1) obj;
                Function1<lx5, j6g> function12 = c05.a;
                c05.a.invoke(tx5.k(c05.b, "myjobs_native_screen", "invitationCard", new nz4(invitedJobDto.getInvite().getId(), invitedJobDto.getJob().getKey(), i2), 4));
                ConversationDto conversation = invitedJobDto.getConversation();
                String conversationId = conversation != null ? conversation.getConversationId() : null;
                if (conversationId != null && conversationId.length() != 0) {
                    function1.invoke(conversationId);
                }
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                gu5 gu5Var = (gu5) obj;
                Function1<oq7.i, j6g> function13 = ((nq7.h) ((nq7) obj2)).b;
                aq3.a aVar = aq3.Companion;
                function13.invoke(new oq7.i());
                if (gu5Var != null) {
                    gu5Var.invoke();
                }
                RNProfileModalNativeModule.INSTANCE.getClass();
                RNProfileModalNativeModule.onHideModalCallback = gu5Var;
                break;
            case 10:
                ((Context) obj2).startActivity((Intent) obj);
                break;
            case 11:
                ((gu5) obj2).invoke();
                ((gu5) obj).invoke();
                break;
            case 12:
                break;
            case 13:
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-files-tab", "upload-resume", null, null, 12));
                ((ra9) obj2).a((String[]) obj);
                break;
            default:
                ((pld) obj2).q(new pld.c.k(((SavedJobsDto) obj).getJobkey()));
                break;
        }
        return j6g.a;
    }
}
