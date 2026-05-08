package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class r16 {
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
        pd2 pd2Var = new pd2("id", ud2VarA, zr4Var, zr4Var, zr4Var);
        mb3 mb3Var2 = nc6.a;
        mb3Var2.getClass();
        pd2 pd2Var2 = new pd2("clientApp", mb3Var2, zr4Var, zr4Var, zr4Var);
        pd2 pd2Var3 = new pd2("fileName", mb3Var2, zr4Var, zr4Var, zr4Var);
        t18.a.getClass();
        bw4 bw4Var = t18.b;
        bw4Var.getClass();
        pd2 pd2Var4 = new pd2("fileType", bw4Var, zr4Var, zr4Var, zr4Var);
        pd2 pd2Var5 = new pd2("mediaType", mb3Var2, zr4Var, zr4Var, zr4Var);
        pd2 pd2Var6 = new pd2("fileDescription", mb3Var2, zr4Var, zr4Var, zr4Var);
        pd2 pd2Var7 = new pd2("extension", mb3Var2, zr4Var, zr4Var, zr4Var);
        pd2 pd2Var8 = new pd2("standardHashCode", mb3Var2, zr4Var, zr4Var, zr4Var);
        mb3 mb3Var3 = wg7.a;
        mb3Var3.getClass();
        List<vd2> listA0 = u63.a0(pd2Var, pd2Var2, pd2Var3, pd2Var4, pd2Var5, pd2Var6, pd2Var7, pd2Var8, new pd2("uploadTimestamp", mb3Var3, zr4Var, zr4Var, zr4Var));
        a = listA0;
        pd2 pd2Var9 = new pd2("url", new ud2(mb3Var2), zr4Var, zr4Var, zr4Var);
        sna snaVar = s18.a;
        List<vd2> listA02 = u63.a0(pd2Var9, new pd2("metadata", rd2.a(snaVar), zr4Var, zr4Var, listA0));
        b = listA02;
        List<vd2> listA03 = u63.a0(new pd2("id", new ud2(mb3Var), zr4Var, zr4Var, zr4Var), new pd2("clientApp", mb3Var2, zr4Var, zr4Var, zr4Var), new pd2("fileName", mb3Var2, zr4Var, zr4Var, zr4Var), new pd2("fileType", bw4Var, zr4Var, zr4Var, zr4Var), new pd2("mediaType", mb3Var2, zr4Var, zr4Var, zr4Var), new pd2("fileDescription", mb3Var2, zr4Var, zr4Var, zr4Var), new pd2("extension", mb3Var2, zr4Var, zr4Var, zr4Var), new pd2("standardHashCode", mb3Var2, zr4Var, zr4Var, zr4Var), new pd2("uploadTimestamp", mb3Var3, zr4Var, zr4Var, zr4Var));
        c = listA03;
        List<vd2> listA04 = u63.a0(new pd2("url", new ud2(mb3Var2), zr4Var, zr4Var, zr4Var), new pd2("metadata", new ud2(snaVar), zr4Var, zr4Var, listA03));
        d = listA04;
        pd2 pd2Var10 = new pd2("resumeId", new ud2(mb3Var), zr4Var, zr4Var, zr4Var);
        sna snaVar2 = y68.a;
        snaVar2.getClass();
        List<vd2> listA05 = u63.a0(pd2Var10, new pd2("pdfResumeFile", snaVar2, zr4Var, zr4Var, listA02), new pd2("originalUploadedFile", snaVar2, zr4Var, zr4Var, listA04));
        e = listA05;
        List<vd2> listL = w20.l("resumes", new ud2(new sd2(rd2.a(x68.a))), zr4Var, zr4Var, listA05);
        f = listL;
        g = w20.l("jobSeekerResumes", rd2.a(z68.a), zr4Var, zr4Var, listL);
    }
}
