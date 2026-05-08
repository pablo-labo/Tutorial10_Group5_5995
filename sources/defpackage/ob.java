package defpackage;

import androidx.compose.runtime.b;
import androidx.navigation.d;
import com.indeed.android.jobsearch.R;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ob implements xu5 {
    public final /* synthetic */ Object V;
    public final /* synthetic */ Object W;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ gu5 c;
    public final /* synthetic */ iba d;
    public final /* synthetic */ hw9 e;
    public final /* synthetic */ g4a f;

    public /* synthetic */ ob(t41 t41Var, String str, gu5 gu5Var, iba ibaVar, hw9 hw9Var, g4a g4aVar, g4a g4aVar2) {
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
                ((Integer) obj4).getClass();
                ((bd0) obj).getClass();
                ((d) obj2).getClass();
                jv8 jv8Var = jv8.a;
                String strI = ak2.I(jv8Var.a(), bVar);
                String str = (String) g4aVar.getValue();
                float fB = i3c.b(jv8Var.c(), wh.h);
                boolean zK = bVar.K(function1);
                Object objV = bVar.v();
                if (zK || objV == c0020a) {
                    objV = new cb(function1, 0);
                    bVar.p(objV);
                }
                Function1 function12 = (Function1) objV;
                boolean zK2 = bVar.K(gu5Var);
                Object objV2 = bVar.v();
                if (zK2 || objV2 == c0020a) {
                    objV2 = new eb(0, gu5Var);
                    bVar.p(objV2);
                }
                gu5 gu5Var2 = (gu5) objV2;
                boolean zX = bVar.x(ibaVar);
                Object objV3 = bVar.v();
                if (zX || objV3 == c0020a) {
                    objV3 = new fb(ibaVar, g4aVar, 0);
                    bVar.p(objV3);
                }
                e51.b(this.b, strI, null, null, true, false, str, list, function12, gu5Var2, (Function1) objV3, null, null, Float.valueOf(fB), null, this.e, R.string.next_button_label, null, null, false, false, bVar, 221184, 262528, 1984524);
                return j6g.a;
            default:
                t41 t41Var = (t41) obj6;
                g4a g4aVar2 = (g4a) obj5;
                d dVar = (d) obj2;
                b bVar2 = (b) obj3;
                ((Integer) obj4).intValue();
                ((bd0) obj).getClass();
                dVar.getClass();
                boolean zX2 = bVar2.x(t41Var);
                Object objV4 = bVar2.v();
                if (zX2 || objV4 == c0020a) {
                    objV4 = new si4(t41Var, 1);
                    bVar2.p(objV4);
                }
                iwc iwcVar = fwc.a;
                f51 f51Var = (f51) erg.a(iwcVar.b(f51.class), dVar, n6.a(iwcVar, f51.class, new qd7(), (Function1) objV4), dVar.getDefaultViewModelCreationExtras(), bVar2);
                j6g j6gVar = j6g.a;
                Object objV5 = bVar2.v();
                if (objV5 == c0020a) {
                    objV5 = new pm4(2, null);
                    bVar2.p(objV5);
                }
                to4.d(bVar2, j6gVar, (Function2) objV5);
                fje fjeVar = fje.a;
                String strI2 = ak2.I(fjeVar.a(), bVar2);
                String str2 = (String) g4aVar.getValue();
                List list2 = c0h.F() ? (List) ((gme) f51Var.k0).getValue() : (List) ((gme) f51Var.i0).getValue();
                float fB2 = i3c.b(fjeVar.c(), wh.d);
                boolean zX3 = bVar2.x(f51Var);
                Object objV6 = bVar2.v();
                if (zX3 || objV6 == c0020a) {
                    objV6 = new km4(f51Var, 0);
                    bVar2.p(objV6);
                }
                Function1 function13 = (Function1) objV6;
                boolean zK3 = bVar2.K(gu5Var);
                Object objV7 = bVar2.v();
                if (zK3 || objV7 == c0020a) {
                    objV7 = new ib1(1, gu5Var);
                    bVar2.p(objV7);
                }
                gu5 gu5Var3 = (gu5) objV7;
                boolean zX4 = bVar2.x(ibaVar);
                Object objV8 = bVar2.v();
                if (zX4 || objV8 == c0020a) {
                    objV8 = new xw(1, ibaVar, g4aVar);
                    bVar2.p(objV8);
                }
                Function1 function14 = (Function1) objV8;
                Float fValueOf = Float.valueOf(fB2);
                Object objV9 = bVar2.v();
                if (objV9 == c0020a) {
                    objV9 = new nc(4, g4aVar2);
                    bVar2.p(objV9);
                }
                e51.b(this.b, strI2, null, null, true, false, str2, list2, function13, gu5Var3, function14, null, null, fValueOf, (Function1) objV9, this.e, 0, null, null, false, false, bVar2, 221184, 287104, 2033676);
                return j6gVar;
        }
    }

    public /* synthetic */ ob(String str, List list, Function1 function1, gu5 gu5Var, iba ibaVar, hw9 hw9Var, g4a g4aVar) {
        this.b = str;
        this.V = list;
        this.W = function1;
        this.c = gu5Var;
        this.d = ibaVar;
        this.e = hw9Var;
        this.f = g4aVar;
    }
}
