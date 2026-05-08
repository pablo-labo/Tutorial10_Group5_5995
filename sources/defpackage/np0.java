package defpackage;

import com.indeed.android.myjobs.data.model.dto.SavedJobsDto;
import defpackage.fr0;
import defpackage.ls7;
import defpackage.pld;
import defpackage.sp7;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class np0 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ np0(int i, Object obj, Object obj2) {
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
                ((fr0) obj2).r(new fr0.b.f(((SavedJobsDto) obj).getJobkey()));
                break;
            case 1:
                ((Function1) obj2).invoke((String) obj);
                break;
            case 2:
                ((gu5) obj2).invoke();
                ((gu5) obj).invoke();
                qm4.b(in4.c, "");
                break;
            case 3:
                ((Function1) obj2).invoke(new ib1(3, (gu5) obj));
                qa9.b(ca9.b, "");
                break;
            case 4:
                u63.Y((e13) obj2, null, null, new tja((hw9) obj, null), 3);
                break;
            case 5:
                ((Function1) obj2).invoke(((n5b) obj).a);
                break;
            case 6:
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-files-tab", "upload-resume", null, null, 12));
                ((ra9) obj2).a((String[]) obj);
                break;
            case 7:
                ((izc) obj2).Q(hs7.a, new ls7((List) obj, ls7.a.c));
                break;
            case 8:
                ((pld) obj2).q(new pld.c.j(((SavedJobsDto) obj).getJobkey()));
                break;
            default:
                ((Function1) obj2).invoke((List) ((g4a) obj).getValue());
                break;
        }
        return j6g.a;
    }
}
