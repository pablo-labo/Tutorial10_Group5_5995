package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.o;
import androidx.navigation.u;
import com.indeed.android.jobsearch.R;
import defpackage.ald;
import defpackage.d2f;
import defpackage.e44;
import defpackage.gu5;
import defpackage.iba;
import defpackage.irg;
import defpackage.j6g;
import defpackage.kr5;
import defpackage.mca;
import defpackage.mj8;
import defpackage.r6;
import defpackage.tac;
import defpackage.v40;
import defpackage.vac;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/navigation/fragment/NavHostFragment;", "Landroidx/fragment/app/Fragment;", "", "<init>", "()V", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class NavHostFragment extends Fragment {
    public final d2f a = new d2f(new a());
    public View b;
    public int c;
    public boolean d;

    public static final class a extends mj8 implements gu5<iba> {
        public a() {
            super(0);
        }

        @Override // defpackage.gu5
        public final iba invoke() {
            Context context = NavHostFragment.this.getContext();
            if (context == null) {
                r6.g("NavController cannot be created before the fragment is attached");
                return null;
            }
            final iba ibaVar = new iba(context);
            NavHostFragment navHostFragment = NavHostFragment.this;
            ibaVar.F(navHostFragment);
            irg viewModelStore = navHostFragment.getViewModelStore();
            viewModelStore.getClass();
            ibaVar.G(viewModelStore);
            Context contextRequireContext = navHostFragment.requireContext();
            contextRequireContext.getClass();
            FragmentManager childFragmentManager = navHostFragment.getChildFragmentManager();
            childFragmentManager.getClass();
            e44 e44Var = new e44(contextRequireContext, childFragmentManager);
            u uVar = ibaVar.v;
            uVar.a(e44Var);
            Context contextRequireContext2 = navHostFragment.requireContext();
            contextRequireContext2.getClass();
            FragmentManager childFragmentManager2 = navHostFragment.getChildFragmentManager();
            childFragmentManager2.getClass();
            int id = navHostFragment.getId();
            if (id == 0 || id == -1) {
                id = R.id.nav_host_fragment_container;
            }
            uVar.a(new androidx.navigation.fragment.a(contextRequireContext2, childFragmentManager2, id));
            Bundle bundleA = navHostFragment.getSavedStateRegistry().a("android-support-nav:fragment:navControllerState");
            if (bundleA != null) {
                ibaVar.x(bundleA);
            }
            navHostFragment.getSavedStateRegistry().c("android-support-nav:fragment:navControllerState", new ald.b() { // from class: mba
                @Override // ald.b
                public final Bundle a() {
                    Bundle bundleZ = ibaVar.z();
                    if (bundleZ != null) {
                        return bundleZ;
                    }
                    Bundle bundle = Bundle.EMPTY;
                    bundle.getClass();
                    return bundle;
                }
            });
            Bundle bundleA2 = navHostFragment.getSavedStateRegistry().a("android-support-nav:fragment:graphId");
            if (bundleA2 != null) {
                navHostFragment.c = bundleA2.getInt("android-support-nav:fragment:graphId");
            }
            navHostFragment.getSavedStateRegistry().c("android-support-nav:fragment:graphId", new kr5(navHostFragment, 1));
            int i = navHostFragment.c;
            if (i != 0) {
                ibaVar.A(i);
                return ibaVar;
            }
            Bundle arguments = navHostFragment.getArguments();
            int i2 = arguments != null ? arguments.getInt("android-support-nav:fragment:graphId") : 0;
            Bundle bundle = arguments != null ? arguments.getBundle("android-support-nav:fragment:startDestinationArgs") : null;
            if (i2 != 0) {
                ibaVar.B(((o) ibaVar.C.getValue()).b(i2), bundle);
            }
            return ibaVar;
        }
    }

    public final iba D() {
        return (iba) this.a.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        if (this.d) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            parentFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(parentFragmentManager);
            aVar.n(this);
            aVar.h(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        D();
        if (bundle != null && bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
            this.d = true;
            FragmentManager parentFragmentManager = getParentFragmentManager();
            parentFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(parentFragmentManager);
            aVar.n(this);
            aVar.h(false);
        }
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context context = layoutInflater.getContext();
        context.getClass();
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        int id = getId();
        if (id == 0 || id == -1) {
            id = R.id.nav_host_fragment_container;
        }
        fragmentContainerView.setId(id);
        return fragmentContainerView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        View view = this.b;
        if (view != null && mca.b(view) == D()) {
            view.setTag(R.id.nav_controller_view_tag, null);
        }
        this.b = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        context.getClass();
        attributeSet.getClass();
        super.onInflate(context, attributeSet, bundle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tac.b);
        typedArrayObtainStyledAttributes.getClass();
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.c = resourceId;
        }
        j6g j6gVar = j6g.a;
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, vac.c);
        typedArrayObtainStyledAttributes2.getClass();
        if (typedArrayObtainStyledAttributes2.getBoolean(0, false)) {
            this.d = true;
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        if (this.d) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        if (!(view instanceof ViewGroup)) {
            v40.o("created host view ", view, " is not a ViewGroup");
            return;
        }
        view.setTag(R.id.nav_controller_view_tag, D());
        if (view.getParent() != null) {
            Object parent = view.getParent();
            parent.getClass();
            View view2 = (View) parent;
            this.b = view2;
            if (view2.getId() == getId()) {
                View view3 = this.b;
                view3.getClass();
                view3.setTag(R.id.nav_controller_view_tag, D());
            }
        }
    }
}
