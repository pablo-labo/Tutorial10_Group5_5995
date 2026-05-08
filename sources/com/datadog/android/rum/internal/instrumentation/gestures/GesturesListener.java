package com.datadog.android.rum.internal.instrumentation.gestures;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.ScrollView;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.SdkCore;
import com.datadog.android.rum.GlobalRumMonitor;
import com.datadog.android.rum.RumActionType;
import com.datadog.android.rum.RumAttributes;
import com.datadog.android.rum.RumMonitor;
import com.datadog.android.rum.internal.tracking.NoOpInteractionPredicate;
import com.datadog.android.rum.tracking.InteractionPredicate;
import com.datadog.android.rum.tracking.ViewAttributesProvider;
import defpackage.gu5;
import defpackage.lc9;
import defpackage.mj8;
import defpackage.wve;
import defpackage.ysd;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b/\b\u0000\u0018\u0000 i2\u00020\u0001:\u0001iBM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0018\u001a\u00020\u00172\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001a\u001a\u00020\u00172\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J)\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ7\u0010$\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0006\u0012\u0004\u0018\u00010#0\"2\u0006\u0010\u001f\u001a\u00020\u00132\u0006\u0010!\u001a\u00020 2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0017H\u0002¢\u0006\u0004\b&\u0010'J!\u0010)\u001a\u00020\u00172\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010(\u001a\u00020\u0015H\u0002¢\u0006\u0004\b)\u0010\u0019J\u0017\u0010+\u001a\u00020\u00172\u0006\u0010*\u001a\u00020\u0013H\u0002¢\u0006\u0004\b+\u0010,J)\u00100\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020-H\u0002¢\u0006\u0004\b0\u00101J)\u00102\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020-H\u0002¢\u0006\u0004\b2\u00101J=\u00109\u001a\u00020\u00172\u0006\u00104\u001a\u0002032\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020-2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u0013052\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\b9\u0010:J\u0017\u0010<\u001a\u00020;2\u0006\u00104\u001a\u00020\u0013H\u0002¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020;2\u0006\u00104\u001a\u00020\u0013H\u0002¢\u0006\u0004\b>\u0010=J\u0017\u0010?\u001a\u00020;2\u0006\u00104\u001a\u00020\u0013H\u0002¢\u0006\u0004\b?\u0010=J/\u0010A\u001a\u00020;2\u0006\u00104\u001a\u00020\u00132\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020-2\u0006\u0010@\u001a\u000207H\u0002¢\u0006\u0004\bA\u0010BJ\u0017\u0010D\u001a\u00020 2\u0006\u0010C\u001a\u00020\u0015H\u0002¢\u0006\u0004\bD\u0010EJ\u0017\u0010F\u001a\u00020;2\u0006\u00104\u001a\u00020\u0013H\u0002¢\u0006\u0004\bF\u0010=J\u0017\u0010G\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u0015H\u0016¢\u0006\u0004\bG\u0010HJ\u0017\u0010I\u001a\u00020;2\u0006\u0010(\u001a\u00020\u0015H\u0016¢\u0006\u0004\bI\u0010JJ\u0017\u0010K\u001a\u00020;2\u0006\u0010(\u001a\u00020\u0015H\u0016¢\u0006\u0004\bK\u0010JJ\u0015\u0010M\u001a\u00020\u00172\u0006\u0010L\u001a\u00020\u0015¢\u0006\u0004\bM\u0010HJ1\u0010R\u001a\u00020;2\b\u0010N\u001a\u0004\u0018\u00010\u00152\u0006\u0010O\u001a\u00020\u00152\u0006\u0010P\u001a\u00020-2\u0006\u0010Q\u001a\u00020-H\u0016¢\u0006\u0004\bR\u0010SJ1\u0010W\u001a\u00020;2\b\u0010N\u001a\u0004\u0018\u00010\u00152\u0006\u0010T\u001a\u00020\u00152\u0006\u0010U\u001a\u00020-2\u0006\u0010V\u001a\u00020-H\u0016¢\u0006\u0004\bW\u0010SJ\u0017\u0010X\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u0015H\u0016¢\u0006\u0004\bX\u0010HR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010YR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010ZR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010[R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\\R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010]R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010^R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010_R\u0018\u0010`\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010b\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u001e\u0010d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010ZR\u0016\u0010e\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0016\u0010g\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010fR\u0018\u0010h\u001a\u00020;*\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bh\u0010=¨\u0006j"}, d2 = {"Lcom/datadog/android/rum/internal/instrumentation/gestures/GesturesListener;", "Lcom/datadog/android/rum/internal/instrumentation/gestures/GestureListenerCompat;", "Lcom/datadog/android/api/SdkCore;", "sdkCore", "Ljava/lang/ref/WeakReference;", "Landroid/view/Window;", "windowReference", "", "Lcom/datadog/android/rum/tracking/ViewAttributesProvider;", "attributesProviders", "Lcom/datadog/android/rum/tracking/InteractionPredicate;", "interactionPredicate", "Ljava/lang/ref/Reference;", "Landroid/content/Context;", "contextRef", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Lcom/datadog/android/api/SdkCore;Ljava/lang/ref/WeakReference;[Lcom/datadog/android/rum/tracking/ViewAttributesProvider;Lcom/datadog/android/rum/tracking/InteractionPredicate;Ljava/lang/ref/Reference;Lcom/datadog/android/api/InternalLogger;)V", "Landroid/view/View;", "decorView", "Landroid/view/MotionEvent;", "onUpEvent", "Lj6g;", "closeScrollOrSwipeEventIfAny", "(Landroid/view/View;Landroid/view/MotionEvent;)V", "closeScrollAsTap", "Lcom/datadog/android/rum/RumActionType;", "type", "closeScrollOrSwipeEvent", "(Lcom/datadog/android/rum/RumActionType;Landroid/view/View;Landroid/view/MotionEvent;)V", "scrollTarget", "", "targetId", "", "", "resolveAttributes", "(Landroid/view/View;Ljava/lang/String;Landroid/view/MotionEvent;)Ljava/util/Map;", "resetScrollEventParameters", "()V", "e", "handleTapUp", "target", "sendTapEventWithTarget", "(Landroid/view/View;)V", "", "x", "y", "findTargetForTap", "(Landroid/view/View;FF)Landroid/view/View;", "findTargetForScroll", "Landroid/view/ViewGroup;", "view", "Ljava/util/LinkedList;", "stack", "", "coordinatesContainer", "handleViewGroup", "(Landroid/view/ViewGroup;FFLjava/util/LinkedList;[I)V", "", "isValidTapTarget", "(Landroid/view/View;)Z", "isValidScrollableTarget", "isScrollableView", "container", "hitTest", "(Landroid/view/View;FF[I)Z", "endEvent", "resolveGestureDirection", "(Landroid/view/MotionEvent;)Ljava/lang/String;", "isJetpackComposeView", "onShowPress", "(Landroid/view/MotionEvent;)V", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", "onDown", "event", "onUp", "startDownEvent", "endUpEvent", "velocityX", "velocityY", "onFling", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z", "currentMoveEvent", "distanceX", "distanceY", "onScroll", "onLongPress", "Lcom/datadog/android/api/SdkCore;", "Ljava/lang/ref/WeakReference;", "[Lcom/datadog/android/rum/tracking/ViewAttributesProvider;", "Lcom/datadog/android/rum/tracking/InteractionPredicate;", "Ljava/lang/ref/Reference;", "Lcom/datadog/android/api/InternalLogger;", "[I", "scrollEventType", "Lcom/datadog/android/rum/RumActionType;", "gestureDirection", "Ljava/lang/String;", "scrollTargetReference", "onTouchDownXPos", "F", "onTouchDownYPos", "isVisible", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class GesturesListener extends GestureListenerCompat {
    public static final String SCROLL_DIRECTION_DOWN = "down";
    public static final String SCROLL_DIRECTION_LEFT = "left";
    public static final String SCROLL_DIRECTION_RIGHT = "right";
    public static final String SCROLL_DIRECTION_UP = "up";
    private final ViewAttributesProvider[] attributesProviders;
    private final Reference<Context> contextRef;
    private final int[] coordinatesContainer;
    private String gestureDirection;
    private final InteractionPredicate interactionPredicate;
    private final InternalLogger internalLogger;
    private float onTouchDownXPos;
    private float onTouchDownYPos;
    private RumActionType scrollEventType;
    private WeakReference<View> scrollTargetReference;
    private final SdkCore sdkCore;
    private final WeakReference<Window> windowReference;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String MSG_NO_TARGET_TAP = "We could not find a valid target for the TAP event. The DecorView was empty and either transparent or not clickable for this Activity.";
    private static final String MSG_NO_TARGET_SCROLL_SWIPE = "We could not find a valid target for the SCROLL or SWIPE event. The DecorView was empty and either transparent or not clickable for this Activity.";

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener$findTargetForScroll$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return GesturesListener.INSTANCE.getMSG_NO_TARGET_SCROLL_SWIPE$dd_sdk_android_rum_release();
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener$findTargetForTap$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C06071 extends mj8 implements gu5<String> {
        public static final C06071 INSTANCE = new C06071();

        public C06071() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return GesturesListener.INSTANCE.getMSG_NO_TARGET_TAP$dd_sdk_android_rum_release();
        }
    }

    public GesturesListener(SdkCore sdkCore, WeakReference<Window> weakReference, ViewAttributesProvider[] viewAttributesProviderArr, InteractionPredicate interactionPredicate, Reference<Context> reference, InternalLogger internalLogger) {
        sdkCore.getClass();
        weakReference.getClass();
        viewAttributesProviderArr.getClass();
        interactionPredicate.getClass();
        reference.getClass();
        internalLogger.getClass();
        this.sdkCore = sdkCore;
        this.windowReference = weakReference;
        this.attributesProviders = viewAttributesProviderArr;
        this.interactionPredicate = interactionPredicate;
        this.contextRef = reference;
        this.internalLogger = internalLogger;
        this.coordinatesContainer = new int[2];
        this.gestureDirection = "";
        this.scrollTargetReference = new WeakReference<>(null);
    }

    private final void closeScrollAsTap(View decorView, MotionEvent onUpEvent) {
        View viewFindTargetForTap;
        if (decorView == null || (viewFindTargetForTap = findTargetForTap(decorView, this.onTouchDownXPos, this.onTouchDownYPos)) != findTargetForTap(decorView, onUpEvent.getX(), onUpEvent.getY()) || viewFindTargetForTap == null) {
            return;
        }
        sendTapEventWithTarget(viewFindTargetForTap);
    }

    private final void closeScrollOrSwipeEvent(RumActionType type, View decorView, MotionEvent onUpEvent) {
        RumMonitor rumMonitor = GlobalRumMonitor.get(this.sdkCore);
        View view = this.scrollTargetReference.get();
        if (decorView == null || view == null) {
            return;
        }
        rumMonitor.stopAction(type, GesturesUtilsKt.resolveTargetName(this.interactionPredicate, view), resolveAttributes(view, GesturesUtilsKt.resourceIdName(this.contextRef.get(), view.getId()), onUpEvent));
    }

    private final void closeScrollOrSwipeEventIfAny(View decorView, MotionEvent onUpEvent) {
        RumActionType rumActionType = this.scrollEventType;
        if (rumActionType == null) {
            closeScrollAsTap(decorView, onUpEvent);
        } else {
            closeScrollOrSwipeEvent(rumActionType, decorView, onUpEvent);
        }
    }

    private final View findTargetForScroll(View decorView, float x, float y) {
        LinkedList<View> linkedList = new LinkedList<>();
        linkedList.add(decorView);
        boolean z = true;
        while (!linkedList.isEmpty()) {
            View viewRemoveFirst = linkedList.removeFirst();
            if (linkedList.isEmpty()) {
                viewRemoveFirst.getClass();
                if (isJetpackComposeView(viewRemoveFirst)) {
                    z = false;
                }
            }
            boolean z2 = z;
            viewRemoveFirst.getClass();
            if (isValidScrollableTarget(viewRemoveFirst)) {
                return viewRemoveFirst;
            }
            if (viewRemoveFirst instanceof ViewGroup) {
                handleViewGroup((ViewGroup) viewRemoveFirst, x, y, linkedList, this.coordinatesContainer);
            }
            z = z2;
        }
        if (!z) {
            return null;
        }
        InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.INFO, InternalLogger.Target.USER, (gu5) AnonymousClass1.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
        return null;
    }

    private final View findTargetForTap(View decorView, float x, float y) {
        LinkedList<View> linkedList = new LinkedList<>();
        linkedList.addFirst(decorView);
        View view = null;
        boolean z = true;
        while (!linkedList.isEmpty()) {
            View viewRemoveFirst = linkedList.removeFirst();
            if (linkedList.isEmpty()) {
                viewRemoveFirst.getClass();
                if (isJetpackComposeView(viewRemoveFirst)) {
                    z = false;
                }
            }
            boolean z2 = z;
            viewRemoveFirst.getClass();
            View view2 = isValidTapTarget(viewRemoveFirst) ? viewRemoveFirst : view;
            if (viewRemoveFirst instanceof ViewGroup) {
                handleViewGroup((ViewGroup) viewRemoveFirst, x, y, linkedList, this.coordinatesContainer);
            }
            z = z2;
            view = view2;
        }
        if (view == null && z) {
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.INFO, InternalLogger.Target.USER, (gu5) C06071.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
        }
        return view;
    }

    private final void handleTapUp(View decorView, MotionEvent e) {
        View viewFindTargetForTap;
        if (decorView == null || (viewFindTargetForTap = findTargetForTap(decorView, e.getX(), e.getY())) == null) {
            return;
        }
        sendTapEventWithTarget(viewFindTargetForTap);
    }

    private final void handleViewGroup(ViewGroup view, float x, float y, LinkedList<View> stack, int[] coordinatesContainer) {
        if (isVisible(view)) {
            int childCount = view.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = view.getChildAt(i);
                childAt.getClass();
                if (hitTest(childAt, x, y, coordinatesContainer)) {
                    stack.add(childAt);
                }
            }
        }
    }

    private final boolean hitTest(View view, float x, float y, int[] container) {
        view.getLocationInWindow(container);
        int i = container[0];
        int i2 = container[1];
        return x >= ((float) i) && x <= ((float) (i + view.getWidth())) && y >= ((float) i2) && y <= ((float) (i2 + view.getHeight()));
    }

    private final boolean isJetpackComposeView(View view) {
        return wve.K(view.getClass().getName(), "androidx.compose.ui.platform.ComposeView", false);
    }

    private final boolean isScrollableView(View view) {
        return ysd.class.isAssignableFrom(view.getClass()) || AbsListView.class.isAssignableFrom(view.getClass()) || ScrollView.class.isAssignableFrom(view.getClass());
    }

    private final boolean isValidScrollableTarget(View view) {
        return isVisible(view) && isScrollableView(view);
    }

    private final boolean isValidTapTarget(View view) {
        return view.isClickable() && isVisible(view);
    }

    private final boolean isVisible(View view) {
        return view.getVisibility() == 0;
    }

    private final void resetScrollEventParameters() {
        this.scrollTargetReference.clear();
        this.scrollEventType = null;
        this.gestureDirection = "";
        this.onTouchDownYPos = 0.0f;
        this.onTouchDownXPos = 0.0f;
    }

    private final Map<String, Object> resolveAttributes(View scrollTarget, String targetId, MotionEvent onUpEvent) {
        LinkedHashMap linkedHashMapB0 = lc9.b0(new Pair(RumAttributes.ACTION_TARGET_CLASS_NAME, GesturesUtilsKt.targetClassName(scrollTarget)), new Pair(RumAttributes.ACTION_TARGET_RESOURCE_ID, targetId));
        if (onUpEvent != null) {
            String strResolveGestureDirection = resolveGestureDirection(onUpEvent);
            this.gestureDirection = strResolveGestureDirection;
            linkedHashMapB0.put(RumAttributes.ACTION_GESTURE_DIRECTION, strResolveGestureDirection);
        }
        for (ViewAttributesProvider viewAttributesProvider : this.attributesProviders) {
            viewAttributesProvider.extractAttributes(scrollTarget, linkedHashMapB0);
        }
        return linkedHashMapB0;
    }

    private final String resolveGestureDirection(MotionEvent endEvent) {
        float x = endEvent.getX() - this.onTouchDownXPos;
        float y = endEvent.getY() - this.onTouchDownYPos;
        return Math.abs(x) > Math.abs(y) ? x > 0.0f ? SCROLL_DIRECTION_RIGHT : SCROLL_DIRECTION_LEFT : y > 0.0f ? SCROLL_DIRECTION_DOWN : SCROLL_DIRECTION_UP;
    }

    private final void sendTapEventWithTarget(View target) {
        LinkedHashMap linkedHashMapB0 = lc9.b0(new Pair(RumAttributes.ACTION_TARGET_CLASS_NAME, GesturesUtilsKt.targetClassName(target)), new Pair(RumAttributes.ACTION_TARGET_RESOURCE_ID, GesturesUtilsKt.resourceIdName(this.contextRef.get(), target.getId())));
        for (ViewAttributesProvider viewAttributesProvider : this.attributesProviders) {
            viewAttributesProvider.extractAttributes(target, linkedHashMapB0);
        }
        GlobalRumMonitor.get(this.sdkCore).addAction(RumActionType.TAP, GesturesUtilsKt.resolveTargetName(this.interactionPredicate, target), linkedHashMapB0);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent e) {
        e.getClass();
        resetScrollEventParameters();
        this.onTouchDownXPos = e.getX();
        this.onTouchDownYPos = e.getY();
        return false;
    }

    @Override // com.datadog.android.rum.internal.instrumentation.gestures.GestureListenerCompat, android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent startDownEvent, MotionEvent endUpEvent, float velocityX, float velocityY) {
        endUpEvent.getClass();
        this.scrollEventType = RumActionType.SWIPE;
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent e) {
        e.getClass();
    }

    @Override // com.datadog.android.rum.internal.instrumentation.gestures.GestureListenerCompat, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent startDownEvent, MotionEvent currentMoveEvent, float distanceX, float distanceY) {
        View decorView;
        currentMoveEvent.getClass();
        RumMonitor rumMonitor = GlobalRumMonitor.get(this.sdkCore);
        Window window = this.windowReference.get();
        if (window != null && (decorView = window.getDecorView()) != null && this.scrollEventType == null) {
            View viewFindTargetForScroll = startDownEvent != null ? findTargetForScroll(decorView, startDownEvent.getX(), startDownEvent.getY()) : null;
            if (viewFindTargetForScroll != null) {
                this.scrollTargetReference = new WeakReference<>(viewFindTargetForScroll);
                Map<String, ? extends Object> mapResolveAttributes = resolveAttributes(viewFindTargetForScroll, GesturesUtilsKt.resourceIdName(this.contextRef.get(), viewFindTargetForScroll.getId()), null);
                RumActionType rumActionType = RumActionType.SCROLL;
                rumMonitor.startAction(rumActionType, GesturesUtilsKt.resolveTargetName(this.interactionPredicate, viewFindTargetForScroll), mapResolveAttributes);
                this.scrollEventType = rumActionType;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent e) {
        e.getClass();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent e) {
        e.getClass();
        Window window = this.windowReference.get();
        handleTapUp(window != null ? window.getDecorView() : null, e);
        return false;
    }

    public final void onUp(MotionEvent event) {
        event.getClass();
        Window window = this.windowReference.get();
        closeScrollOrSwipeEventIfAny(window != null ? window.getDecorView() : null, event);
        resetScrollEventParameters();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u000e\u0010\t\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/internal/instrumentation/gestures/GesturesListener$Companion;", "", "()V", "MSG_NO_TARGET_SCROLL_SWIPE", "", "getMSG_NO_TARGET_SCROLL_SWIPE$dd_sdk_android_rum_release", "()Ljava/lang/String;", "MSG_NO_TARGET_TAP", "getMSG_NO_TARGET_TAP$dd_sdk_android_rum_release", "SCROLL_DIRECTION_DOWN", "SCROLL_DIRECTION_LEFT", "SCROLL_DIRECTION_RIGHT", "SCROLL_DIRECTION_UP", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getMSG_NO_TARGET_SCROLL_SWIPE$dd_sdk_android_rum_release() {
            return GesturesListener.MSG_NO_TARGET_SCROLL_SWIPE;
        }

        public final String getMSG_NO_TARGET_TAP$dd_sdk_android_rum_release() {
            return GesturesListener.MSG_NO_TARGET_TAP;
        }

        private Companion() {
        }
    }

    public /* synthetic */ GesturesListener(SdkCore sdkCore, WeakReference weakReference, ViewAttributesProvider[] viewAttributesProviderArr, InteractionPredicate interactionPredicate, Reference reference, InternalLogger internalLogger, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sdkCore, weakReference, (i & 4) != 0 ? new ViewAttributesProvider[0] : viewAttributesProviderArr, (i & 8) != 0 ? new NoOpInteractionPredicate() : interactionPredicate, reference, internalLogger);
    }
}
