package com.facebook.react.views.switchview;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.events.EventDispatcher;
import defpackage.dmc;
import defpackage.ja0;
import defpackage.ka0;
import defpackage.m6h;
import defpackage.mkf;
import defpackage.nn2;
import defpackage.snc;
import defpackage.sqg;
import defpackage.toc;
import defpackage.uoc;
import defpackage.voc;
import defpackage.woc;
import defpackage.wtf;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\t\n\u0002\b\b\b\u0000\u0018\u0000 I2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00020\u0004:\u0001JB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\u001e\u0010\u001cJ\u001f\u0010 \u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0019H\u0017¢\u0006\u0004\b \u0010\u001cJ\u001f\u0010\"\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\"\u0010\u001cJ!\u0010$\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\u0014H\u0017¢\u0006\u0004\b$\u0010%J!\u0010&\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\u0014H\u0017¢\u0006\u0004\b&\u0010%J!\u0010'\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\u0014H\u0017¢\u0006\u0004\b'\u0010%J!\u0010(\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\u0014H\u0017¢\u0006\u0004\b(\u0010%J!\u0010)\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\u0014H\u0017¢\u0006\u0004\b)\u0010%J\u001f\u0010*\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0019H\u0016¢\u0006\u0004\b*\u0010\u001cJ\u001f\u0010,\u001a\u00020\u00162\u0006\u0010+\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0002H\u0014¢\u0006\u0004\b,\u0010-J\u001f\u00101\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\u00022\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u0015\u00104\u001a\b\u0012\u0004\u0012\u00020\u000203H\u0014¢\u0006\u0004\b4\u00105J_\u0010D\u001a\u00020C2\u0006\u0010\u0010\u001a\u0002062\b\u00108\u001a\u0004\u0018\u0001072\b\u00109\u001a\u0004\u0018\u0001072\b\u0010:\u001a\u0004\u0018\u0001072\u0006\u0010<\u001a\u00020;2\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00020;2\u0006\u0010@\u001a\u00020=2\b\u0010B\u001a\u0004\u0018\u00010AH\u0016¢\u0006\u0004\bD\u0010EJ\u001f\u0010F\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0019H\u0002¢\u0006\u0004\bF\u0010\u001cR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006K"}, d2 = {"Lcom/facebook/react/views/switchview/ReactSwitchManager;", "Lcom/facebook/react/uimanager/BaseViewManager;", "Ltoc;", "Lwoc;", "Lka0;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "createShadowNodeInstance", "()Lwoc;", "Ljava/lang/Class;", "getShadowNodeClass", "()Ljava/lang/Class;", "Lmkf;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "createViewInstance", "(Lmkf;)Ltoc;", "view", "", "backgroundColor", "Lj6g;", "setBackgroundColor", "(Ltoc;I)V", "", "disabled", "setDisabled", "(Ltoc;Z)V", "enabled", "setEnabled", "on", "setOn", "value", "setValue", "color", "setThumbTintColor", "(Ltoc;Ljava/lang/Integer;)V", "setThumbColor", "setTrackColorForFalse", "setTrackColorForTrue", "setTrackTintColor", "setNativeValue", "reactContext", "addEventEmitters", "(Lmkf;Ltoc;)V", "root", "", "extraData", "updateExtraData", "(Ltoc;Ljava/lang/Object;)V", "Lsqg;", "getDelegate", "()Lsqg;", "Landroid/content/Context;", "Lcom/facebook/react/bridge/ReadableMap;", "localData", "props", "state", "", "width", "Lm6h;", "widthMode", "height", "heightMode", "", "attachmentsPositions", "", "measure", "(Landroid/content/Context;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;FLm6h;FLm6h;[F)J", "setValueInternal", "delegate", "Lsqg;", "Companion", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactSwitchManager extends BaseViewManager<toc, woc> implements ka0<toc> {
    private static final CompoundButton.OnCheckedChangeListener ON_CHECKED_CHANGE_LISTENER = new voc();
    public static final String REACT_CLASS = "AndroidSwitch";
    private final sqg<toc> delegate = new ja0(this, 0);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ON_CHECKED_CHANGE_LISTENER$lambda$2(CompoundButton compoundButton, boolean z) {
        compoundButton.getClass();
        Context context = compoundButton.getContext();
        context.getClass();
        ReactContext reactContext = (ReactContext) context;
        int id = compoundButton.getId();
        EventDispatcher eventDispatcherE = dmc.e(reactContext, id);
        if (eventDispatcherE != null) {
            eventDispatcherE.a(new uoc(dmc.g(reactContext), id, z));
        }
    }

    private final void setValueInternal(toc view, boolean value) {
        view.setOnCheckedChangeListener(null);
        view.setOn(value);
        view.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(mkf reactContext, toc view) {
        reactContext.getClass();
        view.getClass();
        view.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public woc createShadowNodeInstance() {
        return new woc();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public toc createViewInstance(mkf context) {
        context.getClass();
        toc tocVar = new toc(context);
        tocVar.setShowText(false);
        return tocVar;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public sqg<toc> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<woc> getShadowNodeClass() {
        return woc.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public long measure(Context context, ReadableMap localData, ReadableMap props, ReadableMap state, float width, m6h widthMode, float height, m6h heightMode, float[] attachmentsPositions) {
        context.getClass();
        widthMode.getClass();
        heightMode.getClass();
        toc tocVar = new toc(context);
        tocVar.setShowText(false);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        tocVar.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        return wtf.e(nn2.C(tocVar.getMeasuredWidth()), nn2.C(tocVar.getMeasuredHeight()));
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    public void setBackgroundColor(toc view, int backgroundColor) {
        view.getClass();
        view.setBackgroundColor(backgroundColor);
    }

    @Override // defpackage.ka0
    @snc(defaultBoolean = false, name = "disabled")
    public void setDisabled(toc view, boolean disabled) {
        view.getClass();
        view.setEnabled(!disabled);
    }

    @Override // defpackage.ka0
    @snc(defaultBoolean = true, name = "enabled")
    public void setEnabled(toc view, boolean enabled) {
        view.getClass();
        view.setEnabled(enabled);
    }

    @Override // defpackage.ka0
    public void setNativeValue(toc view, boolean value) {
        view.getClass();
        setValueInternal(view, value);
    }

    @Override // defpackage.ka0
    @snc(name = "on")
    public void setOn(toc view, boolean on) {
        view.getClass();
        setValueInternal(view, on);
    }

    @Override // defpackage.ka0
    @snc(customType = "Color", name = "thumbColor")
    public void setThumbColor(toc view, Integer color) {
        view.getClass();
        view.setThumbColor(color);
    }

    @Override // defpackage.ka0
    @snc(customType = "Color", name = "thumbTintColor")
    public void setThumbTintColor(toc view, Integer color) {
        view.getClass();
        setThumbColor(view, color);
    }

    @Override // defpackage.ka0
    @snc(customType = "Color", name = "trackColorForFalse")
    public void setTrackColorForFalse(toc view, Integer color) {
        view.getClass();
        view.setTrackColorForFalse(color);
    }

    @Override // defpackage.ka0
    @snc(customType = "Color", name = "trackColorForTrue")
    public void setTrackColorForTrue(toc view, Integer color) {
        view.getClass();
        view.setTrackColorForTrue(color);
    }

    @Override // defpackage.ka0
    @snc(customType = "Color", name = "trackTintColor")
    public void setTrackTintColor(toc view, Integer color) {
        view.getClass();
        view.setTrackColor(color);
    }

    @Override // defpackage.ka0
    @snc(name = "value")
    public void setValue(toc view, boolean value) {
        view.getClass();
        setValueInternal(view, value);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(toc root, Object extraData) {
        root.getClass();
        extraData.getClass();
    }
}
