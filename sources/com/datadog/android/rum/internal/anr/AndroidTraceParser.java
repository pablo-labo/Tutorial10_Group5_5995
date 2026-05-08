package com.datadog.android.rum.internal.anr;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.feature.event.ThreadDump;
import com.datadog.android.internal.utils.StringBuilderExtKt;
import defpackage.a32;
import defpackage.c0h;
import defpackage.gu5;
import defpackage.ke9;
import defpackage.mj8;
import defpackage.nn2;
import defpackage.pxc;
import defpackage.r6;
import defpackage.u63;
import defpackage.wl7;
import defpackage.wve;
import defpackage.ypd;
import defpackage.z92;
import defpackage.zr4;
import defpackage.zve;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\b\rJ\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002J\f\u0010\u000f\u001a\u00020\u0006*\u00020\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/datadog/android/rum/internal/anr/AndroidTraceParser;", "", "internalLogger", "Lcom/datadog/android/api/InternalLogger;", "(Lcom/datadog/android/api/InternalLogger;)V", "convertThreadState", "", "threadState", "parse", "", "Lcom/datadog/android/core/feature/event/ThreadDump;", "traceInputStream", "Ljava/io/InputStream;", "parse$dd_sdk_android_rum_release", "trace", "safeReadText", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class AndroidTraceParser {
    public static final String PARSING_FAILURE_MESSAGE = "Parsing tracing information for the exit reason wasn't successful, no thread dumps were parsed.";
    public static final String TRACE_STREAM_READ_FAILURE = "Failed to read crash trace stream.";
    private final InternalLogger internalLogger;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final pxc THREAD_NAME_REGEX = new pxc("^\"(.+)\".+$");

    public AndroidTraceParser(InternalLogger internalLogger) {
        internalLogger.getClass();
        this.internalLogger = internalLogger;
    }

    private final String convertThreadState(String threadState) {
        if (wl7.b(threadState, "TimedWaiting")) {
            threadState = "Timed_Waiting";
        }
        Locale locale = Locale.US;
        return r6.f(locale, threadState, locale);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<ThreadDump> parse(String trace) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        String str = null;
        String str2 = null;
        for (String str3 : zve.X(trace)) {
            CharSequence charSequenceSubSequence = "";
            if (zve.U(str3) && z) {
                if (sb.length() > 0 && str != null) {
                    String str4 = charSequenceSubSequence;
                    if (str2 != null) {
                        str4 = str2;
                    }
                    arrayList.add(new ThreadDump(str, convertThreadState(str4), sb.toString(), str.equals("main")));
                }
                sb.setLength(0);
                z = false;
            } else if (zve.L(str3, " prio=", false) && zve.L(str3, " tid=", false)) {
                str2 = (String) z92.Z0(zve.k0(str3, new String[]{" "}));
                ke9 ke9VarC = THREAD_NAME_REGEX.c(str3);
                str = ke9VarC != null ? (String) z92.R0(1, ke9VarC.a()) : null;
                z = true;
            } else if (z) {
                int length = str3.length();
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    if (!ypd.E(str3.charAt(i))) {
                        charSequenceSubSequence = str3.subSequence(i, str3.length());
                        break;
                    }
                    i++;
                }
                String string = charSequenceSubSequence.toString();
                if (wve.K(string, "at ", false) || wve.K(string, "native: ", false)) {
                    StringBuilderExtKt.appendIfNotEmpty(sb, '\n').append(str3);
                }
            }
        }
        if (arrayList.isEmpty()) {
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, u63.a0(InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY), (gu5) AnonymousClass2.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
        }
        return arrayList;
    }

    private final String safeReadText(InputStream inputStream) {
        try {
            try {
                String strY = nn2.y(new InputStreamReader(inputStream, a32.b));
                c0h.q(inputStream, null);
                return strY;
            } finally {
            }
        } catch (IOException e) {
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, InternalLogger.Target.USER, (gu5) C05832.INSTANCE, (Throwable) e, false, (Map) null, 48, (Object) null);
            return "";
        }
    }

    public final List<ThreadDump> parse$dd_sdk_android_rum_release(InputStream traceInputStream) {
        traceInputStream.getClass();
        String strSafeReadText = safeReadText(traceInputStream);
        return zve.U(strSafeReadText) ? zr4.a : parse(strSafeReadText);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/internal/anr/AndroidTraceParser$Companion;", "", "<init>", "()V", "Lpxc;", "THREAD_NAME_REGEX", "Lpxc;", "getTHREAD_NAME_REGEX", "()Lpxc;", "", "PARSING_FAILURE_MESSAGE", "Ljava/lang/String;", "TRACE_STREAM_READ_FAILURE", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final pxc getTHREAD_NAME_REGEX() {
            return AndroidTraceParser.THREAD_NAME_REGEX;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.anr.AndroidTraceParser$parse$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass2 extends mj8 implements gu5<String> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return AndroidTraceParser.PARSING_FAILURE_MESSAGE;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.internal.anr.AndroidTraceParser$safeReadText$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05832 extends mj8 implements gu5<String> {
        public static final C05832 INSTANCE = new C05832();

        public C05832() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return AndroidTraceParser.TRACE_STREAM_READ_FAILURE;
        }
    }
}
