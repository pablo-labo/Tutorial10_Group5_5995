package defpackage;

import com.datadog.android.rum.internal.RumFeature;
import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class w26 {
    public static final List<vd2> a;
    public static final List<vd2> b;
    public static final List<vd2> c;
    public static final List<vd2> d;

    static {
        ud2 ud2VarA = rd2.a(gc6.a);
        zr4 zr4Var = zr4.a;
        pd2 pd2Var = new pd2("id", ud2VarA, zr4Var, zr4Var, zr4Var);
        mb3 mb3Var = oc6.a;
        List<vd2> listA0 = u63.a0(pd2Var, new pd2("label", rd2.a(mb3Var), zr4Var, zr4Var, zr4Var), new pd2("suid", new ud2(mb3Var), zr4Var, zr4Var, zr4Var));
        a = listA0;
        List<vd2> listL = w20.l(RumFeature.EVENT_ATTRIBUTES_PROPERTY, new ud2(new sd2(rd2.a(t48.a))), zr4Var, zr4Var, listA0);
        b = listL;
        List<vd2> listL2 = w20.l("positivePreferenceAttributesByCustomClass", new ud2(new sd2(rd2.a(u48.a))), zr4Var, zr4Var, listL);
        c = listL2;
        sna snaVar = w58.a;
        snaVar.getClass();
        md2 md2Var = h9c.i;
        hva.a aVar = hva.a.a;
        d = ia.n("jobSeekerProfileStructuredDataPreferenceAttributesByCustomClass", snaVar, zr4Var, bg.f(md2Var, new hva.c(new wd2("input"))), listL2);
    }
}
