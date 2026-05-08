package com.facebook.react.uimanager;

import android.content.Context;
import android.graphics.Paint;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.a;
import com.facebook.react.uimanager.b;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.indeed.android.jobsearch.R;
import defpackage.c74;
import defpackage.di1;
import defpackage.dmc;
import defpackage.epg;
import defpackage.gb9;
import defpackage.kwa;
import defpackage.mkc;
import defpackage.mkf;
import defpackage.msb;
import defpackage.mwa;
import defpackage.nh1;
import defpackage.nl1;
import defpackage.nn2;
import defpackage.oeb;
import defpackage.prg;
import defpackage.ql5;
import defpackage.r6;
import defpackage.s55;
import defpackage.snc;
import defpackage.v71;
import defpackage.xm8;
import defpackage.zpc;
import defpackage.zr4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseViewManager<T extends View, C extends xm8> extends ViewManager<T, C> implements View.OnLayoutChangeListener {
    private static final int PERSPECTIVE_ARRAY_INVERTED_CAMERA_DISTANCE_INDEX = 2;
    private static final String STATE_BUSY = "busy";
    private static final String STATE_CHECKED = "checked";
    private static final String STATE_EXPANDED = "expanded";
    private static final String STATE_MIXED = "mixed";
    private static final float CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER = (float) Math.sqrt(5.0d);
    private static final a.C0134a sMatrixDecompositionContext = new a.C0134a();
    private static final double[] sTransformDecompositionArray = new double[16];

    public class a<V extends View> implements View.OnFocusChangeListener {
        public View.OnFocusChangeListener a;

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view, boolean z) {
            EventDispatcher eventDispatcherE;
            View.OnFocusChangeListener onFocusChangeListener = this.a;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(view, z);
            }
            int iG = dmc.g(view.getContext());
            if (iG == -1 || !(view.getContext() instanceof mkf) || (eventDispatcherE = dmc.e((mkf) view.getContext(), view.getId())) == null) {
                return;
            }
            if (z) {
                eventDispatcherE.a(new ql5(iG, view.getId(), 0));
            } else {
                eventDispatcherE.a(new di1(iG, view.getId()));
            }
        }
    }

    public static class b {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00f1  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0101  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void a(android.view.View r25, com.facebook.react.bridge.ReadableArray r26, java.lang.Boolean r27) {
            /*
                Method dump skipped, instruction units count: 1034
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.BaseViewManager.b.a(android.view.View, com.facebook.react.bridge.ReadableArray, java.lang.Boolean):void");
        }
    }

    public BaseViewManager() {
        super(null);
    }

    private void logUnsupportedPropertyWarning(String str) {
        s55.p("ReactNative", "%s doesn't support property '%s'", getName(), str);
    }

    private static float sanitizeFloatPropertyValue(float f) {
        if (f >= -3.4028235E38f && f <= Float.MAX_VALUE) {
            return f;
        }
        if (f < -3.4028235E38f || f == Float.NEGATIVE_INFINITY) {
            return -3.4028235E38f;
        }
        if (f > Float.MAX_VALUE || f == Float.POSITIVE_INFINITY) {
            return Float.MAX_VALUE;
        }
        if (Float.isNaN(f)) {
            return 0.0f;
        }
        throw new IllegalStateException("Invalid float property value: " + f);
    }

    private static void setPointerEventsFlag(View view, oeb.a aVar, boolean z) {
        Integer num = (Integer) view.getTag(R.id.pointer_events);
        int iIntValue = num != null ? num.intValue() : 0;
        int iOrdinal = 1 << aVar.ordinal();
        view.setTag(R.id.pointer_events, Integer.valueOf(z ? iOrdinal | iIntValue : (~iOrdinal) & iIntValue));
    }

    private void updateViewContentDescription(T t) {
        Dynamic dynamic;
        String str = (String) t.getTag(R.id.accessibility_label);
        ReadableMap readableMap = (ReadableMap) t.getTag(R.id.accessibility_state);
        ArrayList arrayList = new ArrayList();
        ReadableMap readableMap2 = (ReadableMap) t.getTag(R.id.accessibility_value);
        if (str != null) {
            arrayList.add(str);
        }
        if (readableMap != null) {
            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                Dynamic dynamic2 = readableMap.getDynamic(strNextKey);
                if (strNextKey.equals(STATE_CHECKED) && dynamic2.getType() == ReadableType.String && dynamic2.asString().equals(STATE_MIXED)) {
                    arrayList.add(t.getContext().getString(R.string.state_mixed_description));
                } else if (strNextKey.equals(STATE_BUSY) && dynamic2.getType() == ReadableType.Boolean && dynamic2.asBoolean()) {
                    arrayList.add(t.getContext().getString(R.string.state_busy_description));
                }
            }
        }
        if (readableMap2 != null && readableMap2.hasKey("text") && (dynamic = readableMap2.getDynamic("text")) != null && dynamic.getType() == ReadableType.String) {
            arrayList.add(dynamic.asString());
        }
        if (arrayList.isEmpty()) {
            return;
        }
        t.setContentDescription(TextUtils.join(", ", arrayList));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(mkf mkfVar, T t) {
        super.addEventEmitters(mkfVar, t);
        View.OnFocusChangeListener onFocusChangeListener = t.getOnFocusChangeListener();
        a aVar = new a();
        aVar.a = onFocusChangeListener;
        t.setOnFocusChangeListener(aVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        gb9.a aVar = new gb9.a();
        aVar.a("topPointerCancel", gb9.a("phasedRegistrationNames", gb9.c("onPointerCancel", "onPointerCancelCapture")));
        aVar.a("topPointerDown", gb9.a("phasedRegistrationNames", gb9.c("onPointerDown", "onPointerDownCapture")));
        Boolean bool = Boolean.TRUE;
        aVar.a("topPointerEnter", gb9.a("phasedRegistrationNames", gb9.b("bubbled", "onPointerEnter", "captured", "onPointerEnterCapture", "skipBubbling", bool)));
        aVar.a("topPointerLeave", gb9.a("phasedRegistrationNames", gb9.b("bubbled", "onPointerLeave", "captured", "onPointerLeaveCapture", "skipBubbling", bool)));
        aVar.a("topPointerMove", gb9.a("phasedRegistrationNames", gb9.c("onPointerMove", "onPointerMoveCapture")));
        aVar.a("topPointerUp", gb9.a("phasedRegistrationNames", gb9.c("onPointerUp", "onPointerUpCapture")));
        aVar.a("topPointerOut", gb9.a("phasedRegistrationNames", gb9.c("onPointerOut", "onPointerOutCapture")));
        aVar.a("topPointerOver", gb9.a("phasedRegistrationNames", gb9.c("onPointerOver", "onPointerOverCapture")));
        aVar.a("topClick", gb9.a("phasedRegistrationNames", gb9.c("onClick", "onClickCapture")));
        aVar.a("topBlur", gb9.a("phasedRegistrationNames", gb9.c("onBlur", "onBlurCapture")));
        aVar.a("topFocus", gb9.a("phasedRegistrationNames", gb9.c("onFocus", "onFocusCapture")));
        if (!aVar.b) {
            r6.g("Underlying map has already been built");
            return null;
        }
        aVar.b = false;
        exportedCustomDirectEventTypeConstants.putAll(aVar.a);
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap();
        }
        HashMap map = new HashMap();
        map.put("topAccessibilityAction", gb9.a("registrationName", "onAccessibilityAction"));
        exportedCustomDirectEventTypeConstants.putAll(map);
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(T t) {
        super.onAfterUpdateTransaction(t);
        updateViewAccessibility(t);
        Boolean bool = (Boolean) t.getTag(R.id.invalidate_transform);
        if (bool != null && bool.booleanValue()) {
            t.addOnLayoutChangeListener(this);
            setTransformProperty(t, (ReadableArray) t.getTag(R.id.transform), (ReadableArray) t.getTag(R.id.transform_origin));
            t.setTag(R.id.invalidate_transform, Boolean.FALSE);
        }
        b.a(t, (ReadableArray) t.getTag(R.id.filter), (Boolean) t.getTag(R.id.use_hardware_layer));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(T t) {
        super.onDropViewInstance(t);
        View.OnFocusChangeListener onFocusChangeListener = t.getOnFocusChangeListener();
        if (onFocusChangeListener instanceof a) {
            t.setOnFocusChangeListener(((a) onFocusChangeListener).a);
        }
        if (t instanceof ViewGroup) {
            ((ViewGroup) t).setOnHierarchyChangeListener(null);
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i7 - i5;
        int i10 = i3 - i;
        if (i4 - i2 == i8 - i6 && i10 == i9) {
            return;
        }
        ReadableArray readableArray = (ReadableArray) view.getTag(R.id.transform_origin);
        ReadableArray readableArray2 = (ReadableArray) view.getTag(R.id.transform);
        if (readableArray2 == null && readableArray == null) {
            return;
        }
        setTransformProperty(view, readableArray2, readableArray);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public T prepareToRecycleView(mkf mkfVar, T t) {
        t.setTag(null);
        t.setTag(R.id.pointer_events, null);
        t.setTag(R.id.react_test_id, null);
        t.setTag(R.id.view_tag_native_id, null);
        t.setTag(R.id.labelled_by, null);
        t.setTag(R.id.accessibility_label, null);
        t.setTag(R.id.accessibility_hint, null);
        t.setTag(R.id.accessibility_role, null);
        t.setTag(R.id.accessibility_state, null);
        t.setTag(R.id.accessibility_actions, null);
        t.setTag(R.id.accessibility_value, null);
        t.setTag(R.id.accessibility_state_expanded, null);
        t.setTag(R.id.view_clipped, null);
        setTransformProperty(t, null, null);
        int i = Build.VERSION.SDK_INT;
        if (i < 28) {
            return null;
        }
        t.resetPivot();
        t.setTop(0);
        t.setBottom(0);
        t.setLeft(0);
        t.setRight(0);
        t.setElevation(0.0f);
        if (i >= 29) {
            t.setAnimationMatrix(null);
        }
        t.setTag(R.id.transform, null);
        t.setTag(R.id.transform_origin, null);
        t.setTag(R.id.invalidate_transform, null);
        t.removeOnLayoutChangeListener(this);
        t.setTag(R.id.use_hardware_layer, null);
        t.setTag(R.id.filter, null);
        t.setTag(R.id.mix_blend_mode, null);
        b.a(t, null, null);
        if (i >= 28) {
            t.setOutlineAmbientShadowColor(-16777216);
            t.setOutlineSpotShadowColor(-16777216);
        }
        t.setNextFocusDownId(-1);
        t.setNextFocusForwardId(-1);
        t.setNextFocusRightId(-1);
        t.setNextFocusUpId(-1);
        t.setFocusable(false);
        t.setFocusableInTouchMode(false);
        t.setElevation(0.0f);
        t.setAlpha(1.0f);
        setPadding(t, 0, 0, 0, 0);
        t.setForeground(null);
        return t;
    }

    @snc(name = "accessibilityActions")
    public void setAccessibilityActions(T t, ReadableArray readableArray) {
        if (readableArray == null) {
            return;
        }
        t.setTag(R.id.accessibility_actions, readableArray);
    }

    @snc(name = "accessibilityCollection")
    public void setAccessibilityCollection(T t, ReadableMap readableMap) {
        t.setTag(R.id.accessibility_collection, readableMap);
    }

    @snc(name = "accessibilityCollectionItem")
    public void setAccessibilityCollectionItem(T t, ReadableMap readableMap) {
        t.setTag(R.id.accessibility_collection_item, readableMap);
    }

    @snc(name = "accessibilityHint")
    public void setAccessibilityHint(T t, String str) {
        t.setTag(R.id.accessibility_hint, str);
        updateViewContentDescription(t);
    }

    @snc(name = "accessibilityLabel")
    public void setAccessibilityLabel(T t, String str) {
        t.setTag(R.id.accessibility_label, str);
        updateViewContentDescription(t);
    }

    @snc(name = "accessibilityLabelledBy")
    public void setAccessibilityLabelledBy(T t, Dynamic dynamic) {
        if (dynamic.isNull()) {
            return;
        }
        if (dynamic.getType() == ReadableType.String) {
            t.setTag(R.id.labelled_by, dynamic.asString());
        } else if (dynamic.getType() == ReadableType.Array) {
            t.setTag(R.id.labelled_by, dynamic.asArray().getString(0));
        }
    }

    @snc(name = "accessibilityLiveRegion")
    public void setAccessibilityLiveRegion(T t, String str) {
        if (str == null || str.equals("none")) {
            WeakHashMap<View, prg> weakHashMap = epg.a;
            t.setAccessibilityLiveRegion(0);
        } else if (str.equals("polite")) {
            WeakHashMap<View, prg> weakHashMap2 = epg.a;
            t.setAccessibilityLiveRegion(1);
        } else if (str.equals("assertive")) {
            WeakHashMap<View, prg> weakHashMap3 = epg.a;
            t.setAccessibilityLiveRegion(2);
        }
    }

    @snc(name = "accessibilityRole")
    public void setAccessibilityRole(T t, String str) {
        if (str == null) {
            t.setTag(R.id.accessibility_role, null);
        } else {
            t.setTag(R.id.accessibility_role, b.c.a(str));
        }
    }

    @snc(name = "accessibilityValue")
    public void setAccessibilityValue(T t, ReadableMap readableMap) {
        if (readableMap == null) {
            t.setTag(R.id.accessibility_value, null);
            t.setContentDescription(null);
        } else {
            t.setTag(R.id.accessibility_value, readableMap);
            if (readableMap.hasKey("text")) {
                updateViewContentDescription(t);
            }
        }
    }

    @snc(customType = "Color", defaultInt = 0, name = "backgroundColor")
    public void setBackgroundColor(T t, int i) {
        v71.j(t, Integer.valueOf(i));
    }

    public void setBorderBottomLeftRadius(T t, float f) {
        logUnsupportedPropertyWarning("borderBottomLeftRadius");
    }

    public void setBorderBottomRightRadius(T t, float f) {
        logUnsupportedPropertyWarning("borderBottomRightRadius");
    }

    public void setBorderRadius(T t, float f) {
        logUnsupportedPropertyWarning("borderRadius");
    }

    public void setBorderTopLeftRadius(T t, float f) {
        logUnsupportedPropertyWarning("borderTopLeftRadius");
    }

    public void setBorderTopRightRadius(T t, float f) {
        logUnsupportedPropertyWarning("borderTopRightRadius");
    }

    @snc(customType = "BoxShadow", name = "boxShadow")
    public void setBoxShadow(T t, ReadableArray readableArray) {
        t.getClass();
        if (readableArray == null) {
            v71.p(t, zr4.a);
            return;
        }
        ArrayList arrayList = new ArrayList();
        int size = readableArray.size();
        for (int i = 0; i < size; i++) {
            ReadableMap map = readableArray.getMap(i);
            Context context = t.getContext();
            context.getClass();
            nl1 nl1VarA = nl1.a.a(context, map);
            if (nl1VarA == null) {
                r6.g("Required value was null.");
                return;
            }
            arrayList.add(nl1VarA);
        }
        v71.p(t, arrayList);
    }

    @snc(name = "onClick")
    public void setClick(T t, boolean z) {
        setPointerEventsFlag(t, oeb.a.c, z);
    }

    @snc(name = "onClickCapture")
    public void setClickCapture(T t, boolean z) {
        setPointerEventsFlag(t, oeb.a.d, z);
    }

    @snc(name = "elevation")
    public void setElevation(T t, float f) {
        float fG = nn2.G(f);
        WeakHashMap<View, prg> weakHashMap = epg.a;
        epg.d.k(t, fG);
    }

    @snc(customType = "Filter", name = "filter")
    public void setFilter(T t, ReadableArray readableArray) {
        t.getClass();
        if (msb.e(t.getId()) == 2) {
            t.setTag(R.id.filter, readableArray);
        }
    }

    @snc(name = "importantForAccessibility")
    public void setImportantForAccessibility(T t, String str) {
        if (str == null || str.equals("auto")) {
            WeakHashMap<View, prg> weakHashMap = epg.a;
            t.setImportantForAccessibility(0);
            return;
        }
        if (str.equals("yes")) {
            WeakHashMap<View, prg> weakHashMap2 = epg.a;
            t.setImportantForAccessibility(1);
        } else if (str.equals("no")) {
            WeakHashMap<View, prg> weakHashMap3 = epg.a;
            t.setImportantForAccessibility(2);
        } else if (str.equals("no-hide-descendants")) {
            WeakHashMap<View, prg> weakHashMap4 = epg.a;
            t.setImportantForAccessibility(4);
        }
    }

    @snc(name = "mixBlendMode")
    public void setMixBlendMode(T t, String str) {
        t.getClass();
        if (msb.e(t.getId()) == 2) {
            t.setTag(R.id.mix_blend_mode, nh1.b(str));
            if (t.getParent() instanceof View) {
                ((View) t.getParent()).invalidate();
            }
        }
    }

    @snc(name = "onMoveShouldSetResponder")
    public void setMoveShouldSetResponder(T t, boolean z) {
    }

    @snc(name = "onMoveShouldSetResponderCapture")
    public void setMoveShouldSetResponderCapture(T t, boolean z) {
    }

    @snc(name = "nativeID")
    public void setNativeId(T t, String str) {
        t.setTag(R.id.view_tag_native_id, str);
        ArrayList arrayList = mkc.a;
        Object tag = t.getTag(R.id.view_tag_native_id);
        String str2 = tag instanceof String ? (String) tag : null;
        if (str2 == null) {
            return;
        }
        Iterator it = mkc.a.iterator();
        while (it.hasNext()) {
            mkc.b bVar = (mkc.b) it.next();
            if (str2.equals(bVar.b())) {
                bVar.a();
                it.remove();
            }
        }
        for (Map.Entry entry : mkc.b.entrySet()) {
            mkc.a aVar = (mkc.a) entry.getKey();
            if (((Set) entry.getValue()).contains(str2)) {
                aVar.a();
            }
        }
    }

    @snc(defaultFloat = 1.0f, name = "opacity")
    public void setOpacity(T t, float f) {
        t.setAlpha(f);
    }

    @snc(customType = "Color", name = "outlineColor")
    public void setOutlineColor(T t, Integer num) {
        int iIntValue;
        t.getClass();
        if (msb.e(t.getId()) != 2) {
            return;
        }
        kwa kwaVarF = v71.f(t);
        if (num == null || (iIntValue = num.intValue()) == kwaVarF.f) {
            return;
        }
        kwaVarF.f = iIntValue;
        kwaVarF.h.setColor(iIntValue);
        kwaVarF.invalidateSelf();
    }

    @snc(name = "outlineOffset")
    public void setOutlineOffset(T t, float f) {
        t.getClass();
        if (msb.e(t.getId()) != 2) {
            return;
        }
        kwa kwaVarF = v71.f(t);
        float fG = nn2.G(f);
        if (fG == kwaVarF.d) {
            return;
        }
        kwaVarF.d = fG;
        kwaVarF.invalidateSelf();
    }

    @snc(name = "outlineStyle")
    public void setOutlineStyle(T t, String str) {
        mwa mwaVar = null;
        if (str != null) {
            mwa.a.getClass();
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            int iHashCode = lowerCase.hashCode();
            if (iHashCode != -1338941519) {
                if (iHashCode != -1325970902) {
                    if (iHashCode == 109618859 && lowerCase.equals("solid")) {
                        mwaVar = mwa.b;
                    }
                } else if (lowerCase.equals("dotted")) {
                    mwaVar = mwa.d;
                }
            } else if (lowerCase.equals("dashed")) {
                mwaVar = mwa.c;
            }
        }
        t.getClass();
        if (msb.e(t.getId()) != 2) {
            return;
        }
        kwa kwaVarF = v71.f(t);
        if (mwaVar == null || mwaVar == kwaVarF.e) {
            return;
        }
        kwaVarF.e = mwaVar;
        kwaVarF.h.setPathEffect(kwa.b(mwaVar, kwaVarF.g));
        kwaVarF.invalidateSelf();
    }

    @snc(name = "outlineWidth")
    public void setOutlineWidth(T t, float f) {
        t.getClass();
        if (msb.e(t.getId()) != 2) {
            return;
        }
        kwa kwaVarF = v71.f(t);
        float fG = nn2.G(f);
        Paint paint = kwaVarF.h;
        if (fG == kwaVarF.g) {
            return;
        }
        kwaVarF.g = fG;
        paint.setStrokeWidth(fG);
        paint.setPathEffect(kwa.b(kwaVarF.e, fG));
        kwaVarF.invalidateSelf();
    }

    @snc(name = "onPointerEnter")
    public void setPointerEnter(T t, boolean z) {
        setPointerEventsFlag(t, oeb.a.V, z);
    }

    @snc(name = "onPointerEnterCapture")
    public void setPointerEnterCapture(T t, boolean z) {
        setPointerEventsFlag(t, oeb.a.W, z);
    }

    @snc(name = "onPointerLeave")
    public void setPointerLeave(T t, boolean z) {
        setPointerEventsFlag(t, oeb.a.X, z);
    }

    @snc(name = "onPointerLeaveCapture")
    public void setPointerLeaveCapture(T t, boolean z) {
        setPointerEventsFlag(t, oeb.a.Y, z);
    }

    @snc(name = "onPointerMove")
    public void setPointerMove(T t, boolean z) {
        setPointerEventsFlag(t, oeb.a.Z, z);
    }

    @snc(name = "onPointerMoveCapture")
    public void setPointerMoveCapture(T t, boolean z) {
        setPointerEventsFlag(t, oeb.a.a0, z);
    }

    @snc(name = "onPointerOut")
    public void setPointerOut(T t, boolean z) {
        setPointerEventsFlag(t, oeb.a.d0, z);
    }

    @snc(name = "onPointerOutCapture")
    public void setPointerOutCapture(T t, boolean z) {
        setPointerEventsFlag(t, oeb.a.e0, z);
    }

    @snc(name = "onPointerOver")
    public void setPointerOver(T t, boolean z) {
        setPointerEventsFlag(t, oeb.a.f0, z);
    }

    @snc(name = "onPointerOverCapture")
    public void setPointerOverCapture(T t, boolean z) {
        setPointerEventsFlag(t, oeb.a.g0, z);
    }

    @snc(name = "renderToHardwareTextureAndroid")
    public void setRenderToHardwareTexture(T t, boolean z) {
        t.setTag(R.id.use_hardware_layer, Boolean.valueOf(z));
    }

    @snc(name = "onResponderEnd")
    public void setResponderEnd(T t, boolean z) {
    }

    @snc(name = "onResponderGrant")
    public void setResponderGrant(T t, boolean z) {
    }

    @snc(name = "onResponderMove")
    public void setResponderMove(T t, boolean z) {
    }

    @snc(name = "onResponderReject")
    public void setResponderReject(T t, boolean z) {
    }

    @snc(name = "onResponderRelease")
    public void setResponderRelease(T t, boolean z) {
    }

    @snc(name = "onResponderStart")
    public void setResponderStart(T t, boolean z) {
    }

    @snc(name = "onResponderTerminate")
    public void setResponderTerminate(T t, boolean z) {
    }

    @snc(name = "onResponderTerminationRequest")
    public void setResponderTerminationRequest(T t, boolean z) {
    }

    @snc(name = "role")
    public void setRole(T t, String str) {
        Object obj = null;
        if (str == null) {
            t.setTag(R.id.role, null);
            return;
        }
        b.d[] dVarArrValues = b.d.values();
        int length = dVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            b.d dVar = dVarArrValues[i];
            if (dVar.name().equalsIgnoreCase(str)) {
                obj = dVar;
                break;
            }
            i++;
        }
        t.setTag(R.id.role, obj);
    }

    @Deprecated
    @snc(name = "rotation")
    public void setRotation(T t, float f) {
        t.setRotation(f);
    }

    @Deprecated
    @snc(defaultFloat = 1.0f, name = "scaleX")
    public void setScaleX(T t, float f) {
        t.setScaleX(f);
    }

    @Deprecated
    @snc(defaultFloat = 1.0f, name = "scaleY")
    public void setScaleY(T t, float f) {
        t.setScaleY(f);
    }

    @snc(name = "screenReaderFocusable")
    public void setScreenReaderFocusable(T t, boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            t.setScreenReaderFocusable(z);
        }
    }

    @snc(customType = "Color", defaultInt = -16777216, name = "shadowColor")
    public void setShadowColor(T t, int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            t.setOutlineAmbientShadowColor(i);
            t.setOutlineSpotShadowColor(i);
        }
    }

    @snc(name = "onShouldBlockNativeResponder")
    public void setShouldBlockNativeResponder(T t, boolean z) {
    }

    @snc(name = "onStartShouldSetResponder")
    public void setStartShouldSetResponder(T t, boolean z) {
    }

    @snc(name = "onStartShouldSetResponderCapture")
    public void setStartShouldSetResponderCapture(T t, boolean z) {
    }

    @snc(name = "testID")
    public void setTestId(T t, String str) {
        t.setTag(R.id.react_test_id, str);
        t.setTag(str);
    }

    @snc(name = "onTouchCancel")
    public void setTouchCancel(T t, boolean z) {
    }

    @snc(name = "onTouchEnd")
    public void setTouchEnd(T t, boolean z) {
    }

    @snc(name = "onTouchMove")
    public void setTouchMove(T t, boolean z) {
    }

    @snc(name = "onTouchStart")
    public void setTouchStart(T t, boolean z) {
    }

    @snc(name = "transform")
    public void setTransform(T t, ReadableArray readableArray) {
        if (Objects.equals((ReadableArray) t.getTag(R.id.transform), readableArray)) {
            return;
        }
        t.setTag(R.id.transform, readableArray);
        t.setTag(R.id.invalidate_transform, Boolean.TRUE);
    }

    @snc(name = "transformOrigin")
    public void setTransformOrigin(T t, ReadableArray readableArray) {
        if (Objects.equals((ReadableArray) t.getTag(R.id.transform_origin), readableArray)) {
            return;
        }
        t.setTag(R.id.transform_origin, readableArray);
        t.setTag(R.id.invalidate_transform, Boolean.TRUE);
    }

    public void setTransformProperty(T t, ReadableArray readableArray, ReadableArray readableArray2) {
        if (readableArray == null) {
            t.setTranslationX(nn2.G(0.0f));
            t.setTranslationY(nn2.G(0.0f));
            t.setRotation(0.0f);
            t.setRotationX(0.0f);
            t.setRotationY(0.0f);
            t.setScaleX(1.0f);
            t.setScaleY(1.0f);
            t.setCameraDistance(0.0f);
            return;
        }
        t.getClass();
        boolean z = msb.e(t.getId()) == 2;
        a.C0134a c0134a = sMatrixDecompositionContext;
        double[] dArr = c0134a.a;
        double[] dArr2 = c0134a.d;
        double[] dArr3 = c0134a.b;
        double[] dArr4 = c0134a.e;
        a.C0134a.C0135a.a(dArr);
        a.C0134a.C0135a.a(dArr3);
        a.C0134a.C0135a.a(c0134a.c);
        a.C0134a.C0135a.a(dArr2);
        a.C0134a.C0135a.a(dArr4);
        double[] dArr5 = sTransformDecompositionArray;
        TransformHelper.c(readableArray, dArr5, nn2.C(t.getWidth()), nn2.C(t.getHeight()), readableArray2, z);
        com.facebook.react.uimanager.a.a(dArr5, c0134a);
        t.setTranslationX(nn2.G(sanitizeFloatPropertyValue((float) dArr2[0])));
        t.setTranslationY(nn2.G(sanitizeFloatPropertyValue((float) dArr2[1])));
        t.setRotation(sanitizeFloatPropertyValue((float) dArr4[2]));
        t.setRotationX(sanitizeFloatPropertyValue((float) dArr4[0]));
        t.setRotationY(sanitizeFloatPropertyValue((float) dArr4[1]));
        t.setScaleX(sanitizeFloatPropertyValue((float) dArr3[0]));
        t.setScaleY(sanitizeFloatPropertyValue((float) dArr3[1]));
        double[] dArr6 = c0134a.a;
        if (dArr6.length > 2) {
            float f = (float) dArr6[2];
            if (f == 0.0f) {
                f = 7.8125E-4f;
            }
            float f2 = (-1.0f) / f;
            float f3 = c74.c().density;
            t.setCameraDistance(sanitizeFloatPropertyValue(f3 * f3 * f2 * CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
        }
    }

    @Deprecated
    @snc(defaultFloat = 0.0f, name = "translateX")
    public void setTranslateX(T t, float f) {
        t.setTranslationX(nn2.G(f));
    }

    @Deprecated
    @snc(defaultFloat = 0.0f, name = "translateY")
    public void setTranslateY(T t, float f) {
        t.setTranslationY(nn2.G(f));
    }

    @snc(name = "accessibilityState")
    public void setViewState(T t, ReadableMap readableMap) {
        if (readableMap == null) {
            return;
        }
        if (readableMap.hasKey(STATE_EXPANDED)) {
            t.setTag(R.id.accessibility_state_expanded, Boolean.valueOf(readableMap.getBoolean(STATE_EXPANDED)));
        }
        if (readableMap.hasKey("selected")) {
            boolean zIsSelected = t.isSelected();
            boolean z = readableMap.getBoolean("selected");
            t.setSelected(z);
            if (t.isAccessibilityFocused() && zIsSelected && !z) {
                t.announceForAccessibility(t.getContext().getString(R.string.state_unselected_description));
            }
        } else {
            t.setSelected(false);
        }
        t.setTag(R.id.accessibility_state, readableMap);
        if (readableMap.hasKey("disabled") && !readableMap.getBoolean("disabled")) {
            t.setEnabled(true);
        }
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            if (strNextKey.equals(STATE_BUSY) || strNextKey.equals(STATE_EXPANDED) || (strNextKey.equals(STATE_CHECKED) && readableMap.getType(STATE_CHECKED) == ReadableType.String)) {
                updateViewContentDescription(t);
                return;
            } else if (t.isAccessibilityFocused()) {
                t.sendAccessibilityEvent(1);
            }
        }
    }

    @snc(name = "zIndex")
    public void setZIndex(T t, float f) {
        ViewGroupManager.setViewZIndex(t, Math.round(f));
        ViewParent parent = t.getParent();
        if (parent instanceof zpc) {
            ((zpc) parent).updateDrawingOrder();
        }
    }

    public void updateViewAccessibility(T t) {
        boolean zIsFocusable = t.isFocusable();
        int importantForAccessibility = t.getImportantForAccessibility();
        HashMap<String, Integer> map = com.facebook.react.uimanager.b.u;
        if (epg.e(t) != null) {
            return;
        }
        if (t.getTag(R.id.accessibility_role) == null && t.getTag(R.id.accessibility_state) == null && t.getTag(R.id.accessibility_actions) == null && t.getTag(R.id.react_test_id) == null && t.getTag(R.id.accessibility_collection_item) == null && t.getTag(R.id.accessibility_links) == null && t.getTag(R.id.role) == null) {
            return;
        }
        epg.o(t, new com.facebook.react.uimanager.b(t, importantForAccessibility, zIsFocusable));
    }

    public BaseViewManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
