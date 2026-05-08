package com.datadog.android.core.feature.event;

import com.datadog.android.ndk.internal.NdkCrashLog;
import com.datadog.android.rum.internal.RumFeature;
import defpackage.akb;
import defpackage.g7;
import defpackage.ia;
import defpackage.wl7;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0002\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/datadog/android/core/feature/event/JvmCrash;", "", "()V", "message", "", "getMessage", "()Ljava/lang/String;", "threads", "", "Lcom/datadog/android/core/feature/event/ThreadDump;", "getThreads", "()Ljava/util/List;", RumFeature.EVENT_THROWABLE_PROPERTY, "", "getThrowable", "()Ljava/lang/Throwable;", "Logs", "Rum", "Lcom/datadog/android/core/feature/event/JvmCrash$Logs;", "Lcom/datadog/android/core/feature/event/JvmCrash$Rum;", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public abstract class JvmCrash {

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003JK\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, d2 = {"Lcom/datadog/android/core/feature/event/JvmCrash$Logs;", "Lcom/datadog/android/core/feature/event/JvmCrash;", "threadName", "", RumFeature.EVENT_THROWABLE_PROPERTY, "", NdkCrashLog.TIMESTAMP_KEY_NAME, "", "message", "loggerName", "threads", "", "Lcom/datadog/android/core/feature/event/ThreadDump;", "(Ljava/lang/String;Ljava/lang/Throwable;JLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getLoggerName", "()Ljava/lang/String;", "getMessage", "getThreadName", "getThreads", "()Ljava/util/List;", "getThrowable", "()Ljava/lang/Throwable;", "getTimestamp", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Logs extends JvmCrash {
        private final String loggerName;
        private final String message;
        private final String threadName;
        private final List<ThreadDump> threads;
        private final Throwable throwable;
        private final long timestamp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Logs(String str, Throwable th, long j, String str2, String str3, List<ThreadDump> list) {
            super(null);
            str.getClass();
            th.getClass();
            str2.getClass();
            str3.getClass();
            list.getClass();
            this.threadName = str;
            this.throwable = th;
            this.timestamp = j;
            this.message = str2;
            this.loggerName = str3;
            this.threads = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Logs copy$default(Logs logs, String str, Throwable th, long j, String str2, String str3, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = logs.threadName;
            }
            if ((i & 2) != 0) {
                th = logs.throwable;
            }
            if ((i & 4) != 0) {
                j = logs.timestamp;
            }
            if ((i & 8) != 0) {
                str2 = logs.message;
            }
            if ((i & 16) != 0) {
                str3 = logs.loggerName;
            }
            if ((i & 32) != 0) {
                list = logs.threads;
            }
            List list2 = list;
            String str4 = str2;
            long j2 = j;
            return logs.copy(str, th, j2, str4, str3, list2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getThreadName() {
            return this.threadName;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getLoggerName() {
            return this.loggerName;
        }

        public final List<ThreadDump> component6() {
            return this.threads;
        }

        public final Logs copy(String threadName, Throwable throwable, long timestamp, String message, String loggerName, List<ThreadDump> threads) {
            threadName.getClass();
            throwable.getClass();
            message.getClass();
            loggerName.getClass();
            threads.getClass();
            return new Logs(threadName, throwable, timestamp, message, loggerName, threads);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Logs)) {
                return false;
            }
            Logs logs = (Logs) other;
            return wl7.b(this.threadName, logs.threadName) && wl7.b(this.throwable, logs.throwable) && this.timestamp == logs.timestamp && wl7.b(this.message, logs.message) && wl7.b(this.loggerName, logs.loggerName) && wl7.b(this.threads, logs.threads);
        }

        public final String getLoggerName() {
            return this.loggerName;
        }

        @Override // com.datadog.android.core.feature.event.JvmCrash
        public String getMessage() {
            return this.message;
        }

        public final String getThreadName() {
            return this.threadName;
        }

        @Override // com.datadog.android.core.feature.event.JvmCrash
        public List<ThreadDump> getThreads() {
            return this.threads;
        }

        @Override // com.datadog.android.core.feature.event.JvmCrash
        public Throwable getThrowable() {
            return this.throwable;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return this.threads.hashCode() + akb.d(akb.d(ia.d((this.throwable.hashCode() + (this.threadName.hashCode() * 31)) * 31, 31, this.timestamp), 31, this.message), 31, this.loggerName);
        }

        public String toString() {
            return "Logs(threadName=" + this.threadName + ", throwable=" + this.throwable + ", timestamp=" + this.timestamp + ", message=" + this.message + ", loggerName=" + this.loggerName + ", threads=" + this.threads + ")";
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/datadog/android/core/feature/event/JvmCrash$Rum;", "Lcom/datadog/android/core/feature/event/JvmCrash;", RumFeature.EVENT_THROWABLE_PROPERTY, "", "message", "", "threads", "", "Lcom/datadog/android/core/feature/event/ThreadDump;", "(Ljava/lang/Throwable;Ljava/lang/String;Ljava/util/List;)V", "getMessage", "()Ljava/lang/String;", "getThreads", "()Ljava/util/List;", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Rum extends JvmCrash {
        private final String message;
        private final List<ThreadDump> threads;
        private final Throwable throwable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Rum(Throwable th, String str, List<ThreadDump> list) {
            super(null);
            th.getClass();
            str.getClass();
            list.getClass();
            this.throwable = th;
            this.message = str;
            this.threads = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Rum copy$default(Rum rum, Throwable th, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                th = rum.throwable;
            }
            if ((i & 2) != 0) {
                str = rum.message;
            }
            if ((i & 4) != 0) {
                list = rum.threads;
            }
            return rum.copy(th, str, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final List<ThreadDump> component3() {
            return this.threads;
        }

        public final Rum copy(Throwable throwable, String message, List<ThreadDump> threads) {
            throwable.getClass();
            message.getClass();
            threads.getClass();
            return new Rum(throwable, message, threads);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Rum)) {
                return false;
            }
            Rum rum = (Rum) other;
            return wl7.b(this.throwable, rum.throwable) && wl7.b(this.message, rum.message) && wl7.b(this.threads, rum.threads);
        }

        @Override // com.datadog.android.core.feature.event.JvmCrash
        public String getMessage() {
            return this.message;
        }

        @Override // com.datadog.android.core.feature.event.JvmCrash
        public List<ThreadDump> getThreads() {
            return this.threads;
        }

        @Override // com.datadog.android.core.feature.event.JvmCrash
        public Throwable getThrowable() {
            return this.throwable;
        }

        public int hashCode() {
            return this.threads.hashCode() + akb.d(this.throwable.hashCode() * 31, 31, this.message);
        }

        public String toString() {
            Throwable th = this.throwable;
            String str = this.message;
            List<ThreadDump> list = this.threads;
            StringBuilder sb = new StringBuilder("Rum(throwable=");
            sb.append(th);
            sb.append(", message=");
            sb.append(str);
            sb.append(", threads=");
            return g7.i(sb, list, ")");
        }
    }

    public /* synthetic */ JvmCrash(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getMessage();

    public abstract List<ThreadDump> getThreads();

    public abstract Throwable getThrowable();

    private JvmCrash() {
    }
}
