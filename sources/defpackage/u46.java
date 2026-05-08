package defpackage;

import com.apollographql.apollo.exception.ApolloGraphQLException;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.e46;
import defpackage.ha;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class u46 implements ga<e46.o> {
    public static final u46 a = new u46();
    public static final List<String> b = u63.a0("id", "summary", "additionalInfo", "links", "workExperiences", "publications", "military", "patents", "awards", "associations", "certifications", "licenses", "educations", "languages", "skills");

    @Override // defpackage.ga
    public final e46.o a(mb8 mb8Var, lb3 lb3Var) {
        ArrayList arrayList;
        String str;
        mb8Var.getClass();
        lb3Var.getClass();
        String str2 = null;
        String strA = null;
        String strA2 = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList arrayList4 = null;
        ArrayList arrayList5 = null;
        ArrayList arrayList6 = null;
        ArrayList arrayList7 = null;
        ArrayList arrayList8 = null;
        ArrayList arrayList9 = null;
        ArrayList arrayList10 = null;
        ArrayList arrayList11 = null;
        ArrayList arrayList12 = null;
        ArrayList arrayList13 = null;
        while (true) {
            switch (mb8Var.D1(b)) {
                case 0:
                    str2 = (String) ha.a.a(mb8Var, lb3Var);
                    break;
                case 1:
                    arrayList = arrayList13;
                    strA = ha.i.a(mb8Var, lb3Var);
                    arrayList13 = arrayList;
                    break;
                case 2:
                    arrayList = arrayList13;
                    strA2 = ha.i.a(mb8Var, lb3Var);
                    arrayList13 = arrayList;
                    break;
                case 3:
                    arrayList = arrayList13;
                    str = str2;
                    p46 p46Var = p46.a;
                    ha.g gVar = ha.a;
                    ena enaVar = new ena(p46Var, false);
                    mb8Var.m();
                    arrayList2 = new ArrayList();
                    while (mb8Var.hasNext()) {
                        try {
                            arrayList2.add(enaVar.a(mb8Var, lb3Var));
                        } catch (ApolloGraphQLException e) {
                            while (mb8Var.hasNext()) {
                                mb8Var.I();
                            }
                            mb8Var.l();
                            throw e;
                        }
                        break;
                    }
                    mb8Var.l();
                    str2 = str;
                    arrayList13 = arrayList;
                    break;
                case 4:
                    arrayList = arrayList13;
                    str = str2;
                    w46 w46Var = w46.a;
                    ha.g gVar2 = ha.a;
                    ena enaVar2 = new ena(w46Var, true);
                    mb8Var.m();
                    arrayList3 = new ArrayList();
                    while (mb8Var.hasNext()) {
                        try {
                            arrayList3.add(enaVar2.a(mb8Var, lb3Var));
                        } catch (ApolloGraphQLException e2) {
                            while (mb8Var.hasNext()) {
                                mb8Var.I();
                            }
                            mb8Var.l();
                            throw e2;
                        }
                    }
                    mb8Var.l();
                    str2 = str;
                    arrayList13 = arrayList;
                    break;
                case 5:
                    arrayList = arrayList13;
                    str = str2;
                    t46 t46Var = t46.a;
                    ha.g gVar3 = ha.a;
                    ena enaVar3 = new ena(t46Var, true);
                    mb8Var.m();
                    arrayList4 = new ArrayList();
                    while (mb8Var.hasNext()) {
                        try {
                            arrayList4.add(enaVar3.a(mb8Var, lb3Var));
                        } catch (ApolloGraphQLException e3) {
                            while (mb8Var.hasNext()) {
                                mb8Var.I();
                            }
                            mb8Var.l();
                            throw e3;
                        }
                        break;
                    }
                    mb8Var.l();
                    str2 = str;
                    arrayList13 = arrayList;
                    break;
                case 6:
                    arrayList = arrayList13;
                    str = str2;
                    q46 q46Var = q46.a;
                    ha.g gVar4 = ha.a;
                    ena enaVar4 = new ena(q46Var, true);
                    mb8Var.m();
                    arrayList5 = new ArrayList();
                    while (mb8Var.hasNext()) {
                        try {
                            arrayList5.add(enaVar4.a(mb8Var, lb3Var));
                        } catch (ApolloGraphQLException e4) {
                            while (mb8Var.hasNext()) {
                                mb8Var.I();
                            }
                            mb8Var.l();
                            throw e4;
                        }
                        break;
                    }
                    mb8Var.l();
                    str2 = str;
                    arrayList13 = arrayList;
                    break;
                case 7:
                    arrayList = arrayList13;
                    str = str2;
                    r46 r46Var = r46.a;
                    ha.g gVar5 = ha.a;
                    ena enaVar5 = new ena(r46Var, true);
                    mb8Var.m();
                    arrayList6 = new ArrayList();
                    while (mb8Var.hasNext()) {
                        try {
                            arrayList6.add(enaVar5.a(mb8Var, lb3Var));
                        } catch (ApolloGraphQLException e5) {
                            while (mb8Var.hasNext()) {
                                mb8Var.I();
                            }
                            mb8Var.l();
                            throw e5;
                        }
                        break;
                    }
                    mb8Var.l();
                    str2 = str;
                    arrayList13 = arrayList;
                    break;
                case 8:
                    arrayList = arrayList13;
                    str = str2;
                    h46 h46Var = h46.a;
                    ha.g gVar6 = ha.a;
                    ena enaVar6 = new ena(h46Var, true);
                    mb8Var.m();
                    arrayList7 = new ArrayList();
                    while (mb8Var.hasNext()) {
                        try {
                            arrayList7.add(enaVar6.a(mb8Var, lb3Var));
                        } catch (ApolloGraphQLException e6) {
                            while (mb8Var.hasNext()) {
                                mb8Var.I();
                            }
                            mb8Var.l();
                            throw e6;
                        }
                    }
                    mb8Var.l();
                    str2 = str;
                    arrayList13 = arrayList;
                    break;
                case DatadogLogGenerator.CRASH /* 9 */:
                    arrayList = arrayList13;
                    str = str2;
                    g46 g46Var = g46.a;
                    ha.g gVar7 = ha.a;
                    ena enaVar7 = new ena(g46Var, true);
                    mb8Var.m();
                    arrayList8 = new ArrayList();
                    while (mb8Var.hasNext()) {
                        try {
                            arrayList8.add(enaVar7.a(mb8Var, lb3Var));
                        } catch (ApolloGraphQLException e7) {
                            while (mb8Var.hasNext()) {
                                mb8Var.I();
                            }
                            mb8Var.l();
                            throw e7;
                        }
                    }
                    mb8Var.l();
                    str2 = str;
                    arrayList13 = arrayList;
                    break;
                case 10:
                    arrayList = arrayList13;
                    str = str2;
                    i46 i46Var = i46.a;
                    ha.g gVar8 = ha.a;
                    ena enaVar8 = new ena(i46Var, true);
                    mb8Var.m();
                    arrayList9 = new ArrayList();
                    while (mb8Var.hasNext()) {
                        try {
                            arrayList9.add(enaVar8.a(mb8Var, lb3Var));
                        } catch (ApolloGraphQLException e8) {
                            while (mb8Var.hasNext()) {
                                mb8Var.I();
                            }
                            mb8Var.l();
                            throw e8;
                        }
                        break;
                    }
                    mb8Var.l();
                    str2 = str;
                    arrayList13 = arrayList;
                    break;
                case 11:
                    arrayList = arrayList13;
                    str = str2;
                    o46 o46Var = o46.a;
                    ha.g gVar9 = ha.a;
                    ena enaVar9 = new ena(o46Var, true);
                    mb8Var.m();
                    arrayList10 = new ArrayList();
                    while (mb8Var.hasNext()) {
                        try {
                            arrayList10.add(enaVar9.a(mb8Var, lb3Var));
                        } catch (ApolloGraphQLException e9) {
                            while (mb8Var.hasNext()) {
                                mb8Var.I();
                            }
                            mb8Var.l();
                            throw e9;
                        }
                        break;
                    }
                    mb8Var.l();
                    str2 = str;
                    arrayList13 = arrayList;
                    break;
                case 12:
                    arrayList = arrayList13;
                    str = str2;
                    k46 k46Var = k46.a;
                    ha.g gVar10 = ha.a;
                    ena enaVar10 = new ena(k46Var, true);
                    mb8Var.m();
                    ArrayList arrayList14 = new ArrayList();
                    while (mb8Var.hasNext()) {
                        try {
                            arrayList14.add(enaVar10.a(mb8Var, lb3Var));
                        } catch (ApolloGraphQLException e10) {
                            while (mb8Var.hasNext()) {
                                mb8Var.I();
                            }
                            mb8Var.l();
                            throw e10;
                        }
                        break;
                    }
                    mb8Var.l();
                    arrayList11 = arrayList14;
                    str2 = str;
                    arrayList13 = arrayList;
                    break;
                case 13:
                    ArrayList arrayList15 = arrayList13;
                    str = str2;
                    n46 n46Var = n46.a;
                    ha.g gVar11 = ha.a;
                    arrayList = arrayList15;
                    ena enaVar11 = new ena(n46Var, true);
                    mb8Var.m();
                    ArrayList arrayList16 = new ArrayList();
                    while (mb8Var.hasNext()) {
                        try {
                            arrayList16.add(enaVar11.a(mb8Var, lb3Var));
                        } catch (ApolloGraphQLException e11) {
                            while (mb8Var.hasNext()) {
                                mb8Var.I();
                            }
                            mb8Var.l();
                            throw e11;
                        }
                        break;
                    }
                    mb8Var.l();
                    arrayList12 = arrayList16;
                    str2 = str;
                    arrayList13 = arrayList;
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 14 */:
                    v46 v46Var = v46.a;
                    ha.g gVar12 = ha.a;
                    String str3 = str2;
                    ena enaVar12 = new ena(v46Var, true);
                    mb8Var.m();
                    ArrayList arrayList17 = new ArrayList();
                    while (mb8Var.hasNext()) {
                        try {
                            arrayList17.add(enaVar12.a(mb8Var, lb3Var));
                        } catch (ApolloGraphQLException e12) {
                            while (mb8Var.hasNext()) {
                                mb8Var.I();
                            }
                            mb8Var.l();
                            throw e12;
                        }
                    }
                    mb8Var.l();
                    str2 = str3;
                    arrayList13 = arrayList17;
                    break;
                default:
                    if (str2 == null) {
                        mh2.q(mb8Var, "id");
                        throw null;
                    }
                    if (arrayList2 == null) {
                        mh2.q(mb8Var, "links");
                        throw null;
                    }
                    if (arrayList3 == null) {
                        mh2.q(mb8Var, "workExperiences");
                        throw null;
                    }
                    if (arrayList4 == null) {
                        mh2.q(mb8Var, "publications");
                        throw null;
                    }
                    if (arrayList5 == null) {
                        mh2.q(mb8Var, "military");
                        throw null;
                    }
                    if (arrayList6 == null) {
                        mh2.q(mb8Var, "patents");
                        throw null;
                    }
                    if (arrayList7 == null) {
                        mh2.q(mb8Var, "awards");
                        throw null;
                    }
                    if (arrayList8 == null) {
                        mh2.q(mb8Var, "associations");
                        throw null;
                    }
                    if (arrayList9 == null) {
                        mh2.q(mb8Var, "certifications");
                        throw null;
                    }
                    if (arrayList10 == null) {
                        mh2.q(mb8Var, "licenses");
                        throw null;
                    }
                    if (arrayList11 == null) {
                        mh2.q(mb8Var, "educations");
                        throw null;
                    }
                    if (arrayList12 == null) {
                        mh2.q(mb8Var, "languages");
                        throw null;
                    }
                    if (arrayList13 != null) {
                        return new e46.o(str2, strA, strA2, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6, arrayList7, arrayList8, arrayList9, arrayList10, arrayList11, arrayList12, arrayList13);
                    }
                    mh2.q(mb8Var, "skills");
                    throw null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ga
    public final void b(hc8 hc8Var, lb3 lb3Var, e46.o oVar) {
        e46.o oVar2 = oVar;
        hc8Var.getClass();
        lb3Var.getClass();
        oVar2.getClass();
        hc8Var.u0("id");
        ha.a.b(hc8Var, lb3Var, oVar2.a);
        hc8Var.u0("summary");
        nma<String> nmaVar = ha.i;
        nmaVar.b(hc8Var, lb3Var, oVar2.b);
        hc8Var.u0("additionalInfo");
        nmaVar.b(hc8Var, lb3Var, oVar2.c);
        hc8Var.u0("links");
        p46 p46Var = p46.a;
        ArrayList arrayList = oVar2.d;
        hc8Var.m();
        for (Object obj : arrayList) {
            hc8Var.j();
            p46Var.b(hc8Var, lb3Var, obj);
            hc8Var.t();
        }
        hc8Var.l();
        hc8Var.u0("workExperiences");
        w46 w46Var = w46.a;
        ArrayList arrayList2 = oVar2.e;
        hc8Var.m();
        for (Object obj2 : arrayList2) {
            if (hc8Var instanceof ub9) {
                ub9 ub9Var = (ub9) hc8Var;
                ub9Var.j();
                w46Var.b(hc8Var, lb3Var, obj2);
                ub9Var.t();
            } else {
                ub9 ub9Var2 = new ub9();
                ub9Var2.j();
                w46Var.b(ub9Var2, lb3Var, obj2);
                ub9Var2.t();
                Object objH = ub9Var2.h();
                objH.getClass();
                f.a(hc8Var, objH);
            }
        }
        hc8Var.l();
        hc8Var.u0("publications");
        t46 t46Var = t46.a;
        ArrayList arrayList3 = oVar2.f;
        hc8Var.m();
        for (Object obj3 : arrayList3) {
            if (hc8Var instanceof ub9) {
                ub9 ub9Var3 = (ub9) hc8Var;
                ub9Var3.j();
                t46Var.b(hc8Var, lb3Var, obj3);
                ub9Var3.t();
            } else {
                ub9 ub9Var4 = new ub9();
                ub9Var4.j();
                t46Var.b(ub9Var4, lb3Var, obj3);
                ub9Var4.t();
                Object objH2 = ub9Var4.h();
                objH2.getClass();
                f.a(hc8Var, objH2);
            }
        }
        hc8Var.l();
        hc8Var.u0("military");
        q46 q46Var = q46.a;
        ArrayList arrayList4 = oVar2.g;
        hc8Var.m();
        for (Object obj4 : arrayList4) {
            if (hc8Var instanceof ub9) {
                ub9 ub9Var5 = (ub9) hc8Var;
                ub9Var5.j();
                q46Var.b(hc8Var, lb3Var, obj4);
                ub9Var5.t();
            } else {
                ub9 ub9Var6 = new ub9();
                ub9Var6.j();
                q46Var.b(ub9Var6, lb3Var, obj4);
                ub9Var6.t();
                Object objH3 = ub9Var6.h();
                objH3.getClass();
                f.a(hc8Var, objH3);
            }
        }
        hc8Var.l();
        hc8Var.u0("patents");
        r46 r46Var = r46.a;
        ArrayList arrayList5 = oVar2.h;
        hc8Var.m();
        for (Object obj5 : arrayList5) {
            if (hc8Var instanceof ub9) {
                ub9 ub9Var7 = (ub9) hc8Var;
                ub9Var7.j();
                r46Var.b(hc8Var, lb3Var, obj5);
                ub9Var7.t();
            } else {
                ub9 ub9Var8 = new ub9();
                ub9Var8.j();
                r46Var.b(ub9Var8, lb3Var, obj5);
                ub9Var8.t();
                Object objH4 = ub9Var8.h();
                objH4.getClass();
                f.a(hc8Var, objH4);
            }
        }
        hc8Var.l();
        hc8Var.u0("awards");
        h46 h46Var = h46.a;
        ArrayList arrayList6 = oVar2.i;
        hc8Var.m();
        for (Object obj6 : arrayList6) {
            if (hc8Var instanceof ub9) {
                ub9 ub9Var9 = (ub9) hc8Var;
                ub9Var9.j();
                h46Var.b(hc8Var, lb3Var, obj6);
                ub9Var9.t();
            } else {
                ub9 ub9Var10 = new ub9();
                ub9Var10.j();
                h46Var.b(ub9Var10, lb3Var, obj6);
                ub9Var10.t();
                Object objH5 = ub9Var10.h();
                objH5.getClass();
                f.a(hc8Var, objH5);
            }
        }
        hc8Var.l();
        hc8Var.u0("associations");
        g46 g46Var = g46.a;
        ArrayList arrayList7 = oVar2.j;
        hc8Var.m();
        for (Object obj7 : arrayList7) {
            if (hc8Var instanceof ub9) {
                ub9 ub9Var11 = (ub9) hc8Var;
                ub9Var11.j();
                g46Var.b(hc8Var, lb3Var, obj7);
                ub9Var11.t();
            } else {
                ub9 ub9Var12 = new ub9();
                ub9Var12.j();
                g46Var.b(ub9Var12, lb3Var, obj7);
                ub9Var12.t();
                Object objH6 = ub9Var12.h();
                objH6.getClass();
                f.a(hc8Var, objH6);
            }
        }
        hc8Var.l();
        hc8Var.u0("certifications");
        i46 i46Var = i46.a;
        ArrayList arrayList8 = oVar2.k;
        hc8Var.m();
        for (Object obj8 : arrayList8) {
            if (hc8Var instanceof ub9) {
                ub9 ub9Var13 = (ub9) hc8Var;
                ub9Var13.j();
                i46Var.b(hc8Var, lb3Var, obj8);
                ub9Var13.t();
            } else {
                ub9 ub9Var14 = new ub9();
                ub9Var14.j();
                i46Var.b(ub9Var14, lb3Var, obj8);
                ub9Var14.t();
                Object objH7 = ub9Var14.h();
                objH7.getClass();
                f.a(hc8Var, objH7);
            }
        }
        hc8Var.l();
        hc8Var.u0("licenses");
        o46 o46Var = o46.a;
        ArrayList arrayList9 = oVar2.l;
        hc8Var.m();
        for (Object obj9 : arrayList9) {
            if (hc8Var instanceof ub9) {
                ub9 ub9Var15 = (ub9) hc8Var;
                ub9Var15.j();
                o46Var.b(hc8Var, lb3Var, obj9);
                ub9Var15.t();
            } else {
                ub9 ub9Var16 = new ub9();
                ub9Var16.j();
                o46Var.b(ub9Var16, lb3Var, obj9);
                ub9Var16.t();
                Object objH8 = ub9Var16.h();
                objH8.getClass();
                f.a(hc8Var, objH8);
            }
        }
        hc8Var.l();
        hc8Var.u0("educations");
        k46 k46Var = k46.a;
        ArrayList arrayList10 = oVar2.m;
        hc8Var.m();
        for (Object obj10 : arrayList10) {
            if (hc8Var instanceof ub9) {
                ub9 ub9Var17 = (ub9) hc8Var;
                ub9Var17.j();
                k46Var.b(hc8Var, lb3Var, obj10);
                ub9Var17.t();
            } else {
                ub9 ub9Var18 = new ub9();
                ub9Var18.j();
                k46Var.b(ub9Var18, lb3Var, obj10);
                ub9Var18.t();
                Object objH9 = ub9Var18.h();
                objH9.getClass();
                f.a(hc8Var, objH9);
            }
        }
        hc8Var.l();
        hc8Var.u0("languages");
        n46 n46Var = n46.a;
        ArrayList arrayList11 = oVar2.n;
        hc8Var.m();
        for (Object obj11 : arrayList11) {
            if (hc8Var instanceof ub9) {
                ub9 ub9Var19 = (ub9) hc8Var;
                ub9Var19.j();
                n46Var.b(hc8Var, lb3Var, obj11);
                ub9Var19.t();
            } else {
                ub9 ub9Var20 = new ub9();
                ub9Var20.j();
                n46Var.b(ub9Var20, lb3Var, obj11);
                ub9Var20.t();
                Object objH10 = ub9Var20.h();
                objH10.getClass();
                f.a(hc8Var, objH10);
            }
        }
        hc8Var.l();
        hc8Var.u0("skills");
        v46 v46Var = v46.a;
        ArrayList arrayList12 = oVar2.o;
        hc8Var.m();
        for (Object obj12 : arrayList12) {
            if (hc8Var instanceof ub9) {
                ub9 ub9Var21 = (ub9) hc8Var;
                ub9Var21.j();
                v46Var.b(hc8Var, lb3Var, obj12);
                ub9Var21.t();
            } else {
                ub9 ub9Var22 = new ub9();
                ub9Var22.j();
                v46Var.b(ub9Var22, lb3Var, obj12);
                ub9Var22.t();
                Object objH11 = ub9Var22.h();
                objH11.getClass();
                f.a(hc8Var, objH11);
            }
        }
        hc8Var.l();
    }
}
