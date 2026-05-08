package com.datadog.android.core.internal.logger;

import android.util.Log;
import com.datadog.android.rum.internal.RumFeature;
import defpackage.mj8;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/datadog/android/core/internal/logger/LogcatLogHandler;", "", "", "tag", "Lkotlin/Function1;", "", "", "predicate", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "resolveTag", "()Ljava/lang/String;", "level", "canLog", "(I)Z", "message", "", RumFeature.EVENT_THROWABLE_PROPERTY, "Lj6g;", "log", "(ILjava/lang/String;Ljava/lang/Throwable;)V", "Ljava/lang/String;", "getTag$dd_sdk_android_core_release", "Lkotlin/jvm/functions/Function1;", "getPredicate$dd_sdk_android_core_release", "()Lkotlin/jvm/functions/Function1;", "Companion", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class LogcatLogHandler {
    private static final int MAX_TAG_LENGTH = 23;
    private final Function1<Integer, Boolean> predicate;
    private final String tag;

    /* JADX WARN: Multi-variable type inference failed */
    public LogcatLogHandler(String str, Function1<? super Integer, Boolean> function1) {
        str.getClass();
        function1.getClass();
        this.tag = str;
        this.predicate = function1;
    }

    private final String resolveTag() {
        this.tag.getClass();
        return this.tag;
    }

    public final boolean canLog(int level) {
        return this.predicate.invoke(Integer.valueOf(level)).booleanValue();
    }

    public final Function1<Integer, Boolean> getPredicate$dd_sdk_android_core_release() {
        return this.predicate;
    }

    /* JADX INFO: renamed from: getTag$dd_sdk_android_core_release, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    public final void log(int level, String message, Throwable throwable) {
        message.getClass();
        if (this.predicate.invoke(Integer.valueOf(level)).booleanValue()) {
            String strResolveTag = resolveTag();
            Log.println(level, strResolveTag, message);
            if (throwable != null) {
                Log.println(level, strResolveTag, Log.getStackTraceString(throwable));
            }
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.logger.LogcatLogHandler$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(I)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements Function1<Integer, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
            return invoke(num.intValue());
        }

        public final Boolean invoke(int i) {
            return Boolean.TRUE;
        }
    }

    public /* synthetic */ LogcatLogHandler(String str, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? AnonymousClass1.INSTANCE : function1);
    }
}
