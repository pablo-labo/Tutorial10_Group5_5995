package defpackage;

import androidx.activity.result.ActivityResult;
import androidx.media3.session.r;
import androidx.media3.session.s;
import androidx.media3.session.x;
import androidx.media3.session.z;
import com.indeed.android.jobsearch.viewjob.a;
import defpackage.e47;
import defpackage.gdb;
import defpackage.jq7;
import defpackage.lt7;
import defpackage.lz8;
import defpackage.mt7;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k91 implements kt7, lz8.a, x.e, wq2, n8 {
    public final /* synthetic */ Object a;

    public /* synthetic */ k91(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.kt7
    public void a(lt7 lt7Var) {
        p91 p91Var = (p91) this.a;
        qf8<Object>[] qf8VarArr = p91.i0;
        lt7Var.getClass();
        p91Var.g0 = false;
        if (lt7Var instanceof lt7.a) {
            ArrayList arrayList = lz2.a;
            lz2.d("BaseIanTabWebViewFragment", "Search Overlay dismissed", false, null);
            return;
        }
        if (!(lt7Var instanceof lt7.b)) {
            l.g();
            return;
        }
        mt7.b bVar = ((lt7.b) lt7Var).a;
        if (bVar == null) {
            l.g();
            return;
        }
        rq7 rq7Var = (rq7) cr8.p(rq7.class);
        lr5 lr5VarU = p91Var.requireActivity().u();
        lr5VarU.getClass();
        rq7Var.f(lr5VarU, mh2.k(p91Var), new jq7.a0(new mt7.b(bVar.b)), null);
    }

    @Override // defpackage.wq2
    public void accept(Object obj) {
        ((e47.a) this.a).c((s83) obj);
    }

    @Override // defpackage.n8
    public void c(Object obj) {
        a aVar = (a) this.a;
        ActivityResult activityResult = (ActivityResult) obj;
        int i = a.H0;
        activityResult.getClass();
        int i2 = activityResult.a;
        if (i2 == -1) {
            ((ua6) aVar.p0.getValue()).b(activityResult.b, new m91(aVar, 16), new bo0(23));
        } else {
            ArrayList arrayList = lz2.a;
            lz2.b("view-job-bottom-sheet", p6.c(i2, "Google SignIn - resultCode "), false, new Throwable(p6.c(i2, "Google SignIn - resultCode ")));
        }
    }

    @Override // androidx.media3.session.x.e
    public Object g(s sVar, r.d dVar, int i) {
        x.b bVar = (x.b) this.a;
        u37 u37Var = u37.b;
        if (sVar.k()) {
            return u37Var;
        }
        bVar.a(sVar.t, dVar);
        x.n1(sVar, dVar, i, new x9e(0));
        return u37Var;
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        ((gdb.c) obj).N(((z) this.a).q);
    }
}
