package defpackage;

import android.content.Context;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jobsearch.JobSearchApplication;
import com.indeed.android.jobsearch.webview.indeedapply.IndeedApplyWebViewFragment;
import com.indeed.android.profile.screens.sheets.profilesubtab.award.a;
import defpackage.os7;
import defpackage.r87;
import defpackage.s87;
import defpackage.sp7;
import defpackage.ur7;
import defpackage.yj3;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nv implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nv(Object obj, int i) {
        this.a = i;
        this.b = obj;
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
    @Override // defpackage.gu5
    public final Object invoke() {
        int i = 12;
        int i2 = 1;
        switch (this.a) {
            case 0:
                ((pv) this.b).close();
                return j6g.a;
            case 1:
                return ((zcf) this.b).g0();
            case 2:
                pm0 pm0Var = (pm0) this.b;
                bu8 bu8Var = bu8.a;
                long jCurrentTimeMillis = System.currentTimeMillis();
                bu8Var.getClass();
                bu8.i0.b(bu8.b[18], bu8Var, Long.valueOf(jCurrentTimeMillis));
                pm0Var.F(false, false);
                Lazy<s87> lazy = s87.f;
                s87.a.a(pm0Var.M(), tx5.g(pm0Var.g0, "app_rating_multi_prompt_play_store", null, 6));
                ((hn0) pm0Var.h0.getValue()).b(null);
                return j6g.a;
            case 3:
                pif pifVar = (pif) this.b;
                return Boolean.valueOf(pifVar != null ? ((Boolean) new fd1(pifVar, i2).invoke()).booleanValue() : false);
            case 4:
                return u63.Z((yj3.a) this.b);
            case 5:
                gr2 gr2Var = (gr2) this.b;
                i1g i1gVar = (i1g) cr8.p(i1g.class);
                lr5 lr5VarU = gr2Var.requireActivity().u();
                lr5VarU.getClass();
                i1gVar.a(lr5VarU, new h23());
                return j6g.a;
            case 6:
                ((o03) this.b).l0.h(true);
                return Boolean.TRUE;
            case 7:
                return new bxb(((a) this.b).g0);
            case 8:
                ut5 ut5Var = (ut5) this.b;
                ((yof) ut5Var.Z.getValue()).a("ian-full-screen-detail-view");
                ((apf) ut5Var.f0.getValue()).g();
                return j6g.a;
            case DatadogLogGenerator.CRASH /* 9 */:
                ((gme) ((IndeedApplyWebViewFragment) this.b).Q().W).setValue(Boolean.FALSE);
                return j6g.a;
            case 10:
                s87 s87Var = (s87) this.b;
                r87.a aVar = r87.Companion;
                Context context = s87Var.a;
                JobSearchApplication jobSearchApplication = JobSearchApplication.X;
                ew4 ew4Var = fw4.b;
                aVar.getClass();
                context.getClass();
                ew4Var.getClass();
                r87 r87Var = r87.d;
                if (r87Var == null) {
                    synchronized (aVar) {
                        r87Var = r87.d;
                        if (r87Var == null) {
                            r87Var = new r87(context, ew4Var);
                            r87.d = r87Var;
                        }
                        break;
                    }
                }
                return r87Var;
            case 11:
                ((mk7) this.b).q(true);
                return j6g.a;
            case 12:
                o99 o99Var = (o99) this.b;
                vr7 vr7Var = (vr7) cr8.p(vr7.class);
                lr5 lr5VarU2 = o99Var.requireActivity().u();
                lr5VarU2.getClass();
                vr7Var.b(lr5VarU2, new os7.b(null, new fm0(i)), ur7.a.a);
                return j6g.a;
            case 13:
                i5a i5aVar = (i5a) this.b;
                Lazy<s87> lazy2 = s87.f;
                s87.a.a((gz4) i5aVar.e.getValue(), tx5.k(i5aVar.X, "myjobs_logged_out_screen", "signInButton", null, 12));
                i5aVar.R();
                return j6g.a;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                b8a b8aVar = (b8a) this.b;
                int i3 = b8a.o0;
                b8aVar.Y.j("MY_JOBS");
                b8aVar.b0().h(false);
                b8aVar.W(gq6.IDV_CLOSE);
                return j6g.a;
            case 15:
                ((qlb) this.b).R().u(usb.a);
                return j6g.a;
            case 16:
                Function1 function1 = (Function1) this.b;
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-preferences-tab", "job-title-preference", null, null, 12));
                function1.invoke(pjb.a);
                return j6g.a;
            case 17:
                Function2 function2 = (Function2) this.b;
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-tab", "edit-skills", null, null, 12));
                function2.invoke(hvb.e0, "");
                return j6g.a;
            case 18:
                f7d.c((f7d) this.b, false, Long.valueOf(System.currentTimeMillis()), null, 4);
                return j6g.a;
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                dkd dkdVar = (dkd) this.b;
                uld<T, Object> uldVar = dkdVar.a;
                T t = dkdVar.d;
                if (t != 0) {
                    return uldVar.a(dkdVar, t);
                }
                l5.q("Value should be initialized");
                return null;
            case 20:
                return Boolean.valueOf(((jsd) this.b).c0);
            case 21:
                ((cud) this.b).z();
                return j6g.a;
            case 22:
                ooa ooaVar = (ooa) ((gme) ((j4e) this.b).q).getValue();
                return new ooa(ooaVar != null ? ooaVar.a : 9205357640488583168L);
            case 23:
                String str = (String) this.b;
                r97.a.getClass();
                return Boolean.valueOf(r97.j(str));
            default:
                com.indeed.android.jobsearch.viewjob.a aVar2 = (com.indeed.android.jobsearch.viewjob.a) this.b;
                int i4 = com.indeed.android.jobsearch.viewjob.a.H0;
                if (aVar2.isVisible()) {
                    try {
                        if (((ik3) aVar2.m0.getValue()).b) {
                            ArrayList arrayList = lz2.a;
                            lz2.d("view-job-bottom-sheet", "UIPContext.deeplink.notifyDeepLinkLoadCompleted()", false, null);
                            ((c1g) cr8.p(c1g.class)).a();
                        }
                    } catch (Exception e) {
                        ArrayList arrayList2 = lz2.a;
                        lz2.b("view-job-bottom-sheet", "ViewJob modal destroyed before initializing Home page in the background", false, e);
                    }
                    break;
                }
                return j6g.a;
        }
    }
}
