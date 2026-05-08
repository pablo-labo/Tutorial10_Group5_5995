package com.datadog.android.rum.resource;

import com.datadog.android.Datadog;
import com.datadog.android.api.SdkCore;
import com.datadog.android.rum.GlobalRumMonitor;
import com.datadog.android.rum.RumMonitor;
import com.datadog.android.rum.RumResourceKind;
import com.datadog.android.rum.RumResourceMethod;
import com.datadog.android.rum.internal.domain.event.ResourceTiming;
import com.datadog.android.rum.internal.monitor.AdvancedRumMonitor;
import defpackage.bs4;
import defpackage.j6g;
import defpackage.mj8;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b \u0018\u0000 @2\u00020\u0001:\u0001@B#\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\u0006\u0010\n\u001a\u00020\u00032\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0010\u0010\u0014J'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0011J\u0017\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u000fH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020!H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020!H\u0016¢\u0006\u0004\b&\u0010%R\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0002\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010/R\u001a\u00100\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b0\u0010*\u001a\u0004\b1\u0010,R\"\u00102\u001a\u00020\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u00108\u001a\u00020\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010\u001f\"\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u00103R\u0016\u0010>\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u00103R\u0016\u0010?\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u00103¨\u0006A"}, d2 = {"Lcom/datadog/android/rum/resource/RumResourceInputStream;", "Ljava/io/InputStream;", "delegate", "", "url", "Lcom/datadog/android/api/SdkCore;", "sdkCore", "<init>", "(Ljava/io/InputStream;Ljava/lang/String;Lcom/datadog/android/api/SdkCore;)V", "T", "errorMessage", "Lkotlin/Function1;", "operation", "callWithErrorTracking", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "", "read", "()I", "", "b", "([B)I", "off", "len", "([BII)I", "available", "", "n", "skip", "(J)J", "", "markSupported", "()Z", "readlimit", "Lj6g;", "mark", "(I)V", "reset", "()V", "close", "Ljava/io/InputStream;", "getDelegate", "()Ljava/io/InputStream;", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "Lcom/datadog/android/api/SdkCore;", "getSdkCore", "()Lcom/datadog/android/api/SdkCore;", "key", "getKey$dd_sdk_android_rum_release", "size", "J", "getSize$dd_sdk_android_rum_release", "()J", "setSize$dd_sdk_android_rum_release", "(J)V", "failed", "Z", "getFailed$dd_sdk_android_rum_release", "setFailed$dd_sdk_android_rum_release", "(Z)V", "callStart", "firstByte", "lastByte", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class RumResourceInputStream extends InputStream {
    public static final String ERROR_CLOSE = "Error closing input stream";
    public static final String ERROR_MARK = "Error marking input stream";
    public static final String ERROR_READ = "Error reading from input stream";
    public static final String ERROR_RESET = "Error resetting input stream";
    public static final String ERROR_SKIP = "Error skipping bytes from input stream";
    private long callStart;
    private final InputStream delegate;
    private boolean failed;
    private long firstByte;
    private final String key;
    private long lastByte;
    private final SdkCore sdkCore;
    private long size;
    private final String url;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final RumResourceMethod METHOD = RumResourceMethod.GET;

    /* JADX INFO: renamed from: com.datadog.android.rum.resource.RumResourceInputStream$available$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Ljava/io/InputStream;", "invoke", "(Ljava/io/InputStream;)Ljava/lang/Integer;"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass1 extends mj8 implements Function1<InputStream, Integer> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(InputStream inputStream) {
            inputStream.getClass();
            return Integer.valueOf(inputStream.available());
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.resource.RumResourceInputStream$markSupported$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Ljava/io/InputStream;", "invoke", "(Ljava/io/InputStream;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C06201 extends mj8 implements Function1<InputStream, Boolean> {
        public static final C06201 INSTANCE = new C06201();

        public C06201() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(InputStream inputStream) {
            inputStream.getClass();
            return Boolean.valueOf(inputStream.markSupported());
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.resource.RumResourceInputStream$read$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Ljava/io/InputStream;", "invoke", "(Ljava/io/InputStream;)Ljava/lang/Integer;"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C06211 extends mj8 implements Function1<InputStream, Integer> {
        public C06211() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(InputStream inputStream) {
            inputStream.getClass();
            Integer numValueOf = Integer.valueOf(inputStream.read());
            RumResourceInputStream rumResourceInputStream = RumResourceInputStream.this;
            if (numValueOf.intValue() >= 0) {
                rumResourceInputStream.setSize$dd_sdk_android_rum_release(rumResourceInputStream.getSize() + 1);
            }
            rumResourceInputStream.lastByte = System.nanoTime();
            return numValueOf;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.resource.RumResourceInputStream$read$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Ljava/io/InputStream;", "invoke", "(Ljava/io/InputStream;)Ljava/lang/Integer;"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass2 extends mj8 implements Function1<InputStream, Integer> {
        final /* synthetic */ byte[] $b;
        final /* synthetic */ RumResourceInputStream this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(byte[] bArr, RumResourceInputStream rumResourceInputStream) {
            super(1);
            this.$b = bArr;
            this.this$0 = rumResourceInputStream;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(InputStream inputStream) {
            inputStream.getClass();
            Integer numValueOf = Integer.valueOf(inputStream.read(this.$b));
            RumResourceInputStream rumResourceInputStream = this.this$0;
            int iIntValue = numValueOf.intValue();
            if (iIntValue >= 0) {
                rumResourceInputStream.setSize$dd_sdk_android_rum_release(rumResourceInputStream.getSize() + ((long) iIntValue));
            }
            rumResourceInputStream.lastByte = System.nanoTime();
            return numValueOf;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.resource.RumResourceInputStream$read$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Ljava/io/InputStream;", "invoke", "(Ljava/io/InputStream;)Ljava/lang/Integer;"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass3 extends mj8 implements Function1<InputStream, Integer> {
        final /* synthetic */ byte[] $b;
        final /* synthetic */ int $len;
        final /* synthetic */ int $off;
        final /* synthetic */ RumResourceInputStream this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(byte[] bArr, int i, int i2, RumResourceInputStream rumResourceInputStream) {
            super(1);
            this.$b = bArr;
            this.$off = i;
            this.$len = i2;
            this.this$0 = rumResourceInputStream;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(InputStream inputStream) {
            inputStream.getClass();
            Integer numValueOf = Integer.valueOf(inputStream.read(this.$b, this.$off, this.$len));
            RumResourceInputStream rumResourceInputStream = this.this$0;
            int iIntValue = numValueOf.intValue();
            if (iIntValue >= 0) {
                rumResourceInputStream.setSize$dd_sdk_android_rum_release(rumResourceInputStream.getSize() + ((long) iIntValue));
            }
            rumResourceInputStream.lastByte = System.nanoTime();
            return numValueOf;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.resource.RumResourceInputStream$skip$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Ljava/io/InputStream;", "invoke", "(Ljava/io/InputStream;)Ljava/lang/Long;"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C06231 extends mj8 implements Function1<InputStream, Long> {
        final /* synthetic */ long $n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C06231(long j) {
            super(1);
            this.$n = j;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Long invoke(InputStream inputStream) {
            inputStream.getClass();
            return Long.valueOf(inputStream.skip(this.$n));
        }
    }

    public RumResourceInputStream(InputStream inputStream, String str, SdkCore sdkCore) {
        inputStream.getClass();
        str.getClass();
        sdkCore.getClass();
        this.delegate = inputStream;
        this.url = str;
        this.sdkCore = sdkCore;
        String str2 = inputStream.getClass().getSimpleName() + "@" + System.identityHashCode(inputStream);
        this.key = str2;
        RumMonitor rumMonitor = GlobalRumMonitor.get(sdkCore);
        rumMonitor.startResource(str2, METHOD, str, bs4.a);
        this.callStart = System.nanoTime();
        if (rumMonitor instanceof AdvancedRumMonitor) {
            ((AdvancedRumMonitor) rumMonitor).waitForResourceTiming(str2);
        }
    }

    private final <T> T callWithErrorTracking(String errorMessage, Function1<? super InputStream, ? extends T> operation) {
        try {
            return operation.invoke(this.delegate);
        } finally {
        }
    }

    @Override // java.io.InputStream
    public int available() {
        return ((Number) callWithErrorTracking(ERROR_READ, AnonymousClass1.INSTANCE)).intValue();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        callWithErrorTracking(ERROR_CLOSE, new C06181());
    }

    public final InputStream getDelegate() {
        return this.delegate;
    }

    /* JADX INFO: renamed from: getFailed$dd_sdk_android_rum_release, reason: from getter */
    public final boolean getFailed() {
        return this.failed;
    }

    /* JADX INFO: renamed from: getKey$dd_sdk_android_rum_release, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    public final SdkCore getSdkCore() {
        return this.sdkCore;
    }

    /* JADX INFO: renamed from: getSize$dd_sdk_android_rum_release, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    public final String getUrl() {
        return this.url;
    }

    @Override // java.io.InputStream
    public void mark(int readlimit) {
        callWithErrorTracking(ERROR_MARK, new C06191(readlimit));
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return ((Boolean) callWithErrorTracking(ERROR_READ, C06201.INSTANCE)).booleanValue();
    }

    @Override // java.io.InputStream
    public int read(byte[] b) {
        b.getClass();
        if (this.firstByte == 0) {
            this.firstByte = System.nanoTime();
        }
        return ((Number) callWithErrorTracking(ERROR_READ, new AnonymousClass2(b, this))).intValue();
    }

    @Override // java.io.InputStream
    public void reset() {
        callWithErrorTracking(ERROR_RESET, C06221.INSTANCE);
    }

    public final void setFailed$dd_sdk_android_rum_release(boolean z) {
        this.failed = z;
    }

    public final void setSize$dd_sdk_android_rum_release(long j) {
        this.size = j;
    }

    @Override // java.io.InputStream
    public long skip(long n) {
        return ((Number) callWithErrorTracking(ERROR_SKIP, new C06231(n))).longValue();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/datadog/android/rum/resource/RumResourceInputStream$Companion;", "", "()V", "ERROR_CLOSE", "", "ERROR_MARK", "ERROR_READ", "ERROR_RESET", "ERROR_SKIP", "METHOD", "Lcom/datadog/android/rum/RumResourceMethod;", "getMETHOD$dd_sdk_android_rum_release", "()Lcom/datadog/android/rum/RumResourceMethod;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RumResourceMethod getMETHOD$dd_sdk_android_rum_release() {
            return RumResourceInputStream.METHOD;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.resource.RumResourceInputStream$reset$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljava/io/InputStream;", "Lj6g;", "invoke", "(Ljava/io/InputStream;)V", "<anonymous>"}, k = 3, mv = {1, 7, 0})
    public static final class C06221 extends mj8 implements Function1<InputStream, j6g> {
        public static final C06221 INSTANCE = new C06221();

        public C06221() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ j6g invoke(InputStream inputStream) throws IOException {
            invoke2(inputStream);
            return j6g.a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(InputStream inputStream) throws IOException {
            inputStream.getClass();
            inputStream.reset();
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.resource.RumResourceInputStream$mark$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljava/io/InputStream;", "Lj6g;", "invoke", "(Ljava/io/InputStream;)V", "<anonymous>"}, k = 3, mv = {1, 7, 0})
    public static final class C06191 extends mj8 implements Function1<InputStream, j6g> {
        final /* synthetic */ int $readlimit;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C06191(int i) {
            super(1);
            this.$readlimit = i;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(InputStream inputStream) {
            inputStream.getClass();
            inputStream.mark(this.$readlimit);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ j6g invoke(InputStream inputStream) {
            invoke2(inputStream);
            return j6g.a;
        }
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.firstByte == 0) {
            this.firstByte = System.nanoTime();
        }
        return ((Number) callWithErrorTracking(ERROR_READ, new C06211())).intValue();
    }

    @Override // java.io.InputStream
    public int read(byte[] b, int off, int len) {
        b.getClass();
        if (this.firstByte == 0) {
            this.firstByte = System.nanoTime();
        }
        return ((Number) callWithErrorTracking(ERROR_READ, new AnonymousClass3(b, off, len, this))).intValue();
    }

    public /* synthetic */ RumResourceInputStream(InputStream inputStream, String str, SdkCore sdkCore, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(inputStream, str, (i & 4) != 0 ? Datadog.getInstance$default(null, 1, null) : sdkCore);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RumResourceInputStream(InputStream inputStream, String str) {
        this(inputStream, str, null, 4, null);
        inputStream.getClass();
        str.getClass();
    }

    /* JADX INFO: renamed from: com.datadog.android.rum.resource.RumResourceInputStream$close$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljava/io/InputStream;", "Lj6g;", "invoke", "(Ljava/io/InputStream;)V", "<anonymous>"}, k = 3, mv = {1, 7, 0})
    public static final class C06181 extends mj8 implements Function1<InputStream, j6g> {
        public C06181() {
            super(1);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(InputStream inputStream) throws IOException {
            inputStream.getClass();
            inputStream.close();
            RumMonitor rumMonitor = GlobalRumMonitor.get(RumResourceInputStream.this.getSdkCore());
            AdvancedRumMonitor advancedRumMonitor = rumMonitor instanceof AdvancedRumMonitor ? (AdvancedRumMonitor) rumMonitor : null;
            if (advancedRumMonitor != null) {
                advancedRumMonitor.addResourceTiming(RumResourceInputStream.this.getKey(), new ResourceTiming(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, RumResourceInputStream.this.firstByte - RumResourceInputStream.this.callStart, RumResourceInputStream.this.lastByte - RumResourceInputStream.this.firstByte, 255, null));
            }
            rumMonitor.stopResource(RumResourceInputStream.this.getKey(), null, Long.valueOf(RumResourceInputStream.this.getSize()), RumResourceKind.OTHER, bs4.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ j6g invoke(InputStream inputStream) throws IOException {
            invoke2(inputStream);
            return j6g.a;
        }
    }
}
