package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.strictmode.GetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentRequestCodeUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.SetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetUserVisibleHintViolation;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.ald;
import defpackage.aw8;
import defpackage.bld;
import defpackage.c9;
import defpackage.cld;
import defpackage.cr5;
import defpackage.cs5;
import defpackage.dld;
import defpackage.dq2;
import defpackage.dv5;
import defpackage.e09;
import defpackage.eld;
import defpackage.f09;
import defpackage.g3a;
import defpackage.grg;
import defpackage.hg6;
import defpackage.hr;
import defpackage.irg;
import defpackage.jrg;
import defpackage.k9;
import defpackage.kv8;
import defpackage.l5;
import defpackage.lde;
import defpackage.loe;
import defpackage.lr5;
import defpackage.n8;
import defpackage.o8;
import defpackage.p63;
import defpackage.pz8;
import defpackage.q6;
import defpackage.r6;
import defpackage.s6;
import defpackage.t40;
import defpackage.tr5;
import defpackage.u2a;
import defpackage.uv8;
import defpackage.wkd;
import defpackage.wq5;
import defpackage.z8;
import defpackage.zte;
import defpackage.zv8;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, zv8, jrg, hg6, dld {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    k mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    FragmentManager mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    grg.c mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    FragmentManager mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    cr5<?> mHost;
    boolean mInLayout;
    boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    aw8 mLifecycleRegistry;
    kv8.b mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<l> mOnPreAttachedListeners;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    Runnable mPostponedDurationRunnable;
    Handler mPostponedHandler;
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    private final l mSavedStateAttachListener;
    bld mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    int mState;
    String mTag;
    Fragment mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mUserVisibleHint;
    View mView;
    p mViewLifecycleOwner;
    g3a<zv8> mViewLifecycleOwnerLiveData;
    String mWho;

    public static class InstantiationException extends RuntimeException {
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    public class a<I> extends z8<I> {
        public final /* synthetic */ AtomicReference a;

        public a(AtomicReference atomicReference) {
            this.a = atomicReference;
        }

        @Override // defpackage.z8
        public final void a(Object obj) {
            z8 z8Var = (z8) this.a.get();
            if (z8Var != null) {
                z8Var.a(obj);
            } else {
                r6.g("Operation cannot be started before fragment is in created state");
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Fragment.this.startPostponedEnterTransition();
        }
    }

    public class c extends l {
        public c() {
        }

        @Override // androidx.fragment.app.Fragment.l
        public final void a() {
            Fragment fragment = Fragment.this;
            fragment.mSavedStateRegistryController.a.a();
            wkd.b(fragment);
            Bundle bundle = fragment.mSavedFragmentState;
            fragment.mSavedStateRegistryController.a(bundle != null ? bundle.getBundle("registryState") : null);
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Fragment.this.callStartTransitionListener(false);
        }
    }

    public class e implements Runnable {
        public final /* synthetic */ r a;

        public e(r rVar) {
            this.a = rVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.a.c();
        }
    }

    public class f extends wq5 {
        public f() {
        }

        @Override // defpackage.wq5
        public final View e(int i) {
            Fragment fragment = Fragment.this;
            View view = fragment.mView;
            if (view != null) {
                return view.findViewById(i);
            }
            r6.g(s6.d("Fragment ", fragment, " does not have a view"));
            return null;
        }

        @Override // defpackage.wq5
        public final boolean h() {
            return Fragment.this.mView != null;
        }
    }

    public class g implements uv8 {
        public g() {
        }

        @Override // defpackage.uv8
        public final void G(zv8 zv8Var, kv8.a aVar) {
            View view;
            if (aVar != kv8.a.ON_STOP || (view = Fragment.this.mView) == null) {
                return;
            }
            view.cancelPendingInputEvents();
        }
    }

    public class h implements dv5<Void, c9> {
        public h() {
        }

        @Override // defpackage.dv5
        public final c9 apply(Void r2) {
            Fragment fragment = Fragment.this;
            Object obj = fragment.mHost;
            return obj instanceof k9 ? ((k9) obj).d() : fragment.requireActivity().X;
        }
    }

    public class i implements dv5<Void, c9> {
        public final /* synthetic */ c9 a;

        public i(c9 c9Var) {
            this.a = c9Var;
        }

        @Override // defpackage.dv5
        public final c9 apply(Void r1) {
            return this.a;
        }
    }

    public class j extends l {
        public final /* synthetic */ dv5 a;
        public final /* synthetic */ AtomicReference b;
        public final /* synthetic */ o8 c;
        public final /* synthetic */ n8 d;

        public j(dv5 dv5Var, AtomicReference atomicReference, o8 o8Var, n8 n8Var) {
            this.a = dv5Var;
            this.b = atomicReference;
            this.c = o8Var;
            this.d = n8Var;
        }

        @Override // androidx.fragment.app.Fragment.l
        public final void a() {
            Fragment fragment = Fragment.this;
            this.b.set(((c9) this.a.apply(null)).c(fragment.generateActivityResultKey(), fragment, this.c, this.d));
        }
    }

    public static class k {
        public boolean a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public ArrayList<String> g;
        public ArrayList<String> h;
        public Object i;
        public Object j;
        public Object k;
        public Object l;
        public Object m;
        public Object n;
        public Boolean o;
        public Boolean p;
        public lde q;
        public lde r;
        public float s;
        public View t;
        public boolean u;
    }

    public static abstract class l {
        public abstract void a();
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new lr5();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new b();
        this.mMaxState = kv8.b.e;
        this.mViewLifecycleOwnerLiveData = new g3a<>();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        this.mSavedStateAttachListener = new c();
        initLifecycle();
    }

    private k ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            k kVar = new k();
            kVar.i = null;
            Object obj = USE_DEFAULT_TRANSITION;
            kVar.j = obj;
            kVar.k = null;
            kVar.l = obj;
            kVar.m = null;
            kVar.n = obj;
            kVar.q = null;
            kVar.r = null;
            kVar.s = 1.0f;
            kVar.t = null;
            this.mAnimationInfo = kVar;
        }
        return this.mAnimationInfo;
    }

    private int getMinimumMaxLifecycleState() {
        kv8.b bVar = this.mMaxState;
        return (bVar == kv8.b.b || this.mParentFragment == null) ? bVar.ordinal() : Math.min(bVar.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
    }

    private Fragment getTargetFragment(boolean z) {
        String str;
        if (z) {
            cs5.a aVar = cs5.a;
            cs5.b(new GetTargetFragmentUsageViolation(this, "Attempting to get target fragment from fragment " + this));
            cs5.a(this).getClass();
        }
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return fragmentManager.c.b(str);
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new aw8(this, true);
        this.mSavedStateRegistryController = new bld(new cld(this, new hr(this, 13)));
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        registerOnPreAttachListener(this.mSavedStateAttachListener);
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str, Bundle bundle) {
        try {
            Fragment fragmentNewInstance = androidx.fragment.app.i.c(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle == null) {
                return fragmentNewInstance;
            }
            bundle.setClassLoader(fragmentNewInstance.getClass().getClassLoader());
            fragmentNewInstance.setArguments(bundle);
            return fragmentNewInstance;
        } catch (IllegalAccessException e2) {
            throw new InstantiationException(l5.m("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (java.lang.InstantiationException e3) {
            throw new InstantiationException(l5.m("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e3);
        } catch (NoSuchMethodException e4) {
            throw new InstantiationException(l5.m("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e4);
        } catch (InvocationTargetException e5) {
            throw new InstantiationException(l5.m("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$performCreateView$0() {
        p pVar = this.mViewLifecycleOwner;
        pVar.f.a(this.mSavedViewRegistryState);
        this.mSavedViewRegistryState = null;
    }

    private <I, O> z8<I> prepareCallInternal(o8<I, O> o8Var, dv5<Void, c9> dv5Var, n8<O> n8Var) {
        if (this.mState > 1) {
            r6.g(s6.d("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
            return null;
        }
        AtomicReference atomicReference = new AtomicReference();
        registerOnPreAttachListener(new j(dv5Var, atomicReference, o8Var, n8Var));
        return new a(atomicReference);
    }

    private void registerOnPreAttachListener(l lVar) {
        if (this.mState >= 0) {
            lVar.a();
        } else {
            this.mOnPreAttachedListeners.add(lVar);
        }
    }

    private void restoreViewState() {
        if (FragmentManager.K(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            Bundle bundle = this.mSavedFragmentState;
            restoreViewState(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        }
        this.mSavedFragmentState = null;
    }

    public void callStartTransitionListener(boolean z) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        k kVar = this.mAnimationInfo;
        if (kVar != null) {
            kVar.u = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (fragmentManager = this.mFragmentManager) == null) {
            return;
        }
        r rVarF = r.f(viewGroup, fragmentManager);
        rVarF.g();
        if (z) {
            this.mHost.c.post(new e(rVarF));
        } else {
            rVarF.c();
        }
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
            this.mPostponedHandler = null;
        }
    }

    public wq5 createFragmentContainer() {
        return new f();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment targetFragment = getTargetFragment(false);
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            e09.a(this).b(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.u(t40.k(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public Fragment findFragmentByWho(String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.c.c(str);
    }

    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final androidx.fragment.app.g getActivity() {
        cr5<?> cr5Var = this.mHost;
        if (cr5Var == null) {
            return null;
        }
        return cr5Var.a;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        k kVar = this.mAnimationInfo;
        if (kVar == null || (bool = kVar.p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        k kVar = this.mAnimationInfo;
        if (kVar == null || (bool = kVar.o) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        kVar.getClass();
        return null;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final FragmentManager getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        r6.g(s6.d("Fragment ", this, " has not been attached yet."));
        return null;
    }

    public Context getContext() {
        cr5<?> cr5Var = this.mHost;
        if (cr5Var == null) {
            return null;
        }
        return cr5Var.b;
    }

    @Override // defpackage.hg6
    public p63 getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && FragmentManager.K(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        u2a u2aVar = new u2a((Object) null);
        LinkedHashMap linkedHashMap = u2aVar.a;
        if (application != null) {
            linkedHashMap.put(grg.a.d, application);
        }
        linkedHashMap.put(wkd.a, this);
        linkedHashMap.put(wkd.b, this);
        if (getArguments() != null) {
            linkedHashMap.put(wkd.c, getArguments());
        }
        return u2aVar;
    }

    @Override // defpackage.hg6
    public grg.c getDefaultViewModelProviderFactory() {
        Application application = null;
        if (this.mFragmentManager == null) {
            r6.g("Can't access ViewModels from detached fragment");
            return null;
        }
        if (this.mDefaultFactory == null) {
            Context applicationContext = requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && FragmentManager.K(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.mDefaultFactory = new eld(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    public int getEnterAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.b;
    }

    public Object getEnterTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.i;
    }

    public lde getEnterTransitionCallback() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.q;
    }

    public int getExitAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.c;
    }

    public Object getExitTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.k;
    }

    public lde getExitTransitionCallback() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.r;
    }

    public View getFocusedView() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.t;
    }

    @Deprecated
    public final FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        cr5<?> cr5Var = this.mHost;
        if (cr5Var == null) {
            return null;
        }
        return cr5Var.p();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        cr5<?> cr5Var = this.mHost;
        if (cr5Var == null) {
            r6.g("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
            return null;
        }
        LayoutInflater layoutInflaterQ = cr5Var.q();
        layoutInflaterQ.setFactory2(this.mChildFragmentManager.f);
        return layoutInflaterQ;
    }

    @Override // defpackage.zv8
    public kv8 getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public e09 getLoaderManager() {
        return e09.a(this);
    }

    public int getNextTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final FragmentManager getParentFragmentManager() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        r6.g(s6.d("Fragment ", this, " not associated with a fragment manager."));
        return null;
    }

    public boolean getPopDirection() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return false;
        }
        return kVar.a;
    }

    public int getPopEnterAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.d;
    }

    public int getPopExitAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.e;
    }

    public float getPostOnViewCreatedAlpha() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 1.0f;
        }
        return kVar.s;
    }

    public Object getReenterTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        Object obj = kVar.l;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        cs5.a aVar = cs5.a;
        cs5.b(new GetRetainInstanceUsageViolation(this, "Attempting to get retain instance for fragment " + this));
        cs5.a(this).getClass();
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        Object obj = kVar.j;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // defpackage.dld
    public final ald getSavedStateRegistry() {
        return this.mSavedStateRegistryController.b;
    }

    public Object getSharedElementEnterTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.m;
    }

    public Object getSharedElementReturnTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        Object obj = kVar.n;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        k kVar = this.mAnimationInfo;
        return (kVar == null || (arrayList = kVar.g) == null) ? new ArrayList<>() : arrayList;
    }

    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        k kVar = this.mAnimationInfo;
        return (kVar == null || (arrayList = kVar.h) == null) ? new ArrayList<>() : arrayList;
    }

    public final String getString(int i2) {
        return getResources().getString(i2);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final int getTargetRequestCode() {
        cs5.a aVar = cs5.a;
        cs5.b(new GetTargetFragmentRequestCodeUsageViolation(this, "Attempting to get target request code from fragment " + this));
        cs5.a(this).getClass();
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i2) {
        return getResources().getText(i2);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public zv8 getViewLifecycleOwner() {
        p pVar = this.mViewLifecycleOwner;
        if (pVar != null) {
            return pVar;
        }
        r6.g(s6.d("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
        return null;
    }

    public pz8<zv8> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // defpackage.jrg
    public irg getViewModelStore() {
        if (this.mFragmentManager == null) {
            r6.g("Can't access ViewModels from detached fragment");
            return null;
        }
        if (getMinimumMaxLifecycleState() == 1) {
            r6.g("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
            return null;
        }
        HashMap<String, irg> map = this.mFragmentManager.N.d;
        irg irgVar = map.get(this.mWho);
        if (irgVar != null) {
            return irgVar;
        }
        irg irgVar2 = new irg();
        map.put(this.mWho, irgVar2);
        return irgVar2;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        initLifecycle();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new lr5();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        if (this.mHidden) {
            return true;
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            Fragment fragment = this.mParentFragment;
            fragmentManager.getClass();
            if (fragment == null ? false : fragment.isHidden()) {
                return true;
            }
        }
        return false;
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        if (!this.mMenuVisible) {
            return false;
        }
        if (this.mFragmentManager != null) {
            Fragment fragment = this.mParentFragment;
            if (!(fragment == null ? true : fragment.isMenuVisible())) {
                return false;
            }
        }
        return true;
    }

    public boolean isPostponed() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return false;
        }
        return kVar.u;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.O();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.Q();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i2, int i3, Intent intent) {
        if (FragmentManager.K(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i2 + " resultCode: " + i3 + " data: " + intent);
        }
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        cr5<?> cr5Var = this.mHost;
        androidx.fragment.app.g gVar = cr5Var == null ? null : cr5Var.a;
        if (gVar != null) {
            this.mCalled = false;
            onAttach((Activity) gVar);
        }
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState();
        FragmentManager fragmentManager = this.mChildFragmentManager;
        if (fragmentManager.u >= 1) {
            return;
        }
        fragmentManager.G = false;
        fragmentManager.H = false;
        fragmentManager.N.V = false;
        fragmentManager.t(1);
    }

    public Animation onCreateAnimation(int i2, boolean z, int i3) {
        return null;
    }

    public Animator onCreateAnimator(int i2, boolean z, int i3) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Deprecated
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2 = this.mContentLayoutId;
        if (i2 != 0) {
            return layoutInflater.inflate(i2, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z) {
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        cr5<?> cr5Var = this.mHost;
        androidx.fragment.app.g gVar = cr5Var == null ? null : cr5Var.a;
        if (gVar != null) {
            this.mCalled = false;
            onInflate((Activity) gVar, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    @Deprecated
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    @Deprecated
    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.Q();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (!this.mCalled) {
            throw new SuperNotCalledException(s6.d("Fragment ", this, " did not call through to super.onActivityCreated()"));
        }
        restoreViewState();
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.G = false;
        fragmentManager.H = false;
        fragmentManager.N.V = false;
        fragmentManager.t(4);
    }

    public void performAttach() {
        Iterator<l> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.b(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach((Context) this.mHost.b);
        if (!this.mCalled) {
            throw new SuperNotCalledException(s6.d("Fragment ", this, " did not call through to super.onAttach()"));
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        Iterator<tr5> it2 = fragmentManager.o.iterator();
        while (it2.hasNext()) {
            it2.next().a(fragmentManager, this);
        }
        FragmentManager fragmentManager2 = this.mChildFragmentManager;
        fragmentManager2.G = false;
        fragmentManager2.H = false;
        fragmentManager2.N.V = false;
        fragmentManager2.t(0);
    }

    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.i(menuItem);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.Q();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.a(new g());
        onCreate(bundle);
        this.mIsCreated = true;
        if (!this.mCalled) {
            throw new SuperNotCalledException(s6.d("Fragment ", this, " did not call through to super.onCreate()"));
        }
        this.mLifecycleRegistry.f(kv8.a.ON_CREATE);
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z = true;
        }
        return this.mChildFragmentManager.j(menu, menuInflater) | z;
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.Q();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new p(this, getViewModelStore(), new dq2(this, 2));
        View viewOnCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = viewOnCreateView;
        p pVar = this.mViewLifecycleOwner;
        if (viewOnCreateView == null) {
            if (pVar.e == null) {
                this.mViewLifecycleOwner = null;
                return;
            } else {
                r6.g("Called getViewLifecycleOwner() but onCreateView() returned null");
                return;
            }
        }
        pVar.b();
        if (FragmentManager.K(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.mView + " for Fragment " + this);
        }
        zte.e(this.mView, this.mViewLifecycleOwner);
        View view = this.mView;
        p pVar2 = this.mViewLifecycleOwner;
        view.getClass();
        view.setTag(R.id.view_tree_view_model_store_owner, pVar2);
        View view2 = this.mView;
        p pVar3 = this.mViewLifecycleOwner;
        view2.getClass();
        view2.setTag(R.id.view_tree_saved_state_registry_owner, pVar3);
        this.mViewLifecycleOwnerLiveData.j(this.mViewLifecycleOwner);
    }

    public void performDestroy() {
        this.mChildFragmentManager.k();
        this.mLifecycleRegistry.f(kv8.a.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new SuperNotCalledException(s6.d("Fragment ", this, " did not call through to super.onDestroy()"));
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.t(1);
        if (this.mView != null) {
            p pVar = this.mViewLifecycleOwner;
            pVar.b();
            if (pVar.e.d.compareTo(kv8.b.c) >= 0) {
                this.mViewLifecycleOwner.a(kv8.a.ON_DESTROY);
            }
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (!this.mCalled) {
            throw new SuperNotCalledException(s6.d("Fragment ", this, " did not call through to super.onDestroyView()"));
        }
        loe<f09.a> loeVar = e09.a(this).b.b;
        int iH = loeVar.h();
        for (int i2 = 0; i2 < iH; i2++) {
            loeVar.i(i2).l();
        }
        this.mPerformedCreateView = false;
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new SuperNotCalledException(s6.d("Fragment ", this, " did not call through to super.onDetach()"));
        }
        FragmentManager fragmentManager = this.mChildFragmentManager;
        if (fragmentManager.I) {
            return;
        }
        fragmentManager.k();
        this.mChildFragmentManager = new lr5();
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = layoutInflaterOnGetLayoutInflater;
        return layoutInflaterOnGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.o(menuItem);
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.p(menu);
    }

    public void performPause() {
        this.mChildFragmentManager.t(5);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(kv8.a.ON_PAUSE);
        }
        this.mLifecycleRegistry.f(kv8.a.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new SuperNotCalledException(s6.d("Fragment ", this, " did not call through to super.onPause()"));
        }
    }

    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z = true;
        }
        return this.mChildFragmentManager.s(menu) | z;
    }

    public void performPrimaryNavigationFragmentChanged() {
        this.mFragmentManager.getClass();
        boolean zN = FragmentManager.N(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != zN) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(zN);
            onPrimaryNavigationFragmentChanged(zN);
            FragmentManager fragmentManager = this.mChildFragmentManager;
            fragmentManager.j0();
            fragmentManager.q(fragmentManager.y);
        }
    }

    public void performResume() {
        this.mChildFragmentManager.Q();
        this.mChildFragmentManager.x(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new SuperNotCalledException(s6.d("Fragment ", this, " did not call through to super.onResume()"));
        }
        aw8 aw8Var = this.mLifecycleRegistry;
        kv8.a aVar = kv8.a.ON_RESUME;
        aw8Var.f(aVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.e.f(aVar);
        }
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.G = false;
        fragmentManager.H = false;
        fragmentManager.N.V = false;
        fragmentManager.t(7);
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
    }

    public void performStart() {
        this.mChildFragmentManager.Q();
        this.mChildFragmentManager.x(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new SuperNotCalledException(s6.d("Fragment ", this, " did not call through to super.onStart()"));
        }
        aw8 aw8Var = this.mLifecycleRegistry;
        kv8.a aVar = kv8.a.ON_START;
        aw8Var.f(aVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.e.f(aVar);
        }
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.G = false;
        fragmentManager.H = false;
        fragmentManager.N.V = false;
        fragmentManager.t(5);
    }

    public void performStop() {
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.H = true;
        fragmentManager.N.V = true;
        fragmentManager.t(4);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(kv8.a.ON_STOP);
        }
        this.mLifecycleRegistry.f(kv8.a.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new SuperNotCalledException(s6.d("Fragment ", this, " did not call through to super.onStop()"));
        }
    }

    public void performViewCreated() {
        Bundle bundle = this.mSavedFragmentState;
        onViewCreated(this.mView, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.mChildFragmentManager.t(2);
    }

    public final void postponeEnterTransition(long j2, TimeUnit timeUnit) {
        ensureAnimationInfo().u = true;
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            this.mPostponedHandler = fragmentManager.v.c;
        } else {
            this.mPostponedHandler = new Handler(Looper.getMainLooper());
        }
        this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j2));
    }

    public final <I, O> z8<I> registerForActivityResult(o8<I, O> o8Var, n8<O> n8Var) {
        return prepareCallInternal(o8Var, new h(), n8Var);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i2) throws Exception {
        if (this.mHost == null) {
            r6.g(s6.d("Fragment ", this, " not attached to Activity"));
            return;
        }
        FragmentManager parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.D == null) {
            parentFragmentManager.v.getClass();
            return;
        }
        parentFragmentManager.E.addLast(new FragmentManager.LaunchedFragmentInfo(this.mWho, i2));
        parentFragmentManager.D.a(strArr);
    }

    public final androidx.fragment.app.g requireActivity() {
        androidx.fragment.app.g activity = getActivity();
        if (activity != null) {
            return activity;
        }
        r6.g(s6.d("Fragment ", this, " not attached to an activity."));
        return null;
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        r6.g(s6.d("Fragment ", this, " does not have any arguments."));
        return null;
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        r6.g(s6.d("Fragment ", this, " not attached to a context."));
        return null;
    }

    @Deprecated
    public final FragmentManager requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        r6.g(s6.d("Fragment ", this, " not attached to a host."));
        return null;
    }

    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            r6.g(s6.d("Fragment ", this, " is not attached to any Fragment or host"));
            return null;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        Context context = getContext();
        sb.append(" is not a child Fragment, it is directly attached to ");
        sb.append(context);
        throw new IllegalStateException(sb.toString());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        r6.g(s6.d("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
        return null;
    }

    public void restoreChildFragmentState() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.mChildFragmentManager.X(bundle);
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.G = false;
        fragmentManager.H = false;
        fragmentManager.N.V = false;
        fragmentManager.t(1);
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        ensureAnimationInfo().p = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        ensureAnimationInfo().o = Boolean.valueOf(z);
    }

    public void setAnimations(int i2, int i3, int i4, int i5) {
        if (this.mAnimationInfo == null && i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) {
            return;
        }
        ensureAnimationInfo().b = i2;
        ensureAnimationInfo().c = i3;
        ensureAnimationInfo().d = i4;
        ensureAnimationInfo().e = i5;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager == null || !isStateSaved()) {
            this.mArguments = bundle;
        } else {
            r6.g("Fragment already added and state has been saved");
        }
    }

    public void setEnterSharedElementCallback(lde ldeVar) {
        ensureAnimationInfo().q = ldeVar;
    }

    public void setEnterTransition(Object obj) {
        ensureAnimationInfo().i = obj;
    }

    public void setExitSharedElementCallback(lde ldeVar) {
        ensureAnimationInfo().r = ldeVar;
    }

    public void setExitTransition(Object obj) {
        ensureAnimationInfo().k = obj;
    }

    public void setFocusedView(View view) {
        ensureAnimationInfo().t = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (!isAdded() || isHidden()) {
                return;
            }
            this.mHost.t();
        }
    }

    public void setInitialSavedState(SavedState savedState) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            r6.g("Fragment already added");
            return;
        }
        if (savedState == null || (bundle = savedState.a) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.t();
            }
        }
    }

    public void setNextTransition(int i2) {
        if (this.mAnimationInfo == null && i2 == 0) {
            return;
        }
        ensureAnimationInfo();
        this.mAnimationInfo.f = i2;
    }

    public void setPopDirection(boolean z) {
        if (this.mAnimationInfo == null) {
            return;
        }
        ensureAnimationInfo().a = z;
    }

    public void setPostOnViewCreatedAlpha(float f2) {
        ensureAnimationInfo().s = f2;
    }

    public void setReenterTransition(Object obj) {
        ensureAnimationInfo().l = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z) {
        cs5.a aVar = cs5.a;
        cs5.b(new SetRetainInstanceUsageViolation(this, "Attempting to set retain instance for fragment " + this));
        cs5.a(this).getClass();
        this.mRetainInstance = z;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            this.mRetainInstanceChangedWhileDetached = true;
            return;
        }
        androidx.fragment.app.l lVar = fragmentManager.N;
        if (z) {
            lVar.g(this);
        } else {
            lVar.k(this);
        }
    }

    public void setReturnTransition(Object obj) {
        ensureAnimationInfo().j = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        ensureAnimationInfo().m = obj;
    }

    public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        ensureAnimationInfo();
        k kVar = this.mAnimationInfo;
        kVar.g = arrayList;
        kVar.h = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        ensureAnimationInfo().n = obj;
    }

    @Deprecated
    public void setTargetFragment(Fragment fragment, int i2) {
        if (fragment != null) {
            cs5.a aVar = cs5.a;
            cs5.b(new SetTargetFragmentUsageViolation(this, fragment, i2));
            cs5.a(this).getClass();
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        FragmentManager fragmentManager2 = fragment != null ? fragment.mFragmentManager : null;
        if (fragmentManager != null && fragmentManager2 != null && fragmentManager != fragmentManager2) {
            l5.q(s6.d("Fragment ", fragment, " must share the same FragmentManager to be set as a target fragment"));
            return;
        }
        for (Fragment targetFragment = fragment; targetFragment != null; targetFragment = targetFragment.getTargetFragment(false)) {
            if (targetFragment.equals(this)) {
                q6.l("Setting ", fragment, " as the target of ", this, " would create a target cycle");
                return;
            }
        }
        if (fragment == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || fragment.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = fragment;
        } else {
            this.mTargetWho = fragment.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i2;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z) {
        cs5.a aVar = cs5.a;
        cs5.b(new SetUserVisibleHintViolation(this, z));
        cs5.a(this).getClass();
        boolean z2 = false;
        if (!this.mUserVisibleHint && z && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            FragmentManager fragmentManager = this.mFragmentManager;
            m mVarF = fragmentManager.f(this);
            Fragment fragment = mVarF.c;
            if (fragment.mDeferStart) {
                if (fragmentManager.b) {
                    fragmentManager.J = true;
                } else {
                    fragment.mDeferStart = false;
                    mVarF.k();
                }
            }
        }
        this.mUserVisibleHint = z;
        if (this.mState < 5 && !z) {
            z2 = true;
        }
        this.mDeferStart = z2;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        cr5<?> cr5Var = this.mHost;
        if (cr5Var != null) {
            return cr5Var.s(str);
        }
        return false;
    }

    public void startActivity(Intent intent, Bundle bundle) {
        cr5<?> cr5Var = this.mHost;
        if (cr5Var != null) {
            cr5Var.b.startActivity(intent, bundle);
        } else {
            r6.g(s6.d("Fragment ", this, " not attached to Activity"));
        }
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i2, Bundle bundle) throws Exception {
        if (this.mHost == null) {
            r6.g(s6.d("Fragment ", this, " not attached to Activity"));
            return;
        }
        FragmentManager parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.B != null) {
            parentFragmentManager.E.addLast(new FragmentManager.LaunchedFragmentInfo(this.mWho, i2));
            if (bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            parentFragmentManager.B.a(intent);
            return;
        }
        cr5<?> cr5Var = parentFragmentManager.v;
        if (i2 == -1) {
            cr5Var.b.startActivity(intent, bundle);
        } else {
            cr5Var.getClass();
            r6.g("Starting activity with a requestCode requires a FragmentActivity host");
        }
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) throws Exception {
        if (this.mHost == null) {
            r6.g(s6.d("Fragment ", this, " not attached to Activity"));
            return;
        }
        if (FragmentManager.K(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i2 + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle);
        }
        FragmentManager parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.C == null) {
            cr5<?> cr5Var = parentFragmentManager.v;
            if (i2 == -1) {
                cr5Var.a.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
                return;
            } else {
                cr5Var.getClass();
                r6.g("Starting intent sender with a requestCode requires a FragmentActivity host");
                return;
            }
        }
        if (bundle != null) {
            if (intent == null) {
                intent = new Intent();
                intent.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            }
            if (FragmentManager.K(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent + " for fragment " + this);
            }
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        intentSender.getClass();
        IntentSenderRequest intentSenderRequest = new IntentSenderRequest(intentSender, intent, i3, i4);
        parentFragmentManager.E.addLast(new FragmentManager.LaunchedFragmentInfo(this.mWho, i2));
        if (FragmentManager.K(2)) {
            Log.v("FragmentManager", "Fragment " + this + "is launching an IntentSender for result ");
        }
        parentFragmentManager.C.a(intentSenderRequest);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !ensureAnimationInfo().u) {
            return;
        }
        if (this.mHost == null) {
            ensureAnimationInfo().u = false;
        } else if (Looper.myLooper() != this.mHost.c.getLooper()) {
            this.mHost.c.postAtFrontOfQueue(new d());
        } else {
            callStartTransitionListener(true);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(")");
        return sb.toString();
    }

    public Activity u() {
        return getActivity();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    public boolean y() {
        return isAdded();
    }

    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public final Bundle a;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            Bundle bundle = parcel.readBundle();
            this.a = bundle;
            if (classLoader == null || bundle == null) {
                return;
            }
            bundle.setClassLoader(classLoader);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.a);
        }

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        }

        public SavedState(Bundle bundle) {
            this.a = bundle;
        }
    }

    public final String getString(int i2, Object... objArr) {
        return getResources().getString(i2, objArr);
    }

    public final <I, O> z8<I> registerForActivityResult(o8<I, O> o8Var, c9 c9Var, n8<O> n8Var) {
        return prepareCallInternal(o8Var, new i(c9Var), n8Var);
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (this.mCalled) {
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(kv8.a.ON_CREATE);
                return;
            }
            return;
        }
        throw new SuperNotCalledException(s6.d("Fragment ", this, " did not call through to super.onViewStateRestored()"));
    }

    @Deprecated
    public final Fragment getTargetFragment() {
        return getTargetFragment(true);
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().u = true;
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i2) throws Exception {
        startActivityForResult(intent, i2, null);
    }

    public Fragment(int i2) {
        this();
        this.mContentLayoutId = i2;
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }
}
