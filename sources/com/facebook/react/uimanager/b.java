package com.facebook.react.uimanager;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import app.rive.runtime.kotlin.renderers.RendererMetrics;
import com.datadog.android.core.internal.metrics.BatchMetricsDispatcher;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.jobsearch.R;
import defpackage.akb;
import defpackage.dmc;
import defpackage.epg;
import defpackage.l5;
import defpackage.mkc;
import defpackage.msb;
import defpackage.ox4;
import defpackage.prg;
import defpackage.t6;
import defpackage.u6;
import defpackage.w35;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class b extends w35 {
    public static final HashMap<String, Integer> u;
    public static int v;
    public static final int w;
    public final View q;
    public final a r;
    public final HashMap<Integer, String> s;
    public View t;

    public class a extends Handler {
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            ((View) message.obj).sendAccessibilityEvent(4);
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.uimanager.b$b, reason: collision with other inner class name */
    public class C0136b extends ox4 {
        public final /* synthetic */ WritableMap a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0136b(int i, int i2, WritableMap writableMap) {
            super(i, i2);
            this.a = writableMap;
        }

        @Override // defpackage.ox4
        public final WritableMap getEventData() {
            return this.a;
        }

        @Override // defpackage.ox4
        public final String getEventName() {
            return "topAccessibilityAction";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        public static final c V;
        public static final c W;
        public static final c X;
        public static final c Y;
        public static final c Z;
        public static final c a;
        public static final c a0;
        public static final c b;
        public static final c b0;
        public static final c c;
        public static final c c0;
        public static final c d;
        public static final c d0;
        public static final c e;
        public static final c e0;
        public static final c f;
        public static final c f0;
        public static final c g0;
        public static final c h0;
        public static final c i0;
        public static final c j0;
        public static final c k0;
        public static final c l0;
        public static final c m0;
        public static final c n0;
        public static final c o0;
        public static final c p0;
        public static final c q0;
        public static final /* synthetic */ c[] r0;

        static {
            c cVar = new c("NONE", 0);
            a = cVar;
            c cVar2 = new c("BUTTON", 1);
            b = cVar2;
            c cVar3 = new c("DROPDOWNLIST", 2);
            c cVar4 = new c("TOGGLEBUTTON", 3);
            c = cVar4;
            c cVar5 = new c("LINK", 4);
            d = cVar5;
            c cVar6 = new c("SEARCH", 5);
            e = cVar6;
            c cVar7 = new c("IMAGE", 6);
            f = cVar7;
            c cVar8 = new c("IMAGEBUTTON", 7);
            V = cVar8;
            c cVar9 = new c("KEYBOARDKEY", 8);
            c cVar10 = new c("TEXT", 9);
            c cVar11 = new c("ADJUSTABLE", 10);
            W = cVar11;
            c cVar12 = new c("SUMMARY", 11);
            X = cVar12;
            c cVar13 = new c("HEADER", 12);
            Y = cVar13;
            c cVar14 = new c("ALERT", 13);
            Z = cVar14;
            c cVar15 = new c("CHECKBOX", 14);
            a0 = cVar15;
            c cVar16 = new c("COMBOBOX", 15);
            b0 = cVar16;
            c cVar17 = new c("MENU", 16);
            c0 = cVar17;
            c cVar18 = new c("MENUBAR", 17);
            d0 = cVar18;
            c cVar19 = new c("MENUITEM", 18);
            e0 = cVar19;
            c cVar20 = new c("PROGRESSBAR", 19);
            f0 = cVar20;
            c cVar21 = new c("RADIO", 20);
            g0 = cVar21;
            c cVar22 = new c("RADIOGROUP", 21);
            h0 = cVar22;
            c cVar23 = new c("SCROLLBAR", 22);
            i0 = cVar23;
            c cVar24 = new c("SPINBUTTON", 23);
            j0 = cVar24;
            c cVar25 = new c("SWITCH", 24);
            k0 = cVar25;
            c cVar26 = new c("TAB", 25);
            l0 = cVar26;
            c cVar27 = new c("TABLIST", 26);
            m0 = cVar27;
            c cVar28 = new c("TIMER", 27);
            n0 = cVar28;
            c cVar29 = new c("LIST", 28);
            o0 = cVar29;
            c cVar30 = new c("GRID", 29);
            p0 = cVar30;
            c cVar31 = new c("PAGER", 30);
            c cVar32 = new c("SCROLLVIEW", 31);
            c cVar33 = new c("HORIZONTALSCROLLVIEW", 32);
            c cVar34 = new c("VIEWGROUP", 33);
            c cVar35 = new c("WEBVIEW", 34);
            c cVar36 = new c("DRAWERLAYOUT", 35);
            c cVar37 = new c("SLIDINGDRAWER", 36);
            c cVar38 = new c("ICONMENU", 37);
            c cVar39 = new c("TOOLBAR", 38);
            q0 = cVar39;
            r0 = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13, cVar14, cVar15, cVar16, cVar17, cVar18, cVar19, cVar20, cVar21, cVar22, cVar23, cVar24, cVar25, cVar26, cVar27, cVar28, cVar29, cVar30, cVar31, cVar32, cVar33, cVar34, cVar35, cVar36, cVar37, cVar38, cVar39};
        }

        public c() {
            throw null;
        }

        public static c a(String str) {
            if (str == null) {
                return a;
            }
            for (c cVar : values()) {
                if (cVar.name().equalsIgnoreCase(str)) {
                    return cVar;
                }
            }
            l5.q("Invalid accessibility role value: ".concat(str));
            return null;
        }

        public static c c(View view) {
            d dVar = (d) view.getTag(R.id.role);
            if (dVar == null) {
                return (c) view.getTag(R.id.accessibility_role);
            }
            int iOrdinal = dVar.ordinal();
            if (iOrdinal == 0) {
                return Z;
            }
            if (iOrdinal == 5) {
                return b;
            }
            if (iOrdinal == 7) {
                return a0;
            }
            if (iOrdinal == 9) {
                return b0;
            }
            if (iOrdinal == 19) {
                return p0;
            }
            if (iOrdinal == 35) {
                return a;
            }
            if (iOrdinal == 56) {
                return m0;
            }
            if (iOrdinal == 46) {
                return i0;
            }
            if (iOrdinal == 47) {
                return e;
            }
            if (iOrdinal == 49) {
                return W;
            }
            if (iOrdinal == 50) {
                return j0;
            }
            if (iOrdinal == 59) {
                return n0;
            }
            if (iOrdinal == 60) {
                return q0;
            }
            switch (iOrdinal) {
                case 21:
                    return Y;
                case 22:
                    return f;
                case 23:
                    return d;
                case 24:
                    return o0;
                default:
                    switch (iOrdinal) {
                        case RendererMetrics.SAMPLES /* 30 */:
                            return c0;
                        case 31:
                            return d0;
                        case 32:
                            return e0;
                        default:
                            switch (iOrdinal) {
                                case 39:
                                    return f0;
                                case 40:
                                    return g0;
                                case 41:
                                    return h0;
                                default:
                                    switch (iOrdinal) {
                                        case 52:
                                            return X;
                                        case 53:
                                            return k0;
                                        case 54:
                                            return l0;
                                        default:
                                            return null;
                                    }
                            }
                    }
            }
        }

        public static String e(c cVar) {
            switch (cVar.ordinal()) {
                case 0:
                case 4:
                case 11:
                case 12:
                case 13:
                case 15:
                case 16:
                case 17:
                case 18:
                case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                case 21:
                case 22:
                case 25:
                case 26:
                case 27:
                case 38:
                    return "android.view.View";
                case 1:
                    return "android.widget.Button";
                case 2:
                    return "android.widget.Spinner";
                case 3:
                    return "android.widget.ToggleButton";
                case 5:
                    return "android.widget.EditText";
                case 6:
                    return "android.widget.ImageView";
                case 7:
                    return "android.widget.ImageButton";
                case 8:
                    return "android.inputmethodservice.Keyboard$Key";
                case DatadogLogGenerator.CRASH /* 9 */:
                    return "android.widget.TextView";
                case 10:
                    return "android.widget.SeekBar";
                case ModuleDescriptor.MODULE_VERSION /* 14 */:
                    return "android.widget.CheckBox";
                case 20:
                    return "android.widget.RadioButton";
                case 23:
                    return "android.widget.SpinButton";
                case 24:
                    return "android.widget.Switch";
                case 28:
                    return "android.widget.AbsListView";
                case 29:
                    return "android.widget.GridView";
                case RendererMetrics.SAMPLES /* 30 */:
                    return "androidx.viewpager.widget.ViewPager";
                case 31:
                    return "android.widget.ScrollView";
                case 32:
                    return "android.widget.HorizontalScrollView";
                case 33:
                    return "android.view.ViewGroup";
                case 34:
                    return "android.webkit.WebView";
                case 35:
                    return "androidx.drawerlayout.widget.DrawerLayout";
                case 36:
                    return "android.widget.SlidingDrawer";
                case 37:
                    return "com.android.internal.view.menu.IconMenuView";
                default:
                    akb.o(cVar, "Invalid accessibility role value: ");
                    return null;
            }
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) r0.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {
        public static final d a;
        public static final /* synthetic */ d[] b;

        /* JADX INFO: Fake field, exist only in values array */
        d EF1;

        static {
            d dVar = new d("ALERT", 0);
            d dVar2 = new d("ALERTDIALOG", 1);
            d dVar3 = new d("APPLICATION", 2);
            d dVar4 = new d("ARTICLE", 3);
            d dVar5 = new d("BANNER", 4);
            d dVar6 = new d("BUTTON", 5);
            d dVar7 = new d("CELL", 6);
            d dVar8 = new d("CHECKBOX", 7);
            d dVar9 = new d("COLUMNHEADER", 8);
            d dVar10 = new d("COMBOBOX", 9);
            d dVar11 = new d("COMPLEMENTARY", 10);
            d dVar12 = new d("CONTENTINFO", 11);
            d dVar13 = new d("DEFINITION", 12);
            d dVar14 = new d("DIALOG", 13);
            d dVar15 = new d("DIRECTORY", 14);
            d dVar16 = new d("DOCUMENT", 15);
            d dVar17 = new d("FEED", 16);
            d dVar18 = new d("FIGURE", 17);
            d dVar19 = new d("FORM", 18);
            d dVar20 = new d("GRID", 19);
            d dVar21 = new d("GROUP", 20);
            d dVar22 = new d("HEADING", 21);
            d dVar23 = new d("IMG", 22);
            d dVar24 = new d("LINK", 23);
            a = dVar24;
            b = new d[]{dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10, dVar11, dVar12, dVar13, dVar14, dVar15, dVar16, dVar17, dVar18, dVar19, dVar20, dVar21, dVar22, dVar23, dVar24, new d("LIST", 24), new d("LISTITEM", 25), new d("LOG", 26), new d("MAIN", 27), new d("MARQUEE", 28), new d("MATH", 29), new d("MENU", 30), new d("MENUBAR", 31), new d("MENUITEM", 32), new d("METER", 33), new d("NAVIGATION", 34), new d("NONE", 35), new d("NOTE", 36), new d("OPTION", 37), new d("PRESENTATION", 38), new d("PROGRESSBAR", 39), new d("RADIO", 40), new d("RADIOGROUP", 41), new d("REGION", 42), new d("ROW", 43), new d("ROWGROUP", 44), new d("ROWHEADER", 45), new d("SCROLLBAR", 46), new d("SEARCHBOX", 47), new d("SEPARATOR", 48), new d("SLIDER", 49), new d("SPINBUTTON", 50), new d("STATUS", 51), new d("SUMMARY", 52), new d("SWITCH", 53), new d("TAB", 54), new d("TABLE", 55), new d("TABLIST", 56), new d("TABPANEL", 57), new d("TERM", 58), new d("TIMER", 59), new d("TOOLBAR", 60), new d("TOOLTIP", 61), new d("TREE", 62), new d("TREEGRID", 63), new d("TREEITEM", 64)};
        }

        public d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) b.clone();
        }
    }

    static {
        HashMap<String, Integer> map = new HashMap<>();
        u = map;
        v = 1056964608;
        w = 2;
        map.put("activate", Integer.valueOf(t6.a.g.a()));
        map.put("longpress", Integer.valueOf(t6.a.h.a()));
        map.put("increment", Integer.valueOf(t6.a.k.a()));
        map.put("decrement", Integer.valueOf(t6.a.l.a()));
        map.put("expand", Integer.valueOf(t6.a.m.a()));
        map.put("collapse", Integer.valueOf(t6.a.n.a()));
    }

    public b(View view, int i, boolean z) {
        super(view);
        this.q = view;
        this.s = new HashMap<>();
        this.r = new a();
        view.setFocusable(z);
        WeakHashMap<View, prg> weakHashMap = epg.a;
        view.setImportantForAccessibility(i);
    }

    public static boolean A(t6 t6Var, View view) {
        AccessibilityNodeInfo accessibilityNodeInfo = t6Var.a;
        WeakHashMap<View, prg> weakHashMap = epg.a;
        int importantForAccessibility = view.getImportantForAccessibility();
        if (importantForAccessibility != 4 && (importantForAccessibility != 2 || accessibilityNodeInfo.getChildCount() > 0)) {
            AccessibilityNodeInfo.CollectionInfo collectionInfo = accessibilityNodeInfo.getCollectionInfo();
            if ((collectionInfo != null ? new t6.e(collectionInfo) : null) == null && (!TextUtils.isEmpty(t6Var.h()) || !TextUtils.isEmpty(accessibilityNodeInfo.getContentDescription()) || !TextUtils.isEmpty(accessibilityNodeInfo.getHintText()))) {
                return true;
            }
            if (!TextUtils.isEmpty(Build.VERSION.SDK_INT >= 30 ? t6.b.a(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY")) || accessibilityNodeInfo.isCheckable()) {
                return true;
            }
            AccessibilityNodeInfo.RangeInfo rangeInfo = accessibilityNodeInfo.getRangeInfo();
            t6.g gVar = rangeInfo != null ? new t6.g(rangeInfo) : null;
            if (gVar != null) {
                AccessibilityNodeInfo.RangeInfo rangeInfo2 = (AccessibilityNodeInfo.RangeInfo) gVar.a;
                float max = rangeInfo2.getMax();
                float min = rangeInfo2.getMin();
                float current = rangeInfo2.getCurrent();
                if (max - min > 0.0f && current >= min && current <= max) {
                    return true;
                }
            }
            if (accessibilityNodeInfo.isCheckable()) {
                return true;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt != null) {
                        t6 t6VarJ = t6.j();
                        AccessibilityNodeInfo accessibilityNodeInfo2 = t6VarJ.a;
                        WeakHashMap<View, prg> weakHashMap2 = epg.a;
                        childAt.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo2);
                        if (accessibilityNodeInfo2.isVisibleToUser() && !z(t6VarJ, childAt) && A(t6VarJ, childAt)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static void B(t6 t6Var, c cVar, Context context) {
        t6Var.n(c.e(cVar));
        if (cVar.equals(c.d)) {
            t6Var.u(context.getString(R.string.link_description));
            return;
        }
        if (cVar.equals(c.f)) {
            t6Var.u(context.getString(R.string.image_description));
            return;
        }
        if (cVar.equals(c.V)) {
            t6Var.u(context.getString(R.string.imagebutton_description));
            t6Var.o(true);
            return;
        }
        if (cVar.equals(c.b)) {
            t6Var.o(true);
            return;
        }
        if (cVar.equals(c.c)) {
            t6Var.o(true);
            t6Var.m(true);
            return;
        }
        if (cVar.equals(c.X)) {
            t6Var.u(context.getString(R.string.summary_description));
            return;
        }
        if (cVar.equals(c.Y)) {
            t6Var.s(true);
            return;
        }
        if (cVar.equals(c.Z)) {
            t6Var.u(context.getString(R.string.alert_description));
            return;
        }
        if (cVar.equals(c.b0)) {
            t6Var.u(context.getString(R.string.combobox_description));
            return;
        }
        if (cVar.equals(c.c0)) {
            t6Var.u(context.getString(R.string.menu_description));
            return;
        }
        if (cVar.equals(c.d0)) {
            t6Var.u(context.getString(R.string.menubar_description));
            return;
        }
        if (cVar.equals(c.e0)) {
            t6Var.u(context.getString(R.string.menuitem_description));
            return;
        }
        if (cVar.equals(c.f0)) {
            t6Var.u(context.getString(R.string.progressbar_description));
            return;
        }
        if (cVar.equals(c.h0)) {
            t6Var.u(context.getString(R.string.radiogroup_description));
            return;
        }
        if (cVar.equals(c.i0)) {
            t6Var.u(context.getString(R.string.scrollbar_description));
            return;
        }
        if (cVar.equals(c.j0)) {
            t6Var.u(context.getString(R.string.spinbutton_description));
            return;
        }
        if (cVar.equals(c.l0)) {
            t6Var.u(context.getString(R.string.rn_tab_description));
            return;
        }
        if (cVar.equals(c.m0)) {
            t6Var.u(context.getString(R.string.tablist_description));
        } else if (cVar.equals(c.n0)) {
            t6Var.u(context.getString(R.string.timer_description));
        } else if (cVar.equals(c.q0)) {
            t6Var.u(context.getString(R.string.toolbar_description));
        }
    }

    public static CharSequence y(t6 t6Var, View view) {
        t6 t6Var2;
        if (t6Var != null) {
            t6Var2 = new t6(AccessibilityNodeInfo.obtain(t6Var.a));
        } else if (view == null) {
            t6Var2 = null;
        } else {
            t6Var2 = t6.j();
            try {
                WeakHashMap<View, prg> weakHashMap = epg.a;
                view.onInitializeAccessibilityNodeInfo(t6Var2.a);
            } catch (NullPointerException unused) {
                t6Var2 = null;
            }
        }
        if (t6Var2 != null) {
            CharSequence contentDescription = t6Var2.a.getContentDescription();
            CharSequence charSequenceH = t6Var2.h();
            boolean zIsEmpty = TextUtils.isEmpty(charSequenceH);
            boolean z = view instanceof EditText;
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(contentDescription) && (!z || zIsEmpty)) {
                sb.append(contentDescription);
            } else if (!zIsEmpty) {
                sb.append(charSequenceH);
            } else if (view instanceof ViewGroup) {
                StringBuilder sb2 = new StringBuilder();
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    t6 t6VarJ = t6.j();
                    WeakHashMap<View, prg> weakHashMap2 = epg.a;
                    childAt.onInitializeAccessibilityNodeInfo(t6VarJ.a);
                    if (A(t6VarJ, childAt) && !z(t6VarJ, childAt)) {
                        CharSequence charSequenceY = y(null, childAt);
                        if (!TextUtils.isEmpty(charSequenceY)) {
                            sb2.append(((Object) charSequenceY) + ", ");
                        }
                    }
                }
                int length = sb2.length();
                if (length > 0) {
                    sb2.delete(length - w, length);
                }
                return sb2.toString();
            }
            return sb;
        }
        return null;
    }

    public static boolean z(t6 t6Var, View view) {
        AccessibilityNodeInfo accessibilityNodeInfo = t6Var.a;
        if (!accessibilityNodeInfo.isVisibleToUser()) {
            return false;
        }
        if (!t6Var.i() && !accessibilityNodeInfo.isClickable() && !accessibilityNodeInfo.isLongClickable() && !accessibilityNodeInfo.isFocusable()) {
            ArrayList arrayListD = t6Var.d();
            if (!arrayListD.contains(16) && !arrayListD.contains(32) && !arrayListD.contains(1)) {
                return false;
            }
        }
        return true;
    }

    public final w35.c C(View view) {
        return (w35.c) super.b(view);
    }

    @Override // defpackage.w35, defpackage.y5
    public u6 b(View view) {
        return null;
    }

    @Override // defpackage.y5
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        ReadableMap readableMap = (ReadableMap) view.getTag(R.id.accessibility_value);
        if (readableMap != null && readableMap.hasKey(BatchMetricsDispatcher.UPLOADER_DELAY_MIN_KEY) && readableMap.hasKey("now") && readableMap.hasKey(BatchMetricsDispatcher.UPLOADER_DELAY_MAX_KEY)) {
            Dynamic dynamic = readableMap.getDynamic(BatchMetricsDispatcher.UPLOADER_DELAY_MIN_KEY);
            Dynamic dynamic2 = readableMap.getDynamic("now");
            Dynamic dynamic3 = readableMap.getDynamic(BatchMetricsDispatcher.UPLOADER_DELAY_MAX_KEY);
            if (dynamic != null) {
                ReadableType type = dynamic.getType();
                ReadableType readableType = ReadableType.Number;
                if (type == readableType && dynamic2 != null && dynamic2.getType() == readableType && dynamic3 != null && dynamic3.getType() == readableType) {
                    int iAsInt = dynamic.asInt();
                    int iAsInt2 = dynamic2.asInt();
                    int iAsInt3 = dynamic3.asInt();
                    if (iAsInt3 <= iAsInt || iAsInt2 < iAsInt || iAsInt3 < iAsInt2) {
                        return;
                    }
                    accessibilityEvent.setItemCount(iAsInt3 - iAsInt);
                    accessibilityEvent.setCurrentItemIndex(iAsInt2);
                }
            }
        }
    }

    @Override // defpackage.w35, defpackage.y5
    public void d(t6 t6Var, View view) {
        super.d(t6Var, view);
        AccessibilityNodeInfo accessibilityNodeInfo = t6Var.a;
        if (view.getTag(R.id.accessibility_state_expanded) != null) {
            t6Var.a(((Boolean) view.getTag(R.id.accessibility_state_expanded)).booleanValue() ? 524288 : 262144);
        }
        c cVarC = c.c(view);
        String str = (String) view.getTag(R.id.accessibility_hint);
        if (cVarC != null) {
            B(t6Var, cVarC, view.getContext());
        }
        if (str != null) {
            t6Var.y(str);
        }
        Object tag = view.getTag(R.id.labelled_by);
        if (tag != null) {
            View viewA = mkc.a(view.getRootView(), (String) tag);
            this.t = viewA;
            if (viewA != null) {
                accessibilityNodeInfo.setLabeledBy(viewA);
            }
        }
        ReadableMap readableMap = (ReadableMap) view.getTag(R.id.accessibility_state);
        boolean z = true;
        if (readableMap != null) {
            view.getContext();
            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                Dynamic dynamic = readableMap.getDynamic(strNextKey);
                if (strNextKey.equals("selected") && dynamic.getType() == ReadableType.Boolean) {
                    accessibilityNodeInfo.setSelected(dynamic.asBoolean());
                } else if (strNextKey.equals("disabled") && dynamic.getType() == ReadableType.Boolean) {
                    accessibilityNodeInfo.setEnabled(!dynamic.asBoolean());
                } else if (strNextKey.equals("checked") && dynamic.getType() == ReadableType.Boolean) {
                    boolean zAsBoolean = dynamic.asBoolean();
                    t6Var.m(true);
                    accessibilityNodeInfo.setChecked(zAsBoolean);
                }
            }
        }
        ReadableArray readableArray = (ReadableArray) view.getTag(R.id.accessibility_actions);
        ReadableMap readableMap2 = (ReadableMap) view.getTag(R.id.accessibility_collection_item);
        if (readableMap2 != null) {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(readableMap2.getInt("rowIndex"), readableMap2.getInt("rowSpan"), readableMap2.getInt("columnIndex"), readableMap2.getInt("columnSpan"), readableMap2.getBoolean("heading")));
        }
        if (readableArray != null) {
            int i = 0;
            while (i < readableArray.size()) {
                ReadableMap map = readableArray.getMap(i);
                if (!map.hasKey("name")) {
                    l5.q("Unknown accessibility action.");
                    return;
                }
                int iIntValue = v;
                String string = map.hasKey("label") ? map.getString("label") : null;
                String string2 = map.getString("name");
                boolean z2 = z;
                HashMap<String, Integer> map2 = u;
                if (map2.containsKey(string2)) {
                    iIntValue = map2.get(map.getString("name")).intValue();
                } else {
                    v++;
                }
                this.s.put(Integer.valueOf(iIntValue), map.getString("name"));
                t6Var.b(new t6.a(iIntValue, string));
                i++;
                z = z2;
            }
        }
        boolean z3 = z;
        ReadableMap readableMap3 = (ReadableMap) view.getTag(R.id.accessibility_value);
        if (readableMap3 != null && readableMap3.hasKey(BatchMetricsDispatcher.UPLOADER_DELAY_MIN_KEY) && readableMap3.hasKey("now") && readableMap3.hasKey(BatchMetricsDispatcher.UPLOADER_DELAY_MAX_KEY)) {
            Dynamic dynamic2 = readableMap3.getDynamic(BatchMetricsDispatcher.UPLOADER_DELAY_MIN_KEY);
            Dynamic dynamic3 = readableMap3.getDynamic("now");
            Dynamic dynamic4 = readableMap3.getDynamic(BatchMetricsDispatcher.UPLOADER_DELAY_MAX_KEY);
            if (dynamic2 != null) {
                ReadableType type = dynamic2.getType();
                ReadableType readableType = ReadableType.Number;
                if (type == readableType && dynamic3 != null && dynamic3.getType() == readableType && dynamic4 != null && dynamic4.getType() == readableType) {
                    int iAsInt = dynamic2.asInt();
                    int iAsInt2 = dynamic3.asInt();
                    int iAsInt3 = dynamic4.asInt();
                    if (iAsInt3 > iAsInt && iAsInt2 >= iAsInt && iAsInt3 >= iAsInt2) {
                        accessibilityNodeInfo.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(0, iAsInt, iAsInt3, iAsInt2));
                    }
                }
            }
        }
        String str2 = (String) view.getTag(R.id.react_test_id);
        if (str2 != null) {
            accessibilityNodeInfo.setViewIdResourceName(str2);
        }
        boolean z4 = (TextUtils.isEmpty(accessibilityNodeInfo.getContentDescription()) && TextUtils.isEmpty(t6Var.h())) ? z3 : false;
        boolean z5 = (readableArray == null && readableMap == null && tag == null && cVarC == null) ? false : z3;
        if (z4 && z5) {
            t6Var.r(y(t6Var, view));
        }
    }

    @Override // defpackage.y5
    public boolean g(View view, int i, Bundle bundle) {
        if (i == 524288) {
            view.setTag(R.id.accessibility_state_expanded, Boolean.FALSE);
        }
        if (i == 262144) {
            view.setTag(R.id.accessibility_state_expanded, Boolean.TRUE);
        }
        Integer numValueOf = Integer.valueOf(i);
        HashMap<Integer, String> map = this.s;
        if (!map.containsKey(numValueOf)) {
            return super.g(view, i, bundle);
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("actionName", map.get(Integer.valueOf(i)));
        ReactContext reactContext = (ReactContext) view.getContext();
        if (reactContext.hasActiveReactInstance()) {
            int id = view.getId();
            int iG = dmc.g(reactContext);
            UIManager uIManagerJ = dmc.j(reactContext, msb.e(id), true);
            if (uIManagerJ != null) {
                uIManagerJ.getEventDispatcher().a(new C0136b(iG, id, writableMapCreateMap));
            }
        } else {
            ReactSoftExceptionLogger.logSoftException("ReactAccessibilityDelegate", new ReactNoCrashSoftException("Cannot get RCTEventEmitter, no CatalystInstance"));
        }
        c cVar = (c) view.getTag(R.id.accessibility_role);
        ReadableMap readableMap = (ReadableMap) view.getTag(R.id.accessibility_value);
        if (cVar != c.W || (i != t6.a.k.a() && i != t6.a.l.a())) {
            return true;
        }
        if (readableMap != null && !readableMap.hasKey("text")) {
            a aVar = this.r;
            if (aVar.hasMessages(1, view)) {
                aVar.removeMessages(1, view);
            }
            aVar.sendMessageDelayed(aVar.obtainMessage(1, view), 200L);
        }
        return super.g(view, i, bundle);
    }

    @Override // defpackage.w35
    public int n(float f, float f2) {
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.w35
    public void o(ArrayList arrayList) {
    }

    @Override // defpackage.w35
    public boolean s(int i, int i2) {
        return false;
    }

    @Override // defpackage.w35
    public void u(int i, t6 t6Var) {
        t6Var.r("");
        t6Var.l(new Rect(0, 0, 1, 1));
    }
}
