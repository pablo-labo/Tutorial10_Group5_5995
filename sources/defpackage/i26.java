package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class i26 {
    public static final List<vd2> a;
    public static final List<vd2> b;
    public static final List<vd2> c;

    static {
        ud2 ud2VarA = rd2.a(xb6.a);
        zr4 zr4Var = zr4.a;
        List<vd2> listM = k20.m("isEnabled", ud2VarA, zr4Var, zr4Var, zr4Var);
        a = listM;
        List<vd2> listL = w20.l("onlineStatusPreference", rd2.a(eta.a), zr4Var, zr4Var, listM);
        b = listL;
        sna snaVar = tsa.a;
        snaVar.getClass();
        c = v40.i("onlineActivityPreferences", snaVar, zr4Var, zr4Var, listL);
    }
}
