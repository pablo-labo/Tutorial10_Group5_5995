package okhttp3.internal.concurrent;

import defpackage.r6;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"okhttp"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class TaskLoggerKt {
    public static final void a(Task task, TaskQueue taskQueue, String str) {
        TaskRunner.h.getClass();
        TaskRunner.j.fine(taskQueue.b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + task.a);
    }

    public static final String b(long j) {
        String strD;
        if (j <= -999500000) {
            strD = r6.d((j - 500000000) / 1000000000, " s ", new StringBuilder());
        } else if (j <= -999500) {
            strD = r6.d((j - 500000) / 1000000, " ms", new StringBuilder());
        } else if (j <= 0) {
            strD = r6.d((j - 500) / 1000, " µs", new StringBuilder());
        } else if (j < 999500) {
            strD = r6.d((j + 500) / 1000, " µs", new StringBuilder());
        } else if (j < 999500000) {
            strD = r6.d((j + 500000) / 1000000, " ms", new StringBuilder());
        } else {
            strD = r6.d((j + 500000000) / 1000000000, " s ", new StringBuilder());
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{strD}, 1));
    }
}
