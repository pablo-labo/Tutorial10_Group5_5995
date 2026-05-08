package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.b;
import androidx.compose.runtime.i;
import androidx.fragment.app.Fragment;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.epg;
import defpackage.grg;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lm6f;", "Liw8;", "<init>", "()V", "uiplugin_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class m6f extends iw8 {
    public final frg a;

    public static final class a implements goa, ev5 {
        public final /* synthetic */ Function1 a;

        public a(Function1 function1) {
            this.a = function1;
        }

        @Override // defpackage.ev5
        public final vu5<?> c() {
            return this.a;
        }

        @Override // defpackage.goa
        public final /* synthetic */ void d(Object obj) {
            this.a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof goa) || !(obj instanceof ev5)) {
                return false;
            }
            return this.a.equals(((ev5) obj).c());
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    public static final class b extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(m6f m6fVar) {
            super(0);
            this.$this_activityViewModels = m6fVar;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return this.$this_activityViewModels.requireActivity().getViewModelStore();
        }
    }

    public static final class c extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(m6f m6fVar) {
            super(0);
            this.$this_activityViewModels = m6fVar;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    public static final class d extends mj8 implements gu5<grg.c> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(m6f m6fVar) {
            super(0);
            this.$this_activityViewModels = m6fVar;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    public static final class e extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(m6f m6fVar) {
            super(0);
            this.$this_activityViewModels = m6fVar;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return this.$this_activityViewModels.requireActivity().getViewModelStore();
        }
    }

    public static final class f extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(m6f m6fVar) {
            super(0);
            this.$this_activityViewModels = m6fVar;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    public static final class g extends mj8 implements gu5<grg.c> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(m6f m6fVar) {
            super(0);
            this.$this_activityViewModels = m6fVar;
        }

        @Override // defpackage.gu5
        public final grg.c invoke() {
            return o6.b(this.$this_activityViewModels);
        }
    }

    public m6f() {
        iwc iwcVar = fwc.a;
        this.a = os5.a(this, iwcVar.b(c6f.class), new b(this), new c(this), new d(this));
        os5.a(this, iwcVar.b(i7f.class), new e(this), new f(this), new g(this));
    }

    public final void E(zrd zrdVar, int i, ah2 ah2Var, androidx.compose.runtime.b bVar, int i2) {
        int i3;
        zrdVar.getClass();
        androidx.compose.runtime.c cVarH = bVar.h(-410372242);
        int i4 = i2 | (cVarH.K(zrdVar) ? 4 : 2) | 48 | (cVarH.x(this) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        if (cVarH.o(i4 & 1, (i4 & 1171) != 1170)) {
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                m74 m74Var = to4.a;
                objV = v40.b(cVarH.l(), cVarH);
            }
            e13 e13Var = (e13) objV;
            b6f b6fVarL = ((c6f) this.a.getValue()).l(getB());
            g3a<jz2<asd>> g3aVar = b6fVarL.g;
            zv8 zv8Var = (zv8) cVarH.M(r09.a);
            int i5 = i4 & 14;
            boolean zX = (i5 == 4) | cVarH.x(e13Var);
            Object objV2 = cVarH.v();
            if (zX || objV2 == c0020a) {
                objV2 = new a(new bb3(7, zrdVar, e13Var));
                cVarH.p(objV2);
            }
            g3aVar.e(zv8Var, (goa) objV2);
            Integer numValueOf = Integer.valueOf(((dme) zrdVar.a).e());
            boolean zX2 = cVarH.x(b6fVarL) | (i5 == 4);
            Object objV3 = cVarH.v();
            if (zX2 || objV3 == c0020a) {
                objV3 = new l6f(zrdVar, 10, b6fVarL, null);
                cVarH.p(objV3);
            }
            to4.d(cVarH, numValueOf, (Function2) objV3);
            ah2Var.invoke(cVarH, 6);
            i3 = 10;
        } else {
            cVarH.D();
            i3 = i;
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new eaa(this, zrdVar, i3, ah2Var, i2);
        }
    }

    /* JADX INFO: renamed from: F */
    public abstract xj1 getB();

    public void G() {
    }

    public abstract void H(String str);

    public abstract void I();

    public abstract void J();

    public abstract void K();

    public abstract void L(prd prdVar);

    public abstract void M(gq6 gq6Var);

    public abstract void N();

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        k6f k6fVar = new k6f();
        WeakHashMap<View, prg> weakHashMap = epg.a;
        epg.d.m(view, k6fVar);
        b6f b6fVarL = ((c6f) this.a.getValue()).l(getB());
        b6fVarL.a.e(getViewLifecycleOwner(), new a(new nm1(7, view, this)));
        b6fVarL.b.e(getViewLifecycleOwner(), new a(new tv(this, 23)));
        b6fVarL.d.e(getViewLifecycleOwner(), new a(new hg(this, 10)));
        b6fVarL.e.e(getViewLifecycleOwner(), new a(new ma(this, 20)));
        int i = 13;
        b6fVarL.f.e(getViewLifecycleOwner(), new a(new na(this, i)));
        b6fVarL.c.e(getViewLifecycleOwner(), new a(new m91(this, i)));
        b6fVarL.g.e(getViewLifecycleOwner(), new a(new hp0(this, 16)));
        b6fVarL.h.e(getViewLifecycleOwner(), new a(new ji(this, 14)));
    }
}
