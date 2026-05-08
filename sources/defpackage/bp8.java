package defpackage;

import defpackage.lf0;
import defpackage.qp8;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class bp8 implements gu5 {
    public final gp8 a;
    public final mp8 b;

    public bp8(gp8 gp8Var, mp8 mp8Var) {
        this.a = gp8Var;
        this.b = mp8Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [gp8] */
    /* JADX WARN: Type inference failed for: r0v18, types: [gp8] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r26v1 */
    /* JADX WARN: Type inference failed for: r26v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [nu7] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2, types: [mv5, n52, nu7] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.gu5
    public final Object invoke() throws IllegalAccessException, InvocationTargetException {
        lf0.a.C0307a c0307a;
        Object obj;
        ?? r2;
        ?? arrayList;
        ?? r26;
        hv7 hv7Var;
        ?? r0;
        Pair pair;
        gp8 gp8Var = this.a;
        hvc hvcVar = gp8Var.o;
        mp8 mp8Var = gp8Var.b;
        t52 t52Var = gp8Var.n;
        Constructor<?>[] declaredConstructors = hvcVar.a.getDeclaredConstructors();
        declaredConstructors.getClass();
        r6e r6eVarE0 = ut0.e0(declaredConstructors);
        cvc cvcVar = cvc.a;
        cvcVar.getClass();
        boolean z = false;
        cc5 cc5Var = new cc5(r6eVarE0, false, cvcVar);
        dvc dvcVar = dvc.a;
        dvcVar.getClass();
        List<uu7> listW = a7e.W(new xrf(cc5Var, dvcVar));
        ArrayList arrayList2 = new ArrayList(listW.size());
        for (uu7 uu7Var : listW) {
            zo8 zo8VarV = ee3.v(mp8Var, uu7Var);
            sv7 sv7Var = mp8Var.a;
            nu7 nu7VarZ0 = nu7.Z0(t52Var, zo8VarV, z, sv7Var.j.a(uu7Var));
            mp8 mp8Var2 = new mp8(sv7Var, new gqf(mp8Var, nu7VarZ0, uu7Var, t52Var.p().size()), mp8Var.c);
            qp8.b bVarU = qp8.u(mp8Var2, nu7VarZ0, uu7Var.i());
            List<rxf> listP = t52Var.p();
            listP.getClass();
            List<rxf> list = listP;
            ArrayList typeParameters = uu7Var.getTypeParameters();
            ArrayList arrayList3 = new ArrayList(t92.r0(typeParameters, 10));
            Iterator it = typeParameters.iterator();
            while (it.hasNext()) {
                rxf rxfVarA = mp8Var2.b.a((pw7) it.next());
                rxfVarA.getClass();
                arrayList3.add(rxfVarA);
            }
            nu7VarZ0.Y0(bVarU.a, skg.a(uu7Var.getVisibility()), z92.h1(list, arrayList3));
            nu7VarZ0.S0(false);
            nu7VarZ0.T0(bVarU.b);
            nu7VarZ0.U0(t52Var.o());
            mp8Var2.a.g.getClass();
            arrayList2.add(nu7VarZ0);
            z = false;
        }
        boolean z2 = hvcVar.z();
        jyf jyfVar = jyf.b;
        mp8 mp8Var3 = this.b;
        lf0.a.C0307a c0307a2 = lf0.a.a;
        if (z2) {
            nu7 nu7VarZ02 = nu7.Z0(t52Var, c0307a2, true, mp8Var.a.j.a(hvcVar));
            ArrayList<qv7> arrayListV = hvcVar.v();
            ArrayList arrayList4 = new ArrayList(arrayListV.size());
            lw7 lw7VarA = wab.A(jyfVar, false, null, 6);
            int i = 0;
            for (qv7 qv7Var : arrayListV) {
                lf0.a.C0307a c0307a3 = c0307a2;
                arrayList4.add(new slg(nu7VarZ02, null, i, c0307a3, qv7Var.getName(), mp8Var.d.d(qv7Var.getType(), lw7VarA), false, false, false, null, mp8Var.a.j.a(qv7Var)));
                c0307a2 = c0307a3;
                i++;
            }
            c0307a = c0307a2;
            obj = null;
            nu7VarZ02.T0(false);
            e04 visibility = t52Var.getVisibility();
            visibility.getClass();
            if (visibility.equals(yu7.b)) {
                visibility = yu7.c;
                visibility.getClass();
            }
            nu7VarZ02.X0(arrayList4, visibility);
            nu7VarZ02.S0(false);
            nu7VarZ02.U0(t52Var.o());
            String strA = vs9.a(nu7VarZ02, 2);
            if (arrayList2.isEmpty()) {
                arrayList2.add(nu7VarZ02);
                mp8Var3.a.g.getClass();
            } else {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    if (vs9.a((m52) it2.next(), 2).equals(strA)) {
                        break;
                    }
                }
                arrayList2.add(nu7VarZ02);
                mp8Var3.a.g.getClass();
            }
        } else {
            c0307a = c0307a2;
            obj = null;
        }
        mp8Var3.a.x.a(t52Var, arrayList2, mp8Var3);
        bfe bfeVar = mp8Var3.a.r;
        boolean zIsEmpty = arrayList2.isEmpty();
        List listB0 = arrayList2;
        if (zIsEmpty) {
            boolean zW = hvcVar.w();
            hvcVar.y();
            if (zW) {
                sv7 sv7Var2 = mp8Var.a;
                uw7 uw7Var = mp8Var.d;
                nu7 nu7VarZ03 = nu7.Z0(t52Var, c0307a, true, sv7Var2.j.a(hvcVar));
                if (zW) {
                    Collection collectionT = hvcVar.t();
                    arrayList = new ArrayList(collectionT.size());
                    lw7 lw7VarA2 = wab.A(jyfVar, true, null, 6);
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj2 : collectionT) {
                        if (wl7.b(((hv7) obj2).getName(), kc8.b)) {
                            arrayList5.add(obj2);
                        } else {
                            arrayList6.add(obj2);
                        }
                    }
                    Pair pair2 = new Pair(arrayList5, arrayList6);
                    List list2 = (List) pair2.a();
                    List<hv7> list3 = (List) pair2.b();
                    list2.size();
                    hv7 hv7Var2 = (hv7) z92.Q0(list2);
                    if (hv7Var2 != null) {
                        vvc vvcVarL = hv7Var2.l();
                        if (vvcVarL instanceof bvc) {
                            bvc bvcVar = (bvc) vvcVarL;
                            pair = new Pair(uw7Var.c(bvcVar, lw7VarA2, true), uw7Var.d(bvcVar.t(), lw7VarA2));
                        } else {
                            pair = new Pair(uw7Var.d(vvcVarL, lw7VarA2), obj);
                        }
                        ui8 ui8Var = (ui8) pair.a();
                        ui8 ui8Var2 = (ui8) pair.b();
                        ?? r02 = gp8Var;
                        hv7Var = hv7Var2;
                        nu7 nu7Var = nu7VarZ03;
                        r02.v(arrayList, nu7Var, 0, hv7Var, ui8Var, ui8Var2);
                        r0 = r02;
                        r2 = nu7Var;
                    } else {
                        hv7Var = hv7Var2;
                        r2 = nu7VarZ03;
                        r0 = gp8Var;
                    }
                    int i2 = hv7Var != null ? 1 : 0;
                    int i3 = 0;
                    for (hv7 hv7Var3 : list3) {
                        r0.v(arrayList, r2, i3 + i2, hv7Var3, uw7Var.d(hv7Var3.l(), lw7VarA2), null);
                        i3++;
                    }
                } else {
                    r2 = nu7VarZ03;
                    arrayList = Collections.EMPTY_LIST;
                }
                r2.T0(false);
                e04 visibility2 = t52Var.getVisibility();
                visibility2.getClass();
                if (visibility2.equals(yu7.b)) {
                    visibility2 = yu7.c;
                    visibility2.getClass();
                }
                r2.X0(arrayList, visibility2);
                r2.S0(true);
                r2.U0(t52Var.o());
                mp8Var.a.g.getClass();
                r26 = r2;
            } else {
                r26 = obj;
            }
            listB0 = u63.b0(r26);
        }
        return z92.z1(bfeVar.c(mp8Var3, listB0));
    }
}
