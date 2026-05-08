package androidx.fragment.app;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.r;
import androidx.fragment.app.strictmode.WrongFragmentContainerViolation;
import androidx.fragment.app.strictmode.WrongNestedHierarchyViolation;
import com.indeed.android.jobsearch.R;
import defpackage.b0;
import defpackage.cr5;
import defpackage.cs5;
import defpackage.epg;
import defpackage.jrg;
import defpackage.l5;
import defpackage.l6;
import defpackage.prg;
import defpackage.r6;
import defpackage.s6;
import defpackage.wl7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class m {
    public final k a;
    public final n b;
    public final Fragment c;
    public boolean d = false;
    public int e = -1;

    public class a implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View a;

        public a(View view) {
            this.a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            View view2 = this.a;
            view2.removeOnAttachStateChangeListener(this);
            WeakHashMap<View, prg> weakHashMap = epg.a;
            epg.c.c(view2);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public m(k kVar, n nVar, ClassLoader classLoader, i iVar, Bundle bundle) {
        this.a = kVar;
        this.b = nVar;
        Fragment fragmentA = ((FragmentState) bundle.getParcelable("state")).a(iVar, classLoader);
        this.c = fragmentA;
        fragmentA.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        fragmentA.setArguments(bundle2);
        if (FragmentManager.K(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + fragmentA);
        }
    }

    public final void a() {
        boolean zK = FragmentManager.K(3);
        Fragment fragment = this.c;
        if (zK) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + fragment);
        }
        Bundle bundle = fragment.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        fragment.performActivityCreated(bundle2);
        this.a.a(fragment, bundle2, false);
    }

    public final void b() {
        View view;
        View view2;
        Fragment fragment = this.c;
        Fragment fragmentE = FragmentManager.E(fragment.mContainer);
        Fragment parentFragment = fragment.getParentFragment();
        if (fragmentE != null && !fragmentE.equals(parentFragment)) {
            int i = fragment.mContainerId;
            cs5.a aVar = cs5.a;
            cs5.b(new WrongNestedHierarchyViolation(fragment, fragmentE, i));
            cs5.a(fragment).getClass();
        }
        ArrayList<Fragment> arrayList = this.b.a;
        ViewGroup viewGroup = fragment.mContainer;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            int iIndexOf = arrayList.indexOf(fragment);
            int i2 = iIndexOf - 1;
            while (true) {
                if (i2 < 0) {
                    while (true) {
                        iIndexOf++;
                        if (iIndexOf >= arrayList.size()) {
                            break;
                        }
                        Fragment fragment2 = arrayList.get(iIndexOf);
                        if (fragment2.mContainer == viewGroup && (view = fragment2.mView) != null) {
                            iIndexOfChild = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    Fragment fragment3 = arrayList.get(i2);
                    if (fragment3.mContainer == viewGroup && (view2 = fragment3.mView) != null) {
                        iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
        }
        fragment.mContainer.addView(fragment.mView, iIndexOfChild);
    }

    public final void c() {
        boolean zK = FragmentManager.K(3);
        Fragment fragment = this.c;
        if (zK) {
            Log.d("FragmentManager", "moveto ATTACHED: " + fragment);
        }
        Fragment fragment2 = fragment.mTarget;
        m mVar = null;
        n nVar = this.b;
        if (fragment2 != null) {
            m mVar2 = nVar.b.get(fragment2.mWho);
            if (mVar2 == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(fragment);
                Fragment fragment3 = fragment.mTarget;
                sb.append(" declared target fragment ");
                sb.append(fragment3);
                sb.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb.toString());
            }
            fragment.mTargetWho = fragment.mTarget.mWho;
            fragment.mTarget = null;
            mVar = mVar2;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (mVar = nVar.b.get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(fragment);
                sb2.append(" declared target fragment ");
                r6.g(l6.i(sb2, fragment.mTargetWho, " that does not belong to this FragmentManager!"));
                return;
            }
        }
        if (mVar != null) {
            mVar.k();
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        fragment.mHost = fragmentManager.v;
        fragment.mParentFragment = fragmentManager.x;
        k kVar = this.a;
        kVar.g(fragment, false);
        fragment.performAttach();
        kVar.b(fragment, false);
    }

    public final int d() {
        Object next;
        Fragment fragment = this.c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int iMin = this.e;
        int iOrdinal = fragment.mMaxState.ordinal();
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (fragment.mFromLayout) {
            boolean z = fragment.mInLayout;
            int i = this.e;
            if (z) {
                iMin = Math.max(i, 2);
                View view = fragment.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = i < 4 ? Math.min(iMin, fragment.mState) : Math.min(iMin, 1);
            }
        }
        if (!fragment.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            r rVarF = r.f(viewGroup, fragment.getParentFragmentManager());
            r.b bVarD = rVarF.d(fragment);
            r.b.a aVar = bVarD != null ? bVarD.b : null;
            Iterator it = rVarF.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                r.b bVar = (r.b) next;
                if (wl7.b(bVar.c, fragment) && !bVar.f) {
                    break;
                }
            }
            r.b bVar2 = (r.b) next;
            aVar = bVar2 != null ? bVar2.b : null;
            int i2 = aVar == null ? -1 : r.c.a[aVar.ordinal()];
            if (i2 != -1 && i2 != 1) {
                aVar = aVar;
            }
        }
        if (aVar == r.b.a.b) {
            iMin = Math.min(iMin, 6);
        } else if (aVar == r.b.a.c) {
            iMin = Math.max(iMin, 3);
        } else if (fragment.mRemoving) {
            iMin = fragment.isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (fragment.mDeferStart && fragment.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (FragmentManager.K(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + fragment);
        }
        return iMin;
    }

    public final void e() {
        boolean zK = FragmentManager.K(3);
        Fragment fragment = this.c;
        if (zK) {
            Log.d("FragmentManager", "moveto CREATED: " + fragment);
        }
        Bundle bundle = fragment.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        if (fragment.mIsCreated) {
            fragment.mState = 1;
            fragment.restoreChildFragmentState();
        } else {
            k kVar = this.a;
            kVar.h(fragment, bundle2, false);
            fragment.performCreate(bundle2);
            kVar.c(fragment, bundle2, false);
        }
    }

    public final void f() {
        String resourceName;
        Fragment fragment = this.c;
        if (fragment.mFromLayout) {
            return;
        }
        if (FragmentManager.K(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + fragment);
        }
        Bundle bundle = fragment.mSavedFragmentState;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterPerformGetLayoutInflater = fragment.performGetLayoutInflater(bundle2);
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = fragment.mContainerId;
            if (i != 0) {
                if (i == -1) {
                    l5.q(s6.d("Cannot create fragment ", fragment, " for a container view with no id"));
                    return;
                }
                viewGroup = (ViewGroup) fragment.mFragmentManager.w.e(i);
                if (viewGroup == null) {
                    if (!fragment.mRestored) {
                        try {
                            resourceName = fragment.getResources().getResourceName(fragment.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        b0.r("No view found for id 0x", Integer.toHexString(fragment.mContainerId), " (", resourceName, ") for fragment ", fragment);
                        return;
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    cs5.a aVar = cs5.a;
                    cs5.b(new WrongFragmentContainerViolation(fragment, viewGroup));
                    cs5.a(fragment).getClass();
                }
            }
        }
        fragment.mContainer = viewGroup;
        fragment.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, bundle2);
        if (fragment.mView != null) {
            if (FragmentManager.K(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + fragment);
            }
            fragment.mView.setSaveFromParentEnabled(false);
            fragment.mView.setTag(R.id.fragment_container_view_tag, fragment);
            if (viewGroup != null) {
                b();
            }
            if (fragment.mHidden) {
                fragment.mView.setVisibility(8);
            }
            View view = fragment.mView;
            WeakHashMap<View, prg> weakHashMap = epg.a;
            boolean zIsAttachedToWindow = view.isAttachedToWindow();
            View view2 = fragment.mView;
            if (zIsAttachedToWindow) {
                epg.c.c(view2);
            } else {
                view2.addOnAttachStateChangeListener(new a(view2));
            }
            fragment.performViewCreated();
            this.a.m(fragment, fragment.mView, bundle2, false);
            int visibility = fragment.mView.getVisibility();
            fragment.setPostOnViewCreatedAlpha(fragment.mView.getAlpha());
            if (fragment.mContainer != null && visibility == 0) {
                View viewFindFocus = fragment.mView.findFocus();
                if (viewFindFocus != null) {
                    fragment.setFocusedView(viewFindFocus);
                    if (FragmentManager.K(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fragment);
                    }
                }
                fragment.mView.setAlpha(0.0f);
            }
        }
        fragment.mState = 2;
    }

    public final void g() {
        Fragment fragmentB;
        boolean zK = FragmentManager.K(3);
        Fragment fragment = this.c;
        if (zK) {
            Log.d("FragmentManager", "movefrom CREATED: " + fragment);
        }
        boolean zIsChangingConfigurations = true;
        boolean z = fragment.mRemoving && !fragment.isInBackStack();
        n nVar = this.b;
        if (z && !fragment.mBeingSaved) {
            nVar.i(fragment.mWho, null);
        }
        if (!z) {
            l lVar = nVar.d;
            if (!((lVar.b.containsKey(fragment.mWho) && lVar.e) ? lVar.f : true)) {
                String str = fragment.mTargetWho;
                if (str != null && (fragmentB = nVar.b(str)) != null && fragmentB.mRetainInstance) {
                    fragment.mTarget = fragmentB;
                }
                fragment.mState = 0;
                return;
            }
        }
        cr5<?> cr5Var = fragment.mHost;
        if (cr5Var instanceof jrg) {
            zIsChangingConfigurations = nVar.d.f;
        } else {
            g gVar = cr5Var.b;
            if (gVar != null) {
                zIsChangingConfigurations = true ^ gVar.isChangingConfigurations();
            }
        }
        if ((z && !fragment.mBeingSaved) || zIsChangingConfigurations) {
            nVar.d.h(fragment, false);
        }
        fragment.performDestroy();
        this.a.d(fragment, false);
        for (m mVar : nVar.d()) {
            if (mVar != null) {
                Fragment fragment2 = mVar.c;
                if (fragment.mWho.equals(fragment2.mTargetWho)) {
                    fragment2.mTarget = fragment;
                    fragment2.mTargetWho = null;
                }
            }
        }
        String str2 = fragment.mTargetWho;
        if (str2 != null) {
            fragment.mTarget = nVar.b(str2);
        }
        nVar.h(this);
    }

    public final void h() {
        View view;
        boolean zK = FragmentManager.K(3);
        Fragment fragment = this.c;
        if (zK) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + fragment);
        }
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        fragment.performDestroyView();
        this.a.n(fragment, false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.j(null);
        fragment.mInLayout = false;
    }

    public final void i() {
        boolean zK = FragmentManager.K(3);
        Fragment fragment = this.c;
        if (zK) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + fragment);
        }
        fragment.performDetach();
        this.a.e(fragment, false);
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if (!fragment.mRemoving || fragment.isInBackStack()) {
            l lVar = this.b.d;
            if (!((lVar.b.containsKey(fragment.mWho) && lVar.e) ? lVar.f : true)) {
                return;
            }
        }
        if (FragmentManager.K(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + fragment);
        }
        fragment.initState();
    }

    public final void j() {
        Fragment fragment = this.c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.K(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + fragment);
            }
            Bundle bundle = fragment.mSavedFragmentState;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            fragment.performCreateView(fragment.performGetLayoutInflater(bundle2), null, bundle2);
            View view = fragment.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                fragment.mView.setTag(R.id.fragment_container_view_tag, fragment);
                if (fragment.mHidden) {
                    fragment.mView.setVisibility(8);
                }
                fragment.performViewCreated();
                this.a.m(fragment, fragment.mView, bundle2, false);
                fragment.mState = 2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:155:0x01b3, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k() {
        /*
            Method dump skipped, instruction units count: 674
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.m.k():void");
    }

    public final void l(ClassLoader classLoader) {
        Fragment fragment = this.c;
        Bundle bundle = fragment.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (fragment.mSavedFragmentState.getBundle("savedInstanceState") == null) {
            fragment.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
        }
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("viewState");
        fragment.mSavedViewRegistryState = fragment.mSavedFragmentState.getBundle("viewRegistryState");
        FragmentState fragmentState = (FragmentState) fragment.mSavedFragmentState.getParcelable("state");
        if (fragmentState != null) {
            fragment.mTargetWho = fragmentState.a0;
            fragment.mTargetRequestCode = fragmentState.b0;
            Boolean bool = fragment.mSavedUserVisibleHint;
            if (bool != null) {
                fragment.mUserVisibleHint = bool.booleanValue();
                fragment.mSavedUserVisibleHint = null;
            } else {
                fragment.mUserVisibleHint = fragmentState.c0;
            }
        }
        if (fragment.mUserVisibleHint) {
            return;
        }
        fragment.mDeferStart = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m() {
        /*
            r6 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.K(r0)
            java.lang.String r1 = "FragmentManager"
            androidx.fragment.app.Fragment r2 = r6.c
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "moveto RESUMED: "
            r0.<init>(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L1c:
            android.view.View r0 = r2.getFocusedView()
            if (r0 == 0) goto L78
            android.view.View r3 = r2.mView
            if (r0 != r3) goto L27
            goto L31
        L27:
            android.view.ViewParent r3 = r0.getParent()
        L2b:
            if (r3 == 0) goto L78
            android.view.View r4 = r2.mView
            if (r3 != r4) goto L73
        L31:
            boolean r3 = r0.requestFocus()
            r4 = 2
            boolean r4 = androidx.fragment.app.FragmentManager.K(r4)
            if (r4 == 0) goto L78
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "requestFocus: Restoring focused view "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r0 = " "
            r4.append(r0)
            if (r3 == 0) goto L50
            java.lang.String r0 = "succeeded"
            goto L52
        L50:
            java.lang.String r0 = "failed"
        L52:
            r4.append(r0)
            java.lang.String r0 = " on Fragment "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = " resulting in focused view "
            r4.append(r0)
            android.view.View r0 = r2.mView
            android.view.View r0 = r0.findFocus()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            android.util.Log.v(r1, r0)
            goto L78
        L73:
            android.view.ViewParent r3 = r3.getParent()
            goto L2b
        L78:
            r0 = 0
            r2.setFocusedView(r0)
            r2.performResume()
            androidx.fragment.app.k r1 = r6.a
            r3 = 0
            r1.i(r2, r3)
            androidx.fragment.app.n r6 = r6.b
            java.lang.String r1 = r2.mWho
            r6.i(r1, r0)
            r2.mSavedFragmentState = r0
            r2.mSavedViewState = r0
            r2.mSavedViewRegistryState = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.m.m():void");
    }

    public final Bundle n() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Fragment fragment = this.c;
        if (fragment.mState == -1 && (bundle = fragment.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new FragmentState(fragment));
        if (fragment.mState > -1) {
            Bundle bundle3 = new Bundle();
            fragment.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.a.j(fragment, bundle3, false);
            Bundle bundle4 = new Bundle();
            fragment.mSavedStateRegistryController.b(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleY = fragment.mChildFragmentManager.Y();
            if (!bundleY.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleY);
            }
            if (fragment.mView != null) {
                o();
            }
            SparseArray<Parcelable> sparseArray = fragment.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = fragment.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = fragment.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void o() {
        Fragment fragment = this.c;
        if (fragment.mView == null) {
            return;
        }
        if (FragmentManager.K(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + fragment + " with view " + fragment.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        fragment.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            fragment.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        fragment.mViewLifecycleOwner.f.b(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        fragment.mSavedViewRegistryState = bundle;
    }

    public m(k kVar, n nVar, Fragment fragment) {
        this.a = kVar;
        this.b = nVar;
        this.c = fragment;
    }

    public m(k kVar, n nVar, Fragment fragment, Bundle bundle) {
        this.a = kVar;
        this.b = nVar;
        this.c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        fragment.mSavedFragmentState = bundle;
        fragment.mArguments = bundle.getBundle("arguments");
    }
}
