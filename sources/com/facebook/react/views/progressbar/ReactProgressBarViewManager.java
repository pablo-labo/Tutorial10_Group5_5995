package com.facebook.react.views.progressbar;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.widget.ProgressBar;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import defpackage.f90;
import defpackage.g90;
import defpackage.m6h;
import defpackage.mkf;
import defpackage.nmc;
import defpackage.nn2;
import defpackage.snc;
import defpackage.sqg;
import defpackage.wtf;
import java.util.WeakHashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@nmc(name = ReactProgressBarViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 I2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00020\u0004:\u0001JB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0017H\u0017¢\u0006\u0004\b \u0010\u001aJ!\u0010\"\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\"\u0010\u0012J!\u0010#\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0004\b#\u0010\u0012J\u000f\u0010$\u001a\u00020\u0003H\u0016¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030&H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010,\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0002H\u0014¢\u0006\u0004\b.\u0010/J\u0015\u00101\u001a\b\u0012\u0004\u0012\u00020\u000200H\u0014¢\u0006\u0004\b1\u00102JY\u0010A\u001a\u00020@2\u0006\u0010\u000b\u001a\u0002032\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u0002042\u0006\u00107\u001a\u0002042\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u0002082\u0006\u0010=\u001a\u00020:2\b\u0010?\u001a\u0004\u0018\u00010>H\u0016¢\u0006\u0004\bA\u0010BR,\u0010E\u001a\u001a\u0012\u0004\u0012\u00020\u0013\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130D0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006K"}, d2 = {"Lcom/facebook/react/views/progressbar/ReactProgressBarViewManager;", "Lcom/facebook/react/uimanager/BaseViewManager;", "Lcom/facebook/react/views/progressbar/a;", "Lcom/facebook/react/views/progressbar/b;", "Lg90;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lmkf;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "createViewInstance", "(Lmkf;)Lcom/facebook/react/views/progressbar/a;", "view", "styleName", "Lj6g;", "setStyleAttr", "(Lcom/facebook/react/views/progressbar/a;Ljava/lang/String;)V", "", "color", "setColor", "(Lcom/facebook/react/views/progressbar/a;Ljava/lang/Integer;)V", "", ReactProgressBarViewManager.PROP_INDETERMINATE, "setIndeterminate", "(Lcom/facebook/react/views/progressbar/a;Z)V", "", ReactProgressBarViewManager.PROP_PROGRESS, "setProgress", "(Lcom/facebook/react/views/progressbar/a;D)V", ReactProgressBarViewManager.PROP_ANIMATING, "setAnimating", "value", "setTestID", "setTypeAttr", "createShadowNodeInstance", "()Lcom/facebook/react/views/progressbar/b;", "Ljava/lang/Class;", "getShadowNodeClass", "()Ljava/lang/Class;", "root", "", "extraData", "updateExtraData", "(Lcom/facebook/react/views/progressbar/a;Ljava/lang/Object;)V", "onAfterUpdateTransaction", "(Lcom/facebook/react/views/progressbar/a;)V", "Lsqg;", "getDelegate", "()Lsqg;", "Landroid/content/Context;", "Lcom/facebook/react/bridge/ReadableMap;", "localData", "props", "state", "", "width", "Lm6h;", "widthMode", "height", "heightMode", "", "attachmentsPositions", "", "measure", "(Landroid/content/Context;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;FLm6h;FLm6h;[F)J", "Ljava/util/WeakHashMap;", "Landroid/util/Pair;", "measuredStyles", "Ljava/util/WeakHashMap;", "delegate", "Lsqg;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactProgressBarViewManager extends BaseViewManager<a, b> implements g90<a> {
    public static final String DEFAULT_STYLE = "Normal";
    public static final String PROP_ANIMATING = "animating";
    public static final String PROP_ATTR = "typeAttr";
    public static final String PROP_INDETERMINATE = "indeterminate";
    public static final String PROP_PROGRESS = "progress";
    public static final String PROP_STYLE = "styleAttr";
    public static final String REACT_CLASS = "AndroidProgressBar";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final Object progressBarCtorLock = new Object();
    private final WeakHashMap<Integer, Pair<Integer, Integer>> measuredStyles = new WeakHashMap<>();
    private final sqg<a> delegate = new f90(this, 0);

    /* JADX INFO: renamed from: com.facebook.react.views.progressbar.ReactProgressBarViewManager$a, reason: from kotlin metadata */
    public static final class Companion {
        public static ProgressBar a(Context context, int i) {
            ProgressBar progressBar;
            synchronized (ReactProgressBarViewManager.progressBarCtorLock) {
                progressBar = new ProgressBar(context, null, i);
            }
            return progressBar;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int b(java.lang.String r3) {
            /*
                java.lang.String r0 = "ReactNative"
                r1 = 16842871(0x1010077, float:2.3693892E-38)
                if (r3 == 0) goto L6f
                int r2 = r3.hashCode()
                switch(r2) {
                    case -1955878649: goto L5d;
                    case -1414214583: goto L50;
                    case -913872828: goto L43;
                    case -670403824: goto L36;
                    case -142408811: goto L29;
                    case 73190171: goto L1c;
                    case 79996135: goto Lf;
                    default: goto Le;
                }
            Le:
                goto L65
            Lf:
                java.lang.String r2 = "Small"
                boolean r2 = r3.equals(r2)
                if (r2 != 0) goto L18
                goto L65
            L18:
                r3 = 16842873(0x1010079, float:2.3693897E-38)
                return r3
            L1c:
                java.lang.String r2 = "Large"
                boolean r2 = r3.equals(r2)
                if (r2 != 0) goto L25
                goto L65
            L25:
                r3 = 16842874(0x101007a, float:2.36939E-38)
                return r3
            L29:
                java.lang.String r2 = "LargeInverse"
                boolean r2 = r3.equals(r2)
                if (r2 != 0) goto L32
                goto L65
            L32:
                r3 = 16843401(0x1010289, float:2.3695377E-38)
                return r3
            L36:
                java.lang.String r2 = "Inverse"
                boolean r2 = r3.equals(r2)
                if (r2 != 0) goto L3f
                goto L65
            L3f:
                r3 = 16843399(0x1010287, float:2.369537E-38)
                return r3
            L43:
                java.lang.String r2 = "Horizontal"
                boolean r2 = r3.equals(r2)
                if (r2 != 0) goto L4c
                goto L65
            L4c:
                r3 = 16842872(0x1010078, float:2.3693894E-38)
                return r3
            L50:
                java.lang.String r2 = "SmallInverse"
                boolean r2 = r3.equals(r2)
                if (r2 != 0) goto L59
                goto L65
            L59:
                r3 = 16843400(0x1010288, float:2.3695374E-38)
                return r3
            L5d:
                java.lang.String r2 = "Normal"
                boolean r2 = r3.equals(r2)
                if (r2 != 0) goto L6e
            L65:
                java.lang.String r2 = "Unknown ProgressBar style: "
                java.lang.String r3 = r2.concat(r3)
                defpackage.s55.n(r0, r3)
            L6e:
                return r1
            L6f:
                java.lang.String r3 = "ProgressBar needs to have a style, null received"
                defpackage.s55.n(r0, r3)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.progressbar.ReactProgressBarViewManager.Companion.b(java.lang.String):int");
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public b createShadowNodeInstance() {
        return new b();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public a createViewInstance(mkf context) {
        context.getClass();
        a aVar = new a(context);
        aVar.b = true;
        aVar.c = true;
        return aVar;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public sqg<a> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<b> getShadowNodeClass() {
        return b.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public long measure(Context context, ReadableMap localData, ReadableMap props, ReadableMap state, float width, m6h widthMode, float height, m6h heightMode, float[] attachmentsPositions) {
        context.getClass();
        localData.getClass();
        props.getClass();
        state.getClass();
        widthMode.getClass();
        heightMode.getClass();
        Companion companion = INSTANCE;
        String string = props.getString(PROP_STYLE);
        companion.getClass();
        int iB = Companion.b(string);
        WeakHashMap<Integer, Pair<Integer, Integer>> weakHashMap = this.measuredStyles;
        Integer numValueOf = Integer.valueOf(iB);
        Pair<Integer, Integer> pairCreate = weakHashMap.get(numValueOf);
        if (pairCreate == null) {
            ProgressBar progressBarA = Companion.a(context, iB);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            progressBarA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            pairCreate = Pair.create(Integer.valueOf(progressBarA.getMeasuredWidth()), Integer.valueOf(progressBarA.getMeasuredHeight()));
            weakHashMap.put(numValueOf, pairCreate);
        }
        Pair<Integer, Integer> pair = pairCreate;
        return wtf.e(nn2.C(((Number) pair.first).intValue()), nn2.C(((Number) pair.second).intValue()));
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(a view) {
        view.getClass();
        view.a();
    }

    @Override // defpackage.g90
    @snc(name = PROP_ANIMATING)
    public void setAnimating(a view, boolean animating) {
        view.getClass();
        view.setAnimating$ReactAndroid_release(animating);
    }

    @Override // defpackage.g90
    @snc(customType = "Color", name = "color")
    public void setColor(a view, Integer color) {
        view.getClass();
        view.setColor$ReactAndroid_release(color);
    }

    @Override // defpackage.g90
    @snc(name = PROP_INDETERMINATE)
    public void setIndeterminate(a view, boolean indeterminate) {
        view.getClass();
        view.setIndeterminate$ReactAndroid_release(indeterminate);
    }

    @Override // defpackage.g90
    @snc(name = PROP_PROGRESS)
    public void setProgress(a view, double progress) {
        view.getClass();
        view.setProgress$ReactAndroid_release(progress);
    }

    @Override // defpackage.g90
    @snc(name = PROP_STYLE)
    public void setStyleAttr(a view, String styleName) {
        view.getClass();
        view.setStyle$ReactAndroid_release(styleName);
    }

    @Override // defpackage.g90
    public void setTestID(a view, String value) {
        view.getClass();
        super.setTestId(view, value);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(a root, Object extraData) {
        root.getClass();
        extraData.getClass();
    }

    @Override // defpackage.g90
    @snc(name = PROP_ATTR)
    public void setTypeAttr(a view, String value) {
        view.getClass();
    }
}
