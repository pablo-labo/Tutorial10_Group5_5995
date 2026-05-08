package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class aj8 extends ka6 {

    public static final class a extends aj8 {
        public static final a d = new a();
    }

    public /* synthetic */ class b extends qv5 implements Function1<zi8, p7g> {
        @Override // kotlin.jvm.functions.Function1
        public final p7g invoke(zi8 zi8Var) {
            zi8 zi8Var2 = zi8Var;
            zi8Var2.getClass();
            return ((aj8) this.receiver).L0(zi8Var2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [kj7] */
    /* JADX WARN: Type inference failed for: r0v2, types: [kj7] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r3v0, types: [rxf] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3 */
    public static mge K1(mge mgeVar) {
        ui8 type;
        kwf kwfVarM0 = mgeVar.M0();
        ?? r3 = 0;
        if (kwfVarM0 instanceof mx1) {
            mx1 mx1Var = (mx1) kwfVarM0;
            wxf wxfVar = mx1Var.a;
            wxf wxfVar2 = wxfVar.c() == ylg.IN_VARIANCE ? wxfVar : null;
            p7g p7gVarP0 = (wxfVar2 == null || (type = wxfVar2.getType()) == null) ? null : type.P0();
            if (mx1Var.b == null) {
                Collection<ui8> collectionB = mx1Var.b();
                ArrayList arrayList = new ArrayList(t92.r0(collectionB, 10));
                Iterator it = collectionB.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ui8) it.next()).P0());
                }
                mx1Var.b = new lha(wxfVar, new i14(arrayList, 4), (rxf) r3, 8);
            }
            lha lhaVar = mx1Var.b;
            lhaVar.getClass();
            return new jha(hx1.a, lhaVar, p7gVarP0, mgeVar.L0(), mgeVar.N0(), 32);
        }
        if (kwfVarM0 instanceof bi7) {
            t92.r0(null, 10);
            throw null;
        }
        if (!(kwfVarM0 instanceof kj7) || !mgeVar.N0()) {
            return mgeVar;
        }
        ?? r0 = (kj7) kwfVarM0;
        LinkedHashSet<ui8> linkedHashSet = r0.b;
        ArrayList arrayList2 = new ArrayList(t92.r0(linkedHashSet, 10));
        Iterator it2 = linkedHashSet.iterator();
        boolean z = false;
        while (it2.hasNext()) {
            arrayList2.add(boa.F((ui8) it2.next()));
            z = true;
        }
        if (z) {
            ui8 ui8Var = r0.a;
            p7g p7gVarF = ui8Var != null ? boa.F(ui8Var) : null;
            arrayList2.isEmpty();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList2);
            linkedHashSet2.hashCode();
            kj7 kj7Var = new kj7(linkedHashSet2);
            kj7Var.a = p7gVarF;
            r3 = kj7Var;
        }
        if (r3 != 0) {
            r0 = r3;
        }
        return r0.f();
    }

    @Override // defpackage.ka6
    /* JADX INFO: renamed from: J1, reason: merged with bridge method [inline-methods] */
    public final p7g L0(zi8 zi8Var) {
        p7g p7gVarA;
        zi8Var.getClass();
        if (!(zi8Var instanceof ui8)) {
            l5.q("Failed requirement.");
            return null;
        }
        p7g p7gVarP0 = ((ui8) zi8Var).P0();
        if (p7gVarP0 instanceof mge) {
            p7gVarA = K1((mge) p7gVarP0);
        } else {
            if (!(p7gVarP0 instanceof jh5)) {
                l.g();
                return null;
            }
            jh5 jh5Var = (jh5) p7gVarP0;
            mge mgeVar = jh5Var.c;
            mge mgeVar2 = jh5Var.b;
            mge mgeVarK1 = K1(mgeVar2);
            mge mgeVarK12 = K1(mgeVar);
            p7gVarA = (mgeVarK1 == mgeVar2 && mgeVarK12 == mgeVar) ? p7gVarP0 : yi8.a(mgeVarK1, mgeVarK12);
        }
        b bVar = new b(1, this, aj8.class, "prepareType", "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;", 0);
        ui8 ui8VarJ = beb.j(p7gVarP0);
        return beb.n(p7gVarA, ui8VarJ != null ? (ui8) bVar.invoke(ui8VarJ) : null);
    }
}
