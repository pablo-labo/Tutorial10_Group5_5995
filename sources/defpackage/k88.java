package defpackage;

import com.datadog.android.log.LogAttributes;
import com.datadog.android.rum.internal.metric.SessionEndedMetric;
import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class k88 {
    public static final List<vd2> a;
    public static final List<vd2> b;
    public static final List<vd2> c;
    public static final List<vd2> d;
    public static final List<vd2> e;
    public static final List<vd2> f;
    public static final List<vd2> g;

    static {
        mb3 mb3Var = oc6.a;
        ud2 ud2VarA = rd2.a(mb3Var);
        zr4 zr4Var = zr4.a;
        List<vd2> listA0 = u63.a0(new pd2("name", ud2VarA, zr4Var, zr4Var, zr4Var), new pd2("url", rd2.a(pwg.a), zr4Var, zr4Var, zr4Var));
        a = listA0;
        pd2 pd2Var = new pd2("__typename", new ud2(mb3Var), zr4Var, zr4Var, zr4Var);
        List listZ = u63.Z("MobileAppProctorAllocationResult");
        List<vd2> list = qob.c;
        List<vd2> listA02 = u63.a0(pd2Var, s40.b(list, "MobileAppProctorAllocationResult", listZ, list));
        b = listA02;
        List<vd2> listA03 = u63.a0(new pd2("__typename", new ud2(mb3Var), zr4Var, zr4Var, zr4Var), new qd2("MobileAppProctorAllocationResult", u63.Z("MobileAppProctorAllocationResult"), list));
        c = listA03;
        mb3 mb3Var2 = gc6.a;
        pd2 pd2Var2 = new pd2("deviceId", rd2.a(mb3Var2), zr4Var, zr4Var, zr4Var);
        sna snaVar = ru9.a;
        List<vd2> listA04 = u63.a0(pd2Var2, new pd2("allocationResults", new ud2(new sd2(rd2.a(snaVar))), zr4Var, zr4Var, listA02), new pd2("dynamicAllocationResults", new ud2(new sd2(new ud2(snaVar))), zr4Var, zr4Var, listA03), new pd2("matrixVersion", new ud2(mb3Var), zr4Var, zr4Var, zr4Var), new pd2("proctorResultUpdateInterval", rd2.a(kc6.a), zr4Var, zr4Var, zr4Var), new pd2("proctorAllocationResultString", new ud2(mb3Var), zr4Var, zr4Var, zr4Var), new pd2(SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY, new sd2(new ud2(mb3Var)), zr4Var, zr4Var, zr4Var));
        d = listA04;
        List<vd2> listA05 = u63.a0(new pd2("affiliateKey", mb3Var, zr4Var, zr4Var, zr4Var), new pd2(LogAttributes.HOST, mb3Var, zr4Var, zr4Var, zr4Var), new pd2("keywords", mb3Var, zr4Var, zr4Var, zr4Var), new pd2("newCookieValue", mb3Var, zr4Var, zr4Var, zr4Var), new pd2("refTime", mb3Var, zr4Var, zr4Var, zr4Var), new pd2("refType", mb3Var, zr4Var, zr4Var, zr4Var), new pd2("referrer", mb3Var, zr4Var, zr4Var, zr4Var), new pd2("reqAffiliateKey", mb3Var, zr4Var, zr4Var, zr4Var), new pd2("reqKeywords", mb3Var, zr4Var, zr4Var, zr4Var), new pd2("reqRefType", mb3Var, zr4Var, zr4Var, zr4Var));
        e = listA05;
        pd2 pd2Var3 = new pd2("ctk", mb3Var2, zr4Var, zr4Var, zr4Var);
        pd2 pd2Var4 = new pd2("services", new ud2(new sd2(rd2.a(xg0.a))), zr4Var, zr4Var, listA0);
        pd2 pd2Var5 = new pd2("proctorResult", rd2.a(wu9.a), zr4Var, zr4Var, listA04);
        mb3 mb3Var3 = c23.a;
        mb3Var3.getClass();
        pd2 pd2Var6 = new pd2("ipCountry", mb3Var3, zr4Var, zr4Var, zr4Var);
        pd2 pd2Var7 = new pd2("ipLookupCountry", mb3Var3, zr4Var, zr4Var, zr4Var);
        sna snaVar2 = ix0.a;
        snaVar2.getClass();
        pd2 pd2Var8 = new pd2("attributionParametersPayload", snaVar2, zr4Var, zr4Var, listA05);
        mb3 mb3Var4 = yb6.a;
        mb3Var4.getClass();
        List<vd2> listA06 = u63.a0(pd2Var3, pd2Var4, pd2Var5, pd2Var6, pd2Var7, pd2Var8, new pd2("showBlockingTOSBanner", mb3Var4, zr4Var, zr4Var, zr4Var), new pd2("showForceUpgradeModal", mb3Var4, zr4Var, zr4Var, zr4Var));
        f = listA06;
        sna snaVar3 = nu9.a;
        snaVar3.getClass();
        md2 md2Var = h9c.a;
        hva.a aVar = hva.a.a;
        g = ia.n("jobseekerMobileAppInit", snaVar3, zr4Var, bg.f(md2Var, new hva.c(new wd2("input"))), listA06);
    }
}
