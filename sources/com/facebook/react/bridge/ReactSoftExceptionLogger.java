package com.facebook.react.bridge;

import defpackage.f84;
import defpackage.s55;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001:\u0003\u0017\u0018\u0019B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0010\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/facebook/react/bridge/ReactSoftExceptionLogger;", "", "<init>", "()V", "Lcom/facebook/react/bridge/ReactSoftExceptionLogger$ReactSoftExceptionListener;", "listener", "Lj6g;", "addListener", "(Lcom/facebook/react/bridge/ReactSoftExceptionLogger$ReactSoftExceptionListener;)V", "removeListener", "", "category", "", "cause", "logSoftExceptionVerbose", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "logSoftException", "message", "logNoThrowSoftExceptionWithMessage", "(Ljava/lang/String;Ljava/lang/String;)V", "", "listeners", "Ljava/util/List;", "CategoryMode", "Categories", "ReactSoftExceptionListener", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@f84
public final class ReactSoftExceptionLogger {
    public static final ReactSoftExceptionLogger INSTANCE = new ReactSoftExceptionLogger();
    private static final List<ReactSoftExceptionListener> listeners = new CopyOnWriteArrayList();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/facebook/react/bridge/ReactSoftExceptionLogger$Categories;", "", "<init>", "()V", "RVG_IS_VIEW_CLIPPED", "", "RVG_ON_VIEW_REMOVED", "CLIPPING_PROHIBITED_VIEW", "SOFT_ASSERTIONS", "SURFACE_MOUNTING_MANAGER_MISSING_VIEWSTATE", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Categories {
        public static final String CLIPPING_PROHIBITED_VIEW = "ReactClippingProhibitedView";
        public static final Categories INSTANCE = new Categories();
        public static final String RVG_IS_VIEW_CLIPPED = "ReactViewGroup.isViewClipped";
        public static final String RVG_ON_VIEW_REMOVED = "ReactViewGroup.onViewRemoved";
        public static final String SOFT_ASSERTIONS = "SoftAssertions";
        public static final String SURFACE_MOUNTING_MANAGER_MISSING_VIEWSTATE = "SurfaceMountingManager:MissingViewState";

        private Categories() {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/facebook/react/bridge/ReactSoftExceptionLogger$CategoryMode;", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public @interface CategoryMode {
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/bridge/ReactSoftExceptionLogger$ReactSoftExceptionListener;", "", "", "category", "", "cause", "Lj6g;", "logSoftException", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ReactSoftExceptionListener {
        void logSoftException(String category, Throwable cause);
    }

    private ReactSoftExceptionLogger() {
    }

    public static final void addListener(ReactSoftExceptionListener listener) {
        listener.getClass();
        List<ReactSoftExceptionListener> list = listeners;
        if (list.contains(listener)) {
            return;
        }
        list.add(listener);
    }

    @f84
    private static final void logNoThrowSoftExceptionWithMessage(String category, String message) {
        logSoftException(category, new ReactNoCrashSoftException(message));
    }

    public static final void logSoftException(String category, Throwable cause) {
        category.getClass();
        cause.getClass();
        List<ReactSoftExceptionListener> list = listeners;
        if (list.isEmpty()) {
            s55.g(category, "Unhandled SoftException", cause);
            return;
        }
        Iterator<ReactSoftExceptionListener> it = list.iterator();
        while (it.hasNext()) {
            it.next().logSoftException(category, cause);
        }
    }

    public static final void logSoftExceptionVerbose(String category, Throwable cause) {
        category.getClass();
        cause.getClass();
        logSoftException(category + "|" + cause.getClass().getSimpleName() + ":" + cause.getMessage(), cause);
    }

    public static final void removeListener(ReactSoftExceptionListener listener) {
        listener.getClass();
        listeners.remove(listener);
    }
}
