package defpackage;

import defpackage.ere;
import defpackage.in9;
import defpackage.ixa;
import defpackage.j29;
import defpackage.kv5;
import defpackage.pc8;
import io.jsonwebtoken.JwtParser;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* JADX INFO: loaded from: classes3.dex */
public final class rc8 implements jz, mbb {
    public static final /* synthetic */ qf8<Object>[] h;
    public final yx9 a;
    public final fla b;
    public final mge c;
    public final fla d;
    public final eu1<mq5, t52> e;
    public final fla f;
    public final nn9<Pair<String, String>, lf0> g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final /* synthetic */ a[] f;

        static {
            a aVar = new a("HIDDEN", 0);
            a = aVar;
            a aVar2 = new a("VISIBLE", 1);
            b = aVar2;
            a aVar3 = new a("DEPRECATED_LIST_METHODS", 2);
            c = aVar3;
            a aVar4 = new a("NOT_CONSIDERED", 3);
            d = aVar4;
            a aVar5 = new a("DROP", 4);
            e = aVar5;
            f = new a[]{aVar, aVar2, aVar3, aVar4, aVar5};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f.clone();
        }
    }

    static {
        l4c l4cVar = new l4c(rc8.class, "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;", 0);
        iwc iwcVar = fwc.a;
        h = new qf8[]{iwcVar.g(l4cVar), z3.i(rc8.class, "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;", 0, iwcVar), z3.i(rc8.class, "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;", 0, iwcVar)};
    }

    public rc8(yx9 yx9Var, j29 j29Var, x04 x04Var) {
        this.a = yx9Var;
        this.b = new j29.h(j29Var, x04Var);
        sc8 sc8Var = new sc8(yx9Var, new mq5("java.io"));
        List listZ = u63.Z(new tt8(j29Var, new ve0(this, 1)));
        w52 w52Var = new w52(sc8Var, n8a.h("Serializable"), ax9.e, c62.INTERFACE, listZ, j29Var);
        w52Var.K0(in9.b.b, is4.a, null);
        mge mgeVarO = w52Var.o();
        mgeVarO.getClass();
        this.c = mgeVarO;
        this.d = new j29.h(j29Var, new y04(1, this, j29Var));
        this.e = j29Var.a();
        this.f = new j29.h(j29Var, new qc8(this, 0));
        this.g = j29Var.g(new iib(this, 2));
    }

    @Override // defpackage.jz
    public final Collection<ui8> a(t52 t52Var) {
        int i = b04.a;
        nq5 nq5VarG = yz3.g(t52Var);
        nq5VarG.getClass();
        LinkedHashSet linkedHashSet = wc8.a;
        nq5 nq5Var = ere.a.g;
        boolean zEquals = nq5VarG.equals(nq5Var);
        boolean zIsAssignableFrom = false;
        mge mgeVar = this.c;
        if (!zEquals) {
            HashMap map = ere.a.g0;
            if (map.get(nq5VarG) == null) {
                if (nq5VarG.equals(nq5Var) || map.get(nq5VarG) != null) {
                    zIsAssignableFrom = true;
                } else {
                    String str = iw7.a;
                    a62 a62VarG = iw7.g(nq5VarG);
                    if (a62VarG != null) {
                        try {
                            zIsAssignableFrom = Serializable.class.isAssignableFrom(Class.forName(a62VarG.a().a.a));
                        } catch (ClassNotFoundException unused) {
                        }
                    }
                }
                return zIsAssignableFrom ? u63.Z(mgeVar) : zr4.a;
            }
        }
        return u63.a0((mge) zte.c(this.d, h[1]), mgeVar);
    }

    @Override // defpackage.jz
    public final Collection b(t52 t52Var) {
        Set<n8a> setA;
        t52Var.getClass();
        g().getClass();
        ap8 ap8VarF = f(t52Var);
        if (ap8VarF == null || (setA = ap8VarF.K0().a()) == null) {
            setA = is4.a;
        }
        return setA;
    }

    @Override // defpackage.mbb
    public final boolean c(t52 t52Var, r14 r14Var) {
        t52Var.getClass();
        ap8 ap8VarF = f(t52Var);
        if (ap8VarF == null || !r14Var.getAnnotations().P0(nbb.a)) {
            return true;
        }
        g().getClass();
        String strA = vs9.a(r14Var, 3);
        gp8 gp8VarK0 = ap8VarF.K0();
        n8a name = r14Var.getName();
        name.getClass();
        Collection<sfe> collectionE = gp8VarK0.e(name, dia.a);
        if ((collectionE instanceof Collection) && collectionE.isEmpty()) {
            return false;
        }
        Iterator<T> it = collectionE.iterator();
        while (it.hasNext()) {
            if (vs9.a((sfe) it.next(), 3).equals(strA)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014b  */
    @Override // defpackage.jz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Collection<defpackage.sfe> d(defpackage.n8a r18, defpackage.t52 r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 934
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc8.d(n8a, t52):java.util.Collection");
    }

    @Override // defpackage.jz
    public final Collection<m52> e(t52 t52Var) {
        nq5 nq5VarG;
        jh2 jh2Var = jh2.Z;
        if (t52Var.f() == c62.CLASS) {
            g().getClass();
            ap8 ap8VarF = f(t52Var);
            if (ap8VarF != null) {
                mq5 mq5VarG = b04.g(ap8VarF);
                p65 p65Var = p65.f;
                p65Var.getClass();
                String str = iw7.a;
                a62 a62VarF = iw7.f(mq5VarG);
                t52 t52VarJ = a62VarF != null ? p65Var.j(a62VarF.a()) : null;
                if (t52VarJ != null) {
                    TypeSubstitutor typeSubstitutorE = TypeSubstitutor.e(hc9.a(t52VarJ, ap8VarF));
                    List<m52> listInvoke = ap8VarF.f0.q.invoke();
                    ArrayList<m52> arrayList = new ArrayList();
                    for (Object obj : listInvoke) {
                        m52 m52Var = (m52) obj;
                        if (m52Var.getVisibility().a().b) {
                            Collection<m52> collectionK = t52VarJ.k();
                            collectionK.getClass();
                            Collection<m52> collection = collectionK;
                            if (!(collection instanceof Collection) || !collection.isEmpty()) {
                                for (m52 m52Var2 : collection) {
                                    m52Var2.getClass();
                                    if (ixa.j(m52Var2, m52Var.b(typeSubstitutorE)) == ixa.b.a.a) {
                                        break;
                                    }
                                }
                            }
                            if (m52Var.i().size() == 1) {
                                List<rlg> listI = m52Var.i();
                                listI.getClass();
                                v62 v62VarD = ((rlg) z92.k1(listI)).getType().M0().d();
                                if (v62VarD != null) {
                                    int i = b04.a;
                                    nq5VarG = yz3.g(v62VarD);
                                    nq5VarG.getClass();
                                } else {
                                    nq5VarG = null;
                                }
                                nq5 nq5VarG2 = yz3.g(t52Var);
                                nq5VarG2.getClass();
                                if (wl7.b(nq5VarG, nq5VarG2)) {
                                }
                            }
                            if (!ei8.D(m52Var)) {
                                LinkedHashSet linkedHashSet = wc8.f;
                                String strA = vs9.a(m52Var, 3);
                                String str2 = iw7.a;
                                a62 a62VarG = iw7.g(b04.g(ap8VarF).a);
                                if (!linkedHashSet.contains((a62VarG != null ? xc8.e(a62VarG) : ojh.j(ap8VarF, jh2Var)) + JwtParser.SEPARATOR_CHAR + strA)) {
                                    arrayList.add(obj);
                                }
                            }
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(t92.r0(arrayList, 10));
                    for (m52 m52Var3 : arrayList) {
                        kv5.a<? extends kv5> aVarF0 = m52Var3.F0();
                        aVarF0.k(t52Var);
                        aVarF0.p(t52Var.o());
                        aVarF0.n();
                        aVarF0.d(typeSubstitutorE.g());
                        LinkedHashSet linkedHashSet2 = wc8.g;
                        String strA2 = vs9.a(m52Var3, 3);
                        String str3 = iw7.a;
                        a62 a62VarG2 = iw7.g(b04.g(ap8VarF).a);
                        if (!linkedHashSet2.contains((a62VarG2 != null ? xc8.e(a62VarG2) : ojh.j(ap8VarF, jh2Var)) + JwtParser.SEPARATOR_CHAR + strA2)) {
                            aVarF0.f((lf0) zte.c(this.f, h[2]));
                        }
                        kv5 kv5VarBuild = aVarF0.build();
                        kv5VarBuild.getClass();
                        arrayList2.add((m52) kv5VarBuild);
                    }
                    return arrayList2;
                }
            }
        }
        return zr4.a;
    }

    public final ap8 f(t52 t52Var) {
        mq5 mq5VarA;
        if (t52Var == null) {
            ei8.a(108);
            throw null;
        }
        n8a n8aVar = ei8.e;
        if (!ei8.b(t52Var, ere.a.a) && ei8.K(t52Var)) {
            int i = b04.a;
            nq5 nq5VarG = yz3.g(t52Var);
            nq5VarG.getClass();
            if (nq5VarG.d()) {
                String str = iw7.a;
                a62 a62VarG = iw7.g(nq5VarG);
                if (a62VarG != null && (mq5VarA = a62VarG.a()) != null) {
                    t52 t52VarN = c0h.N(g().a, mq5VarA);
                    if (t52VarN instanceof ap8) {
                        return (ap8) t52VarN;
                    }
                }
            }
        }
        return null;
    }

    public final pc8.a g() {
        return (pc8.a) zte.c(this.b, h[0]);
    }
}
