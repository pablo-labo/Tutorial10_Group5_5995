package defpackage;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import com.google.android.material.bottomsheet.b;
import com.indeed.android.jobsearch.R;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lm8c;", "Lv81;", "<init>", "()V", "myjobs_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m8c extends v81 {
    public static final /* synthetic */ int r0 = 0;
    public xdc l0;
    public final g4a n0;
    public final g4a o0;
    public boolean p0;
    public final z8<String> q0;
    public final Lazy j0 = boa.E(qt8.a, new a(this));
    public final d8c k0 = new d8c(false);
    public final s8c m0 = s8c.NATIVE_MYJOBS;

    public static final class a extends mj8 implements gu5<p8c> {
        final /* synthetic */ ComponentCallbacks $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m8c m8cVar) {
            super(0);
            this.$this_inject = m8cVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, p8c] */
        @Override // defpackage.gu5
        public final p8c invoke() {
            ComponentCallbacks componentCallbacks = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return pnb.B(componentCallbacks).a(this.$parameters, fwc.a.b(p8c.class), a9cVar);
        }
    }

    public m8c() {
        Boolean bool = Boolean.FALSE;
        this.n0 = r.f(bool);
        this.o0 = r.f(bool);
        z8<String> z8VarRegisterForActivityResult = registerForActivityResult(new v8(), new vh6(this, 9));
        z8VarRegisterForActivityResult.getClass();
        this.q0 = z8VarRegisterForActivityResult;
    }

    @Override // com.google.android.material.bottomsheet.c, defpackage.oj0, androidx.fragment.app.f
    public final Dialog H(Bundle bundle) {
        View decorView;
        b bVar = new b(requireContext(), this.f);
        Window window = bVar.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setTag(R.id.view_tree_lifecycle_owner, bVar);
            decorView.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, bVar);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, bVar);
        }
        bVar.setOnShowListener(new k8c());
        return bVar;
    }

    @Override // defpackage.t81
    public final void O(int i, androidx.compose.runtime.b bVar) {
        c cVarH = bVar.h(1183443737);
        int i2 = (cVarH.x(this) ? 4 : 2) | i;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            boolean zX = cVarH.x(this);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (zX || objV == c0020a) {
                objV = new o91(this, 18);
                cVarH.p(objV);
            }
            gu5 gu5Var = (gu5) objV;
            boolean zX2 = cVarH.x(this);
            Object objV2 = cVarH.v();
            if (zX2 || objV2 == c0020a) {
                objV2 = new pq(this, 13);
                cVarH.p(objV2);
            }
            n8c.a(gu5Var, (Function1) objV2, this.m0, null, null, null, null, cVarH, 0, 120);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new rq(this, i, 9);
        }
    }

    public final void P(boolean z) {
        if (this.p0) {
            return;
        }
        this.p0 = true;
        xdc xdcVar = this.l0;
        if (xdcVar != null) {
            xdcVar.invoke(Boolean.valueOf(z));
        }
    }

    public final boolean Q() {
        return ((Boolean) ((gme) this.n0).getValue()).booleanValue();
    }

    @Override // androidx.fragment.app.f, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        if (((Boolean) ((gme) this.o0).getValue()).booleanValue()) {
            return;
        }
        P(false);
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean z = false;
        if (getActivity() != null && ((at7) cr8.p(at7.class)).a() == ft7.b) {
            z = true;
        }
        ((gme) this.n0).setValue(Boolean.valueOf(z));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (this.p0) {
            return;
        }
        P(false);
    }
}
