package defpackage;

import androidx.fragment.app.g;
import com.indeed.android.myjobs.data.model.dto.InvitedJobDto;
import defpackage.jq7;
import defpackage.n76;
import defpackage.sp7;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oa0 implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oa0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        int i2 = 3;
        String str = null;
        byte b = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                sa0 sa0Var = (sa0) obj2;
                me meVar = sa0Var.f;
                nv nvVar = new nv((zcf) obj, 1);
                luc lucVar = new luc();
                sa0Var.e.d("dataBuilder", meVar, new x9(i2, lucVar, nvVar, false));
                T t = lucVar.element;
                if (t != 0) {
                    return (ycf) t;
                }
                wl7.g("result");
                throw null;
            case 1:
                u63.Y((e13) obj2, null, null, new bx4((gu5) obj, null), 3);
                return j6g.a;
            case 2:
                u63.Y((e13) obj2, null, null, new n76.b((Function1) obj, null), 3);
                return j6g.a;
            case 3:
                ((gu5) obj2).invoke();
                ((tp7) cr8.p(tp7.class)).b(new sp7.h(12, "messagingArchiveSpamFilterBanner", "", null));
                ((Function1) obj).invoke(w47.DRAFTS);
                return j6g.a;
            case 4:
                g gVar = (g) obj2;
                iba ibaVar = (iba) obj;
                if (gVar != null) {
                    Function1<lx5, j6g> function1 = c05.a;
                    c05.b("MyJobs/Interviews/Zrp", new gb(i2));
                    rq7 rq7Var = (rq7) cr8.p(rq7.class);
                    lr5 lr5VarU = gVar.u();
                    lr5VarU.getClass();
                    rq7Var.f(lr5VarU, ibaVar, new jq7.l(str, (hq7) (b == true ? 1 : 0), 7), "MyJobs/Interviews/Zrp");
                }
                return j6g.a;
            default:
                ((Function1) obj2).invoke((InvitedJobDto) obj);
                return j6g.a;
        }
    }
}
