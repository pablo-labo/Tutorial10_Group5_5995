package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class t36 {
    public static final List<vd2> a;
    public static final List<vd2> b;
    public static final List<vd2> c;
    public static final List<vd2> d;
    public static final List<vd2> e;
    public static final List<vd2> f;
    public static final List<vd2> g;
    public static final List<vd2> h;
    public static final List<vd2> i;
    public static final List<vd2> j;

    static {
        o18.a.getClass();
        bw4 bw4Var = o18.b;
        bw4Var.getClass();
        zr4 zr4Var = zr4.a;
        pd2 pd2Var = new pd2("employmentEligibility", bw4Var, zr4Var, zr4Var, zr4Var);
        mb3 mb3Var = fc6.a;
        List<vd2> listA0 = u63.a0(pd2Var, new pd2("id", rd2.a(mb3Var), zr4Var, zr4Var, zr4Var));
        a = listA0;
        mb3 mb3Var2 = nc6.a;
        mb3Var2.getClass();
        List<vd2> listA02 = u63.a0(new pd2("address", mb3Var2, zr4Var, zr4Var, zr4Var), new pd2("address2", mb3Var2, zr4Var, zr4Var, zr4Var), new pd2("admin1", mb3Var2, zr4Var, zr4Var, zr4Var), new pd2("city", mb3Var2, zr4Var, zr4Var, zr4Var), new pd2("country", mb3Var2, zr4Var, zr4Var, zr4Var), new pd2("formattedLocation", mb3Var2, zr4Var, zr4Var, zr4Var), new pd2("location", mb3Var2, zr4Var, zr4Var, zr4Var), new pd2("postalCode", mb3Var2, zr4Var, zr4Var, zr4Var), new pd2("state", mb3Var2, zr4Var, zr4Var, zr4Var));
        b = listA02;
        pd2 pd2Var2 = new pd2("id", new ud2(mb3Var), zr4Var, zr4Var, zr4Var);
        pd2 pd2Var3 = new pd2("firstName", mb3Var2, zr4Var, zr4Var, zr4Var);
        pd2 pd2Var4 = new pd2("lastName", mb3Var2, zr4Var, zr4Var, zr4Var);
        pd2 pd2Var5 = new pd2("headline", mb3Var2, zr4Var, zr4Var, zr4Var);
        pd2 pd2Var6 = new pd2("phoneNumber", mb3Var2, zr4Var, zr4Var, zr4Var);
        pd2 pd2Var7 = new pd2("employmentEligibilities", new ud2(new sd2(rd2.a(l18.a))), zr4Var, zr4Var, listA0);
        mb3 mb3Var3 = wb6.a;
        mb3Var3.getClass();
        pd2 pd2Var8 = new pd2("showPhoneNumber", mb3Var3, zr4Var, zr4Var, zr4Var);
        sna snaVar = o38.a;
        snaVar.getClass();
        List<vd2> listA03 = u63.a0(pd2Var2, pd2Var3, pd2Var4, pd2Var5, pd2Var6, pd2Var7, pd2Var8, new pd2("location", snaVar, zr4Var, zr4Var, listA02));
        c = listA03;
        List<vd2> listA04 = u63.a0(new pd2("address", mb3Var2, zr4Var, zr4Var, zr4Var), new pd2("address2", mb3Var2, zr4Var, zr4Var, zr4Var), new pd2("admin1", mb3Var2, zr4Var, zr4Var, zr4Var), new pd2("city", mb3Var2, zr4Var, zr4Var, zr4Var), new pd2("country", mb3Var2, zr4Var, zr4Var, zr4Var), new pd2("formattedLocation", mb3Var2, zr4Var, zr4Var, zr4Var), new pd2("location", mb3Var2, zr4Var, zr4Var, zr4Var), new pd2("postalCode", mb3Var2, zr4Var, zr4Var, zr4Var), new pd2("state", mb3Var2, zr4Var, zr4Var, zr4Var));
        d = listA04;
        List<vd2> listA05 = u63.a0(new pd2("firstName", mb3Var2, zr4Var, zr4Var, zr4Var), new pd2("lastName", mb3Var2, zr4Var, zr4Var, zr4Var), new pd2("phoneNumber", mb3Var2, zr4Var, zr4Var, zr4Var), new pd2("location", snaVar, zr4Var, zr4Var, listA04));
        e = listA05;
        r48.a.getClass();
        bw4 bw4Var2 = r48.b;
        bw4Var2.getClass();
        List<vd2> listZ = u63.Z(new pd2("sourcingElection", bw4Var2, zr4Var, zr4Var, zr4Var));
        f = listZ;
        sna snaVar2 = w08.a;
        snaVar2.getClass();
        pd2 pd2Var9 = new pd2("contactInformation", snaVar2, zr4Var, zr4Var, listA05);
        sna snaVar3 = b48.a;
        snaVar3.getClass();
        List<vd2> listA06 = u63.a0(pd2Var9, new pd2("privacy", snaVar3, zr4Var, zr4Var, listZ));
        g = listA06;
        pd2 pd2Var10 = new pd2("resume", new ud2(new sd2(rd2.a(e48.a))), zr4Var, zr4Var, listA03);
        sna snaVar4 = g18.a;
        snaVar4.getClass();
        List<vd2> listA07 = u63.a0(pd2Var10, new pd2("defaultInfo", snaVar4, zr4Var, zr4Var, listA06));
        h = listA07;
        sna snaVar5 = q08.a;
        snaVar5.getClass();
        List<vd2> listI = v40.i("profile", snaVar5, zr4Var, zr4Var, listA07);
        i = listI;
        sna snaVar6 = a48.a;
        snaVar6.getClass();
        j = v40.i("jobSeekerProfile", snaVar6, zr4Var, zr4Var, listI);
    }
}
