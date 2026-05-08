package androidx.activity;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.ComponentActivity;
import androidx.activity.result.IntentSenderRequest;
import com.indeed.android.jobsearch.R;
import defpackage.ald;
import defpackage.aw8;
import defpackage.bg2;
import defpackage.bld;
import defpackage.c9;
import defpackage.cg2;
import defpackage.cld;
import defpackage.co9;
import defpackage.d2f;
import defpackage.dg2;
import defpackage.dld;
import defpackage.do9;
import defpackage.dqa;
import defpackage.eld;
import defpackage.fu5;
import defpackage.grg;
import defpackage.gu5;
import defpackage.hab;
import defpackage.hg6;
import defpackage.hqa;
import defpackage.hr;
import defpackage.i50;
import defpackage.iqa;
import defpackage.irg;
import defpackage.jpf;
import defpackage.jrg;
import defpackage.k9;
import defpackage.kqa;
import defpackage.kv8;
import defpackage.ky1;
import defpackage.mj8;
import defpackage.mo9;
import defpackage.mra;
import defpackage.mt2;
import defpackage.n8;
import defpackage.o8;
import defpackage.ob0;
import defpackage.p63;
import defpackage.r6;
import defpackage.sqa;
import defpackage.sy3;
import defpackage.u2a;
import defpackage.u2d;
import defpackage.uv8;
import defpackage.vf2;
import defpackage.w7;
import defpackage.wf2;
import defpackage.wkd;
import defpackage.wl7;
import defpackage.wqa;
import defpackage.xf2;
import defpackage.y1a;
import defpackage.yq2;
import defpackage.z8;
import defpackage.zf2;
import defpackage.zv8;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\u00022\u00020\t2\u00020\n2\u00020\u00022\u00020\u000b2\u00020\f2\u00020\u00022\u00020\r2\u00020\u0002:\u0003\u0015\u0016\u0017B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Landroidx/activity/ComponentActivity;", "Ldg2;", "", "Lzv8;", "Ljrg;", "Lhg6;", "Ldld;", "Lhqa;", "Lk9;", "Liqa;", "Lmra;", "Lsqa;", "Lwqa;", "Lco9;", "<init>", "()V", "Landroid/view/View;", "view", "Lj6g;", "setContentView", "(Landroid/view/View;)V", "b", "c", "d", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class ComponentActivity extends dg2 implements jrg, hg6, dld, hqa, k9, iqa, mra, sqa, wqa, co9 {
    public static final /* synthetic */ int i0 = 0;
    public final d2f V;
    public final AtomicInteger W;
    public final e X;
    public final CopyOnWriteArrayList<yq2<Configuration>> Y;
    public final CopyOnWriteArrayList<yq2<Integer>> Z;
    public final CopyOnWriteArrayList<yq2<Intent>> a0;
    public final CopyOnWriteArrayList<yq2<y1a>> b0;
    public final CopyOnWriteArrayList<yq2<hab>> c0;
    public final bld d;
    public final CopyOnWriteArrayList<Runnable> d0;
    public irg e;
    public boolean e0;
    public final d f;
    public boolean f0;
    public final d2f g0;
    public final d2f h0;
    public final mt2 b = new mt2();
    public final do9 c = new do9(new ky1(this, 1));

    public static final class a implements uv8 {
        public a() {
        }

        @Override // defpackage.uv8
        public final void G(zv8 zv8Var, kv8.a aVar) {
            int i = ComponentActivity.i0;
            ComponentActivity componentActivity = ComponentActivity.this;
            if (componentActivity.e == null) {
                c cVar = (c) componentActivity.getLastNonConfigurationInstance();
                if (cVar != null) {
                    componentActivity.e = cVar.a;
                }
                if (componentActivity.e == null) {
                    componentActivity.e = new irg();
                }
            }
            componentActivity.a.c(this);
        }
    }

    public static final class b {
        public static OnBackInvokedDispatcher a(Activity activity) {
            activity.getClass();
            OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            return onBackInvokedDispatcher;
        }
    }

    public static final class c {
        public irg a;
    }

    public final class d implements Executor, ViewTreeObserver.OnDrawListener, Runnable {
        public final long a = SystemClock.uptimeMillis() + 10000;
        public Runnable b;
        public boolean c;

        public d() {
        }

        public final void a(View view) {
            if (this.c) {
                return;
            }
            this.c = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.getClass();
            this.b = runnable;
            View decorView = ComponentActivity.this.getWindow().getDecorView();
            decorView.getClass();
            if (!this.c) {
                decorView.postOnAnimation(new ob0(this, 1));
            } else if (wl7.b(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public final void onDraw() {
            boolean z;
            Runnable runnable = this.b;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.a) {
                    this.c = false;
                    ComponentActivity.this.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.b = null;
            fu5 fu5Var = (fu5) ComponentActivity.this.V.getValue();
            synchronized (fu5Var.a) {
                z = fu5Var.b;
            }
            if (z) {
                this.c = false;
                ComponentActivity.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    public static final class e extends c9 {
        public e() {
        }

        @Override // defpackage.c9
        public final void b(final int i, o8 o8Var, Object obj) {
            Bundle bundleExtra;
            int i2;
            o8Var.getClass();
            ComponentActivity componentActivity = ComponentActivity.this;
            final o8.a aVarB = o8Var.b(obj, componentActivity);
            if (aVarB != null) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: ag2
                    /* JADX WARN: Type inference incomplete: some casts might be missing */
                    @Override // java.lang.Runnable
                    public final void run() {
                        Serializable serializable = aVarB.a;
                        ComponentActivity.e eVar = this.a;
                        String str = (String) eVar.a.get(Integer.valueOf(i));
                        if (str == null) {
                            return;
                        }
                        c9.a aVar = (c9.a) eVar.e.get(str);
                        if ((aVar != null ? aVar.a : null) == null) {
                            eVar.g.remove(str);
                            eVar.f.put(str, serializable);
                            return;
                        }
                        n8<O> n8Var = aVar.a;
                        n8Var.getClass();
                        if (eVar.d.remove(str)) {
                            n8Var.c((O) serializable);
                        }
                    }
                });
                return;
            }
            Intent intentA = o8Var.a(obj, componentActivity);
            if (intentA.getExtras() != null) {
                Bundle extras = intentA.getExtras();
                extras.getClass();
                if (extras.getClassLoader() == null) {
                    intentA.setExtrasClassLoader(componentActivity.getClassLoader());
                }
            }
            if (intentA.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundleExtra = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            } else {
                bundleExtra = null;
            }
            Bundle bundle = bundleExtra;
            int i3 = 0;
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentA.getAction())) {
                String[] stringArrayExtra = intentA.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                w7.b(componentActivity, stringArrayExtra, i);
                return;
            }
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentA.getAction())) {
                componentActivity.startActivityForResult(intentA, i, bundle);
                return;
            }
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) intentA.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                intentSenderRequest.getClass();
                i2 = i;
            } catch (IntentSender.SendIntentException e) {
                e = e;
                i2 = i;
            }
            try {
                componentActivity.startIntentSenderForResult(intentSenderRequest.a, i2, intentSenderRequest.b, intentSenderRequest.c, intentSenderRequest.d, 0, bundle);
            } catch (IntentSender.SendIntentException e2) {
                e = e2;
                new Handler(Looper.getMainLooper()).post(new bg2(this, i2, i3, e));
            }
        }
    }

    public static final class f extends mj8 implements gu5<eld> {
        public f() {
            super(0);
        }

        @Override // defpackage.gu5
        public final eld invoke() {
            Application application = ComponentActivity.this.getApplication();
            ComponentActivity componentActivity = ComponentActivity.this;
            return new eld(application, componentActivity, componentActivity.getIntent() != null ? ComponentActivity.this.getIntent().getExtras() : null);
        }
    }

    public static final class g extends mj8 implements gu5<fu5> {
        public g() {
            super(0);
        }

        @Override // defpackage.gu5
        public final fu5 invoke() {
            ComponentActivity componentActivity = ComponentActivity.this;
            return new fu5(componentActivity.f, new androidx.activity.a(componentActivity));
        }
    }

    public static final class h extends mj8 implements gu5<dqa> {
        public h() {
            super(0);
        }

        @Override // defpackage.gu5
        public final dqa invoke() {
            dqa dqaVar = new dqa(new i50(ComponentActivity.this, 1));
            ComponentActivity componentActivity = ComponentActivity.this;
            if (Build.VERSION.SDK_INT >= 33) {
                if (!wl7.b(Looper.myLooper(), Looper.getMainLooper())) {
                    new Handler(Looper.getMainLooper()).post(new cg2(0, componentActivity, dqaVar));
                    return dqaVar;
                }
                int i = ComponentActivity.i0;
                componentActivity.a.a(new zf2(dqaVar, componentActivity));
            }
            return dqaVar;
        }
    }

    public ComponentActivity() {
        cld cldVar = new cld(this, new hr(this, 13));
        bld bldVar = new bld(cldVar);
        this.d = bldVar;
        this.f = new d();
        this.V = new d2f(new g());
        this.W = new AtomicInteger();
        this.X = new e();
        this.Y = new CopyOnWriteArrayList<>();
        this.Z = new CopyOnWriteArrayList<>();
        this.a0 = new CopyOnWriteArrayList<>();
        this.b0 = new CopyOnWriteArrayList<>();
        this.c0 = new CopyOnWriteArrayList<>();
        this.d0 = new CopyOnWriteArrayList<>();
        aw8 aw8Var = this.a;
        if (aw8Var == null) {
            r6.g("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
            throw null;
        }
        int i = 0;
        aw8Var.a(new vf2(this, i));
        this.a.a(new wf2(this, i));
        this.a.a(new a());
        cldVar.a();
        wkd.b(this);
        bldVar.b.c("android:support:activity-result", new xf2(this, i));
        q(new kqa() { // from class: yf2
            @Override // defpackage.kqa
            public final void a(ComponentActivity componentActivity) {
                int i2 = ComponentActivity.i0;
                componentActivity.getClass();
                ComponentActivity componentActivity2 = this.a;
                Bundle bundleA = componentActivity2.d.b.a("android:support:activity-result");
                if (bundleA != null) {
                    ComponentActivity.e eVar = componentActivity2.X;
                    LinkedHashMap linkedHashMap = eVar.b;
                    LinkedHashMap linkedHashMap2 = eVar.a;
                    Bundle bundle = eVar.g;
                    ArrayList<Integer> integerArrayList = bundleA.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList == null || integerArrayList == null) {
                        return;
                    }
                    ArrayList<String> stringArrayList2 = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                    if (stringArrayList2 != null) {
                        eVar.d.addAll(stringArrayList2);
                    }
                    Bundle bundle2 = bundleA.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                    if (bundle2 != null) {
                        bundle.putAll(bundle2);
                    }
                    int size = stringArrayList.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        String str = stringArrayList.get(i3);
                        if (linkedHashMap.containsKey(str)) {
                            Integer num = (Integer) linkedHashMap.remove(str);
                            if (!bundle.containsKey(str)) {
                                pxf.b(linkedHashMap2).remove(num);
                            }
                        }
                        Integer num2 = integerArrayList.get(i3);
                        num2.getClass();
                        int iIntValue = num2.intValue();
                        String str2 = stringArrayList.get(i3);
                        str2.getClass();
                        String str3 = str2;
                        linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                        eVar.b.put(str3, Integer.valueOf(iIntValue));
                    }
                }
            }
        });
        this.g0 = new d2f(new f());
        this.h0 = new d2f(new h());
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        s();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.f.a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.co9
    public final void b(mo9 mo9Var) {
        mo9Var.getClass();
        do9 do9Var = this.c;
        do9Var.b.add(mo9Var);
        do9Var.a.run();
    }

    @Override // defpackage.wqa
    public final void c(yq2<hab> yq2Var) {
        yq2Var.getClass();
        this.c0.add(yq2Var);
    }

    @Override // defpackage.k9
    public final c9 d() {
        return this.X;
    }

    @Override // defpackage.iqa
    public final void f(yq2<Configuration> yq2Var) {
        yq2Var.getClass();
        this.Y.add(yq2Var);
    }

    @Override // defpackage.sqa
    public final void g(yq2<y1a> yq2Var) {
        yq2Var.getClass();
        this.b0.remove(yq2Var);
    }

    @Override // defpackage.hg6
    public final p63 getDefaultViewModelCreationExtras() {
        u2a u2aVar = new u2a((Object) null);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = u2aVar.a;
        if (application != null) {
            Application application2 = getApplication();
            application2.getClass();
            linkedHashMap.put(grg.a.d, application2);
        }
        linkedHashMap.put(wkd.a, this);
        linkedHashMap.put(wkd.b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(wkd.c, extras);
        }
        return u2aVar;
    }

    @Override // defpackage.hg6
    public final grg.c getDefaultViewModelProviderFactory() {
        return (grg.c) this.g0.getValue();
    }

    @Override // defpackage.dg2, defpackage.zv8
    public final kv8 getLifecycle() {
        return this.a;
    }

    @Override // defpackage.dld
    public final ald getSavedStateRegistry() {
        return this.d.b;
    }

    @Override // defpackage.jrg
    public final irg getViewModelStore() {
        if (getApplication() == null) {
            r6.g("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        if (this.e == null) {
            c cVar = (c) getLastNonConfigurationInstance();
            if (cVar != null) {
                this.e = cVar.a;
            }
            if (this.e == null) {
                this.e = new irg();
            }
        }
        irg irgVar = this.e;
        irgVar.getClass();
        return irgVar;
    }

    @Override // defpackage.sqa
    public final void i(yq2<y1a> yq2Var) {
        yq2Var.getClass();
        this.b0.add(yq2Var);
    }

    @Override // defpackage.mra
    public final void j(yq2<Integer> yq2Var) {
        yq2Var.getClass();
        this.Z.add(yq2Var);
    }

    @Override // defpackage.mra
    public final void k(yq2<Integer> yq2Var) {
        yq2Var.getClass();
        this.Z.remove(yq2Var);
    }

    @Override // defpackage.co9
    public final void m(mo9 mo9Var) {
        mo9Var.getClass();
        do9 do9Var = this.c;
        do9Var.b.remove(mo9Var);
        if (((do9.a) do9Var.c.remove(mo9Var)) != null) {
            throw null;
        }
        do9Var.a.run();
    }

    @Override // defpackage.iqa
    public final void n(yq2<Configuration> yq2Var) {
        yq2Var.getClass();
        this.Y.remove(yq2Var);
    }

    @Override // defpackage.wqa
    public final void o(yq2<hab> yq2Var) {
        yq2Var.getClass();
        this.c0.remove(yq2Var);
    }

    @Override // android.app.Activity
    @sy3
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.X.a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    @sy3
    public void onBackPressed() {
        r().d();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator<yq2<Configuration>> it = this.Y.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // defpackage.dg2, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.d.a(bundle);
        mt2 mt2Var = this.b;
        mt2Var.getClass();
        mt2Var.b = this;
        Iterator it = mt2Var.a.iterator();
        while (it.hasNext()) {
            ((kqa) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i = u2d.b;
        u2d.a.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        MenuInflater menuInflater = getMenuInflater();
        Iterator<mo9> it = this.c.b.iterator();
        while (it.hasNext()) {
            it.next().d(menu, menuInflater);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        menuItem.getClass();
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            Iterator<mo9> it = this.c.b.iterator();
            while (it.hasNext()) {
                if (it.next().c(menuItem)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.e0 = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.e0 = false;
            Iterator<yq2<y1a>> it = this.b0.iterator();
            while (it.hasNext()) {
                it.next().accept(new y1a(z));
            }
        } catch (Throwable th) {
            this.e0 = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator<yq2<Intent>> it = this.a0.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        menu.getClass();
        Iterator<mo9> it = this.c.b.iterator();
        while (it.hasNext()) {
            it.next().a(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.f0 = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.f0 = false;
            Iterator<yq2<hab>> it = this.c0.iterator();
            while (it.hasNext()) {
                it.next().accept(new hab(z));
            }
        } catch (Throwable th) {
            this.f0 = false;
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator<mo9> it = this.c.b.iterator();
        while (it.hasNext()) {
            it.next().b(menu);
        }
        return true;
    }

    @Override // android.app.Activity
    @sy3
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (this.X.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        c cVar;
        irg irgVar = this.e;
        if (irgVar == null && (cVar = (c) getLastNonConfigurationInstance()) != null) {
            irgVar = cVar.a;
        }
        if (irgVar == null) {
            return null;
        }
        c cVar2 = new c();
        cVar2.a = irgVar;
        return cVar2;
    }

    @Override // defpackage.dg2, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        aw8 aw8Var = this.a;
        if (aw8Var != null) {
            aw8Var.h(kv8.b.c);
        }
        super.onSaveInstanceState(bundle);
        this.d.b(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<yq2<Integer>> it = this.Z.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.d0.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public final void q(kqa kqaVar) {
        mt2 mt2Var = this.b;
        mt2Var.getClass();
        ComponentActivity componentActivity = mt2Var.b;
        if (componentActivity != null) {
            kqaVar.a(componentActivity);
        }
        mt2Var.a.add(kqaVar);
    }

    @Override // defpackage.hqa
    public final dqa r() {
        return (dqa) this.h0.getValue();
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (jpf.f()) {
                Trace.beginSection(jpf.g("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            ((fu5) this.V.getValue()).a();
        } finally {
            Trace.endSection();
        }
    }

    public final void s() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(R.id.report_drawn, this);
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        s();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.f.a(decorView);
        super.setContentView(i);
    }

    @Override // android.app.Activity
    @sy3
    public final void startActivityForResult(Intent intent, int i) {
        intent.getClass();
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @sy3
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public final <I, O> z8<I> t(o8<I, O> o8Var, n8<O> n8Var) {
        e eVar = this.X;
        eVar.getClass();
        return eVar.c("activity_rq#" + this.W.getAndIncrement(), this, o8Var, n8Var);
    }

    @Override // android.app.Activity
    @sy3
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        intent.getClass();
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @sy3
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        s();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.f.a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        s();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.f.a(decorView);
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    @sy3
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.e0) {
            return;
        }
        Iterator<yq2<y1a>> it = this.b0.iterator();
        while (it.hasNext()) {
            it.next().accept(new y1a(z));
        }
    }

    @Override // android.app.Activity
    @sy3
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.f0) {
            return;
        }
        Iterator<yq2<hab>> it = this.c0.iterator();
        while (it.hasNext()) {
            it.next().accept(new hab(z));
        }
    }
}
