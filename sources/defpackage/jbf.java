package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class jbf {
    public static final List<vd2> a;
    public static final List<vd2> b;

    static {
        mb3 mb3Var = nc6.a;
        ud2 ud2VarA = rd2.a(mb3Var);
        zr4 zr4Var = zr4.a;
        pd2 pd2Var = new pd2("__typename", ud2VarA, zr4Var, zr4Var, zr4Var);
        List listZ = u63.Z("JobSeekerProfileTaxonomyConcept");
        List<vd2> list = cbf.c;
        List<vd2> listA0 = u63.a0(pd2Var, s40.b(list, "JobSeekerProfileTaxonomyConcept", listZ, list));
        a = listA0;
        pd2 pd2Var2 = new pd2("name", mb3Var, zr4Var, zr4Var, zr4Var);
        sna snaVar = o68.a;
        snaVar.getClass();
        b = u63.a0(pd2Var2, new pd2("taxonomyConceptName", snaVar, zr4Var, zr4Var, listA0));
    }
}
