package defpackage;

import com.datadog.android.ndk.internal.NdkCrashLog;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class e36 {
    public static final List<vd2> a;
    public static final List<vd2> b;
    public static final List<vd2> c;
    public static final List<vd2> d;
    public static final List<vd2> e;

    static {
        mb3 mb3Var = oc6.a;
        mb3Var.getClass();
        zr4 zr4Var = zr4.a;
        List<vd2> listA0 = u63.a0(new pd2("query", mb3Var, zr4Var, zr4Var, zr4Var), new pd2("location", mb3Var, zr4Var, zr4Var, zr4Var));
        a = listA0;
        List<vd2> listA02 = u63.a0(new pd2("uid", new ud2(mb3Var), zr4Var, zr4Var, zr4Var), new pd2(NdkCrashLog.TIMESTAMP_KEY_NAME, rd2.a(omf.a), zr4Var, zr4Var, zr4Var), new pd2("criteria", rd2.a(a08.a), zr4Var, zr4Var, listA0));
        b = listA02;
        List<vd2> listL = w20.l("recentJobSearches", new ud2(new sd2(rd2.a(b08.a))), zr4Var, zr4Var, listA02);
        c = listL;
        List<vd2> listL2 = w20.l("rawActivities", rd2.a(xz7.a), zr4Var, zr4Var, listL);
        d = listL2;
        sna snaVar = d08.a;
        snaVar.getClass();
        e = v40.i("currentJobSeekerPortrait", snaVar, zr4Var, zr4Var, listL2);
    }
}
