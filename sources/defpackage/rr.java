package defpackage;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.indeed.android.jobsearch.R;
import com.indeed.android.myjobs.data.model.dto.ConversationDto;
import com.indeed.android.myjobs.data.model.dto.InvitedJobDto;
import defpackage.e9a;
import defpackage.jq7;
import defpackage.kbc;
import defpackage.le0;
import defpackage.rx8;
import defpackage.ude;
import java.util.UUID;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rr implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rr(pif pifVar, le0.c cVar, mhg mhgVar) {
        this.a = 12;
        this.b = cVar;
        this.c = mhgVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gu5
    public final Object invoke() {
        tx8 tx8Var;
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                sr srVar = (sr) obj2;
                bs7 bs7VarF = jsb.f((mt9) obj);
                srVar.close();
                Function2<? super ps7, ? super bs7, j6g> function2 = srVar.h0;
                if (function2 != null) {
                    function2.invoke(ps7.b, bs7VarF);
                }
                break;
            case 1:
                ((Function1) obj2).invoke(((jhf) obj).a.b);
                break;
            case 2:
                ((Function1) obj2).invoke(((hz1) obj).a);
                break;
            case 3:
                hne hneVar = (hne) obj2;
                gu5 gu5Var = (gu5) obj;
                if (hneVar != null) {
                    hneVar.c();
                }
                gu5Var.invoke();
                break;
            case 4:
                ((g4a) obj).setValue(Boolean.FALSE);
                ((gu5) obj2).invoke();
                break;
            case 5:
                ((Function1) obj2).invoke((zba) obj);
                break;
            case 6:
                u47.b((v47) obj2, (gu5) obj);
                break;
            case 7:
                ude udeVar = (ude) obj2;
                Context context = (Context) obj;
                String string = context.getString(R.string.not_seeing_an_interview);
                string.getClass();
                String string2 = context.getString(R.string.interview_tab_dialog_body);
                string2.getClass();
                udeVar.m(new ude.c.a0(string, string2, "app-tracker-interviews-emptytabmodalcta"));
                udeVar.m(new ude.c.s("Interview"));
                break;
            case 8:
                InvitedJobDto invitedJobDto = (InvitedJobDto) obj2;
                Function1 function1 = (Function1) obj;
                Function1<lx5, j6g> function12 = c05.a;
                c05.a.invoke(tx5.k(c05.b, "myjobs_native_screen", "acceptInvitationCardMessageCTA", new mz4(0, invitedJobDto.getInvite().getId(), invitedJobDto.getJob().getKey()), 4));
                ConversationDto conversation = invitedJobDto.getConversation();
                String conversationId = conversation != null ? conversation.getConversationId() : null;
                if (conversationId != null && conversationId.length() != 0) {
                    function1.invoke(conversationId);
                }
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                jq7.f0 f0Var = (jq7.f0) obj2;
                FragmentManager fragmentManager = (FragmentManager) obj;
                g3a<jz2<j6g>> g3aVar = kqg.a;
                String str = f0Var.b;
                String str2 = f0Var.c;
                str.getClass();
                str2.getClass();
                fragmentManager.getClass();
                a aVar = new a(fragmentManager);
                aVar.c("ViewJobFeedBottomSheetFragment");
                UUID.randomUUID().toString().getClass();
                rhc rhcVar = new rhc(str, str2, e9a.a.a(ep5.a.e(), dd4.a.a()));
                kbc.a aVar2 = kbc.p0;
                boolean zK = dd4.k();
                kr krVar = new kr(20);
                aVar2.getClass();
                kbc.a.a("ViewJobFeed", rhcVar, "rn-view-job-feed", 1.0d, zK, krVar).K(aVar, "ViewJobFeedBottomSheetFragment");
                break;
            case 10:
                ((Function1) obj2).invoke(((it9) obj).a);
                break;
            case 11:
                ((Function1) obj2).invoke((String) obj);
                break;
            case 12:
                mhg mhgVar = (mhg) obj;
                rx8 rx8Var = (rx8) ((le0.c) obj2).a;
                if (rx8Var instanceof rx8.b) {
                    tx8 tx8Var2 = ((rx8.b) rx8Var).c;
                    if (tx8Var2 != null) {
                        tx8Var2.a(rx8Var);
                    } else {
                        try {
                            mhgVar.a(((rx8.b) rx8Var).a);
                            break;
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                } else if ((rx8Var instanceof rx8.a) && (tx8Var = ((rx8.a) rx8Var).c) != null) {
                    tx8Var.a(rx8Var);
                }
                break;
            default:
                fnf fnfVar = (fnf) obj2;
                fnfVar.g();
                u63.Y(ee3.p(fnfVar), null, null, new enf((Function2) obj, fnfVar, null), 3);
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ rr(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
