package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.c20;
import defpackage.csf;
import defpackage.gl2;
import defpackage.pm8;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class qef {
    public static final long a = mq2.a(0, 0, 0, 0);
    public static final float b = 16.0f;
    public static final float c = 12.0f;
    public static final float d = 4.0f;
    public static final float e = 2.0f;
    public static final float f = 24.0f;
    public static final float g = 16.0f;
    public static final float h = 16.0f;
    public static final androidx.compose.ui.e i = androidx.compose.foundation.layout.g.a(e.a.b, 48.0f, 48.0f);

    public static final class a extends mj8 implements Function1<kie, j6g> {
        final /* synthetic */ float $labelProgressValue;
        final /* synthetic */ g4a<kie> $labelSize;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f, g4a<kie> g4aVar) {
            super(1);
            this.$labelProgressValue = f;
            this.$labelSize = g4aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(kie kieVar) {
            long j = kieVar.a;
            float fD = kie.d(j) * this.$labelProgressValue;
            float fB = kie.b(j) * this.$labelProgressValue;
            if (kie.d(this.$labelSize.getValue().a) != fD || kie.b(this.$labelSize.getValue().a) != fB) {
                this.$labelSize.setValue(new kie(oie.e(fD, fB)));
            }
            return j6g.a;
        }
    }

    public static final class b extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $container;
        final /* synthetic */ gza $contentPadding;
        final /* synthetic */ g4a<kie> $labelSize;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(g4a<kie> g4aVar, gza gzaVar, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2) {
            super(2);
            this.$labelSize = g4aVar;
            this.$contentPadding = gzaVar;
            this.$container = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            if ((num.intValue() & 3) == 2 && bVar2.i()) {
                bVar2.D();
            } else {
                androidx.compose.ui.e eVarB = androidx.compose.ui.layout.h.b(e.a.b, "Container");
                ref refVar = new ref(this.$labelSize, g4a.class, "value", "getValue()Ljava/lang/Object;", 0);
                gza gzaVar = this.$contentPadding;
                int i = vwa.b;
                androidx.compose.ui.e eVarC = androidx.compose.ui.draw.a.c(eVarB, new zwa(refVar, gzaVar));
                Function2<androidx.compose.runtime.b, Integer, j6g> function2 = this.$container;
                ag9 ag9VarD = hl1.d(c20.a.a, true);
                int iG = bVar2.G();
                t8b t8bVarM = bVar2.m();
                androidx.compose.ui.e eVarC2 = androidx.compose.ui.c.c(bVar2, eVarC);
                gl2.j.getClass();
                pm8.a aVar = gl2.a.b;
                if (bVar2.j() == null) {
                    pg8.B();
                    throw null;
                }
                bVar2.B();
                if (bVar2.f()) {
                    bVar2.y(aVar);
                } else {
                    bVar2.n();
                }
                ygg.y(bVar2, ag9VarD, gl2.a.g);
                ygg.y(bVar2, t8bVarM, gl2.a.f);
                gl2.a.C0251a c0251a = gl2.a.j;
                if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iG))) {
                    uz.g(iG, bVar2, iG, c0251a);
                }
                ygg.y(bVar2, eVarC2, gl2.a.d);
                function2.invoke(bVar2, 0);
                bVar2.q();
            }
            return j6g.a;
        }
    }

    public static final class c extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $container;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2) {
            super(2);
            this.$container = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            if ((num.intValue() & 3) == 2 && bVar2.i()) {
                bVar2.D();
            } else {
                androidx.compose.ui.e eVarB = androidx.compose.ui.layout.h.b(e.a.b, "Container");
                Function2<androidx.compose.runtime.b, Integer, j6g> function2 = this.$container;
                ag9 ag9VarD = hl1.d(c20.a.a, true);
                int iG = bVar2.G();
                t8b t8bVarM = bVar2.m();
                androidx.compose.ui.e eVarC = androidx.compose.ui.c.c(bVar2, eVarB);
                gl2.j.getClass();
                pm8.a aVar = gl2.a.b;
                if (bVar2.j() == null) {
                    pg8.B();
                    throw null;
                }
                bVar2.B();
                if (bVar2.f()) {
                    bVar2.y(aVar);
                } else {
                    bVar2.n();
                }
                ygg.y(bVar2, ag9VarD, gl2.a.g);
                ygg.y(bVar2, t8bVarM, gl2.a.f);
                gl2.a.C0251a c0251a = gl2.a.j;
                if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iG))) {
                    uz.g(iG, bVar2, iG, c0251a);
                }
                ygg.y(bVar2, eVarC, gl2.a.d);
                function2.invoke(bVar2, 0);
                bVar2.q();
            }
            return j6g.a;
        }
    }

    public static final class d extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ tjf $bodyLarge;
        final /* synthetic */ tjf $bodySmall;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $it;
        final /* synthetic */ ese<da2> $labelContentColor;
        final /* synthetic */ float $labelProgressValue;
        final /* synthetic */ ese<da2> $labelTextStyleColor;
        final /* synthetic */ boolean $overrideLabelTextStyleColor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(tjf tjfVar, tjf tjfVar2, float f, csf.d dVar, Function2 function2, boolean z, csf.d dVar2) {
            super(2);
            this.$bodyLarge = tjfVar;
            this.$bodySmall = tjfVar2;
            this.$labelProgressValue = f;
            this.$labelContentColor = dVar;
            this.$it = function2;
            this.$overrideLabelTextStyleColor = z;
            this.$labelTextStyleColor = dVar2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            if ((num.intValue() & 3) == 2 && bVar2.i()) {
                bVar2.D();
            } else {
                tjf tjfVarR = web.r(this.$bodyLarge, this.$bodySmall, this.$labelProgressValue);
                boolean z = this.$overrideLabelTextStyleColor;
                ese<da2> eseVar = this.$labelTextStyleColor;
                if (z) {
                    tjfVarR = tjf.a(tjfVarR, eseVar.getValue().a, 0L, null, null, null, 0L, 0, 0L, null, null, 0, 16777214);
                }
                qef.b(this.$labelContentColor.getValue().a, tjfVarR, this.$it, bVar2, 0);
            }
            return j6g.a;
        }
    }

    public static final class e extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $it;
        final /* synthetic */ long $leadingIconColor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(long j, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2) {
            super(2);
            this.$leadingIconColor = j;
            this.$it = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            if ((num.intValue() & 3) == 2 && bVar2.i()) {
                bVar2.D();
            } else {
                qef.c(this.$leadingIconColor, this.$it, bVar2, 0);
            }
            return j6g.a;
        }
    }

    public static final class f extends mj8 implements wu5<androidx.compose.ui.e, androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ tjf $bodyLarge;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $placeholder;
        final /* synthetic */ ese<Float> $placeholderAlpha;
        final /* synthetic */ long $placeholderColor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(csf.d dVar, long j, tjf tjfVar, Function2 function2) {
            super(3);
            this.$placeholderAlpha = dVar;
            this.$placeholderColor = j;
            this.$bodyLarge = tjfVar;
            this.$placeholder = function2;
        }

        @Override // defpackage.wu5
        public final j6g q(androidx.compose.ui.e eVar, androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.ui.e eVar2 = eVar;
            androidx.compose.runtime.b bVar2 = bVar;
            int iIntValue = num.intValue();
            if ((iIntValue & 6) == 0) {
                iIntValue |= bVar2.K(eVar2) ? 4 : 2;
            }
            if ((iIntValue & 19) == 18 && bVar2.i()) {
                bVar2.D();
            } else {
                boolean zK = bVar2.K(this.$placeholderAlpha);
                ese<Float> eseVar = this.$placeholderAlpha;
                Object objV = bVar2.v();
                if (zK || objV == b.a.a) {
                    objV = new uef(eseVar);
                    bVar2.p(objV);
                }
                androidx.compose.ui.e eVarA = androidx.compose.ui.graphics.a.a(eVar2, (Function1) objV);
                long j = this.$placeholderColor;
                tjf tjfVar = this.$bodyLarge;
                Function2<androidx.compose.runtime.b, Integer, j6g> function2 = this.$placeholder;
                ag9 ag9VarD = hl1.d(c20.a.a, false);
                int iG = bVar2.G();
                t8b t8bVarM = bVar2.m();
                androidx.compose.ui.e eVarC = androidx.compose.ui.c.c(bVar2, eVarA);
                gl2.j.getClass();
                pm8.a aVar = gl2.a.b;
                if (bVar2.j() == null) {
                    pg8.B();
                    throw null;
                }
                bVar2.B();
                if (bVar2.f()) {
                    bVar2.y(aVar);
                } else {
                    bVar2.n();
                }
                ygg.y(bVar2, ag9VarD, gl2.a.g);
                ygg.y(bVar2, t8bVarM, gl2.a.f);
                gl2.a.C0251a c0251a = gl2.a.j;
                if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iG))) {
                    uz.g(iG, bVar2, iG, c0251a);
                }
                ygg.y(bVar2, eVarC, gl2.a.d);
                qef.b(j, tjfVar, function2, bVar2, 0);
                bVar2.q();
            }
            return j6g.a;
        }
    }

    public static final class g extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ tjf $bodyLarge;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $prefix;
        final /* synthetic */ long $prefixColor;
        final /* synthetic */ ese<Float> $prefixSuffixAlpha;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(csf.d dVar, long j, tjf tjfVar, Function2 function2) {
            super(2);
            this.$prefixSuffixAlpha = dVar;
            this.$prefixColor = j;
            this.$bodyLarge = tjfVar;
            this.$prefix = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            if ((num.intValue() & 3) == 2 && bVar2.i()) {
                bVar2.D();
            } else {
                boolean zK = bVar2.K(this.$prefixSuffixAlpha);
                ese<Float> eseVar = this.$prefixSuffixAlpha;
                Object objV = bVar2.v();
                if (zK || objV == b.a.a) {
                    objV = new wef(eseVar);
                    bVar2.p(objV);
                }
                androidx.compose.ui.e eVarA = androidx.compose.ui.graphics.a.a(e.a.b, (Function1) objV);
                long j = this.$prefixColor;
                tjf tjfVar = this.$bodyLarge;
                Function2<androidx.compose.runtime.b, Integer, j6g> function2 = this.$prefix;
                ag9 ag9VarD = hl1.d(c20.a.a, false);
                int iG = bVar2.G();
                t8b t8bVarM = bVar2.m();
                androidx.compose.ui.e eVarC = androidx.compose.ui.c.c(bVar2, eVarA);
                gl2.j.getClass();
                pm8.a aVar = gl2.a.b;
                if (bVar2.j() == null) {
                    pg8.B();
                    throw null;
                }
                bVar2.B();
                if (bVar2.f()) {
                    bVar2.y(aVar);
                } else {
                    bVar2.n();
                }
                ygg.y(bVar2, ag9VarD, gl2.a.g);
                ygg.y(bVar2, t8bVarM, gl2.a.f);
                gl2.a.C0251a c0251a = gl2.a.j;
                if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iG))) {
                    uz.g(iG, bVar2, iG, c0251a);
                }
                ygg.y(bVar2, eVarC, gl2.a.d);
                qef.b(j, tjfVar, function2, bVar2, 0);
                bVar2.q();
            }
            return j6g.a;
        }
    }

    public static final class h extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ tjf $bodyLarge;
        final /* synthetic */ ese<Float> $prefixSuffixAlpha;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $suffix;
        final /* synthetic */ long $suffixColor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(csf.d dVar, long j, tjf tjfVar, Function2 function2) {
            super(2);
            this.$prefixSuffixAlpha = dVar;
            this.$suffixColor = j;
            this.$bodyLarge = tjfVar;
            this.$suffix = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            if ((num.intValue() & 3) == 2 && bVar2.i()) {
                bVar2.D();
            } else {
                boolean zK = bVar2.K(this.$prefixSuffixAlpha);
                ese<Float> eseVar = this.$prefixSuffixAlpha;
                Object objV = bVar2.v();
                if (zK || objV == b.a.a) {
                    objV = new xef(eseVar);
                    bVar2.p(objV);
                }
                androidx.compose.ui.e eVarA = androidx.compose.ui.graphics.a.a(e.a.b, (Function1) objV);
                long j = this.$suffixColor;
                tjf tjfVar = this.$bodyLarge;
                Function2<androidx.compose.runtime.b, Integer, j6g> function2 = this.$suffix;
                ag9 ag9VarD = hl1.d(c20.a.a, false);
                int iG = bVar2.G();
                t8b t8bVarM = bVar2.m();
                androidx.compose.ui.e eVarC = androidx.compose.ui.c.c(bVar2, eVarA);
                gl2.j.getClass();
                pm8.a aVar = gl2.a.b;
                if (bVar2.j() == null) {
                    pg8.B();
                    throw null;
                }
                bVar2.B();
                if (bVar2.f()) {
                    bVar2.y(aVar);
                } else {
                    bVar2.n();
                }
                ygg.y(bVar2, ag9VarD, gl2.a.g);
                ygg.y(bVar2, t8bVarM, gl2.a.f);
                gl2.a.C0251a c0251a = gl2.a.j;
                if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iG))) {
                    uz.g(iG, bVar2, iG, c0251a);
                }
                ygg.y(bVar2, eVarC, gl2.a.d);
                qef.b(j, tjfVar, function2, bVar2, 0);
                bVar2.q();
            }
            return j6g.a;
        }
    }

    public static final class i extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ tjf $bodySmall;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $it;
        final /* synthetic */ long $supportingTextColor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(long j, tjf tjfVar, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2) {
            super(2);
            this.$supportingTextColor = j;
            this.$bodySmall = tjfVar;
            this.$it = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            if ((num.intValue() & 3) == 2 && bVar2.i()) {
                bVar2.D();
            } else {
                qef.b(this.$supportingTextColor, this.$bodySmall, this.$it, bVar2, 0);
            }
            return j6g.a;
        }
    }

    public static final class j extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $it;
        final /* synthetic */ long $trailingIconColor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(long j, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2) {
            super(2);
            this.$trailingIconColor = j;
            this.$it = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            if ((num.intValue() & 3) == 2 && bVar2.i()) {
                bVar2.D();
            } else {
                qef.c(this.$trailingIconColor, this.$it, bVar2, 0);
            }
            return j6g.a;
        }
    }

    public static final class k extends mj8 implements gu5<Boolean> {
        final /* synthetic */ ese<Float> $placeholderAlpha;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(csf.d dVar) {
            super(0);
            this.$placeholderAlpha = dVar;
        }

        @Override // defpackage.gu5
        public final Boolean invoke() {
            return Boolean.valueOf(this.$placeholderAlpha.getValue().floatValue() > 0.0f);
        }
    }

    public static final class l extends mj8 implements gu5<Boolean> {
        final /* synthetic */ ese<Float> $prefixSuffixAlpha;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(csf.d dVar) {
            super(0);
            this.$prefixSuffixAlpha = dVar;
        }

        @Override // defpackage.gu5
        public final Boolean invoke() {
            return Boolean.valueOf(this.$prefixSuffixAlpha.getValue().floatValue() > 0.0f);
        }
    }

    public static final class m extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$changed1;
        final /* synthetic */ int $$default;
        final /* synthetic */ zdf $colors;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $container;
        final /* synthetic */ gza $contentPadding;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $innerTextField;
        final /* synthetic */ ei7 $interactionSource;
        final /* synthetic */ boolean $isError;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $label;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $leadingIcon;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $placeholder;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $prefix;
        final /* synthetic */ boolean $singleLine;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $suffix;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $supportingText;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $trailingIcon;
        final /* synthetic */ hhf $type;
        final /* synthetic */ String $value;
        final /* synthetic */ ftg $visualTransformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public m(hhf hhfVar, String str, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2, ftg ftgVar, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function22, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function23, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function24, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function25, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function26, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function27, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function28, boolean z, boolean z2, boolean z3, ei7 ei7Var, gza gzaVar, zdf zdfVar, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function29, int i, int i2, int i3) {
            super(2);
            this.$type = hhfVar;
            this.$value = str;
            this.$innerTextField = function2;
            this.$visualTransformation = ftgVar;
            this.$label = function22;
            this.$placeholder = function23;
            this.$leadingIcon = function24;
            this.$trailingIcon = function25;
            this.$prefix = function26;
            this.$suffix = function27;
            this.$supportingText = function28;
            this.$singleLine = z;
            this.$enabled = z2;
            this.$isError = z3;
            this.$interactionSource = ei7Var;
            this.$contentPadding = gzaVar;
            this.$colors = zdfVar;
            this.$container = function29;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$default = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            qef.a(this.$type, this.$value, this.$innerTextField, this.$visualTransformation, this.$label, this.$placeholder, this.$leadingIcon, this.$trailingIcon, this.$prefix, this.$suffix, this.$supportingText, this.$singleLine, this.$enabled, this.$isError, this.$interactionSource, this.$contentPadding, this.$colors, this.$container, bVar, ka2.L(this.$$changed | 1), ka2.L(this.$$changed1), this.$$default);
            return j6g.a;
        }
    }

    public /* synthetic */ class n {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[hhf.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[ef7.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            a = iArr2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0567 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x068d  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x06a2  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x06ea  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0709  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x074b  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0755  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0758  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0792  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x079b  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x079e  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x07b2  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x07b6  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x07ca  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x07cd  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x07e3  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x07e9  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x07ff  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x0802  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x0818  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x081c  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0834  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x08bf  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x0914  */
    /* JADX WARN: Removed duplicated region for block: B:494:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(defpackage.hhf r45, java.lang.String r46, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r47, defpackage.ftg r48, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r49, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r50, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r51, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r52, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r53, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r54, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r55, boolean r56, boolean r57, boolean r58, defpackage.ei7 r59, defpackage.gza r60, defpackage.zdf r61, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r62, androidx.compose.runtime.b r63, int r64, int r65, int r66) {
        /*
            Method dump skipped, instruction units count: 2361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qef.a(hhf, java.lang.String, kotlin.jvm.functions.Function2, ftg, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, boolean, boolean, ei7, gza, zdf, kotlin.jvm.functions.Function2, androidx.compose.runtime.b, int, int, int):void");
    }

    public static final void b(long j2, tjf tjfVar, Function2 function2, androidx.compose.runtime.b bVar, int i2) {
        int i3;
        long j3;
        tjf tjfVar2;
        Function2 function22;
        androidx.compose.runtime.c cVarH = bVar.h(1208685580);
        if ((i2 & 6) == 0) {
            i3 = (cVarH.e(j2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= cVarH.K(tjfVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= cVarH.x(function2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i3 & 147) == 146 && cVarH.i()) {
            cVarH.D();
            function22 = function2;
            tjfVar2 = tjfVar;
            j3 = j2;
        } else {
            h6c.a(j2, tjfVar, function2, cVarH, i3 & 1022);
            j3 = j2;
            tjfVar2 = tjfVar;
            function22 = function2;
        }
        androidx.compose.runtime.i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new cff(j3, tjfVar2, function22, i2);
        }
    }

    public static final void c(long j2, Function2 function2, androidx.compose.runtime.b bVar, int i2) {
        int i3;
        androidx.compose.runtime.c cVarH = bVar.h(660142980);
        if ((i2 & 6) == 0) {
            i3 = (cVarH.e(j2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= cVarH.x(function2) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && cVarH.i()) {
            cVarH.D();
        } else {
            rm2.a(qs2.a.a(new da2(j2)), function2, cVarH, (i3 & 112) | 8);
        }
        androidx.compose.runtime.i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new dff(j2, function2, i2);
        }
    }

    public static final g4a d(boolean z, boolean z2, boolean z3, zdf zdfVar, float f2, float f3, androidx.compose.runtime.b bVar, int i2) {
        ese eseVarG;
        ese eseVarG2;
        long j2 = !z ? zdfVar.n : z2 ? zdfVar.o : z3 ? zdfVar.l : zdfVar.m;
        if (z) {
            bVar.L(1023053998);
            eseVarG = vhe.a(j2, zd0.d(150, 0, null, 6), null, bVar, 48, 12);
            bVar.F();
        } else {
            bVar.L(1023165505);
            eseVarG = r.g(new da2(j2), bVar);
            bVar.F();
        }
        if (z) {
            bVar.L(1023269417);
            if (!z3) {
                f2 = f3;
            }
            eseVarG2 = vc0.a(f2, zd0.d(150, 0, null, 6), bVar, 48);
            bVar.F();
        } else {
            bVar.L(1023478388);
            eseVarG2 = r.g(new j94(f3), bVar);
            bVar.F();
        }
        return r.g(ee3.f(((da2) eseVarG.getValue()).a, ((j94) eseVarG2.getValue()).a), bVar);
    }

    public static final Object e(pl7 pl7Var) {
        Object objG = pl7Var.g();
        am8 am8Var = objG instanceof am8 ? (am8) objG : null;
        if (am8Var != null) {
            return am8Var.V0();
        }
        return null;
    }
}
