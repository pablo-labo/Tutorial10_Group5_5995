package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.r;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.indeed.android.jobsearch.R;
import com.indeed.android.messaging.data.conversations.ConversationRecord;
import defpackage.c20;
import defpackage.gl2;
import defpackage.i6b;
import defpackage.p37;
import defpackage.pm8;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dl4 implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dl4(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        e.a aVar = e.a.b;
        Object obj4 = this.b;
        int i2 = 1;
        switch (i) {
            case 0:
                g4a g4aVar = (g4a) obj4;
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    String strC = v1c.c((String) g4aVar.getValue());
                    Object objV = bVar.v();
                    b.a.C0020a c0020a = b.a.a;
                    if (objV == c0020a) {
                        int length = strC.length();
                        objV = r.f(new jhf(strC, cr8.c(length, length), 4));
                        bVar.p(objV);
                    }
                    g4a g4aVar2 = (g4a) objV;
                    Object objV2 = bVar.v();
                    if (objV2 == c0020a) {
                        objV2 = r.f(lcf.c);
                        bVar.p(objV2);
                    }
                    g4a g4aVar3 = (g4a) objV2;
                    Object objV3 = bVar.v();
                    if (objV3 == c0020a) {
                        objV3 = r.f(Boolean.FALSE);
                        bVar.p(objV3);
                    }
                    g4a g4aVar4 = (g4a) objV3;
                    e eVarF = f.f(aVar, 12.0f);
                    ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, bVar, 0);
                    int iHashCode = Long.hashCode(bVar.k());
                    t8b t8bVarM = bVar.m();
                    e eVarC = c.c(bVar, eVarF);
                    gl2.j.getClass();
                    pm8.a aVar2 = gl2.a.b;
                    if (bVar.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar.B();
                    if (bVar.f()) {
                        bVar.y(aVar2);
                    } else {
                        bVar.n();
                    }
                    ygg.y(bVar, ob2VarA, gl2.a.g);
                    ygg.y(bVar, t8bVarM, gl2.a.f);
                    gl2.a.C0251a c0251a = gl2.a.j;
                    if (bVar.f() || !wl7.b(bVar.v(), Integer.valueOf(iHashCode))) {
                        uz.g(iHashCode, bVar, iHashCode, c0251a);
                    }
                    ygg.y(bVar, eVarC, gl2.a.d);
                    ue7.a(ak2.I(R.string.description, bVar), false, null, 0L, 0.0f, null, bVar, 48, 60);
                    jhf jhfVar = (jhf) g4aVar2.getValue();
                    Object objV4 = bVar.v();
                    if (objV4 == c0020a) {
                        objV4 = new wi1(i2, g4aVar2, g4aVar);
                        bVar.p(objV4);
                    }
                    Function1 function1 = (Function1) objV4;
                    Object objV5 = bVar.v();
                    if (objV5 == c0020a) {
                        objV5 = new px2(3, g4aVar3);
                        bVar.p(objV5);
                    }
                    Function1 function12 = (Function1) objV5;
                    lcf lcfVar = (lcf) g4aVar3.getValue();
                    Object objV6 = bVar.v();
                    if (objV6 == c0020a) {
                        objV6 = new uq(2, g4aVar4);
                        bVar.p(objV6);
                    }
                    pcf.a(jhfVar, function1, function12, lcfVar, (Function1) objV6, ((Boolean) g4aVar4.getValue()).booleanValue(), null, null, bVar, 25008);
                    bVar.q();
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 1:
                gx4 gx4Var = (gx4) obj4;
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    p37 p37VarB = rwc.a;
                    if (p37VarB == null) {
                        p37.a aVar3 = new p37.a("Filled.Refresh", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i3 = gmg.a;
                        kne kneVar = new kne(da2.b);
                        y5b y5bVar = new y5b();
                        y5bVar.f(17.65f, 6.35f);
                        i6b.c cVar = new i6b.c(16.2f, 4.9f, 14.21f, 4.0f, 12.0f, 4.0f);
                        ArrayList<i6b> arrayList = y5bVar.a;
                        arrayList.add(cVar);
                        y5bVar.b(-4.42f, 0.0f, -7.99f, 3.58f, -7.99f, 8.0f);
                        y5bVar.g(3.57f, 8.0f, 7.99f, 8.0f);
                        y5bVar.b(3.73f, 0.0f, 6.84f, -2.55f, 7.73f, -6.0f);
                        y5bVar.c(-2.08f);
                        y5bVar.b(-0.82f, 2.33f, -3.04f, 4.0f, -5.65f, 4.0f);
                        y5bVar.b(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
                        y5bVar.g(2.69f, -6.0f, 6.0f, -6.0f);
                        y5bVar.b(1.66f, 0.0f, 3.14f, 0.69f, 4.22f, 1.78f);
                        y5bVar.d(13.0f, 11.0f);
                        y5bVar.c(7.0f);
                        arrayList.add(new i6b.s(4.0f));
                        y5bVar.e(-2.35f, 2.35f);
                        y5bVar.a();
                        p37.a.a(aVar3, arrayList, kneVar);
                        p37VarB = aVar3.b();
                        rwc.a = p37VarB;
                    }
                    wq6.a(p37VarB, null, f.j(g.h(androidx.compose.foundation.layout.e.c(aVar, 1.0f, 0.0f, 2), 22.0f), 0.0f, 0.0f, 5.0f, 0.0f, 11), 0L, bVar2, 432, 8);
                    fif.b(gx4Var.h, f.e(aVar, f.b(4.0f, 4.0f, 0.0f, 4.0f, 4)), 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, hz6.i, bVar2, 48, 0, 65532);
                } else {
                    bVar2.D();
                }
                return j6g.a;
            case 2:
                o97 o97Var = (o97) obj4;
                b bVar3 = (b) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((xo8) obj).getClass();
                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    cif.b(ak2.I(R.string.invitations_header_text, bVar3), f.i(g.f(aVar, 1.0f), 20.0f, 12.0f, 20.0f, 4.0f), o97Var.c.a.c, 0L, null, o97Var.f.c, null, 0L, null, null, 0L, 0, false, 0, 0, null, o97Var.j.f, bVar3, 0, 0, 65496);
                } else {
                    bVar3.D();
                }
                return j6g.a;
            case 3:
                ConversationRecord conversationRecord = (ConversationRecord) obj4;
                b bVar4 = (b) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((ml1) obj).getClass();
                if (bVar4.o(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    fd2.a(conversationRecord.getCompanyName(), conversationRecord.getCompanyLogoUrl(), 40.0f, bVar4, 384, 0);
                } else {
                    bVar4.D();
                }
                return j6g.a;
            default:
                gu5 gu5Var = (gu5) obj4;
                b bVar5 = (b) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((fhd) obj).getClass();
                if (bVar5.o(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    nof.a(gu5Var, bVar5, 48);
                } else {
                    bVar5.D();
                }
                return j6g.a;
        }
    }
}
