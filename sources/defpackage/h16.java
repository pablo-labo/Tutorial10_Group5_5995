package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class h16 {
    public static final List<vd2> a;
    public static final List<vd2> b;

    static {
        ud2 ud2VarA = rd2.a(wb6.a);
        zr4 zr4Var = zr4.a;
        List<vd2> listM = k20.m("enabled", ud2VarA, zr4Var, zr4Var, zr4Var);
        a = listM;
        b = w20.l("jobSeekerProfileDualResumesEnabled", rd2.a(i18.a), zr4Var, zr4Var, listM);
    }
}
