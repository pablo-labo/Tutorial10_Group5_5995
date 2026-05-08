package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o;
import androidx.fragment.app.strictmode.FragmentReuseViolation;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.akb;
import defpackage.ald;
import defpackage.c9;
import defpackage.co9;
import defpackage.cr5;
import defpackage.cs5;
import defpackage.dld;
import defpackage.dqa;
import defpackage.f9;
import defpackage.fwc;
import defpackage.gr5;
import defpackage.h5;
import defpackage.hqa;
import defpackage.hr5;
import defpackage.hrg;
import defpackage.iqa;
import defpackage.ir5;
import defpackage.irg;
import defpackage.jr5;
import defpackage.jrg;
import defpackage.k9;
import defpackage.kr5;
import defpackage.kv8;
import defpackage.l5;
import defpackage.l6;
import defpackage.mo9;
import defpackage.mra;
import defpackage.n6;
import defpackage.n8;
import defpackage.o6;
import defpackage.o8;
import defpackage.p63;
import defpackage.poe;
import defpackage.q39;
import defpackage.r6;
import defpackage.s6;
import defpackage.sqa;
import defpackage.t40;
import defpackage.tr5;
import defpackage.u8;
import defpackage.w8;
import defpackage.wpa;
import defpackage.wq5;
import defpackage.wqa;
import defpackage.yd8;
import defpackage.yq2;
import defpackage.z3;
import defpackage.zv8;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentManager {
    public f9 B;
    public f9 C;
    public f9 D;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public ArrayList<androidx.fragment.app.a> K;
    public ArrayList<Boolean> L;
    public ArrayList<Fragment> M;
    public androidx.fragment.app.l N;
    public boolean b;
    public ArrayList<androidx.fragment.app.a> d;
    public ArrayList<Fragment> e;
    public dqa g;
    public ArrayList<l> m;
    public cr5<?> v;
    public wq5 w;
    public Fragment x;
    public Fragment y;
    public final ArrayList<m> a = new ArrayList<>();
    public final androidx.fragment.app.n c = new androidx.fragment.app.n();
    public final androidx.fragment.app.j f = new androidx.fragment.app.j(this);
    public final b h = new b();
    public final AtomicInteger i = new AtomicInteger();
    public final Map<String, BackStackState> j = Collections.synchronizedMap(new HashMap());
    public final Map<String, Bundle> k = Collections.synchronizedMap(new HashMap());
    public final Map<String, Object> l = Collections.synchronizedMap(new HashMap());
    public final androidx.fragment.app.k n = new androidx.fragment.app.k(this);
    public final CopyOnWriteArrayList<tr5> o = new CopyOnWriteArrayList<>();
    public final gr5 p = new yq2() { // from class: gr5
        @Override // defpackage.yq2
        public final void accept(Object obj) {
            Configuration configuration = (Configuration) obj;
            FragmentManager fragmentManager = this.a;
            if (fragmentManager.M()) {
                fragmentManager.h(false, configuration);
            }
        }
    };
    public final hr5 q = new yq2() { // from class: hr5
        @Override // defpackage.yq2
        public final void accept(Object obj) {
            Integer num = (Integer) obj;
            FragmentManager fragmentManager = this.a;
            if (fragmentManager.M() && num.intValue() == 80) {
                fragmentManager.l(false);
            }
        }
    };
    public final ir5 r = new yq2() { // from class: ir5
        @Override // defpackage.yq2
        public final void accept(Object obj) {
            y1a y1aVar = (y1a) obj;
            FragmentManager fragmentManager = this.a;
            if (fragmentManager.M()) {
                fragmentManager.m(y1aVar.a, false);
            }
        }
    };
    public final jr5 s = new yq2() { // from class: jr5
        @Override // defpackage.yq2
        public final void accept(Object obj) {
            hab habVar = (hab) obj;
            FragmentManager fragmentManager = this.a;
            if (fragmentManager.M()) {
                fragmentManager.r(habVar.a, false);
            }
        }
    };
    public final c t = new c();
    public int u = -1;
    public final d z = new d();
    public final e A = new e();
    public ArrayDeque<LaunchedFragmentInfo> E = new ArrayDeque<>();
    public final f O = new f();

    @SuppressLint({"BanParcelableUsage"})
    public static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new a();
        public String a;
        public int b;

        public class a implements Parcelable.Creator<LaunchedFragmentInfo> {
            @Override // android.os.Parcelable.Creator
            public final LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                LaunchedFragmentInfo launchedFragmentInfo = new LaunchedFragmentInfo();
                launchedFragmentInfo.a = parcel.readString();
                launchedFragmentInfo.b = parcel.readInt();
                return launchedFragmentInfo;
            }

            @Override // android.os.Parcelable.Creator
            public final LaunchedFragmentInfo[] newArray(int i) {
                return new LaunchedFragmentInfo[i];
            }
        }

        public LaunchedFragmentInfo(String str, int i) {
            this.a = str;
            this.b = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.a);
            parcel.writeInt(this.b);
        }
    }

    public class a implements n8<Map<String, Boolean>> {
        public a() {
        }

        @Override // defpackage.n8
        @SuppressLint({"SyntheticAccessor"})
        public final void c(Map<String, Boolean> map) {
            Map<String, Boolean> map2 = map;
            String[] strArr = (String[]) map2.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map2.values());
            int[] iArr = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
            }
            FragmentManager fragmentManager = FragmentManager.this;
            LaunchedFragmentInfo launchedFragmentInfoPollFirst = fragmentManager.E.pollFirst();
            if (launchedFragmentInfoPollFirst == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = launchedFragmentInfoPollFirst.a;
            int i2 = launchedFragmentInfoPollFirst.b;
            Fragment fragmentC = fragmentManager.c.c(str);
            if (fragmentC != null) {
                fragmentC.onRequestPermissionsResult(i2, strArr, iArr);
                return;
            }
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    public class b extends wpa {
        public b() {
            super(false);
        }

        @Override // defpackage.wpa
        public final void b() {
            FragmentManager fragmentManager = FragmentManager.this;
            fragmentManager.x(true);
            if (fragmentManager.h.a) {
                fragmentManager.R();
            } else {
                fragmentManager.g.d();
            }
        }
    }

    public class c implements mo9 {
        public c() {
        }

        @Override // defpackage.mo9
        public final void a(Menu menu) {
            FragmentManager.this.p(menu);
        }

        @Override // defpackage.mo9
        public final void b(Menu menu) {
            FragmentManager.this.s(menu);
        }

        @Override // defpackage.mo9
        public final boolean c(MenuItem menuItem) {
            return FragmentManager.this.o(menuItem);
        }

        @Override // defpackage.mo9
        public final void d(Menu menu, MenuInflater menuInflater) {
            FragmentManager.this.j(menu, menuInflater);
        }
    }

    public class d extends androidx.fragment.app.i {
        public d() {
        }

        @Override // androidx.fragment.app.i
        public final Fragment a(String str) {
            return Fragment.instantiate(FragmentManager.this.v.b, str, null);
        }
    }

    public class e implements poe {
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            FragmentManager.this.x(true);
        }
    }

    public class g implements tr5 {
        public final /* synthetic */ Fragment a;

        public g(Fragment fragment) {
            this.a = fragment;
        }

        @Override // defpackage.tr5
        public final void a(FragmentManager fragmentManager, Fragment fragment) {
            this.a.onAttachFragment(fragment);
        }
    }

    public class h implements n8<ActivityResult> {
        public h() {
        }

        @Override // defpackage.n8
        public final void c(ActivityResult activityResult) {
            ActivityResult activityResult2 = activityResult;
            FragmentManager fragmentManager = FragmentManager.this;
            LaunchedFragmentInfo launchedFragmentInfoPollLast = fragmentManager.E.pollLast();
            if (launchedFragmentInfoPollLast == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = launchedFragmentInfoPollLast.a;
            int i = launchedFragmentInfoPollLast.b;
            Fragment fragmentC = fragmentManager.c.c(str);
            if (fragmentC != null) {
                fragmentC.onActivityResult(i, activityResult2.a, activityResult2.b);
                return;
            }
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    public class i implements n8<ActivityResult> {
        public i() {
        }

        @Override // defpackage.n8
        public final void c(ActivityResult activityResult) {
            ActivityResult activityResult2 = activityResult;
            FragmentManager fragmentManager = FragmentManager.this;
            LaunchedFragmentInfo launchedFragmentInfoPollFirst = fragmentManager.E.pollFirst();
            if (launchedFragmentInfoPollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = launchedFragmentInfoPollFirst.a;
            int i = launchedFragmentInfoPollFirst.b;
            Fragment fragmentC = fragmentManager.c.c(str);
            if (fragmentC != null) {
                fragmentC.onActivityResult(i, activityResult2.a, activityResult2.b);
                return;
            }
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    public static class j extends o8<IntentSenderRequest, ActivityResult> {
        @Override // defpackage.o8
        public final Intent a(Object obj, Context context) {
            Bundle bundleExtra;
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) obj;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intent2 = intentSenderRequest.b;
            if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    IntentSender intentSender = intentSenderRequest.a;
                    intentSender.getClass();
                    intentSenderRequest = new IntentSenderRequest(intentSender, null, intentSenderRequest.c, intentSenderRequest.d);
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
            if (FragmentManager.K(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // defpackage.o8
        public final Object c(Intent intent, int i) {
            return new ActivityResult(intent, i);
        }
    }

    public static abstract class k {
        @Deprecated
        public void onFragmentActivityCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
        }

        public void onFragmentCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentDestroyed(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void onFragmentDetached(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void onFragmentPaused(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void onFragmentPreAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
        }

        public void onFragmentPreCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void onFragmentSaveInstanceState(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentStarted(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void onFragmentStopped(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        }

        public void onFragmentViewDestroyed(FragmentManager fragmentManager, Fragment fragment) {
        }
    }

    public interface l {
        default void a(Fragment fragment, boolean z) {
        }

        default void b(Fragment fragment, boolean z) {
        }
    }

    public interface m {
        boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2);
    }

    public class n implements m {
        public final String a;
        public final int b;

        public n(String str, int i) {
            this.a = str;
            this.b = i;
        }

        @Override // androidx.fragment.app.FragmentManager.m
        public final boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            FragmentManager fragmentManager = FragmentManager.this;
            Fragment fragment = fragmentManager.y;
            if (fragment != null && this.b < 0 && this.a == null && fragment.getChildFragmentManager().S(-1, 0)) {
                return false;
            }
            return fragmentManager.T(arrayList, arrayList2, this.a, this.b, 1);
        }
    }

    public class o implements m {
        public final String a;

        public o(String str) {
            this.a = str;
        }

        @Override // androidx.fragment.app.FragmentManager.m
        public final boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            FragmentManager fragmentManager = FragmentManager.this;
            BackStackState backStackStateRemove = fragmentManager.j.remove(this.a);
            boolean z = false;
            if (backStackStateRemove == null) {
                return false;
            }
            HashMap map = new HashMap();
            for (androidx.fragment.app.a aVar : arrayList) {
                if (aVar.u) {
                    Iterator<o.a> it = aVar.a.iterator();
                    while (it.hasNext()) {
                        Fragment fragment = it.next().b;
                        if (fragment != null) {
                            map.put(fragment.mWho, fragment);
                        }
                    }
                }
            }
            ArrayList<String> arrayList3 = backStackStateRemove.a;
            HashMap map2 = new HashMap(arrayList3.size());
            for (String str : arrayList3) {
                Fragment fragment2 = (Fragment) map.get(str);
                if (fragment2 != null) {
                    map2.put(fragment2.mWho, fragment2);
                } else {
                    Bundle bundleI = fragmentManager.c.i(str, null);
                    if (bundleI != null) {
                        ClassLoader classLoader = fragmentManager.v.b.getClassLoader();
                        Fragment fragmentA = ((FragmentState) bundleI.getParcelable("state")).a(fragmentManager.H(), classLoader);
                        fragmentA.mSavedFragmentState = bundleI;
                        if (bundleI.getBundle("savedInstanceState") == null) {
                            fragmentA.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
                        }
                        Bundle bundle = bundleI.getBundle("arguments");
                        if (bundle != null) {
                            bundle.setClassLoader(classLoader);
                        }
                        fragmentA.setArguments(bundle);
                        map2.put(fragmentA.mWho, fragmentA);
                    }
                }
            }
            ArrayList arrayList4 = new ArrayList();
            for (BackStackRecordState backStackRecordState : backStackStateRemove.b) {
                ArrayList<String> arrayList5 = backStackRecordState.b;
                androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(fragmentManager);
                backStackRecordState.a(aVar2);
                for (int i = 0; i < arrayList5.size(); i++) {
                    String str2 = arrayList5.get(i);
                    if (str2 != null) {
                        Fragment fragment3 = (Fragment) map2.get(str2);
                        if (fragment3 == null) {
                            r6.g(z3.n(new StringBuilder("Restoring FragmentTransaction "), backStackRecordState.f, " failed due to missing saved state for Fragment (", str2, ")"));
                            return false;
                        }
                        aVar2.a.get(i).b = fragment3;
                    }
                }
                arrayList4.add(aVar2);
            }
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                ((androidx.fragment.app.a) it2.next()).a(arrayList, arrayList2);
                z = true;
            }
            return z;
        }
    }

    public class p implements m {
        public final String a;

        public p(String str) {
            this.a = str;
        }

        @Override // androidx.fragment.app.FragmentManager.m
        public final boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) throws Throwable {
            int i;
            FragmentManager fragmentManager = FragmentManager.this;
            byte b = -1;
            String str = this.a;
            int iA = fragmentManager.A(-1, str, true);
            if (iA < 0) {
                return false;
            }
            int i2 = iA;
            while (true) {
                Throwable th = null;
                if (i2 < fragmentManager.d.size()) {
                    androidx.fragment.app.a aVar = fragmentManager.d.get(i2);
                    if (!aVar.p) {
                        fragmentManager.h0(new IllegalArgumentException("saveBackStack(\"" + str + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + aVar + " that did not use setReorderingAllowed(true)."));
                        throw null;
                    }
                    i2++;
                } else {
                    HashSet hashSet = new HashSet();
                    int i3 = iA;
                    while (true) {
                        int i4 = 8;
                        int i5 = 2;
                        if (i3 >= fragmentManager.d.size()) {
                            Throwable th2 = th;
                            ArrayDeque arrayDeque = new ArrayDeque(hashSet);
                            while (!arrayDeque.isEmpty()) {
                                Fragment fragment = (Fragment) arrayDeque.removeFirst();
                                if (fragment.mRetainInstance) {
                                    StringBuilder sbM = akb.m("saveBackStack(\"", str, "\") must not contain retained fragments. Found ");
                                    sbM.append(hashSet.contains(fragment) ? "direct reference to retained " : "retained child ");
                                    sbM.append("fragment ");
                                    sbM.append(fragment);
                                    fragmentManager.h0(new IllegalArgumentException(sbM.toString()));
                                    throw th2;
                                }
                                for (Fragment fragment2 : fragment.mChildFragmentManager.c.e()) {
                                    if (fragment2 != null) {
                                        arrayDeque.addLast(fragment2);
                                    }
                                }
                            }
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it = hashSet.iterator();
                            while (it.hasNext()) {
                                arrayList3.add(((Fragment) it.next()).mWho);
                            }
                            ArrayList arrayList4 = new ArrayList(fragmentManager.d.size() - iA);
                            for (int i6 = iA; i6 < fragmentManager.d.size(); i6++) {
                                arrayList4.add(th2);
                            }
                            BackStackState backStackState = new BackStackState(arrayList3, arrayList4);
                            int size = fragmentManager.d.size() - 1;
                            while (size >= iA) {
                                androidx.fragment.app.a aVarRemove = fragmentManager.d.remove(size);
                                androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(aVarRemove);
                                ArrayList<o.a> arrayList5 = aVar2.a;
                                int size2 = arrayList5.size() - 1;
                                while (size2 >= 0) {
                                    o.a aVar3 = arrayList5.get(size2);
                                    if (aVar3.c) {
                                        if (aVar3.a == i4) {
                                            aVar3.c = false;
                                            arrayList5.remove(size2 - 1);
                                            size2--;
                                        } else {
                                            int i7 = aVar3.b.mContainerId;
                                            aVar3.a = i5;
                                            aVar3.c = false;
                                            for (int i8 = size2 - 1; i8 >= 0; i8--) {
                                                o.a aVar4 = arrayList5.get(i8);
                                                if (aVar4.c && aVar4.b.mContainerId == i7) {
                                                    arrayList5.remove(i8);
                                                    size2--;
                                                }
                                            }
                                        }
                                    }
                                    size2--;
                                    i4 = 8;
                                    i5 = 2;
                                }
                                arrayList4.set(size - iA, new BackStackRecordState(aVar2));
                                aVarRemove.u = true;
                                arrayList.add(aVarRemove);
                                arrayList2.add(Boolean.TRUE);
                                size--;
                                i4 = 8;
                                i5 = 2;
                            }
                            fragmentManager.j.put(str, backStackState);
                            return true;
                        }
                        androidx.fragment.app.a aVar5 = fragmentManager.d.get(i3);
                        HashSet hashSet2 = new HashSet();
                        HashSet hashSet3 = new HashSet();
                        for (o.a aVar6 : aVar5.a) {
                            byte b2 = b;
                            Fragment fragment3 = aVar6.b;
                            if (fragment3 != null) {
                                Throwable th3 = th;
                                if (!aVar6.c || (i = aVar6.a) == 1 || i == 2 || i == 8) {
                                    hashSet.add(fragment3);
                                    hashSet2.add(fragment3);
                                }
                                int i9 = aVar6.a;
                                if (i9 == 1 || i9 == 2) {
                                    hashSet3.add(fragment3);
                                }
                                th = th3;
                            }
                            b = b2;
                        }
                        byte b3 = b;
                        Throwable th4 = th;
                        hashSet2.removeAll(hashSet3);
                        if (!hashSet2.isEmpty()) {
                            StringBuilder sbM2 = akb.m("saveBackStack(\"", str, "\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                            sbM2.append(hashSet2.size() == 1 ? " " + hashSet2.iterator().next() : "s " + hashSet2);
                            sbM2.append(" in ");
                            sbM2.append(aVar5);
                            sbM2.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                            fragmentManager.h0(new IllegalArgumentException(sbM2.toString()));
                            throw th4;
                        }
                        i3++;
                        th = th4;
                        b = b3;
                    }
                }
            }
        }
    }

    public static <F extends Fragment> F B(View view) {
        F f2 = (F) E(view);
        if (f2 != null) {
            return f2;
        }
        n6.d("View ", view, " does not have a Fragment set");
        return null;
    }

    public static Fragment E(View view) {
        while (view != null) {
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            Fragment fragment = tag instanceof Fragment ? (Fragment) tag : null;
            if (fragment != null) {
                return fragment;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    public static boolean K(int i2) {
        return Log.isLoggable("FragmentManager", i2);
    }

    public static boolean L(Fragment fragment) {
        if (fragment.mHasMenu && fragment.mMenuVisible) {
            return true;
        }
        boolean zL = false;
        for (Fragment fragment2 : fragment.mChildFragmentManager.c.e()) {
            if (fragment2 != null) {
                zL = L(fragment2);
            }
            if (zL) {
                return true;
            }
        }
        return false;
    }

    public static boolean N(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        return fragment.equals(fragmentManager.y) && N(fragmentManager.x);
    }

    public static void f0(Fragment fragment) {
        if (K(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    public final int A(int i2, String str, boolean z) {
        ArrayList<androidx.fragment.app.a> arrayList = this.d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str == null && i2 < 0) {
            if (z) {
                return 0;
            }
            return this.d.size() - 1;
        }
        int size = this.d.size() - 1;
        while (size >= 0) {
            androidx.fragment.app.a aVar = this.d.get(size);
            if ((str != null && str.equals(aVar.i)) || (i2 >= 0 && i2 == aVar.t)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z) {
            if (size == this.d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            androidx.fragment.app.a aVar2 = this.d.get(size - 1);
            if ((str == null || !str.equals(aVar2.i)) && (i2 < 0 || i2 != aVar2.t)) {
                break;
            }
            size--;
        }
        return size;
    }

    public final Fragment C(int i2) {
        androidx.fragment.app.n nVar = this.c;
        ArrayList<Fragment> arrayList = nVar.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Fragment fragment = arrayList.get(size);
            if (fragment != null && fragment.mFragmentId == i2) {
                return fragment;
            }
        }
        for (androidx.fragment.app.m mVar : nVar.b.values()) {
            if (mVar != null) {
                Fragment fragment2 = mVar.c;
                if (fragment2.mFragmentId == i2) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public final Fragment D(String str) {
        androidx.fragment.app.n nVar = this.c;
        ArrayList<Fragment> arrayList = nVar.a;
        if (str != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Fragment fragment = arrayList.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (androidx.fragment.app.m mVar : nVar.b.values()) {
            if (mVar != null) {
                Fragment fragment2 = mVar.c;
                if (str.equals(fragment2.mTag)) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    public final void F() {
        for (r rVar : e()) {
            if (rVar.e) {
                if (K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                rVar.e = false;
                rVar.c();
            }
        }
    }

    public final ViewGroup G(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId <= 0 || !this.w.h()) {
            return null;
        }
        View viewE = this.w.e(fragment.mContainerId);
        if (viewE instanceof ViewGroup) {
            return (ViewGroup) viewE;
        }
        return null;
    }

    public final androidx.fragment.app.i H() {
        Fragment fragment = this.x;
        return fragment != null ? fragment.mFragmentManager.H() : this.z;
    }

    public final poe I() {
        Fragment fragment = this.x;
        return fragment != null ? fragment.mFragmentManager.I() : this.A;
    }

    public final void J(Fragment fragment) {
        if (K(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        e0(fragment);
    }

    public final boolean M() {
        Fragment fragment = this.x;
        if (fragment == null) {
            return true;
        }
        return fragment.isAdded() && this.x.getParentFragmentManager().M();
    }

    public final boolean O() {
        return this.G || this.H;
    }

    public final void P(int i2, boolean z) {
        cr5<?> cr5Var;
        if (this.v == null && i2 != -1) {
            r6.g("No activity");
            return;
        }
        if (z || i2 != this.u) {
            this.u = i2;
            androidx.fragment.app.n nVar = this.c;
            HashMap<String, androidx.fragment.app.m> map = nVar.b;
            Iterator<Fragment> it = nVar.a.iterator();
            while (it.hasNext()) {
                androidx.fragment.app.m mVar = map.get(it.next().mWho);
                if (mVar != null) {
                    mVar.k();
                }
            }
            for (androidx.fragment.app.m mVar2 : map.values()) {
                if (mVar2 != null) {
                    mVar2.k();
                    Fragment fragment = mVar2.c;
                    if (fragment.mRemoving && !fragment.isInBackStack()) {
                        if (fragment.mBeingSaved && !nVar.c.containsKey(fragment.mWho)) {
                            nVar.i(fragment.mWho, mVar2.n());
                        }
                        nVar.h(mVar2);
                    }
                }
            }
            g0();
            if (this.F && (cr5Var = this.v) != null && this.u == 7) {
                cr5Var.t();
                this.F = false;
            }
        }
    }

    public final void Q() {
        if (this.v == null) {
            return;
        }
        this.G = false;
        this.H = false;
        this.N.V = false;
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public final boolean R() {
        return S(-1, 0);
    }

    public final boolean S(int i2, int i3) {
        x(false);
        w(true);
        Fragment fragment = this.y;
        if (fragment != null && i2 < 0 && fragment.getChildFragmentManager().R()) {
            return true;
        }
        boolean zT = T(this.K, this.L, null, i2, i3);
        if (zT) {
            this.b = true;
            try {
                W(this.K, this.L);
            } finally {
                d();
            }
        }
        j0();
        if (this.J) {
            this.J = false;
            g0();
        }
        this.c.b.values().removeAll(Collections.singleton(null));
        return zT;
    }

    public final boolean T(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, String str, int i2, int i3) {
        int iA = A(i2, str, (i3 & 1) != 0);
        if (iA < 0) {
            return false;
        }
        for (int size = this.d.size() - 1; size >= iA; size--) {
            arrayList.add(this.d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void U(Bundle bundle, String str, Fragment fragment) {
        if (fragment.mFragmentManager == this) {
            bundle.putString(str, fragment.mWho);
        } else {
            h0(new IllegalStateException(s6.d("Fragment ", fragment, " is not currently in the FragmentManager")));
            throw null;
        }
    }

    public final void V(Fragment fragment) {
        if (K(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean zIsInBackStack = fragment.isInBackStack();
        if (fragment.mDetached && zIsInBackStack) {
            return;
        }
        androidx.fragment.app.n nVar = this.c;
        synchronized (nVar.a) {
            nVar.a.remove(fragment);
        }
        fragment.mAdded = false;
        if (L(fragment)) {
            this.F = true;
        }
        fragment.mRemoving = true;
        e0(fragment);
    }

    public final void W(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            r6.g("Internal error with the back stack records");
            return;
        }
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            if (!arrayList.get(i2).p) {
                if (i3 != i2) {
                    z(arrayList, arrayList2, i3, i2);
                }
                i3 = i2 + 1;
                if (arrayList2.get(i2).booleanValue()) {
                    while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).p) {
                        i3++;
                    }
                }
                z(arrayList, arrayList2, i2, i3);
                i2 = i3 - 1;
            }
            i2++;
        }
        if (i3 != size) {
            z(arrayList, arrayList2, i3, size);
        }
    }

    public final void X(Bundle bundle) {
        androidx.fragment.app.k kVar;
        androidx.fragment.app.m mVar;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.v.b.getClassLoader());
                this.k.put(str.substring(7), bundle3);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.v.b.getClassLoader());
                map.put(str2.substring(9), bundle2);
            }
        }
        androidx.fragment.app.n nVar = this.c;
        HashMap<String, Bundle> map2 = nVar.c;
        HashMap<String, androidx.fragment.app.m> map3 = nVar.b;
        map2.clear();
        map2.putAll(map);
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle.getParcelable("state");
        if (fragmentManagerState == null) {
            return;
        }
        map3.clear();
        Iterator<String> it = fragmentManagerState.a.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            kVar = this.n;
            if (!zHasNext) {
                break;
            }
            Bundle bundleI = nVar.i(it.next(), null);
            if (bundleI != null) {
                Fragment fragment = this.N.b.get(((FragmentState) bundleI.getParcelable("state")).b);
                if (fragment != null) {
                    if (K(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragment);
                    }
                    mVar = new androidx.fragment.app.m(kVar, nVar, fragment, bundleI);
                } else {
                    mVar = new androidx.fragment.app.m(this.n, this.c, this.v.b.getClassLoader(), H(), bundleI);
                }
                Fragment fragment2 = mVar.c;
                fragment2.mSavedFragmentState = bundleI;
                fragment2.mFragmentManager = this;
                if (K(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + fragment2.mWho + "): " + fragment2);
                }
                mVar.l(this.v.b.getClassLoader());
                nVar.g(mVar);
                mVar.e = this.u;
            }
        }
        androidx.fragment.app.l lVar = this.N;
        lVar.getClass();
        for (Fragment fragment3 : new ArrayList(lVar.b.values())) {
            if (map3.get(fragment3.mWho) == null) {
                if (K(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment3 + " that was not found in the set of active Fragments " + fragmentManagerState.a);
                }
                this.N.k(fragment3);
                fragment3.mFragmentManager = this;
                androidx.fragment.app.m mVar2 = new androidx.fragment.app.m(kVar, nVar, fragment3);
                mVar2.e = 1;
                mVar2.k();
                fragment3.mRemoving = true;
                mVar2.k();
            }
        }
        ArrayList<String> arrayList = fragmentManagerState.b;
        nVar.a.clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                Fragment fragmentB = nVar.b(str3);
                if (fragmentB == null) {
                    r6.g(l5.m("No instantiated fragment for (", str3, ")"));
                    return;
                }
                if (K(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + fragmentB);
                }
                nVar.a(fragmentB);
            }
        }
        if (fragmentManagerState.c != null) {
            this.d = new ArrayList<>(fragmentManagerState.c.length);
            int i2 = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.c;
                if (i2 >= backStackRecordStateArr.length) {
                    break;
                }
                BackStackRecordState backStackRecordState = backStackRecordStateArr[i2];
                ArrayList<String> arrayList2 = backStackRecordState.b;
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(this);
                backStackRecordState.a(aVar);
                aVar.t = backStackRecordState.V;
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    String str4 = arrayList2.get(i3);
                    if (str4 != null) {
                        aVar.a.get(i3).b = nVar.b(str4);
                    }
                }
                aVar.g(1);
                if (K(2)) {
                    StringBuilder sbG = o6.g(i2, "restoreAllState: back stack #", " (index ");
                    sbG.append(aVar.t);
                    sbG.append("): ");
                    sbG.append(aVar);
                    Log.v("FragmentManager", sbG.toString());
                    PrintWriter printWriter = new PrintWriter(new q39());
                    aVar.k("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(aVar);
                i2++;
            }
        } else {
            this.d = null;
        }
        this.i.set(fragmentManagerState.d);
        String str5 = fragmentManagerState.e;
        if (str5 != null) {
            Fragment fragmentB2 = nVar.b(str5);
            this.y = fragmentB2;
            q(fragmentB2);
        }
        ArrayList<String> arrayList3 = fragmentManagerState.f;
        if (arrayList3 != null) {
            for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                this.j.put(arrayList3.get(i4), fragmentManagerState.V.get(i4));
            }
        }
        this.E = new ArrayDeque<>(fragmentManagerState.W);
    }

    public final Bundle Y() {
        BackStackRecordState[] backStackRecordStateArr;
        ArrayList<String> arrayList;
        int size;
        Bundle bundle = new Bundle();
        F();
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((r) it.next()).e();
        }
        x(true);
        this.G = true;
        this.N.V = true;
        androidx.fragment.app.n nVar = this.c;
        nVar.getClass();
        HashMap<String, androidx.fragment.app.m> map = nVar.b;
        ArrayList<String> arrayList2 = new ArrayList<>(map.size());
        for (androidx.fragment.app.m mVar : map.values()) {
            if (mVar != null) {
                Fragment fragment = mVar.c;
                nVar.i(fragment.mWho, mVar.n());
                arrayList2.add(fragment.mWho);
                if (K(2)) {
                    Log.v("FragmentManager", "Saved state of " + fragment + ": " + fragment.mSavedFragmentState);
                }
            }
        }
        HashMap<String, Bundle> map2 = this.c.c;
        if (!map2.isEmpty()) {
            androidx.fragment.app.n nVar2 = this.c;
            synchronized (nVar2.a) {
                try {
                    backStackRecordStateArr = null;
                    if (nVar2.a.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList<>(nVar2.a.size());
                        for (Fragment fragment2 : nVar2.a) {
                            arrayList.add(fragment2.mWho);
                            if (K(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + fragment2.mWho + "): " + fragment2);
                            }
                        }
                    }
                } finally {
                }
            }
            ArrayList<androidx.fragment.app.a> arrayList3 = this.d;
            if (arrayList3 != null && (size = arrayList3.size()) > 0) {
                backStackRecordStateArr = new BackStackRecordState[size];
                for (int i2 = 0; i2 < size; i2++) {
                    backStackRecordStateArr[i2] = new BackStackRecordState(this.d.get(i2));
                    if (K(2)) {
                        StringBuilder sbG = o6.g(i2, "saveAllState: adding back stack #", ": ");
                        sbG.append(this.d.get(i2));
                        Log.v("FragmentManager", sbG.toString());
                    }
                }
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.a = arrayList2;
            fragmentManagerState.b = arrayList;
            fragmentManagerState.c = backStackRecordStateArr;
            fragmentManagerState.d = this.i.get();
            Fragment fragment3 = this.y;
            if (fragment3 != null) {
                fragmentManagerState.e = fragment3.mWho;
            }
            fragmentManagerState.f.addAll(this.j.keySet());
            fragmentManagerState.V.addAll(this.j.values());
            fragmentManagerState.W = new ArrayList<>(this.E);
            bundle.putParcelable("state", fragmentManagerState);
            for (String str : this.k.keySet()) {
                bundle.putBundle(l5.l("result_", str), this.k.get(str));
            }
            for (String str2 : map2.keySet()) {
                bundle.putBundle(l5.l("fragment_", str2), map2.get(str2));
            }
        } else if (K(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    public final Fragment.SavedState Z(Fragment fragment) {
        androidx.fragment.app.m mVar = this.c.b.get(fragment.mWho);
        if (mVar != null) {
            Fragment fragment2 = mVar.c;
            if (fragment2.equals(fragment)) {
                if (fragment2.mState > -1) {
                    return new Fragment.SavedState(mVar.n());
                }
                return null;
            }
        }
        h0(new IllegalStateException(s6.d("Fragment ", fragment, " is not currently in the FragmentManager")));
        throw null;
    }

    public final androidx.fragment.app.m a(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            cs5.a aVar = cs5.a;
            cs5.b(new FragmentReuseViolation(fragment, str));
            cs5.a(fragment).getClass();
        }
        if (K(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        androidx.fragment.app.m mVarF = f(fragment);
        fragment.mFragmentManager = this;
        androidx.fragment.app.n nVar = this.c;
        nVar.g(mVarF);
        if (!fragment.mDetached) {
            nVar.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (L(fragment)) {
                this.F = true;
            }
        }
        return mVarF;
    }

    public final void a0() {
        synchronized (this.a) {
            try {
                if (this.a.size() == 1) {
                    this.v.c.removeCallbacks(this.O);
                    this.v.c.post(this.O);
                    j0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"SyntheticAccessor"})
    public final void b(cr5<?> cr5Var, wq5 wq5Var, Fragment fragment) {
        if (this.v != null) {
            r6.g("Already attached");
            return;
        }
        this.v = cr5Var;
        this.w = wq5Var;
        this.x = fragment;
        CopyOnWriteArrayList<tr5> copyOnWriteArrayList = this.o;
        if (fragment != null) {
            copyOnWriteArrayList.add(new g(fragment));
        } else if (cr5Var instanceof tr5) {
            copyOnWriteArrayList.add((tr5) cr5Var);
        }
        if (this.x != null) {
            j0();
        }
        if (cr5Var instanceof hqa) {
            hqa hqaVar = (hqa) cr5Var;
            dqa dqaVarR = hqaVar.r();
            this.g = dqaVarR;
            zv8 zv8Var = hqaVar;
            if (fragment != null) {
                zv8Var = fragment;
            }
            dqaVarR.a(zv8Var, this.h);
        }
        int i2 = 0;
        if (fragment != null) {
            androidx.fragment.app.l lVar = fragment.mFragmentManager.N;
            HashMap<String, androidx.fragment.app.l> map = lVar.c;
            androidx.fragment.app.l lVar2 = map.get(fragment.mWho);
            if (lVar2 == null) {
                lVar2 = new androidx.fragment.app.l(lVar.e);
                map.put(fragment.mWho, lVar2);
            }
            this.N = lVar2;
        } else if (cr5Var instanceof jrg) {
            irg viewModelStore = ((jrg) cr5Var).getViewModelStore();
            viewModelStore.getClass();
            p63.a aVar = p63.a.b;
            aVar.getClass();
            hrg hrgVar = new hrg(viewModelStore, androidx.fragment.app.l.W, aVar);
            yd8 yd8VarB = fwc.a.b(androidx.fragment.app.l.class);
            String strP = yd8VarB.p();
            if (strP == null) {
                l5.q("Local and anonymous classes can not be ViewModels");
                return;
            }
            this.N = (androidx.fragment.app.l) hrgVar.a(yd8VarB, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strP));
        } else {
            this.N = new androidx.fragment.app.l(false);
        }
        this.N.V = O();
        this.c.d = this.N;
        Object obj = this.v;
        if ((obj instanceof dld) && fragment == null) {
            ald savedStateRegistry = ((dld) obj).getSavedStateRegistry();
            savedStateRegistry.c("android:support:fragments", new kr5(this, i2));
            Bundle bundleA = savedStateRegistry.a("android:support:fragments");
            if (bundleA != null) {
                X(bundleA);
            }
        }
        Object obj2 = this.v;
        if (obj2 instanceof k9) {
            c9 c9VarD = ((k9) obj2).d();
            String strConcat = "FragmentManager:".concat(fragment != null ? l6.i(new StringBuilder(), fragment.mWho, ":") : "");
            this.B = c9VarD.d(strConcat.concat("StartActivityForResult"), new w8(), new h());
            this.C = c9VarD.d(strConcat.concat("StartIntentSenderForResult"), new j(), new i());
            this.D = c9VarD.d(strConcat.concat("RequestPermissions"), new u8(), new a());
        }
        Object obj3 = this.v;
        if (obj3 instanceof iqa) {
            ((iqa) obj3).f(this.p);
        }
        Object obj4 = this.v;
        if (obj4 instanceof mra) {
            ((mra) obj4).j(this.q);
        }
        Object obj5 = this.v;
        if (obj5 instanceof sqa) {
            ((sqa) obj5).i(this.r);
        }
        Object obj6 = this.v;
        if (obj6 instanceof wqa) {
            ((wqa) obj6).c(this.s);
        }
        Object obj7 = this.v;
        if ((obj7 instanceof co9) && fragment == null) {
            ((co9) obj7).b(this.t);
        }
    }

    public final void b0(Fragment fragment, boolean z) {
        ViewGroup viewGroupG = G(fragment);
        if (viewGroupG == null || !(viewGroupG instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupG).setDrawDisappearingViewsLast(!z);
    }

    public final void c(Fragment fragment) {
        if (K(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.c.a(fragment);
            if (K(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (L(fragment)) {
                this.F = true;
            }
        }
    }

    public final void c0(Fragment fragment, kv8.b bVar) {
        if (fragment.equals(this.c.b(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = bVar;
        } else {
            h5.m("Fragment ", fragment, " is not an active fragment of FragmentManager ", this);
        }
    }

    public final void d() {
        this.b = false;
        this.L.clear();
        this.K.clear();
    }

    public final void d0(Fragment fragment) {
        if (fragment != null) {
            if (!fragment.equals(this.c.b(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this)) {
                h5.m("Fragment ", fragment, " is not an active fragment of FragmentManager ", this);
                return;
            }
        }
        Fragment fragment2 = this.y;
        this.y = fragment;
        q(fragment2);
        q(this.y);
    }

    public final HashSet e() {
        Object cVar;
        HashSet hashSet = new HashSet();
        Iterator it = this.c.d().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((androidx.fragment.app.m) it.next()).c.mContainer;
            if (viewGroup != null) {
                I().getClass();
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof r) {
                    cVar = (r) tag;
                } else {
                    cVar = new androidx.fragment.app.c(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, cVar);
                }
                hashSet.add(cVar);
            }
        }
        return hashSet;
    }

    public final void e0(Fragment fragment) {
        ViewGroup viewGroupG = G(fragment);
        if (viewGroupG != null) {
            if (fragment.getPopExitAnim() + fragment.getPopEnterAnim() + fragment.getExitAnim() + fragment.getEnterAnim() > 0) {
                if (viewGroupG.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupG.setTag(R.id.visible_removing_fragment_view_tag, fragment);
                }
                ((Fragment) viewGroupG.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(fragment.getPopDirection());
            }
        }
    }

    public final androidx.fragment.app.m f(Fragment fragment) {
        String str = fragment.mWho;
        androidx.fragment.app.n nVar = this.c;
        androidx.fragment.app.m mVar = nVar.b.get(str);
        if (mVar != null) {
            return mVar;
        }
        androidx.fragment.app.m mVar2 = new androidx.fragment.app.m(this.n, nVar, fragment);
        mVar2.l(this.v.b.getClassLoader());
        mVar2.e = this.u;
        return mVar2;
    }

    public final void g(Fragment fragment) {
        if (K(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (K(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            androidx.fragment.app.n nVar = this.c;
            synchronized (nVar.a) {
                nVar.a.remove(fragment);
            }
            fragment.mAdded = false;
            if (L(fragment)) {
                this.F = true;
            }
            e0(fragment);
        }
    }

    public final void g0() {
        for (androidx.fragment.app.m mVar : this.c.d()) {
            Fragment fragment = mVar.c;
            if (fragment.mDeferStart) {
                if (this.b) {
                    this.J = true;
                } else {
                    fragment.mDeferStart = false;
                    mVar.k();
                }
            }
        }
    }

    public final void h(boolean z, Configuration configuration) {
        if (z && (this.v instanceof iqa)) {
            h0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z) {
                    fragment.mChildFragmentManager.h(true, configuration);
                }
            }
        }
    }

    public final void h0(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new q39());
        cr5<?> cr5Var = this.v;
        if (cr5Var != null) {
            try {
                cr5Var.l(printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
                throw runtimeException;
            }
        }
        try {
            u("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e3) {
            Log.e("FragmentManager", "Failed dumping state", e3);
            throw runtimeException;
        }
    }

    public final boolean i(MenuItem menuItem) {
        if (this.u < 1) {
            return false;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void i0(k kVar) {
        androidx.fragment.app.k kVar2 = this.n;
        synchronized (kVar2.a) {
            try {
                int size = kVar2.a.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    if (kVar2.a.get(i2).a == kVar) {
                        kVar2.a.remove(i2);
                        break;
                    }
                    i2++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean j(Menu menu, MenuInflater menuInflater) {
        if (this.u < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.c.f()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.e != null) {
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                Fragment fragment2 = this.e.get(i2);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.e = arrayList;
        return z;
    }

    public final void j0() {
        synchronized (this.a) {
            try {
                if (!this.a.isEmpty()) {
                    this.h.f(true);
                    return;
                }
                b bVar = this.h;
                ArrayList<androidx.fragment.app.a> arrayList = this.d;
                bVar.f((arrayList != null ? arrayList.size() : 0) > 0 && N(this.x));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k() {
        boolean zIsChangingConfigurations = true;
        this.I = true;
        x(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((r) it.next()).e();
        }
        cr5<?> cr5Var = this.v;
        boolean z = cr5Var instanceof jrg;
        androidx.fragment.app.n nVar = this.c;
        if (z) {
            zIsChangingConfigurations = nVar.d.f;
        } else {
            androidx.fragment.app.g gVar = cr5Var.b;
            if (gVar != null) {
                zIsChangingConfigurations = true ^ gVar.isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator<BackStackState> it2 = this.j.values().iterator();
            while (it2.hasNext()) {
                Iterator it3 = it2.next().a.iterator();
                while (it3.hasNext()) {
                    nVar.d.i((String) it3.next(), false);
                }
            }
        }
        t(-1);
        Object obj = this.v;
        if (obj instanceof mra) {
            ((mra) obj).k(this.q);
        }
        Object obj2 = this.v;
        if (obj2 instanceof iqa) {
            ((iqa) obj2).n(this.p);
        }
        Object obj3 = this.v;
        if (obj3 instanceof sqa) {
            ((sqa) obj3).g(this.r);
        }
        Object obj4 = this.v;
        if (obj4 instanceof wqa) {
            ((wqa) obj4).o(this.s);
        }
        Object obj5 = this.v;
        if ((obj5 instanceof co9) && this.x == null) {
            ((co9) obj5).m(this.t);
        }
        this.v = null;
        this.w = null;
        this.x = null;
        if (this.g != null) {
            this.h.e();
            this.g = null;
        }
        f9 f9Var = this.B;
        if (f9Var != null) {
            f9Var.b();
            this.C.b();
            this.D.b();
        }
    }

    public final void l(boolean z) {
        if (z && (this.v instanceof mra)) {
            h0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z) {
                    fragment.mChildFragmentManager.l(true);
                }
            }
        }
    }

    public final void m(boolean z, boolean z2) {
        if (z2 && (this.v instanceof sqa)) {
            h0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.m(z, true);
                }
            }
        }
    }

    public final void n() {
        for (Fragment fragment : this.c.e()) {
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.n();
            }
        }
    }

    public final boolean o(MenuItem menuItem) {
        if (this.u < 1) {
            return false;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void p(Menu menu) {
        if (this.u < 1) {
            return;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    public final void q(Fragment fragment) {
        if (fragment != null) {
            if (fragment.equals(this.c.b(fragment.mWho))) {
                fragment.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    public final void r(boolean z, boolean z2) {
        if (z2 && (this.v instanceof wqa)) {
            h0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.r(z, true);
                }
            }
        }
    }

    public final boolean s(Menu menu) {
        boolean z = false;
        if (this.u < 1) {
            return false;
        }
        for (Fragment fragment : this.c.f()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    public final void t(int i2) {
        try {
            this.b = true;
            for (androidx.fragment.app.m mVar : this.c.b.values()) {
                if (mVar != null) {
                    mVar.e = i2;
                }
            }
            P(i2, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((r) it.next()).e();
            }
            this.b = false;
            x(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.x;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.x)));
            sb.append("}");
        } else {
            cr5<?> cr5Var = this.v;
            if (cr5Var != null) {
                sb.append(cr5Var.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.v)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String strK = t40.k(str, "    ");
        androidx.fragment.app.n nVar = this.c;
        ArrayList<Fragment> arrayList = nVar.a;
        String strK2 = t40.k(str, "    ");
        HashMap<String, androidx.fragment.app.m> map = nVar.b;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (androidx.fragment.app.m mVar : map.values()) {
                printWriter.print(str);
                if (mVar != null) {
                    Fragment fragment = mVar.c;
                    printWriter.println(fragment);
                    fragment.dump(strK2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size3; i2++) {
                Fragment fragment2 = arrayList.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList<Fragment> arrayList2 = this.e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size2; i3++) {
                Fragment fragment3 = this.e.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        ArrayList<androidx.fragment.app.a> arrayList3 = this.d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size; i4++) {
                androidx.fragment.app.a aVar = this.d.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.k(strK, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.a) {
            try {
                int size4 = this.a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i5 = 0; i5 < size4; i5++) {
                        Object obj = (m) this.a.get(i5);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i5);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.w);
        if (this.x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.G);
        printWriter.print(" mStopped=");
        printWriter.print(this.H);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.I);
        if (this.F) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.F);
        }
    }

    public final void v(m mVar, boolean z) {
        if (!z) {
            if (this.v == null) {
                if (this.I) {
                    r6.g("FragmentManager has been destroyed");
                    return;
                } else {
                    r6.g("FragmentManager has not been attached to a host.");
                    return;
                }
            }
            if (O()) {
                r6.g("Can not perform this action after onSaveInstanceState");
                return;
            }
        }
        synchronized (this.a) {
            try {
                if (this.v == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.a.add(mVar);
                    a0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void w(boolean z) {
        if (this.b) {
            r6.g("FragmentManager is already executing transactions");
            return;
        }
        if (this.v == null) {
            if (this.I) {
                r6.g("FragmentManager has been destroyed");
                return;
            } else {
                r6.g("FragmentManager has not been attached to a host.");
                return;
            }
        }
        if (Looper.myLooper() != this.v.c.getLooper()) {
            r6.g("Must be called from main thread of fragment host");
            return;
        }
        if (!z && O()) {
            r6.g("Can not perform this action after onSaveInstanceState");
        } else if (this.K == null) {
            this.K = new ArrayList<>();
            this.L = new ArrayList<>();
        }
    }

    public final boolean x(boolean z) {
        boolean zA;
        ArrayList<m> arrayList;
        w(z);
        boolean z2 = false;
        while (true) {
            ArrayList<androidx.fragment.app.a> arrayList2 = this.K;
            ArrayList<Boolean> arrayList3 = this.L;
            synchronized (this.a) {
                if (this.a.isEmpty()) {
                    zA = false;
                } else {
                    try {
                        int size = this.a.size();
                        int i2 = 0;
                        zA = false;
                        while (true) {
                            arrayList = this.a;
                            if (i2 >= size) {
                                break;
                            }
                            zA |= arrayList.get(i2).a(arrayList2, arrayList3);
                            i2++;
                        }
                        arrayList.clear();
                        this.v.c.removeCallbacks(this.O);
                    } finally {
                    }
                }
            }
            if (!zA) {
                break;
            }
            z2 = true;
            this.b = true;
            try {
                W(this.K, this.L);
            } finally {
                d();
            }
        }
        j0();
        if (this.J) {
            this.J = false;
            g0();
        }
        this.c.b.values().removeAll(Collections.singleton(null));
        return z2;
    }

    public final void y(androidx.fragment.app.a aVar, boolean z) {
        if (z && (this.v == null || this.I)) {
            return;
        }
        w(z);
        aVar.a(this.K, this.L);
        this.b = true;
        try {
            W(this.K, this.L);
            d();
            j0();
            if (this.J) {
                this.J = false;
                g0();
            }
            this.c.b.values().removeAll(Collections.singleton(null));
        } catch (Throwable th) {
            d();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0228 A[PHI: r14
  0x0228: PHI (r14v14 int) = (r14v13 int), (r14v15 int) binds: [B:100:0x0218, B:105:0x0224] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(java.util.ArrayList<androidx.fragment.app.a> r24, java.util.ArrayList<java.lang.Boolean> r25, int r26, int r27) {
        /*
            Method dump skipped, instruction units count: 1364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.z(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }
}
