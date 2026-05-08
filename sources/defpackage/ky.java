package defpackage;

import androidx.fragment.app.FragmentManager;
import com.indeed.android.myjobs.data.model.dto.SavedJobsDto;
import defpackage.e9a;
import defpackage.fr0;
import defpackage.pld;
import defpackage.wo0;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ky implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ky(int i, Object obj, Object obj2) {
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
                ((iba) obj2).p("TIME_PERIOD");
                ((g4a) obj).setValue(null);
                break;
            case 1:
                u63.Y((e13) obj2, null, null, new wo0.a((hw9) obj, null), 3);
                break;
            case 2:
                ((fr0) obj2).r(new fr0.b.k(((SavedJobsDto) obj).getJobkey()));
                break;
            case 3:
                gu5 gu5Var = (gu5) obj;
                if (!((iba) obj2).r()) {
                    gu5Var.invoke();
                }
                break;
            case 4:
                i1g i1gVar = (i1g) cr8.p(i1g.class);
                kdc kdcVar = new kdc();
                kdcVar.setArguments(aq1.a(new Pair("interview-prep-props", e9a.a.a(null, null).toBundle()), new Pair("from", (String) obj)));
                i1gVar.e((FragmentManager) obj2, kdcVar);
                break;
            default:
                ((pld) obj2).q(new pld.c.k(((SavedJobsDto) obj).getJobkey()));
                break;
        }
        return j6g.a;
    }
}
