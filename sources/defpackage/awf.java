package defpackage;

import defpackage.gwf;
import defpackage.in9;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: loaded from: classes3.dex */
public final class awf {
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static gwf b(p7g p7gVar, gwf gwfVar) {
        if (pnb.D(p7gVar)) {
            return p7gVar.L0();
        }
        gwf gwfVarL0 = p7gVar.L0();
        gwfVar.getClass();
        gwf.a aVar = gwf.b;
        gwfVarL0.getClass();
        if (gwfVar.isEmpty() && gwfVarL0.isEmpty()) {
            return gwfVar;
        }
        ArrayList arrayList = new ArrayList();
        Collection collectionValues = ((ConcurrentHashMap) aVar.a).values();
        collectionValues.getClass();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            ewf ewfVar = (ewf) gwfVar.a.get(iIntValue);
            ewf ewfVar2 = (ewf) gwfVarL0.a.get(iIntValue);
            of0 of0VarA = ewfVar == null ? ewfVar2 != null ? ewfVar2.a(ewfVar) : null : ewfVar.a(ewfVar2);
            if (of0VarA != null) {
                arrayList.add(of0VarA);
            }
        }
        return gwf.a.e(arrayList);
    }

    public final void a(lf0 lf0Var, lf0 lf0Var2) {
        HashSet hashSet = new HashSet();
        Iterator<af0> it = lf0Var.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().h());
        }
        Iterator<af0> it2 = lf0Var2.iterator();
        while (it2.hasNext()) {
            hashSet.contains(it2.next().h());
        }
    }

    public final mge c(n87 n87Var, gwf gwfVar, boolean z, int i, boolean z2) {
        zvf zvfVar = (zvf) n87Var.b;
        wxf wxfVarD = d(new yxf(zvfVar.t0(), ylg.INVARIANT), n87Var, null, i);
        ui8 type = wxfVarD.getType();
        type.getClass();
        mge mgeVarA = dyf.a(type);
        if (pnb.D(mgeVarA)) {
            return mgeVarA;
        }
        wxfVarD.c();
        a(mgeVarA.getAnnotations(), pf0.a(gwfVar));
        if (!pnb.D(mgeVarA)) {
            mgeVarA = dyf.d(mgeVarA, null, b(mgeVarA, gwfVar), 1);
        }
        mge mgeVarI = kyf.i(mgeVarA, z);
        mgeVarI.getClass();
        if (!z2) {
            return mgeVarI;
        }
        kwf kwfVarJ = zvfVar.j();
        kwfVarJ.getClass();
        return uoe.c(mgeVarI, yi8.d(in9.b.b, gwfVar, kwfVarJ, (List) n87Var.c, z));
    }

    public final wxf d(wxf wxfVar, n87 n87Var, rxf rxfVar, int i) {
        ylg ylgVarZ;
        ui8 oe4Var;
        zvf zvfVar = (zvf) n87Var.b;
        if (i > 100) {
            throw new AssertionError("Too deep recursion while expanding type alias " + zvfVar.getName());
        }
        if (wxfVar.b()) {
            rxfVar.getClass();
            return kyf.j(rxfVar);
        }
        ui8 type = wxfVar.getType();
        type.getClass();
        kwf kwfVarM0 = type.M0();
        kwfVarM0.getClass();
        v62 v62VarD = kwfVarM0.d();
        wxf wxfVar2 = v62VarD instanceof rxf ? (wxf) ((Map) n87Var.d).get(v62VarD) : null;
        ylg ylgVar = ylg.INVARIANT;
        if (wxfVar2 != null) {
            if (wxfVar2.b()) {
                rxfVar.getClass();
                return kyf.j(rxfVar);
            }
            p7g p7gVarP0 = wxfVar2.getType().P0();
            ylg ylgVarC = wxfVar2.c();
            ylgVarC.getClass();
            ylg ylgVarC2 = wxfVar.c();
            ylgVarC2.getClass();
            if (ylgVarC2 != ylgVarC && ylgVarC2 != ylgVar) {
                if (ylgVarC == ylgVar) {
                    ylgVarC = ylgVarC2;
                } else {
                    zvfVar.getClass();
                }
            }
            if (rxfVar == null || (ylgVarZ = rxfVar.z()) == null) {
                ylgVarZ = ylgVar;
            }
            if (ylgVarZ == ylgVarC || ylgVarZ == ylgVar) {
                ylgVar = ylgVarC;
            } else if (ylgVarC != ylgVar) {
                zvfVar.getClass();
                ylgVar = ylgVarC;
            }
            a(type.getAnnotations(), p7gVarP0.getAnnotations());
            if (p7gVarP0 instanceof oe4) {
                oe4 oe4Var2 = (oe4) p7gVarP0;
                gwf gwfVarB = b(oe4Var2, type.L0());
                gwfVarB.getClass();
                oe4Var = new oe4(boa.t(oe4Var2.c), gwfVarB);
            } else {
                mge mgeVarI = kyf.i(dyf.a(p7gVarP0), type.N0());
                mgeVarI.getClass();
                gwf gwfVarL0 = type.L0();
                if (!pnb.D(mgeVarI)) {
                    mgeVarI = dyf.d(mgeVarI, null, b(mgeVarI, gwfVarL0), 1);
                }
                oe4Var = mgeVarI;
            }
            return new yxf(oe4Var, ylgVar);
        }
        p7g p7gVarP02 = wxfVar.getType().P0();
        if (!(p7gVarP02 instanceof oe4)) {
            mge mgeVarA = dyf.a(p7gVarP02);
            if (!pnb.D(mgeVarA) && kyf.c(mgeVarA, kad.d, null)) {
                kwf kwfVarM02 = mgeVarA.M0();
                v62 v62VarD2 = kwfVarM02.d();
                kwfVarM02.getParameters().size();
                mgeVarA.K0().size();
                if (!(v62VarD2 instanceof rxf)) {
                    int i2 = 0;
                    if (!(v62VarD2 instanceof zvf)) {
                        mge mgeVarE = e(mgeVarA, n87Var, i);
                        TypeSubstitutor.d(mgeVarE);
                        for (Object obj : mgeVarE.K0()) {
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                u63.o0();
                                throw null;
                            }
                            wxf wxfVar3 = (wxf) obj;
                            if (!wxfVar3.b()) {
                                ui8 type2 = wxfVar3.getType();
                                type2.getClass();
                                if (!kyf.c(type2, jad.d, null)) {
                                    mgeVarA.K0().get(i2);
                                    mgeVarA.M0().getParameters().get(i2);
                                }
                            }
                            i2 = i3;
                        }
                        return new yxf(mgeVarE, wxfVar.c());
                    }
                    zvf zvfVar2 = (zvf) v62VarD2;
                    if (n87Var.a(zvfVar2)) {
                        return new yxf(lx4.c(kx4.d, zvfVar2.getName().a), ylgVar);
                    }
                    List<wxf> listK0 = mgeVarA.K0();
                    ArrayList arrayList = new ArrayList(t92.r0(listK0, 10));
                    for (Object obj2 : listK0) {
                        int i4 = i2 + 1;
                        if (i2 < 0) {
                            u63.o0();
                            throw null;
                        }
                        arrayList.add(d((wxf) obj2, n87Var, kwfVarM02.getParameters().get(i2), i + 1));
                        i2 = i4;
                    }
                    List<rxf> parameters = zvfVar2.j().getParameters();
                    parameters.getClass();
                    List<rxf> list = parameters;
                    ArrayList arrayList2 = new ArrayList(t92.r0(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((rxf) it.next()).a());
                    }
                    return new yxf(uoe.c(c(new n87(n87Var, zvfVar2, arrayList, lc9.f0(z92.H1(arrayList2, arrayList))), mgeVarA.L0(), mgeVarA.N0(), i + 1, false), e(mgeVarA, n87Var, i)), wxfVar.c());
                }
            }
        }
        return wxfVar;
    }

    public final mge e(mge mgeVar, n87 n87Var, int i) {
        kwf kwfVarM0 = mgeVar.M0();
        List<wxf> listK0 = mgeVar.K0();
        ArrayList arrayList = new ArrayList(t92.r0(listK0, 10));
        int i2 = 0;
        for (Object obj : listK0) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                u63.o0();
                throw null;
            }
            wxf wxfVar = (wxf) obj;
            wxf wxfVarD = d(wxfVar, n87Var, kwfVarM0.getParameters().get(i2), i + 1);
            if (!wxfVarD.b()) {
                wxfVarD = new yxf(kyf.h(wxfVarD.getType(), wxfVar.getType().N0()), wxfVarD.c());
            }
            arrayList.add(wxfVarD);
            i2 = i3;
        }
        return dyf.d(mgeVar, arrayList, null, 2);
    }
}
