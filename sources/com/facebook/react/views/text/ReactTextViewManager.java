package com.facebook.react.views.text;

import android.text.Spannable;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import com.facebook.react.views.text.a;
import com.indeed.android.jobsearch.R;
import defpackage.epg;
import defpackage.fxa;
import defpackage.ie7;
import defpackage.j6;
import defpackage.j6g;
import defpackage.k3f;
import defpackage.kc9;
import defpackage.mkf;
import defpackage.mpc;
import defpackage.nmc;
import defpackage.noc;
import defpackage.npc;
import defpackage.opc;
import defpackage.phf;
import defpackage.pi3;
import defpackage.ppc;
import defpackage.snc;
import defpackage.vse;
import defpackage.wo6;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@nmc(name = "RCTText")
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\b\u0007\u0018\u0000 D2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001EB\u0015\b\u0007\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0002H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010!\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b!\u0010#J\u0015\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b'\u0010\u001aJ\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J)\u0010-\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\u001d\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e\u0018\u00010/H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020\u00182\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J7\u0010;\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\b2\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u0002062\u0006\u00109\u001a\u0002062\u0006\u0010:\u001a\u000206H\u0016¢\u0006\u0004\b;\u0010<J!\u0010>\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\b2\b\u0010=\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0004\b>\u0010?R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010\u0007¨\u0006F"}, d2 = {"Lcom/facebook/react/views/text/ReactTextViewManager;", "Lcom/facebook/react/views/text/ReactTextAnchorViewManager;", "Lmpc;", "Lwo6;", "Lppc;", "reactTextViewManagerCallback", "<init>", "(Lppc;)V", "Lopc;", "view", "Lnoc;", "props", "Lcom/facebook/react/common/mapbuffer/a;", "state", "", "getReactTextUpdate", "(Lopc;Lnoc;Lcom/facebook/react/common/mapbuffer/a;)Ljava/lang/Object;", "Lmkf;", "reactContext", "prepareToRecycleView", "(Lmkf;Lopc;)Lopc;", "", "getName", "()Ljava/lang/String;", "Lj6g;", "updateViewAccessibility", "(Lopc;)V", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "createViewInstance", "(Lmkf;)Lopc;", "extraData", "updateExtraData", "(Lopc;Ljava/lang/Object;)V", "createShadowNodeInstance", "()Lmpc;", "(Lppc;)Lmpc;", "Ljava/lang/Class;", "getShadowNodeClass", "()Ljava/lang/Class;", "onAfterUpdateTransaction", "", "needsCustomLayoutForChildren", "()Z", "Lvse;", "stateWrapper", "updateState", "(Lopc;Lnoc;Lvse;)Ljava/lang/Object;", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "Landroid/text/Spannable;", "text", "onPostProcessSpannable", "(Landroid/text/Spannable;)V", "", GesturesListener.SCROLL_DIRECTION_LEFT, "top", GesturesListener.SCROLL_DIRECTION_RIGHT, "bottom", "setPadding", "(Lopc;IIII)V", "overflow", "setOverflow", "(Lopc;Ljava/lang/String;)V", "Lppc;", "getReactTextViewManagerCallback", "()Lppc;", "setReactTextViewManagerCallback", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactTextViewManager extends ReactTextAnchorViewManager<mpc> implements wo6, ppc {
    public static final String REACT_CLASS = "RCTText";
    private static final short TX_STATE_KEY_ATTRIBUTED_STRING = 0;
    private static final short TX_STATE_KEY_PARAGRAPH_ATTRIBUTES = 1;
    private ppc reactTextViewManagerCallback;

    public ReactTextViewManager(ppc ppcVar) {
        this.reactTextViewManagerCallback = ppcVar;
        if (ie7.g0.enableViewRecyclingForText()) {
            setupViewRecycling();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object getReactTextUpdate(defpackage.opc r20, defpackage.noc r21, com.facebook.react.common.mapbuffer.a r22) {
        /*
            r19 = this;
            r0 = r20
            r1 = r22
            r2 = 0
            com.facebook.react.common.mapbuffer.a r3 = r1.j0(r2)
            r4 = 1
            com.facebook.react.common.mapbuffer.a r1 = r1.j0(r4)
            lif r5 = defpackage.lif.a
            android.content.Context r6 = r0.getContext()
            r6.getClass()
            r7 = r19
            ppc r7 = r7.reactTextViewManagerCallback
            r5.getClass()
            android.text.Spannable r9 = defpackage.lif.g(r6, r3, r7)
            r0.setSpanned(r9)
            r5 = 6
            double r5 = r1.getDouble(r5)
            float r5 = (float) r5
            r0.setMinimumFontSize(r5)
            r5 = 2
            java.lang.String r1 = r1.getString(r5)
            java.lang.String r6 = "balanced"
            boolean r6 = r1.equals(r6)
            if (r6 != 0) goto L49
            java.lang.String r6 = "simple"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L46
            r17 = r4
            goto L4b
        L46:
            r17 = r2
            goto L4b
        L49:
            r17 = r5
        L4b:
            int r0 = r0.getJustificationMode()
            npc r8 = new npc
            java.lang.String r1 = defpackage.lif.i(r3)
            android.text.Layout$Alignment r1 = defpackage.lif.h(r3, r9, r1)
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            int r6 = r9.length()
            boolean r2 = r3.isRtl(r9, r2, r6)
            int[] r3 = lif.c.a
            int r1 = r1.ordinal()
            r1 = r3[r1]
            r3 = 5
            r6 = 3
            if (r1 == r4) goto L89
            if (r1 == r5) goto L7d
            if (r1 != r6) goto L78
            r1 = r21
            r16 = r4
            goto L8c
        L78:
            defpackage.l.g()
            r0 = 0
            return r0
        L7d:
            if (r2 == 0) goto L84
        L7f:
            r1 = r21
            r16 = r6
            goto L8c
        L84:
            r1 = r21
            r16 = r3
            goto L8c
        L89:
            if (r2 == 0) goto L7f
            goto L84
        L8c:
            int r18 = defpackage.qcf.c(r0, r1)
            r14 = -1082130432(0xffffffffbf800000, float:-1.0)
            r15 = -1082130432(0xffffffffbf800000, float:-1.0)
            r10 = -1
            r11 = 0
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            r13 = -1082130432(0xffffffffbf800000, float:-1.0)
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.ReactTextViewManager.getReactTextUpdate(opc, noc, com.facebook.react.common.mapbuffer.a):java.lang.Object");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public mpc createShadowNodeInstance() {
        return new mpc(this.reactTextViewManagerCallback);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public opc createViewInstance(mkf context) {
        context.getClass();
        opc opcVar = new opc(context);
        opcVar.c0 = fxa.b;
        opcVar.e();
        return opcVar;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(kc9.W(new Pair("topTextLayout", j6.c("registrationName", "onTextLayout"))));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RCTText";
    }

    public final ppc getReactTextViewManagerCallback() {
        return this.reactTextViewManagerCallback;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<mpc> getShadowNodeClass() {
        return mpc.class;
    }

    @Override // defpackage.wo6
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(opc view) {
        view.getClass();
        super.onAfterUpdateTransaction(view);
        view.setEllipsize((view.b == Integer.MAX_VALUE || view.d) ? null : view.c);
    }

    @Override // defpackage.ppc
    public void onPostProcessSpannable(Spannable text) {
        text.getClass();
        ppc ppcVar = this.reactTextViewManagerCallback;
        if (ppcVar != null) {
            ppcVar.onPostProcessSpannable(text);
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public opc prepareToRecycleView(mkf reactContext, opc view) {
        reactContext.getClass();
        view.getClass();
        opc opcVar = (opc) super.prepareToRecycleView(reactContext, view);
        if (opcVar != null) {
            opcVar.f();
            setSelectionColor$ReactAndroid_release(opcVar, null);
        }
        return opcVar;
    }

    @snc(name = "overflow")
    public final void setOverflow(opc view, String overflow) {
        view.getClass();
        view.setOverflow(overflow);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void setPadding(opc view, int left, int top, int right, int bottom) {
        view.getClass();
        view.setPadding(left, top, right, bottom);
    }

    public final void setReactTextViewManagerCallback(ppc ppcVar) {
        this.reactTextViewManagerCallback = ppcVar;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(opc view, Object extraData) {
        view.getClass();
        extraData.getClass();
        k3f k3fVar = new k3f("ReactTextViewManager.updateExtraData");
        try {
            npc npcVar = (npc) extraData;
            Spannable spannable = npcVar.a;
            if (npcVar.c) {
                int i = phf.a;
                phf.a.a(spannable, view);
            }
            view.setText(npcVar);
            a.C0143a c0143a = new a.C0143a(spannable);
            if (c0143a.a.size() <= 0) {
                c0143a = null;
            }
            view.setTag(R.id.accessibility_links, c0143a);
            int i2 = a.y;
            epg.o(view, new a(view, view.getImportantForAccessibility(), view.isFocusable()));
            j6g j6gVar = j6g.a;
            pi3.d(k3fVar, null);
        } finally {
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(opc view, noc props, vse stateWrapper) {
        view.getClass();
        props.getClass();
        stateWrapper.getClass();
        k3f k3fVar = new k3f("ReactTextViewManager.updateState");
        try {
            ReadableMapBuffer stateDataMapBuffer = stateWrapper.getStateDataMapBuffer();
            Object reactTextUpdate = stateDataMapBuffer != null ? getReactTextUpdate(view, props, stateDataMapBuffer) : null;
            pi3.d(k3fVar, null);
            return reactTextUpdate;
        } finally {
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    public void updateViewAccessibility(opc view) {
        view.getClass();
        int i = a.y;
        a.b.a(view, view.getImportantForAccessibility(), view.isFocusable());
    }

    public final mpc createShadowNodeInstance(ppc reactTextViewManagerCallback) {
        return new mpc(reactTextViewManagerCallback);
    }

    public /* synthetic */ ReactTextViewManager(ppc ppcVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : ppcVar);
    }

    public ReactTextViewManager() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
