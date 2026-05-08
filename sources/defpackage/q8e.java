package defpackage;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class q8e extends mj8 implements Function1<mqf, j6g> {
    final /* synthetic */ cxe $subject;
    final /* synthetic */ t8e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q8e(cxe cxeVar, t8e t8eVar) {
        super(1);
        this.$subject = cxeVar;
        this.this$0 = t8eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(mqf mqfVar) {
        mqf mqfVar2 = mqfVar;
        mqfVar2.getClass();
        mqfVar2.i = this.$subject;
        String strY = this.this$0.e().y();
        if (!mqfVar2.b) {
            mqfVar2.x = strY;
        }
        boolean zH = this.this$0.e().h();
        if (!mqfVar2.b) {
            mqfVar2.k = zH;
        }
        mqfVar2.l = this.this$0.e().j();
        j39 j39VarP = this.this$0.e().p();
        if (!mqfVar2.b) {
            mqfVar2.m = j39VarP;
        }
        f49 f49VarQ = this.this$0.e().q();
        if (!mqfVar2.b) {
            c49.a.getClass();
            if (f49VarQ == null) {
                f49VarQ = new ka2(23);
            }
            c49.d = f49VarQ;
        }
        boolean zX = this.this$0.e().x();
        synchronized (mqfVar2) {
            try {
                mqfVar2.z = zX;
                u8e u8eVar = mqfVar2.j;
                if (u8eVar != null && !zX) {
                    mqfVar2.b();
                    mqfVar2.j = null;
                } else if (u8eVar == null && zX) {
                    Runnable[] runnableArr = {null, null, null, null};
                    Runnable[] runnableArr2 = mqfVar2.y;
                    mqfVar2.j = u8e.q.a(mqfVar2.c, mqfVar2.n, mqfVar2.o, mqfVar2.q, runnableArr2.length == 4 ? runnableArr2 : runnableArr, mqfVar2.p);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        boolean zG = this.this$0.e().g();
        if (!mqfVar2.b) {
            mqfVar2.C = zG;
        }
        boolean zR = this.this$0.e().r();
        if (!mqfVar2.b) {
            mqfVar2.B = zR;
        }
        boolean zM = this.this$0.e().m();
        if (!mqfVar2.b) {
            mqfVar2.A = zM;
        }
        if (this.this$0.e().i()) {
            mqfVar2.a(new lk3());
        } else {
            mqfVar2.d.d("DeepLinkContext");
        }
        if (this.this$0.e().u()) {
            mqfVar2.a(new zqd());
        } else {
            mqfVar2.d.d("ScreenContext");
        }
        boolean zW = this.this$0.e().w();
        if (!mqfVar2.b) {
            mqfVar2.v = zW;
        }
        if (this.this$0.e().v()) {
            mqfVar2.a(new brd());
        } else {
            mqfVar2.d.d("ScreenSummaryContext");
        }
        boolean zO = this.this$0.e().o();
        if (!mqfVar2.b) {
            mqfVar2.t = zO;
        }
        boolean zN = this.this$0.e().n();
        if (!mqfVar2.b) {
            mqfVar2.u = zN;
        }
        boolean zL = this.this$0.e().l();
        if (!mqfVar2.b) {
            mqfVar2.r = zL;
        }
        boolean zK = this.this$0.e().k();
        if (!mqfVar2.b) {
            mqfVar2.s = zK;
        }
        boolean z = this.this$0.e().z();
        boolean z2 = mqfVar2.b;
        if (!z2) {
            mqfVar2.w = z;
        } else if (mqfVar2.w != z && z2) {
            mqfVar2.w = z;
            u8e u8eVar2 = mqfVar2.j;
            if (u8eVar2 != null) {
                u8eVar2.g.set(true);
            }
        }
        String strY2 = this.this$0.e().y();
        if (!mqfVar2.b) {
            mqfVar2.x = strY2;
        }
        mw5 mw5Var = this.this$0.k;
        if (mw5Var == null) {
            wl7.g("gdprConfiguration");
            throw null;
        }
        mw5 mw5VarE = mw5Var.e();
        if (mw5VarE != null) {
            mqfVar2.D = new lw5(mw5VarE.a(), mw5VarE.c(), mw5VarE.d(), mw5VarE.b());
        }
        ulf ulfVarB = this.this$0.d().b();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long jA = ulfVarB.a(timeUnit);
        if (!mqfVar2.b) {
            mqfVar2.o = jA;
        }
        long jA2 = this.this$0.d().d().a(timeUnit);
        if (!mqfVar2.b) {
            mqfVar2.n = jA2;
        }
        boolean zC = this.this$0.d().c();
        if (!mqfVar2.b) {
            mqfVar2.p = zC;
            u8e u8eVar3 = mqfVar2.j;
            if (u8eVar3 != null) {
                u8eVar3.a = zC;
            }
        }
        for (ceb cebVar : this.this$0.l) {
            cebVar.getClass();
            zdb zdbVar = cebVar instanceof zdb ? (zdb) cebVar : null;
            c00 c00VarB = zdbVar != null ? zdbVar.b() : null;
            ydb ydbVar = cebVar instanceof ydb ? (ydb) cebVar : null;
            if (ydbVar != null) {
                ydbVar.a();
            }
            aeb aebVar = cebVar instanceof aeb ? (aeb) cebVar : null;
            if (aebVar != null) {
                aebVar.a();
            }
            mqfVar2.a(new feb(cebVar.a(), c00VarB));
        }
        return j6g.a;
    }
}
