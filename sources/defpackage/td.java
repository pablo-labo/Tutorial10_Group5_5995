package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.facebook.react.bridge.Promise;
import com.indeed.android.backendservices.common.api.ApiError;
import com.indeed.android.backendservices.common.api.ErrorData;
import com.indeed.android.jobsearch.R;
import com.indeed.android.rnprofile.RNProfileFormsModule;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.Request;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class td implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ td(e8a e8aVar, rs0 rs0Var, int i) {
        this.a = 1;
        this.b = e8aVar;
        this.c = rs0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        e.a aVar = e.a.b;
        int i2 = 0;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj4;
                g4a g4aVar = (g4a) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(1 & iIntValue, (iIntValue & 3) != 2)) {
                    e eVarH = f.h(aVar, v1c.e, 0.0f, 2);
                    ag9 ag9VarD = hl1.d(c20.a.a, false);
                    int iHashCode = Long.hashCode(bVar.k());
                    t8b t8bVarM = bVar.m();
                    e eVarC = c.c(bVar, eVarH);
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
                    ygg.y(bVar, ag9VarD, gl2.a.g);
                    ygg.y(bVar, t8bVarM, gl2.a.f);
                    gl2.a.C0251a c0251a = gl2.a.j;
                    if (bVar.f() || !wl7.b(bVar.v(), Integer.valueOf(iHashCode))) {
                        uz.g(iHashCode, bVar, iHashCode, c0251a);
                    }
                    ygg.y(bVar, eVarC, gl2.a.d);
                    String str2 = (String) g4aVar.getValue();
                    if (str2 == null) {
                        str2 = "";
                    }
                    Object objV = bVar.v();
                    b.a.C0020a c0020a = b.a.a;
                    if (objV == c0020a) {
                        objV = new zd(i2, g4aVar);
                        bVar.p(objV);
                    }
                    Function1 function1 = (Function1) objV;
                    String strI = ak2.I(w61.a.a(), bVar);
                    Object objV2 = bVar.v();
                    if (objV2 == c0020a) {
                        objV2 = new ae(0, g4aVar);
                        bVar.p(objV2);
                    }
                    jyb.a(str2, function1, strI, true, str, false, null, null, (gu5) objV2, true, null, "AddAwardTitle", null, null, null, bVar, 905972784, 48, 29920);
                    bVar.q();
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 1:
                ((Integer) obj2).getClass();
                ks0.c((e8a) obj4, (rs0) obj3, (b) obj, ka2.L(1));
                return j6g.a;
            case 2:
                iuc iucVar = (iuc) obj4;
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                iucVar.element += ((x1b) obj3).a.e(fFloatValue - iucVar.element);
                return j6g.a;
            case 3:
                o97 o97Var = (o97) obj4;
                svb svbVar = (svb) obj3;
                b bVar2 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar2.o(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    e eVarF = f.f(g.f(aVar, 1.0f), 16.0f);
                    ehd ehdVarA = chd.a(vs0.g, c20.a.j, bVar2, 6);
                    int iHashCode2 = Long.hashCode(bVar2.k());
                    t8b t8bVarM2 = bVar2.m();
                    e eVarC2 = c.c(bVar2, eVarF);
                    gl2.j.getClass();
                    pm8.a aVar3 = gl2.a.b;
                    if (bVar2.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar2.B();
                    if (bVar2.f()) {
                        bVar2.y(aVar3);
                    } else {
                        bVar2.n();
                    }
                    gl2.a.d dVar = gl2.a.g;
                    ygg.y(bVar2, ehdVarA, dVar);
                    gl2.a.f fVar = gl2.a.f;
                    ygg.y(bVar2, t8bVarM2, fVar);
                    gl2.a.C0251a c0251a2 = gl2.a.j;
                    if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode2))) {
                        uz.g(iHashCode2, bVar2, iHashCode2, c0251a2);
                    }
                    gl2.a.e eVar = gl2.a.d;
                    ygg.y(bVar2, eVarC2, eVar);
                    ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, bVar2, 0);
                    int iHashCode3 = Long.hashCode(bVar2.k());
                    t8b t8bVarM3 = bVar2.m();
                    e eVarC3 = c.c(bVar2, aVar);
                    if (bVar2.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar2.B();
                    if (bVar2.f()) {
                        bVar2.y(aVar3);
                    } else {
                        bVar2.n();
                    }
                    ygg.y(bVar2, ob2VarA, dVar);
                    ygg.y(bVar2, t8bVarM3, fVar);
                    if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode3))) {
                        uz.g(iHashCode3, bVar2, iHashCode3, c0251a2);
                    }
                    ygg.y(bVar2, eVarC3, eVar);
                    String strE = svbVar.Y;
                    if (strE == null) {
                        strE = l.e(bVar2, -1152834895, R.string.resume_section_additional_information, bVar2);
                    } else {
                        bVar2.L(-1152836972);
                        bVar2.F();
                    }
                    cif.c(v1c.j(strE), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, v1c.d(o97Var, false), bVar2, 0, 0, 131070);
                    bVar2.q();
                    bVar2.q();
                } else {
                    bVar2.D();
                }
                return j6g.a;
            case 4:
                return RNProfileFormsModule.presentNativeResumeOtherSectionForm$lambda$28$lambda$21((Promise) obj4, (RNProfileFormsModule) obj3, (hs7) obj, (is7) obj2);
            default:
                huc hucVar = (huc) obj3;
                ApiError apiError = (ApiError) obj;
                apiError.getClass();
                ((zk6) ((xgg) obj4).d.getValue()).getClass();
                zk6.b(apiError, (Request) obj2);
                ErrorData error = apiError.getError();
                if (wve.E(error != null ? error.getCode() : null, "409", false)) {
                    hucVar.element = true;
                }
                return j6g.a;
        }
    }

    public /* synthetic */ td(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
