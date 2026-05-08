package defpackage;

import defpackage.af1;
import defpackage.c20;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ku4 {
    public static final mvf a = new mvf(a.a, b.a);
    public static final vpe<Float> b = zd0.c(400.0f, null, 5);
    public static final vpe<lh7> c;
    public static final vpe<th7> d;

    public static final class a extends mj8 implements Function1<mrf, de0> {
        public static final a a = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final de0 invoke(mrf mrfVar) {
            long j = mrfVar.a;
            return new de0(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    public static final class b extends mj8 implements Function1<de0, mrf> {
        public static final b a = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final mrf invoke(de0 de0Var) {
            de0 de0Var2 = de0Var;
            return new mrf(vfd.b(de0Var2.a, de0Var2.b));
        }
    }

    static {
        Map<lvf<?, ?>, Float> map = etg.a;
        c = zd0.c(400.0f, new lh7(4294967297L), 1);
        d = zd0.c(400.0f, new th7(4294967297L), 1);
    }

    public static final mv4 a(af1 af1Var, vpe vpeVar, Function1 function1) {
        return new mv4(new gsf((k65) null, (bke) null, new t12(af1Var, vpeVar, function1), (vmd) null, (LinkedHashMap) null, 59));
    }

    public static /* synthetic */ mv4 b() {
        Map<lvf<?, ?>, Float> map = etg.a;
        return a(c20.a.i, zd0.c(400.0f, new th7(4294967297L), 1), wu4.b);
    }

    public static mv4 c(af1.b bVar, int i) {
        Map<lvf<?, ?>, Float> map = etg.a;
        vpe vpeVarC = zd0.c(400.0f, new th7(4294967297L), 1);
        int i2 = i & 2;
        af1.b bVar2 = c20.a.l;
        if (i2 != 0) {
            bVar = bVar2;
        }
        return a(wl7.b(bVar, c20.a.j) ? c20.a.b : wl7.b(bVar, bVar2) ? c20.a.h : c20.a.e, vpeVarC, new yu4(xu4.a));
    }

    public static mv4 d(dvf dvfVar, int i) {
        jf5 jf5VarC = dvfVar;
        if ((i & 1) != 0) {
            jf5VarC = zd0.c(400.0f, null, 5);
        }
        return new mv4(new gsf(new k65(jf5VarC), (bke) null, (t12) null, (vmd) null, (LinkedHashMap) null, 62));
    }

    public static s25 e(dvf dvfVar, int i) {
        jf5 jf5VarC = dvfVar;
        if ((i & 1) != 0) {
            jf5VarC = zd0.c(400.0f, null, 5);
        }
        return new s25(new gsf(new k65(jf5VarC), (bke) null, (t12) null, (vmd) null, (LinkedHashMap) null, 62));
    }

    public static mv4 f(dvf dvfVar) {
        return new mv4(new gsf((k65) null, (bke) null, (t12) null, new vmd(mrf.b, dvfVar), (LinkedHashMap) null, 55));
    }

    public static final s25 g(af1 af1Var, vpe vpeVar, Function1 function1) {
        return new s25(new gsf((k65) null, (bke) null, new t12(af1Var, vpeVar, function1), (vmd) null, (LinkedHashMap) null, 59));
    }

    public static /* synthetic */ s25 h() {
        Map<lvf<?, ?>, Float> map = etg.a;
        return g(c20.a.i, zd0.c(400.0f, new th7(4294967297L), 1), bv4.b);
    }

    public static s25 i(af1.b bVar, int i) {
        Map<lvf<?, ?>, Float> map = etg.a;
        vpe vpeVarC = zd0.c(400.0f, new th7(4294967297L), 1);
        int i2 = i & 2;
        af1.b bVar2 = c20.a.l;
        if (i2 != 0) {
            bVar = bVar2;
        }
        return g(wl7.b(bVar, c20.a.j) ? c20.a.b : wl7.b(bVar, bVar2) ? c20.a.h : c20.a.e, vpeVarC, new dv4(cv4.a));
    }

    public static mv4 j(Function1 function1) {
        Map<lvf<?, ?>, Float> map = etg.a;
        return new mv4(new gsf((k65) null, new bke(new ev4(function1), zd0.c(400.0f, new lh7(4294967297L), 1)), (t12) null, (vmd) null, (LinkedHashMap) null, 61));
    }

    public static mv4 k(Function1 function1, int i) {
        Map<lvf<?, ?>, Float> map = etg.a;
        vpe vpeVarC = zd0.c(400.0f, new lh7(4294967297L), 1);
        if ((i & 2) != 0) {
            function1 = fv4.b;
        }
        return new mv4(new gsf((k65) null, new bke(new gv4(function1), vpeVarC), (t12) null, (vmd) null, (LinkedHashMap) null, 61));
    }

    public static s25 l(Function1 function1) {
        Map<lvf<?, ?>, Float> map = etg.a;
        return new s25(new gsf((k65) null, new bke(new hv4(function1), zd0.c(400.0f, new lh7(4294967297L), 1)), (t12) null, (vmd) null, (LinkedHashMap) null, 61));
    }

    public static s25 m(Function1 function1, int i) {
        Map<lvf<?, ?>, Float> map = etg.a;
        vpe vpeVarC = zd0.c(400.0f, new lh7(4294967297L), 1);
        if ((i & 2) != 0) {
            function1 = iv4.b;
        }
        return new s25(new gsf((k65) null, new bke(new jv4(function1), vpeVarC), (t12) null, (vmd) null, (LinkedHashMap) null, 61));
    }
}
