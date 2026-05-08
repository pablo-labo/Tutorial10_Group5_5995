package defpackage;

import defpackage.rw5;
import defpackage.t4c;
import io.jsonwebtoken.JwtParser;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class cp1 extends e8e {
    public static final cp1 m;

    static {
        s45 s45Var = new s45();
        kp1.a(s45Var);
        rw5.e<e5c, Integer> eVar = kp1.a;
        eVar.getClass();
        rw5.e<w4c, List<t4c>> eVar2 = kp1.c;
        eVar2.getClass();
        rw5.e<u4c, List<t4c>> eVar3 = kp1.b;
        eVar3.getClass();
        rw5.e<b5c, List<t4c>> eVar4 = kp1.d;
        eVar4.getClass();
        rw5.e<g5c, List<t4c>> eVar5 = kp1.e;
        eVar5.getClass();
        rw5.e<g5c, List<t4c>> eVar6 = kp1.f;
        eVar6.getClass();
        rw5.e<g5c, List<t4c>> eVar7 = kp1.g;
        eVar7.getClass();
        rw5.e<z4c, List<t4c>> eVar8 = kp1.i;
        eVar8.getClass();
        rw5.e<g5c, t4c.b.c> eVar9 = kp1.h;
        eVar9.getClass();
        rw5.e<n5c, List<t4c>> eVar10 = kp1.j;
        eVar10.getClass();
        rw5.e<j5c, List<t4c>> eVar11 = kp1.k;
        eVar11.getClass();
        rw5.e<l5c, List<t4c>> eVar12 = kp1.l;
        eVar12.getClass();
        m = new cp1(s45Var, eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9, eVar10, eVar11, eVar12);
    }

    public static String a(mq5 mq5Var) {
        String strC;
        mq5Var.getClass();
        StringBuilder sb = new StringBuilder();
        nq5 nq5Var = mq5Var.a;
        sb.append(wve.H(nq5Var.a, JwtParser.SEPARATOR_CHAR, '/'));
        sb.append('/');
        if (nq5Var.c()) {
            strC = "default-package";
        } else {
            strC = nq5Var.f().c();
            strC.getClass();
        }
        sb.append(strC.concat(".kotlin_builtins"));
        return sb.toString();
    }
}
