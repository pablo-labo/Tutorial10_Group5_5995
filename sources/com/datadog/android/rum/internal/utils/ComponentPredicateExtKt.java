package com.datadog.android.rum.internal.utils;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.rum.tracking.ComponentPredicate;
import defpackage.gu5;
import defpackage.j6g;
import defpackage.mj8;
import defpackage.u63;
import defpackage.zve;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u001aM\u0010\t\u001a\u00020\u0007\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0080\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a.\u0010\f\u001a\u00020\u000b\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000e"}, d2 = {"", "T", "Lcom/datadog/android/rum/tracking/ComponentPredicate;", "component", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lkotlin/Function1;", "Lj6g;", "operation", "runIfValid", "(Lcom/datadog/android/rum/tracking/ComponentPredicate;Ljava/lang/Object;Lcom/datadog/android/api/InternalLogger;Lkotlin/jvm/functions/Function1;)V", "", "resolveViewName", "(Lcom/datadog/android/rum/tracking/ComponentPredicate;Ljava/lang/Object;)Ljava/lang/String;", "dd-sdk-android-rum_release"}, k = 2, mv = {1, 7, 0}, xi = 48)
public final class ComponentPredicateExtKt {
    public static final /* synthetic */ <T> String resolveViewName(ComponentPredicate<T> componentPredicate, T t) {
        componentPredicate.getClass();
        t.getClass();
        String viewName = componentPredicate.getViewName(t);
        return (viewName == null || zve.U(viewName)) ? ViewUtilsKt.resolveViewUrl(t) : viewName;
    }

    public static final /* synthetic */ <T> void runIfValid(ComponentPredicate<T> componentPredicate, T t, InternalLogger internalLogger, Function1<? super T, j6g> function1) {
        componentPredicate.getClass();
        t.getClass();
        internalLogger.getClass();
        function1.getClass();
        if (componentPredicate.accept(t)) {
            try {
                function1.invoke(t);
            } catch (Exception e) {
                InternalLogger.DefaultImpls.log$default(internalLogger, InternalLogger.Level.ERROR, u63.a0(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), (gu5) AnonymousClass1.INSTANCE, (Throwable) e, false, (Map) null, 48, (Object) null);
            }
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.utils.ComponentPredicateExtKt$runIfValid$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 176)
    public static final class AnonymousClass1 extends mj8 implements gu5<String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return "Internal operation failed on ComponentPredicate";
        }
    }
}
