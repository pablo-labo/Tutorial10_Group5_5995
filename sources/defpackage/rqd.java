package defpackage;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.g;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.swmansion.rnscreens.d;
import com.swmansion.rnscreens.e;
import com.swmansion.rnscreens.h;
import defpackage.rqd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lrqd;", "Landroidx/fragment/app/Fragment;", "Lsqd;", "<init>", "()V", "a", "b", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class rqd extends Fragment implements sqd {
    public boolean V;
    public final com.swmansion.rnscreens.a a;
    public final ArrayList b;
    public boolean c;
    public float d;
    public boolean e;
    public boolean f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final /* synthetic */ a[] e;

        static {
            a aVar = new a("DID_APPEAR", 0);
            a = aVar;
            a aVar2 = new a("WILL_APPEAR", 1);
            b = aVar2;
            a aVar3 = new a("DID_DISAPPEAR", 2);
            c = aVar3;
            a aVar4 = new a("WILL_DISAPPEAR", 3);
            d = aVar4;
            e = new a[]{aVar, aVar2, aVar3, aVar4};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) e.clone();
        }
    }

    public static final class b extends FrameLayout {
        @Override // android.view.ViewGroup, android.view.View
        public final void clearFocus() {
            if (getVisibility() != 4) {
                super.clearFocus();
            }
        }
    }

    public rqd() {
        this.b = new ArrayList();
        this.d = -1.0f;
        this.e = true;
        this.f = true;
        throw new IllegalStateException("Screen fragments should never be restored. Follow instructions from https://github.com/software-mansion/react-native-screens/issues/17#issuecomment-424704067 to properly configure your main activity.");
    }

    public final void D() {
        Context context = l().getContext();
        context.getClass();
        ReactContext reactContext = (ReactContext) context;
        int iG = dmc.g(reactContext);
        EventDispatcher eventDispatcherE = dmc.e(reactContext, l().getId());
        if (eventDispatcherE != null) {
            eventDispatcherE.a(new rg6(iG, l().getId(), 0));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E(rqd.a r8, defpackage.sqd r9) {
        /*
            r7 = this;
            rqd r0 = r9.g()
            boolean r1 = r0 instanceof com.swmansion.rnscreens.e
            if (r1 == 0) goto L96
            com.swmansion.rnscreens.e r0 = (com.swmansion.rnscreens.e) r0
            int r1 = r8.ordinal()
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L2e
            if (r1 == r5) goto L2b
            if (r1 == r4) goto L26
            if (r1 != r3) goto L22
            boolean r1 = r0.e
            if (r1 != 0) goto L20
        L1e:
            r1 = r5
            goto L30
        L20:
            r1 = r2
            goto L30
        L22:
            defpackage.l.g()
            return
        L26:
            boolean r1 = r0.f
            if (r1 != 0) goto L20
            goto L1e
        L2b:
            boolean r1 = r0.e
            goto L30
        L2e:
            boolean r1 = r0.f
        L30:
            if (r1 == 0) goto L96
            com.swmansion.rnscreens.a r0 = r0.l()
            r9.s(r8)
            int r1 = defpackage.dmc.h(r0)
            int r6 = r8.ordinal()
            if (r6 == 0) goto L6c
            if (r6 == r5) goto L62
            if (r6 == r4) goto L57
            if (r6 != r3) goto L53
            kqd r2 = new kqd
            int r0 = r0.getId()
            r2.<init>(r1, r0, r5)
            goto L75
        L53:
            defpackage.l.g()
            return
        L57:
            kqd r3 = new kqd
            int r0 = r0.getId()
            r3.<init>(r1, r0, r2)
            r2 = r3
            goto L75
        L62:
            erd r2 = new erd
            int r0 = r0.getId()
            r2.<init>(r1, r0)
            goto L75
        L6c:
            fqd r2 = new fqd
            int r0 = r0.getId()
            r2.<init>(r1, r0)
        L75:
            com.swmansion.rnscreens.a r0 = r7.l()
            android.content.Context r0 = r0.getContext()
            r0.getClass()
            com.facebook.react.bridge.ReactContext r0 = (com.facebook.react.bridge.ReactContext) r0
            com.swmansion.rnscreens.a r7 = r7.l()
            int r7 = r7.getId()
            com.facebook.react.uimanager.events.EventDispatcher r7 = defpackage.dmc.e(r0, r7)
            if (r7 == 0) goto L93
            r7.a(r2)
        L93:
            r9.k(r8)
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rqd.E(rqd$a, sqd):void");
    }

    public final void F(float f, boolean z) {
        if (!(this instanceof e) || this.d == f) {
            return;
        }
        float fMax = Math.max(0.0f, Math.min(1.0f, f));
        this.d = fMax;
        short s = (short) (fMax == 0.0f ? 1 : fMax == 1.0f ? 2 : 3);
        e eVar = (e) this;
        com.swmansion.rnscreens.b container = eVar.l().getContainer();
        boolean goingForward = container instanceof d ? ((d) container).getGoingForward() : false;
        Context context = eVar.l().getContext();
        context.getClass();
        ReactContext reactContext = (ReactContext) context;
        EventDispatcher eventDispatcherE = dmc.e(reactContext, eVar.l().getId());
        if (eventDispatcherE != null) {
            eventDispatcherE.a(new crd(dmc.g(reactContext), eVar.l().getId(), this.d, z, goingForward, s));
        }
    }

    public final void G(final boolean z) {
        this.V = !z;
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null || ((parentFragment instanceof rqd) && !((rqd) parentFragment).V)) {
            if (isResumed()) {
                UiThreadUtil.runOnUiThread(new Runnable() { // from class: qqd
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z2 = z;
                        rqd rqdVar = this;
                        if (z2) {
                            rqdVar.E(rqd.a.a, rqdVar);
                            rqdVar.F(1.0f, false);
                        } else {
                            rqdVar.E(rqd.a.b, rqdVar);
                            rqdVar.F(0.0f, false);
                        }
                    }
                });
            } else if (z) {
                E(a.c, this);
                F(1.0f, true);
            } else {
                E(a.d, this);
                F(0.0f, true);
            }
        }
    }

    public boolean b() {
        return false;
    }

    @Override // defpackage.sqd
    public final Activity f() {
        Fragment fragment;
        g activity;
        g activity2 = getActivity();
        if (activity2 != null) {
            return activity2;
        }
        Context context = l().getContext();
        if (context instanceof ReactContext) {
            ReactContext reactContext = (ReactContext) context;
            if (reactContext.getCurrentActivity() != null) {
                return reactContext.getCurrentActivity();
            }
        }
        for (ViewParent container = l().getContainer(); container != null; container = container.getParent()) {
            if ((container instanceof com.swmansion.rnscreens.a) && (fragment = ((com.swmansion.rnscreens.a) container).getFragment()) != null && (activity = fragment.getActivity()) != null) {
                return activity;
            }
        }
        return null;
    }

    @Override // defpackage.sqd
    public final rqd g() {
        return this;
    }

    @Override // defpackage.mqd
    public final void k(a aVar) {
        sqd fragmentWrapper;
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.b) {
            if (((com.swmansion.rnscreens.b) obj).getScreenCount() > 0) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.swmansion.rnscreens.a topScreen = ((com.swmansion.rnscreens.b) it.next()).getTopScreen();
            if (topScreen != null && (fragmentWrapper = topScreen.getFragmentWrapper()) != null) {
                E(aVar, fragmentWrapper);
            }
        }
    }

    @Override // defpackage.sqd
    public final com.swmansion.rnscreens.a l() {
        com.swmansion.rnscreens.a aVar = this.a;
        if (aVar != null) {
            return aVar;
        }
        wl7.g("screen");
        throw null;
    }

    @Override // defpackage.sqd
    public final List<com.swmansion.rnscreens.b> n() {
        return this.b;
    }

    @Override // defpackage.sqd
    public final void o(com.swmansion.rnscreens.b bVar) {
        this.b.add(bVar);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        l().setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Context context = getContext();
        if (context == null) {
            return null;
        }
        b bVar = new b(context);
        com.swmansion.rnscreens.a aVarL = l();
        hh2.B(aVarL);
        bVar.addView(aVarL);
        return bVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        com.swmansion.rnscreens.b container = l().getContainer();
        if (container == null || !container.c(l().getFragmentWrapper())) {
            Context context = l().getContext();
            if (context instanceof ReactContext) {
                int iG = dmc.g(context);
                EventDispatcher eventDispatcherE = dmc.e((ReactContext) context, l().getId());
                if (eventDispatcherE != null) {
                    eventDispatcherE.a(new ql5(iG, l().getId(), 1));
                }
            }
        }
        this.b.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.c) {
            this.c = false;
            h.k(l(), f(), w());
        }
    }

    public void p() {
        g activity = getActivity();
        if (activity == null) {
            this.c = true;
        } else {
            h.k(l(), activity, w());
        }
    }

    @Override // defpackage.mqd
    public final void s(a aVar) {
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 0) {
            this.f = false;
            return;
        }
        if (iOrdinal == 1) {
            this.e = false;
            return;
        }
        if (iOrdinal == 2) {
            this.f = true;
        } else if (iOrdinal == 3) {
            this.e = true;
        } else {
            l.g();
        }
    }

    @Override // defpackage.sqd
    public final void t(com.swmansion.rnscreens.b bVar) {
        this.b.remove(bVar);
    }

    @Override // defpackage.sqd
    public final ReactContext w() {
        if (getContext() instanceof ReactContext) {
            Context context = getContext();
            context.getClass();
            return (ReactContext) context;
        }
        if (l().getContext() instanceof ReactContext) {
            Context context2 = l().getContext();
            context2.getClass();
            return (ReactContext) context2;
        }
        for (ViewParent container = l().getContainer(); container != null; container = container.getParent()) {
            if (container instanceof com.swmansion.rnscreens.a) {
                com.swmansion.rnscreens.a aVar = (com.swmansion.rnscreens.a) container;
                if (aVar.getContext() instanceof ReactContext) {
                    Context context3 = aVar.getContext();
                    context3.getClass();
                    return (ReactContext) context3;
                }
            }
        }
        return null;
    }

    @SuppressLint({"ValidFragment"})
    public rqd(com.swmansion.rnscreens.a aVar) {
        aVar.getClass();
        this.b = new ArrayList();
        this.d = -1.0f;
        this.e = true;
        this.f = true;
        this.a = aVar;
    }
}
