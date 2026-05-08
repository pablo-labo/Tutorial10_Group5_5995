package defpackage;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import defpackage.ere;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class lu7 {
    public static final Map<String, EnumSet<ti8>> a = lc9.a0(new Pair("PACKAGE", EnumSet.noneOf(ti8.class)), new Pair(CredentialProviderBaseController.TYPE_TAG, EnumSet.of(ti8.f0, ti8.r0)), new Pair("ANNOTATION_TYPE", EnumSet.of(ti8.g0)), new Pair("TYPE_PARAMETER", EnumSet.of(ti8.h0)), new Pair("FIELD", EnumSet.of(ti8.j0)), new Pair("LOCAL_VARIABLE", EnumSet.of(ti8.k0)), new Pair("PARAMETER", EnumSet.of(ti8.l0)), new Pair("CONSTRUCTOR", EnumSet.of(ti8.m0)), new Pair("METHOD", EnumSet.of(ti8.n0, ti8.o0, ti8.p0)), new Pair("TYPE_USE", EnumSet.of(ti8.q0)));
    public static final Map<String, si8> b = lc9.a0(new Pair("RUNTIME", si8.a), new Pair("CLASS", si8.b), new Pair("SOURCE", si8.c));

    public static rt0 a(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof av7) {
                arrayList.add(obj);
            }
        }
        ArrayList<ti8> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Iterable iterable = (EnumSet) a.get(((av7) it.next()).b().c());
            if (iterable == null) {
                iterable = is4.a;
            }
            w92.w0(arrayList2, iterable);
        }
        ArrayList arrayList3 = new ArrayList(t92.r0(arrayList2, 10));
        for (ti8 ti8Var : arrayList2) {
            mq5 mq5Var = ere.a.u;
            mq5Var.getClass();
            arrayList3.add(new dw4(new a62(mq5Var.b(), mq5Var.a.f()), n8a.h(ti8Var.name())));
        }
        return new rt0(arrayList3, tz3.c);
    }
}
