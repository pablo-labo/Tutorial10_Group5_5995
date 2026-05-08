package defpackage;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class zv4 extends h91 {
    public final /* synthetic */ LinkedHashSet b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zv4(LinkedHashSet linkedHashSet) {
        super(8);
        this.b = linkedHashSet;
    }

    public static /* synthetic */ void R(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "fromSuper";
        } else if (i != 2) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "fromCurrent";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
        if (i == 1 || i == 2) {
            objArr[2] = "conflict";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // defpackage.h91
    public final void p(hv1 hv1Var) {
        if (hv1Var == null) {
            R(0);
            throw null;
        }
        ixa.r(hv1Var, null);
        this.b.add(hv1Var);
    }

    @Override // defpackage.h91
    public final void r(hv1 hv1Var, hv1 hv1Var2) {
        if (hv1Var2 != null) {
            return;
        }
        R(2);
        throw null;
    }
}
