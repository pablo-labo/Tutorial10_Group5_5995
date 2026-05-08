package defpackage;

import defpackage.cze;
import defpackage.g69;
import defpackage.jz;
import defpackage.mbb;
import defpackage.pha;
import defpackage.pv7;
import defpackage.ru7;
import defpackage.tv7;
import defpackage.tya;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class ux9 {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();

    public static final phd a(Class<?> cls) {
        jz jzVarL;
        mbb mbbVarL;
        cls.getClass();
        ClassLoader classLoaderD = wuc.d(cls);
        jug jugVar = new jug(classLoaderD);
        ConcurrentHashMap concurrentHashMap = a;
        WeakReference weakReference = (WeakReference) concurrentHashMap.get(jugVar);
        if (weakReference != null) {
            phd phdVar = (phd) weakReference.get();
            if (phdVar != null) {
                return phdVar;
            }
            concurrentHashMap.remove(jugVar, weakReference);
        }
        ee3 ee3Var = ee3.d;
        bwc bwcVar = new bwc(classLoaderD);
        ClassLoader classLoader = j6g.class.getClassLoader();
        classLoader.getClass();
        bwc bwcVar2 = new bwc(classLoader);
        ivc ivcVar = new ivc(classLoaderD);
        ewa ewaVar = ewa.Y;
        j29 j29Var = new j29("DeserializationComponentsForJava.ModuleData");
        pc8 pc8Var = new pc8(j29Var);
        yx9 yx9Var = new yx9(n8a.n("<" + ("runtime module for " + classLoaderD) + '>'), j29Var, pc8Var, 56);
        zfe zfeVar = j29Var.a;
        zfeVar.lock();
        try {
            if (pc8Var.a != null) {
                throw new AssertionError("Built-ins module is already set: " + pc8Var.a + " (attempting to reset to " + yx9Var + ")");
            }
            pc8Var.a = yx9Var;
            zfeVar.unlock();
            pc8Var.f = new r4(yx9Var, 1);
            f14 f14Var = new f14();
            wm2 wm2Var = new wm2();
            cla claVar = new cla(j29Var, yx9Var);
            jh2 jh2Var = new jh2(j29Var);
            mwc mwcVar = new mwc(yx9Var, claVar);
            nw7 nw7Var = nw7.d;
            nw7Var.getClass();
            gf0 gf0Var = new gf0(nw7Var);
            bfe bfeVar = new bfe();
            pha.b.getClass();
            qha qhaVar = pha.a.b;
            jp8 jp8Var = new jp8(new sv7(j29Var, ivcVar, bwcVar, f14Var, efe.a, ewaVar, pv7.a.a, jh2Var, qhd.a, wm2Var, tya.a.a, cze.a.a, g69.a.a, yx9Var, mwcVar, gf0Var, bfeVar, ru7.a.a, tv7.a.a, qhaVar, nw7Var, new hh1(13)));
            us9 us9Var = us9.g;
            us9Var.getClass();
            ou7 ou7Var = new ou7(bwcVar, f14Var);
            kf1 kf1Var = new kf1(yx9Var, claVar, j29Var, bwcVar);
            kf1Var.f = us9Var;
            List listZ = u63.Z(mr3.a);
            ei8 ei8Var = yx9Var.d;
            pc8 pc8Var2 = ei8Var instanceof pc8 ? (pc8) ei8Var : null;
            if (pc8Var2 == null || (jzVarL = pc8Var2.L()) == null) {
                jzVarL = jz.a.a;
            }
            jz jzVar = jzVarL;
            if (pc8Var2 == null || (mbbVarL = pc8Var2.L()) == null) {
                mbbVarL = mbb.b.a;
            }
            jug jugVar2 = jugVar;
            g04 g04Var = new g04(j29Var, yx9Var, ou7Var, kf1Var, jp8Var, ewaVar, dv7.a, zr4.a, claVar, jzVar, mbbVarL, pd8.a, qhaVar, new jh2(j29Var), listZ, ee3Var);
            f14Var.a = g04Var;
            wm2Var.a = new hc0(jp8Var);
            rc8 rc8VarL = pc8Var.L();
            rc8 rc8VarL2 = pc8Var.L();
            jh2 jh2Var2 = new jh2(j29Var);
            rc8VarL.getClass();
            rc8VarL2.getClass();
            vc8 vc8Var = new vc8(j29Var, bwcVar2, yx9Var);
            hzh hzhVar = new hzh(vc8Var);
            cp1 cp1Var = cp1.m;
            vc8Var.d = new g04(j29Var, yx9Var, hzhVar, new se0(yx9Var, claVar, cp1Var), vc8Var, u63.a0(new bp1(j29Var, yx9Var), new nc8(j29Var, yx9Var)), claVar, rc8VarL, rc8VarL2, cp1Var.a, qhaVar, jh2Var2, 262144);
            yx9Var.V = new ze4(ut0.E0(new yx9[]{yx9Var}), 6);
            yx9Var.W = new zl2(u63.a0(jp8Var, vc8Var), "CompositeProvider@RuntimeModuleData for " + yx9Var);
            phd phdVar2 = new phd(g04Var, new uya(f14Var, bwcVar));
            while (true) {
                jug jugVar3 = jugVar2;
                WeakReference weakReference2 = (WeakReference) concurrentHashMap.putIfAbsent(jugVar3, new WeakReference(phdVar2));
                if (weakReference2 == null) {
                    return phdVar2;
                }
                phd phdVar3 = (phd) weakReference2.get();
                if (phdVar3 != null) {
                    return phdVar3;
                }
                concurrentHashMap.remove(jugVar3, weakReference2);
                jugVar2 = jugVar3;
            }
        } finally {
        }
    }
}
