package defpackage;

import androidx.compose.runtime.b;
import androidx.navigation.d;
import com.indeed.android.jobsearch.R;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ih4 implements xu5 {
    public final /* synthetic */ Object V;
    public final /* synthetic */ Object W;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ gu5 b;
    public final /* synthetic */ iba c;
    public final /* synthetic */ hw9 d;
    public final /* synthetic */ g4a e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ih4(t41 t41Var, gu5 gu5Var, gu5 gu5Var2, iba ibaVar, hw9 hw9Var, g4a g4aVar, g4a g4aVar2) {
        this.f = t41Var;
        this.b = gu5Var;
        this.V = gu5Var2;
        this.c = ibaVar;
        this.d = hw9Var;
        this.e = g4aVar;
        this.W = g4aVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.xu5
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.a;
        b.a.C0020a c0020a = b.a.a;
        Object obj5 = this.W;
        g4a g4aVar = this.e;
        iba ibaVar = this.c;
        Object obj6 = this.V;
        gu5 gu5Var = this.b;
        Object obj7 = this.f;
        switch (i) {
            case 0:
                String str = (String) obj7;
                List list = (List) obj6;
                Function1 function1 = (Function1) obj5;
                b bVar = (b) obj3;
                s6.g((Integer) obj4, (bd0) obj, (d) obj2);
                j6g j6gVar = j6g.a;
                Object objV = bVar.v();
                if (objV == c0020a) {
                    objV = new hu(6);
                    bVar.p(objV);
                }
                to4.b(j6gVar, (Function1) objV, bVar);
                String strI = ak2.I(R.string.label_certification_title, bVar);
                String strI2 = ak2.I(R.string.subtext_certification_title, bVar);
                String str2 = (String) g4aVar.getValue();
                boolean zK = bVar.K(function1);
                Object objV2 = bVar.v();
                if (zK || objV2 == c0020a) {
                    objV2 = new bs2(function1, 2);
                    bVar.p(objV2);
                }
                Function1 function12 = (Function1) objV2;
                boolean zK2 = bVar.K(gu5Var);
                Object objV3 = bVar.v();
                if (zK2 || objV3 == c0020a) {
                    objV3 = new wc(4, gu5Var);
                    bVar.p(objV3);
                }
                gu5 gu5Var2 = (gu5) objV3;
                boolean zX = bVar.x(ibaVar);
                Object objV4 = bVar.v();
                if (zX || objV4 == c0020a) {
                    objV4 = new bb3(1, ibaVar, g4aVar);
                    bVar.p(objV4);
                }
                Function1 function13 = (Function1) objV4;
                boolean zX2 = bVar.x(ibaVar);
                Object objV5 = bVar.v();
                if (zX2 || objV5 == c0020a) {
                    objV5 = new ng(ibaVar, 2);
                    bVar.p(objV5);
                }
                e51.b(str, strI, strI2, null, true, false, str2, list, function12, gu5Var2, function13, (gu5) objV5, null, null, null, this.d, 0, null, null, false, false, bVar, 221184, 262528, 2056200);
                return j6gVar;
            default:
                t41 t41Var = (t41) obj7;
                gu5 gu5Var3 = (gu5) obj6;
                g4a g4aVar2 = (g4a) obj5;
                d dVar = (d) obj2;
                b bVar2 = (b) obj3;
                ((Integer) obj4).intValue();
                ((bd0) obj).getClass();
                dVar.getClass();
                j6g j6gVar2 = j6g.a;
                Object objV6 = bVar2.v();
                if (objV6 == c0020a) {
                    objV6 = new bh(3);
                    bVar2.p(objV6);
                }
                to4.b(j6gVar2, (Function1) objV6, bVar2);
                boolean zX3 = bVar2.x(t41Var);
                Object objV7 = bVar2.v();
                if (zX3 || objV7 == c0020a) {
                    objV7 = new wi(t41Var, 5);
                    bVar2.p(objV7);
                }
                iwc iwcVar = fwc.a;
                f51 f51Var = (f51) erg.a(iwcVar.b(f51.class), dVar, n6.a(iwcVar, f51.class, new qd7(), (Function1) objV7), dVar.getDefaultViewModelCreationExtras(), bVar2);
                String str3 = (String) g4aVar.getValue();
                List<g51> listS = f51Var.s();
                boolean zK3 = bVar2.K(gu5Var);
                Object objV8 = bVar2.v();
                if (zK3 || objV8 == c0020a) {
                    objV8 = new eh(4, gu5Var);
                    bVar2.p(objV8);
                }
                gu5 gu5Var4 = (gu5) objV8;
                boolean zK4 = bVar2.K(gu5Var3);
                Object objV9 = bVar2.v();
                if (zK4 || objV9 == c0020a) {
                    objV9 = new qs0(5, gu5Var3, g4aVar);
                    bVar2.p(objV9);
                }
                Function1 function14 = (Function1) objV9;
                boolean zX4 = bVar2.x(ibaVar);
                Object objV10 = bVar2.v();
                if (zX4 || objV10 == c0020a) {
                    objV10 = new zr(ibaVar, 1);
                    bVar2.p(objV10);
                }
                gu5 gu5Var5 = (gu5) objV10;
                boolean zX5 = bVar2.x(f51Var);
                Object objV11 = bVar2.v();
                if (zX5 || objV11 == c0020a) {
                    objV11 = new bf(1, f51Var, g4aVar2);
                    bVar2.p(objV11);
                }
                y8g.b(1769478, 4, gu5Var4, null, gu5Var5, this.d, bVar2, str3, listS, function14, (Function1) objV11, false, false);
                return j6gVar2;
        }
    }

    public /* synthetic */ ih4(String str, List list, Function1 function1, gu5 gu5Var, iba ibaVar, hw9 hw9Var, g4a g4aVar) {
        this.f = str;
        this.V = list;
        this.W = function1;
        this.b = gu5Var;
        this.c = ibaVar;
        this.d = hw9Var;
        this.e = g4aVar;
    }
}
