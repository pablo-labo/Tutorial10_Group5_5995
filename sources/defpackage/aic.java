package defpackage;

import androidx.compose.ui.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class aic {

    public static final class a extends mj8 implements Function1<gb4, j6g> {
        final /* synthetic */ ese<j94> $dotRadius;
        final /* synthetic */ ese<da2> $radioColor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ese<da2> eseVar, ese<j94> eseVar2) {
            super(1);
            this.$radioColor = eseVar;
            this.$dotRadius = eseVar2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(gb4 gb4Var) {
            gb4 gb4Var2 = gb4Var;
            float fT1 = gb4Var2.t1(2.0f);
            float f = fT1 / 2.0f;
            gb4.q0(gb4Var2, this.$radioColor.getValue().a, gb4Var2.t1(10.0f) - f, 0L, new bwe(fT1, 0.0f, 0, 0, null, 30), 108);
            if (Float.compare(this.$dotRadius.getValue().a, 0.0f) > 0) {
                gb4.q0(gb4Var2, this.$radioColor.getValue().a, gb4Var2.t1(this.$dotRadius.getValue().a) - f, 0L, ib5.a, 108);
            }
            return j6g.a;
        }
    }

    public static final class b extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ xhc $colors;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ d3a $interactionSource;
        final /* synthetic */ e $modifier;
        final /* synthetic */ gu5<j6g> $onClick;
        final /* synthetic */ boolean $selected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z, gu5<j6g> gu5Var, e eVar, boolean z2, xhc xhcVar, d3a d3aVar, int i, int i2) {
            super(2);
            this.$selected = z;
            this.$onClick = gu5Var;
            this.$modifier = eVar;
            this.$enabled = z2;
            this.$colors = xhcVar;
            this.$interactionSource = d3aVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            aic.a(this.$selected, this.$onClick, this.$modifier, this.$enabled, this.$colors, this.$interactionSource, bVar, ka2.L(this.$$changed | 1), this.$$default);
            return j6g.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x013e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0129  */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(boolean r26, defpackage.gu5<defpackage.j6g> r27, androidx.compose.ui.e r28, boolean r29, defpackage.xhc r30, defpackage.d3a r31, androidx.compose.runtime.b r32, int r33, int r34) {
        /*
            Method dump skipped, instruction units count: 536
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aic.a(boolean, gu5, androidx.compose.ui.e, boolean, xhc, d3a, androidx.compose.runtime.b, int, int):void");
    }
}
