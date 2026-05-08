package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public enum qz3 {
    VISIBILITY(true),
    MODALITY(true),
    OVERRIDE(true),
    ANNOTATIONS(false),
    INNER(true),
    MEMBER_KIND(true),
    DATA(true),
    INLINE(true),
    EXPECT(true),
    ACTUAL(true),
    CONST(true),
    LATEINIT(true),
    FUN(true),
    VALUE(true);

    public static final Set<qz3> a;
    public static final Set<qz3> b;
    private final boolean includeByDefault;

    static {
        qz3[] qz3VarArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (qz3 qz3Var : qz3VarArrValues) {
            if (qz3Var.includeByDefault) {
                arrayList.add(qz3Var);
            }
        }
        a = z92.E1(arrayList);
        b = ut0.I0(values());
    }

    qz3(boolean z) {
        this.includeByDefault = z;
    }
}
