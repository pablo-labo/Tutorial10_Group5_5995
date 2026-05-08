package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.fragment.app.g;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u78 implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ u78(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        b.a.C0020a c0020a = b.a.a;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj6;
                List list = (List) obj5;
                gu5 gu5Var = (gu5) obj4;
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ml1) obj).getClass();
                if (bVar.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                    w78.b(str, list, gu5Var, bVar, 0);
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 1:
                g gVar = (g) obj6;
                wu5 wu5Var = (wu5) obj5;
                svb svbVar = (svb) obj4;
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((pb2) obj).getClass();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    boolean zX = bVar2.x(gVar) | bVar2.K(wu5Var) | bVar2.x(svbVar);
                    Object objV = bVar2.v();
                    if (zX || objV == c0020a) {
                        objV = new eq0(2, gVar, svbVar, wu5Var);
                        bVar2.p(objV);
                    }
                    q1c.c(48, (gu5) objV, bVar2, "Edit Patent", true);
                } else {
                    bVar2.D();
                }
                return j6g.a;
            default:
                Function2 function2 = (Function2) obj6;
                g4a g4aVar = (g4a) obj5;
                g4a g4aVar2 = (g4a) obj4;
                b bVar3 = (b) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((pb2) obj).getClass();
                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    boolean zK = bVar3.K(function2);
                    Object objV2 = bVar3.v();
                    if (zK || objV2 == c0020a) {
                        objV2 = new kzc(function2, g4aVar, g4aVar2, 1);
                        bVar3.p(objV2);
                    }
                    q9f.e(6, (gu5) objV2, bVar3, "Open Onboarding Modal");
                    String str2 = (String) g4aVar.getValue();
                    Object objV3 = bVar3.v();
                    if (objV3 == c0020a) {
                        objV3 = new yd(5, g4aVar);
                        bVar3.p(objV3);
                    }
                    q9f.g("Experience Key", str2, "test-experience", (Function1) objV3, false, bVar3, 3462, 16);
                    e eVarH = f.h(androidx.compose.foundation.layout.g.f(e.a.b, 1.0f), 0.0f, 8.0f, 1);
                    ehd ehdVarA = chd.a(vs0.a, c20.a.k, bVar3, 48);
                    int iHashCode = Long.hashCode(bVar3.k());
                    t8b t8bVarM = bVar3.m();
                    e eVarC = c.c(bVar3, eVarH);
                    gl2.j.getClass();
                    pm8.a aVar = gl2.a.b;
                    if (bVar3.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar3.B();
                    if (bVar3.f()) {
                        bVar3.y(aVar);
                    } else {
                        bVar3.n();
                    }
                    ygg.y(bVar3, ehdVarA, gl2.a.g);
                    ygg.y(bVar3, t8bVarM, gl2.a.f);
                    gl2.a.C0251a c0251a = gl2.a.j;
                    if (bVar3.f() || !wl7.b(bVar3.v(), Integer.valueOf(iHashCode))) {
                        uz.g(iHashCode, bVar3, iHashCode, c0251a);
                    }
                    ygg.y(bVar3, eVarC, gl2.a.d);
                    boolean zBooleanValue = ((Boolean) g4aVar2.getValue()).booleanValue();
                    Object objV4 = bVar3.v();
                    if (objV4 == c0020a) {
                        objV4 = new zd(3, g4aVar2);
                        bVar3.p(objV4);
                    }
                    u32.a(zBooleanValue, (Function1) objV4, null, false, null, null, bVar3, 48, 60);
                    cif.b("Skip Exempt", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVar3, 6, 0, 131070);
                    bVar3.q();
                } else {
                    bVar3.D();
                }
                return j6g.a;
        }
    }
}
