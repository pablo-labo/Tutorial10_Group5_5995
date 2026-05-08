package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class m53 {
    public static final List<vd2> a;
    public static final List<vd2> b;

    static {
        ud2 ud2VarA = rd2.a(pwg.a);
        zr4 zr4Var = zr4.a;
        List<vd2> listA0 = u63.a0(new pd2("uploadURL", ud2VarA, zr4Var, zr4Var, zr4Var), new pd2("fileId", rd2.a(oc6.a), zr4Var, zr4Var, zr4Var));
        a = listA0;
        sna snaVar = p53.a;
        snaVar.getClass();
        b = v40.i("createJobSeekerProfileUploadResumeFileTempUrl", snaVar, zr4Var, zr4Var, listA0);
    }
}
