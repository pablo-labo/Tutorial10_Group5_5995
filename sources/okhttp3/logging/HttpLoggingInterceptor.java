package okhttp3.logging;

import defpackage.is4;
import kotlin.Metadata;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor;", "Lokhttp3/Interceptor;", "Level", "Logger", "okhttp-logging-interceptor"}, k = 1, mv = {1, 4, 0})
public final class HttpLoggingInterceptor implements Interceptor {
    public volatile is4 a;
    public volatile Level b;
    public final Logger c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Level;", "", "okhttp-logging-interceptor"}, k = 1, mv = {1, 4, 0})
    public static final class Level {
        public static final Level a;
        public static final Level b;
        public static final Level c;
        public static final /* synthetic */ Level[] d;

        static {
            Level level = new Level("NONE", 0);
            a = level;
            Level level2 = new Level("BASIC", 1);
            Level level3 = new Level("HEADERS", 2);
            b = level3;
            Level level4 = new Level("BODY", 3);
            c = level4;
            d = new Level[]{level, level2, level3, level4};
        }

        public Level() {
            throw null;
        }

        public static Level valueOf(String str) {
            return (Level) Enum.valueOf(Level.class, str);
        }

        public static Level[] values() {
            return (Level[]) d.clone();
        }
    }

    public HttpLoggingInterceptor() {
        HttpLoggingInterceptor$Logger$Companion$DEFAULT$1 httpLoggingInterceptor$Logger$Companion$DEFAULT$1 = Logger.a;
        httpLoggingInterceptor$Logger$Companion$DEFAULT$1.getClass();
        this.c = httpLoggingInterceptor$Logger$Companion$DEFAULT$1;
        this.a = is4.a;
        this.b = Level.a;
    }

    public final void a(Headers headers, int i) {
        is4 is4Var = this.a;
        headers.b(i);
        is4Var.getClass();
        String strG = headers.g(i);
        this.c.a(headers.b(i) + ": " + strG);
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x022e  */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain r23) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1004
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.logging.HttpLoggingInterceptor.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "", "Companion", "okhttp-logging-interceptor"}, k = 1, mv = {1, 4, 0})
    public interface Logger {
        public static final HttpLoggingInterceptor$Logger$Companion$DEFAULT$1 a;

        /* JADX WARN: Type inference failed for: r0v1, types: [okhttp3.logging.HttpLoggingInterceptor$Logger$Companion$DEFAULT$1] */
        static {
            new Companion(0);
            a = new Logger() { // from class: okhttp3.logging.HttpLoggingInterceptor$Logger$Companion$DEFAULT$1
                @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
                public final void a(String str) {
                    Platform.a.getClass();
                    Platform.j(Platform.b, str, 6);
                }
            };
        }

        void a(String str);

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000¨\u0006\u0001\u0082\u0002\u0007\n\u0005\b\u0091F0\u0001¨\u0006\u0005"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger$Companion;", "", "()V", "DEFAULT", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "okhttp-logging-interceptor"}, k = 1, mv = {1, 1, 16})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(int i) {
                this();
            }
        }
    }
}
