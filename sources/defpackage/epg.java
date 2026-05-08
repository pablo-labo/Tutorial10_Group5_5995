package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import com.indeed.android.jobsearch.R;
import defpackage.nzg;
import defpackage.rzg;
import defpackage.t6;
import defpackage.ws2;
import defpackage.y5;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public final class epg {
    public static WeakHashMap<View, prg> a = null;
    public static Field b = null;
    public static boolean c = false;
    public static final int[] d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    public static final zog e = new zog();
    public static final a f = new a();

    public static class a implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
        public final WeakHashMap<View, Boolean> a = new WeakHashMap<>();

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.a.entrySet()) {
                    View key = entry.getKey();
                    boolean zBooleanValue = entry.getValue().booleanValue();
                    boolean z = key.isShown() && key.getWindowVisibility() == 0;
                    if (zBooleanValue != z) {
                        epg.h(key, z ? 16 : 32);
                        entry.setValue(Boolean.valueOf(z));
                    }
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public static abstract class b<T> {
        public final int a;
        public final Class<T> b;
        public final int c;
        public final int d;

        public b(int i, Class<T> cls, int i2, int i3) {
            this.a = i;
            this.b = cls;
            this.d = i2;
            this.c = i3;
        }

        public abstract T a(View view);

        public abstract void b(View view, T t);

        /* JADX WARN: Multi-variable type inference failed */
        public final void c(View view, T t) {
            Object tag;
            int i = Build.VERSION.SDK_INT;
            int i2 = this.c;
            if (i >= i2) {
                b(view, t);
                return;
            }
            int i3 = Build.VERSION.SDK_INT;
            int i4 = this.a;
            if (i3 >= i2) {
                tag = a(view);
            } else {
                tag = view.getTag(i4);
                if (!this.b.isInstance(tag)) {
                    tag = null;
                }
            }
            if (d(tag, t)) {
                y5 y5VarD = epg.d(view);
                if (y5VarD == null) {
                    y5VarD = new y5();
                }
                epg.o(view, y5VarD);
                view.setTag(i4, t);
                epg.h(view, this.d);
            }
        }

        public abstract boolean d(T t, T t2);
    }

    public static class c {
        public static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        public static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        public static void c(View view) {
            view.requestApplyInsets();
        }
    }

    public static class d {

        public class a implements View.OnApplyWindowInsetsListener {
            public rzg a = null;
            public final /* synthetic */ View b;
            public final /* synthetic */ tpa c;

            public a(View view, tpa tpaVar) {
                this.b = view;
                this.c = tpaVar;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                rzg rzgVarH = rzg.h(view, windowInsets);
                int i = Build.VERSION.SDK_INT;
                tpa tpaVar = this.c;
                if (i < 30) {
                    d.a(windowInsets, this.b);
                    if (rzgVarH.equals(this.a)) {
                        return tpaVar.b(view, rzgVarH).g();
                    }
                }
                this.a = rzgVarH;
                rzg rzgVarB = tpaVar.b(view, rzgVarH);
                if (i >= 30) {
                    return rzgVarB.g();
                }
                WeakHashMap<View, prg> weakHashMap = epg.a;
                c.c(view);
                return rzgVarB.g();
            }
        }

        public static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static rzg b(View view, rzg rzgVar, Rect rect) {
            WindowInsets windowInsetsG = rzgVar.g();
            if (windowInsetsG != null) {
                return rzg.h(view, view.computeSystemWindowInsets(windowInsetsG, rect));
            }
            rect.setEmpty();
            return rzgVar;
        }

        public static ColorStateList c(View view) {
            return view.getBackgroundTintList();
        }

        public static PorterDuff.Mode d(View view) {
            return view.getBackgroundTintMode();
        }

        public static float e(View view) {
            return view.getElevation();
        }

        public static String f(View view) {
            return view.getTransitionName();
        }

        public static float g(View view) {
            return view.getZ();
        }

        public static boolean h(View view) {
            return view.isNestedScrollingEnabled();
        }

        public static void i(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        public static void j(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        public static void k(View view, float f) {
            view.setElevation(f);
        }

        public static void l(View view, boolean z) {
            view.setNestedScrollingEnabled(z);
        }

        public static void m(View view, tpa tpaVar) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(R.id.tag_on_apply_window_listener, tpaVar);
            }
            if (tpaVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, tpaVar));
            }
        }

        public static void n(View view, String str) {
            view.setTransitionName(str);
        }

        public static void o(View view) {
            view.stopNestedScroll();
        }
    }

    public static class e {
        public static rzg a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            rzg rzgVarH = rzg.h(null, rootWindowInsets);
            rzg.j jVar = rzgVarH.a;
            jVar.t(rzgVarH);
            jVar.d(view.getRootView());
            return rzgVarH;
        }

        public static void b(View view, int i, int i2) {
            view.setScrollIndicators(i, i2);
        }
    }

    public static class f {
        public static void a(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }
    }

    public static class g {
        public static int a(View view) {
            return view.getImportantForAutofill();
        }

        public static void b(View view, int i) {
            view.setImportantForAutofill(i);
        }
    }

    public static class h {
        public static CharSequence a(View view) {
            return view.getAccessibilityPaneTitle();
        }

        public static boolean b(View view) {
            return view.isAccessibilityHeading();
        }

        public static boolean c(View view) {
            return view.isScreenReaderFocusable();
        }

        public static void d(View view, boolean z) {
            view.setAccessibilityHeading(z);
        }

        public static void e(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void f(View view, boolean z) {
            view.setScreenReaderFocusable(z);
        }
    }

    public static class i {
        public static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        public static void b(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    public static class j {
        public static CharSequence a(View view) {
            return view.getStateDescription();
        }

        public static void b(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    public static final class k {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static ws2 b(View view, ws2 ws2Var) {
            ContentInfo contentInfoB = ws2Var.a.b();
            Objects.requireNonNull(contentInfoB);
            ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoB);
            if (contentInfoPerformReceiveContent == null) {
                return null;
            }
            return contentInfoPerformReceiveContent == contentInfoB ? ws2Var : new ws2(new ws2.d(contentInfoPerformReceiveContent));
        }
    }

    public interface l {
        boolean a();
    }

    public static class m {
        public static final ArrayList<WeakReference<View>> d = new ArrayList<>();
        public WeakHashMap<View, Boolean> a = null;
        public SparseArray<WeakReference<View>> b = null;
        public WeakReference<KeyEvent> c = null;

        public static boolean b(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((l) arrayList.get(size)).a()) {
                    return true;
                }
            }
            return false;
        }

        public final View a(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.a;
            if (weakHashMap == null || !weakHashMap.containsKey(view)) {
                return null;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View viewA = a(viewGroup.getChildAt(childCount), keyEvent);
                    if (viewA != null) {
                        return viewA;
                    }
                }
            }
            if (b(view, keyEvent)) {
                return view;
            }
            return null;
        }
    }

    @Deprecated
    public static prg a(View view) {
        if (a == null) {
            a = new WeakHashMap<>();
        }
        prg prgVar = a.get(view);
        if (prgVar != null) {
            return prgVar;
        }
        prg prgVar2 = new prg(view);
        a.put(view, prgVar2);
        return prgVar2;
    }

    public static rzg b(View view, rzg rzgVar) {
        WindowInsets windowInsetsG = rzgVar.g();
        if (windowInsetsG != null) {
            WindowInsets windowInsetsA = c.a(view, windowInsetsG);
            if (!windowInsetsA.equals(windowInsetsG)) {
                return rzg.h(view, windowInsetsA);
            }
        }
        return rzgVar;
    }

    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList<WeakReference<View>> arrayList = m.d;
        m mVar = (m) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (mVar == null) {
            mVar = new m();
            view.setTag(R.id.tag_unhandled_key_event_manager, mVar);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap<View, Boolean> weakHashMap = mVar.a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList2 = m.d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (mVar.a == null) {
                            mVar.a = new WeakHashMap<>();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList<WeakReference<View>> arrayList3 = m.d;
                            View view2 = arrayList3.get(size).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                mVar.a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    mVar.a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View viewA = mVar.a(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewA != null && !KeyEvent.isModifierKey(keyCode)) {
                if (mVar.b == null) {
                    mVar.b = new SparseArray<>();
                }
                mVar.b.put(keyCode, new WeakReference<>(viewA));
            }
        }
        return viewA != null;
    }

    public static y5 d(View view) {
        View.AccessibilityDelegate accessibilityDelegateE = e(view);
        if (accessibilityDelegateE == null) {
            return null;
        }
        return accessibilityDelegateE instanceof y5.a ? ((y5.a) accessibilityDelegateE).a : new y5(accessibilityDelegateE);
    }

    public static View.AccessibilityDelegate e(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return i.a(view);
        }
        if (c) {
            return null;
        }
        if (b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                c = true;
                return null;
            }
        }
        try {
            Object obj = b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            c = true;
            return null;
        }
    }

    public static ArrayList f(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] g(qj0 qj0Var) {
        return Build.VERSION.SDK_INT >= 31 ? k.a(qj0Var) : (String[]) qj0Var.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void h(View view, int i2) {
        Object tag;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            int i3 = Build.VERSION.SDK_INT;
            Object objA = null;
            if (i3 >= 28) {
                tag = h.a(view);
            } else {
                tag = view.getTag(R.id.tag_accessibility_pane_title);
                if (!CharSequence.class.isInstance(tag)) {
                    tag = null;
                }
            }
            boolean z = ((CharSequence) tag) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i2);
                if (z) {
                    List<CharSequence> text = accessibilityEventObtain.getText();
                    if (i3 >= 28) {
                        objA = h.a(view);
                    } else {
                        Object tag2 = view.getTag(R.id.tag_accessibility_pane_title);
                        if (CharSequence.class.isInstance(tag2)) {
                            objA = tag2;
                        }
                    }
                    text.add((CharSequence) objA);
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i2 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i2);
                        return;
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e2);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i2);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            List<CharSequence> text2 = accessibilityEventObtain2.getText();
            if (i3 >= 28) {
                objA = h.a(view);
            } else {
                Object tag3 = view.getTag(R.id.tag_accessibility_pane_title);
                if (CharSequence.class.isInstance(tag3)) {
                    objA = tag3;
                }
            }
            text2.add((CharSequence) objA);
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    public static rzg i(View view, rzg rzgVar) {
        WindowInsets windowInsetsG = rzgVar.g();
        if (windowInsetsG != null) {
            WindowInsets windowInsetsB = c.b(view, windowInsetsG);
            if (!windowInsetsB.equals(windowInsetsG)) {
                return rzg.h(view, windowInsetsB);
            }
        }
        return rzgVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ws2 j(View view, ws2 ws2Var) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + ws2Var + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return k.b(view, ws2Var);
        }
        ara araVar = (ara) view.getTag(R.id.tag_on_receive_content_listener);
        bra braVar = e;
        if (araVar == null) {
            if (view instanceof bra) {
                braVar = (bra) view;
            }
            return braVar.a(ws2Var);
        }
        ws2 ws2VarA = araVar.a(view, ws2Var);
        if (ws2VarA == null) {
            return null;
        }
        if (view instanceof bra) {
            braVar = (bra) view;
        }
        return braVar.a(ws2VarA);
    }

    public static void k(View view, int i2) {
        l(view, i2);
        h(view, 0);
    }

    public static void l(View view, int i2) {
        ArrayList arrayListF = f(view);
        for (int i3 = 0; i3 < arrayListF.size(); i3++) {
            if (((t6.a) arrayListF.get(i3)).a() == i2) {
                arrayListF.remove(i3);
                return;
            }
        }
    }

    public static void m(View view, t6.a aVar, v6 v6Var) {
        if (v6Var == null) {
            k(view, aVar.a());
            return;
        }
        t6.a aVar2 = new t6.a(null, aVar.b, null, v6Var, aVar.c);
        y5 y5VarD = d(view);
        if (y5VarD == null) {
            y5VarD = new y5();
        }
        o(view, y5VarD);
        l(view, aVar2.a());
        f(view).add(aVar2);
        h(view, 0);
    }

    public static void n(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            i.b(view, context, iArr, attributeSet, typedArray, i2, 0);
        }
    }

    public static void o(View view, y5 y5Var) {
        if (y5Var == null && (e(view) instanceof y5.a)) {
            y5Var = new y5();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(y5Var == null ? null : y5Var.b);
    }

    public static void p(View view, CharSequence charSequence) {
        new bpg(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28).c(view, charSequence);
        a aVar = f;
        if (charSequence == null) {
            aVar.a.remove(view);
            view.removeOnAttachStateChangeListener(aVar);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(aVar);
        } else {
            aVar.a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(aVar);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(aVar);
            }
        }
    }

    public static void q(View view, nzg.b bVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            nzg.d.g(view, bVar);
            return;
        }
        PathInterpolator pathInterpolator = nzg.c.e;
        Object tag = view.getTag(R.id.tag_on_apply_window_listener);
        if (bVar == null) {
            view.setTag(R.id.tag_window_insets_animation_callback, null);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(null);
                return;
            }
            return;
        }
        View.OnApplyWindowInsetsListener aVar = new nzg.c.a(view, bVar);
        view.setTag(R.id.tag_window_insets_animation_callback, aVar);
        if (tag == null) {
            view.setOnApplyWindowInsetsListener(aVar);
        }
    }
}
