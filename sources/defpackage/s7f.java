package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.view.Choreographer;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.facebook.react.modules.core.a;
import com.indeed.android.jobsearch.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class s7f extends LinearLayout implements c7f {
    public static final /* synthetic */ qf8<Object>[] s0;
    public FragmentManager V;
    public final ArrayList W;
    public final mkf a;
    public Integer a0;
    public final a b;
    public boolean b0;
    public final fu2 c;
    public final u7f c0;
    public final bk1 d;
    public final g d0;
    public final FrameLayout e;
    public final h e0;
    public v7f f;
    public final i f0;
    public final j g0;
    public final k h0;
    public final l i0;
    public final m j0;
    public final n k0;
    public final o l0;
    public final b m0;
    public final c n0;
    public final d o0;
    public final e p0;
    public final f q0;
    public final r7f r0;

    public final class a {
        public boolean a;
        public boolean b;
        public boolean c;

        public a() {
        }

        public final void a() {
            this.b = true;
            this.c = true;
        }

        public final void b() {
            if (this.a) {
                return;
            }
            this.a = true;
            s7f.this.post(new bp4(this, 3));
        }
    }

    public static final class b extends zna<Float> {
        public b() {
            super(null);
        }

        @Override // defpackage.zna
        public final void a(qf8<?> qf8Var, Float f, Float f2) {
            qf8Var.getClass();
            s7f s7fVar = s7f.this;
            s7f.f(s7fVar, f, f2);
        }
    }

    public static final class c extends zna<String> {
        public c() {
            super(null);
        }

        @Override // defpackage.zna
        public final void a(qf8<?> qf8Var, String str, String str2) {
            qf8Var.getClass();
            s7f s7fVar = s7f.this;
            s7f.f(s7fVar, str, str2);
        }
    }

    public static final class d extends zna<String> {
        public d() {
            super(null);
        }

        @Override // defpackage.zna
        public final void a(qf8<?> qf8Var, String str, String str2) {
            qf8Var.getClass();
            s7f s7fVar = s7f.this;
            s7f.f(s7fVar, str, str2);
        }
    }

    public static final class e extends zna<Integer> {
        public e() {
            super(null);
        }

        @Override // defpackage.zna
        public final void a(qf8<?> qf8Var, Integer num, Integer num2) {
            qf8Var.getClass();
            s7f s7fVar = s7f.this;
            s7f.f(s7fVar, num, num2);
        }
    }

    public static final class f extends zna<String> {
        public f() {
            super(null);
        }

        @Override // defpackage.zna
        public final void a(qf8<?> qf8Var, String str, String str2) {
            qf8Var.getClass();
            s7f s7fVar = s7f.this;
            s7f.f(s7fVar, str, str2);
        }
    }

    public static final class g extends zna<Integer> {
        public g() {
            super(null);
        }

        @Override // defpackage.zna
        public final void a(qf8<?> qf8Var, Integer num, Integer num2) {
            qf8Var.getClass();
            s7f s7fVar = s7f.this;
            s7f.f(s7fVar, num, num2);
        }
    }

    public static final class h extends zna<Integer> {
        public h() {
            super(null);
        }

        @Override // defpackage.zna
        public final void a(qf8<?> qf8Var, Integer num, Integer num2) {
            qf8Var.getClass();
            s7f s7fVar = s7f.this;
            s7f.f(s7fVar, num, num2);
        }
    }

    public static final class i extends zna<Boolean> {
        public final /* synthetic */ s7f b;

        /* JADX WARN: Illegal instructions before constructor call */
        public i(s7f s7fVar) {
            Boolean bool = Boolean.TRUE;
            this.b = s7fVar;
            super(bool);
        }

        @Override // defpackage.zna
        public final void a(qf8<?> qf8Var, Boolean bool, Boolean bool2) {
            qf8Var.getClass();
            Boolean bool3 = bool2;
            bool3.getClass();
            Boolean bool4 = bool;
            bool4.getClass();
            s7f.f(this.b, bool4, bool3);
        }
    }

    public static final class j extends zna<Integer> {
        public j() {
            super(null);
        }

        @Override // defpackage.zna
        public final void a(qf8<?> qf8Var, Integer num, Integer num2) {
            qf8Var.getClass();
            s7f s7fVar = s7f.this;
            s7f.f(s7fVar, num, num2);
        }
    }

    public static final class k extends zna<String> {
        public k() {
            super(null);
        }

        @Override // defpackage.zna
        public final void a(qf8<?> qf8Var, String str, String str2) {
            qf8Var.getClass();
            s7f s7fVar = s7f.this;
            s7f.f(s7fVar, str, str2);
        }
    }

    public static final class l extends zna<Integer> {
        public l() {
            super(null);
        }

        @Override // defpackage.zna
        public final void a(qf8<?> qf8Var, Integer num, Integer num2) {
            qf8Var.getClass();
            s7f s7fVar = s7f.this;
            s7f.f(s7fVar, num, num2);
        }
    }

    public static final class m extends zna<Integer> {
        public m() {
            super(null);
        }

        @Override // defpackage.zna
        public final void a(qf8<?> qf8Var, Integer num, Integer num2) {
            qf8Var.getClass();
            s7f s7fVar = s7f.this;
            s7f.f(s7fVar, num, num2);
        }
    }

    public static final class n extends zna<Integer> {
        public n() {
            super(null);
        }

        @Override // defpackage.zna
        public final void a(qf8<?> qf8Var, Integer num, Integer num2) {
            qf8Var.getClass();
            s7f s7fVar = s7f.this;
            s7f.f(s7fVar, num, num2);
        }
    }

    public static final class o extends zna<Float> {
        public o() {
            super(null);
        }

        @Override // defpackage.zna
        public final void a(qf8<?> qf8Var, Float f, Float f2) {
            qf8Var.getClass();
            s7f s7fVar = s7f.this;
            s7f.f(s7fVar, f, f2);
        }
    }

    static {
        w3a w3aVar = new w3a(s7f.class, "tabBarBackgroundColor", "getTabBarBackgroundColor()Ljava/lang/Integer;", 0);
        iwc iwcVar = fwc.a;
        s0 = new qf8[]{iwcVar.e(w3aVar), r40.b(s7f.class, "tabBarItemActiveIndicatorColor", "getTabBarItemActiveIndicatorColor()Ljava/lang/Integer;", 0, iwcVar), r40.b(s7f.class, "isTabBarItemActiveIndicatorEnabled", "isTabBarItemActiveIndicatorEnabled()Z", 0, iwcVar), r40.b(s7f.class, "tabBarItemIconColor", "getTabBarItemIconColor()Ljava/lang/Integer;", 0, iwcVar), r40.b(s7f.class, "tabBarItemTitleFontFamily", "getTabBarItemTitleFontFamily()Ljava/lang/String;", 0, iwcVar), r40.b(s7f.class, "tabBarItemIconColorActive", "getTabBarItemIconColorActive()Ljava/lang/Integer;", 0, iwcVar), r40.b(s7f.class, "tabBarItemTitleFontColor", "getTabBarItemTitleFontColor()Ljava/lang/Integer;", 0, iwcVar), r40.b(s7f.class, "tabBarItemTitleFontColorActive", "getTabBarItemTitleFontColorActive()Ljava/lang/Integer;", 0, iwcVar), r40.b(s7f.class, "tabBarItemTitleFontSize", "getTabBarItemTitleFontSize()Ljava/lang/Float;", 0, iwcVar), r40.b(s7f.class, "tabBarItemTitleFontSizeActive", "getTabBarItemTitleFontSizeActive()Ljava/lang/Float;", 0, iwcVar), r40.b(s7f.class, "tabBarItemTitleFontWeight", "getTabBarItemTitleFontWeight()Ljava/lang/String;", 0, iwcVar), r40.b(s7f.class, "tabBarItemTitleFontStyle", "getTabBarItemTitleFontStyle()Ljava/lang/String;", 0, iwcVar), r40.b(s7f.class, "tabBarItemRippleColor", "getTabBarItemRippleColor()Ljava/lang/Integer;", 0, iwcVar), r40.b(s7f.class, "tabBarItemLabelVisibilityMode", "getTabBarItemLabelVisibilityMode()Ljava/lang/String;", 0, iwcVar)};
    }

    /* JADX WARN: Type inference failed for: r10v21, types: [r7f] */
    public s7f(mkf mkfVar) {
        super(mkfVar);
        this.a = mkfVar;
        this.b = new a();
        fu2 fu2Var = new fu2(mkfVar, R.style.Theme_Material3_DayNight_NoActionBar);
        this.c = fu2Var;
        bk1 bk1Var = new bk1(fu2Var);
        Context context = bk1Var.getContext();
        jkf.a(context, null, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView);
        int[] iArr = lac.d;
        jkf.b(context, null, iArr, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, iArr, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView);
        bk1Var.setItemHorizontalTranslationEnabled(typedArrayObtainStyledAttributes.getBoolean(1, true));
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            bk1Var.setMinimumHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        gsg.a(bk1Var, new ak1());
        bk1Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.d = bk1Var;
        FrameLayout frameLayout = new FrameLayout(mkfVar);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 1.0f;
        frameLayout.setLayoutParams(layoutParams);
        iha ihaVar = dqg.a;
        iha ihaVar2 = dqg.a;
        int i2 = ihaVar2.a;
        int i3 = i2 + 2;
        ihaVar2.a = i3;
        if (i3 % 10 == 1) {
            ihaVar2.a = i2 + 4;
        }
        frameLayout.setId(i2);
        this.e = frameLayout;
        ArrayList arrayList = new ArrayList();
        this.W = arrayList;
        this.c0 = new u7f(fu2Var, bk1Var, arrayList);
        this.d0 = new g();
        this.e0 = new h();
        this.f0 = new i(this);
        this.g0 = new j();
        this.h0 = new k();
        this.i0 = new l();
        this.j0 = new m();
        this.k0 = new n();
        this.l0 = new o();
        this.m0 = new b();
        this.n0 = new c();
        this.o0 = new d();
        this.p0 = new e();
        this.q0 = new f();
        setOrientation(1);
        addView(frameLayout);
        addView(bk1Var);
        bk1Var.addOnLayoutChangeListener(new q7f());
        bk1Var.setOnItemSelectedListener(new r20(this, 11));
        this.r0 = new Choreographer.FrameCallback() { // from class: r7f
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j2) {
                s7f s7fVar = this.a;
                s7fVar.b0 = false;
                s7fVar.measure(View.MeasureSpec.makeMeasureSpec(s7fVar.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(s7fVar.getHeight(), 1073741824));
                s7fVar.layout(s7fVar.getLeft(), s7fVar.getTop(), s7fVar.getRight(), s7fVar.getBottom());
            }
        };
    }

    public static final void e(s7f s7fVar) {
        s7fVar.c0.a(s7fVar);
        bk1 bk1Var = s7fVar.d;
        Integer selectedTabScreenFragmentId = s7fVar.getSelectedTabScreenFragmentId();
        if (selectedTabScreenFragmentId == null) {
            r6.g("[RNScreens] A single selected tab must be present");
        } else {
            bk1Var.setSelectedItemId(selectedTabScreenFragmentId.intValue());
            s7fVar.post(new pn0(s7fVar, 4));
        }
    }

    public static final void f(s7f s7fVar, Object obj, Object obj2) {
        s7fVar.getClass();
        if (wl7.b(obj2, obj)) {
            return;
        }
        a aVar = s7fVar.b;
        aVar.c = true;
        aVar.b();
    }

    public static final void g(s7f s7fVar) {
        Object next;
        Iterator it = s7fVar.W.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((f7f) next).a.c0) {
                    break;
                }
            }
        }
        if (next == null) {
            r6.g("[RNScreens] No focused tab present");
            return;
        }
        f7f f7fVar = (f7f) next;
        if (s7fVar.getRequireFragmentManager().c.f().size() > 1) {
            r6.g("[RNScreens] There can be only a single focused tab");
            return;
        }
        List<Fragment> listF = s7fVar.getRequireFragmentManager().c.f();
        listF.getClass();
        Fragment fragment = (Fragment) z92.Q0(listF);
        if (f7fVar == fragment) {
            return;
        }
        FragmentManager requireFragmentManager = s7fVar.getRequireFragmentManager();
        requireFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(requireFragmentManager);
        aVar.p = true;
        if (fragment != null) {
            aVar.l(fragment);
        }
        aVar.d(s7fVar.e.getId(), f7fVar, null, 1);
        aVar.j();
    }

    private final FragmentManager getRequireFragmentManager() {
        FragmentManager fragmentManager = this.V;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        r6.g("[RNScreens] Nullish fragment manager");
        return null;
    }

    private final Integer getSelectedTabScreenFragmentId() {
        ArrayList arrayList = this.W;
        if (arrayList.isEmpty()) {
            return null;
        }
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (((f7f) it.next()).a.c0) {
                break;
            }
            i2++;
        }
        return Integer.valueOf(i2);
    }

    @Override // defpackage.c7f
    public final void a(b7f b7fVar, Configuration configuration) {
        b7fVar.getClass();
        onConfigurationChanged(configuration);
    }

    @Override // defpackage.c7f
    public final void b(b7f b7fVar) {
        Iterator it = this.W.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (((f7f) it.next()).a == b7fVar) {
                break;
            } else {
                i2++;
            }
        }
        Integer numValueOf = Integer.valueOf(i2);
        MenuItem menuItemFindItem = null;
        if (i2 == -1) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            menuItemFindItem = this.d.getMenu().findItem(numValueOf.intValue());
        }
        if (menuItemFindItem != null) {
            u7f u7fVar = this.c0;
            u7fVar.getClass();
            t7f t7fVar = u7fVar.c;
            t7fVar.getClass();
            menuItemFindItem.setTitle(b7fVar.getTabTitle());
            menuItemFindItem.setIcon(b7fVar.getIcon());
            t7fVar.b(menuItemFindItem, b7fVar);
        }
    }

    @Override // defpackage.c7f
    public final void c(b7f b7fVar) {
        a aVar = this.b;
        aVar.a();
        aVar.b();
    }

    @Override // defpackage.c7f
    public final f7f d(b7f b7fVar) {
        Object next;
        Iterator it = this.W.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((f7f) next).a == b7fVar) {
                break;
            }
        }
        return (f7f) next;
    }

    public final v7f getEventEmitter$react_native_screens_release() {
        v7f v7fVar = this.f;
        if (v7fVar != null) {
            return v7fVar;
        }
        wl7.g("eventEmitter");
        throw null;
    }

    public final mkf getReactContext() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Integer getTabBarBackgroundColor() {
        qf8<Object> qf8Var = s0[0];
        g gVar = this.d0;
        gVar.getClass();
        qf8Var.getClass();
        return (Integer) gVar.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Integer getTabBarItemActiveIndicatorColor() {
        qf8<Object> qf8Var = s0[1];
        h hVar = this.e0;
        hVar.getClass();
        qf8Var.getClass();
        return (Integer) hVar.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Integer getTabBarItemIconColor() {
        qf8<Object> qf8Var = s0[3];
        j jVar = this.g0;
        jVar.getClass();
        qf8Var.getClass();
        return (Integer) jVar.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Integer getTabBarItemIconColorActive() {
        qf8<Object> qf8Var = s0[5];
        l lVar = this.i0;
        lVar.getClass();
        qf8Var.getClass();
        return (Integer) lVar.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getTabBarItemLabelVisibilityMode() {
        qf8<Object> qf8Var = s0[13];
        f fVar = this.q0;
        fVar.getClass();
        qf8Var.getClass();
        return (String) fVar.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Integer getTabBarItemRippleColor() {
        qf8<Object> qf8Var = s0[12];
        e eVar = this.p0;
        eVar.getClass();
        qf8Var.getClass();
        return (Integer) eVar.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Integer getTabBarItemTitleFontColor() {
        qf8<Object> qf8Var = s0[6];
        m mVar = this.j0;
        mVar.getClass();
        qf8Var.getClass();
        return (Integer) mVar.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Integer getTabBarItemTitleFontColorActive() {
        qf8<Object> qf8Var = s0[7];
        n nVar = this.k0;
        nVar.getClass();
        qf8Var.getClass();
        return (Integer) nVar.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getTabBarItemTitleFontFamily() {
        qf8<Object> qf8Var = s0[4];
        k kVar = this.h0;
        kVar.getClass();
        qf8Var.getClass();
        return (String) kVar.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Float getTabBarItemTitleFontSize() {
        qf8<Object> qf8Var = s0[8];
        o oVar = this.l0;
        oVar.getClass();
        qf8Var.getClass();
        return (Float) oVar.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Float getTabBarItemTitleFontSizeActive() {
        qf8<Object> qf8Var = s0[9];
        b bVar = this.m0;
        bVar.getClass();
        qf8Var.getClass();
        return (Float) bVar.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getTabBarItemTitleFontStyle() {
        qf8<Object> qf8Var = s0[11];
        d dVar = this.o0;
        dVar.getClass();
        qf8Var.getClass();
        return (String) dVar.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getTabBarItemTitleFontWeight() {
        qf8<Object> qf8Var = s0[10];
        c cVar = this.n0;
        cVar.getClass();
        qf8Var.getClass();
        return (String) cVar.a;
    }

    public final void h() {
        r7f r7fVar;
        if (this.b0 || (r7fVar = this.r0) == null) {
            return;
        }
        this.b0 = true;
        com.facebook.react.modules.core.a aVar = com.facebook.react.modules.core.a.f;
        if (aVar != null) {
            aVar.b(a.EnumC0132a.b, r7fVar);
        } else {
            r6.g("ReactChoreographer needs to be initialized.");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        boolean z;
        boolean z2;
        FragmentManager fragmentManagerU;
        getId();
        super.onAttachedToWindow();
        ViewParent parent = this;
        while (true) {
            z = parent instanceof wnc;
            if (z || (parent instanceof ur5) || parent.getParent() == null) {
                break;
            }
            parent = parent.getParent();
            parent.getClass();
        }
        if (parent instanceof ur5) {
            Fragment associatedFragment = ((ur5) parent).getAssociatedFragment();
            if (associatedFragment == null) {
                v40.o("[RNScreens] Parent fragment providing view ", parent, " returned nullish fragment");
                return;
            }
            fragmentManagerU = associatedFragment.getChildFragmentManager();
        } else {
            if (!z) {
                akb.n("[RNScreens] Expected parent to be a ReactRootView, instead found: ".concat(parent.getClass().getName()));
                return;
            }
            wnc wncVar = (wnc) parent;
            Context context = wncVar.getContext();
            while (true) {
                z2 = context instanceof androidx.fragment.app.g;
                if (z2 || !(context instanceof ContextWrapper)) {
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (!z2) {
                r6.g("[RNScreens] In order to use react-native-screens components your app's activity need to extend ReactActivity");
                return;
            }
            androidx.fragment.app.g gVar = (androidx.fragment.app.g) context;
            if (gVar.u().c.f().isEmpty()) {
                fragmentManagerU = gVar.u();
            } else {
                try {
                    fragmentManagerU = FragmentManager.B(wncVar).getChildFragmentManager();
                } catch (IllegalStateException unused) {
                    fragmentManagerU = gVar.u();
                }
            }
        }
        if (fragmentManagerU == null) {
            r6.g("[RNScreens] Nullish fragment manager - can't run container operations");
            return;
        }
        this.V = fragmentManagerU;
        a aVar = this.b;
        aVar.a();
        s7f s7fVar = s7f.this;
        aVar.a = false;
        if (aVar.b) {
            aVar.b = false;
            g(s7fVar);
        }
        if (aVar.c) {
            aVar.c = false;
            e(s7fVar);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (configuration != null) {
            int i2 = configuration.uiMode & 48;
            Integer num = this.a0;
            if (num != null && i2 == num.intValue()) {
                return;
            }
            fu2 fu2Var = this.c;
            if (i2 == 16) {
                fu2Var.setTheme(R.style.Theme_Material3_Light_NoActionBar);
            } else if (i2 != 32) {
                fu2Var.setTheme(R.style.Theme_Material3_DayNight_NoActionBar);
            } else {
                fu2Var.setTheme(R.style.Theme_Material3_Dark_NoActionBar);
            }
            this.c0.a(this);
            this.a0 = Integer.valueOf(i2);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
        h();
    }

    public final void setEventEmitter$react_native_screens_release(v7f v7fVar) {
        v7fVar.getClass();
        this.f = v7fVar;
    }

    public final void setTabBarBackgroundColor(Integer num) {
        this.d0.c(s0[0], this, num);
    }

    public final void setTabBarItemActiveIndicatorColor(Integer num) {
        this.e0.c(s0[1], this, num);
    }

    public final void setTabBarItemActiveIndicatorEnabled(boolean z) {
        this.f0.c(s0[2], this, Boolean.valueOf(z));
    }

    public final void setTabBarItemIconColor(Integer num) {
        this.g0.c(s0[3], this, num);
    }

    public final void setTabBarItemIconColorActive(Integer num) {
        this.i0.c(s0[5], this, num);
    }

    public final void setTabBarItemLabelVisibilityMode(String str) {
        this.q0.c(s0[13], this, str);
    }

    public final void setTabBarItemRippleColor(Integer num) {
        this.p0.c(s0[12], this, num);
    }

    public final void setTabBarItemTitleFontColor(Integer num) {
        this.j0.c(s0[6], this, num);
    }

    public final void setTabBarItemTitleFontColorActive(Integer num) {
        this.k0.c(s0[7], this, num);
    }

    public final void setTabBarItemTitleFontFamily(String str) {
        this.h0.c(s0[4], this, str);
    }

    public final void setTabBarItemTitleFontSize(Float f2) {
        this.l0.c(s0[8], this, f2);
    }

    public final void setTabBarItemTitleFontSizeActive(Float f2) {
        this.m0.c(s0[9], this, f2);
    }

    public final void setTabBarItemTitleFontStyle(String str) {
        this.o0.c(s0[11], this, str);
    }

    public final void setTabBarItemTitleFontWeight(String str) {
        this.n0.c(s0[10], this, str);
    }
}
