package com.facebook.react.uimanager;

import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.d;
import defpackage.hh1;
import defpackage.ie7;
import defpackage.jmc;
import defpackage.koc;
import defpackage.m6h;
import defpackage.mkf;
import defpackage.noc;
import defpackage.s55;
import defpackage.sqg;
import defpackage.vse;
import defpackage.yqg;
import defpackage.zo7;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ViewManager<T extends View, C extends koc> extends BaseJavaModule {
    private static final String TAG = "ViewManager";
    private sqg<T> mDelegate;
    private HashMap<Integer, Stack<T>> mRecyclableViews;

    public ViewManager() {
        super(null);
        this.mDelegate = null;
        this.mRecyclableViews = null;
    }

    private sqg<T> getOrCreateViewManagerDelegate() {
        sqg<T> sqgVar = this.mDelegate;
        if (sqgVar != null) {
            return sqgVar;
        }
        sqg<T> delegate = getDelegate();
        this.mDelegate = delegate;
        return delegate;
    }

    private Stack<T> getRecyclableViewStack(int i, boolean z) {
        HashMap<Integer, Stack<T>> map = this.mRecyclableViews;
        if (map == null) {
            return null;
        }
        if (z && !map.containsKey(Integer.valueOf(i))) {
            this.mRecyclableViews.put(Integer.valueOf(i), new Stack<>());
        }
        return this.mRecyclableViews.get(Integer.valueOf(i));
    }

    public void addEventEmitters(mkf mkfVar, T t) {
    }

    public C createShadowNodeInstance() {
        throw new RuntimeException("ViewManager subclasses must implement createShadowNodeInstance()");
    }

    public T createView(int i, mkf mkfVar, noc nocVar, vse vseVar, zo7 zo7Var) {
        T t = (T) createViewInstance(i, mkfVar, nocVar, vseVar);
        if (t instanceof jmc) {
            ((jmc) t).setOnInterceptTouchEventListener(zo7Var);
        }
        return t;
    }

    public T createViewInstance(int i, mkf mkfVar, noc nocVar, vse vseVar) {
        Object objUpdateState;
        Stack<T> recyclableViewStack = getRecyclableViewStack(mkfVar.b, true);
        T t = (recyclableViewStack == null || recyclableViewStack.empty()) ? (T) createViewInstance(mkfVar) : (T) recycleView(mkfVar, recyclableViewStack.pop());
        t.setId(i);
        addEventEmitters(mkfVar, t);
        if (nocVar != null) {
            updateProperties(t, nocVar);
        }
        if (vseVar != null && (objUpdateState = updateState(t, nocVar, vseVar)) != null) {
            updateExtraData(t, objUpdateState);
        }
        return t;
    }

    public abstract T createViewInstance(mkf mkfVar);

    public boolean experimental_isPrefetchingEnabled() {
        return false;
    }

    public void experimental_prefetchResource(ReactContext reactContext, int i, int i2, com.facebook.react.common.mapbuffer.a aVar) {
    }

    public Map<String, Integer> getCommandsMap() {
        return null;
    }

    public sqg<T> getDelegate() {
        if (this instanceof yqg) {
            ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("ViewManager using codegen must override getDelegate method (name: " + getName() + ")."));
        }
        return new d.c(this);
    }

    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        return null;
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return null;
    }

    public Map<String, Object> getExportedViewConstants() {
        return null;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public abstract String getName();

    public Map<String, String> getNativeProps() {
        Class<?> cls = getClass();
        Class<? extends C> shadowNodeClass = getShadowNodeClass();
        HashMap map = d.a;
        HashMap map2 = new HashMap();
        d.c(cls).b(map2);
        if (shadowNodeClass != null) {
            d.d(shadowNodeClass).b(map2);
        }
        return map2;
    }

    public abstract Class<? extends C> getShadowNodeClass();

    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f, m6h m6hVar, float f2, m6h m6hVar2, float[] fArr) {
        return 0L;
    }

    public void onAfterUpdateTransaction(T t) {
    }

    public void onDropViewInstance(T t) {
        View viewPrepareToRecycleView;
        Context context = t.getContext();
        if (context == null) {
            s55.f(TAG, "onDropViewInstance: view [" + t.getId() + "] has a null context");
            return;
        }
        if (!(context instanceof mkf)) {
            s55.f(TAG, "onDropViewInstance: view [" + t.getId() + "] has a context that is not a ThemedReactContext: " + context);
            return;
        }
        mkf mkfVar = (mkf) context;
        Stack<T> recyclableViewStack = getRecyclableViewStack(mkfVar.b, false);
        if (recyclableViewStack == null || (viewPrepareToRecycleView = prepareToRecycleView(mkfVar, t)) == null) {
            return;
        }
        hh1.m(viewPrepareToRecycleView.getParent() == null, "Recycled view [" + t.getId() + "] should not be attached to a parent. View: " + t + " Parent: " + viewPrepareToRecycleView.getParent() + " ThemedReactContext: " + mkfVar);
        recyclableViewStack.push(viewPrepareToRecycleView);
    }

    public void onSurfaceStopped(int i) {
        HashMap<Integer, Stack<T>> map = this.mRecyclableViews;
        if (map != null) {
            map.remove(Integer.valueOf(i));
        }
    }

    public abstract T prepareToRecycleView(mkf mkfVar, T t);

    public void receiveCommand(T t, String str, ReadableArray readableArray) {
        getOrCreateViewManagerDelegate().f(t, str, readableArray);
    }

    public T recycleView(mkf mkfVar, T t) {
        return t;
    }

    public void setPadding(T t, int i, int i2, int i3, int i4) {
    }

    public void setupViewRecycling() {
        if (ie7.g0.enableViewRecycling()) {
            this.mRecyclableViews = new HashMap<>();
        }
    }

    public void trimMemory() {
        if (this.mRecyclableViews != null) {
            this.mRecyclableViews = new HashMap<>();
        }
    }

    public abstract void updateExtraData(T t, Object obj);

    public void updateProperties(T t, noc nocVar) {
        sqg<T> orCreateViewManagerDelegate = getOrCreateViewManagerDelegate();
        Iterator<Map.Entry<String, Object>> entryIterator = nocVar.a.getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Object> next = entryIterator.next();
            orCreateViewManagerDelegate.a(t, next.getKey(), next.getValue());
        }
        onAfterUpdateTransaction(t);
    }

    public Object updateState(T t, noc nocVar, vse vseVar) {
        return null;
    }

    public C createShadowNodeInstance(ReactApplicationContext reactApplicationContext) {
        return (C) createShadowNodeInstance();
    }

    @Deprecated
    public void receiveCommand(T t, int i, ReadableArray readableArray) {
    }

    public ViewManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mDelegate = null;
        this.mRecyclableViews = null;
    }
}
