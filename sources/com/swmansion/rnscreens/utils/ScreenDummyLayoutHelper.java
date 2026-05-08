package com.swmansion.rnscreens.utils;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.facebook.jni.annotations.DoNotStrip;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.google.android.material.appbar.AppBarLayout;
import com.swmansion.rnscreens.f;
import defpackage.gu5;
import defpackage.h5;
import defpackage.it1;
import defpackage.j6g;
import defpackage.l5;
import defpackage.n7;
import defpackage.nn2;
import defpackage.o7;
import defpackage.pt1;
import defpackage.wl7;
import defpackage.zw;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@DoNotStrip
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\tJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "", "fontSize", "", "isTitleEmpty", "", "computeDummyLayout", "(IZ)F", "a", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScreenDummyLayoutHelper implements LifecycleEventListener {
    public static final a Y = new a();
    public static WeakReference<ScreenDummyLayoutHelper> Z = new WeakReference<>(null);
    public it1 V;
    public WeakReference<ReactApplicationContext> W;
    public volatile boolean X;
    public CoordinatorLayout a;
    public AppBarLayout b;
    public View c;
    public Toolbar d;
    public float e;
    public int f;

    public static final class a {
        @DoNotStrip
        public final ScreenDummyLayoutHelper getInstance() {
            return ScreenDummyLayoutHelper.Z.get();
        }
    }

    @DoNotStrip
    private final float computeDummyLayout(int fontSize, boolean isTitleEmpty) {
        if (!this.X && !b(c(new n7(9)))) {
            Log.e("ScreenDummyLayoutHelper", "[RNScreens] Failed to late-init layout while computing header height. This is most likely a race-condition-bug in react-native-screens, please file an issue at https://github.com/software-mansion/react-native-screens/issues");
            return 0.0f;
        }
        it1 it1Var = this.V;
        pt1 pt1Var = new pt1(fontSize, isTitleEmpty);
        it1Var.getClass();
        pt1 pt1Var2 = it1Var.a;
        if (pt1Var2.a != Integer.MIN_VALUE && pt1Var2.equals(pt1Var)) {
            return this.V.b;
        }
        Activity currentActivity = c(null).getCurrentActivity();
        if (currentActivity == null) {
            l5.q("[RNScreens] Attempt to use context detached from activity");
            return 0.0f;
        }
        View decorView = currentActivity.getWindow().getDecorView();
        decorView.getClass();
        int width = decorView.getWidth();
        int height = decorView.getHeight();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(width, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(height, 1073741824);
        Toolbar toolbar = this.d;
        if (isTitleEmpty) {
            if (toolbar == null) {
                wl7.g("toolbar");
                throw null;
            }
            toolbar.setTitle("");
            Toolbar toolbar2 = this.d;
            if (toolbar2 == null) {
                wl7.g("toolbar");
                throw null;
            }
            toolbar2.setContentInsetStartWithNavigation(0);
        } else {
            if (toolbar == null) {
                wl7.g("toolbar");
                throw null;
            }
            toolbar.setTitle("FontSize123!#$");
            Toolbar toolbar3 = this.d;
            if (toolbar3 == null) {
                wl7.g("toolbar");
                throw null;
            }
            toolbar3.setContentInsetStartWithNavigation(this.f);
        }
        int i = f.u0;
        Toolbar toolbar4 = this.d;
        if (toolbar4 == null) {
            wl7.g("toolbar");
            throw null;
        }
        TextView textViewA = f.a.a(toolbar4);
        if (textViewA != null) {
            textViewA.setTextSize(fontSize != -1 ? fontSize : this.e);
        }
        CoordinatorLayout coordinatorLayout = this.a;
        if (coordinatorLayout == null) {
            wl7.g("coordinatorLayout");
            throw null;
        }
        coordinatorLayout.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        CoordinatorLayout coordinatorLayout2 = this.a;
        if (coordinatorLayout2 == null) {
            wl7.g("coordinatorLayout");
            throw null;
        }
        coordinatorLayout2.layout(0, 0, width, height);
        if (this.b == null) {
            wl7.g("appBarLayout");
            throw null;
        }
        float fC = nn2.C(r1.getHeight());
        this.V = new it1(new pt1(fontSize, isTitleEmpty), fC);
        return fC;
    }

    @DoNotStrip
    public static final ScreenDummyLayoutHelper getInstance() {
        return Y.getInstance();
    }

    public final void a(Activity activity) {
        this.a = new CoordinatorLayout(activity, null);
        AppBarLayout appBarLayout = new AppBarLayout(activity, null);
        appBarLayout.setLayoutParams(new CoordinatorLayout.f(-1, -2));
        this.b = appBarLayout;
        Toolbar toolbar = new Toolbar(activity, null);
        toolbar.setTitle("FontSize123!#$");
        AppBarLayout.c cVar = new AppBarLayout.c();
        cVar.a = 0;
        toolbar.setLayoutParams(cVar);
        this.d = toolbar;
        int i = f.u0;
        TextView textViewA = f.a.a(toolbar);
        textViewA.getClass();
        this.e = textViewA.getTextSize();
        Toolbar toolbar2 = this.d;
        if (toolbar2 == null) {
            wl7.g("toolbar");
            throw null;
        }
        this.f = toolbar2.getContentInsetStartWithNavigation();
        AppBarLayout appBarLayout2 = this.b;
        if (appBarLayout2 == null) {
            wl7.g("appBarLayout");
            throw null;
        }
        Toolbar toolbar3 = this.d;
        if (toolbar3 == null) {
            wl7.g("toolbar");
            throw null;
        }
        appBarLayout2.addView(toolbar3);
        View view = new View(activity);
        view.setLayoutParams(new CoordinatorLayout.f(-1, -1));
        this.c = view;
        CoordinatorLayout coordinatorLayout = this.a;
        if (coordinatorLayout == null) {
            wl7.g("coordinatorLayout");
            throw null;
        }
        AppBarLayout appBarLayout3 = this.b;
        if (appBarLayout3 == null) {
            wl7.g("appBarLayout");
            throw null;
        }
        coordinatorLayout.addView(appBarLayout3);
        View view2 = this.c;
        if (view2 == null) {
            wl7.g("dummyContentView");
            throw null;
        }
        coordinatorLayout.addView(view2);
        this.X = true;
    }

    public final boolean b(ReactApplicationContext reactApplicationContext) {
        if (this.X) {
            return true;
        }
        if (!reactApplicationContext.hasCurrentActivity()) {
            return false;
        }
        Activity currentActivity = reactApplicationContext.getCurrentActivity();
        if (currentActivity == null) {
            l5.q("[RNScreens] Attempt to use context detached from activity. This could happen only due to race-condition.");
            return false;
        }
        synchronized (this) {
            if (this.X) {
                return true;
            }
            a(currentActivity);
            j6g j6gVar = j6g.a;
            return true;
        }
    }

    public final ReactApplicationContext c(gu5<? extends Object> gu5Var) {
        ReactApplicationContext reactApplicationContext = this.W.get();
        if (gu5Var == null) {
            gu5Var = new zw(21);
        }
        if (reactApplicationContext != null) {
            return reactApplicationContext;
        }
        h5.k(gu5Var.invoke());
        return null;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostDestroy() {
        ReactApplicationContext reactApplicationContext = this.W.get();
        if (reactApplicationContext != null) {
            reactApplicationContext.removeLifecycleEventListener(this);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostResume() {
        ReactApplicationContext reactApplicationContextC = c(new o7(14));
        if (b(reactApplicationContextC)) {
            reactApplicationContextC.removeLifecycleEventListener(this);
        } else {
            Log.w("ScreenDummyLayoutHelper", "[RNScreens] Failed to initialise dummy layout in onHostResume.");
        }
    }
}
