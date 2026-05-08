package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class nk8 {
    public static final List<vd2> a;
    public static final List<vd2> b;
    public static final List<vd2> c;

    static {
        gy2.a.getClass();
        bw4 bw4Var = gy2.b;
        bw4Var.getClass();
        zr4 zr4Var = zr4.a;
        List<vd2> listZ = u63.Z(new pd2("role", bw4Var, zr4Var, zr4Var, zr4Var));
        a = listZ;
        mb3 mb3Var = pc6.a;
        List<vd2> listA0 = u63.a0(new pd2("contentHash", rd2.a(mb3Var), zr4Var, zr4Var, zr4Var), new pd2("fileName", new ud2(mb3Var), zr4Var, zr4Var, zr4Var), new pd2("fileExtension", new ud2(mb3Var), zr4Var, zr4Var, zr4Var));
        b = listA0;
        pd2 pd2Var = new pd2("id", rd2.a(hc6.a), zr4Var, zr4Var, zr4Var);
        sw2.a.getClass();
        pd2 pd2Var2 = new pd2("type", rd2.a(sw2.b), zr4Var, zr4Var, zr4Var);
        qw2.a.getClass();
        bw4 bw4Var2 = qw2.b;
        bw4Var2.getClass();
        c = u63.a0(pd2Var, pd2Var2, new pd2("subType", bw4Var2, zr4Var, zr4Var, zr4Var), new pd2("messagePreview", mb3Var, zr4Var, zr4Var, zr4Var), new pd2("publicationDateTime", rd2.a(qg3.a), zr4Var, zr4Var, zr4Var), new pd2("author", rd2.a(gw2.a), zr4Var, zr4Var, listZ), new pd2("attachments", new ud2(new sd2(rd2.a(xu2.a))), zr4Var, zr4Var, listA0), new pd2("__typename", new ud2(mb3Var), zr4Var, zr4Var, zr4Var));
    }
}
