package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class a9d {
    public static final List<vd2> a;
    public static final List<vd2> b;
    public static final List<vd2> c;

    static {
        mb3 mb3Var = nc6.a;
        ud2 ud2VarA = rd2.a(mb3Var);
        zr4 zr4Var = zr4.a;
        pd2 pd2Var = new pd2("__typename", ud2VarA, zr4Var, zr4Var, zr4Var);
        List listZ = u63.Z("JobSeekerProfileTaxonomyConceptWithName");
        List<vd2> list = jbf.b;
        List<vd2> listA0 = u63.a0(pd2Var, s40.b(list, "JobSeekerProfileTaxonomyConceptWithName", listZ, list));
        a = listA0;
        List<vd2> listA02 = u63.a0(new pd2("__typename", new ud2(mb3Var), zr4Var, zr4Var, zr4Var), new qd2("JobSeekerProfileTaxonomyConceptWithName", u63.Z("JobSeekerProfileTaxonomyConceptWithName"), list));
        b = listA02;
        pd2 pd2Var2 = new pd2("id", rd2.a(fc6.a), zr4Var, zr4Var, zr4Var);
        sna snaVar = p68.a;
        snaVar.getClass();
        c = u63.a0(pd2Var2, new pd2("taxonomyConceptLanguage", snaVar, zr4Var, zr4Var, listA0), new pd2("taxonomyConceptProficiency", snaVar, zr4Var, zr4Var, listA02));
    }
}
