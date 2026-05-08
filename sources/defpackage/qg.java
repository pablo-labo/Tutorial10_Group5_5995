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
public final /* synthetic */ class qg implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qg(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
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
                        bVar2.L(896511924);
                        bVar = new vw6.a(ak2.I(R.string.state, bVar2));
                        bVar2.F();
                    } else {
                        bVar2.L(896642093);
                        bVar2.F();
                        bVar = new vw6.b((String) g4aVar.getValue());
                    }
                    boolean zX = bVar2.x(ibaVar);
                    Object objV = bVar2.v();
                    if (zX || objV == b.a.a) {
                        objV = new lh(ibaVar, 0);
                        bVar2.p(objV);
                    }
                    yw6.a(bVar, (gu5) objV, null, strI, null, false, null, bVar2, 100663302, 0, 1768);
                    bVar2.q();
                } else {
                    bVar2.D();
                }
                return j6g.a;
            case 1:
                ((Integer) obj2).getClass();
                bm1.a((ca) obj4, (gu5) obj3, (b) obj, ka2.L(49));
                return j6g.a;
            case 2:
                ((Integer) obj2).getClass();
                int iL = ka2.L(1);
                klb.c(iL, (b) obj, (e) obj3, (String) obj4);
                return j6g.a;
            case 3:
                return RNProfileFormsModule.presentNativeResumeOtherSectionForm$lambda$28$lambda$6((Promise) obj4, (RNProfileFormsModule) obj3, (ps7) obj, (or7) obj2);
            default:
                ((Integer) obj2).getClass();
                zmf.a((fnf) obj4, (String) obj3, (b) obj, ka2.L(49));
                return j6g.a;
        }
    }

    public /* synthetic */ qg(Object obj, int i, int i2, Object obj2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
    }
}
