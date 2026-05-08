package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class wu7 {
    public static final List<ef0> a;
    public static final List<ef0> b;
    public static final Map<mq5, vu7> c;
    public static final Map<mq5, vu7> d;
    public static final LinkedHashMap e;

    static {
        ef0 ef0Var = ef0.TYPE_PARAMETER_BOUNDS;
        ef0 ef0Var2 = ef0.TYPE_USE;
        ef0 ef0Var3 = ef0.FIELD;
        ef0 ef0Var4 = ef0.METHOD_RETURN_TYPE;
        ef0 ef0Var5 = ef0.VALUE_PARAMETER;
        List<ef0> listA0 = u63.a0(ef0Var3, ef0Var4, ef0Var5, ef0Var, ef0Var2);
        a = listA0;
        List<ef0> listZ = u63.Z(ef0Var5);
        b = listZ;
        mq5 mq5Var = lc8.a;
        lma lmaVar = lma.c;
        List<ef0> list = listA0;
        Map<mq5, vu7> mapA0 = lc9.a0(new Pair(mq5Var, new vu7(new mma(lmaVar), list, false)), new Pair(lc8.b, new vu7(new mma(lmaVar), list, false)), new Pair(lc8.c, new vu7(new mma(lma.a), list)));
        c = mapA0;
        List<ef0> list2 = listZ;
        Map<mq5, vu7> mapA02 = lc9.a0(new Pair(lc8.h, new vu7(new mma(lmaVar), list2)), new Pair(lc8.i, new vu7(new mma(lma.b), list2)));
        d = mapA02;
        e = lc9.c0(mapA0, mapA02);
    }
}
