package defpackage;

import com.indeed.android.myjobs.data.model.dto.SavedJobsDto;
import defpackage.fr0;
import defpackage.k4e;
import defpackage.sp7;
import defpackage.us7;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zp0 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zp0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        ps7 ps7Var = ps7.b;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((fr0) obj2).r(new fr0.b.m(((SavedJobsDto) obj).getJobkey()));
                return j6g.a;
            case 1:
                ((al4) obj2).Q(ps7Var, jsb.h((n5b) obj));
                return j6g.a;
            case 2:
                ((tl4) obj2).Q(ps7Var, jsb.i((p6c) obj));
                return j6g.a;
            case 3:
                ((Function1) obj2).invoke((String) obj);
                return j6g.a;
            case 4:
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-tab", "upload-resume", null, null, 12));
                ((ra9) obj2).a((String[]) obj);
                return j6g.a;
            case 5:
                ((Function1) obj2).invoke(((ux8) obj).a);
                return j6g.a;
            case 6:
                j4e j4eVar = (j4e) obj2;
                long j = ((th7) ((g4a) obj).getValue()).a;
                p2e p2eVarG = j4eVar.g();
                long jB = 9205357640488583168L;
                if (p2eVarG != null) {
                    jf6 jf6VarF = j4eVar.f();
                    int i2 = jf6VarF == null ? -1 : k4e.a.a[jf6VarF.ordinal()];
                    if (i2 != -1) {
                        if (i2 == 1) {
                            jB = k4e.b(j4eVar, j, p2eVarG.a);
                        } else {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    l.g();
                                    return null;
                                }
                                r6.g("SelectionContainer does not support cursor");
                                return null;
                            }
                            jB = k4e.b(j4eVar, j, p2eVarG.b);
                        }
                    }
                }
                return new ooa(jB);
            default:
                g1h g1hVar = (g1h) obj;
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-preferences-tab-edit-work-areas-preference", "save-work-areas-preference", null, null, 12));
                List<sjb> list = (List) obj2;
                ArrayList arrayList = new ArrayList(t92.r0(list, 10));
                for (sjb sjbVar : list) {
                    sjbVar.getClass();
                    arrayList.add(new us7.a(sjbVar.a, sjbVar.b));
                }
                us7 us7Var = new us7(z92.E1(arrayList));
                g1hVar.close();
                Function2<? super hs7, ? super us7, j6g> function2 = g1hVar.g0;
                if (function2 != null) {
                    function2.invoke(hs7.a, us7Var);
                }
                return j6g.a;
        }
    }
}
