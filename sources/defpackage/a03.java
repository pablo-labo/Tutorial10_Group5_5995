package defpackage;

import com.indeed.android.myjobs.data.model.dto.InvitedJobDto;
import defpackage.khf;
import defpackage.lx5;
import defpackage.ua4;
import defpackage.v94;
import defpackage.ym7;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a03 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a03(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                lu8 lu8Var = (lu8) obj4;
                jhf jhfVar = (jhf) obj3;
                roa roaVar = (roa) obj2;
                gb4 gb4Var = (gb4) obj;
                nif nifVarD = lu8Var.d();
                if (nifVarD != null) {
                    ww1 ww1VarA = gb4Var.w1().a();
                    long j = ((kjf) ((gme) lu8Var.A).getValue()).a;
                    long j2 = ((kjf) ((gme) lu8Var.B).getValue()).a;
                    mif mifVar = nifVarD.a;
                    f80 f80Var = lu8Var.y;
                    long j3 = lu8Var.z;
                    if (!kjf.c(j)) {
                        f80Var.d(j3);
                        int iC = roaVar.c(kjf.f(j));
                        int iC2 = roaVar.c(kjf.e(j));
                        if (iC != iC2) {
                            ww1VarA.m(mifVar.i(iC, iC2), f80Var);
                        }
                    } else if (!kjf.c(j2)) {
                        long jB = mifVar.a.b.b();
                        da2 da2Var = jB != 16 ? new da2(jB) : null;
                        long j4 = da2Var != null ? da2Var.a : da2.b;
                        f80Var.d(da2.b(j4, da2.d(j4) * 0.2f));
                        int iC3 = roaVar.c(kjf.f(j2));
                        int iC4 = roaVar.c(kjf.e(j2));
                        if (iC3 != iC4) {
                            ww1VarA.m(mifVar.i(iC3, iC4), f80Var);
                        }
                    } else if (!kjf.c(jhfVar.b)) {
                        f80Var.d(j3);
                        long j5 = jhfVar.b;
                        int iC5 = roaVar.c(kjf.f(j5));
                        int iC6 = roaVar.c(kjf.e(j5));
                        if (iC5 != iC6) {
                            ww1VarA.m(mifVar.i(iC5, iC6), f80Var);
                        }
                    }
                    boolean zD = mifVar.d();
                    boolean z = false;
                    q1a q1aVar = mifVar.b;
                    kif kifVar = mifVar.a;
                    if (zD && kifVar.f != 3) {
                        z = true;
                    }
                    if (z) {
                        long j6 = mifVar.c;
                        qtc qtcVarA = web.a(0L, (((long) Float.floatToRawIntBits((int) (j6 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j6 >> 32))) << 32));
                        ww1VarA.o();
                        ww1VarA.i(qtcVarA);
                    }
                    foe foeVar = kifVar.b.a;
                    odf odfVar = foeVar.m;
                    khf khfVar = foeVar.a;
                    if (odfVar == null) {
                        odfVar = odf.b;
                    }
                    odf odfVar2 = odfVar;
                    vbe vbeVar = foeVar.n;
                    if (vbeVar == null) {
                        vbeVar = vbe.d;
                    }
                    vbe vbeVar2 = vbeVar;
                    ib4 ib4Var = foeVar.p;
                    if (ib4Var == null) {
                        ib4Var = ib5.a;
                    }
                    ib4 ib4Var2 = ib4Var;
                    try {
                        sn1 sn1VarE = khfVar.e();
                        khf.a aVar = khf.a.a;
                        if (sn1VarE != null) {
                            q1a.j(q1aVar, ww1VarA, sn1VarE, khfVar != aVar ? khfVar.a() : 1.0f, vbeVar2, odfVar2, ib4Var2);
                        } else {
                            q1a.i(q1aVar, ww1VarA, khfVar != aVar ? khfVar.c() : da2.b, vbeVar2, odfVar2, ib4Var2);
                        }
                        if (z) {
                            ww1VarA.h();
                        }
                    } catch (Throwable th) {
                        if (z) {
                            ww1VarA.h();
                        }
                        throw th;
                    }
                }
                return j6g.a;
            case 1:
                ymg ymgVar = (ymg) obj4;
                xmg xmgVar = ymgVar.b;
                xmg xmgVar2 = ymgVar.a;
                ja4 ja4Var = (ja4) obj2;
                beb.b(ymgVar, (yeb) obj, 0L);
                float fE = ((efb) obj3).getViewConfiguration().e();
                long jF = ewa.f(fE, fE);
                if (vmg.b(jF) <= 0.0f || vmg.c(jF) <= 0.0f) {
                    ae7.b("maximumVelocity should be a positive value. You specified=" + ((Object) vmg.g(jF)));
                }
                long jF2 = ewa.f(xmgVar2.b(vmg.b(jF)), xmgVar.b(vmg.c(jF)));
                se3[] se3VarArr = xmgVar2.d;
                pyd.q(null, 0, se3VarArr, se3VarArr.length);
                xmgVar2.e = 0;
                se3[] se3VarArr2 = xmgVar.d;
                pyd.q(null, 0, se3VarArr2, se3VarArr2.length);
                xmgVar.e = 0;
                ymgVar.c = 0L;
                go1 go1Var = ja4Var.j0;
                if (go1Var != null) {
                    ua4.a aVar2 = ua4.a;
                    go1Var.f(new v94.d(ewa.f(Float.isNaN(vmg.b(jF2)) ? 0.0f : vmg.b(jF2), Float.isNaN(vmg.c(jF2)) ? 0.0f : vmg.c(jF2))));
                }
                return j6g.a;
            case 2:
                String str = (String) obj4;
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                lx5.b bVar = (lx5.b) obj;
                bVar.getClass();
                bVar.a("subTabName", "Invitations");
                if (str != null) {
                    bVar.a("entityId", str);
                }
                bVar.a("entityData", str2);
                if (str3 != null) {
                    bVar.a("jobKey", str3);
                }
                return j6g.a;
            case 3:
                InvitedJobDto invitedJobDto = (InvitedJobDto) obj;
                invitedJobDto.getClass();
                Function1<lx5, j6g> function1 = c05.a;
                c05.a.invoke(tx5.k(c05.b, "myjobs_native_screen", "declineInvitationCTA", new ev2(2, invitedJobDto.getInvite().getId(), invitedJobDto.getJob().getKey()), 4));
                ((g4a) obj3).setValue(invitedJobDto);
                u63.Y((e13) obj4, null, null, new ym7.g((hw9) obj2, null), 3);
                return j6g.a;
            default:
                String str4 = (String) obj;
                str4.getClass();
                ((f51) obj4).u(str4, (List) ((Function1) obj3).invoke((String) ((g4a) obj2).getValue()));
                return j6g.a;
        }
    }
}
