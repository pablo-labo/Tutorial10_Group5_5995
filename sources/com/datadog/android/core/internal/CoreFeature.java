package com.datadog.android.core.internal;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import com.datadog.android.Datadog;
import com.datadog.android.DatadogSite;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.storage.RawBatchEvent;
import com.datadog.android.core.StrictModeExtKt;
import com.datadog.android.core.configuration.BackPressureStrategy;
import com.datadog.android.core.configuration.BatchProcessingLevel;
import com.datadog.android.core.configuration.BatchSize;
import com.datadog.android.core.configuration.Configuration;
import com.datadog.android.core.configuration.UploadFrequency;
import com.datadog.android.core.configuration.UploadSchedulerStrategy;
import com.datadog.android.core.internal.data.upload.GzipRequestInterceptor;
import com.datadog.android.core.internal.data.upload.RotatingDnsResolver;
import com.datadog.android.core.internal.metrics.BatchMetricsDispatcher;
import com.datadog.android.core.internal.net.DefaultFirstPartyHostHeaderTypeResolver;
import com.datadog.android.core.internal.net.info.CallbackNetworkInfoProvider;
import com.datadog.android.core.internal.net.info.NetworkInfoDeserializer;
import com.datadog.android.core.internal.net.info.NetworkInfoProvider;
import com.datadog.android.core.internal.net.info.NoOpNetworkInfoProvider;
import com.datadog.android.core.internal.persistence.JsonObjectDeserializer;
import com.datadog.android.core.internal.persistence.file.FileExtKt;
import com.datadog.android.core.internal.persistence.file.FileMover;
import com.datadog.android.core.internal.persistence.file.FilePersistenceConfig;
import com.datadog.android.core.internal.persistence.file.FileReaderWriter;
import com.datadog.android.core.internal.persistence.file.FileWriter;
import com.datadog.android.core.internal.persistence.file.advanced.ScheduledWriter;
import com.datadog.android.core.internal.persistence.file.batch.BatchFileReaderWriter;
import com.datadog.android.core.internal.privacy.ConsentProvider;
import com.datadog.android.core.internal.privacy.NoOpConsentProvider;
import com.datadog.android.core.internal.privacy.TrackingConsentProvider;
import com.datadog.android.core.internal.system.AndroidInfoProvider;
import com.datadog.android.core.internal.system.AppVersionProvider;
import com.datadog.android.core.internal.system.BroadcastReceiverSystemInfoProvider;
import com.datadog.android.core.internal.system.DefaultAndroidInfoProvider;
import com.datadog.android.core.internal.system.NoOpAndroidInfoProvider;
import com.datadog.android.core.internal.system.NoOpAppVersionProvider;
import com.datadog.android.core.internal.system.NoOpSystemInfoProvider;
import com.datadog.android.core.internal.system.SystemInfoProvider;
import com.datadog.android.core.internal.thread.BackPressureExecutorService;
import com.datadog.android.core.internal.thread.LoggingScheduledThreadPoolExecutor;
import com.datadog.android.core.internal.thread.ScheduledExecutorServiceFactory;
import com.datadog.android.core.internal.time.AppStartTimeProvider;
import com.datadog.android.core.internal.time.DatadogNtpEndpoint;
import com.datadog.android.core.internal.time.KronosTimeProvider;
import com.datadog.android.core.internal.time.LoggingSyncListener;
import com.datadog.android.core.internal.time.NoOpTimeProvider;
import com.datadog.android.core.internal.time.TimeProvider;
import com.datadog.android.core.internal.user.DatadogUserInfoProvider;
import com.datadog.android.core.internal.user.MutableUserInfoProvider;
import com.datadog.android.core.internal.user.NoOpMutableUserInfoProvider;
import com.datadog.android.core.internal.user.UserInfoDeserializer;
import com.datadog.android.core.internal.utils.ConcurrencyExtKt;
import com.datadog.android.core.internal.utils.RuntimeUtilsKt;
import com.datadog.android.core.persistence.PersistenceStrategy;
import com.datadog.android.core.thread.FlushableExecutorService;
import com.datadog.android.ndk.internal.DatadogNdkCrashHandler;
import com.datadog.android.ndk.internal.NdkCrashHandler;
import com.datadog.android.ndk.internal.NdkCrashLogDeserializer;
import com.datadog.android.ndk.internal.NdkNetworkInfoDataWriter;
import com.datadog.android.ndk.internal.NdkUserInfoDataWriter;
import com.datadog.android.ndk.internal.NoOpNdkCrashHandler;
import com.datadog.android.privacy.TrackingConsent;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import com.datadog.android.security.Encryption;
import com.lyft.kronos.internal.ntp.SntpClient;
import defpackage.a32;
import defpackage.ab8;
import defpackage.bs4;
import defpackage.d2f;
import defpackage.dj8;
import defpackage.ej8;
import defpackage.g7;
import defpackage.gu5;
import defpackage.kz2;
import defpackage.l5;
import defpackage.mh2;
import defpackage.mj8;
import defpackage.nn2;
import defpackage.op3;
import defpackage.qq2;
import defpackage.t40;
import defpackage.t92;
import defpackage.u63;
import defpackage.vve;
import defpackage.wl7;
import defpackage.ws9;
import defpackage.xme;
import defpackage.ypd;
import defpackage.z92;
import defpackage.zkd;
import defpackage.zve;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.Authenticator;
import okhttp3.CipherSuite;
import okhttp3.ConnectionSpec;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.TlsVersion;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ê\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 ¼\u00022\u00020\u0001:\u0002¼\u0002B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u000e¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020\u000e¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0014¢\u0006\u0004\b#\u0010\u0018J\u0017\u0010(\u001a\u00020\u00142\u0006\u0010%\u001a\u00020$H\u0001¢\u0006\u0004\b&\u0010'J\u000f\u0010*\u001a\u00020\u0014H\u0001¢\u0006\u0004\b)\u0010\u0018J\u0017\u0010/\u001a\u00020\u00142\u0006\u0010,\u001a\u00020+H\u0001¢\u0006\u0004\b-\u0010.J\u000f\u00101\u001a\u00020\u0014H\u0001¢\u0006\u0004\b0\u0010\u0018J\u0011\u00103\u001a\u0004\u0018\u000102H\u0003¢\u0006\u0004\b3\u00104J\u0019\u00106\u001a\u00020\u00142\b\u00105\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b:\u0010;J\u001f\u0010<\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b<\u0010=J\u0019\u0010?\u001a\u0004\u0018\u00010>2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b?\u0010@J\u0019\u0010B\u001a\u0004\u0018\u00010\u000e2\u0006\u0010A\u001a\u00020\fH\u0002¢\u0006\u0004\bB\u0010CJ\u0017\u0010E\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020DH\u0002¢\u0006\u0004\bE\u0010FJ\u001f\u0010G\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\u0014H\u0002¢\u0006\u0004\bI\u0010\u0018J\u0017\u0010J\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\bJ\u00109J\u0017\u0010K\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020DH\u0002¢\u0006\u0004\bK\u0010FJ\u000f\u0010L\u001a\u00020\u0014H\u0002¢\u0006\u0004\bL\u0010\u0018J\u0017\u0010M\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\bM\u00109J\u000f\u0010N\u001a\u00020\u0014H\u0002¢\u0006\u0004\bN\u0010\u0018J\u000f\u0010O\u001a\u00020\u0014H\u0002¢\u0006\u0004\bO\u0010\u0018J\u000f\u0010P\u001a\u00020\u0014H\u0002¢\u0006\u0004\bP\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010QR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010RR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010SR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010TR\u001a\u0010V\u001a\u00020U8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR*\u0010[\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0Z8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\"\u0010b\u001a\u00020a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\"\u0010i\u001a\u00020h8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\"\u0010p\u001a\u00020o8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bp\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\"\u0010w\u001a\u00020v8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R&\u0010~\u001a\u00020}8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R*\u0010\u0085\u0001\u001a\u00030\u0084\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0006\b\u0089\u0001\u0010\u008a\u0001R*\u0010\u008c\u0001\u001a\u00030\u008b\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R*\u0010\u0093\u0001\u001a\u00030\u0092\u00018\u0000@\u0000X\u0080.¢\u0006\u0018\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001R,\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u0099\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R(\u0010 \u0001\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b \u0001\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001\"\u0005\b¤\u0001\u00107R(\u0010¥\u0001\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b¥\u0001\u0010¡\u0001\u001a\u0006\b¦\u0001\u0010£\u0001\"\u0005\b§\u0001\u00107R*\u0010©\u0001\u001a\u00030¨\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b©\u0001\u0010ª\u0001\u001a\u0006\b«\u0001\u0010¬\u0001\"\u0006\b\u00ad\u0001\u0010®\u0001R(\u0010¯\u0001\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b¯\u0001\u0010¡\u0001\u001a\u0006\b°\u0001\u0010£\u0001\"\u0005\b±\u0001\u00107R(\u0010²\u0001\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b²\u0001\u0010¡\u0001\u001a\u0006\b³\u0001\u0010£\u0001\"\u0005\b´\u0001\u00107R(\u0010µ\u0001\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\bµ\u0001\u0010¡\u0001\u001a\u0006\b¶\u0001\u0010£\u0001\"\u0005\b·\u0001\u00107R*\u0010¹\u0001\u001a\u00030¸\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¹\u0001\u0010º\u0001\u001a\u0006\b»\u0001\u0010¼\u0001\"\u0006\b½\u0001\u0010¾\u0001R(\u0010¿\u0001\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b¿\u0001\u0010¡\u0001\u001a\u0006\bÀ\u0001\u0010£\u0001\"\u0005\bÁ\u0001\u00107R(\u0010Â\u0001\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\bÂ\u0001\u0010¡\u0001\u001a\u0006\bÃ\u0001\u0010£\u0001\"\u0005\bÄ\u0001\u00107R*\u0010Æ\u0001\u001a\u00030Å\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÆ\u0001\u0010Ç\u0001\u001a\u0006\bÈ\u0001\u0010É\u0001\"\u0006\bÊ\u0001\u0010Ë\u0001R*\u0010Í\u0001\u001a\u00030Ì\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÍ\u0001\u0010Î\u0001\u001a\u0006\bÏ\u0001\u0010Ð\u0001\"\u0006\bÑ\u0001\u0010Ò\u0001R*\u0010Ô\u0001\u001a\u00030Ó\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÔ\u0001\u0010Õ\u0001\u001a\u0006\bÖ\u0001\u0010×\u0001\"\u0006\bØ\u0001\u0010Ù\u0001R*\u0010Û\u0001\u001a\u00030Ú\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÛ\u0001\u0010Ü\u0001\u001a\u0006\bÝ\u0001\u0010Þ\u0001\"\u0006\bß\u0001\u0010à\u0001R*\u0010â\u0001\u001a\u00030á\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bâ\u0001\u0010ã\u0001\u001a\u0006\bä\u0001\u0010å\u0001\"\u0006\bæ\u0001\u0010ç\u0001R*\u0010è\u0001\u001a\u0004\u0018\u00010\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\bè\u0001\u0010¡\u0001\u001a\u0006\bé\u0001\u0010£\u0001\"\u0005\bê\u0001\u00107R,\u0010ì\u0001\u001a\u0005\u0018\u00010ë\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bì\u0001\u0010í\u0001\u001a\u0006\bî\u0001\u0010ï\u0001\"\u0006\bð\u0001\u0010ñ\u0001R*\u0010ó\u0001\u001a\u00030ò\u00018\u0000@\u0000X\u0080.¢\u0006\u0018\n\u0006\bó\u0001\u0010ô\u0001\u001a\u0006\bõ\u0001\u0010ö\u0001\"\u0006\b÷\u0001\u0010ø\u0001R*\u0010ú\u0001\u001a\u00030ù\u00018\u0000@\u0000X\u0080.¢\u0006\u0018\n\u0006\bú\u0001\u0010û\u0001\u001a\u0006\bü\u0001\u0010ý\u0001\"\u0006\bþ\u0001\u0010ÿ\u0001R*\u0010\u0081\u0002\u001a\u00030\u0080\u00028\u0000@\u0000X\u0080.¢\u0006\u0018\n\u0006\b\u0081\u0002\u0010\u0082\u0002\u001a\u0006\b\u0083\u0002\u0010\u0084\u0002\"\u0006\b\u0085\u0002\u0010\u0086\u0002R,\u0010\u0088\u0002\u001a\u0005\u0018\u00010\u0087\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0088\u0002\u0010\u0089\u0002\u001a\u0006\b\u008a\u0002\u0010\u008b\u0002\"\u0006\b\u008c\u0002\u0010\u008d\u0002R,\u0010\u008f\u0002\u001a\u0005\u0018\u00010\u008e\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u008f\u0002\u0010\u0090\u0002\u001a\u0006\b\u0091\u0002\u0010\u0092\u0002\"\u0006\b\u0093\u0002\u0010\u0094\u0002R*\u0010\u0096\u0002\u001a\u00030\u0095\u00028\u0000@\u0000X\u0080.¢\u0006\u0018\n\u0006\b\u0096\u0002\u0010\u0097\u0002\u001a\u0006\b\u0098\u0002\u0010\u0099\u0002\"\u0006\b\u009a\u0002\u0010\u009b\u0002R*\u0010\u009d\u0002\u001a\u00030\u009c\u00028\u0000@\u0000X\u0080.¢\u0006\u0018\n\u0006\b\u009d\u0002\u0010\u009e\u0002\u001a\u0006\b\u009f\u0002\u0010 \u0002\"\u0006\b¡\u0002\u0010¢\u0002R;\u0010¥\u0002\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0013\u0012\u0011\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010¤\u00020£\u00028\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b¥\u0002\u0010¦\u0002\u001a\u0006\b§\u0002\u0010¨\u0002R!\u0010¬\u0002\u001a\u0004\u0018\u0001028AX\u0080\u0084\u0002¢\u0006\u000f\n\u0006\b©\u0002\u0010ª\u0002\u001a\u0005\b«\u0002\u00104R!\u0010¯\u0002\u001a\u00030\u0095\u00028CX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u00ad\u0002\u0010ª\u0002\u001a\u0006\b®\u0002\u0010\u0099\u0002R(\u0010µ\u0002\u001a\n\u0012\u0005\u0012\u00030±\u00020°\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b²\u0002\u0010ª\u0002\u001a\u0006\b³\u0002\u0010´\u0002R\u0017\u0010¸\u0002\u001a\u00020+8@X\u0080\u0004¢\u0006\b\u001a\u0006\b¶\u0002\u0010·\u0002R\u0019\u0010»\u0002\u001a\u0004\u0018\u00010+8@X\u0080\u0004¢\u0006\b\u001a\u0006\b¹\u0002\u0010º\u0002¨\u0006½\u0002"}, d2 = {"Lcom/datadog/android/core/internal/CoreFeature;", "", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lcom/datadog/android/core/internal/time/AppStartTimeProvider;", "appStartTimeProvider", "Lcom/datadog/android/core/thread/FlushableExecutorService$Factory;", "executorServiceFactory", "Lcom/datadog/android/core/internal/thread/ScheduledExecutorServiceFactory;", "scheduledExecutorServiceFactory", "<init>", "(Lcom/datadog/android/api/InternalLogger;Lcom/datadog/android/core/internal/time/AppStartTimeProvider;Lcom/datadog/android/core/thread/FlushableExecutorService$Factory;Lcom/datadog/android/core/internal/thread/ScheduledExecutorServiceFactory;)V", "Landroid/content/Context;", "appContext", "", "sdkInstanceId", "Lcom/datadog/android/core/configuration/Configuration;", "configuration", "Lcom/datadog/android/privacy/TrackingConsent;", BatchMetricsDispatcher.TRACKING_CONSENT_KEY, "Lj6g;", "initialize", "(Landroid/content/Context;Ljava/lang/String;Lcom/datadog/android/core/configuration/Configuration;Lcom/datadog/android/privacy/TrackingConsent;)V", "stop", "()V", "Lcom/datadog/android/core/internal/persistence/file/FilePersistenceConfig;", "buildFilePersistenceConfig", "()Lcom/datadog/android/core/internal/persistence/file/FilePersistenceConfig;", "executorContext", "Ljava/util/concurrent/ExecutorService;", "createExecutorService", "(Ljava/lang/String;)Ljava/util/concurrent/ExecutorService;", "Ljava/util/concurrent/ScheduledExecutorService;", "createScheduledExecutorService", "(Ljava/lang/String;)Ljava/util/concurrent/ScheduledExecutorService;", "drainAndShutdownExecutors", "", "data", "writeLastViewEvent$dd_sdk_android_core_release", "([B)V", "writeLastViewEvent", "deleteLastViewEvent$dd_sdk_android_core_release", "deleteLastViewEvent", "", "anrTimestamp", "writeLastFatalAnrSent$dd_sdk_android_core_release", "(J)V", "writeLastFatalAnrSent", "deleteLastFatalAnrSent$dd_sdk_android_core_release", "deleteLastFatalAnrSent", "Lab8;", "readLastViewEvent", "()Lab8;", "nativeSourceType", "prepareNdkCrashData", "(Ljava/lang/String;)V", "initializeClockSync", "(Landroid/content/Context;)V", "getSafeContext", "(Landroid/content/Context;)Landroid/content/Context;", "readApplicationInformation", "(Landroid/content/Context;Lcom/datadog/android/core/configuration/Configuration;)V", "Landroid/content/pm/PackageInfo;", "getPackageInfo", "(Landroid/content/Context;)Landroid/content/pm/PackageInfo;", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "readBuildId", "(Landroid/content/Context;)Ljava/lang/String;", "Lcom/datadog/android/core/configuration/Configuration$Core;", "readConfigurationSettings", "(Lcom/datadog/android/core/configuration/Configuration$Core;)V", "setupInfoProviders", "(Landroid/content/Context;Lcom/datadog/android/privacy/TrackingConsent;)V", "setupUserInfoProvider", "setupNetworkInfoProviders", "setupOkHttpClient", "setupExecutors", "resolveProcessInfo", "shutDownExecutors", "cleanupApplicationInfo", "cleanupProviders", "Lcom/datadog/android/api/InternalLogger;", "Lcom/datadog/android/core/internal/time/AppStartTimeProvider;", "Lcom/datadog/android/core/thread/FlushableExecutorService$Factory;", "Lcom/datadog/android/core/internal/thread/ScheduledExecutorServiceFactory;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "initialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getInitialized$dd_sdk_android_core_release", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/lang/ref/WeakReference;", "contextRef", "Ljava/lang/ref/WeakReference;", "getContextRef$dd_sdk_android_core_release", "()Ljava/lang/ref/WeakReference;", "setContextRef$dd_sdk_android_core_release", "(Ljava/lang/ref/WeakReference;)V", "Lcom/datadog/android/core/internal/net/DefaultFirstPartyHostHeaderTypeResolver;", "firstPartyHostHeaderTypeResolver", "Lcom/datadog/android/core/internal/net/DefaultFirstPartyHostHeaderTypeResolver;", "getFirstPartyHostHeaderTypeResolver$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/net/DefaultFirstPartyHostHeaderTypeResolver;", "setFirstPartyHostHeaderTypeResolver$dd_sdk_android_core_release", "(Lcom/datadog/android/core/internal/net/DefaultFirstPartyHostHeaderTypeResolver;)V", "Lcom/datadog/android/core/internal/net/info/NetworkInfoProvider;", "networkInfoProvider", "Lcom/datadog/android/core/internal/net/info/NetworkInfoProvider;", "getNetworkInfoProvider$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/net/info/NetworkInfoProvider;", "setNetworkInfoProvider$dd_sdk_android_core_release", "(Lcom/datadog/android/core/internal/net/info/NetworkInfoProvider;)V", "Lcom/datadog/android/core/internal/system/SystemInfoProvider;", "systemInfoProvider", "Lcom/datadog/android/core/internal/system/SystemInfoProvider;", "getSystemInfoProvider$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/system/SystemInfoProvider;", "setSystemInfoProvider$dd_sdk_android_core_release", "(Lcom/datadog/android/core/internal/system/SystemInfoProvider;)V", "Lcom/datadog/android/core/internal/time/TimeProvider;", "timeProvider", "Lcom/datadog/android/core/internal/time/TimeProvider;", "getTimeProvider$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/time/TimeProvider;", "setTimeProvider$dd_sdk_android_core_release", "(Lcom/datadog/android/core/internal/time/TimeProvider;)V", "Lcom/datadog/android/core/internal/privacy/ConsentProvider;", "trackingConsentProvider", "Lcom/datadog/android/core/internal/privacy/ConsentProvider;", "getTrackingConsentProvider$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/privacy/ConsentProvider;", "setTrackingConsentProvider$dd_sdk_android_core_release", "(Lcom/datadog/android/core/internal/privacy/ConsentProvider;)V", "Lcom/datadog/android/core/internal/user/MutableUserInfoProvider;", "userInfoProvider", "Lcom/datadog/android/core/internal/user/MutableUserInfoProvider;", "getUserInfoProvider$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/user/MutableUserInfoProvider;", "setUserInfoProvider$dd_sdk_android_core_release", "(Lcom/datadog/android/core/internal/user/MutableUserInfoProvider;)V", "Lcom/datadog/android/core/internal/ContextProvider;", "contextProvider", "Lcom/datadog/android/core/internal/ContextProvider;", "getContextProvider$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/ContextProvider;", "setContextProvider$dd_sdk_android_core_release", "(Lcom/datadog/android/core/internal/ContextProvider;)V", "Lokhttp3/OkHttpClient;", "okHttpClient", "Lokhttp3/OkHttpClient;", "getOkHttpClient$dd_sdk_android_core_release", "()Lokhttp3/OkHttpClient;", "setOkHttpClient$dd_sdk_android_core_release", "(Lokhttp3/OkHttpClient;)V", "Ldj8;", "kronosClock", "Ldj8;", "getKronosClock$dd_sdk_android_core_release", "()Ldj8;", "setKronosClock$dd_sdk_android_core_release", "(Ldj8;)V", "clientToken", "Ljava/lang/String;", "getClientToken$dd_sdk_android_core_release", "()Ljava/lang/String;", "setClientToken$dd_sdk_android_core_release", "packageName", "getPackageName$dd_sdk_android_core_release", "setPackageName$dd_sdk_android_core_release", "Lcom/datadog/android/core/internal/system/AppVersionProvider;", "packageVersionProvider", "Lcom/datadog/android/core/internal/system/AppVersionProvider;", "getPackageVersionProvider$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/system/AppVersionProvider;", "setPackageVersionProvider$dd_sdk_android_core_release", "(Lcom/datadog/android/core/internal/system/AppVersionProvider;)V", "serviceName", "getServiceName$dd_sdk_android_core_release", "setServiceName$dd_sdk_android_core_release", "sourceName", "getSourceName$dd_sdk_android_core_release", "setSourceName$dd_sdk_android_core_release", "sdkVersion", "getSdkVersion$dd_sdk_android_core_release", "setSdkVersion$dd_sdk_android_core_release", "", "isMainProcess", "Z", "isMainProcess$dd_sdk_android_core_release", "()Z", "setMainProcess$dd_sdk_android_core_release", "(Z)V", "envName", "getEnvName$dd_sdk_android_core_release", "setEnvName$dd_sdk_android_core_release", "variant", "getVariant$dd_sdk_android_core_release", "setVariant$dd_sdk_android_core_release", "Lcom/datadog/android/core/configuration/BatchSize;", "batchSize", "Lcom/datadog/android/core/configuration/BatchSize;", "getBatchSize$dd_sdk_android_core_release", "()Lcom/datadog/android/core/configuration/BatchSize;", "setBatchSize$dd_sdk_android_core_release", "(Lcom/datadog/android/core/configuration/BatchSize;)V", "Lcom/datadog/android/core/configuration/UploadFrequency;", "uploadFrequency", "Lcom/datadog/android/core/configuration/UploadFrequency;", "getUploadFrequency$dd_sdk_android_core_release", "()Lcom/datadog/android/core/configuration/UploadFrequency;", "setUploadFrequency$dd_sdk_android_core_release", "(Lcom/datadog/android/core/configuration/UploadFrequency;)V", "Lcom/datadog/android/core/configuration/BatchProcessingLevel;", "batchProcessingLevel", "Lcom/datadog/android/core/configuration/BatchProcessingLevel;", "getBatchProcessingLevel$dd_sdk_android_core_release", "()Lcom/datadog/android/core/configuration/BatchProcessingLevel;", "setBatchProcessingLevel$dd_sdk_android_core_release", "(Lcom/datadog/android/core/configuration/BatchProcessingLevel;)V", "Lcom/datadog/android/ndk/internal/NdkCrashHandler;", "ndkCrashHandler", "Lcom/datadog/android/ndk/internal/NdkCrashHandler;", "getNdkCrashHandler$dd_sdk_android_core_release", "()Lcom/datadog/android/ndk/internal/NdkCrashHandler;", "setNdkCrashHandler$dd_sdk_android_core_release", "(Lcom/datadog/android/ndk/internal/NdkCrashHandler;)V", "Lcom/datadog/android/DatadogSite;", "site", "Lcom/datadog/android/DatadogSite;", "getSite$dd_sdk_android_core_release", "()Lcom/datadog/android/DatadogSite;", "setSite$dd_sdk_android_core_release", "(Lcom/datadog/android/DatadogSite;)V", "appBuildId", "getAppBuildId$dd_sdk_android_core_release", "setAppBuildId$dd_sdk_android_core_release", "Lcom/datadog/android/core/configuration/UploadSchedulerStrategy;", "customUploadSchedulerStrategy", "Lcom/datadog/android/core/configuration/UploadSchedulerStrategy;", "getCustomUploadSchedulerStrategy$dd_sdk_android_core_release", "()Lcom/datadog/android/core/configuration/UploadSchedulerStrategy;", "setCustomUploadSchedulerStrategy$dd_sdk_android_core_release", "(Lcom/datadog/android/core/configuration/UploadSchedulerStrategy;)V", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "uploadExecutorService", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "getUploadExecutorService$dd_sdk_android_core_release", "()Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "setUploadExecutorService$dd_sdk_android_core_release", "(Ljava/util/concurrent/ScheduledThreadPoolExecutor;)V", "Lcom/datadog/android/core/thread/FlushableExecutorService;", "persistenceExecutorService", "Lcom/datadog/android/core/thread/FlushableExecutorService;", "getPersistenceExecutorService$dd_sdk_android_core_release", "()Lcom/datadog/android/core/thread/FlushableExecutorService;", "setPersistenceExecutorService$dd_sdk_android_core_release", "(Lcom/datadog/android/core/thread/FlushableExecutorService;)V", "Lcom/datadog/android/core/configuration/BackPressureStrategy;", "backpressureStrategy", "Lcom/datadog/android/core/configuration/BackPressureStrategy;", "getBackpressureStrategy$dd_sdk_android_core_release", "()Lcom/datadog/android/core/configuration/BackPressureStrategy;", "setBackpressureStrategy$dd_sdk_android_core_release", "(Lcom/datadog/android/core/configuration/BackPressureStrategy;)V", "Lcom/datadog/android/security/Encryption;", "localDataEncryption", "Lcom/datadog/android/security/Encryption;", "getLocalDataEncryption$dd_sdk_android_core_release", "()Lcom/datadog/android/security/Encryption;", "setLocalDataEncryption$dd_sdk_android_core_release", "(Lcom/datadog/android/security/Encryption;)V", "Lcom/datadog/android/core/persistence/PersistenceStrategy$Factory;", "persistenceStrategyFactory", "Lcom/datadog/android/core/persistence/PersistenceStrategy$Factory;", "getPersistenceStrategyFactory$dd_sdk_android_core_release", "()Lcom/datadog/android/core/persistence/PersistenceStrategy$Factory;", "setPersistenceStrategyFactory$dd_sdk_android_core_release", "(Lcom/datadog/android/core/persistence/PersistenceStrategy$Factory;)V", "Ljava/io/File;", "storageDir", "Ljava/io/File;", "getStorageDir$dd_sdk_android_core_release", "()Ljava/io/File;", "setStorageDir$dd_sdk_android_core_release", "(Ljava/io/File;)V", "Lcom/datadog/android/core/internal/system/AndroidInfoProvider;", "androidInfoProvider", "Lcom/datadog/android/core/internal/system/AndroidInfoProvider;", "getAndroidInfoProvider$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/system/AndroidInfoProvider;", "setAndroidInfoProvider$dd_sdk_android_core_release", "(Lcom/datadog/android/core/internal/system/AndroidInfoProvider;)V", "", "", "featuresContext", "Ljava/util/Map;", "getFeaturesContext$dd_sdk_android_core_release", "()Ljava/util/Map;", "lastViewEvent$delegate", "Lkotlin/Lazy;", "getLastViewEvent$dd_sdk_android_core_release", "lastViewEvent", "lastViewEventFile$delegate", "getLastViewEventFile", "lastViewEventFile", "Lcom/datadog/android/core/internal/persistence/file/FileWriter;", "Lcom/datadog/android/api/storage/RawBatchEvent;", "lastViewEventFileWriter$delegate", "getLastViewEventFileWriter", "()Lcom/datadog/android/core/internal/persistence/file/FileWriter;", "lastViewEventFileWriter", "getAppStartTimeNs$dd_sdk_android_core_release", "()J", "appStartTimeNs", "getLastFatalAnrSent$dd_sdk_android_core_release", "()Ljava/lang/Long;", "lastFatalAnrSent", "Companion", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class CoreFeature {
    public static final String BUILD_ID_FILE_NAME = "datadog.buildId";
    public static final String BUILD_ID_IS_MISSING_INFO_MESSAGE = "Build ID is not found in the application assets. If you are using obfuscation, please use Datadog Gradle Plugin 1.13.0 or above to be able to de-obfuscate stacktraces.";
    public static final String BUILD_ID_READ_ERROR = "Failed to read Build ID information, de-obfuscation may not work properly.";
    private static final int CORE_DEFAULT_POOL_SIZE = 1;
    public static final String DATADOG_STORAGE_DIR_NAME = "datadog-%s";
    public static final String DEFAULT_APP_VERSION = "?";
    public static final String DEFAULT_SDK_VERSION = "2.18.0";
    public static final String DEFAULT_SOURCE_NAME = "android";
    public static final long DRAIN_WAIT_SECONDS = 10;
    public static final String LAST_FATAL_ANR_SENT_FILE_NAME = "last_fatal_anr_sent";
    public static final String LAST_RUM_VIEW_EVENT_FILE_NAME = "last_view_event";
    public static final long NTP_CACHE_EXPIRATION_MINUTES = 30;
    public static final long NTP_DELAY_BETWEEN_SYNCS_MINUTES = 5;
    public static final String SDK_INITIALIZED_IN_SECONDARY_PROCESS_WARNING_MESSAGE = "Datadog SDK was initialized in a secondary process: although data will still be captured, nothing will be uploaded from this process. Make sure to also initialize the SDK from the main process of your application.";
    private static boolean disableKronosBackgroundSync;
    public AndroidInfoProvider androidInfoProvider;
    private String appBuildId;
    private final AppStartTimeProvider appStartTimeProvider;
    public BackPressureStrategy backpressureStrategy;
    private BatchProcessingLevel batchProcessingLevel;
    private BatchSize batchSize;
    private String clientToken;
    private ContextProvider contextProvider;
    private WeakReference<Context> contextRef;
    private UploadSchedulerStrategy customUploadSchedulerStrategy;
    private String envName;
    private final FlushableExecutorService.Factory executorServiceFactory;
    private final Map<String, Map<String, Object>> featuresContext;
    private DefaultFirstPartyHostHeaderTypeResolver firstPartyHostHeaderTypeResolver;
    private final AtomicBoolean initialized;
    private final InternalLogger internalLogger;
    private boolean isMainProcess;
    private dj8 kronosClock;

    /* JADX INFO: renamed from: lastViewEvent$delegate, reason: from kotlin metadata */
    private final Lazy lastViewEvent;

    /* JADX INFO: renamed from: lastViewEventFile$delegate, reason: from kotlin metadata */
    private final Lazy lastViewEventFile;

    /* JADX INFO: renamed from: lastViewEventFileWriter$delegate, reason: from kotlin metadata */
    private final Lazy lastViewEventFileWriter;
    private Encryption localDataEncryption;
    private NdkCrashHandler ndkCrashHandler;
    private NetworkInfoProvider networkInfoProvider;
    public OkHttpClient okHttpClient;
    private String packageName;
    private AppVersionProvider packageVersionProvider;
    public FlushableExecutorService persistenceExecutorService;
    private PersistenceStrategy.Factory persistenceStrategyFactory;
    private final ScheduledExecutorServiceFactory scheduledExecutorServiceFactory;
    private String sdkVersion;
    private String serviceName;
    private DatadogSite site;
    private String sourceName;
    public File storageDir;
    private SystemInfoProvider systemInfoProvider;
    private TimeProvider timeProvider;
    private ConsentProvider trackingConsentProvider;
    public ScheduledThreadPoolExecutor uploadExecutorService;
    private UploadFrequency uploadFrequency;
    private MutableUserInfoProvider userInfoProvider;
    private String variant;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final FlushableExecutorService.Factory DEFAULT_FLUSHABLE_EXECUTOR_SERVICE_FACTORY = new g7(6);
    private static final ScheduledExecutorServiceFactory DEFAULT_SCHEDULED_EXECUTOR_SERVICE_FACTORY = new t40(4);
    private static final long NETWORK_TIMEOUT_MS = 45000;
    private static final CipherSuite[] RESTRICTED_CIPHER_SUITES = {CipherSuite.r, CipherSuite.s, CipherSuite.t, CipherSuite.n, CipherSuite.o, CipherSuite.l, CipherSuite.m};

    /* JADX INFO: renamed from: com.datadog.android.core.internal.CoreFeature$initialize$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05012 extends mj8 implements gu5<File> {
        final /* synthetic */ Context $appContext;
        final /* synthetic */ String $sdkInstanceId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05012(Context context, String str) {
            super(0);
            this.$appContext = context;
            this.$sdkInstanceId = str;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // defpackage.gu5
        public final File invoke() {
            return new File(this.$appContext.getCacheDir(), String.format(Locale.US, CoreFeature.DATADOG_STORAGE_DIR_NAME, Arrays.copyOf(new Object[]{this.$sdkInstanceId}, 1)));
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.CoreFeature$prepareNdkCrashData$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lab8;", "invoke", "()Lab8;", "<anonymous>"}, k = 3, mv = {1, 7, 0})
    public static final class AnonymousClass1 extends mj8 implements gu5<ab8> {
        public AnonymousClass1() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // defpackage.gu5
        public final ab8 invoke() {
            return CoreFeature.this.getLastViewEvent$dd_sdk_android_core_release();
        }
    }

    public CoreFeature(InternalLogger internalLogger, AppStartTimeProvider appStartTimeProvider, FlushableExecutorService.Factory factory, ScheduledExecutorServiceFactory scheduledExecutorServiceFactory) {
        internalLogger.getClass();
        appStartTimeProvider.getClass();
        factory.getClass();
        scheduledExecutorServiceFactory.getClass();
        this.internalLogger = internalLogger;
        this.appStartTimeProvider = appStartTimeProvider;
        this.executorServiceFactory = factory;
        this.scheduledExecutorServiceFactory = scheduledExecutorServiceFactory;
        this.initialized = new AtomicBoolean(false);
        this.contextRef = new WeakReference<>(null);
        this.firstPartyHostHeaderTypeResolver = new DefaultFirstPartyHostHeaderTypeResolver(bs4.a);
        this.networkInfoProvider = new NoOpNetworkInfoProvider();
        this.systemInfoProvider = new NoOpSystemInfoProvider();
        this.timeProvider = new NoOpTimeProvider();
        this.trackingConsentProvider = new NoOpConsentProvider();
        this.userInfoProvider = new NoOpMutableUserInfoProvider();
        this.contextProvider = new NoOpContextProvider();
        this.clientToken = "";
        this.packageName = "";
        this.packageVersionProvider = new NoOpAppVersionProvider();
        this.serviceName = "";
        this.sourceName = DEFAULT_SOURCE_NAME;
        this.sdkVersion = "2.18.0";
        this.isMainProcess = true;
        this.envName = "";
        this.variant = "";
        this.batchSize = BatchSize.MEDIUM;
        this.uploadFrequency = UploadFrequency.AVERAGE;
        this.batchProcessingLevel = BatchProcessingLevel.MEDIUM;
        this.ndkCrashHandler = new NoOpNdkCrashHandler();
        this.site = DatadogSite.US1;
        this.featuresContext = new ConcurrentHashMap();
        this.lastViewEvent = new d2f(new CoreFeature$lastViewEvent$2(this));
        this.lastViewEventFile = new d2f(new CoreFeature$lastViewEventFile$2(this));
        this.lastViewEventFileWriter = new d2f(new CoreFeature$lastViewEventFileWriter$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FlushableExecutorService DEFAULT_FLUSHABLE_EXECUTOR_SERVICE_FACTORY$lambda$11(InternalLogger internalLogger, String str, BackPressureStrategy backPressureStrategy) {
        internalLogger.getClass();
        str.getClass();
        backPressureStrategy.getClass();
        return new BackPressureExecutorService(internalLogger, str, backPressureStrategy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScheduledExecutorService DEFAULT_SCHEDULED_EXECUTOR_SERVICE_FACTORY$lambda$12(InternalLogger internalLogger, String str, BackPressureStrategy backPressureStrategy) {
        internalLogger.getClass();
        str.getClass();
        backPressureStrategy.getClass();
        return new LoggingScheduledThreadPoolExecutor(1, str, internalLogger, backPressureStrategy);
    }

    private final void cleanupApplicationInfo() {
        this.clientToken = "";
        this.packageName = "";
        this.packageVersionProvider = new NoOpAppVersionProvider();
        this.serviceName = "";
        this.sourceName = DEFAULT_SOURCE_NAME;
        this.sdkVersion = "2.18.0";
        this.isMainProcess = true;
        this.envName = "";
        this.variant = "";
    }

    private final void cleanupProviders() {
        this.firstPartyHostHeaderTypeResolver = new DefaultFirstPartyHostHeaderTypeResolver(bs4.a);
        this.networkInfoProvider = new NoOpNetworkInfoProvider();
        this.systemInfoProvider = new NoOpSystemInfoProvider();
        this.timeProvider = new NoOpTimeProvider();
        this.trackingConsentProvider = new NoOpConsentProvider();
        this.userInfoProvider = new NoOpMutableUserInfoProvider();
        setAndroidInfoProvider$dd_sdk_android_core_release(new NoOpAndroidInfoProvider());
    }

    private final File getLastViewEventFile() {
        return (File) this.lastViewEventFile.getValue();
    }

    private final FileWriter<RawBatchEvent> getLastViewEventFileWriter() {
        return (FileWriter) this.lastViewEventFileWriter.getValue();
    }

    private final PackageInfo getPackageInfo(Context appContext) {
        try {
            PackageManager packageManager = appContext.getPackageManager();
            int i = Build.VERSION.SDK_INT;
            String str = this.packageName;
            return i >= 33 ? packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of(0L)) : packageManager.getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, InternalLogger.Target.USER, (gu5) AnonymousClass2.INSTANCE, (Throwable) e, false, (Map) null, 48, (Object) null);
            return null;
        }
    }

    private final Context getSafeContext(Context appContext) {
        Context contextCreateDeviceProtectedStorageContext = appContext.createDeviceProtectedStorageContext();
        return contextCreateDeviceProtectedStorageContext == null ? appContext : contextCreateDeviceProtectedStorageContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initialize$lambda$0(CoreFeature coreFeature, Context context) {
        coreFeature.getClass();
        context.getClass();
        coreFeature.initializeClockSync(context);
    }

    private final void initializeClockSync(Context appContext) {
        Context safeContext = getSafeContext(appContext);
        List listA0 = u63.a0(DatadogNtpEndpoint.NTP_0, DatadogNtpEndpoint.NTP_1, DatadogNtpEndpoint.NTP_2, DatadogNtpEndpoint.NTP_3);
        ArrayList arrayList = new ArrayList(t92.r0(listA0, 10));
        Iterator it = listA0.iterator();
        while (it.hasNext()) {
            arrayList.add(((DatadogNtpEndpoint) it.next()).getHost());
        }
        LoggingSyncListener loggingSyncListener = new LoggingSyncListener(this.internalLogger);
        long j = op3.b;
        long j2 = op3.c;
        safeContext.getClass();
        int i = 17;
        ypd ypdVar = new ypd(i);
        SharedPreferences sharedPreferences = safeContext.getSharedPreferences("com.lyft.kronos.shared_preferences", 0);
        sharedPreferences.getClass();
        qq2 qq2Var = new qq2(sharedPreferences);
        if (ypdVar instanceof dj8) {
            l5.q("Local clock should implement Clock instead of KronosClock");
            return;
        }
        xme xmeVar = new xme(new SntpClient(ypdVar, new zkd(i), new mh2(21)), ypdVar, new ws9(qq2Var, ypdVar), loggingSyncListener, arrayList, j, 300000L, 1800000L, j2);
        ej8 ej8Var = new ej8(xmeVar, ypdVar);
        if (!disableKronosBackgroundSync) {
            try {
                xmeVar.b();
            } catch (IllegalStateException e) {
                InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, (gu5) CoreFeature$initializeClockSync$2$1.INSTANCE, (Throwable) e, false, (Map) null, 48, (Object) null);
            }
        }
        this.timeProvider = new KronosTimeProvider(ej8Var);
        this.kronosClock = ej8Var;
    }

    private final void prepareNdkCrashData(String nativeSourceType) {
        if (this.isMainProcess) {
            File storageDir$dd_sdk_android_core_release = getStorageDir$dd_sdk_android_core_release();
            FlushableExecutorService persistenceExecutorService$dd_sdk_android_core_release = getPersistenceExecutorService$dd_sdk_android_core_release();
            NdkCrashLogDeserializer ndkCrashLogDeserializer = new NdkCrashLogDeserializer(this.internalLogger);
            NetworkInfoDeserializer networkInfoDeserializer = new NetworkInfoDeserializer(this.internalLogger);
            UserInfoDeserializer userInfoDeserializer = new UserInfoDeserializer(this.internalLogger);
            InternalLogger internalLogger = this.internalLogger;
            FileReaderWriter fileReaderWriterCreate = FileReaderWriter.INSTANCE.create(internalLogger, this.localDataEncryption);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1();
            if (nativeSourceType == null) {
                nativeSourceType = "ndk";
            }
            DatadogNdkCrashHandler datadogNdkCrashHandler = new DatadogNdkCrashHandler(storageDir$dd_sdk_android_core_release, persistenceExecutorService$dd_sdk_android_core_release, ndkCrashLogDeserializer, networkInfoDeserializer, userInfoDeserializer, internalLogger, fileReaderWriterCreate, anonymousClass1, nativeSourceType);
            this.ndkCrashHandler = datadogNdkCrashHandler;
            datadogNdkCrashHandler.prepareData();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void readApplicationInformation(android.content.Context r3, com.datadog.android.core.configuration.Configuration r4) {
        /*
            r2 = this;
            java.lang.String r0 = r3.getPackageName()
            r0.getClass()
            r2.packageName = r0
            android.content.pm.PackageInfo r0 = r2.getPackageInfo(r3)
            if (r0 == 0) goto L1b
            java.lang.String r1 = r0.versionName
            if (r1 != 0) goto L19
            int r0 = r0.versionCode
            java.lang.String r1 = java.lang.String.valueOf(r0)
        L19:
            if (r1 != 0) goto L1d
        L1b:
            java.lang.String r1 = "?"
        L1d:
            com.datadog.android.core.internal.system.DefaultAppVersionProvider r0 = new com.datadog.android.core.internal.system.DefaultAppVersionProvider
            r0.<init>(r1)
            r2.packageVersionProvider = r0
            java.lang.String r0 = r4.getClientToken$dd_sdk_android_core_release()
            r2.clientToken = r0
            java.lang.String r0 = r4.getService$dd_sdk_android_core_release()
            if (r0 != 0) goto L37
            java.lang.String r0 = r3.getPackageName()
            r0.getClass()
        L37:
            r2.serviceName = r0
            java.lang.String r0 = r4.getEnv$dd_sdk_android_core_release()
            r2.envName = r0
            java.lang.String r4 = r4.getVariant$dd_sdk_android_core_release()
            r2.variant = r4
            java.lang.String r4 = r2.readBuildId(r3)
            r2.appBuildId = r4
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r3)
            r2.contextRef = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.core.internal.CoreFeature.readApplicationInformation(android.content.Context, com.datadog.android.core.configuration.Configuration):void");
    }

    private final String readBuildId(Context context) {
        try {
            InputStream inputStreamOpen = context.getAssets().open(BUILD_ID_FILE_NAME);
            inputStreamOpen.getClass();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, a32.b), 8192);
            try {
                String string = zve.s0(nn2.y(bufferedReader)).toString();
                bufferedReader.close();
                return string;
            } finally {
            }
        } catch (FileNotFoundException unused) {
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.INFO, InternalLogger.Target.USER, (gu5) CoreFeature$readBuildId$1$2.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
            return null;
        } catch (Exception e) {
            InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, u63.a0(InternalLogger.Target.USER, InternalLogger.Target.TELEMETRY), (gu5) CoreFeature$readBuildId$1$3.INSTANCE, (Throwable) e, false, (Map) null, 48, (Object) null);
            return null;
        }
    }

    private final void readConfigurationSettings(Configuration.Core configuration) {
        this.batchSize = configuration.getBatchSize();
        this.uploadFrequency = configuration.getUploadFrequency();
        this.localDataEncryption = configuration.getEncryption();
        this.persistenceStrategyFactory = configuration.getPersistenceStrategyFactory();
        this.site = configuration.getSite();
        setBackpressureStrategy$dd_sdk_android_core_release(configuration.getBackpressureStrategy());
        this.customUploadSchedulerStrategy = configuration.getUploadSchedulerStrategy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ab8 readLastViewEvent() {
        File lastViewEventFile$dd_sdk_android_core_release;
        if (FileExtKt.existsSafe(getLastViewEventFile(), this.internalLogger)) {
            lastViewEventFile$dd_sdk_android_core_release = getLastViewEventFile();
        } else {
            lastViewEventFile$dd_sdk_android_core_release = DatadogNdkCrashHandler.INSTANCE.getLastViewEventFile$dd_sdk_android_core_release(getStorageDir$dd_sdk_android_core_release());
            if (!FileExtKt.existsSafe(lastViewEventFile$dd_sdk_android_core_release, this.internalLogger)) {
                lastViewEventFile$dd_sdk_android_core_release = null;
            }
        }
        if (lastViewEventFile$dd_sdk_android_core_release != null) {
            List<RawBatchEvent> data = BatchFileReaderWriter.INSTANCE.create(this.internalLogger, this.localDataEncryption).readData(lastViewEventFile$dd_sdk_android_core_release);
            if (!data.isEmpty()) {
                return new JsonObjectDeserializer(this.internalLogger).deserialize(new String(((RawBatchEvent) z92.Y0(data)).getData(), a32.b));
            }
        }
        return null;
    }

    private final void resolveProcessInfo(Context appContext) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        int iMyPid = Process.myPid();
        Object systemService = appContext.getSystemService("activity");
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = null;
        Object obj = null;
        runningAppProcessInfo = null;
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
            Iterator<T> it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((ActivityManager.RunningAppProcessInfo) next).pid == iMyPid) {
                    obj = next;
                    break;
                }
            }
            runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj;
        }
        boolean zB = runningAppProcessInfo == null ? true : wl7.b(appContext.getPackageName(), runningAppProcessInfo.processName);
        this.isMainProcess = zB;
        if (zB) {
            return;
        }
        InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.WARN, InternalLogger.Target.USER, (gu5) C05021.INSTANCE, (Throwable) null, false, (Map) null, 56, (Object) null);
    }

    private final void setupExecutors() {
        setUploadExecutorService$dd_sdk_android_core_release(new LoggingScheduledThreadPoolExecutor(1, "upload", this.internalLogger, getBackpressureStrategy$dd_sdk_android_core_release()));
        setPersistenceExecutorService$dd_sdk_android_core_release(this.executorServiceFactory.create(this.internalLogger, "storage", getBackpressureStrategy$dd_sdk_android_core_release()));
    }

    private final void setupInfoProviders(Context appContext, TrackingConsent consent) {
        this.trackingConsentProvider = new TrackingConsentProvider(consent);
        BroadcastReceiverSystemInfoProvider broadcastReceiverSystemInfoProvider = new BroadcastReceiverSystemInfoProvider(this.internalLogger);
        this.systemInfoProvider = broadcastReceiverSystemInfoProvider;
        broadcastReceiverSystemInfoProvider.register(appContext);
        setupNetworkInfoProviders(appContext);
        setupUserInfoProvider();
    }

    private final void setupNetworkInfoProviders(Context appContext) {
        CallbackNetworkInfoProvider callbackNetworkInfoProvider = new CallbackNetworkInfoProvider(new ScheduledWriter(new NdkNetworkInfoDataWriter(getStorageDir$dd_sdk_android_core_release(), this.trackingConsentProvider, getPersistenceExecutorService$dd_sdk_android_core_release(), FileReaderWriter.INSTANCE.create(this.internalLogger, this.localDataEncryption), new FileMover(this.internalLogger), this.internalLogger, buildFilePersistenceConfig()), getPersistenceExecutorService$dd_sdk_android_core_release(), this.internalLogger), null, this.internalLogger, 2, null);
        this.networkInfoProvider = callbackNetworkInfoProvider;
        callbackNetworkInfoProvider.register(appContext);
    }

    private final void setupOkHttpClient(Configuration.Core configuration) {
        ConnectionSpec connectionSpecA;
        if (configuration.getNeedsClearTextHttp()) {
            connectionSpecA = ConnectionSpec.g;
        } else {
            ConnectionSpec.Builder builder = new ConnectionSpec.Builder(ConnectionSpec.e);
            builder.e(TlsVersion.TLS_1_2, TlsVersion.TLS_1_3);
            CipherSuite[] cipherSuiteArr = RESTRICTED_CIPHER_SUITES;
            builder.c((CipherSuite[]) Arrays.copyOf(cipherSuiteArr, cipherSuiteArr.length));
            connectionSpecA = builder.a();
        }
        OkHttpClient.Builder builder2 = new OkHttpClient.Builder();
        long j = NETWORK_TIMEOUT_MS;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        builder2.b(j, timeUnit);
        builder2.A = Util.b(j, timeUnit);
        builder2.d(u63.a0(Protocol.HTTP_2, Protocol.HTTP_1_1));
        List listZ = u63.Z(connectionSpecA);
        if (!listZ.equals(builder2.s)) {
            builder2.C = null;
        }
        builder2.s = Util.x(listZ);
        builder2.c.add(new GzipRequestInterceptor(this.internalLogger));
        if (configuration.getProxy() != null) {
            Proxy proxy = configuration.getProxy();
            if (!wl7.b(proxy, builder2.m)) {
                builder2.C = null;
            }
            builder2.m = proxy;
            Authenticator proxyAuth = configuration.getProxyAuth();
            proxyAuth.getClass();
            if (!proxyAuth.equals(builder2.o)) {
                builder2.C = null;
            }
            builder2.o = proxyAuth;
        }
        RotatingDnsResolver rotatingDnsResolver = new RotatingDnsResolver(null, 0L, 3, null);
        if (rotatingDnsResolver != builder2.l) {
            builder2.C = null;
        }
        builder2.l = rotatingDnsResolver;
        setOkHttpClient$dd_sdk_android_core_release(new OkHttpClient(builder2));
    }

    private final void setupUserInfoProvider() {
        this.userInfoProvider = new DatadogUserInfoProvider(new ScheduledWriter(new NdkUserInfoDataWriter(getStorageDir$dd_sdk_android_core_release(), this.trackingConsentProvider, getPersistenceExecutorService$dd_sdk_android_core_release(), FileReaderWriter.INSTANCE.create(this.internalLogger, this.localDataEncryption), new FileMover(this.internalLogger), this.internalLogger, buildFilePersistenceConfig()), getPersistenceExecutorService$dd_sdk_android_core_release(), this.internalLogger));
    }

    private final void shutDownExecutors() {
        getUploadExecutorService$dd_sdk_android_core_release().shutdownNow();
        getPersistenceExecutorService$dd_sdk_android_core_release().shutdownNow();
        try {
            try {
                ScheduledThreadPoolExecutor uploadExecutorService$dd_sdk_android_core_release = getUploadExecutorService$dd_sdk_android_core_release();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                uploadExecutorService$dd_sdk_android_core_release.awaitTermination(1L, timeUnit);
                getPersistenceExecutorService$dd_sdk_android_core_release().awaitTermination(1L, timeUnit);
            } catch (SecurityException e) {
                InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, (gu5) C05031.INSTANCE, (Throwable) e, false, (Map) null, 48, (Object) null);
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public final FilePersistenceConfig buildFilePersistenceConfig() {
        return new FilePersistenceConfig(this.batchSize.getWindowDurationMs(), 0L, 0L, 0, 0L, 0L, 0L, 126, null);
    }

    public final ExecutorService createExecutorService(String executorContext) {
        executorContext.getClass();
        return this.executorServiceFactory.create(this.internalLogger, executorContext, getBackpressureStrategy$dd_sdk_android_core_release());
    }

    public final ScheduledExecutorService createScheduledExecutorService(String executorContext) {
        executorContext.getClass();
        return this.scheduledExecutorServiceFactory.create(this.internalLogger, executorContext, getBackpressureStrategy$dd_sdk_android_core_release());
    }

    public final void deleteLastFatalAnrSent$dd_sdk_android_core_release() {
        File file = new File(getStorageDir$dd_sdk_android_core_release(), LAST_FATAL_ANR_SENT_FILE_NAME);
        if (FileExtKt.existsSafe(file, this.internalLogger)) {
            FileExtKt.deleteSafe(file, this.internalLogger);
        }
    }

    public final void deleteLastViewEvent$dd_sdk_android_core_release() {
        if (FileExtKt.existsSafe(getLastViewEventFile(), this.internalLogger)) {
            FileExtKt.deleteSafe(getLastViewEventFile(), this.internalLogger);
            return;
        }
        File lastViewEventFile$dd_sdk_android_core_release = DatadogNdkCrashHandler.INSTANCE.getLastViewEventFile$dd_sdk_android_core_release(getStorageDir$dd_sdk_android_core_release());
        if (FileExtKt.existsSafe(lastViewEventFile$dd_sdk_android_core_release, this.internalLogger)) {
            FileExtKt.deleteSafe(lastViewEventFile$dd_sdk_android_core_release, this.internalLogger);
        }
    }

    public final void drainAndShutdownExecutors() throws InterruptedException {
        ArrayList arrayList = new ArrayList();
        getPersistenceExecutorService$dd_sdk_android_core_release().drainTo(arrayList);
        getUploadExecutorService$dd_sdk_android_core_release().getQueue().drainTo(arrayList);
        getPersistenceExecutorService$dd_sdk_android_core_release().shutdown();
        getUploadExecutorService$dd_sdk_android_core_release().shutdown();
        FlushableExecutorService persistenceExecutorService$dd_sdk_android_core_release = getPersistenceExecutorService$dd_sdk_android_core_release();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        persistenceExecutorService$dd_sdk_android_core_release.awaitTermination(10L, timeUnit);
        getUploadExecutorService$dd_sdk_android_core_release().awaitTermination(10L, timeUnit);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final AndroidInfoProvider getAndroidInfoProvider$dd_sdk_android_core_release() {
        AndroidInfoProvider androidInfoProvider = this.androidInfoProvider;
        if (androidInfoProvider != null) {
            return androidInfoProvider;
        }
        wl7.g("androidInfoProvider");
        throw null;
    }

    /* JADX INFO: renamed from: getAppBuildId$dd_sdk_android_core_release, reason: from getter */
    public final String getAppBuildId() {
        return this.appBuildId;
    }

    public final long getAppStartTimeNs$dd_sdk_android_core_release() {
        return this.appStartTimeProvider.getAppStartTimeNs();
    }

    public final BackPressureStrategy getBackpressureStrategy$dd_sdk_android_core_release() {
        BackPressureStrategy backPressureStrategy = this.backpressureStrategy;
        if (backPressureStrategy != null) {
            return backPressureStrategy;
        }
        wl7.g("backpressureStrategy");
        throw null;
    }

    /* JADX INFO: renamed from: getBatchProcessingLevel$dd_sdk_android_core_release, reason: from getter */
    public final BatchProcessingLevel getBatchProcessingLevel() {
        return this.batchProcessingLevel;
    }

    /* JADX INFO: renamed from: getBatchSize$dd_sdk_android_core_release, reason: from getter */
    public final BatchSize getBatchSize() {
        return this.batchSize;
    }

    /* JADX INFO: renamed from: getClientToken$dd_sdk_android_core_release, reason: from getter */
    public final String getClientToken() {
        return this.clientToken;
    }

    /* JADX INFO: renamed from: getContextProvider$dd_sdk_android_core_release, reason: from getter */
    public final ContextProvider getContextProvider() {
        return this.contextProvider;
    }

    public final WeakReference<Context> getContextRef$dd_sdk_android_core_release() {
        return this.contextRef;
    }

    /* JADX INFO: renamed from: getCustomUploadSchedulerStrategy$dd_sdk_android_core_release, reason: from getter */
    public final UploadSchedulerStrategy getCustomUploadSchedulerStrategy() {
        return this.customUploadSchedulerStrategy;
    }

    /* JADX INFO: renamed from: getEnvName$dd_sdk_android_core_release, reason: from getter */
    public final String getEnvName() {
        return this.envName;
    }

    public final Map<String, Map<String, Object>> getFeaturesContext$dd_sdk_android_core_release() {
        return this.featuresContext;
    }

    /* JADX INFO: renamed from: getFirstPartyHostHeaderTypeResolver$dd_sdk_android_core_release, reason: from getter */
    public final DefaultFirstPartyHostHeaderTypeResolver getFirstPartyHostHeaderTypeResolver() {
        return this.firstPartyHostHeaderTypeResolver;
    }

    /* JADX INFO: renamed from: getInitialized$dd_sdk_android_core_release, reason: from getter */
    public final AtomicBoolean getInitialized() {
        return this.initialized;
    }

    /* JADX INFO: renamed from: getKronosClock$dd_sdk_android_core_release, reason: from getter */
    public final dj8 getKronosClock() {
        return this.kronosClock;
    }

    public final Long getLastFatalAnrSent$dd_sdk_android_core_release() {
        String textSafe;
        File file = new File(getStorageDir$dd_sdk_android_core_release(), LAST_FATAL_ANR_SENT_FILE_NAME);
        if (!FileExtKt.existsSafe(file, this.internalLogger) || (textSafe = FileExtKt.readTextSafe(file, a32.b, this.internalLogger)) == null) {
            return null;
        }
        return vve.C(textSafe);
    }

    public final ab8 getLastViewEvent$dd_sdk_android_core_release() {
        return (ab8) this.lastViewEvent.getValue();
    }

    /* JADX INFO: renamed from: getLocalDataEncryption$dd_sdk_android_core_release, reason: from getter */
    public final Encryption getLocalDataEncryption() {
        return this.localDataEncryption;
    }

    /* JADX INFO: renamed from: getNdkCrashHandler$dd_sdk_android_core_release, reason: from getter */
    public final NdkCrashHandler getNdkCrashHandler() {
        return this.ndkCrashHandler;
    }

    /* JADX INFO: renamed from: getNetworkInfoProvider$dd_sdk_android_core_release, reason: from getter */
    public final NetworkInfoProvider getNetworkInfoProvider() {
        return this.networkInfoProvider;
    }

    public final OkHttpClient getOkHttpClient$dd_sdk_android_core_release() {
        OkHttpClient okHttpClient = this.okHttpClient;
        if (okHttpClient != null) {
            return okHttpClient;
        }
        wl7.g("okHttpClient");
        throw null;
    }

    /* JADX INFO: renamed from: getPackageName$dd_sdk_android_core_release, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    /* JADX INFO: renamed from: getPackageVersionProvider$dd_sdk_android_core_release, reason: from getter */
    public final AppVersionProvider getPackageVersionProvider() {
        return this.packageVersionProvider;
    }

    public final FlushableExecutorService getPersistenceExecutorService$dd_sdk_android_core_release() {
        FlushableExecutorService flushableExecutorService = this.persistenceExecutorService;
        if (flushableExecutorService != null) {
            return flushableExecutorService;
        }
        wl7.g("persistenceExecutorService");
        throw null;
    }

    /* JADX INFO: renamed from: getPersistenceStrategyFactory$dd_sdk_android_core_release, reason: from getter */
    public final PersistenceStrategy.Factory getPersistenceStrategyFactory() {
        return this.persistenceStrategyFactory;
    }

    /* JADX INFO: renamed from: getSdkVersion$dd_sdk_android_core_release, reason: from getter */
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    /* JADX INFO: renamed from: getServiceName$dd_sdk_android_core_release, reason: from getter */
    public final String getServiceName() {
        return this.serviceName;
    }

    /* JADX INFO: renamed from: getSite$dd_sdk_android_core_release, reason: from getter */
    public final DatadogSite getSite() {
        return this.site;
    }

    /* JADX INFO: renamed from: getSourceName$dd_sdk_android_core_release, reason: from getter */
    public final String getSourceName() {
        return this.sourceName;
    }

    public final File getStorageDir$dd_sdk_android_core_release() {
        File file = this.storageDir;
        if (file != null) {
            return file;
        }
        wl7.g("storageDir");
        throw null;
    }

    /* JADX INFO: renamed from: getSystemInfoProvider$dd_sdk_android_core_release, reason: from getter */
    public final SystemInfoProvider getSystemInfoProvider() {
        return this.systemInfoProvider;
    }

    /* JADX INFO: renamed from: getTimeProvider$dd_sdk_android_core_release, reason: from getter */
    public final TimeProvider getTimeProvider() {
        return this.timeProvider;
    }

    /* JADX INFO: renamed from: getTrackingConsentProvider$dd_sdk_android_core_release, reason: from getter */
    public final ConsentProvider getTrackingConsentProvider() {
        return this.trackingConsentProvider;
    }

    public final ScheduledThreadPoolExecutor getUploadExecutorService$dd_sdk_android_core_release() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.uploadExecutorService;
        if (scheduledThreadPoolExecutor != null) {
            return scheduledThreadPoolExecutor;
        }
        wl7.g("uploadExecutorService");
        throw null;
    }

    /* JADX INFO: renamed from: getUploadFrequency$dd_sdk_android_core_release, reason: from getter */
    public final UploadFrequency getUploadFrequency() {
        return this.uploadFrequency;
    }

    /* JADX INFO: renamed from: getUserInfoProvider$dd_sdk_android_core_release, reason: from getter */
    public final MutableUserInfoProvider getUserInfoProvider() {
        return this.userInfoProvider;
    }

    /* JADX INFO: renamed from: getVariant$dd_sdk_android_core_release, reason: from getter */
    public final String getVariant() {
        return this.variant;
    }

    public final void initialize(Context appContext, String sdkInstanceId, Configuration configuration, TrackingConsent consent) {
        appContext.getClass();
        sdkInstanceId.getClass();
        configuration.getClass();
        consent.getClass();
        if (this.initialized.get()) {
            return;
        }
        readConfigurationSettings(configuration.getCoreConfig$dd_sdk_android_core_release());
        readApplicationInformation(appContext, configuration);
        resolveProcessInfo(appContext);
        setupExecutors();
        ConcurrencyExtKt.submitSafe(getPersistenceExecutorService$dd_sdk_android_core_release(), "NTP Sync initialization", RuntimeUtilsKt.getUnboundInternalLogger(), new kz2(0, this, appContext));
        setupOkHttpClient(configuration.getCoreConfig$dd_sdk_android_core_release());
        this.firstPartyHostHeaderTypeResolver.addKnownHostsWithHeaderTypes$dd_sdk_android_core_release(configuration.getCoreConfig$dd_sdk_android_core_release().getFirstPartyHostsWithHeaderTypes());
        setAndroidInfoProvider$dd_sdk_android_core_release(new DefaultAndroidInfoProvider(appContext));
        setStorageDir$dd_sdk_android_core_release((File) StrictModeExtKt.allowThreadDiskReads(new C05012(appContext, sdkInstanceId)));
        Object obj = configuration.getAdditionalConfig$dd_sdk_android_core_release().get(Datadog.DD_NATIVE_SOURCE_TYPE);
        prepareNdkCrashData(obj instanceof String ? (String) obj : null);
        setupInfoProviders(appContext, consent);
        this.initialized.set(true);
        this.contextProvider = new DatadogContextProvider(this);
    }

    /* JADX INFO: renamed from: isMainProcess$dd_sdk_android_core_release, reason: from getter */
    public final boolean getIsMainProcess() {
        return this.isMainProcess;
    }

    public final void setAndroidInfoProvider$dd_sdk_android_core_release(AndroidInfoProvider androidInfoProvider) {
        androidInfoProvider.getClass();
        this.androidInfoProvider = androidInfoProvider;
    }

    public final void setAppBuildId$dd_sdk_android_core_release(String str) {
        this.appBuildId = str;
    }

    public final void setBackpressureStrategy$dd_sdk_android_core_release(BackPressureStrategy backPressureStrategy) {
        backPressureStrategy.getClass();
        this.backpressureStrategy = backPressureStrategy;
    }

    public final void setBatchProcessingLevel$dd_sdk_android_core_release(BatchProcessingLevel batchProcessingLevel) {
        batchProcessingLevel.getClass();
        this.batchProcessingLevel = batchProcessingLevel;
    }

    public final void setBatchSize$dd_sdk_android_core_release(BatchSize batchSize) {
        batchSize.getClass();
        this.batchSize = batchSize;
    }

    public final void setClientToken$dd_sdk_android_core_release(String str) {
        str.getClass();
        this.clientToken = str;
    }

    public final void setContextProvider$dd_sdk_android_core_release(ContextProvider contextProvider) {
        contextProvider.getClass();
        this.contextProvider = contextProvider;
    }

    public final void setContextRef$dd_sdk_android_core_release(WeakReference<Context> weakReference) {
        weakReference.getClass();
        this.contextRef = weakReference;
    }

    public final void setCustomUploadSchedulerStrategy$dd_sdk_android_core_release(UploadSchedulerStrategy uploadSchedulerStrategy) {
        this.customUploadSchedulerStrategy = uploadSchedulerStrategy;
    }

    public final void setEnvName$dd_sdk_android_core_release(String str) {
        str.getClass();
        this.envName = str;
    }

    public final void setFirstPartyHostHeaderTypeResolver$dd_sdk_android_core_release(DefaultFirstPartyHostHeaderTypeResolver defaultFirstPartyHostHeaderTypeResolver) {
        defaultFirstPartyHostHeaderTypeResolver.getClass();
        this.firstPartyHostHeaderTypeResolver = defaultFirstPartyHostHeaderTypeResolver;
    }

    public final void setKronosClock$dd_sdk_android_core_release(dj8 dj8Var) {
        this.kronosClock = dj8Var;
    }

    public final void setLocalDataEncryption$dd_sdk_android_core_release(Encryption encryption) {
        this.localDataEncryption = encryption;
    }

    public final void setMainProcess$dd_sdk_android_core_release(boolean z) {
        this.isMainProcess = z;
    }

    public final void setNdkCrashHandler$dd_sdk_android_core_release(NdkCrashHandler ndkCrashHandler) {
        ndkCrashHandler.getClass();
        this.ndkCrashHandler = ndkCrashHandler;
    }

    public final void setNetworkInfoProvider$dd_sdk_android_core_release(NetworkInfoProvider networkInfoProvider) {
        networkInfoProvider.getClass();
        this.networkInfoProvider = networkInfoProvider;
    }

    public final void setOkHttpClient$dd_sdk_android_core_release(OkHttpClient okHttpClient) {
        okHttpClient.getClass();
        this.okHttpClient = okHttpClient;
    }

    public final void setPackageName$dd_sdk_android_core_release(String str) {
        str.getClass();
        this.packageName = str;
    }

    public final void setPackageVersionProvider$dd_sdk_android_core_release(AppVersionProvider appVersionProvider) {
        appVersionProvider.getClass();
        this.packageVersionProvider = appVersionProvider;
    }

    public final void setPersistenceExecutorService$dd_sdk_android_core_release(FlushableExecutorService flushableExecutorService) {
        flushableExecutorService.getClass();
        this.persistenceExecutorService = flushableExecutorService;
    }

    public final void setPersistenceStrategyFactory$dd_sdk_android_core_release(PersistenceStrategy.Factory factory) {
        this.persistenceStrategyFactory = factory;
    }

    public final void setSdkVersion$dd_sdk_android_core_release(String str) {
        str.getClass();
        this.sdkVersion = str;
    }

    public final void setServiceName$dd_sdk_android_core_release(String str) {
        str.getClass();
        this.serviceName = str;
    }

    public final void setSite$dd_sdk_android_core_release(DatadogSite datadogSite) {
        datadogSite.getClass();
        this.site = datadogSite;
    }

    public final void setSourceName$dd_sdk_android_core_release(String str) {
        str.getClass();
        this.sourceName = str;
    }

    public final void setStorageDir$dd_sdk_android_core_release(File file) {
        file.getClass();
        this.storageDir = file;
    }

    public final void setSystemInfoProvider$dd_sdk_android_core_release(SystemInfoProvider systemInfoProvider) {
        systemInfoProvider.getClass();
        this.systemInfoProvider = systemInfoProvider;
    }

    public final void setTimeProvider$dd_sdk_android_core_release(TimeProvider timeProvider) {
        timeProvider.getClass();
        this.timeProvider = timeProvider;
    }

    public final void setTrackingConsentProvider$dd_sdk_android_core_release(ConsentProvider consentProvider) {
        consentProvider.getClass();
        this.trackingConsentProvider = consentProvider;
    }

    public final void setUploadExecutorService$dd_sdk_android_core_release(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        scheduledThreadPoolExecutor.getClass();
        this.uploadExecutorService = scheduledThreadPoolExecutor;
    }

    public final void setUploadFrequency$dd_sdk_android_core_release(UploadFrequency uploadFrequency) {
        uploadFrequency.getClass();
        this.uploadFrequency = uploadFrequency;
    }

    public final void setUserInfoProvider$dd_sdk_android_core_release(MutableUserInfoProvider mutableUserInfoProvider) {
        mutableUserInfoProvider.getClass();
        this.userInfoProvider = mutableUserInfoProvider;
    }

    public final void setVariant$dd_sdk_android_core_release(String str) {
        str.getClass();
        this.variant = str;
    }

    public final void stop() {
        if (this.initialized.get()) {
            Context context = this.contextRef.get();
            if (context != null) {
                this.networkInfoProvider.unregister(context);
                this.systemInfoProvider.unregister(context);
            }
            this.contextRef.clear();
            this.trackingConsentProvider.unregisterAllCallbacks();
            cleanupApplicationInfo();
            cleanupProviders();
            shutDownExecutors();
            try {
                dj8 dj8Var = this.kronosClock;
                if (dj8Var != null) {
                    dj8Var.shutdown();
                }
            } catch (IllegalStateException e) {
                InternalLogger.DefaultImpls.log$default(this.internalLogger, InternalLogger.Level.WARN, InternalLogger.Target.MAINTAINER, (gu5) C05042.INSTANCE, (Throwable) e, false, (Map) null, 48, (Object) null);
            }
            this.featuresContext.clear();
            this.initialized.set(false);
            this.ndkCrashHandler = new NoOpNdkCrashHandler();
            this.trackingConsentProvider = new NoOpConsentProvider();
            this.contextProvider = new NoOpContextProvider();
        }
    }

    public final void writeLastFatalAnrSent$dd_sdk_android_core_release(long anrTimestamp) {
        FileExtKt.writeTextSafe(new File(getStorageDir$dd_sdk_android_core_release(), LAST_FATAL_ANR_SENT_FILE_NAME), String.valueOf(anrTimestamp), a32.b, this.internalLogger);
    }

    public final void writeLastViewEvent$dd_sdk_android_core_release(byte[] data) {
        data.getClass();
        getLastViewEventFileWriter().writeData(getLastViewEventFile(), new RawBatchEvent(data, null, 2, 0 == true ? 1 : 0), false);
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\u0016X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u0016X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0016X\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fX\u0080\u0004¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u000e\u0010$\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u001a\u0010%\u001a\u00020&X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/datadog/android/core/internal/CoreFeature$Companion;", "", "()V", "BUILD_ID_FILE_NAME", "", "BUILD_ID_IS_MISSING_INFO_MESSAGE", "BUILD_ID_READ_ERROR", "CORE_DEFAULT_POOL_SIZE", "", "DATADOG_STORAGE_DIR_NAME", "DEFAULT_APP_VERSION", "DEFAULT_FLUSHABLE_EXECUTOR_SERVICE_FACTORY", "Lcom/datadog/android/core/thread/FlushableExecutorService$Factory;", "getDEFAULT_FLUSHABLE_EXECUTOR_SERVICE_FACTORY$dd_sdk_android_core_release", "()Lcom/datadog/android/core/thread/FlushableExecutorService$Factory;", "DEFAULT_SCHEDULED_EXECUTOR_SERVICE_FACTORY", "Lcom/datadog/android/core/internal/thread/ScheduledExecutorServiceFactory;", "getDEFAULT_SCHEDULED_EXECUTOR_SERVICE_FACTORY$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/thread/ScheduledExecutorServiceFactory;", "DEFAULT_SDK_VERSION", "DEFAULT_SOURCE_NAME", "DRAIN_WAIT_SECONDS", "", "LAST_FATAL_ANR_SENT_FILE_NAME", "LAST_RUM_VIEW_EVENT_FILE_NAME", "NETWORK_TIMEOUT_MS", "getNETWORK_TIMEOUT_MS$dd_sdk_android_core_release", "()J", "NTP_CACHE_EXPIRATION_MINUTES", "NTP_DELAY_BETWEEN_SYNCS_MINUTES", "RESTRICTED_CIPHER_SUITES", "", "Lokhttp3/CipherSuite;", "getRESTRICTED_CIPHER_SUITES$dd_sdk_android_core_release", "()[Lokhttp3/CipherSuite;", "[Lokhttp3/CipherSuite;", "SDK_INITIALIZED_IN_SECONDARY_PROCESS_WARNING_MESSAGE", "disableKronosBackgroundSync", "", "getDisableKronosBackgroundSync$dd_sdk_android_core_release", "()Z", "setDisableKronosBackgroundSync$dd_sdk_android_core_release", "(Z)V", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FlushableExecutorService.Factory getDEFAULT_FLUSHABLE_EXECUTOR_SERVICE_FACTORY$dd_sdk_android_core_release() {
            return CoreFeature.DEFAULT_FLUSHABLE_EXECUTOR_SERVICE_FACTORY;
        }

        public final ScheduledExecutorServiceFactory getDEFAULT_SCHEDULED_EXECUTOR_SERVICE_FACTORY$dd_sdk_android_core_release() {
            return CoreFeature.DEFAULT_SCHEDULED_EXECUTOR_SERVICE_FACTORY;
        }

        public final boolean getDisableKronosBackgroundSync$dd_sdk_android_core_release() {
            return CoreFeature.disableKronosBackgroundSync;
        }

        public final long getNETWORK_TIMEOUT_MS$dd_sdk_android_core_release() {
            return CoreFeature.NETWORK_TIMEOUT_MS;
        }

        public final CipherSuite[] getRESTRICTED_CIPHER_SUITES$dd_sdk_android_core_release() {
            return CoreFeature.RESTRICTED_CIPHER_SUITES;
        }

        public final void setDisableKronosBackgroundSync$dd_sdk_android_core_release(boolean z) {
            CoreFeature.disableKronosBackgroundSync = z;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.CoreFeature$getPackageInfo$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class AnonymousClass2 extends mj8 implements gu5<String> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return "Unable to read your application's version name";
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.CoreFeature$resolveProcessInfo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05021 extends mj8 implements gu5<String> {
        public static final C05021 INSTANCE = new C05021();

        public C05021() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return CoreFeature.SDK_INITIALIZED_IN_SECONDARY_PROCESS_WARNING_MESSAGE;
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.CoreFeature$shutDownExecutors$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05031 extends mj8 implements gu5<String> {
        public static final C05031 INSTANCE = new C05031();

        public C05031() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return "Thread was unable to set its own interrupted state";
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.internal.CoreFeature$stop$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 0}, xi = 48)
    public static final class C05042 extends mj8 implements gu5<String> {
        public static final C05042 INSTANCE = new C05042();

        public C05042() {
            super(0);
        }

        @Override // defpackage.gu5
        public final String invoke() {
            return "Trying to shut down Kronos when it is already not running";
        }
    }
}
