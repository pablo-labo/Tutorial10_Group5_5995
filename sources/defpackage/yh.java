package defpackage;

import android.os.Bundle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jobsearch.searchoverlay.SearchOverlayFragment;
import com.indeed.android.jsmappservices.bridge.BridgeDispatcher;
import com.indeed.android.jsmappservices.bridge.SearchType;
import com.indeed.android.jsmappservices.bridge.results.ActionOverflowResult;
import com.indeed.android.jsmappservices.bridge.results.ActionOverflowResultAction;
import com.indeed.android.myjobs.data.model.dto.SavedJobsDto;
import com.indeed.android.profile.screens.sheets.profilesubtab.skills.b;
import defpackage.cd4;
import defpackage.hva;
import defpackage.lx5;
import defpackage.s87;
import defpackage.sp7;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yh implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yh(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        int i = this.a;
        int i2 = 0;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                bi biVar = (bi) obj2;
                go4 go4Var = (go4) obj;
                go4Var.getClass();
                Bundle arguments = biVar.getArguments();
                if ((arguments == null || !arguments.containsKey("KEY_IS_BUILD_SUGGESTION")) ? false : arguments.getBoolean("KEY_IS_BUILD_SUGGESTION")) {
                    tr7 tr7VarQ = jsb.q(go4Var);
                    biVar.close();
                    Function2<? super ps7, ? super tr7, j6g> function2 = biVar.h0;
                    if (function2 != null) {
                        function2.invoke(ps7.a, tr7VarQ);
                    }
                } else {
                    yvb yvbVarQ = biVar.Q();
                    ai aiVar = new ai(i2, biVar, go4Var);
                    String str2 = yvbVarQ.v().a;
                    if (str2 != null) {
                        u63.Y(ee3.p(yvbVarQ), null, null, new xvb(yvbVarQ, go4Var, str2, aiVar, null), 3);
                    }
                }
                return j6g.a;
            case 1:
                iba ibaVar = (iba) obj2;
                ((m74) obj).getClass();
                ms msVar = new ms();
                ibaVar.b(msVar);
                return new zs(ibaVar, msVar);
            case 2:
                px pxVar = (px) obj2;
                pxVar.f0.invoke((wcf) obj, om2.a(pxVar, AndroidCompositionLocals_androidKt.b));
                return j6g.a;
            case 3:
                BridgeDispatcher.c cVar = (BridgeDispatcher.c) obj2;
                int iIntValue = ((Integer) obj).intValue();
                cVar.a(new ActionOverflowResult(iIntValue == -1 ? ActionOverflowResultAction.c : ActionOverflowResultAction.b, iIntValue));
                return j6g.a;
            case 4:
                Object[] objArr = (Object[]) obj;
                objArr.getClass();
                ((Function2) ((ve8) obj2)).invoke(objArr[0], objArr[1]);
                return j6g.a;
            case 5:
                ((rgf) obj2).q();
                return j6g.a;
            case 6:
                SavedJobsDto savedJobsDto = (SavedJobsDto) obj2;
                lx5.b bVar = (lx5.b) obj;
                bVar.getClass();
                bVar.a("jobKey", savedJobsDto.getJobkey());
                bVar.a("encryptedIaAppId", savedJobsDto.getEncryptedIaAppId());
                return j6g.a;
            case 7:
                lx5.b bVar2 = (lx5.b) obj;
                bVar2.getClass();
                Function1<hr7, j6g> function1 = ((sp7.a) obj2).a;
                if (function1 != null) {
                    function1.invoke(new up7(bVar2));
                }
                return j6g.a;
            case 8:
                ((Integer) obj).intValue();
                return obj2;
            case DatadogLogGenerator.CRASH /* 9 */:
                String str3 = (String) obj;
                str3.getClass();
                yvb yvbVarQ2 = ((o99) obj2).Q();
                List<wj8> list = yvbVarQ2.v().N;
                ArrayList arrayList = new ArrayList(t92.r0(list, 10));
                for (wj8 wj8VarA : list) {
                    if (wl7.b(wj8VarA.b, str3)) {
                        wj8VarA = wj8.a(wj8VarA, false);
                    }
                    arrayList.add(wj8VarA);
                }
                ((gme) yvbVarQ2.d).setValue(svb.a(yvbVarQ2.v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, arrayList, null, null, null, null, null, null, null, false, null, false, null, false, null, null, null, -1, 8388479));
                return j6g.a;
            case 10:
                b bVar3 = (b) obj2;
                zie zieVar = (zie) obj;
                zieVar.getClass();
                if (!bVar3.k0) {
                    bVar3.Q().i(zieVar, new bo0(14));
                }
                return j6g.a;
            case 11:
                hr7 hr7Var = (hr7) obj;
                hr7Var.getClass();
                int iOrdinal = ((w47) obj2).ordinal();
                if (iOrdinal == 0) {
                    str = "messagingInbox";
                } else if (iOrdinal == 1) {
                    str = "messagingArchive";
                } else if (iOrdinal == 2) {
                    str = "messagingSpam";
                } else {
                    if (iOrdinal != 3) {
                        l.g();
                        return null;
                    }
                    str = "messagingDrafts";
                }
                hr7Var.a("fromScreenName", str);
                return j6g.a;
            case 12:
                fma fmaVar = (fma) obj2;
                int i3 = fma.s0;
                if (((d8c) fmaVar.n0.getValue()).c(xj1.f, false)) {
                    dd4 dd4Var = dd4.a;
                    ad4 ad4Var = dd4.n().a;
                    ad4Var.getClass();
                    if (ad4Var.e(cd4.a.n2) != cd4.a4.a.getValue()) {
                        fmaVar.R().h(s8c.WEBVIEW_NOTIFICATIONS);
                    }
                }
                return j6g.a;
            case 13:
                qlb qlbVar = (qlb) obj2;
                zt9 zt9Var = (zt9) obj;
                zt9Var.getClass();
                aub aubVarR = qlbVar.R();
                ui uiVar = new ui(qlbVar, 11);
                f68 f68Var = zt9Var.b;
                if (f68Var == null) {
                    f68Var = f68.W;
                }
                String str4 = zt9Var.d;
                if (str4 == null) {
                    str4 = "USD";
                }
                Double d = zt9Var.a;
                u63.Y(ee3.p(aubVarR), null, null, new ttb(aubVarR, new hva.c(new d68(f68Var, str4, d != null ? d.doubleValue() : 0.0d)), uiVar, null), 3);
                return j6g.a;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                return o6.a((p63) obj, (t41) obj2);
            case 15:
                SearchOverlayFragment searchOverlayFragment = (SearchOverlayFragment) obj2;
                int iIntValue2 = ((Integer) obj).intValue();
                aud audVarH = searchOverlayFragment.H();
                audVarH.getClass();
                Lazy<s87> lazy = s87.f;
                s87.a.a(audVarH.a(), audVarH.b.l(ak2.M(SearchType.b), "what-suggestion-option", zr4.a, m93.c));
                searchOverlayFragment.I().s(iIntValue2, false);
                ((gme) searchOverlayFragment.I().a0).setValue(SearchType.c);
                return j6g.a;
            case 16:
                ((j4e) obj2).l(((Boolean) obj).booleanValue());
                return j6g.a;
            default:
                return Boolean.valueOf(((List) obj).retainAll((Collection) obj2));
        }
    }
}
