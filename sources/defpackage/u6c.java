package defpackage;

import com.datadog.android.log.LogAttributes;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class u6c {
    public static final List<vd2> a;
    public static final List<vd2> b;

    static {
        mb3 mb3Var = nc6.a;
        ud2 ud2VarA = rd2.a(mb3Var);
        zr4 zr4Var = zr4.a;
        pd2 pd2Var = new pd2("__typename", ud2VarA, zr4Var, zr4Var, zr4Var);
        List listZ = u63.Z("JobSeekerProfileDateType");
        List<vd2> list = vg3.a;
        List<vd2> listA0 = u63.a0(pd2Var, s40.b(list, "JobSeekerProfileDateType", listZ, list));
        a = listA0;
        pd2 pd2Var2 = new pd2("id", rd2.a(fc6.a), zr4Var, zr4Var, zr4Var);
        sna snaVar = c18.a;
        snaVar.getClass();
        b = u63.a0(pd2Var2, new pd2(LogAttributes.DATE, snaVar, zr4Var, zr4Var, listA0), new pd2("description", mb3Var, zr4Var, zr4Var, zr4Var), new pd2("title", mb3Var, zr4Var, zr4Var, zr4Var), new pd2("url", mb3Var, zr4Var, zr4Var, zr4Var));
    }
}
