package defpackage;

import android.os.Handler;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.media3.session.r;
import androidx.media3.session.s;
import androidx.media3.session.x;
import androidx.navigation.e;
import com.indeed.android.jobsearch.tare.nav.a;
import defpackage.aq3;
import defpackage.jq7;
import defpackage.lt7;
import defpackage.nq7;
import defpackage.oq7;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class tq7 implements kt7, wu0 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tq7(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // defpackage.kt7
    public void a(lt7 lt7Var) throws Exception {
        nq7 nq7Var = (nq7) this.a;
        FragmentManager fragmentManager = (FragmentManager) this.b;
        a aVar = (a) this.c;
        lt7Var.getClass();
        if (lt7Var instanceof lt7.a) {
            wi wiVar = ((nq7.j) nq7Var).b;
            aq3.a aVar2 = aq3.Companion;
            wiVar.invoke(new oq7.k());
        } else {
            if (!(lt7Var instanceof lt7.b)) {
                l.g();
                return;
            }
            List<Fragment> listF = fragmentManager.c.f();
            listF.getClass();
            Fragment fragment = (Fragment) z92.Q0(listF);
            e eVarK = fragment != null ? mh2.k(fragment) : null;
            if (eVarK != null) {
                aVar.f(fragmentManager, eVarK, new jq7.a0(((lt7.b) lt7Var).a), null);
            }
            wi wiVar2 = ((nq7.j) nq7Var).b;
            aq3.a aVar3 = aq3.Companion;
            wiVar2.invoke(new oq7.k());
        }
    }

    @Override // defpackage.wu0
    public hz8 apply(Object obj) {
        final s sVar = (s) this.a;
        final r.d dVar = (r.d) this.b;
        final x.c cVar = (x.c) this.c;
        final List list = (List) obj;
        Handler handler = sVar.l;
        ph1 ph1Var = new ph1(sVar, dVar, new Runnable() { // from class: dm9
            @Override // java.lang.Runnable
            public final void run() {
                s sVar2 = sVar;
                if (sVar2.k()) {
                    return;
                }
                cVar.c(sVar2.t, dVar, list);
            }
        });
        x9e x9eVar = new x9e(0);
        String str = vjg.a;
        ebe ebeVar = new ebe();
        vjg.T(handler, new odc(1, ebeVar, ph1Var, x9eVar));
        return ebeVar;
    }
}
