package defpackage;

import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class hk8 {
    public static final List<vd2> a;
    public static final List<vd2> b;
    public static final List<vd2> c;
    public static final List<vd2> d;
    public static final List<vd2> e;
    public static final List<vd2> f;
    public static final List<vd2> g;
    public static final List<vd2> h;
    public static final List<vd2> i;

    static {
        mb3 mb3Var = nc6.a;
        mb3Var.getClass();
        zr4 zr4Var = zr4.a;
        List<vd2> listG = u40.g("sectionId", mb3Var, zr4Var, zr4Var, zr4Var);
        a = listG;
        List<vd2> listG2 = u40.g("suid", mb3Var, zr4Var, zr4Var, zr4Var);
        b = listG2;
        pd2 pd2Var = new pd2("label", mb3Var, zr4Var, zr4Var, zr4Var);
        sna snaVar = n48.a;
        pd2 pd2Var2 = new pd2("sectionIds", new ud2(new sd2(rd2.a(snaVar))), zr4Var, zr4Var, listG);
        pd2 pd2Var3 = new pd2("suid", mb3Var, zr4Var, zr4Var, zr4Var);
        pd2 pd2Var4 = new pd2("taxonomyConceptId", mb3Var, zr4Var, zr4Var, zr4Var);
        pd2 pd2Var5 = new pd2("type", mb3Var, zr4Var, zr4Var, zr4Var);
        sna snaVar2 = x08.a;
        List<vd2> listA0 = u63.a0(pd2Var, pd2Var2, pd2Var3, pd2Var4, pd2Var5, new pd2(RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, new ud2(new sd2(rd2.a(snaVar2))), zr4Var, zr4Var, listG2));
        c = listA0;
        pd2 pd2Var6 = new pd2("name", mb3Var, zr4Var, zr4Var, zr4Var);
        sna snaVar3 = o68.a;
        snaVar3.getClass();
        List<vd2> listA02 = u63.a0(pd2Var6, new pd2("taxonomyConceptName", snaVar3, zr4Var, zr4Var, listA0));
        d = listA02;
        List<vd2> listG3 = u40.g("sectionId", mb3Var, zr4Var, zr4Var, zr4Var);
        e = listG3;
        List<vd2> listG4 = u40.g("suid", mb3Var, zr4Var, zr4Var, zr4Var);
        f = listG4;
        List<vd2> listA03 = u63.a0(new pd2("label", mb3Var, zr4Var, zr4Var, zr4Var), new pd2("sectionIds", new ud2(new sd2(new ud2(snaVar))), zr4Var, zr4Var, listG3), new pd2("suid", mb3Var, zr4Var, zr4Var, zr4Var), new pd2("taxonomyConceptId", mb3Var, zr4Var, zr4Var, zr4Var), new pd2("type", mb3Var, zr4Var, zr4Var, zr4Var), new pd2(RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, new ud2(new sd2(new ud2(snaVar2))), zr4Var, zr4Var, listG4));
        g = listA03;
        List<vd2> listA04 = u63.a0(new pd2("name", mb3Var, zr4Var, zr4Var, zr4Var), new pd2("taxonomyConceptName", snaVar3, zr4Var, zr4Var, listA03));
        h = listA04;
        pd2 pd2Var7 = new pd2("id", rd2.a(fc6.a), zr4Var, zr4Var, zr4Var);
        sna snaVar4 = p68.a;
        snaVar4.getClass();
        i = u63.a0(pd2Var7, new pd2("taxonomyConceptLanguage", snaVar4, zr4Var, zr4Var, listA02), new pd2("taxonomyConceptProficiency", snaVar4, zr4Var, zr4Var, listA04));
    }
}
