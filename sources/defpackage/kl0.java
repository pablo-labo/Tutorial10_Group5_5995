package defpackage;

import com.indeed.android.jobsearch.util.AppStartupTimes;
import defpackage.xh8;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;
import org.koin.core.error.NoBeanDefFoundException;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.passport.AppInitValuesHolder$sync$2$1", f = "AppInitValuesHolder.kt", l = {79}, m = "invokeSuspend")
public final class kl0 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    @uh3(c = "com.indeed.android.jobsearch.passport.AppInitValuesHolder$sync$2$1$1", f = "AppInitValuesHolder.kt", l = {77}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(2, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) throws NoBeanDefFoundException {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                il0 il0Var = il0.a;
                this.label = 1;
                Object objG = il0Var.g(this);
                g13 g13Var = g13.a;
                if (objG == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.jobsearch.passport.AppInitValuesHolder$sync$2$1$2", f = "AppInitValuesHolder.kt", l = {78}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new b(2, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            qpd qpdVarD;
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                xh8 xh8Var = il0.a;
                if (xh8Var instanceof ai8) {
                    qpdVarD = ((ai8) xh8Var).d();
                } else {
                    xh8Var.getClass();
                    qpdVarD = (qpd) xh8.a.a().a.b;
                }
                yba ybaVar = (yba) qpdVarD.a(null, fwc.a.b(yba.class), null);
                mz mzVar = new mz(1);
                this.label = 1;
                Object objH = yba.h(ybaVar, mzVar, null, this, 2);
                g13 g13Var = g13.a;
                if (objH == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            return j6g.a;
        }
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        kl0 kl0Var = new kl0(2, lu2Var);
        kl0Var.L$0 = obj;
        return kl0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((kl0) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        e13 e13Var = (e13) this.L$0;
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            AppStartupTimes appStartupTimes = AppStartupTimes.a;
            AppStartupTimes.a("init_values_sync_started");
            ArrayList arrayListI0 = ut0.i0(new xr3[]{u63.l(e13Var, null, new a(2, null), 3), u63.l(e13Var, null, new b(2, null), 3)});
            this.L$0 = null;
            this.label = 1;
            Object objI = ka2.i(arrayListI0, this);
            g13 g13Var = g13.a;
            if (objI == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
        }
        AppStartupTimes appStartupTimes2 = AppStartupTimes.a;
        AppStartupTimes.a("init_values_synced");
        AppStartupTimes.b();
        xd2<j6g> xd2Var = il0.V.get();
        j6g j6gVar = j6g.a;
        xd2Var.j0(j6gVar);
        return j6gVar;
    }
}
