package defpackage;

import com.datadog.android.rum.internal.RumFeature;
import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class pw {
    public static final List<vd2> a;
    public static final List<vd2> b;
    public static final List<vd2> c;
    public static final List<vd2> d;

    static {
        mb3 mb3Var = gc6.a;
        ud2 ud2VarA = rd2.a(mb3Var);
        zr4 zr4Var = zr4.a;
        pd2 pd2Var = new pd2("id", ud2VarA, zr4Var, zr4Var, zr4Var);
        mb3 mb3Var2 = oc6.a;
        pd2 pd2Var2 = new pd2("label", rd2.a(mb3Var2), zr4Var, zr4Var, zr4Var);
        pd2 pd2Var3 = new pd2("modifiedTime", rd2.a(omf.a), zr4Var, zr4Var, zr4Var);
        i68.a.getClass();
        List<vd2> listA0 = u63.a0(pd2Var, pd2Var2, pd2Var3, new pd2("sentiment", rd2.a(i68.b), zr4Var, zr4Var, zr4Var), new pd2("suid", new ud2(mb3Var2), zr4Var, zr4Var, zr4Var));
        a = listA0;
        List<vd2> listA02 = u63.a0(new pd2("id", new ud2(mb3Var), zr4Var, zr4Var, zr4Var), new pd2(RumFeature.EVENT_ATTRIBUTES_PROPERTY, new ud2(new sd2(rd2.a(t48.a))), zr4Var, zr4Var, listA0));
        b = listA02;
        sna snaVar = tp.a;
        snaVar.getClass();
        List<vd2> listI = v40.i("preference", snaVar, zr4Var, zr4Var, listA02);
        c = listI;
        sna snaVar2 = yp.a;
        snaVar2.getClass();
        md2 md2Var = t4a.f;
        hva.a aVar = hva.a.a;
        d = ia.n("addJobSeekerProfileStructuredDataPreferenceAttributes", snaVar2, zr4Var, bg.f(md2Var, new hva.c(new wd2("input"))), listI);
    }
}
