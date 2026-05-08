package com.datadog.android.rum.internal.instrumentation.gestures;

import android.content.Context;
import android.view.MotionEvent;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import defpackage.oz5;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/datadog/android/rum/internal/instrumentation/gestures/GesturesDetectorWrapper;", "", "Lcom/datadog/android/rum/internal/instrumentation/gestures/GesturesListener;", "gestureListener", "Loz5;", "defaultGesturesDetector", "<init>", "(Lcom/datadog/android/rum/internal/instrumentation/gestures/GesturesListener;Loz5;)V", "Landroid/content/Context;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "(Landroid/content/Context;Lcom/datadog/android/rum/internal/instrumentation/gestures/GesturesListener;)V", "Landroid/view/MotionEvent;", "event", "Lj6g;", "onTouchEvent", "(Landroid/view/MotionEvent;)V", "Lcom/datadog/android/rum/internal/instrumentation/gestures/GesturesListener;", "Loz5;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class GesturesDetectorWrapper {
    private final oz5 defaultGesturesDetector;
    private final GesturesListener gestureListener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GesturesDetectorWrapper(Context context, GesturesListener gesturesListener) {
        this(gesturesListener, new oz5(context, gesturesListener));
        context.getClass();
        gesturesListener.getClass();
    }

    public final void onTouchEvent(MotionEvent event) {
        event.getClass();
        this.defaultGesturesDetector.a.onTouchEvent(event);
        if (event.getActionMasked() == 1) {
            this.gestureListener.onUp(event);
        }
    }

    public GesturesDetectorWrapper(GesturesListener gesturesListener, oz5 oz5Var) {
        gesturesListener.getClass();
        oz5Var.getClass();
        this.gestureListener = gesturesListener;
        this.defaultGesturesDetector = oz5Var;
    }
}
