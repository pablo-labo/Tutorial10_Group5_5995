package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentManager.n;
import com.indeed.android.jobsearch.R;
import defpackage.goa;
import defpackage.hg2;
import defpackage.l5;
import defpackage.n6;
import defpackage.p6;
import defpackage.r6;
import defpackage.wq5;
import defpackage.zte;
import defpackage.zv8;

/* JADX INFO: loaded from: classes.dex */
public class f extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public boolean V;
    public boolean W;
    public int X;
    public boolean Y;
    public final d Z;
    public Handler a;
    public Dialog a0;
    public final a b;
    public boolean b0;
    public final b c;
    public boolean c0;
    public final c d;
    public boolean d0;
    public int e;
    public boolean e0;
    public int f;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public final void run() {
            f fVar = f.this;
            fVar.d.onDismiss(fVar.a0);
        }
    }

    public class b implements DialogInterface.OnCancelListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        @SuppressLint({"SyntheticAccessor"})
        public final void onCancel(DialogInterface dialogInterface) {
            f fVar = f.this;
            Dialog dialog = fVar.a0;
            if (dialog != null) {
                fVar.onCancel(dialog);
            }
        }
    }

    public class c implements DialogInterface.OnDismissListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        @SuppressLint({"SyntheticAccessor"})
        public final void onDismiss(DialogInterface dialogInterface) {
            f fVar = f.this;
            Dialog dialog = fVar.a0;
            if (dialog != null) {
                fVar.onDismiss(dialog);
            }
        }
    }

    public class d implements goa<zv8> {
        public d() {
        }

        @Override // defpackage.goa
        @SuppressLint({"SyntheticAccessor"})
        public final void d(zv8 zv8Var) {
            if (zv8Var != null) {
                f fVar = f.this;
                if (fVar.W) {
                    View viewRequireView = fVar.requireView();
                    if (viewRequireView.getParent() != null) {
                        r6.g("DialogFragment can not be attached to a container view");
                        return;
                    }
                    if (fVar.a0 != null) {
                        if (FragmentManager.K(3)) {
                            Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + fVar.a0);
                        }
                        fVar.a0.setContentView(viewRequireView);
                    }
                }
            }
        }
    }

    public class e extends wq5 {
        public final /* synthetic */ wq5 a;

        public e(wq5 wq5Var) {
            this.a = wq5Var;
        }

        @Override // defpackage.wq5
        public final View e(int i) {
            wq5 wq5Var = this.a;
            if (wq5Var.h()) {
                return wq5Var.e(i);
            }
            Dialog dialog = f.this.a0;
            if (dialog != null) {
                return dialog.findViewById(i);
            }
            return null;
        }

        @Override // defpackage.wq5
        public final boolean h() {
            return this.a.h() || f.this.e0;
        }
    }

    public f() {
        this.b = new a();
        this.c = new b();
        this.d = new c();
        this.e = 0;
        this.f = 0;
        this.V = true;
        this.W = true;
        this.X = -1;
        this.Z = new d();
        this.e0 = false;
    }

    public void D() {
        F(false, false);
    }

    public void E() {
        F(true, false);
    }

    public final void F(boolean z, boolean z2) {
        if (this.c0) {
            return;
        }
        this.c0 = true;
        this.d0 = false;
        Dialog dialog = this.a0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.a0.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.a.getLooper()) {
                    onDismiss(this.a0);
                } else {
                    this.a.post(this.b);
                }
            }
        }
        this.b0 = true;
        if (this.X >= 0) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            int i = this.X;
            parentFragmentManager.getClass();
            if (i < 0) {
                l5.q(p6.c(i, "Bad id: "));
                return;
            } else {
                parentFragmentManager.v(parentFragmentManager.new n(null, i), z);
                this.X = -1;
                return;
            }
        }
        FragmentManager parentFragmentManager2 = getParentFragmentManager();
        parentFragmentManager2.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(parentFragmentManager2);
        aVar.p = true;
        aVar.l(this);
        if (z) {
            aVar.h(true);
        } else {
            aVar.h(false);
        }
    }

    public int G() {
        return this.f;
    }

    public Dialog H(Bundle bundle) {
        if (FragmentManager.K(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new hg2(requireContext(), G());
    }

    public final Dialog I() {
        Dialog dialog = this.a0;
        if (dialog != null) {
            return dialog;
        }
        n6.d("DialogFragment ", this, " does not have a Dialog.");
        return null;
    }

    public void J(Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public final void K(androidx.fragment.app.a aVar, String str) {
        this.c0 = false;
        this.d0 = true;
        aVar.d(0, this, str, 1);
        this.b0 = false;
        this.X = aVar.h(false);
    }

    public void L(FragmentManager fragmentManager, String str) {
        this.c0 = false;
        this.d0 = true;
        fragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
        aVar.p = true;
        aVar.d(0, this, str, 1);
        aVar.h(false);
    }

    @Override // androidx.fragment.app.Fragment
    public final wq5 createFragmentContainer() {
        return new e(super.createFragmentContainer());
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().f(this.Z);
        if (this.d0) {
            return;
        }
        this.c0 = false;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = new Handler();
        this.W = this.mContainerId == 0;
        if (bundle != null) {
            this.e = bundle.getInt("android:style", 0);
            this.f = bundle.getInt("android:theme", 0);
            this.V = bundle.getBoolean("android:cancelable", true);
            this.W = bundle.getBoolean("android:showsDialog", this.W);
            this.X = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.a0;
        if (dialog != null) {
            this.b0 = true;
            dialog.setOnDismissListener(null);
            this.a0.dismiss();
            if (!this.c0) {
                onDismiss(this.a0);
            }
            this.a0 = null;
            this.e0 = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        if (!this.d0 && !this.c0) {
            this.c0 = true;
        }
        getViewLifecycleOwnerLiveData().i(this.Z);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.b0) {
            return;
        }
        if (FragmentManager.K(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        F(true, true);
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        boolean z = this.W;
        if (z && !this.Y) {
            if (z && !this.e0) {
                try {
                    this.Y = true;
                    Dialog dialogH = H(bundle);
                    this.a0 = dialogH;
                    if (this.W) {
                        J(dialogH, this.e);
                        Context context = getContext();
                        if (context instanceof Activity) {
                            this.a0.setOwnerActivity((Activity) context);
                        }
                        this.a0.setCancelable(this.V);
                        this.a0.setOnCancelListener(this.c);
                        this.a0.setOnDismissListener(this.d);
                        this.e0 = true;
                    } else {
                        this.a0 = null;
                    }
                    this.Y = false;
                } catch (Throwable th) {
                    this.Y = false;
                    throw th;
                }
            }
            if (FragmentManager.K(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.a0;
            if (dialog != null) {
                return layoutInflaterOnGetLayoutInflater.cloneInContext(dialog.getContext());
            }
        } else if (FragmentManager.K(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.W) {
                Log.d("FragmentManager", "mShowsDialog = false: ".concat(str));
                return layoutInflaterOnGetLayoutInflater;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: ".concat(str));
        }
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.a0;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.e;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.V;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.W;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.X;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog dialog = this.a0;
        if (dialog != null) {
            this.b0 = false;
            dialog.show();
            View decorView = this.a0.getWindow().getDecorView();
            zte.e(decorView, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Dialog dialog = this.a0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.a0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.a0.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.Fragment
    public final void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.a0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.a0.onRestoreInstanceState(bundle2);
    }

    public f(int i) {
        super(i);
        this.b = new a();
        this.c = new b();
        this.d = new c();
        this.e = 0;
        this.f = 0;
        this.V = true;
        this.W = true;
        this.X = -1;
        this.Z = new d();
        this.e0 = false;
    }
}
