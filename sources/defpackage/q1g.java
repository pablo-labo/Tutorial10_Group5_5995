package defpackage;

import android.app.Activity;
import androidx.fragment.app.a;
import com.indeed.android.jobsearch.BuildConfig;
import defpackage.cd4;
import defpackage.xh8;

/* JADX INFO: loaded from: classes2.dex */
public final class q1g implements p1g, xh8 {
    public final g3a<jz2<Boolean>> a = new g3a<>();

    @Override // defpackage.p1g
    public final boolean a() {
        bu8 bu8Var = bu8.a;
        bu8Var.getClass();
        cu8 cu8Var = bu8.E0;
        qf8<Object>[] qf8VarArr = bu8.b;
        String str = (String) cu8Var.a(qf8VarArr[42], bu8Var);
        dd4 dd4Var = dd4.a;
        ad4 ad4Var = dd4.n().a;
        ad4Var.getClass();
        boolean z = ad4Var.e(cd4.a.h0) == cd4.b0.a.getValue();
        if (!BuildConfig.VERSION_NAME.equals(str)) {
            cu8Var.b(qf8VarArr[42], bu8Var, BuildConfig.VERSION_NAME);
            bu8.C0.e(qf8VarArr[40], bu8Var, 0);
        }
        g3a<jz2<Boolean>> g3aVar = this.a;
        if (z) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            gg1 gg1Var = bu8.D0;
            if (jCurrentTimeMillis - ((Number) gg1Var.a(qf8VarArr[41], bu8Var)).longValue() > 172800000) {
                z zVar = bu8.C0;
                if (((Number) zVar.d(qf8VarArr[40], bu8Var)).intValue() < 4 && bu8Var.i()) {
                    gg1Var.b(qf8VarArr[41], bu8Var, Long.valueOf(System.currentTimeMillis()));
                    zVar.e(qf8VarArr[40], bu8Var, Integer.valueOf(((Number) zVar.d(qf8VarArr[40], bu8Var)).intValue() + 1));
                    g3aVar.k(new jz2<>(Boolean.TRUE));
                    return true;
                }
            }
        }
        g3aVar.k(new jz2<>(Boolean.FALSE));
        return false;
    }

    @Override // defpackage.p1g
    public final boolean b(Activity activity, lr5 lr5Var) {
        activity.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        bu8 bu8Var = bu8.a;
        bu8Var.getClass();
        if (jCurrentTimeMillis - ((Number) bu8.i0.a(bu8.b[18], bu8Var)).longValue() < 2592000000L || bu8Var.c() < 20) {
            return false;
        }
        if (activity.isFinishing()) {
            ((np7) cr8.p(np7.class)).c("UIPHomepageDialogsImpl", "Activity is finishing, not showing prompt", false, new g8());
            return false;
        }
        pm0 pm0Var = new pm0();
        a aVar = new a(lr5Var);
        aVar.d(0, pm0Var, "AppRatingPromptFragment", 1);
        aVar.h(true);
        return true;
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
