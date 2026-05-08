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
import java.io.File;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class iu implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ iu(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                g4a g4aVar = (g4a) obj4;
                g4a g4aVar2 = (g4a) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e eVarH = f.h(e.a.b, v1c.e, 0.0f, 2);
                    ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, bVar, 0);
                    int iHashCode = Long.hashCode(bVar.k());
                    t8b t8bVarM = bVar.m();
                    e eVarC = c.c(bVar, eVarH);
                    gl2.j.getClass();
                    pm8.a aVar = gl2.a.b;
                    if (bVar.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar.B();
                    if (bVar.f()) {
                        bVar.y(aVar);
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
                    tg3 tg3Var = (tg3) g4aVar.getValue();
                    Object objV = bVar.v();
                    b.a.C0020a c0020a = b.a.a;
                    if (objV == c0020a) {
                        objV = new s5(g4aVar, 2);
                        bVar.p(objV);
                    }
                    Function2 function2 = (Function2) objV;
                    String strI = ak2.I(R.string.date_awarded, bVar);
                    Object objV2 = bVar.v();
                    if (objV2 == c0020a) {
                        objV2 = new ls(1, g4aVar2);
                        bVar.p(objV2);
                    }
                    gz9.b(tg3Var, function2, strI, false, (Function1) objV2, 0, bVar, 1597488, 168);
                    bVar.q();
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 1:
                ((Integer) obj2).getClass();
                e7b.a((File) obj4, (p9d) obj3, (b) obj, ka2.L(1));
                return j6g.a;
            case 2:
                return RNProfileFormsModule.presentNativeResumeOtherSectionForm$lambda$28$lambda$4((Promise) obj4, (RNProfileFormsModule) obj3, (ps7) obj, (List) obj2);
            default:
                ((Integer) obj2).getClass();
                yfe.a((e) obj4, (ah2) obj3, (b) obj, ka2.L(49));
                return j6g.a;
        }
    }

    public /* synthetic */ iu(Object obj, int i, int i2, Object obj2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
    }
}
