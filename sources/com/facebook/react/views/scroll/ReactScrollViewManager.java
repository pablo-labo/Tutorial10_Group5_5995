package com.facebook.react.views.scroll;

import android.view.View;
import android.widget.OverScroller;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.views.scroll.a;
import com.facebook.react.views.scroll.g;
import defpackage.c74;
import defpackage.cj1;
import defpackage.eoc;
import defpackage.epg;
import defpackage.foc;
import defpackage.goc;
import defpackage.j6;
import defpackage.kq5;
import defpackage.lc9;
import defpackage.mkf;
import defpackage.nmc;
import defpackage.nn2;
import defpackage.noc;
import defpackage.o49;
import defpackage.ou8;
import defpackage.prg;
import defpackage.pu8;
import defpackage.q92;
import defpackage.qeb;
import defpackage.snc;
import defpackage.sy3;
import defpackage.tnc;
import defpackage.v71;
import defpackage.vse;
import defpackage.zi1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@nmc(name = ReactScrollViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0017\u0018\u0000 n2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001oB\u0015\b\u0007\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0015\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u001b\u0010\u0014J\u001f\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u001d\u0010\u0019J!\u0010 \u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0007¢\u0006\u0004\b \u0010!J!\u0010#\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u0010H\u0007¢\u0006\u0004\b&\u0010\u0014J\u001f\u0010(\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u0010H\u0007¢\u0006\u0004\b(\u0010\u0014J\u001f\u0010*\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u0010H\u0007¢\u0006\u0004\b*\u0010\u0014J\u001f\u0010,\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u0010H\u0007¢\u0006\u0004\b,\u0010\u0014J!\u0010.\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010-\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b.\u0010$J\u001f\u00100\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u0010H\u0007¢\u0006\u0004\b0\u0010\u0014J\u001f\u00103\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u00102\u001a\u000201H\u0007¢\u0006\u0004\b3\u00104J!\u00105\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0017¢\u0006\u0004\b5\u0010$J!\u00106\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b6\u0010\u0014J\u001d\u00108\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u000201\u0018\u000107H\u0016¢\u0006\u0004\b8\u00109J)\u0010=\u001a\u00020\u00122\u0006\u0010:\u001a\u00020\u00022\u0006\u0010;\u001a\u0002012\b\u0010<\u001a\u0004\u0018\u00010\u001eH\u0017¢\u0006\u0004\b=\u0010>J)\u0010=\u001a\u00020\u00122\u0006\u0010:\u001a\u00020\u00022\u0006\u0010;\u001a\u00020\b2\b\u0010<\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b=\u0010?J\u0017\u0010@\u001a\u00020\u00122\u0006\u0010:\u001a\u00020\u0002H\u0016¢\u0006\u0004\b@\u0010AJ\u001f\u0010D\u001a\u00020\u00122\u0006\u0010:\u001a\u00020\u00022\u0006\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bD\u0010EJ)\u0010H\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010F\u001a\u0002012\u0006\u0010G\u001a\u00020\u0016H\u0007¢\u0006\u0004\bH\u0010IJ#\u0010K\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\u0010J\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\bK\u0010$J)\u0010M\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010F\u001a\u0002012\u0006\u0010L\u001a\u00020\u0016H\u0007¢\u0006\u0004\bM\u0010IJ+\u0010N\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010F\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000101H\u0007¢\u0006\u0004\bN\u0010OJ!\u0010Q\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010P\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\bQ\u0010$J\u001f\u0010S\u001a\u00020\u00122\u0006\u0010:\u001a\u00020\u00022\u0006\u0010C\u001a\u00020RH\u0016¢\u0006\u0004\bS\u0010TJ\u001f\u0010U\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\bU\u0010\u0014J\u001f\u0010W\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020VH\u0007¢\u0006\u0004\bW\u0010XJ!\u0010Z\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010YH\u0007¢\u0006\u0004\bZ\u0010[J!\u0010\\\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010YH\u0007¢\u0006\u0004\b\\\u0010[J)\u0010b\u001a\u0004\u0018\u00010a2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010^\u001a\u00020]2\u0006\u0010`\u001a\u00020_H\u0016¢\u0006\u0004\bb\u0010cJ\u001d\u0010d\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020a\u0018\u000107H\u0016¢\u0006\u0004\bd\u00109J!\u0010f\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010e\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\bf\u0010$J\u001f\u0010h\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010g\u001a\u000201H\u0007¢\u0006\u0004\bh\u00104J!\u0010j\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010i\u001a\u00020\u0010H\u0007¢\u0006\u0004\bj\u0010\u0014J\u001f\u0010l\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010k\u001a\u00020\u0010H\u0007¢\u0006\u0004\bl\u0010\u0014R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010m¨\u0006p"}, d2 = {"Lcom/facebook/react/views/scroll/ReactScrollViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/facebook/react/views/scroll/c;", "Leoc;", "Lkq5;", "fpsListener", "<init>", "(Lkq5;)V", "", "getName", "()Ljava/lang/String;", "Lmkf;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "createViewInstance", "(Lmkf;)Lcom/facebook/react/views/scroll/c;", "view", "", "value", "Lj6g;", "setScrollEnabled", "(Lcom/facebook/react/views/scroll/c;Z)V", "setShowsVerticalScrollIndicator", "", "decelerationRate", "setDecelerationRate", "(Lcom/facebook/react/views/scroll/c;F)V", "disableIntervalMomentum", "setDisableIntervalMomentum", "snapToInterval", "setSnapToInterval", "Lcom/facebook/react/bridge/ReadableArray;", "snapToOffsets", "setSnapToOffsets", "(Lcom/facebook/react/views/scroll/c;Lcom/facebook/react/bridge/ReadableArray;)V", "alignment", "setSnapToAlignment", "(Lcom/facebook/react/views/scroll/c;Ljava/lang/String;)V", "snapToStart", "setSnapToStart", "snapToEnd", "setSnapToEnd", "removeClippedSubviews", "setRemoveClippedSubviews", "sendMomentumEvents", "setSendMomentumEvents", "scrollPerfTag", "setScrollPerfTag", "pagingEnabled", "setPagingEnabled", "", "color", "setBottomFillColor", "(Lcom/facebook/react/views/scroll/c;I)V", "setOverScrollMode", "setNestedScrollEnabled", "", "getCommandsMap", "()Ljava/util/Map;", "scrollView", "commandId", "args", "receiveCommand", "(Lcom/facebook/react/views/scroll/c;ILcom/facebook/react/bridge/ReadableArray;)V", "(Lcom/facebook/react/views/scroll/c;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "flashScrollIndicators", "(Lcom/facebook/react/views/scroll/c;)V", "Lfoc;", "data", "scrollTo", "(Lcom/facebook/react/views/scroll/c;Lfoc;)V", "index", "borderRadius", "setBorderRadius", "(Lcom/facebook/react/views/scroll/c;IF)V", "borderStyle", "setBorderStyle", "width", "setBorderWidth", "setBorderColor", "(Lcom/facebook/react/views/scroll/c;ILjava/lang/Integer;)V", "overflow", "setOverflow", "Lgoc;", "scrollToEnd", "(Lcom/facebook/react/views/scroll/c;Lgoc;)V", "setPersistentScrollbar", "Lcom/facebook/react/bridge/Dynamic;", "setFadingEdgeLength", "(Lcom/facebook/react/views/scroll/c;Lcom/facebook/react/bridge/Dynamic;)V", "Lcom/facebook/react/bridge/ReadableMap;", "setContentOffset", "(Lcom/facebook/react/views/scroll/c;Lcom/facebook/react/bridge/ReadableMap;)V", "setMaintainVisibleContentPosition", "Lnoc;", "props", "Lvse;", "stateWrapper", "", "updateState", "(Lcom/facebook/react/views/scroll/c;Lnoc;Lvse;)Ljava/lang/Object;", "getExportedCustomDirectEventTypeConstants", "pointerEventsStr", "setPointerEvents", "scrollEventThrottle", "setScrollEventThrottle", "horizontal", "setHorizontal", "applyFix", "setIsInvertedVirtualizedList", "Lkq5;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ReactScrollViewManager extends ViewGroupManager<c> implements eoc<c> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final String REACT_CLASS = "RCTScrollView";
    private final kq5 fpsListener;

    /* JADX INFO: renamed from: com.facebook.react.views.scroll.ReactScrollViewManager$a, reason: from kotlin metadata */
    public static final class Companion {
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.Map.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public /* synthetic */ ReactScrollViewManager(kq5 kq5Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : kq5Var);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public c createViewInstance(mkf context) {
        context.getClass();
        return new c(context);
    }

    @Override // defpackage.eoc
    public void flashScrollIndicators(c scrollView) {
        scrollView.getClass();
        scrollView.e();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return lc9.Z(new Pair("scrollTo", 1), new Pair("scrollToEnd", 2), new Pair("flashScrollIndicators", 3));
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        INSTANCE.getClass();
        g.a.getClass();
        exportedCustomDirectEventTypeConstants.putAll(lc9.a0(new Pair(g.a.a(g.d), j6.c("registrationName", "onScroll")), new Pair(g.a.a(g.b), j6.c("registrationName", "onScrollBeginDrag")), new Pair(g.a.a(g.c), j6.c("registrationName", "onScrollEndDrag")), new Pair(g.a.a(g.e), j6.c("registrationName", "onMomentumScrollBegin")), new Pair(g.a.a(g.f), j6.c("registrationName", "onMomentumScrollEnd"))));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(c scrollView, String commandId, ReadableArray args) {
        scrollView.getClass();
        commandId.getClass();
        q92.z(this, scrollView, commandId, args);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, defpackage.vo6
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @Override // defpackage.eoc
    public void scrollTo(c scrollView, foc data) {
        scrollView.getClass();
        data.getClass();
        int i = data.b;
        OverScroller overScroller = scrollView.b;
        if (overScroller != null && !overScroller.isFinished()) {
            overScroller.abortAnimation();
        }
        boolean z = data.c;
        int i2 = data.a;
        if (z) {
            scrollView.b(i2, i);
        } else {
            scrollView.scrollTo(i2, i);
        }
    }

    @Override // defpackage.eoc
    public void scrollToEnd(c scrollView, goc data) {
        scrollView.getClass();
        data.getClass();
        View childAt = scrollView.getChildAt(0);
        if (childAt == null) {
            throw new RetryableMountingLayerException("scrollToEnd called on ScrollView without child");
        }
        int paddingBottom = scrollView.getPaddingBottom() + childAt.getHeight();
        OverScroller overScroller = scrollView.b;
        if (overScroller != null && !overScroller.isFinished()) {
            overScroller.abortAnimation();
        }
        if (data.a) {
            scrollView.b(scrollView.getScrollX(), paddingBottom);
        } else {
            scrollView.scrollTo(scrollView.getScrollX(), paddingBottom);
        }
    }

    @tnc(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public final void setBorderColor(c view, int index, Integer color) {
        if (view != null) {
            v71.l(view, o49.b, color);
        }
    }

    @tnc(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public final void setBorderRadius(c view, int index, float borderRadius) {
        if (view != null) {
            v71.m(view, (zi1) zi1.c.get(index), Float.isNaN(borderRadius) ? null : new ou8(borderRadius, pu8.a));
        }
    }

    @snc(name = "borderStyle")
    public final void setBorderStyle(c view, String borderStyle) {
        cj1 cj1VarA;
        if (view != null) {
            if (borderStyle == null) {
                cj1VarA = null;
            } else {
                cj1.a.getClass();
                cj1VarA = cj1.a.a(borderStyle);
            }
            v71.n(view, cj1VarA);
        }
    }

    @tnc(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public final void setBorderWidth(c view, int index, float width) {
        if (view != null) {
            v71.o(view, (o49) o49.d0.get(index), Float.valueOf(width));
        }
    }

    @snc(customType = "Color", defaultInt = 0, name = "endFillColor")
    public final void setBottomFillColor(c view, int color) {
        view.getClass();
        view.setEndFillColor(color);
    }

    @snc(customType = "Point", name = "contentOffset")
    public final void setContentOffset(c view, ReadableMap value) {
        view.getClass();
        view.setContentOffset(value);
    }

    @snc(name = "decelerationRate")
    public final void setDecelerationRate(c view, float decelerationRate) {
        view.getClass();
        view.setDecelerationRate(decelerationRate);
    }

    @snc(name = "disableIntervalMomentum")
    public final void setDisableIntervalMomentum(c view, boolean disableIntervalMomentum) {
        view.getClass();
        view.setDisableIntervalMomentum(disableIntervalMomentum);
    }

    @snc(name = "fadingEdgeLength")
    public final void setFadingEdgeLength(c view, Dynamic value) {
        ReadableMap readableMapAsMap;
        view.getClass();
        value.getClass();
        int i = b.a[value.getType().ordinal()];
        if (i == 1) {
            view.setFadingEdgeLengthStart(value.asInt());
            view.setFadingEdgeLengthEnd(value.asInt());
        } else if (i == 2 && (readableMapAsMap = value.asMap()) != null) {
            int i2 = (!readableMapAsMap.hasKey("start") || readableMapAsMap.getInt("start") <= 0) ? 0 : readableMapAsMap.getInt("start");
            int i3 = (!readableMapAsMap.hasKey("end") || readableMapAsMap.getInt("end") <= 0) ? 0 : readableMapAsMap.getInt("end");
            view.setFadingEdgeLengthStart(i2);
            view.setFadingEdgeLengthEnd(i3);
        }
        if (view.getFadingEdgeLengthStart() > 0 || view.getFadingEdgeLengthEnd() > 0) {
            view.setVerticalFadingEdgeEnabled(true);
            view.setFadingEdgeLength(Math.round(nn2.G(Math.max(view.getFadingEdgeLengthStart(), view.getFadingEdgeLengthEnd()))));
        } else {
            view.setVerticalFadingEdgeEnabled(false);
            view.setFadingEdgeLength(0);
        }
    }

    @snc(name = "horizontal")
    public final void setHorizontal(c view, boolean horizontal) {
    }

    @snc(name = "isInvertedVirtualizedList")
    public final void setIsInvertedVirtualizedList(c view, boolean applyFix) {
        view.getClass();
        if (applyFix) {
            view.setVerticalScrollbarPosition(1);
        } else {
            view.setVerticalScrollbarPosition(0);
        }
    }

    @snc(name = "maintainVisibleContentPosition")
    public final void setMaintainVisibleContentPosition(c view, ReadableMap value) {
        view.getClass();
        if (value != null) {
            view.setMaintainVisibleContentPosition(new a.C0141a(value.getInt("minIndexForVisible"), value.hasKey("autoscrollToTopThreshold") ? Integer.valueOf(value.getInt("autoscrollToTopThreshold")) : null));
        } else {
            view.setMaintainVisibleContentPosition(null);
        }
    }

    @snc(name = "nestedScrollEnabled")
    public final void setNestedScrollEnabled(c view, boolean value) {
        if (view != null) {
            WeakHashMap<View, prg> weakHashMap = epg.a;
            epg.d.l(view, value);
        }
    }

    @snc(name = "overScrollMode")
    public void setOverScrollMode(c view, String value) {
        view.getClass();
        view.setOverScrollMode(d.h(value));
    }

    @snc(name = "overflow")
    public final void setOverflow(c view, String overflow) {
        view.getClass();
        view.setOverflow(overflow);
    }

    @snc(name = "pagingEnabled")
    public final void setPagingEnabled(c view, boolean pagingEnabled) {
        view.getClass();
        view.setPagingEnabled(pagingEnabled);
    }

    @snc(name = "persistentScrollbar")
    public final void setPersistentScrollbar(c view, boolean value) {
        view.getClass();
        view.setScrollbarFadingEnabled(!value);
    }

    @snc(name = "pointerEvents")
    public final void setPointerEvents(c view, String pointerEventsStr) {
        view.getClass();
        qeb.a.getClass();
        view.setPointerEvents(qeb.a.c(pointerEventsStr));
    }

    @snc(name = "removeClippedSubviews")
    public final void setRemoveClippedSubviews(c view, boolean removeClippedSubviews) {
        view.getClass();
        view.setRemoveClippedSubviews(removeClippedSubviews);
    }

    @snc(defaultBoolean = true, name = "scrollEnabled")
    public final void setScrollEnabled(c view, boolean value) {
        view.getClass();
        view.setScrollEnabled(value);
        view.setFocusable(value);
    }

    @snc(name = "scrollEventThrottle")
    public final void setScrollEventThrottle(c view, int scrollEventThrottle) {
        view.getClass();
        view.setScrollEventThrottle(scrollEventThrottle);
    }

    @snc(name = "scrollPerfTag")
    public final void setScrollPerfTag(c view, String scrollPerfTag) {
        view.getClass();
        view.setScrollPerfTag(scrollPerfTag);
    }

    @snc(name = "sendMomentumEvents")
    public final void setSendMomentumEvents(c view, boolean sendMomentumEvents) {
        view.getClass();
        view.setSendMomentumEvents(sendMomentumEvents);
    }

    @snc(defaultBoolean = true, name = "showsVerticalScrollIndicator")
    public final void setShowsVerticalScrollIndicator(c view, boolean value) {
        view.getClass();
        view.setVerticalScrollBarEnabled(value);
    }

    @snc(name = "snapToAlignment")
    public final void setSnapToAlignment(c view, String alignment) {
        view.getClass();
        view.setSnapToAlignment(d.i(alignment));
    }

    @snc(name = "snapToEnd")
    public final void setSnapToEnd(c view, boolean snapToEnd) {
        view.getClass();
        view.setSnapToEnd(snapToEnd);
    }

    @snc(name = "snapToInterval")
    public final void setSnapToInterval(c view, float snapToInterval) {
        view.getClass();
        view.setSnapInterval((int) (snapToInterval * c74.d().density));
    }

    @snc(name = "snapToOffsets")
    public final void setSnapToOffsets(c view, ReadableArray snapToOffsets) {
        view.getClass();
        if (snapToOffsets == null || snapToOffsets.size() == 0) {
            view.setSnapOffsets(null);
            return;
        }
        float f = c74.d().density;
        ArrayList arrayList = new ArrayList();
        int size = snapToOffsets.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(Integer.valueOf((int) (snapToOffsets.getDouble(i) * ((double) f))));
        }
        view.setSnapOffsets(arrayList);
    }

    @snc(name = "snapToStart")
    public final void setSnapToStart(c view, boolean snapToStart) {
        view.getClass();
        view.setSnapToStart(snapToStart);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(c view, noc props, vse stateWrapper) {
        view.getClass();
        props.getClass();
        stateWrapper.getClass();
        view.setStateWrapper(stateWrapper);
        return null;
    }

    public ReactScrollViewManager() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public ReactScrollViewManager(kq5 kq5Var) {
        super(null, 1, null);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @sy3
    public void receiveCommand(c scrollView, int commandId, ReadableArray args) {
        scrollView.getClass();
        q92.y(this, scrollView, commandId, args);
    }
}
