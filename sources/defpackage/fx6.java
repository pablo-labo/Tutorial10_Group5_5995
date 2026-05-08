package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class fx6 {

    @uh3(c = "com.indeed.ifl.components.IdlSelectListKt$IdlSelectList$1$1", f = "IdlSelectList.kt", l = {269}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ ss8 $listState;
        final /* synthetic */ List<ax6> $selectListItems;
        final /* synthetic */ Integer $selectedIndex;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Integer num, List<ax6> list, ss8 ss8Var, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$selectedIndex = num;
            this.$selectListItems = list;
            this.$listState = ss8Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$selectedIndex, this.$selectListItems, this.$listState, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                Integer num = this.$selectedIndex;
                if (num != null) {
                    List<ax6> list = this.$selectListItems;
                    ss8 ss8Var = this.$listState;
                    int iIntValue = num.intValue();
                    if (iIntValue >= 0 && iIntValue < list.size()) {
                        this.label = 1;
                        Object objF = ss8.f(ss8Var, iIntValue, this);
                        g13 g13Var = g13.a;
                        if (objF == g13Var) {
                            return g13Var;
                        }
                    }
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            return j6g.a;
        }
    }

    public static final class b implements Function1<Integer, Object> {
        public final /* synthetic */ List a;

        public b(List list) {
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Integer num) {
            this.a.get(num.intValue());
            return null;
        }
    }

    public static final class c implements xu5<xo8, Integer, androidx.compose.runtime.b, Integer, j6g> {
        public final /* synthetic */ List a;

        public c(List list) {
            this.a = list;
        }

        @Override // defpackage.xu5
        public final j6g j(xo8 xo8Var, Integer num, androidx.compose.runtime.b bVar, Integer num2) {
            int i;
            androidx.compose.runtime.b bVar2;
            xo8 xo8Var2 = xo8Var;
            int iIntValue = num.intValue();
            androidx.compose.runtime.b bVar3 = bVar;
            int iIntValue2 = num2.intValue();
            if ((iIntValue2 & 6) == 0) {
                i = (bVar3.K(xo8Var2) ? 4 : 2) | iIntValue2;
            } else {
                i = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i |= bVar3.d(iIntValue) ? 32 : 16;
            }
            if (bVar3.o(i & 1, (i & 147) != 146)) {
                ax6 ax6Var = (ax6) this.a.get(iIntValue);
                bVar3.L(1497161224);
                if (ax6Var.c != null) {
                    bVar3.L(1497171360);
                    bVar2 = bVar3;
                    fx6.b(ax6Var.a, ax6Var.c, ax6Var.d, ax6Var.e, ax6Var.b, bVar2, 48, 0);
                    bVar2.F();
                } else {
                    bVar3.L(1497654216);
                    fx6.c(ax6Var.a, ax6Var.d, ax6Var.e, ax6Var.b, bVar3, 48);
                    bVar2 = bVar3;
                    bVar2.F();
                }
                bVar2.F();
            } else {
                bVar3.D();
            }
            return j6g.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x008d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final java.util.List<defpackage.ax6> r20, androidx.compose.ui.e r21, boolean r22, java.lang.String r23, androidx.compose.runtime.b r24, final int r25, final int r26) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fx6.a(java.util.List, androidx.compose.ui.e, boolean, java.lang.String, androidx.compose.runtime.b, int, int):void");
    }

    @sy3
    public static final void b(final String str, final fv6 fv6Var, final boolean z, boolean z2, final gu5 gu5Var, androidx.compose.runtime.b bVar, final int i, final int i2) {
        int i3;
        final boolean z3;
        androidx.compose.runtime.c cVarF = q6.f(-1706959971, gu5Var, bVar, str);
        int i4 = i | (cVarF.K(str) ? 4 : 2) | (cVarF.d(fv6Var == null ? -1 : fv6Var.ordinal()) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        if ((i2 & 8) != 0) {
            i3 = i4 | 3072;
        } else {
            i3 = i4 | (cVarF.K(null) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        }
        int i5 = i2 & 32;
        int i6 = i3 | (cVarF.a(z) ? 16384 : 8192) | (i5 != 0 ? 196608 : cVarF.a(z2) ? 131072 : 65536) | (cVarF.x(gu5Var) ? 1048576 : 524288) | ((i2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? 12582912 : cVarF.K(null) ? 8388608 : 4194304);
        if ((4793491 & i6) == 4793490 && cVarF.i()) {
            cVarF.D();
            z3 = z2;
        } else {
            if (i5 != 0) {
                z2 = false;
            }
            int i7 = (i6 & 126) | ((i6 >> 3) & 896) | ((i6 << 3) & 7168) | (57344 & i6) | (458752 & i6);
            int i8 = i6 << 6;
            boolean z4 = z2;
            d(str, e.a.b, null, fv6Var, z, z4, gu5Var, null, cVarF, i7 | (234881024 & i8) | (i8 & 1879048192), 192);
            z3 = z4;
        }
        i iVarW = cVarF.W();
        if (iVarW != null) {
            iVarW.d = new Function2(str, fv6Var, z, z3, gu5Var, i, i2) { // from class: cx6
                public final /* synthetic */ String a;
                public final /* synthetic */ fv6 b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ gu5 e;
                public final /* synthetic */ int f;

                {
                    this.f = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(49);
                    fx6.b(this.a, this.b, this.c, this.d, this.e, (b) obj, iL, this.f);
                    return j6g.a;
                }
            };
        }
    }

    public static final void c(final String str, final boolean z, final boolean z2, final gu5 gu5Var, androidx.compose.runtime.b bVar, final int i) {
        androidx.compose.runtime.c cVarF = q6.f(424495910, gu5Var, bVar, str);
        int i2 = i | (cVarF.K(str) ? 4 : 2) | (cVarF.K(null) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarF.a(z) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) | (cVarF.a(z2) ? 16384 : 8192) | (cVarF.x(null) ? 131072 : 65536) | (cVarF.x(null) ? 1048576 : 524288) | (cVarF.x(gu5Var) ? 8388608 : 4194304) | (cVarF.K(null) ? 67108864 : 33554432);
        if ((38347923 & i2) == 38347922 && cVarF.i()) {
            cVarF.D();
        } else {
            int i3 = i2 & 1022;
            int i4 = i2 << 3;
            d(str, e.a.b, null, null, z, z2, gu5Var, null, cVarF, i3 | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (29360128 & i4) | (234881024 & i4) | (i4 & 1879048192), 8);
        }
        i iVarW = cVarF.W();
        if (iVarW != null) {
            iVarW.d = new Function2(str, z, z2, gu5Var, i) { // from class: dx6
                public final /* synthetic */ String a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ gu5 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(49);
                    fx6.c(this.a, this.b, this.c, this.d, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0459  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(final java.lang.String r53, final androidx.compose.ui.e r54, final java.lang.String r55, defpackage.fv6 r56, final boolean r57, final boolean r58, final defpackage.gu5 r59, final java.lang.String r60, androidx.compose.runtime.b r61, final int r62, final int r63) {
        /*
            Method dump skipped, instruction units count: 1208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fx6.d(java.lang.String, androidx.compose.ui.e, java.lang.String, fv6, boolean, boolean, gu5, java.lang.String, androidx.compose.runtime.b, int, int):void");
    }
}
