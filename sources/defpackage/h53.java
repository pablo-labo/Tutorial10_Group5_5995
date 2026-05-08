package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class h53 {
    public static final List<vd2> a;
    public static final List<vd2> b;

    static {
        mb3 mb3Var = pwg.a;
        mb3Var.getClass();
        zr4 zr4Var = zr4.a;
        List<vd2> listA0 = u63.a0(new pd2("emailPhoneRedactedResumeUrl", mb3Var, zr4Var, zr4Var, zr4Var), new pd2("nameEmailPhoneRedactedResumeUrl", mb3Var, zr4Var, zr4Var, zr4Var), new pd2("originalResumeUrl", mb3Var, zr4Var, zr4Var, zr4Var), new pd2("pdfResumeUrl", mb3Var, zr4Var, zr4Var, zr4Var));
        a = listA0;
        sna snaVar = k53.a;
        snaVar.getClass();
        b = v40.i("createJobSeekerProfileResumeFileTempUrls", snaVar, zr4Var, zr4Var, listA0);
    }
}
