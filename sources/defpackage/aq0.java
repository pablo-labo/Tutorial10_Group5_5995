package defpackage;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.g;
import com.indeed.android.jobsearch.R;
import com.indeed.android.messaging.data.conversations.ConversationRecord;
import com.indeed.android.myjobs.data.model.dto.SavedJobsDto;
import defpackage.fr0;
import defpackage.ns7;
import defpackage.ude;
import defpackage.ur7;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class aq0 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ aq0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((fr0) obj2).r(new fr0.b.l(((SavedJobsDto) obj).getJobkey()));
                break;
            case 1:
                ((Function1) obj2).invoke((ConversationRecord) obj);
                break;
            case 2:
                ((bj4) obj2).Q(ps7.b, jsb.r((lu0) obj));
                break;
            case 3:
                ((Function1) obj2).invoke(kcf.c);
                ((Function1) obj).invoke(new jhf("", 0L, 6));
                break;
            case 4:
                ka2.H((String) obj2, false, false, (FragmentManager) obj);
                break;
            case 5:
                ((ra9) obj2).a((String[]) obj);
                break;
            case 6:
                ((Function1) obj2).invoke(((j2h) obj).a);
                break;
            case 7:
                vr7 vr7Var = (vr7) cr8.p(vr7.class);
                lr5 lr5VarU = ((g) obj2).u();
                lr5VarU.getClass();
                vr7Var.e(lr5VarU, "ProfileUIPlatformDebugScreen", new ns7.b(new qr7("AI CERTIFICATION", new sr7(new rr7(ds7.a, 2024), Boolean.TRUE, null), "AI DESCRIPTION"), new xd((wu5) obj, 15)), ur7.b.a);
                break;
            default:
                ude udeVar = (ude) obj2;
                Context context = (Context) obj;
                String string = context.getString(R.string.not_seeing_a_job);
                string.getClass();
                String string2 = context.getString(R.string.saved_tab_dialog_body);
                string2.getClass();
                udeVar.m(new ude.c.a0(string, string2, "app-tracker-saved-emptytabmodalcta"));
                udeVar.m(new ude.c.s("Saved"));
                break;
        }
        return j6g.a;
    }
}
