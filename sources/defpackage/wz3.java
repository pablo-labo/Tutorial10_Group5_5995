package defpackage;

import defpackage.hv1;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class wz3 extends h91 {
    public final /* synthetic */ sw4 b;
    public final /* synthetic */ LinkedHashSet c;
    public final /* synthetic */ boolean d;

    public class a implements Function1<hv1, j6g> {
        public a() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(hv1 hv1Var) {
            hv1 hv1Var2 = hv1Var;
            if (hv1Var2 != null) {
                wz3.this.b.d(hv1Var2);
                return j6g.a;
            }
            l5.q("Argument for @NotNull parameter 'descriptor' of kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1.invoke must not be null");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wz3(sw4 sw4Var, LinkedHashSet linkedHashSet, boolean z) {
        super(8);
        this.b = sw4Var;
        this.c = linkedHashSet;
        this.d = z;
    }

    public static /* synthetic */ void R(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "fromSuper";
        } else if (i == 2) {
            objArr[0] = "fromCurrent";
        } else if (i == 3) {
            objArr[0] = "member";
        } else if (i != 4) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "overridden";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
        if (i == 1 || i == 2) {
            objArr[2] = "conflict";
        } else if (i == 3 || i == 4) {
            objArr[2] = "setOverriddenDescriptors";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // defpackage.h91
    public final void L(hv1 hv1Var, Collection<? extends hv1> collection) {
        if (hv1Var == null) {
            R(3);
            throw null;
        }
        if (!this.d || hv1Var.f() == hv1.a.b) {
            hv1Var.C0(collection);
        }
    }

    @Override // defpackage.h91
    public final void p(hv1 hv1Var) {
        if (hv1Var == null) {
            R(0);
            throw null;
        }
        ixa.r(hv1Var, new a());
        this.c.add(hv1Var);
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
