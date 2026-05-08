package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3", f = "AndroidPlatformTextInputSession.android.kt", l = {184}, m = "invokeSuspend")
public final class t80 extends c1f implements Function2<af7, lu2<?>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ u80 this$0;

    public static final class a extends mj8 implements Function1<Throwable, j6g> {
        final /* synthetic */ af7 $methodSession;
        final /* synthetic */ u80 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(af7 af7Var, u80 u80Var) {
            super(1);
            this.$methodSession = af7Var;
            this.this$0 = u80Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(Throwable th) {
            af7 af7Var = this.$methodSession;
            synchronized (af7Var.c) {
                try {
                    af7Var.e = true;
                    j4a<qug<pma>> j4aVar = af7Var.d;
                    qug<pma>[] qugVarArr = j4aVar.a;
                    int i = j4aVar.c;
                    for (int i2 = 0; i2 < i; i2++) {
                        pma pmaVar = qugVarArr[i2].get();
                        if (pmaVar != null) {
                            pmaVar.a();
                        }
                    }
                    af7Var.d.g();
                    j6g j6gVar = j6g.a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            rhf rhfVar = this.this$0.b;
            rhfVar.b.set(null);
            rhfVar.a.c();
            return j6g.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t80(u80 u80Var, lu2<? super t80> lu2Var) {
        super(2, lu2Var);
        this.this$0 = u80Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        t80 t80Var = new t80(this.this$0, lu2Var);
        t80Var.L$0 = obj;
        return t80Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(af7 af7Var, lu2<?> lu2Var) throws Throwable {
        ((t80) create(af7Var, lu2Var)).invokeSuspend(j6g.a);
        return g13.a;
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            af7 af7Var = (af7) this.L$0;
            u80 u80Var = this.this$0;
            this.L$0 = af7Var;
            this.L$1 = u80Var;
            this.label = 1;
            qw1 qw1Var = new qw1(1, ewa.v(this));
            qw1Var.q();
            rhf rhfVar = u80Var.b;
            scb scbVar = rhfVar.a;
            scbVar.a();
            rhfVar.b.set(new whf(rhfVar, scbVar));
            qw1Var.t(new a(af7Var, u80Var));
            Object objP = qw1Var.p();
            g13 g13Var = g13.a;
            if (objP == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
        }
        r40.e();
        return null;
    }
}
