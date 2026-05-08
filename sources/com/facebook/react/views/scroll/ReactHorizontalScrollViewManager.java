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
import defpackage.c74;
import defpackage.cj1;
import defpackage.eoc;
import defpackage.epg;
import defpackage.foc;
import defpackage.goc;
import defpackage.kq5;
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
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@nmc(name = ReactHorizontalScrollViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0017\u0018\u0000 h2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001iB\u0015\b\u0007\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001c\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\"\u0010\u001bJ\u001f\u0010$\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u001dH\u0007¢\u0006\u0004\b$\u0010 J!\u0010&\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b&\u0010'J!\u0010*\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010)\u001a\u0004\u0018\u00010(H\u0007¢\u0006\u0004\b*\u0010+J\u001f\u0010-\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u0017H\u0007¢\u0006\u0004\b-\u0010\u001bJ\u001f\u0010/\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u0017H\u0007¢\u0006\u0004\b/\u0010\u001bJ\u001f\u00101\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u00100\u001a\u00020\u0017H\u0007¢\u0006\u0004\b1\u0010\u001bJ\u001f\u00103\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u00102\u001a\u00020\u0017H\u0007¢\u0006\u0004\b3\u0010\u001bJ!\u00105\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u00022\b\u00104\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b5\u0010'J\u001f\u00107\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u00106\u001a\u00020\u0017H\u0007¢\u0006\u0004\b7\u0010\u001bJ!\u00108\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\bH\u0017¢\u0006\u0004\b8\u0010'J!\u00109\u001a\u00020\u00192\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b9\u0010\u001bJ)\u0010>\u001a\u00020\u00192\u0006\u0010:\u001a\u00020\u00022\u0006\u0010<\u001a\u00020;2\b\u0010=\u001a\u0004\u0018\u00010(H\u0017¢\u0006\u0004\b>\u0010?J)\u0010>\u001a\u00020\u00192\u0006\u0010:\u001a\u00020\u00022\u0006\u0010<\u001a\u00020\b2\b\u0010=\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b>\u0010@J\u0017\u0010A\u001a\u00020\u00192\u0006\u0010:\u001a\u00020\u0002H\u0016¢\u0006\u0004\bA\u0010BJ\u001f\u0010E\u001a\u00020\u00192\u0006\u0010:\u001a\u00020\u00022\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bE\u0010FJ\u001f\u0010H\u001a\u00020\u00192\u0006\u0010:\u001a\u00020\u00022\u0006\u0010D\u001a\u00020GH\u0016¢\u0006\u0004\bH\u0010IJ\u001f\u0010K\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010J\u001a\u00020;H\u0007¢\u0006\u0004\bK\u0010LJ)\u0010O\u001a\u00020\u00192\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010M\u001a\u00020;2\u0006\u0010N\u001a\u00020\u001dH\u0007¢\u0006\u0004\bO\u0010PJ#\u0010R\u001a\u00020\u00192\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\u0010Q\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\bR\u0010'J)\u0010T\u001a\u00020\u00192\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010M\u001a\u00020;2\u0006\u0010S\u001a\u00020\u001dH\u0007¢\u0006\u0004\bT\u0010PJ)\u0010U\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010M\u001a\u00020;2\b\u0010J\u001a\u0004\u0018\u00010;H\u0007¢\u0006\u0004\bU\u0010VJ!\u0010X\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010W\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\bX\u0010'J\u001f\u0010Y\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\bY\u0010\u001bJ\u001f\u0010[\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020ZH\u0007¢\u0006\u0004\b[\u0010\\J!\u0010^\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010]H\u0007¢\u0006\u0004\b^\u0010_J!\u0010`\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010]H\u0007¢\u0006\u0004\b`\u0010_J!\u0010b\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010a\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\bb\u0010'J\u001f\u0010d\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010c\u001a\u00020;H\u0007¢\u0006\u0004\bd\u0010LJ!\u0010f\u001a\u00020\u00192\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010e\u001a\u00020\u0017H\u0007¢\u0006\u0004\bf\u0010\u001bR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010g¨\u0006j"}, d2 = {"Lcom/facebook/react/views/scroll/ReactHorizontalScrollViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/facebook/react/views/scroll/b;", "Leoc;", "Lkq5;", "fpsListener", "<init>", "(Lkq5;)V", "", "getName", "()Ljava/lang/String;", "Lmkf;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "createViewInstance", "(Lmkf;)Lcom/facebook/react/views/scroll/b;", "view", "Lnoc;", "props", "Lvse;", "stateWrapper", "", "updateState", "(Lcom/facebook/react/views/scroll/b;Lnoc;Lvse;)Ljava/lang/Object;", "", "value", "Lj6g;", "setScrollEnabled", "(Lcom/facebook/react/views/scroll/b;Z)V", "setShowsHorizontalScrollIndicator", "", "decelerationRate", "setDecelerationRate", "(Lcom/facebook/react/views/scroll/b;F)V", "disableIntervalMomentum", "setDisableIntervalMomentum", "snapToInterval", "setSnapToInterval", "alignment", "setSnapToAlignment", "(Lcom/facebook/react/views/scroll/b;Ljava/lang/String;)V", "Lcom/facebook/react/bridge/ReadableArray;", "snapToOffsets", "setSnapToOffsets", "(Lcom/facebook/react/views/scroll/b;Lcom/facebook/react/bridge/ReadableArray;)V", "snapToStart", "setSnapToStart", "snapToEnd", "setSnapToEnd", "removeClippedSubviews", "setRemoveClippedSubviews", "sendMomentumEvents", "setSendMomentumEvents", "scrollPerfTag", "setScrollPerfTag", "pagingEnabled", "setPagingEnabled", "setOverScrollMode", "setNestedScrollEnabled", "scrollView", "", "commandId", "args", "receiveCommand", "(Lcom/facebook/react/views/scroll/b;ILcom/facebook/react/bridge/ReadableArray;)V", "(Lcom/facebook/react/views/scroll/b;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "flashScrollIndicators", "(Lcom/facebook/react/views/scroll/b;)V", "Lfoc;", "data", "scrollTo", "(Lcom/facebook/react/views/scroll/b;Lfoc;)V", "Lgoc;", "scrollToEnd", "(Lcom/facebook/react/views/scroll/b;Lgoc;)V", "color", "setBottomFillColor", "(Lcom/facebook/react/views/scroll/b;I)V", "index", "borderRadius", "setBorderRadius", "(Lcom/facebook/react/views/scroll/b;IF)V", "borderStyle", "setBorderStyle", "width", "setBorderWidth", "setBorderColor", "(Lcom/facebook/react/views/scroll/b;ILjava/lang/Integer;)V", "overflow", "setOverflow", "setPersistentScrollbar", "Lcom/facebook/react/bridge/Dynamic;", "setFadingEdgeLength", "(Lcom/facebook/react/views/scroll/b;Lcom/facebook/react/bridge/Dynamic;)V", "Lcom/facebook/react/bridge/ReadableMap;", "setContentOffset", "(Lcom/facebook/react/views/scroll/b;Lcom/facebook/react/bridge/ReadableMap;)V", "setMaintainVisibleContentPosition", "pointerEventsStr", "setPointerEvents", "scrollEventThrottle", "setScrollEventThrottle", "horizontal", "setHorizontal", "Lkq5;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ReactHorizontalScrollViewManager extends ViewGroupManager<com.facebook.react.views.scroll.b> implements eoc<com.facebook.react.views.scroll.b> {
    public static final String REACT_CLASS = "AndroidHorizontalScrollView";
    private final kq5 fpsListener;

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

    public /* synthetic */ ReactHorizontalScrollViewManager(kq5 kq5Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : kq5Var);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public com.facebook.react.views.scroll.b createViewInstance(mkf context) {
        context.getClass();
        return new com.facebook.react.views.scroll.b(context);
    }

    @Override // defpackage.eoc
    public void flashScrollIndicators(com.facebook.react.views.scroll.b scrollView) {
        scrollView.getClass();
        scrollView.f();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(com.facebook.react.views.scroll.b scrollView, String commandId, ReadableArray args) {
        scrollView.getClass();
        commandId.getClass();
        q92.z(this, scrollView, commandId, args);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, defpackage.vo6
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @Override // defpackage.eoc
    public void scrollTo(com.facebook.react.views.scroll.b scrollView, foc data) {
        scrollView.getClass();
        data.getClass();
        int i = data.b;
        OverScroller overScroller = scrollView.c;
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
    public void scrollToEnd(com.facebook.react.views.scroll.b scrollView, goc data) {
        scrollView.getClass();
        data.getClass();
        View childAt = scrollView.getChildAt(0);
        if (childAt == null) {
            throw new RetryableMountingLayerException("scrollToEnd called on HorizontalScrollView without child");
        }
        int paddingRight = scrollView.getPaddingRight() + childAt.getWidth();
        OverScroller overScroller = scrollView.c;
        if (overScroller != null && !overScroller.isFinished()) {
            overScroller.abortAnimation();
        }
        if (data.a) {
            scrollView.b(paddingRight, scrollView.getScrollY());
        } else {
            scrollView.scrollTo(paddingRight, scrollView.getScrollY());
        }
    }

    @tnc(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public final void setBorderColor(com.facebook.react.views.scroll.b view, int index, Integer color) {
        view.getClass();
        v71.l(view, o49.b, color);
    }

    @tnc(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public final void setBorderRadius(com.facebook.react.views.scroll.b view, int index, float borderRadius) {
        if (view != null) {
            v71.m(view, (zi1) zi1.c.get(index), Float.isNaN(borderRadius) ? null : new ou8(borderRadius, pu8.a));
        }
    }

    @snc(name = "borderStyle")
    public final void setBorderStyle(com.facebook.react.views.scroll.b view, String borderStyle) {
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
    public final void setBorderWidth(com.facebook.react.views.scroll.b view, int index, float width) {
        if (view != null) {
            v71.o(view, (o49) o49.d0.get(index), Float.valueOf(width));
        }
    }

    @snc(customType = "Color", defaultInt = 0, name = "endFillColor")
    public final void setBottomFillColor(com.facebook.react.views.scroll.b view, int color) {
        view.getClass();
        view.setEndFillColor(color);
    }

    @snc(name = "contentOffset")
    public final void setContentOffset(com.facebook.react.views.scroll.b view, ReadableMap value) {
        view.getClass();
        if (value != null) {
            view.scrollTo((int) nn2.G((float) (value.hasKey("x") ? value.getDouble("x") : 0.0d)), (int) nn2.G((float) (value.hasKey("y") ? value.getDouble("y") : 0.0d)));
        } else {
            view.scrollTo(0, 0);
        }
    }

    @snc(name = "decelerationRate")
    public final void setDecelerationRate(com.facebook.react.views.scroll.b view, float decelerationRate) {
        view.getClass();
        view.setDecelerationRate(decelerationRate);
    }

    @snc(name = "disableIntervalMomentum")
    public final void setDisableIntervalMomentum(com.facebook.react.views.scroll.b view, boolean disableIntervalMomentum) {
        view.getClass();
        view.setDisableIntervalMomentum(disableIntervalMomentum);
    }

    @snc(name = "fadingEdgeLength")
    public final void setFadingEdgeLength(com.facebook.react.views.scroll.b view, Dynamic value) {
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
            view.setHorizontalFadingEdgeEnabled(true);
            view.setFadingEdgeLength(Math.round(nn2.G(Math.max(view.getFadingEdgeLengthStart(), view.getFadingEdgeLengthEnd()))));
        } else {
            view.setHorizontalFadingEdgeEnabled(false);
            view.setFadingEdgeLength(0);
        }
    }

    @snc(name = "horizontal")
    public final void setHorizontal(com.facebook.react.views.scroll.b view, boolean horizontal) {
    }

    @snc(name = "maintainVisibleContentPosition")
    public final void setMaintainVisibleContentPosition(com.facebook.react.views.scroll.b view, ReadableMap value) {
        view.getClass();
        if (value != null) {
            view.setMaintainVisibleContentPosition(new a.C0141a(value.getInt("minIndexForVisible"), value.hasKey("autoscrollToTopThreshold") ? Integer.valueOf(value.getInt("autoscrollToTopThreshold")) : null));
        } else {
            view.setMaintainVisibleContentPosition(null);
        }
    }

    @snc(name = "nestedScrollEnabled")
    public final void setNestedScrollEnabled(com.facebook.react.views.scroll.b view, boolean value) {
        if (view != null) {
            WeakHashMap<View, prg> weakHashMap = epg.a;
            epg.d.l(view, value);
        }
    }

    @snc(name = "overScrollMode")
    public void setOverScrollMode(com.facebook.react.views.scroll.b view, String value) {
        view.getClass();
        view.setOverScrollMode(d.h(value));
    }

    @snc(name = "overflow")
    public final void setOverflow(com.facebook.react.views.scroll.b view, String overflow) {
        view.getClass();
        view.setOverflow(overflow);
    }

    @snc(name = "pagingEnabled")
    public final void setPagingEnabled(com.facebook.react.views.scroll.b view, boolean pagingEnabled) {
        view.getClass();
        view.setPagingEnabled(pagingEnabled);
    }

    @snc(name = "persistentScrollbar")
    public final void setPersistentScrollbar(com.facebook.react.views.scroll.b view, boolean value) {
        view.getClass();
        view.setScrollbarFadingEnabled(!value);
    }

    @snc(name = "pointerEvents")
    public final void setPointerEvents(com.facebook.react.views.scroll.b view, String pointerEventsStr) {
        view.getClass();
        qeb.a.getClass();
        view.setPointerEvents(qeb.a.c(pointerEventsStr));
    }

    @snc(name = "removeClippedSubviews")
    public final void setRemoveClippedSubviews(com.facebook.react.views.scroll.b view, boolean removeClippedSubviews) {
        view.getClass();
        view.setRemoveClippedSubviews(removeClippedSubviews);
    }

    @snc(defaultBoolean = true, name = "scrollEnabled")
    public final void setScrollEnabled(com.facebook.react.views.scroll.b view, boolean value) {
        view.getClass();
        view.setScrollEnabled(value);
    }

    @snc(name = "scrollEventThrottle")
    public final void setScrollEventThrottle(com.facebook.react.views.scroll.b view, int scrollEventThrottle) {
        view.getClass();
        view.setScrollEventThrottle(scrollEventThrottle);
    }

    @snc(name = "scrollPerfTag")
    public final void setScrollPerfTag(com.facebook.react.views.scroll.b view, String scrollPerfTag) {
        view.getClass();
        view.setScrollPerfTag(scrollPerfTag);
    }

    @snc(name = "sendMomentumEvents")
    public final void setSendMomentumEvents(com.facebook.react.views.scroll.b view, boolean sendMomentumEvents) {
        view.getClass();
        view.setSendMomentumEvents(sendMomentumEvents);
    }

    @snc(defaultBoolean = true, name = "showsHorizontalScrollIndicator")
    public final void setShowsHorizontalScrollIndicator(com.facebook.react.views.scroll.b view, boolean value) {
        view.getClass();
        view.setHorizontalScrollBarEnabled(value);
    }

    @snc(name = "snapToAlignment")
    public final void setSnapToAlignment(com.facebook.react.views.scroll.b view, String alignment) {
        view.getClass();
        view.setSnapToAlignment(d.i(alignment));
    }

    @snc(name = "snapToEnd")
    public final void setSnapToEnd(com.facebook.react.views.scroll.b view, boolean snapToEnd) {
        view.getClass();
        view.setSnapToEnd(snapToEnd);
    }

    @snc(name = "snapToInterval")
    public final void setSnapToInterval(com.facebook.react.views.scroll.b view, float snapToInterval) {
        view.getClass();
        view.setSnapInterval((int) (snapToInterval * c74.d().density));
    }

    @snc(name = "snapToOffsets")
    public final void setSnapToOffsets(com.facebook.react.views.scroll.b view, ReadableArray snapToOffsets) {
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
    public final void setSnapToStart(com.facebook.react.views.scroll.b view, boolean snapToStart) {
        view.getClass();
        view.setSnapToStart(snapToStart);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(com.facebook.react.views.scroll.b view, noc props, vse stateWrapper) {
        view.getClass();
        props.getClass();
        stateWrapper.getClass();
        view.setStateWrapper(stateWrapper);
        return null;
    }

    public ReactHorizontalScrollViewManager() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public ReactHorizontalScrollViewManager(kq5 kq5Var) {
        super(null, 1, null);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @sy3
    public void receiveCommand(com.facebook.react.views.scroll.b scrollView, int commandId, ReadableArray args) {
        scrollView.getClass();
        q92.y(this, scrollView, commandId, args);
    }
}
