package defpackage;

import defpackage.hva;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class cq {
    public static final List<vd2> a;
    public static final List<vd2> b;
    public static final List<vd2> c;
    public static final List<vd2> d;

    static {
        mb3 mb3Var = ac6.a;
        mb3Var.getClass();
        zr4 zr4Var = zr4.a;
        pd2 pd2Var = new pd2("amount", mb3Var, zr4Var, zr4Var, zr4Var);
        mb3 mb3Var2 = wb6.a;
        mb3Var2.getClass();
        pd2 pd2Var2 = new pd2("amountExists", mb3Var2, zr4Var, zr4Var, zr4Var);
        mb3 mb3Var3 = nc6.a;
        mb3Var3.getClass();
        pd2 pd2Var3 = new pd2("currency", mb3Var3, zr4Var, zr4Var, zr4Var);
        f68.a.getClass();
        bw4 bw4Var = f68.b;
        bw4Var.getClass();
        List<vd2> listA0 = u63.a0(pd2Var, pd2Var2, pd2Var3, new pd2("salaryType", bw4Var, zr4Var, zr4Var, zr4Var));
        a = listA0;
        mb3 mb3Var4 = fc6.a;
        mb3Var4.getClass();
        pd2 pd2Var4 = new pd2("id", mb3Var4, zr4Var, zr4Var, zr4Var);
        sna snaVar = c68.a;
        snaVar.getClass();
        List<vd2> listA02 = u63.a0(pd2Var4, new pd2("minimumPay", snaVar, zr4Var, zr4Var, listA0));
        b = listA02;
        sna snaVar2 = t58.a;
        snaVar2.getClass();
        List<vd2> listI = v40.i("preference", snaVar2, zr4Var, zr4Var, listA02);
        c = listI;
        sna snaVar3 = hq.a;
        snaVar3.getClass();
        md2 md2Var = s4a.O;
        hva.a aVar = hva.a.a;
        d = ia.n("addJobSeekerProfileStructuredDataPreference", snaVar3, zr4Var, bg.f(md2Var, new hva.c(new wd2("input"))), listI);
    }
}
