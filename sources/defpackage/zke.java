package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class zke {
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
    public static final void a(final qke qkeVar, final e eVar, b bVar, final int i) {
        ah2 ah2Var = hk2.a;
        c cVarH = bVar.h(1354335728);
        int i2 = (i & 6) == 0 ? ((i & 8) == 0 ? cVarH.K(qkeVar) : cVarH.x(qkeVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= cVarH.K(eVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.x(ah2Var) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if (cVarH.o(i2 & 1, (i2 & 147) != 146)) {
            Object objV = cVarH.v();
            if (objV == b.a.a) {
                objV = new n65();
                cVarH.p(objV);
            }
            n65 n65Var = (n65) objV;
            String strU = ewa.u(7, cVarH);
            Object obj = n65Var.a;
            ArrayList arrayList = n65Var.b;
            if (wl7.b(qkeVar, obj)) {
                cVarH.L(95900978);
                cVarH.U(false);
            } else {
                cVarH.L(141556995);
                n65Var.a = qkeVar;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    arrayList2.add((qke) ((m65) arrayList.get(i3)).a);
                }
                ArrayList arrayList3 = new ArrayList(arrayList2);
                if (!arrayList3.contains(qkeVar)) {
                    arrayList3.add(qkeVar);
                }
                arrayList.clear();
                ArrayList arrayListA = fz8.a(arrayList3);
                int size2 = arrayListA.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    qke qkeVar2 = (qke) arrayListA.get(i4);
                    arrayList.add(new m65(qkeVar2, bh2.c(-1032415134, new uke(qkeVar2, qkeVar, arrayList3, n65Var, strU), cVarH)));
                }
                cVarH.U(false);
            }
            ag9 ag9VarD = hl1.d(c20.a.a, false);
            int iG = cVarH.G();
            t8b t8bVarP = cVarH.P();
            e eVarC = androidx.compose.ui.c.c(cVarH, eVar);
            gl2.j.getClass();
            pm8.a aVar = gl2.a.b;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ag9VarD, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iG))) {
                ja.h(iG, cVarH, iG, c0251a);
            }
            ygg.y(cVarH, eVarC, gl2.a.d);
            i iVarS = cVarH.s();
            if (iVarS == null) {
                r6.g("no recompose scope found");
                return;
            }
            cVarH.C(iVarS);
            n65Var.c = iVarS;
            cVarH.L(-1757732554);
            int size3 = arrayList.size();
            for (int i5 = 0; i5 < size3; i5++) {
                m65 m65Var = (m65) arrayList.get(i5);
                qke qkeVar3 = (qke) m65Var.a;
                ah2 ah2Var2 = m65Var.b;
                cVarH.A(-1515535286, qkeVar3);
                ah2Var2.q(bh2.c(2017516783, new vke(qkeVar3), cVarH), cVarH, 6);
                cVarH.U(false);
            }
            cVarH.U(false);
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: ske
                {
                    ah2 ah2Var3 = hk2.a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ah2 ah2Var3 = hk2.a;
                    ((Integer) obj3).getClass();
                    int iL = ka2.L(i | 1);
                    zke.a(qkeVar, eVar, (b) obj2, iL);
                    return j6g.a;
                }
            };
        }
    }

    public static final void b(ale aleVar, e eVar, wu5 wu5Var, b bVar, int i) {
        int i2;
        e eVar2;
        c cVarH = bVar.h(1351125615);
        if ((i & 6) == 0) {
            i2 = (cVarH.K(aleVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 432;
        if (cVarH.o(i3 & 1, (i3 & 147) != 146)) {
            wu5Var = hk2.a;
            qke qkeVar = (qke) ((gme) aleVar.a).getValue();
            g6 g6Var = (g6) cVarH.M(um2.a);
            boolean zX = cVarH.x(qkeVar) | cVarH.x(g6Var);
            Object objV = cVarH.v();
            if (zX || objV == b.a.a) {
                objV = new wke(qkeVar, g6Var, null);
                cVarH.p(objV);
            }
            to4.d(cVarH, qkeVar, (Function2) objV);
            e.a aVar = e.a.b;
            a((qke) ((gme) aleVar.a).getValue(), aVar, cVarH, i3 & 1008);
            eVar2 = aVar;
        } else {
            cVarH.D();
            eVar2 = eVar;
        }
        wu5 wu5Var2 = wu5Var;
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new yt2(aleVar, eVar2, wu5Var2, i, 1);
        }
    }
}
