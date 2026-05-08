package defpackage;

import android.content.Context;
import defpackage.s87;
import defpackage.xh8;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class cya implements xh8 {
    public final Lazy V;
    public final d2f W;
    public final y03 a;
    public final Lazy b;
    public final tx5 c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;

    @uh3(c = "com.indeed.android.jobsearch.pulse.PULSEngine$handleNewSignIn$1", f = "PULSEngine.kt", l = {59}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        public a(lu2<? super a> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return cya.this.new a(lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) throws Throwable {
            qpd qpdVarD;
            qpd qpdVarD2;
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                il0 il0Var = il0.a;
                this.label = 1;
                Object objI = il0Var.i(this);
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
            ArrayList arrayList = lz2.a;
            lz2.d("PULSEngine", "registerDeviceTokenWithIndeed after login", false, null);
            f97 f97Var = (f97) cya.this.V.getValue();
            xh8 xh8Var = cya.this;
            if (xh8Var instanceof ai8) {
                qpdVarD = ((ai8) xh8Var).d();
            } else {
                xh8Var.getClass();
                qpdVarD = (qpd) xh8.a.a().a.b;
            }
            Context context = (Context) qpdVarD.a(null, fwc.a.b(Context.class), null);
            f97Var.getClass();
            String strA = f97.a(context);
            f97 f97Var2 = (f97) cya.this.V.getValue();
            xh8 xh8Var2 = cya.this;
            if (xh8Var2 instanceof ai8) {
                qpdVarD2 = ((ai8) xh8Var2).d();
            } else {
                xh8Var2.getClass();
                qpdVarD2 = (qpd) xh8.a.a().a.b;
            }
            f97Var2.b((Context) qpdVarD2.a(null, fwc.a.b(Context.class), null), strA, true);
            return j6g.a;
        }
    }

    public cya(int i) {
        eq3 eq3Var = a74.a;
        no3 no3Var = no3.c;
        no3Var.getClass();
        this.a = no3Var;
        eya eyaVar = new eya(this);
        qt8 qt8Var = qt8.a;
        this.b = boa.E(qt8Var, eyaVar);
        this.c = new tx5();
        this.d = boa.E(qt8Var, new fya(this));
        this.e = boa.E(qt8Var, new gya(this));
        this.f = boa.E(qt8Var, new hya(this));
        this.V = boa.E(qt8Var, new iya(this));
        this.W = new d2f(new vv(this, 16));
    }

    public final void a() {
        Lazy<s87> lazy = s87.f;
        s87.a.a((gz4) this.b.getValue(), new lx5("navigation_sign_in", "navigation", "signIn", 1, this.c.a, uy5.b));
        ((gme) ((cp7) this.d.getValue()).a).setValue(Boolean.TRUE);
        bu8 bu8Var = bu8.a;
        bu8Var.k(true);
        bu8.G0.b(bu8.b[44], bu8Var, Boolean.FALSE);
        il0.a.getClass();
        il0.V.set(hh1.e());
        u63.Y((e13) this.W.getValue(), null, null, new a(null), 3);
        ((v49) this.e.getValue()).c();
        ((fpb) this.f.getValue()).b(zob.SignIn);
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    public cya() {
        this(0);
    }
}
