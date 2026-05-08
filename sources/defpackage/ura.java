package defpackage;

import android.app.Dialog;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.google.android.material.bottomsheet.b;
import com.indeed.android.jobsearch.R;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lura;", "Lv81;", "<init>", "()V", "rnonboarding_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ura extends v81 {
    public static final /* synthetic */ int l0 = 0;
    public m91 j0;
    public final z8<String> k0;

    public ura() {
        z8<String> z8VarRegisterForActivityResult = registerForActivityResult(new v8(), new z3(15));
        z8VarRegisterForActivityResult.getClass();
        this.k0 = z8VarRegisterForActivityResult;
    }

    @Override // androidx.fragment.app.f
    public final int G() {
        return R.style.ThemeOverlay_OnboardingResurface_BottomSheetDialog;
    }

    @Override // com.google.android.material.bottomsheet.c, defpackage.oj0, androidx.fragment.app.f
    public final Dialog H(Bundle bundle) {
        View decorView;
        b bVar = new b(requireContext(), R.style.ThemeOverlay_OnboardingResurface_BottomSheetDialog);
        Window window = bVar.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setTag(R.id.view_tree_lifecycle_owner, bVar);
            decorView.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, bVar);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, bVar);
        }
        return bVar;
    }

    @Override // defpackage.t81
    public final void O(int i, androidx.compose.runtime.b bVar) {
        c cVarH = bVar.h(-423465680);
        int i2 = (cVarH.x(this) ? 4 : 2) | i;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            boolean zX = cVarH.x(this);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (zX || objV == c0020a) {
                objV = new vv(this, 15);
                cVarH.p(objV);
            }
            gu5 gu5Var = (gu5) objV;
            boolean zX2 = cVarH.x(this);
            Object objV2 = cVarH.v();
            if (zX2 || objV2 == c0020a) {
                objV2 = new oa(this, 16);
                cVarH.p(objV2);
            }
            gu5 gu5Var2 = (gu5) objV2;
            boolean zX3 = cVarH.x(this);
            Object objV3 = cVarH.v();
            if (zX3 || objV3 == c0020a) {
                objV3 = new hr(this, 10);
                cVarH.p(objV3);
            }
            xra.c(gu5Var, gu5Var2, (gu5) objV3, ygg.h(e.a.b, ggd.b(20.0f, 20.0f, 0.0f, 0.0f)), cVarH, 0, 0);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new kh(this, i, 7);
        }
    }

    @Override // defpackage.v81, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        layoutInflater.getClass();
        Dialog dialog = this.a0;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setSoftInputMode(16);
        }
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // defpackage.v81, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        I().setOnShowListener(new tra());
        int iArgb = Color.argb(82, 0, 0, 0);
        Window window = I().getWindow();
        if (window != null) {
            window.setDimAmount(0.5f);
            window.getDecorView().setBackgroundColor(iArgb);
        }
    }
}
