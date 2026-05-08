package defpackage;

import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class cbf {
    public static final List<vd2> a;
    public static final List<vd2> b;
    public static final List<vd2> c;

    static {
        mb3 mb3Var = nc6.a;
        mb3Var.getClass();
        zr4 zr4Var = zr4.a;
        List<vd2> listG = u40.g("sectionId", mb3Var, zr4Var, zr4Var, zr4Var);
        a = listG;
        List<vd2> listG2 = u40.g("suid", mb3Var, zr4Var, zr4Var, zr4Var);
        b = listG2;
        c = u63.a0(new pd2("label", mb3Var, zr4Var, zr4Var, zr4Var), new pd2("sectionIds", new ud2(new sd2(rd2.a(n48.a))), zr4Var, zr4Var, listG), new pd2("suid", mb3Var, zr4Var, zr4Var, zr4Var), new pd2("taxonomyConceptId", mb3Var, zr4Var, zr4Var, zr4Var), new pd2("type", mb3Var, zr4Var, zr4Var, zr4Var), new pd2(RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, new ud2(new sd2(rd2.a(x08.a))), zr4Var, zr4Var, listG2));
    }
}
