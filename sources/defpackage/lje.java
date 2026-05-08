package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class lje {
    public static final List<vd2> a;
    public static final List<vd2> b;
    public static final List<vd2> c;
    public static final List<vd2> d;

    static {
        mb3 mb3Var = fc6.a;
        ud2 ud2VarA = rd2.a(mb3Var);
        zr4 zr4Var = zr4.a;
        pd2 pd2Var = new pd2("id", ud2VarA, zr4Var, zr4Var, zr4Var);
        mb3 mb3Var2 = nc6.a;
        mb3Var2.getClass();
        List<vd2> listA0 = u63.a0(pd2Var, new pd2("suid", mb3Var2, zr4Var, zr4Var, zr4Var), new pd2("label", mb3Var2, zr4Var, zr4Var, zr4Var));
        a = listA0;
        List<vd2> listA02 = u63.a0(new pd2("label", mb3Var2, zr4Var, zr4Var, zr4Var), new pd2("suid", mb3Var2, zr4Var, zr4Var, zr4Var));
        b = listA02;
        List<vd2> listA03 = u63.a0(new pd2("suid", mb3Var2, zr4Var, zr4Var, zr4Var), new pd2("label", mb3Var2, zr4Var, zr4Var, zr4Var));
        c = listA03;
        pd2 pd2Var2 = new pd2("id", new ud2(mb3Var), zr4Var, zr4Var, zr4Var);
        pd2 pd2Var3 = new pd2("text", mb3Var2, zr4Var, zr4Var, zr4Var);
        mb3 mb3Var3 = wg7.a;
        mb3Var3.getClass();
        pd2 pd2Var4 = new pd2("experience", mb3Var3, zr4Var, zr4Var, zr4Var);
        q68.a.getClass();
        bw4 bw4Var = q68.b;
        bw4Var.getClass();
        pd2 pd2Var5 = new pd2("timeUnit", bw4Var, zr4Var, zr4Var, zr4Var);
        mb3 mb3Var4 = wb6.a;
        mb3Var4.getClass();
        pd2 pd2Var6 = new pd2("isParentCrowtaxoAttribute", mb3Var4, zr4Var, zr4Var, zr4Var);
        sna snaVar = r08.a;
        snaVar.getClass();
        pd2 pd2Var7 = new pd2("childAchievementSkill", snaVar, zr4Var, zr4Var, listA0);
        sna snaVar2 = o68.a;
        snaVar2.getClass();
        pd2 pd2Var8 = new pd2("taxonomyConceptTitle", snaVar2, zr4Var, zr4Var, listA02);
        sna snaVar3 = q48.a;
        snaVar3.getClass();
        d = u63.a0(pd2Var2, pd2Var3, pd2Var4, pd2Var5, pd2Var6, pd2Var7, pd2Var8, new pd2("skillBucket", snaVar3, zr4Var, zr4Var, listA03));
    }
}
