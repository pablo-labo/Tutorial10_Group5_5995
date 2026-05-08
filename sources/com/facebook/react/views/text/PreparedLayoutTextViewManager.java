package com.facebook.react.views.text;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.view.View;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.views.text.a;
import com.indeed.android.jobsearch.R;
import defpackage.cj1;
import defpackage.epg;
import defpackage.fxa;
import defpackage.j6g;
import defpackage.k3f;
import defpackage.kc9;
import defpackage.mkf;
import defpackage.nmc;
import defpackage.noc;
import defpackage.o49;
import defpackage.ou8;
import defpackage.pi3;
import defpackage.ppc;
import defpackage.pq3;
import defpackage.pu8;
import defpackage.ruc;
import defpackage.snc;
import defpackage.tl2;
import defpackage.tnc;
import defpackage.v71;
import defpackage.vo6;
import defpackage.vse;
import defpackage.xm8;
import defpackage.zi1;
import defpackage.zr4;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@nmc(name = "RCTText")
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 Y2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00020\u00042\u00020\u0005:\u0001ZB\u0015\b\u0017\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001f\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00170!H\u0016¢\u0006\u0004\b\"\u0010#J!\u0010%\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b%\u0010&J\u001f\u0010)\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'H\u0007¢\u0006\u0004\b)\u0010*J\u001f\u0010,\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010+\u001a\u00020'H\u0007¢\u0006\u0004\b,\u0010*J!\u0010/\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010.\u001a\u0004\u0018\u00010-H\u0007¢\u0006\u0004\b/\u00100J'\u00104\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u00101\u001a\u00020-2\u0006\u00103\u001a\u000202H\u0007¢\u0006\u0004\b4\u00105J!\u00107\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00022\b\u00106\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b7\u0010&J'\u00109\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u00101\u001a\u00020-2\u0006\u00108\u001a\u000202H\u0007¢\u0006\u0004\b9\u00105J)\u0010:\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u00101\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010-H\u0007¢\u0006\u0004\b:\u0010;J\u001f\u0010=\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010<\u001a\u00020'H\u0007¢\u0006\u0004\b=\u0010*J7\u0010B\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010>\u001a\u00020-2\u0006\u0010?\u001a\u00020-2\u0006\u0010@\u001a\u00020-2\u0006\u0010A\u001a\u00020-H\u0016¢\u0006\u0004\bB\u0010CJ\u0017\u0010E\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030DH\u0016¢\u0006\u0004\bE\u0010FJ'\u0010J\u001a\u00020\u00112\u0006\u0010G\u001a\u00020\u00022\u0006\u0010I\u001a\u00020H2\u0006\u00101\u001a\u00020-H\u0016¢\u0006\u0004\bJ\u0010KJ!\u0010L\u001a\u0004\u0018\u00010H2\u0006\u0010G\u001a\u00020\u00022\u0006\u00101\u001a\u00020-H\u0016¢\u0006\u0004\bL\u0010MJ\u001f\u0010N\u001a\u00020\u00112\u0006\u0010G\u001a\u00020\u00022\u0006\u00101\u001a\u00020-H\u0016¢\u0006\u0004\bN\u0010OJ\u0017\u0010P\u001a\u00020-2\u0006\u0010G\u001a\u00020\u0002H\u0016¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020'H\u0016¢\u0006\u0004\bR\u0010SJ\u0017\u0010V\u001a\u00020\u00112\u0006\u0010U\u001a\u00020TH\u0016¢\u0006\u0004\bV\u0010WR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010X¨\u0006["}, d2 = {"Lcom/facebook/react/views/text/PreparedLayoutTextViewManager;", "Lcom/facebook/react/uimanager/BaseViewManager;", "Lcom/facebook/react/views/text/PreparedLayoutTextView;", "Lxm8;", "Lvo6;", "Lppc;", "reactTextViewManagerCallback", "<init>", "(Lppc;)V", "Lmkf;", "reactContext", "view", "prepareToRecycleView", "(Lmkf;Lcom/facebook/react/views/text/PreparedLayoutTextView;)Lcom/facebook/react/views/text/PreparedLayoutTextView;", "", "getName", "()Ljava/lang/String;", "Lj6g;", "updateViewAccessibility", "(Lcom/facebook/react/views/text/PreparedLayoutTextView;)V", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "createViewInstance", "(Lmkf;)Lcom/facebook/react/views/text/PreparedLayoutTextView;", "", "extraData", "updateExtraData", "(Lcom/facebook/react/views/text/PreparedLayoutTextView;Ljava/lang/Object;)V", "Lnoc;", "props", "Lvse;", "stateWrapper", "updateState", "(Lcom/facebook/react/views/text/PreparedLayoutTextView;Lnoc;Lvse;)Ljava/lang/Object;", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "overflow", "setOverflow", "(Lcom/facebook/react/views/text/PreparedLayoutTextView;Ljava/lang/String;)V", "", "accessible", "setAccessible", "(Lcom/facebook/react/views/text/PreparedLayoutTextView;Z)V", "isSelectable", "setSelectable", "", "color", "setSelectionColor", "(Lcom/facebook/react/views/text/PreparedLayoutTextView;Ljava/lang/Integer;)V", "index", "", "borderRadius", "setBorderRadius", "(Lcom/facebook/react/views/text/PreparedLayoutTextView;IF)V", "borderStyle", "setBorderStyle", "width", "setBorderWidth", "setBorderColor", "(Lcom/facebook/react/views/text/PreparedLayoutTextView;ILjava/lang/Integer;)V", "disabled", "setDisabled", GesturesListener.SCROLL_DIRECTION_LEFT, "top", GesturesListener.SCROLL_DIRECTION_RIGHT, "bottom", "setPadding", "(Lcom/facebook/react/views/text/PreparedLayoutTextView;IIII)V", "Ljava/lang/Class;", "getShadowNodeClass", "()Ljava/lang/Class;", "parent", "Landroid/view/View;", "child", "addView", "(Lcom/facebook/react/views/text/PreparedLayoutTextView;Landroid/view/View;I)V", "getChildAt", "(Lcom/facebook/react/views/text/PreparedLayoutTextView;I)Landroid/view/View;", "removeViewAt", "(Lcom/facebook/react/views/text/PreparedLayoutTextView;I)V", "getChildCount", "(Lcom/facebook/react/views/text/PreparedLayoutTextView;)I", "needsCustomLayoutForChildren", "()Z", "Landroid/text/Spannable;", "text", "onPostProcessSpannable", "(Landroid/text/Spannable;)V", "Lppc;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PreparedLayoutTextViewManager extends BaseViewManager<PreparedLayoutTextView, xm8> implements vo6<PreparedLayoutTextView>, ppc {
    public static final String REACT_CLASS = "RCTText";
    private final ppc reactTextViewManagerCallback;

    public /* synthetic */ PreparedLayoutTextViewManager(ppc ppcVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : ppcVar);
    }

    @Override // defpackage.vo6
    public void addView(PreparedLayoutTextView parent, View child, int index) {
        parent.getClass();
        child.getClass();
        parent.addView(child, index);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public PreparedLayoutTextView createViewInstance(mkf context) {
        context.getClass();
        PreparedLayoutTextView preparedLayoutTextView = new PreparedLayoutTextView(context);
        preparedLayoutTextView.overflow = fxa.c;
        preparedLayoutTextView.a = zr4.a;
        preparedLayoutTextView.b = null;
        preparedLayoutTextView.setPreparedLayout(null);
        preparedLayoutTextView.setWillNotDraw(false);
        return preparedLayoutTextView;
    }

    @Override // defpackage.vo6
    public View getChildAt(PreparedLayoutTextView parent, int index) {
        parent.getClass();
        return parent.getChildAt(index);
    }

    @Override // defpackage.vo6
    public int getChildCount(PreparedLayoutTextView parent) {
        parent.getClass();
        return parent.getChildCount();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.put("topTextLayout", kc9.W(new Pair("registrationName", "onTextLayout")));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RCTText";
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<? extends xm8> getShadowNodeClass() {
        return xm8.class;
    }

    @Override // defpackage.wo6
    public boolean needsCustomLayoutForChildren() {
        return false;
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
    public PreparedLayoutTextView prepareToRecycleView(mkf reactContext, PreparedLayoutTextView view) {
        reactContext.getClass();
        view.getClass();
        PreparedLayoutTextView preparedLayoutTextView = (PreparedLayoutTextView) super.prepareToRecycleView(reactContext, view);
        if (preparedLayoutTextView != null) {
            preparedLayoutTextView.a = zr4.a;
            preparedLayoutTextView.b = null;
            preparedLayoutTextView.setPreparedLayout(null);
            if (preparedLayoutTextView.getBackground() instanceof tl2) {
                Drawable background = preparedLayoutTextView.getBackground();
                background.getClass();
                preparedLayoutTextView.setBackground(((tl2) background).b);
            }
            preparedLayoutTextView.setOverflow(fxa.c);
        }
        return preparedLayoutTextView;
    }

    @Override // defpackage.vo6
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @Override // defpackage.vo6
    public void removeViewAt(PreparedLayoutTextView parent, int index) {
        parent.getClass();
        parent.removeViewAt(index);
    }

    @snc(name = "accessible")
    public final void setAccessible(PreparedLayoutTextView view, boolean accessible) {
        view.getClass();
        view.setFocusable(accessible);
    }

    @tnc(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor", "borderStartColor", "borderEndColor", "borderBlockColor", "borderBlockEndColor", "borderBlockStartColor"})
    public final void setBorderColor(PreparedLayoutTextView view, int index, Integer color) {
        view.getClass();
        v71.l(view, o49.values()[index], color);
    }

    @tnc(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public final void setBorderRadius(PreparedLayoutTextView view, int index, float borderRadius) {
        view.getClass();
        v71.m(view, zi1.values()[index], Float.isNaN(borderRadius) ? null : new ou8(borderRadius, pu8.a));
    }

    @snc(name = "borderStyle")
    public final void setBorderStyle(PreparedLayoutTextView view, String borderStyle) {
        cj1 cj1VarA;
        view.getClass();
        if (borderStyle == null) {
            cj1VarA = null;
        } else {
            cj1.a.getClass();
            cj1VarA = cj1.a.a(borderStyle);
        }
        v71.n(view, cj1VarA);
    }

    @tnc(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth", "borderStartWidth", "borderEndWidth"})
    public final void setBorderWidth(PreparedLayoutTextView view, int index, float width) {
        view.getClass();
        v71.o(view, o49.values()[index], Float.valueOf(width));
    }

    @snc(defaultBoolean = false, name = "disabled")
    public final void setDisabled(PreparedLayoutTextView view, boolean disabled) {
        view.getClass();
        view.setEnabled(!disabled);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
    @defpackage.snc(name = "overflow")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setOverflow(com.facebook.react.views.text.PreparedLayoutTextView r1, java.lang.String r2) {
        /*
            r0 = this;
            r1.getClass()
            if (r2 == 0) goto L10
            fxa$a r0 = defpackage.fxa.a
            r0.getClass()
            fxa r0 = fxa.a.a(r2)
            if (r0 != 0) goto L12
        L10:
            fxa r0 = defpackage.fxa.c
        L12:
            r1.setOverflow(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.PreparedLayoutTextViewManager.setOverflow(com.facebook.react.views.text.PreparedLayoutTextView, java.lang.String):void");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void setPadding(PreparedLayoutTextView view, int left, int top, int right, int bottom) {
        view.getClass();
        view.setPadding(left, top, right, bottom);
    }

    @snc(defaultBoolean = false, name = "selectable")
    public final void setSelectable(PreparedLayoutTextView view, boolean isSelectable) {
        view.getClass();
    }

    @snc(customType = "Color", name = "selectionColor")
    public final void setSelectionColor(PreparedLayoutTextView view, Integer color) {
        view.getClass();
        if (color != null) {
            view.setSelectionColor(color);
            return;
        }
        Context context = view.getContext();
        context.getClass();
        view.setSelectionColor(Integer.valueOf(pq3.a(context)));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(PreparedLayoutTextView view, Object extraData) {
        view.getClass();
        extraData.getClass();
        k3f k3fVar = new k3f("PreparedLayoutTextViewManager.updateExtraData");
        try {
            PreparedLayout preparedLayout = (PreparedLayout) extraData;
            Layout layout = preparedLayout.a;
            view.setPreparedLayout(preparedLayout);
            if (layout.getText() instanceof Spanned) {
                CharSequence text = layout.getText();
                text.getClass();
                a.C0143a c0143a = new a.C0143a((Spanned) text);
                if (c0143a.a.size() <= 0) {
                    c0143a = null;
                }
                view.setTag(R.id.accessibility_links, c0143a);
                int i = a.y;
                epg.o(view, new a(view, view.getImportantForAccessibility(), view.isFocusable()));
            }
            j6g j6gVar = j6g.a;
            pi3.d(k3fVar, null);
        } finally {
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(PreparedLayoutTextView view, noc props, vse stateWrapper) {
        view.getClass();
        props.getClass();
        stateWrapper.getClass();
        ruc rucVar = stateWrapper instanceof ruc ? (ruc) stateWrapper : null;
        if (rucVar != null) {
            return rucVar.getStateDataReference();
        }
        return null;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    public void updateViewAccessibility(PreparedLayoutTextView view) {
        view.getClass();
        int i = a.y;
        a.b.a(view, view.getImportantForAccessibility(), view.isFocusable());
    }

    public PreparedLayoutTextViewManager() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public PreparedLayoutTextViewManager(ppc ppcVar) {
        this.reactTextViewManagerCallback = ppcVar;
        setupViewRecycling();
    }
}
