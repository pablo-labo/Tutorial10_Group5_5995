package defpackage;

import defpackage.fs3;
import defpackage.gwf;
import defpackage.iwf;
import defpackage.pha;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class mxf {
    public static final mxf a = new mxf();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final c a;
        public static final C0325a b;
        public static final d c;
        public static final b d;
        public static final /* synthetic */ a[] e;

        /* JADX INFO: renamed from: mxf$a$a, reason: collision with other inner class name */
        public static final class C0325a extends a {
            public C0325a() {
                super("ACCEPT_NULL", 1);
            }

            @Override // mxf.a
            public final a a(p7g p7gVar) {
                p7gVar.getClass();
                return a.c(p7gVar);
            }
        }

        public static final class b extends a {
            public b() {
                super("NOT_NULL", 3);
            }

            @Override // mxf.a
            public final a a(p7g p7gVar) {
                p7gVar.getClass();
                return this;
            }
        }

        public static final class c extends a {
            public c() {
                super("START", 0);
            }

            @Override // mxf.a
            public final a a(p7g p7gVar) {
                p7gVar.getClass();
                return a.c(p7gVar);
            }
        }

        public static final class d extends a {
            public d() {
                super("UNKNOWN", 2);
            }

            @Override // mxf.a
            public final a a(p7g p7gVar) {
                p7gVar.getClass();
                a aVarC = a.c(p7gVar);
                return aVarC == a.b ? this : aVarC;
            }
        }

        static {
            c cVar = new c();
            a = cVar;
            C0325a c0325a = new C0325a();
            b = c0325a;
            d dVar = new d();
            c = dVar;
            b bVar = new b();
            d = bVar;
            e = new a[]{cVar, c0325a, dVar, bVar};
        }

        public a() {
            throw null;
        }

        public static a c(p7g p7gVar) {
            p7gVar.getClass();
            return p7gVar.N0() ? b : (!((p7gVar instanceof fs3) && (((fs3) p7gVar).b instanceof iwe)) && ((p7gVar instanceof iwe) || !o3.a(ofe.a.r0(), w74.v(p7gVar), iwf.a.b.a))) ? c : d;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) e.clone();
        }

        public abstract a a(p7g p7gVar);
    }

    public static ArrayList a(AbstractCollection abstractCollection, Function2 function2) {
        ArrayList arrayList = new ArrayList(abstractCollection);
        Iterator it = arrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            mge mgeVar = (mge) it.next();
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    mge mgeVar2 = (mge) it2.next();
                    if (mgeVar2 != mgeVar) {
                        mgeVar2.getClass();
                        mgeVar.getClass();
                        if (((Boolean) function2.invoke(mgeVar2, mgeVar)).booleanValue()) {
                            it.remove();
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7, types: [fx0, gwf, java.lang.Object, n0] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [gwf] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v16, types: [mge] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, mge, ui8] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
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
    public final mge b(ArrayList arrayList) {
        mge mgeVarF;
        arrayList.size();
        ArrayList<mge> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            mge mgeVar = (mge) it.next();
            if (mgeVar.M0() instanceof kj7) {
                Collection<ui8> collectionB = mgeVar.M0().b();
                collectionB.getClass();
                Collection<ui8> collection = collectionB;
                ArrayList arrayList3 = new ArrayList(t92.r0(collection, 10));
                for (ui8 ui8Var : collection) {
                    ui8Var.getClass();
                    mge mgeVarG = w74.G(ui8Var);
                    if (mgeVar.N0()) {
                        mgeVarG = mgeVarG.Q0(true);
                    }
                    arrayList3.add(mgeVarG);
                }
                arrayList2.addAll(arrayList3);
            } else {
                arrayList2.add(mgeVar);
            }
        }
        Iterator it2 = arrayList2.iterator();
        a aVarA = a.a;
        while (it2.hasNext()) {
            aVarA = aVarA.a((p7g) it2.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (mge mgeVarQ0 : arrayList2) {
            if (aVarA == a.d) {
                if (mgeVarQ0 instanceof jha) {
                    jha jhaVar = (jha) mgeVarQ0;
                    mgeVarQ0 = new jha(jhaVar.b, jhaVar.c, jhaVar.d, jhaVar.e, jhaVar.f, true);
                }
                mgeVarQ0.getClass();
                mge mgeVarA = fs3.a.a(mgeVarQ0, false);
                mgeVarQ0 = (mgeVarA == null && (mgeVarA = uoe.b(mgeVarQ0)) == null) ? mgeVarQ0.Q0(false) : mgeVarA;
            }
            linkedHashSet.add(mgeVarQ0);
        }
        ArrayList arrayList4 = new ArrayList(t92.r0(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((mge) it3.next()).L0());
        }
        Iterator it4 = arrayList4.iterator();
        mge mgeVar2 = null;
        if (!it4.hasNext()) {
            b0.u("Empty collection can't be reduced.");
            return null;
        }
        ?? next = it4.next();
        while (it4.hasNext()) {
            gwf gwfVar = (gwf) it4.next();
            next = (gwf) next;
            next.getClass();
            gwf.a aVar = gwf.b;
            gwfVar.getClass();
            if (!next.isEmpty() || !gwfVar.isEmpty()) {
                ArrayList arrayList5 = new ArrayList();
                Collection collectionValues = ((ConcurrentHashMap) aVar.a).values();
                collectionValues.getClass();
                Iterator it5 = collectionValues.iterator();
                while (it5.hasNext()) {
                    int iIntValue = ((Number) it5.next()).intValue();
                    ewf ewfVar = (ewf) next.a.get(iIntValue);
                    ewf ewfVar2 = (ewf) gwfVar.a.get(iIntValue);
                    of0 of0VarC = ewfVar == null ? ewfVar2 != null ? ewfVar2.c(ewfVar) : null : ewfVar.c(ewfVar2);
                    if (of0VarC != null) {
                        arrayList5.add(of0VarC);
                    }
                }
                next = gwf.a.e(arrayList5);
            }
        }
        gwf gwfVar2 = (gwf) next;
        if (linkedHashSet.size() == 1) {
            mgeVarF = (mge) z92.j1(linkedHashSet);
        } else {
            ArrayList arrayListA = a(linkedHashSet, new nxf(2, this, mxf.class, "isStrictSupertype", "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z", 0));
            arrayListA.isEmpty();
            if (!arrayListA.isEmpty()) {
                Iterator it6 = arrayListA.iterator();
                if (!it6.hasNext()) {
                    b0.u("Empty collection can't be reduced.");
                    return null;
                }
                ?? next2 = it6.next();
                while (it6.hasNext()) {
                    mge mgeVar3 = (mge) it6.next();
                    next2 = (mge) next2;
                    if (next2 != 0 && mgeVar3 != null) {
                        kwf kwfVarM0 = next2.M0();
                        kwf kwfVarM02 = mgeVar3.M0();
                        boolean z = kwfVarM0 instanceof zh7;
                        if (z && (kwfVarM02 instanceof zh7)) {
                            Set<ui8> set = ((zh7) kwfVarM0).a;
                            Set<ui8> set2 = ((zh7) kwfVarM02).a;
                            set.getClass();
                            set2.getClass();
                            Set setD1 = z92.D1(set);
                            w92.w0(setD1, set2);
                            zh7 zh7Var = new zh7(setD1);
                            gwf.b.getClass();
                            gwf gwfVar3 = gwf.c;
                            gwfVar3.getClass();
                            next2 = yi8.d(lx4.a(xw4.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"), gwfVar3, zh7Var, zr4.a, false);
                        } else if (z) {
                            if (((zh7) kwfVarM0).a.contains(mgeVar3)) {
                                next2 = mgeVar3;
                            }
                        } else if (!(kwfVarM02 instanceof zh7) || !((zh7) kwfVarM02).a.contains(next2)) {
                        }
                    }
                    next2 = 0;
                }
                mgeVar2 = (mge) next2;
            }
            if (mgeVar2 != null) {
                mgeVarF = mgeVar2;
            } else {
                pha.b.getClass();
                ArrayList arrayListA2 = a(arrayListA, new oxf(2, pha.a.b, qha.class, "equalTypes", "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z", 0));
                arrayListA2.isEmpty();
                mgeVarF = arrayListA2.size() < 2 ? (mge) z92.j1(arrayListA2) : new kj7(linkedHashSet).f();
            }
        }
        return mgeVarF.S0(gwfVar2);
    }
}
