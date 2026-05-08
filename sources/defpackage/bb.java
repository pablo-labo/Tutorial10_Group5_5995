package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.facebook.react.bridge.Promise;
import com.indeed.android.jobsearch.R;
import com.indeed.android.rnprofile.RNProfileFormsModule;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import defpackage.vw6;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bb implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bb(j4e j4eVar, ah2 ah2Var, int i) {
        this.a = 1;
        this.b = j4eVar;
        this.c = ah2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vw6 bVar;
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                iba ibaVar = (iba) obj4;
                g4a g4aVar = (g4a) obj3;
                b bVar2 = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e eVarH = f.h(e.a.b, v1c.e, 0.0f, 2);
                    ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, bVar2, 0);
                    int iHashCode = Long.hashCode(bVar2.k());
                    t8b t8bVarM = bVar2.m();
                    e eVarC = c.c(bVar2, eVarH);
                    gl2.j.getClass();
                    pm8.a aVar = gl2.a.b;
                    if (bVar2.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar2.B();
                    if (bVar2.f()) {
                        bVar2.y(aVar);
                    } else {
                        bVar2.n();
                    }
                    ygg.y(bVar2, ob2VarA, gl2.a.g);
                    ygg.y(bVar2, t8bVarM, gl2.a.f);
                    gl2.a.C0251a c0251a = gl2.a.j;
                    if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode))) {
                        uz.g(iHashCode, bVar2, iHashCode, c0251a);
                    }
                    ygg.y(bVar2, eVarC, gl2.a.d);
                    String strI = ak2.I(R.string.state, bVar2);
                    if (zve.U((String) g4aVar.getValue())) {
                        bVar2.L(-1732723117);
                        bVar = new vw6.a(ak2.I(R.string.state, bVar2));
                        bVar2.F();
                    } else {
                        bVar2.L(-1732592948);
                        bVar2.F();
                        bVar = new vw6.b((String) g4aVar.getValue());
                    }
                    vw6 vw6Var = bVar;
                    boolean zX = bVar2.x(ibaVar);
                    Object objV = bVar2.v();
                    if (zX || objV == b.a.a) {
                        objV = new kb(ibaVar, 0);
                        bVar2.p(objV);
                    }
                    yw6.a(vw6Var, (gu5) objV, null, strI, null, false, null, bVar2, 100663302, 0, 1768);
                    bVar2.q();
                } else {
                    bVar2.D();
                }
                return j6g.a;
            case 1:
                ((Integer) obj2).getClass();
                cu2.a((j4e) obj4, (ah2) obj3, (b) obj, ka2.L(49));
                return j6g.a;
            case 2:
                yvb yvbVar = (yvb) obj4;
                String str = (String) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                boolean z = ((x1c) obj3).o().k;
                yvbVar.getClass();
                return Boolean.valueOf(str != null && zBooleanValue && !yvbVar.v().c0.contains(str) && z);
            default:
                return RNProfileFormsModule.presentNativeResumeOtherSectionForm$lambda$28$lambda$11((Promise) obj4, (RNProfileFormsModule) obj3, (ps7) obj, (pr7) obj2);
        }
    }

    public /* synthetic */ bb(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
