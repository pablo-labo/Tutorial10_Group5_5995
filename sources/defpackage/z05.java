package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class z05 implements Thread.UncaughtExceptionHandler {
    public final Thread.UncaughtExceptionHandler a = Thread.getDefaultUncaughtExceptionHandler();

    public static String a(int i, String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length <= i) {
            i = length;
        }
        return str.substring(0, i);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        String strA;
        thread.getClass();
        th.getClass();
        c49.a("z05", "Uncaught exception being tracked...", new Object[0]);
        String strA2 = a(2048, th.getMessage());
        if (strA2 == null || strA2.length() == 0) {
            strA2 = "Android Exception. Null or empty message found";
        }
        yjg yjgVar = yjg.a;
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String string = stringWriter.toString();
        string.getClass();
        String strA3 = a(8096, string);
        String strA4 = a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET, thread.getName());
        StackTraceElement[] stackTrace = th.getStackTrace();
        stackTrace.getClass();
        if (stackTrace.length == 0) {
            strA = null;
        } else {
            StackTraceElement stackTraceElement = th.getStackTrace()[0];
            int lineNumber = stackTraceElement.getLineNumber();
            numValueOf = lineNumber >= 0 ? Integer.valueOf(lineNumber) : null;
            strA = a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET, stackTraceElement.getClassName());
        }
        String strA5 = a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET, th.getClass().getName());
        HashMap map = new HashMap();
        yjg.a(strA2, "message", map);
        yjg.a(strA3, "stackTrace", map);
        yjg.a(strA4, "threadName", map);
        yjg.a(Long.valueOf(thread.getId()), "threadId", map);
        yjg.a("JAVA", "programmingLanguage", map);
        yjg.a(numValueOf, "lineNumber", map);
        yjg.a(strA, "className", map);
        yjg.a(strA5, "exceptionName", map);
        yjg.a(Boolean.TRUE, "isFatal", map);
        s4e s4eVar = new s4e(new t4e(map, "iglu:com.snowplowanalytics.snowplow/application_error/jsonschema/1-0-0"));
        HashMap map2 = new HashMap();
        map2.put("event", s4eVar);
        lla.b("SnowplowCrashReporting", map2);
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
