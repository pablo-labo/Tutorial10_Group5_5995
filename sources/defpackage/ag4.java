package defpackage;

import androidx.compose.runtime.b;
import androidx.navigation.d;
import com.indeed.android.jobsearch.R;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ag4 implements xu5 {
    public final /* synthetic */ Object V;
    public final /* synthetic */ Object W;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ gu5 c;
    public final /* synthetic */ iba d;
    public final /* synthetic */ hw9 e;
    public final /* synthetic */ g4a f;

    public /* synthetic */ ag4(t41 t41Var, String str, gu5 gu5Var, iba ibaVar, hw9 hw9Var, g4a g4aVar, g4a g4aVar2) {
        this.V = t41Var;
        this.b = str;
        this.c = gu5Var;
        this.d = ibaVar;
        this.e = hw9Var;
        this.f = g4aVar;
        this.W = g4aVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.xu5
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.a;
        b.a.C0020a c0020a = b.a.a;
        Object obj5 = this.W;
        g4a g4aVar = this.f;
        iba ibaVar = this.d;
        gu5 gu5Var = this.c;
        Object obj6 = this.V;
        switch (i) {
            case 0:
                List list = (List) obj6;
                Function1 function1 = (Function1) obj5;
                b bVar = (b) obj3;
                s6.g((Integer) obj4, (bd0) obj, (d) obj2);
                j6g j6gVar = j6g.a;
                Object objV = bVar.v();
                if (objV == c0020a) {
                    objV = new lg(4);
                    bVar.p(objV);
                }
                to4.b(j6gVar, (Function1) objV, bVar);
                String strI = ak2.I(R.string.label_license_type, bVar);
                String strI2 = ak2.I(R.string.subtext_certification_title, bVar);
                String str = (String) g4aVar.getValue();
                boolean zK = bVar.K(function1);
                Object objV2 = bVar.v();
                if (zK || objV2 == c0020a) {
                    objV2 = new w31(function1, 1);
                    bVar.p(objV2);
                }
                Function1 function12 = (Function1) objV2;
                boolean zK2 = bVar.K(gu5Var);
                Object objV3 = bVar.v();
                if (zK2 || objV3 == c0020a) {
                    objV3 = new ta(3, gu5Var);
                    bVar.p(objV3);
                }
                gu5 gu5Var2 = (gu5) objV3;
                boolean zX = bVar.x(ibaVar);
                Object objV4 = bVar.v();
                if (zX || objV4 == c0020a) {
                    objV4 = new sf4(ibaVar, g4aVar, 0);
                    bVar.p(objV4);
                }
                Function1 function13 = (Function1) objV4;
                boolean zX2 = bVar.x(ibaVar);
                Object objV5 = bVar.v();
                if (zX2 || objV5 == c0020a) {
                    objV5 = new pg(ibaVar, 2);
                    bVar.p(objV5);
                }
                e51.b(this.b, strI, strI2, null, true, false, str, list, function12, gu5Var2, function13, (gu5) objV5, null, null, null, this.e, 0, null, null, false, false, bVar, 221184, 262528, 2056200);
                return j6gVar;
            default:
                t41 t41Var = (t41) obj6;
                g4a g4aVar2 = (g4a) obj5;
                d dVar = (d) obj2;
                b bVar2 = (b) obj3;
                ((Integer) obj4).intValue();
                ((bd0) obj).getClass();
                dVar.getClass();
                j6g j6gVar2 = j6g.a;
                Object objV6 = bVar2.v();
                if (objV6 == c0020a) {
                    objV6 = new xi(4);
                    bVar2.p(objV6);
                }
                to4.b(j6gVar2, (Function1) objV6, bVar2);
                boolean zX3 = bVar2.x(t41Var);
                Object objV7 = bVar2.v();
                if (zX3 || objV7 == c0020a) {
                    objV7 = new gi(t41Var, 2);
                    bVar2.p(objV7);
                }
                iwc iwcVar = fwc.a;
                f51 f51Var = (f51) erg.a(iwcVar.b(f51.class), dVar, n6.a(iwcVar, f51.class, new qd7(), (Function1) objV7), dVar.getDefaultViewModelCreationExtras(), bVar2);
                String strI3 = ak2.I(R.string.language_label, bVar2);
                String str2 = (String) g4aVar.getValue();
                List list2 = (List) ((gme) f51Var.g0).getValue();
                boolean zX4 = bVar2.x(f51Var);
                Object objV8 = bVar2.v();
                if (zX4 || objV8 == c0020a) {
                    objV8 = new hi(f51Var, 1);
                    bVar2.p(objV8);
                }
                Function1 function14 = (Function1) objV8;
                boolean zK3 = bVar2.K(gu5Var);
                Object objV9 = bVar2.v();
                if (zK3 || objV9 == c0020a) {
                    objV9 = new hh(6, gu5Var);
                    bVar2.p(objV9);
                }
                gu5 gu5Var3 = (gu5) objV9;
                boolean zX5 = bVar2.x(ibaVar);
                Object objV10 = bVar2.v();
                if (zX5 || objV10 == c0020a) {
                    objV10 = new ft(ibaVar, g4aVar, 2);
                    bVar2.p(objV10);
                }
                Function1 function15 = (Function1) objV10;
                boolean zX6 = bVar2.x(ibaVar) | bVar2.K(gu5Var);
                Object objV11 = bVar2.v();
                if (zX6 || objV11 == c0020a) {
                    objV11 = new ky(3, ibaVar, gu5Var);
                    bVar2.p(objV11);
                }
                gu5 gu5Var4 = (gu5) objV11;
                Object objV12 = bVar2.v();
                if (objV12 == c0020a) {
                    objV12 = new uf4(4, g4aVar2);
                    bVar2.p(objV12);
                }
                e51.b(this.b, strI3, null, null, true, false, str2, list2, function14, gu5Var3, function15, gu5Var4, null, null, (Function1) objV12, this.e, 0, null, null, false, false, bVar2, 221184, 287104, 2039820);
                return j6gVar2;
        }
    }

    public /* synthetic */ ag4(String str, List list, Function1 function1, gu5 gu5Var, iba ibaVar, hw9 hw9Var, g4a g4aVar) {
        this.b = str;
        this.V = list;
        this.W = function1;
        this.c = gu5Var;
        this.d = ibaVar;
        this.e = hw9Var;
        this.f = g4aVar;
    }
}
