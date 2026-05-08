package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.d0;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class dmd {

    public static final class a extends mj8 implements Function1<mzg, j6g> {
        final /* synthetic */ mzg $contentWindowInsets;
        final /* synthetic */ l4a $safeInsets;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l4a l4aVar, mzg mzgVar) {
            super(1);
            this.$safeInsets = l4aVar;
            this.$contentWindowInsets = mzgVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(mzg mzgVar) {
            l4a l4aVar = this.$safeInsets;
            ((gme) l4aVar.a).setValue(new b15(this.$contentWindowInsets, mzgVar));
            return j6g.a;
        }
    }

    public static final class b extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $bottomBar;
        final /* synthetic */ wu5<gza, androidx.compose.runtime.b, Integer, j6g> $content;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $floatingActionButton;
        final /* synthetic */ int $floatingActionButtonPosition;
        final /* synthetic */ l4a $safeInsets;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $snackbarHost;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $topBar;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(int i, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2, wu5<? super gza, ? super androidx.compose.runtime.b, ? super Integer, j6g> wu5Var, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function22, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function23, l4a l4aVar, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function24) {
            super(2);
            this.$floatingActionButtonPosition = i;
            this.$topBar = function2;
            this.$content = wu5Var;
            this.$snackbarHost = function22;
            this.$floatingActionButton = function23;
            this.$safeInsets = l4aVar;
            this.$bottomBar = function24;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            if ((num.intValue() & 3) == 2 && bVar2.i()) {
                bVar2.D();
            } else {
                dmd.b(this.$floatingActionButtonPosition, this.$topBar, this.$content, this.$snackbarHost, this.$floatingActionButton, this.$safeInsets, this.$bottomBar, bVar2, 0);
            }
            return j6g.a;
        }
    }

    public static final class c extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $bottomBar;
        final /* synthetic */ long $containerColor;
        final /* synthetic */ wu5<gza, androidx.compose.runtime.b, Integer, j6g> $content;
        final /* synthetic */ long $contentColor;
        final /* synthetic */ mzg $contentWindowInsets;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $floatingActionButton;
        final /* synthetic */ int $floatingActionButtonPosition;
        final /* synthetic */ e $modifier;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $snackbarHost;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $topBar;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(e eVar, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function22, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function23, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function24, int i, long j, long j2, mzg mzgVar, wu5<? super gza, ? super androidx.compose.runtime.b, ? super Integer, j6g> wu5Var, int i2, int i3) {
            super(2);
            this.$modifier = eVar;
            this.$topBar = function2;
            this.$bottomBar = function22;
            this.$snackbarHost = function23;
            this.$floatingActionButton = function24;
            this.$floatingActionButtonPosition = i;
            this.$containerColor = j;
            this.$contentColor = j2;
            this.$contentWindowInsets = mzgVar;
            this.$content = wu5Var;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            dmd.a(this.$modifier, this.$topBar, this.$bottomBar, this.$snackbarHost, this.$floatingActionButton, this.$floatingActionButtonPosition, this.$containerColor, this.$contentColor, this.$contentWindowInsets, this.$content, bVar, ka2.L(this.$$changed | 1), this.$$default);
            return j6g.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0224 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x024e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(androidx.compose.ui.e r30, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r31, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r32, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r33, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r34, int r35, long r36, long r38, defpackage.mzg r40, defpackage.wu5<? super defpackage.gza, ? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r41, androidx.compose.runtime.b r42, int r43, int r44) {
        /*
            Method dump skipped, instruction units count: 696
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmd.a(androidx.compose.ui.e, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, int, long, long, mzg, wu5, androidx.compose.runtime.b, int, int):void");
    }

    public static final void b(int i, Function2 function2, wu5 wu5Var, Function2 function22, Function2 function23, mzg mzgVar, Function2 function24, androidx.compose.runtime.b bVar, int i2) {
        int i3;
        wu5 wu5Var2;
        mzg mzgVar2;
        Function2 function25;
        androidx.compose.runtime.c cVarH = bVar.h(-975511942);
        if ((i2 & 6) == 0) {
            i3 = (cVarH.d(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= cVarH.x(function2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            wu5Var2 = wu5Var;
            i3 |= cVarH.x(wu5Var2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        } else {
            wu5Var2 = wu5Var;
        }
        if ((i2 & 3072) == 0) {
            i3 |= cVarH.x(function22) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i2 & 24576) == 0) {
            i3 |= cVarH.x(function23) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            mzgVar2 = mzgVar;
            i3 |= cVarH.K(mzgVar2) ? 131072 : 65536;
        } else {
            mzgVar2 = mzgVar;
        }
        if ((1572864 & i2) == 0) {
            function25 = function24;
            i3 |= cVarH.x(function25) ? 1048576 : 524288;
        } else {
            function25 = function24;
        }
        if ((i3 & 599187) == 599186 && cVarH.i()) {
            cVarH.D();
        } else {
            boolean z = ((i3 & 896) == 256) | ((i3 & 112) == 32) | ((i3 & 7168) == 2048) | ((458752 & i3) == 131072) | ((57344 & i3) == 16384) | ((i3 & 14) == 4) | ((3670016 & i3) == 1048576);
            Object objV = cVarH.v();
            if (z || objV == b.a.a) {
                mmd mmdVar = new mmd(function2, function22, function23, i, mzgVar2, function25, wu5Var2);
                cVarH.p(mmdVar);
                objV = mmdVar;
            }
            d0.a(null, (Function2) objV, cVarH, 0, 1);
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new nmd(i, function2, wu5Var, function22, function23, mzgVar, function24, i2);
        }
    }
}
