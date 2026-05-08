package defpackage;

import android.util.Log;
import androidx.compose.runtime.b;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.indeed.android.backendservices.common.api.ApiError;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.d98;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import okhttp3.Request;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e45 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e45(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        b.a.C0020a c0020a = b.a.a;
        int i2 = 2;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                f45 f45Var = (f45) obj3;
                String str = (String) obj;
                Map<?, ?> map = (Map) obj2;
                str.getClass();
                if (map == null) {
                    map = bs4.a;
                }
                try {
                    ey4 ey4Var = (ey4) f45Var.b.getValue();
                    if (ey4Var != null) {
                        ey4Var.b(str, map);
                    }
                    break;
                } catch (IllegalArgumentException e) {
                    Log.e("ESRModule", "Failed to send event: ".concat(str), e);
                }
                return j6g.a;
            case 1:
                ut5 ut5Var = (ut5) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    m0f.a(null, null, 0L, 0L, null, 0.0f, bh2.c(-153140800, new ed(ut5Var, i2), bVar), bVar, 1572864, 63);
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 2:
                o97 o97Var = (o97) obj3;
                b bVar2 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    wq6.b(z2b.a(R.drawable.cross_icon, 0, bVar2), ak2.I(R.string.close_icon, bVar2), null, o97Var.c.a.c, bVar2, 0, 4);
                } else {
                    bVar2.D();
                }
                return j6g.a;
            case 3:
                ((Integer) obj2).getClass();
                b88.d((c88) obj3, (b) obj, ka2.L(1));
                return j6g.a;
            case 4:
                f3f f3fVar = (f3f) obj3;
                b bVar3 = (b) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int i3 = d98.k0;
                if (bVar3.o(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    boolean zK = bVar3.K(f3fVar);
                    Object objV = bVar3.v();
                    if (zK || objV == c0020a) {
                        objV = new d98.a(f3fVar, null);
                        bVar3.p(objV);
                    }
                    to4.d(bVar3, f3fVar, (Function2) objV);
                } else {
                    bVar3.D();
                }
                return j6g.a;
            case 5:
                com.indeed.android.profile.screens.sheets.profilesubtab.skills.b bVar4 = (com.indeed.android.profile.screens.sheets.profilesubtab.skills.b) obj3;
                ps7 ps7Var = (ps7) obj;
                qs7 qs7Var = (qs7) obj2;
                ps7Var.getClass();
                Log.d("ManageSkillsFlowBottomSheet", "Skill-BuildSuggestion onCompletion: " + ps7Var);
                if (ps7Var == ps7.a && qs7Var != null) {
                    Log.d("ManageSkillsFlowBottomSheet", "Adding new skill: " + qs7Var.a);
                    yvb yvbVarQ = bVar4.Q();
                    zie zieVarN = jsb.n(qs7Var, null);
                    ArrayList arrayListB1 = z92.B1(yvbVarQ.v().R);
                    arrayListB1.add(zieVarN);
                    ((gme) yvbVarQ.d).setValue(svb.a(yvbVarQ.v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, arrayListB1, null, null, null, false, null, false, null, false, null, null, null, -1, 8386559));
                }
                return j6g.a;
            case 6:
                ((Integer) obj2).getClass();
                s7b.f((t7b) obj3, (b) obj, ka2.L(1));
                return j6g.a;
            case 7:
                xac xacVar = (xac) obj3;
                b bVar5 = (b) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (bVar5.o(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    String strI = ak2.I(R.string.rnace_logged_out_screen_title, bVar5);
                    String strI2 = ak2.I(R.string.rnace_create_account, bVar5);
                    String strI3 = ak2.I(R.string.rnace_sign_in, bVar5);
                    x2b x2bVarA = z2b.a(R.drawable.hero_working_9, 0, bVar5);
                    boolean zX = bVar5.x(xacVar);
                    Object objV2 = bVar5.v();
                    if (zX || objV2 == c0020a) {
                        objV2 = new oq(xacVar, 22);
                        bVar5.p(objV2);
                    }
                    w39.a(null, strI, null, strI2, strI3, x2bVarA, (gu5) objV2, bVar5, 390);
                } else {
                    bVar5.D();
                }
                return j6g.a;
            case 8:
                ((Integer) obj2).getClass();
                nec.g((gu5) obj3, (b) obj, ka2.L(1));
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                ApiError apiError = (ApiError) obj;
                apiError.getClass();
                ((zk6) ((czc) obj3).f.getValue()).getClass();
                zk6.b(apiError, (Request) obj2);
                return j6g.a;
            default:
                return new lh7(((long) ((c20.b) obj3).a(0, (int) (((th7) obj).a >> 32), (vl8) obj2)) << 32);
        }
    }

    public /* synthetic */ e45(Object obj, int i, int i2) {
        this.a = i2;
        this.b = obj;
    }
}
