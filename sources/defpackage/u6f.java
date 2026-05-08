package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.i;
import androidx.compose.runtime.k;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.d0;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.c20;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class u6f {
    public static final dvf a;
    public static final dvf b;

    public static final class a extends mj8 implements wu5<List<? extends o6f>, androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $selectedTabIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i) {
            super(3);
            this.$selectedTabIndex = i;
        }

        @Override // defpackage.wu5
        public final j6g q(List<? extends o6f> list, androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            o6f o6fVar = list.get(this.$selectedTabIndex);
            q6f.a.b(0.0f, 3072, 6, 0L, bVar, androidx.compose.ui.c.a(e.a.b, tf7.a, new s6f(o6fVar)));
            return j6g.a;
        }
    }

    public static final class b extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ long $containerColor;
        final /* synthetic */ long $contentColor;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $divider;
        final /* synthetic */ float $edgePadding;
        final /* synthetic */ wu5<List<o6f>, androidx.compose.runtime.b, Integer, j6g> $indicator;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ int $selectedTabIndex;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $tabs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(int i, androidx.compose.ui.e eVar, long j, long j2, float f, wu5<? super List<o6f>, ? super androidx.compose.runtime.b, ? super Integer, j6g> wu5Var, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function22, int i2, int i3) {
            super(2);
            this.$selectedTabIndex = i;
            this.$modifier = eVar;
            this.$containerColor = j;
            this.$contentColor = j2;
            this.$edgePadding = f;
            this.$indicator = wu5Var;
            this.$divider = function2;
            this.$tabs = function22;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            u6f.a(this.$selectedTabIndex, this.$modifier, this.$containerColor, this.$contentColor, this.$edgePadding, this.$indicator, this.$divider, this.$tabs, bVar, ka2.L(this.$$changed | 1), this.$$default);
            return j6g.a;
        }
    }

    public static final class c extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $divider;
        final /* synthetic */ float $edgePadding;
        final /* synthetic */ wu5<List<o6f>, androidx.compose.runtime.b, Integer, j6g> $indicator;
        final /* synthetic */ zrd $scrollState;
        final /* synthetic */ int $selectedTabIndex;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $tabs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(zrd zrdVar, float f, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function22, wu5<? super List<o6f>, ? super androidx.compose.runtime.b, ? super Integer, j6g> wu5Var, int i) {
            super(2);
            this.$scrollState = zrdVar;
            this.$edgePadding = f;
            this.$tabs = function2;
            this.$divider = function22;
            this.$indicator = wu5Var;
            this.$selectedTabIndex = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            if ((num.intValue() & 3) == 2 && bVar2.i()) {
                bVar2.D();
            } else {
                Object objV = bVar2.v();
                b.a.C0020a c0020a = b.a.a;
                if (objV == c0020a) {
                    m74 m74Var = to4.a;
                    objV = new androidx.compose.runtime.e(new k(bVar2.l()));
                    bVar2.p(objV);
                }
                e13 e13Var = ((androidx.compose.runtime.e) objV).a;
                boolean zK = bVar2.K(this.$scrollState) | bVar2.K(e13Var);
                zrd zrdVar = this.$scrollState;
                Object objV2 = bVar2.v();
                if (zK || objV2 == c0020a) {
                    objV2 = new psd(zrdVar, e13Var);
                    bVar2.p(objV2);
                }
                psd psdVar = (psd) objV2;
                androidx.compose.ui.e eVarI = ygg.i(b5e.b(pnb.M(androidx.compose.foundation.layout.g.v(androidx.compose.foundation.layout.g.f(e.a.b, 1.0f), c20.a.d, 2), this.$scrollState, false), false, new gb(11)));
                boolean zC = bVar2.c(this.$edgePadding) | bVar2.K(this.$tabs) | bVar2.K(this.$divider) | bVar2.K(this.$indicator) | bVar2.x(psdVar) | bVar2.d(this.$selectedTabIndex);
                float f = this.$edgePadding;
                Function2<androidx.compose.runtime.b, Integer, j6g> function2 = this.$tabs;
                Function2<androidx.compose.runtime.b, Integer, j6g> function22 = this.$divider;
                int i = this.$selectedTabIndex;
                wu5<List<o6f>, androidx.compose.runtime.b, Integer, j6g> wu5Var = this.$indicator;
                Object objV3 = bVar2.v();
                if (zC || objV3 == c0020a) {
                    x6f x6fVar = new x6f(f, function2, function22, psdVar, i, wu5Var);
                    bVar2.p(x6fVar);
                    objV3 = x6fVar;
                }
                d0.a(eVarI, (Function2) objV3, bVar2, 0, 0);
            }
            return j6g.a;
        }
    }

    public static final class d extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ long $containerColor;
        final /* synthetic */ long $contentColor;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $divider;
        final /* synthetic */ float $edgePadding;
        final /* synthetic */ wu5<List<o6f>, androidx.compose.runtime.b, Integer, j6g> $indicator;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ zrd $scrollState;
        final /* synthetic */ int $selectedTabIndex;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $tabs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(int i, wu5<? super List<o6f>, ? super androidx.compose.runtime.b, ? super Integer, j6g> wu5Var, androidx.compose.ui.e eVar, long j, long j2, float f, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function22, zrd zrdVar, int i2, int i3) {
            super(2);
            this.$selectedTabIndex = i;
            this.$indicator = wu5Var;
            this.$modifier = eVar;
            this.$containerColor = j;
            this.$contentColor = j2;
            this.$edgePadding = f;
            this.$divider = function2;
            this.$tabs = function22;
            this.$scrollState = zrdVar;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            u6f.b(this.$selectedTabIndex, this.$indicator, this.$modifier, this.$containerColor, this.$contentColor, this.$edgePadding, this.$divider, this.$tabs, this.$scrollState, bVar, ka2.L(this.$$changed | 1), this.$$default);
            return j6g.a;
        }
    }

    public static final class e extends mj8 implements wu5<List<? extends o6f>, androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $selectedTabIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i) {
            super(3);
            this.$selectedTabIndex = i;
        }

        @Override // defpackage.wu5
        public final j6g q(List<? extends o6f> list, androidx.compose.runtime.b bVar, Integer num) {
            List<? extends o6f> list2 = list;
            androidx.compose.runtime.b bVar2 = bVar;
            num.intValue();
            if (this.$selectedTabIndex < list2.size()) {
                o6f o6fVar = list2.get(this.$selectedTabIndex);
                q6f.a.b(0.0f, 3072, 6, 0L, bVar2, androidx.compose.ui.c.a(e.a.b, tf7.a, new s6f(o6fVar)));
            }
            return j6g.a;
        }
    }

    public static final class f extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ long $containerColor;
        final /* synthetic */ long $contentColor;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $divider;
        final /* synthetic */ wu5<List<o6f>, androidx.compose.runtime.b, Integer, j6g> $indicator;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ int $selectedTabIndex;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $tabs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(int i, androidx.compose.ui.e eVar, long j, long j2, wu5<? super List<o6f>, ? super androidx.compose.runtime.b, ? super Integer, j6g> wu5Var, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function22, int i2, int i3) {
            super(2);
            this.$selectedTabIndex = i;
            this.$modifier = eVar;
            this.$containerColor = j;
            this.$contentColor = j2;
            this.$indicator = wu5Var;
            this.$divider = function2;
            this.$tabs = function22;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            u6f.c(this.$selectedTabIndex, this.$modifier, this.$containerColor, this.$contentColor, this.$indicator, this.$divider, this.$tabs, bVar, ka2.L(this.$$changed | 1), this.$$default);
            return j6g.a;
        }
    }

    public static final class g extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $divider;
        final /* synthetic */ wu5<List<o6f>, androidx.compose.runtime.b, Integer, j6g> $indicator;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $tabs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function22, wu5<? super List<o6f>, ? super androidx.compose.runtime.b, ? super Integer, j6g> wu5Var) {
            super(2);
            this.$tabs = function2;
            this.$divider = function22;
            this.$indicator = wu5Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            if ((num.intValue() & 3) == 2 && bVar2.i()) {
                bVar2.D();
            } else {
                androidx.compose.ui.e eVarF = androidx.compose.foundation.layout.g.f(e.a.b, 1.0f);
                boolean zK = bVar2.K(this.$tabs) | bVar2.K(this.$divider) | bVar2.K(this.$indicator);
                Function2<androidx.compose.runtime.b, Integer, j6g> function2 = this.$tabs;
                Function2<androidx.compose.runtime.b, Integer, j6g> function22 = this.$divider;
                wu5<List<o6f>, androidx.compose.runtime.b, Integer, j6g> wu5Var = this.$indicator;
                Object objV = bVar2.v();
                if (zK || objV == b.a.a) {
                    objV = new a7f(function2, function22, wu5Var);
                    bVar2.p(objV);
                }
                d0.a(eVarF, (Function2) objV, bVar2, 6, 0);
            }
            return j6g.a;
        }
    }

    public static final class h extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ long $containerColor;
        final /* synthetic */ long $contentColor;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $divider;
        final /* synthetic */ wu5<List<o6f>, androidx.compose.runtime.b, Integer, j6g> $indicator;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $tabs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(androidx.compose.ui.e eVar, long j, long j2, wu5<? super List<o6f>, ? super androidx.compose.runtime.b, ? super Integer, j6g> wu5Var, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function22, int i) {
            super(2);
            this.$modifier = eVar;
            this.$containerColor = j;
            this.$contentColor = j2;
            this.$indicator = wu5Var;
            this.$divider = function2;
            this.$tabs = function22;
            this.$$changed = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            u6f.d(this.$modifier, this.$containerColor, this.$contentColor, this.$indicator, this.$divider, this.$tabs, bVar, ka2.L(this.$$changed | 1));
            return j6g.a;
        }
    }

    static {
        l83 l83Var = bf4.a;
        a = zd0.d(250, 0, l83Var, 2);
        b = zd0.d(250, 0, l83Var, 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d8 A[PHI: r17
  0x00d8: PHI (r17v4 int) = (r17v0 int), (r17v2 int), (r17v3 int) binds: [B:80:0x00d6, B:88:0x00ec, B:87:0x00e9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(int r19, androidx.compose.ui.e r20, long r21, long r23, float r25, defpackage.wu5<? super java.util.List<defpackage.o6f>, ? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r26, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r27, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r28, androidx.compose.runtime.b r29, int r30, int r31) {
        /*
            Method dump skipped, instruction units count: 457
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u6f.a(int, androidx.compose.ui.e, long, long, float, wu5, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.runtime.b, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(int r27, defpackage.wu5<? super java.util.List<defpackage.o6f>, ? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r28, androidx.compose.ui.e r29, long r30, long r32, float r34, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r35, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r36, defpackage.zrd r37, androidx.compose.runtime.b r38, int r39, int r40) {
        /*
            Method dump skipped, instruction units count: 466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u6f.b(int, wu5, androidx.compose.ui.e, long, long, float, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, zrd, androidx.compose.runtime.b, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(int r21, androidx.compose.ui.e r22, long r23, long r25, defpackage.wu5<? super java.util.List<defpackage.o6f>, ? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r27, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r28, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r29, androidx.compose.runtime.b r30, int r31, int r32) {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u6f.c(int, androidx.compose.ui.e, long, long, wu5, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.runtime.b, int, int):void");
    }

    public static final void d(androidx.compose.ui.e eVar, long j, long j2, wu5<? super List<o6f>, ? super androidx.compose.runtime.b, ? super Integer, j6g> wu5Var, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function22, androidx.compose.runtime.b bVar, int i) {
        int i2;
        androidx.compose.runtime.c cVar;
        androidx.compose.runtime.c cVarH = bVar.h(-160898917);
        if ((i & 6) == 0) {
            i2 = (cVarH.K(eVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.e(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.e(j2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i2 |= cVarH.x(wu5Var) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i & 24576) == 0) {
            i2 |= cVarH.x(function2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= cVarH.x(function22) ? 131072 : 65536;
        }
        if ((74899 & i2) == 74898 && cVarH.i()) {
            cVarH.D();
            cVar = cVarH;
        } else {
            int i3 = i2 << 3;
            cVar = cVarH;
            l0f.a(b5e.b(eVar, false, new gb(11)), null, j, j2, 0.0f, 0.0f, null, bh2.c(-1617702432, new g(function22, function2, wu5Var), cVarH), cVar, (i3 & 896) | 12582912 | (i3 & 7168), 114);
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new h(eVar, j, j2, wu5Var, function2, function22, i);
        }
    }
}
