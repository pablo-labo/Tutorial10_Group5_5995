package defpackage;

import com.datadog.android.rum.internal.RumFeature;
import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ue5 {
    public static final List<vd2> a;
    public static final List<vd2> b;
    public static final List<vd2> c;
    public static final List<vd2> d;
    public static final List<vd2> e;
    public static final List<vd2> f;
    public static final List<vd2> g;

    static {
        mb3 mb3Var = fc6.a;
        ud2 ud2VarA = rd2.a(mb3Var);
        zr4 zr4Var = zr4.a;
        List<vd2> listM = k20.m("leverId", ud2VarA, zr4Var, zr4Var, zr4Var);
        a = listM;
        pd2 pd2Var = new pd2("id", new ud2(mb3Var), zr4Var, zr4Var, zr4Var);
        mb3 mb3Var2 = nc6.a;
        mb3Var2.getClass();
        List<vd2> listA0 = u63.a0(pd2Var, new pd2("label", mb3Var2, zr4Var, zr4Var, zr4Var), new pd2("customClassIds", new ud2(new sd2(new ud2(mb3Var))), zr4Var, zr4Var, zr4Var));
        b = listA0;
        pd2 pd2Var2 = new pd2("id", new ud2(mb3Var), zr4Var, zr4Var, zr4Var);
        pd2 pd2Var3 = new pd2("label", mb3Var2, zr4Var, zr4Var, zr4Var);
        mb3 mb3Var3 = ic6.a;
        mb3Var3.getClass();
        List<vd2> listA02 = u63.a0(pd2Var2, pd2Var3, new pd2("questionAnswerLimit", mb3Var3, zr4Var, zr4Var, zr4Var), new pd2(RumFeature.EVENT_ATTRIBUTES_PROPERTY, new ud2(new sd2(rd2.a(izd.a))), zr4Var, zr4Var, listA0));
        c = listA02;
        List<vd2> listA03 = u63.a0(new pd2("lever", rd2.a(xyd.a), zr4Var, zr4Var, listM), new pd2("workWellbeingQuestions", new ud2(new sd2(rd2.a(jzd.a))), zr4Var, zr4Var, listA02));
        d = listA03;
        List<vd2> listA04 = u63.a0(new pd2("__typename", new ud2(mb3Var2), zr4Var, zr4Var, zr4Var), new qd2("SegmentationWorkWellbeingConfiguration", u63.Z("SegmentationWorkWellbeingConfiguration"), listA03));
        e = listA04;
        List<vd2> listL = w20.l("leverConfigurations", new ud2(new sd2(rd2.a(vyd.a))), zr4Var, zr4Var, listA04);
        f = listL;
        sna snaVar = fzd.a;
        snaVar.getClass();
        md2 md2Var = f9c.b;
        hva.a aVar = hva.a.a;
        g = ia.n("findSegmentationTargetedLeverExperiments", snaVar, zr4Var, bg.f(md2Var, new hva.c(new wd2("input"))), listL);
    }
}
