package defpackage;

import defpackage.hva;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class r53 {
    public static final List<vd2> a;
    public static final List<vd2> b;

    static {
        mb3 mb3Var = gc6.a;
        ud2 ud2VarA = rd2.a(mb3Var);
        zr4 zr4Var = zr4.a;
        pd2 pd2Var = new pd2("ctk", ud2VarA, zr4Var, zr4Var, zr4Var);
        pd2 pd2Var2 = new pd2("externalId", new ud2(mb3Var), zr4Var, zr4Var, zr4Var);
        woa.a.getClass();
        List<vd2> listA0 = u63.a0(pd2Var, pd2Var2, new pd2("externalIdType", rd2.a(woa.b), zr4Var, zr4Var, zr4Var));
        a = listA0;
        sna snaVar = voa.a;
        snaVar.getClass();
        md2 md2Var = t4a.a;
        hva.a aVar = hva.a.a;
        b = ia.n("createOffsiteCtkDeviceIdMap", snaVar, zr4Var, bg.f(md2Var, new hva.c(lc9.a0(new Pair("ctk", new wd2("ctk")), new Pair("externalId", new wd2("aaid")), new Pair("externalIdType", "AAID")))), listA0);
    }
}
