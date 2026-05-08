package defpackage;

import android.content.Context;
import com.indeed.android.jobsearch.R;
import com.indeed.android.myjobs.data.model.UserJobStatus;
import com.indeed.android.myjobs.data.model.dto.SavedJobsDto;
import defpackage.lx5;
import defpackage.ude;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class df implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ df(iba ibaVar, g4a g4aVar) {
        this.a = 2;
        this.c = ibaVar;
        this.b = g4aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                jhf jhfVar = (jhf) obj;
                jhfVar.getClass();
                ((g4a) obj3).setValue(jhfVar);
                ((g4a) obj2).setValue(jhfVar.a.b);
                break;
            case 1:
                break;
            case 2:
                String str = (String) obj;
                str.getClass();
                ((g4a) obj3).setValue(str);
                ((iba) obj2).r();
                break;
            case 3:
                lx5.b bVar = (lx5.b) obj;
                w40.l(bVar, "subTabName", "SAVED", "userJobStatus", (String) obj3);
                bVar.a("myjobsPageTk", ie7.Z);
                bVar.a("appTk", (String) obj2);
                break;
            case 4:
                ((pf6) obj3).c.removeCallbacks((tm1) obj2);
                break;
            case 5:
                vde vdeVarI = ((ude) obj3).i();
                ude.c.f0 f0Var = (ude.c.f0) ((ude.c) obj2);
                String str2 = f0Var.a;
                SavedJobsDto savedJobsDto = f0Var.b;
                Context context = f0Var.c;
                str2.getClass();
                savedJobsDto.getClass();
                context.getClass();
                ArrayList arrayList = new ArrayList();
                UserJobStatus userJobStatus = savedJobsDto.getUserJobStatus();
                if (wl7.b(userJobStatus != null ? userJobStatus.getStatus() : null, "POST_APPLY") && savedJobsDto.getIndeedApplyable() && savedJobsDto.getHasApplicationPreview()) {
                    String string = context.getString(R.string.view_and_manage_details);
                    string.getClass();
                    arrayList.add(new fo7(1, string, R.drawable.resume, null, new ude.c.b0(savedJobsDto), 8));
                }
                if (!u63.V(savedJobsDto)) {
                    String string2 = context.getString(R.string.archive);
                    string2.getClass();
                    String string3 = context.getString(R.string.moved_to);
                    string3.getClass();
                    String string4 = context.getString(R.string.archived_tab_name);
                    string4.getClass();
                    arrayList.add(new fo7(2, string2, R.drawable.archive, new ude.b(savedJobsDto, string3, string4), null, 16));
                }
                UserJobStatus userJobStatus2 = savedJobsDto.getUserJobStatus();
                if (wl7.b(userJobStatus2 != null ? userJobStatus2.getStatus() : null, "POST_APPLY") && !savedJobsDto.getHasIaAppId()) {
                    String string5 = context.getString(R.string.move_back_to_saved);
                    string5.getClass();
                    String string6 = context.getString(R.string.moved_to);
                    string6.getClass();
                    String string7 = context.getString(R.string.saved_tab_name);
                    string7.getClass();
                    arrayList.add(new fo7(4, string5, R.drawable.moved_back_to_saved, new ude.a.g(savedJobsDto, string6, string7), null, 16));
                }
                UserJobStatus userJobStatus3 = savedJobsDto.getUserJobStatus();
                boolean zB = wl7.b(userJobStatus3 != null ? userJobStatus3.getStatus() : null, "POST_APPLY");
                String encryptedAdvCandId = savedJobsDto.getEncryptedAdvCandId();
                boolean z = encryptedAdvCandId == null || encryptedAdvCandId.length() == 0;
                boolean withdrawn = savedJobsDto.getWithdrawn();
                boolean jobFraudulent = savedJobsDto.getJobFraudulent();
                boolean zB2 = wl7.b(u63.F(savedJobsDto), "HIRED");
                if (zB && !z && !withdrawn && !jobFraudulent && !zB2) {
                    String string8 = context.getString(R.string.withdraw_button_text);
                    string8.getClass();
                    arrayList.add(new fo7(5, string8, R.drawable.withdraw_moreactions_icon, null, new ude.c.d0(savedJobsDto), 8));
                }
                String string9 = context.getString(R.string.manage_this_job);
                string9.getClass();
                break;
            case 6:
                ((String) obj).getClass();
                ((Function1) obj3).invoke((zie) obj2);
                break;
            case 7:
                iuc iucVar = (iuc) obj3;
                float fFloatValue = iucVar.element - ((Float) obj).floatValue();
                iucVar.element = fFloatValue;
                ((Function1) obj2).invoke(Float.valueOf(fFloatValue));
                break;
            default:
                String str3 = (String) obj;
                str3.getClass();
                ((Function1) obj3).invoke(str3);
                ((gu5) obj2).invoke();
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ df(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
