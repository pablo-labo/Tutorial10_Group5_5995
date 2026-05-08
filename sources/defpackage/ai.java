package defpackage;

import com.indeed.android.myjobs.data.model.dto.InvitedJobDto;
import com.indeed.android.myjobs.data.model.dto.SavedJobsDto;
import com.indeed.android.profile.screens.sheets.profilesubtab.links.a;
import defpackage.pld;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ai implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ai(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        ps7 ps7Var = ps7.b;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                bi biVar = (bi) obj2;
                tr7 tr7VarQ = jsb.q((go4) obj);
                biVar.close();
                Function2<? super ps7, ? super tr7, j6g> function2 = biVar.h0;
                if (function2 != null) {
                    function2.invoke(ps7Var, tr7VarQ);
                }
                return j6g.a;
            case 1:
                ((g4a) obj).setValue((String) obj2);
                return j6g.a;
            case 2:
                ((g4a) obj).setValue(Boolean.FALSE);
                ((gu5) obj2).invoke();
                return j6g.a;
            case 3:
                ((a) obj2).Q(ps7Var, new zr7((String) obj));
                return j6g.a;
            case 4:
                bn7 bn7Var = (bn7) obj2;
                String id = ((InvitedJobDto) obj).getInvite().getId();
                id.getClass();
                u63.Y(ee3.p(bn7Var), null, null, new hn7(bn7Var, id, null), 3);
                return j6g.a;
            case 5:
                ((Function1) obj2).invoke((String) obj);
                return j6g.a;
            case 6:
                ((gu5) obj2).invoke();
                ((gu5) obj).invoke();
                return j6g.a;
            case 7:
                return x7b.l((x7b) obj2, (rc3) obj);
            default:
                ((pld) obj2).q(new pld.c.j(((SavedJobsDto) obj).getJobkey()));
                return j6g.a;
        }
    }
}
