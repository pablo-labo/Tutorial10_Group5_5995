package com.facebook.react.views.debuggingoverlay;

import android.graphics.RectF;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import com.facebook.react.bridge.NoSuchKeyException;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UnexpectedNativeTypeException;
import com.facebook.react.uimanager.SimpleViewManager;
import defpackage.j6g;
import defpackage.mkf;
import defpackage.nmc;
import defpackage.nn2;
import defpackage.sqg;
import defpackage.ti3;
import defpackage.ui3;
import defpackage.vi3;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@nmc(name = DebuggingOverlayManager.REACT_CLASS)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u001dB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/facebook/react/views/debuggingoverlay/DebuggingOverlayManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lti3;", "Lvi3;", "<init>", "()V", "Lsqg;", "getDelegate", "()Lsqg;", "view", "Lcom/facebook/react/bridge/ReadableArray;", "providedTraceUpdates", "Lj6g;", "highlightTraceUpdates", "(Lti3;Lcom/facebook/react/bridge/ReadableArray;)V", "providedElements", "highlightElements", "clearElementsHighlights", "(Lti3;)V", "Lmkf;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "createViewInstance", "(Lmkf;)Lti3;", "", "getName", "()Ljava/lang/String;", "delegate", "Lsqg;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DebuggingOverlayManager extends SimpleViewManager<ti3> implements vi3<ti3> {
    public static final String REACT_CLASS = "DebuggingOverlay";
    private final sqg<ti3> delegate = new ui3(this, 0);

    @Override // defpackage.vi3
    public void clearElementsHighlights(ti3 view) {
        view.getClass();
        view.e.clear();
        view.invalidate();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ti3 createViewInstance(mkf context) {
        context.getClass();
        return new ti3(context);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public sqg<ti3> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // defpackage.vi3
    public void highlightElements(ti3 view, ReadableArray providedElements) throws Exception {
        view.getClass();
        providedElements.getClass();
        ArrayList arrayList = new ArrayList();
        int size = providedElements.size();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            ReadableMap map = providedElements.getMap(i);
            if (map != null) {
                try {
                    float f = (float) map.getDouble("x");
                    float f2 = (float) map.getDouble("y");
                    arrayList.add(new RectF(nn2.G(f), nn2.G(f2), nn2.G((float) (((double) f) + map.getDouble("width"))), nn2.G((float) (((double) f2) + map.getDouble("height")))));
                } catch (Exception e) {
                    if (!(e instanceof NoSuchKeyException) && !(e instanceof UnexpectedNativeTypeException)) {
                        throw e;
                    }
                    ReactSoftExceptionLogger.logSoftException(REACT_CLASS, new ReactNoCrashSoftException("Unexpected payload for highlighting elements: every element should have x, y, width, height fields"));
                    j6g j6gVar = j6g.a;
                    z = false;
                }
            }
        }
        if (z) {
            view.setHighlightedElementsRectangles(arrayList);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x009a, code lost:
    
        if (r3 == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009c, code lost:
    
        r18.setTraceUpdates(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a1, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return;
     */
    @Override // defpackage.vi3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void highlightTraceUpdates(defpackage.ti3 r18, com.facebook.react.bridge.ReadableArray r19) throws java.lang.Exception {
        /*
            r17 = this;
            r18.getClass()
            r19.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r19.size()
            r0 = 1
            r3 = 0
            r4 = r3
        L12:
            if (r4 >= r2) goto L99
            r5 = r19
            com.facebook.react.bridge.ReadableMap r6 = r5.getMap(r4)
            if (r6 != 0) goto L1e
            goto L95
        L1e:
            java.lang.String r7 = "rectangle"
            com.facebook.react.bridge.ReadableMap r7 = r6.getMap(r7)
            java.lang.String r8 = "DebuggingOverlay"
            if (r7 != 0) goto L33
            com.facebook.react.bridge.ReactNoCrashSoftException r0 = new com.facebook.react.bridge.ReactNoCrashSoftException
            java.lang.String r2 = "Unexpected payload for highlighting trace updates: rectangle field is null"
            r0.<init>(r2)
            com.facebook.react.bridge.ReactSoftExceptionLogger.logSoftException(r8, r0)
            goto L9a
        L33:
            java.lang.String r9 = "id"
            int r9 = r6.getInt(r9)
            java.lang.String r10 = "color"
            int r6 = r6.getInt(r10)
            java.lang.String r10 = "x"
            double r10 = r7.getDouble(r10)     // Catch: java.lang.Exception -> L7d
            float r10 = (float) r10     // Catch: java.lang.Exception -> L7d
            java.lang.String r11 = "y"
            double r11 = r7.getDouble(r11)     // Catch: java.lang.Exception -> L7d
            float r11 = (float) r11     // Catch: java.lang.Exception -> L7d
            double r12 = (double) r10     // Catch: java.lang.Exception -> L7d
            java.lang.String r14 = "width"
            double r14 = r7.getDouble(r14)     // Catch: java.lang.Exception -> L7d
            double r12 = r12 + r14
            float r12 = (float) r12     // Catch: java.lang.Exception -> L7d
            double r13 = (double) r11     // Catch: java.lang.Exception -> L7d
            java.lang.String r15 = "height"
            double r15 = r7.getDouble(r15)     // Catch: java.lang.Exception -> L7d
            double r13 = r13 + r15
            float r7 = (float) r13     // Catch: java.lang.Exception -> L7d
            android.graphics.RectF r13 = new android.graphics.RectF     // Catch: java.lang.Exception -> L7d
            float r10 = defpackage.nn2.G(r10)     // Catch: java.lang.Exception -> L7d
            float r11 = defpackage.nn2.G(r11)     // Catch: java.lang.Exception -> L7d
            float r12 = defpackage.nn2.G(r12)     // Catch: java.lang.Exception -> L7d
            float r7 = defpackage.nn2.G(r7)     // Catch: java.lang.Exception -> L7d
            r13.<init>(r10, r11, r12, r7)     // Catch: java.lang.Exception -> L7d
            opf r7 = new opf     // Catch: java.lang.Exception -> L7d
            r7.<init>(r13, r9, r6)     // Catch: java.lang.Exception -> L7d
            r1.add(r7)     // Catch: java.lang.Exception -> L7d
            goto L95
        L7d:
            r0 = move-exception
            boolean r6 = r0 instanceof com.facebook.react.bridge.NoSuchKeyException
            if (r6 != 0) goto L88
            boolean r6 = r0 instanceof com.facebook.react.bridge.UnexpectedNativeTypeException
            if (r6 == 0) goto L87
            goto L88
        L87:
            throw r0
        L88:
            com.facebook.react.bridge.ReactNoCrashSoftException r0 = new com.facebook.react.bridge.ReactNoCrashSoftException
            java.lang.String r6 = "Unexpected payload for highlighting trace updates: rectangle field should have x, y, width, height fields"
            r0.<init>(r6)
            com.facebook.react.bridge.ReactSoftExceptionLogger.logSoftException(r8, r0)
            j6g r0 = defpackage.j6g.a
            r0 = r3
        L95:
            int r4 = r4 + 1
            goto L12
        L99:
            r3 = r0
        L9a:
            if (r3 == 0) goto La1
            r2 = r18
            r2.setTraceUpdates(r1)
        La1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.debuggingoverlay.DebuggingOverlayManager.highlightTraceUpdates(ti3, com.facebook.react.bridge.ReadableArray):void");
    }
}
