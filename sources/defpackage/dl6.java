package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.text.Spannable;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.f;
import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import com.indeed.android.jobsearch.R;
import defpackage.af1;
import defpackage.c20;
import defpackage.gl2;
import defpackage.hzf;
import defpackage.o97;
import defpackage.pm8;
import defpackage.vs0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dl6 implements wu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dl6(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.wu5
    public final Object q(Object obj, Object obj2, Object obj3) {
        Typeface typeface;
        int i = this.a;
        b.a.C0020a c0020a = b.a.a;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                gu5 gu5Var = (gu5) obj5;
                gu5 gu5Var2 = (gu5) obj4;
                gza gzaVar = (gza) obj;
                b bVar = (b) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                gzaVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= bVar.K(gzaVar) ? 4 : 2;
                }
                if (bVar.o(iIntValue & 1, (iIntValue & 19) != 18)) {
                    e.a aVar = e.a.b;
                    e eVarA = f.a(pnb.M(androidx.compose.foundation.layout.f.e(g.d(aVar, 1.0f), gzaVar), pnb.L(0, 1, bVar), true), "HttpErrorScreen");
                    af1.a aVar2 = c20.a.n;
                    vs0.c cVar = vs0.e;
                    ob2 ob2VarA = mb2.a(cVar, aVar2, bVar, 54);
                    int iHashCode = Long.hashCode(bVar.k());
                    t8b t8bVarM = bVar.m();
                    e eVarC = c.c(bVar, eVarA);
                    gl2.j.getClass();
                    pm8.a aVar3 = gl2.a.b;
                    if (bVar.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar.B();
                    if (bVar.f()) {
                        bVar.y(aVar3);
                    } else {
                        bVar.n();
                    }
                    gl2.a.d dVar = gl2.a.g;
                    ygg.y(bVar, ob2VarA, dVar);
                    gl2.a.f fVar = gl2.a.f;
                    ygg.y(bVar, t8bVarM, fVar);
                    gl2.a.C0251a c0251a = gl2.a.j;
                    if (bVar.f() || !wl7.b(bVar.v(), Integer.valueOf(iHashCode))) {
                        uz.g(iHashCode, bVar, iHashCode, c0251a);
                    }
                    gl2.a.e eVar = gl2.a.d;
                    ygg.y(bVar, eVarC, eVar);
                    float f = ((Configuration) bVar.M(AndroidCompositionLocals_androidKt.a)).screenHeightDp;
                    o97 o97Var = (o97) bVar.M(p97.a);
                    f17.a(z2b.a(R.drawable.ic_something_wrong, 0, bVar), ak2.I(R.string.something_went_wrong, bVar), g.n(aVar, f / 3.0f), null, null, 0.0f, null, bVar, 0, 120);
                    String strI = ak2.I(R.string.something_went_wrong, bVar);
                    tjf tjfVarA = tjf.a(o97Var.j.f, 0L, 0L, to5.d0, null, null, 0L, 0, 0L, null, null, 0, 16777211);
                    e eVarH = androidx.compose.foundation.layout.f.h(aVar, 0.0f, 16.0f, 1);
                    Object objV = bVar.v();
                    int i2 = 5;
                    if (objV == c0020a) {
                        objV = new tb(i2);
                        bVar.p(objV);
                    }
                    fif.b(strI, b5e.b(eVarH, false, (Function1) objV), 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjfVarA, bVar, 0, 0, 65532);
                    fif.b(ak2.I(R.string.try_refresh_profile, bVar), androidx.compose.foundation.layout.f.h(aVar, 44.0f, 0.0f, 2), 0L, 0L, null, null, 0L, null, new dcf(3), 0L, 0, false, 0, 0, null, o97Var.j.g, bVar, 48, 0, 65020);
                    e eVarV = g.v(androidx.compose.foundation.layout.f.h(aVar, 0.0f, 16.0f, 1), null, 3);
                    ehd ehdVarA = chd.a(cVar, c20.a.k, bVar, 54);
                    int iHashCode2 = Long.hashCode(bVar.k());
                    t8b t8bVarM2 = bVar.m();
                    e eVarC2 = c.c(bVar, eVarV);
                    if (bVar.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar.B();
                    if (bVar.f()) {
                        bVar.y(aVar3);
                    } else {
                        bVar.n();
                    }
                    ygg.y(bVar, ehdVarA, dVar);
                    ygg.y(bVar, t8bVarM2, fVar);
                    if (bVar.f() || !wl7.b(bVar.v(), Integer.valueOf(iHashCode2))) {
                        uz.g(iHashCode2, bVar, iHashCode2, c0251a);
                    }
                    ygg.y(bVar, eVarC2, eVar);
                    e eVarA2 = f.a(g.t(androidx.compose.foundation.layout.f.g(aVar, 16.0f, 24.0f), 0.0f, 150.0f, 1), "HttpErrorScreenPrimaryButton");
                    fv6 fv6Var = fv6.M7;
                    String strI2 = ak2.I(R.string.refresh, bVar);
                    boolean zK = bVar.K(gu5Var);
                    Object objV2 = bVar.v();
                    if (zK || objV2 == c0020a) {
                        objV2 = new mg(5, gu5Var);
                        bVar.p(objV2);
                    }
                    gt6.h(strI2, (gu5) objV2, eVarA2, null, false, false, fv6Var, null, null, bVar, 1572864, 440);
                    e eVarA3 = f.a(aVar, "HttpErrorScreenReportIssueButton");
                    String strI3 = ak2.I(R.string.report_the_issue, bVar);
                    boolean zK2 = bVar.K(gu5Var2);
                    Object objV3 = bVar.v();
                    if (zK2 || objV3 == c0020a) {
                        objV3 = new yw0(2, gu5Var2);
                        bVar.p(objV3);
                    }
                    gt6.m(strI3, (gu5) objV3, eVarA3, null, false, null, null, bVar, 384, DataOkHttpUploader.HTTP_GATEWAY_TIMEOUT);
                    bVar.q();
                    bVar.q();
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 1:
                Context context = (Context) obj5;
                o97 o97Var2 = (o97) obj4;
                b bVar2 = (b) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((xo8) obj).getClass();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    String string = context.getString(R.string.upcoming);
                    string.getClass();
                    o97.g gVar = o97Var2.i;
                    cif.b(string, androidx.compose.foundation.layout.f.j(e.a.b, 16.0f, 16.0f, 0.0f, 0.0f, 12), eu6.m, 0L, null, o97Var2.f.c, null, 0L, null, null, 0L, 0, false, 0, 0, null, o97Var2.j.f, bVar2, 0, 0, 65496);
                } else {
                    bVar2.D();
                }
                return j6g.a;
            case 2:
                androidx.fragment.app.g gVar2 = (androidx.fragment.app.g) obj5;
                wu5 wu5Var = (wu5) obj4;
                b bVar3 = (b) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((pb2) obj).getClass();
                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    boolean zX = bVar3.x(gVar2) | bVar3.K(wu5Var);
                    Object objV4 = bVar3.v();
                    if (zX || objV4 == c0020a) {
                        objV4 = new dzb(gVar2, wu5Var, z ? 1 : 0);
                        bVar3.p(objV4);
                    }
                    q1c.c(48, (gu5) objV4, bVar3, "Review Military Service Suggestion", true);
                } else {
                    bVar3.D();
                }
                return j6g.a;
            default:
                Spannable spannable = (Spannable) obj5;
                j80 j80Var = (j80) obj4;
                foe foeVar = (foe) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                int iIntValue5 = ((Integer) obj3).intValue();
                pn5 pn5Var = foeVar.f;
                to5 to5Var = foeVar.c;
                if (to5Var == null) {
                    to5Var = to5.b0;
                }
                mo5 mo5Var = foeVar.d;
                int i3 = mo5Var != null ? mo5Var.a : 0;
                no5 no5Var = foeVar.e;
                int i4 = no5Var != null ? no5Var.a : 65535;
                k80 k80Var = j80Var.a;
                hzf hzfVarA = k80Var.e.a(pn5Var, to5Var, i3, i4);
                if (hzfVarA instanceof hzf.b) {
                    Object obj6 = ((hzf.b) hzfVarA).a;
                    obj6.getClass();
                    typeface = (Typeface) obj6;
                } else {
                    us1 us1Var = new us1(hzfVarA, k80Var.j);
                    k80Var.j = us1Var;
                    Object obj7 = us1Var.c;
                    obj7.getClass();
                    typeface = (Typeface) obj7;
                }
                spannable.setSpan(new izf(typeface), iIntValue4, iIntValue5, 33);
                return j6g.a;
        }
    }
}
