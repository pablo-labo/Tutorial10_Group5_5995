package defpackage;

import com.datadog.android.ndk.internal.NdkCrashLog;
import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class znf {
    public static final List<vd2> a;
    public static final List<vd2> b;
    public static final List<vd2> c;

    static {
        mb3 mb3Var = oc6.a;
        ud2 ud2VarA = rd2.a(mb3Var);
        zr4 zr4Var = zr4.a;
        List<vd2> listA0 = u63.a0(new pd2("jobKey", ud2VarA, zr4Var, zr4Var, zr4Var), new pd2("jobSeekerAccountKey", new ud2(mb3Var), zr4Var, zr4Var, zr4Var), new pd2(NdkCrashLog.TIMESTAMP_KEY_NAME, rd2.a(omf.a), zr4Var, zr4Var, zr4Var));
        a = listA0;
        List<vd2> listL = w20.l("topChoices", new ud2(new sd2(rd2.a(a78.a))), zr4Var, zr4Var, listA0);
        b = listL;
        sna snaVar = xnf.a;
        snaVar.getClass();
        md2 md2Var = h9c.h;
        hva.a aVar = hva.a.a;
        c = ia.n("topChoicesAfterDate", snaVar, zr4Var, bg.f(md2Var, new hva.c(new wd2("input"))), listL);
    }
}
