package defpackage;

import defpackage.ax1;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class zwa extends mj8 implements Function1<ss2, j6g> {
    final /* synthetic */ gu5<kie> $labelSize;
    final /* synthetic */ gza $paddingValues;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[vl8.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zwa(ref refVar, gza gzaVar) {
        super(1);
        this.$labelSize = refVar;
        this.$paddingValues = gzaVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(ss2 ss2Var) {
        ss2 ss2Var2 = ss2Var;
        long j = this.$labelSize.invoke().a;
        float fD = kie.d(j);
        if (fD > 0.0f) {
            int i = vwa.b;
            float fT1 = ss2Var2.t1(4.0f);
            float fT12 = ss2Var2.t1(this.$paddingValues.b(ss2Var2.getLayoutDirection())) - fT1;
            float fD2 = (fT1 * 2.0f) + fD + fT12;
            vl8 layoutDirection = ss2Var2.getLayoutDirection();
            int[] iArr = a.a;
            float fD3 = iArr[layoutDirection.ordinal()] == 1 ? kie.d(ss2Var2.c()) - fD2 : fT12 < 0.0f ? 0.0f : fT12;
            if (iArr[ss2Var2.getLayoutDirection().ordinal()] == 1) {
                fD2 = kie.d(ss2Var2.c()) - (fT12 >= 0.0f ? fT12 : 0.0f);
            }
            float f = fD2;
            float fB = kie.b(j);
            float f2 = (-fB) / 2.0f;
            float f3 = fB / 2.0f;
            ax1.b bVarW1 = ss2Var2.w1();
            long jD = bVarW1.d();
            bVarW1.a().o();
            try {
                bVarW1.a.d(fD3, f2, f, f3, 0);
                ss2Var2.N1();
            } finally {
                g7.k(bVarW1, jD);
            }
        } else {
            ss2Var2.N1();
        }
        return j6g.a;
    }
}
