package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.navigation.d;
import androidx.navigation.k;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.pk1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class zde {

    @uh3(c = "androidx.compose.material.navigation.SheetContentHostKt$SheetContentHost$1$1", f = "SheetContentHost.kt", l = {61}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ d $backStackEntry;
        final /* synthetic */ ese<Function1<d, j6g>> $currentOnSheetDismissed$delegate;
        final /* synthetic */ ese<Function1<d, j6g>> $currentOnSheetShown$delegate;
        final /* synthetic */ hw9 $sheetState;
        int label;

        /* JADX INFO: renamed from: zde$a$a, reason: collision with other inner class name */
        public static final class C0492a extends mj8 implements gu5<Boolean> {
            final /* synthetic */ hw9 $sheetState;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0492a(hw9 hw9Var) {
                super(0);
                this.$sheetState = hw9Var;
            }

            @Override // defpackage.gu5
            public final Boolean invoke() {
                return Boolean.valueOf(this.$sheetState.c());
            }
        }

        public static final class b<T> implements wi5 {
            public final /* synthetic */ d a;
            public final /* synthetic */ ese<Function1<d, j6g>> b;
            public final /* synthetic */ ese<Function1<d, j6g>> c;

            /* JADX WARN: Multi-variable type inference failed */
            public b(d dVar, ese<? extends Function1<? super d, j6g>> eseVar, ese<? extends Function1<? super d, j6g>> eseVar2) {
                this.a = dVar;
                this.b = eseVar;
                this.c = eseVar2;
            }

            @Override // defpackage.wi5
            public final Object a(Object obj, lu2 lu2Var) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                d dVar = this.a;
                if (zBooleanValue) {
                    this.b.getValue().invoke(dVar);
                } else {
                    this.c.getValue().invoke(dVar);
                }
                return j6g.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(hw9 hw9Var, d dVar, ese<? extends Function1<? super d, j6g>> eseVar, ese<? extends Function1<? super d, j6g>> eseVar2, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$sheetState = hw9Var;
            this.$backStackEntry = dVar;
            this.$currentOnSheetShown$delegate = eseVar;
            this.$currentOnSheetDismissed$delegate = eseVar2;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$sheetState, this.$backStackEntry, this.$currentOnSheetShown$delegate, this.$currentOnSheetDismissed$delegate, lu2Var);
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
                sj5 sj5VarW = wg2.w(wg2.v(r.h(new C0492a(this.$sheetState))), 1);
                b bVar = new b(this.$backStackEntry, this.$currentOnSheetShown$delegate, this.$currentOnSheetDismissed$delegate);
                this.label = 1;
                Object objE = sj5VarW.e(bVar, this);
                g13 g13Var = g13.a;
                if (objE == g13Var) {
                    return g13Var;
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

    public static final class b extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ d $backStackEntry;
        final /* synthetic */ pb2 $this_SheetContentHost;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d dVar, pb2 pb2Var) {
            super(2);
            this.$backStackEntry = dVar;
            this.$this_SheetContentHost = pb2Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            if ((num.intValue() & 3) == 2 && bVar2.i()) {
                bVar2.D();
            } else {
                k kVar = this.$backStackEntry.b;
                kVar.getClass();
                ((pk1.a) kVar).a0.j(this.$this_SheetContentHost, this.$backStackEntry, bVar2, 0);
            }
            return j6g.a;
        }
    }

    public static final class c extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ d $backStackEntry;
        final /* synthetic */ Function1<d, j6g> $onSheetDismissed;
        final /* synthetic */ Function1<d, j6g> $onSheetShown;
        final /* synthetic */ ekd $saveableStateHolder;
        final /* synthetic */ hw9 $sheetState;
        final /* synthetic */ pb2 $this_SheetContentHost;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(pb2 pb2Var, d dVar, hw9 hw9Var, ekd ekdVar, Function1<? super d, j6g> function1, Function1<? super d, j6g> function12, int i) {
            super(2);
            this.$this_SheetContentHost = pb2Var;
            this.$backStackEntry = dVar;
            this.$sheetState = hw9Var;
            this.$saveableStateHolder = ekdVar;
            this.$onSheetShown = function1;
            this.$onSheetDismissed = function12;
            this.$$changed = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            zde.a(this.$this_SheetContentHost, this.$backStackEntry, this.$sheetState, this.$saveableStateHolder, this.$onSheetShown, this.$onSheetDismissed, bVar, ka2.L(this.$$changed | 1));
            return j6g.a;
        }
    }

    public static final void a(pb2 pb2Var, d dVar, hw9 hw9Var, ekd ekdVar, Function1<? super d, j6g> function1, Function1<? super d, j6g> function12, androidx.compose.runtime.b bVar, int i) {
        int i2;
        androidx.compose.runtime.c cVarH = bVar.h(-771698376);
        if ((i & 6) == 0) {
            i2 = (cVarH.K(pb2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.x(dVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) == 0 ? cVarH.K(hw9Var) : cVarH.x(hw9Var) ? 256 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i2 |= cVarH.x(ekdVar) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if ((i & 24576) == 0) {
            i2 |= cVarH.x(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= cVarH.x(function12) ? 131072 : 65536;
        }
        int i3 = i2;
        if ((74899 & i3) == 74898 && cVarH.i()) {
            cVarH.D();
        } else if (dVar != null) {
            cVarH.L(-1197849361);
            g4a g4aVarG = r.g(function1, cVarH);
            g4a g4aVarG2 = r.g(function12, cVarH);
            boolean zK = ((i3 & 896) == 256 || ((i3 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 && cVarH.x(hw9Var))) | cVarH.K(g4aVarG) | cVarH.x(dVar) | cVarH.K(g4aVarG2);
            Object objV = cVarH.v();
            if (zK || objV == b.a.a) {
                a aVar = new a(hw9Var, dVar, g4aVarG, g4aVarG2, null);
                cVarH.p(aVar);
                objV = aVar;
            }
            to4.f(hw9Var, dVar, (Function2) objV, cVarH);
            paa.a(dVar, ekdVar, bh2.c(-2050060477, new b(dVar, pb2Var), cVarH), cVarH, ((i3 >> 6) & 112) | ((i3 >> 3) & 14) | 384);
            cVarH.U(false);
        } else {
            cVarH.L(-1196898932);
            cVarH.U(false);
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new c(pb2Var, dVar, hw9Var, ekdVar, function1, function12, i);
        }
    }
}
