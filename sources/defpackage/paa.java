package defpackage;

import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.navigation.d;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.p63;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class paa {

    public static final class a extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $content;
        final /* synthetic */ ekd $saveableStateHolder;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(ekd ekdVar, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2) {
            super(2);
            this.$saveableStateHolder = ekdVar;
            this.$content = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            if ((num.intValue() & 3) == 2 && bVar2.i()) {
                bVar2.D();
            } else {
                paa.b(this.$saveableStateHolder, this.$content, bVar2, 0);
            }
            return j6g.a;
        }
    }

    public static final class b extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $content;
        final /* synthetic */ ekd $saveableStateHolder;
        final /* synthetic */ d $this_LocalOwnersProvider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(d dVar, ekd ekdVar, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2, int i) {
            super(2);
            this.$this_LocalOwnersProvider = dVar;
            this.$saveableStateHolder = ekdVar;
            this.$content = function2;
            this.$$changed = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            paa.a(this.$this_LocalOwnersProvider, this.$saveableStateHolder, this.$content, bVar, ka2.L(this.$$changed | 1));
            return j6g.a;
        }
    }

    public static final void a(d dVar, ekd ekdVar, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2, androidx.compose.runtime.b bVar, int i) {
        int i2;
        c cVarH = bVar.h(-1579360880);
        if ((i & 6) == 0) {
            i2 = (cVarH.x(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.x(ekdVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.x(function2) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i2 & 147) == 146 && cVarH.i()) {
            cVarH.D();
        } else {
            rm2.b(new i6c[]{z09.a.a(dVar), r09.a.a(dVar), AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner().a(dVar)}, bh2.c(-52928304, new a(ekdVar, function2), cVarH), cVarH, 56);
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new b(dVar, ekdVar, function2, i);
        }
    }

    public static final void b(ekd ekdVar, Function2 function2, androidx.compose.runtime.b bVar, int i) {
        int i2;
        c cVarH = bVar.h(1211832233);
        if ((i & 6) == 0) {
            i2 = (cVarH.x(ekdVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.x(function2) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && cVarH.i()) {
            cVarH.D();
        } else {
            cVarH.u(1729797275);
            jrg jrgVarA = z09.a(cVarH);
            if (jrgVarA == null) {
                r6.g("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            brg brgVarA = erg.a(fwc.a.b(i71.class), jrgVarA, null, jrgVarA instanceof hg6 ? ((hg6) jrgVarA).getDefaultViewModelCreationExtras() : p63.a.b, cVarH);
            cVarH.U(false);
            i71 i71Var = (i71) brgVarA;
            i71Var.d = new WeakReference<>(ekdVar);
            ekdVar.d(i71Var.c, function2, cVarH, ((i2 << 6) & 896) | (i2 & 112));
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new qaa(ekdVar, function2, i);
        }
    }
}
