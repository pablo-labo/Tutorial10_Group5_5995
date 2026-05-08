package defpackage;

import androidx.fragment.app.Fragment;
import com.indeed.android.jobsearch.bottomnav.IanInitialState;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class ep6 {
    public static final List<xj1> a;
    public static final List<xj1> b;
    public static final Map<xj1, Function1<IanInitialState, Fragment>> c;
    public static final Set<xj1> d;

    static {
        xj1 xj1Var = xj1.X;
        xj1 xj1Var2 = xj1.Y;
        xj1 xj1Var3 = xj1.Z;
        xj1 xj1Var4 = xj1.a0;
        a = u63.a0(xj1Var, xj1Var2, xj1Var3, xj1Var4);
        xj1 xj1Var5 = xj1.b0;
        b = u63.a0(xj1Var, xj1Var3, xj1Var5, xj1Var4);
        c = lc9.a0(new Pair(xj1Var, new nf(14)), new Pair(xj1Var2, new dc(10)), new Pair(xj1Var5, new hs(9)), new Pair(xj1Var3, new iq0(7)), new Pair(xj1Var4, new vg(13)));
        d = ut0.I0(new xj1[]{xj1.c, xj1.e});
    }
}
