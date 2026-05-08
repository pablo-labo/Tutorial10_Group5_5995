package com.indeed.android.reactnative.rntarebridge;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.datadog.android.log.LogAttributes;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import com.datadog.android.rum.internal.domain.scope.RumSessionScope;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.indeed.android.jobsearch.BuildConfig;
import com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNTareBridge;
import com.indeed.android.reactnative.rntarebridge.RNTareBridge;
import com.indeed.android.reactnative.rntarebridge.topnav.InvalidTARETopNavHostException;
import com.indeed.android.reactnative.rntarebridge.topnav.UIManagerNotFoundException;
import com.indeed.android.reactnative.rntarebridge.topnav.ViewNotFoundException;
import com.indeed.android.tare.management.JSTCacheValue;
import com.indeed.android.tare.management.ViewJobFeed;
import com.indeed.android.tare.management.ViewJobHint;
import defpackage.a3;
import defpackage.a74;
import defpackage.a9c;
import defpackage.ai8;
import defpackage.aq7;
import defpackage.as7;
import defpackage.bg;
import defpackage.boa;
import defpackage.bp7;
import defpackage.bs7;
import defpackage.c1f;
import defpackage.c4g;
import defpackage.cr8;
import defpackage.cs7;
import defpackage.da2;
import defpackage.ds7;
import defpackage.e13;
import defpackage.ep7;
import defpackage.eq3;
import defpackage.fs7;
import defpackage.fwc;
import defpackage.g13;
import defpackage.ghc;
import defpackage.gp7;
import defpackage.gr7;
import defpackage.gs7;
import defpackage.gse;
import defpackage.gt;
import defpackage.gu5;
import defpackage.hh1;
import defpackage.hhc;
import defpackage.hr7;
import defpackage.hs7;
import defpackage.is7;
import defpackage.j6g;
import defpackage.jae;
import defpackage.kc9;
import defpackage.kq7;
import defpackage.kr7;
import defpackage.ks7;
import defpackage.l;
import defpackage.l5;
import defpackage.lp7;
import defpackage.lr5;
import defpackage.ls7;
import defpackage.lu2;
import defpackage.lve;
import defpackage.lx;
import defpackage.lx5;
import defpackage.lz2;
import defpackage.mj8;
import defpackage.mja;
import defpackage.mqc;
import defpackage.nmc;
import defpackage.no3;
import defpackage.np7;
import defpackage.nq7;
import defpackage.ns7;
import defpackage.nt7;
import defpackage.oq7;
import defpackage.or7;
import defpackage.os7;
import defpackage.pp7;
import defpackage.pr7;
import defpackage.q6;
import defpackage.qpd;
import defpackage.qq7;
import defpackage.qr7;
import defpackage.qs7;
import defpackage.qt8;
import defpackage.qv5;
import defpackage.r6;
import defpackage.r7d;
import defpackage.rdc;
import defpackage.rja;
import defpackage.rp7;
import defpackage.rq7;
import defpackage.rr7;
import defpackage.rw1;
import defpackage.s98;
import defpackage.se;
import defpackage.sid;
import defpackage.sof;
import defpackage.sp7;
import defpackage.sqc;
import defpackage.sr7;
import defpackage.ss7;
import defpackage.t40;
import defpackage.t92;
import defpackage.tdc;
import defpackage.to1;
import defpackage.tp7;
import defpackage.tr7;
import defpackage.ts7;
import defpackage.tsb;
import defpackage.u63;
import defpackage.uh3;
import defpackage.ur7;
import defpackage.us7;
import defpackage.vh8;
import defpackage.vid;
import defpackage.vr7;
import defpackage.vs7;
import defpackage.w49;
import defpackage.wi1;
import defpackage.wi5;
import defpackage.wl7;
import defpackage.xdc;
import defpackage.xh8;
import defpackage.xr7;
import defpackage.xs7;
import defpackage.ynb;
import defpackage.yr7;
import defpackage.z3;
import defpackage.z92;
import defpackage.zr4;
import defpackage.zr7;
import defpackage.zve;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.serialization.json.JsonObject;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$toRequestBody$2;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.connection.RealCall;
import okhttp3.sse.EventSource;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@nmc(name = IndeedRNBridgeBaseRNTareBridge.MODULE_NAME)
@Metadata(d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0006\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b0\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002é\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0014\u0010\u0010J\u000f\u0010\u0015\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0016\u0010\u0010J\u000f\u0010\u0017\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0017\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0018\u0010\u0010J\u000f\u0010\u0019\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0019\u0010\u0013J'\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ7\u0010\"\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\"\u0010#J\u001f\u0010$\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b$\u0010%J/\u0010&\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b&\u0010'J?\u0010)\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010(\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b)\u0010*J7\u0010-\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\t2\u0006\u0010,\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b-\u0010#J7\u00103\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\t2\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020\t2\u0006\u00102\u001a\u00020 2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b3\u00104J)\u00107\u001a\u00020\u000e2\u0006\u00105\u001a\u00020 2\b\u00106\u001a\u0004\u0018\u00010 2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b7\u00108J1\u0010;\u001a\u00020\u000e2\u0006\u00109\u001a\u00020\t2\u0006\u0010.\u001a\u00020\t2\b\u0010:\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b;\u0010<J\u001f\u0010>\u001a\u00020\u000e2\u0006\u0010=\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b>\u0010%J'\u0010A\u001a\u00020\u000e2\u0006\u0010?\u001a\u00020 2\u0006\u0010@\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\bA\u0010BJ)\u0010D\u001a\u00020\u000e2\u0006\u0010C\u001a\u00020 2\b\u0010@\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\bD\u0010BJ)\u0010F\u001a\u00020\u000e2\u0006\u0010E\u001a\u00020 2\b\u0010@\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\bF\u0010BJ3\u0010J\u001a\u00020\u000e2\u0006\u0010G\u001a\u00020\t2\b\u0010H\u001a\u0004\u0018\u00010\t2\b\u0010I\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\bJ\u0010<J\u0017\u0010K\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\bK\u0010\u0010J'\u0010N\u001a\u00020\u000e2\u0006\u0010L\u001a\u00020\t2\u0006\u0010M\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\bN\u0010\u001dJ\u001f\u0010O\u001a\u00020\u000e2\u0006\u0010L\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\bO\u0010%J9\u0010S\u001a\u00020\u000e2\u0006\u0010P\u001a\u00020\t2\u0006\u00109\u001a\u00020\t2\u0006\u0010Q\u001a\u00020\t2\b\u0010R\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\bS\u0010TJ)\u0010W\u001a\u00020\u000e2\u0006\u0010V\u001a\u00020U2\b\u0010H\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\bW\u0010XJ1\u0010\\\u001a\u00020\u000e2\u0006\u0010Y\u001a\u00020\t2\u0006\u0010Z\u001a\u00020\t2\b\u0010[\u001a\u0004\u0018\u00010U2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\\\u0010]J/\u0010_\u001a\u00020\u000e2\u0006\u0010Y\u001a\u00020\t2\u0006\u0010Z\u001a\u00020\t2\u0006\u0010^\u001a\u00020U2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b_\u0010`J1\u0010a\u001a\u00020\u000e2\u0006\u0010Y\u001a\u00020\t2\u0006\u0010Z\u001a\u00020\t2\b\u0010[\u001a\u0004\u0018\u00010/2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\ba\u0010bJ/\u0010c\u001a\u00020\u000e2\u0006\u0010Y\u001a\u00020\t2\u0006\u0010Z\u001a\u00020\t2\u0006\u0010^\u001a\u00020/2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\bc\u0010dJ1\u0010e\u001a\u00020\u000e2\u0006\u0010Y\u001a\u00020\t2\u0006\u0010Z\u001a\u00020\t2\b\u0010[\u001a\u0004\u0018\u00010/2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\be\u0010bJ/\u0010f\u001a\u00020\u000e2\u0006\u0010Y\u001a\u00020\t2\u0006\u0010Z\u001a\u00020\t2\u0006\u0010^\u001a\u00020/2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\bf\u0010dJ1\u0010g\u001a\u00020\u000e2\u0006\u0010Y\u001a\u00020\t2\u0006\u0010Z\u001a\u00020\t2\b\u0010[\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\bg\u0010<J/\u0010h\u001a\u00020\u000e2\u0006\u0010Y\u001a\u00020\t2\u0006\u0010Z\u001a\u00020\t2\u0006\u0010^\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\bh\u0010<J\u001f\u0010i\u001a\u00020\u000e2\u0006\u0010Y\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\bi\u0010%J\u001f\u0010j\u001a\u00020\u000e2\u0006\u0010Z\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\bj\u0010%J'\u0010l\u001a\u00020\u000e2\u0006\u0010Z\u001a\u00020\t2\u0006\u0010k\u001a\u00020 2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\bl\u0010mJ\u001f\u0010o\u001a\u00020\u000e2\u0006\u0010n\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\bo\u0010pJ\u001f\u0010r\u001a\u00020\u000e2\u0006\u0010q\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\br\u0010%JU\u0010y\u001a\u00020\u000e2\u0006\u0010s\u001a\u00020/2\u0006\u0010t\u001a\u00020\u001e2\u0006\u0010u\u001a\u00020\u001e2\u0006\u0010v\u001a\u00020 2\b\u0010w\u001a\u0004\u0018\u00010\t2\b\u0010x\u001a\u0004\u0018\u00010U2\b\u0010\u001a\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\by\u0010zJ\u0017\u0010{\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\tH\u0017¢\u0006\u0004\b{\u0010|J\u0017\u0010~\u001a\u00020\u000e2\u0006\u0010}\u001a\u00020/H\u0017¢\u0006\u0004\b~\u0010\u007fJ\"\u0010\u0081\u0001\u001a\u00020\u000e2\u0007\u0010\u0080\u0001\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0005\b\u0081\u0001\u0010%J+\u0010\u0083\u0001\u001a\u00020\u000e2\u0007\u0010\u0080\u0001\u001a\u00020\t2\u0007\u0010\u0082\u0001\u001a\u00020 2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0005\b\u0083\u0001\u0010mJ3\u0010\u0085\u0001\u001a\u00020\u000e2\u0007\u0010\u0080\u0001\u001a\u00020\t2\u0006\u0010Z\u001a\u00020\t2\u0007\u0010\u0084\u0001\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0005\b\u0085\u0001\u0010<J.\u0010\u0088\u0001\u001a\u00020\u000e2\u0007\u0010\u0004\u001a\u00030\u0086\u00012\u0006\u0010+\u001a\u00020\t2\t\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u0011\u0010\u008a\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b\u008a\u0001\u0010\u0013J\u001c\u0010\u008d\u0001\u001a\u00020\t2\b\u0010\u008c\u0001\u001a\u00030\u008b\u0001H\u0002¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u0011\u0010\u008f\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b\u008f\u0001\u0010\u0013J\u0011\u0010\u0090\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b\u0090\u0001\u0010\u0013J\u0011\u0010\u0091\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0005\b\u0091\u0001\u0010\u0013J%\u0010\u0095\u0001\u001a\u00020\u000e2\u0007\u0010\u0092\u0001\u001a\u00020 2\b\u0010\u0094\u0001\u001a\u00030\u0093\u0001H\u0002¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J-\u0010\u009a\u0001\u001a\u0012\u0012\u0005\u0012\u00030\u0099\u0001\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0098\u00012\t\u0010\u0097\u0001\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\"\u0010\u009e\u0001\u001a\t\u0012\u0004\u0012\u00020\t0\u009d\u00012\u0007\u0010\u009c\u0001\u001a\u00020\u001eH\u0002¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J=\u0010¥\u0001\u001a\u001b\u0012\u0005\u0012\u00030£\u0001\u0012\u0007\u0012\u0005\u0018\u00010¤\u0001\u0012\u0004\u0012\u00020\u000e\u0018\u00010¢\u00012\b\u0010¡\u0001\u001a\u00030 \u00012\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0006\b¥\u0001\u0010¦\u0001J\"\u0010¨\u0001\u001a\u00020\u001e2\u000e\u0010§\u0001\u001a\t\u0012\u0004\u0012\u00020\t0\u009d\u0001H\u0002¢\u0006\u0006\b¨\u0001\u0010©\u0001J \u0010«\u0001\u001a\u0005\u0018\u00010ª\u00012\t\u0010\u0097\u0001\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0006\b«\u0001\u0010¬\u0001J \u0010®\u0001\u001a\u0005\u0018\u00010\u00ad\u00012\t\u0010\u0097\u0001\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0006\b®\u0001\u0010¯\u0001J \u0010±\u0001\u001a\u0004\u0018\u00010\u00112\n\u0010°\u0001\u001a\u0005\u0018\u00010ª\u0001H\u0002¢\u0006\u0006\b±\u0001\u0010²\u0001J \u0010´\u0001\u001a\u0004\u0018\u00010\u00112\n\u0010³\u0001\u001a\u0005\u0018\u00010\u00ad\u0001H\u0002¢\u0006\u0006\b´\u0001\u0010µ\u0001J+\u0010¸\u0001\u001a\u0011\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0011\u0018\u00010·\u00012\b\u0010¶\u0001\u001a\u00030¤\u0001H\u0002¢\u0006\u0006\b¸\u0001\u0010¹\u0001J0\u0010¼\u0001\u001a\u00030»\u00012\b\u0010¡\u0001\u001a\u00030 \u00012\t\u0010º\u0001\u001a\u0004\u0018\u00010 2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0006\b¼\u0001\u0010½\u0001J1\u0010À\u0001\u001a\u0005\u0018\u00010¿\u00012\u0007\u0010¾\u0001\u001a\u00020\t2\t\u0010º\u0001\u001a\u0004\u0018\u00010 2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0006\bÀ\u0001\u0010Á\u0001J\u001e\u0010Ä\u0001\u001a\u0005\u0018\u00010Ã\u00012\u0007\u0010Â\u0001\u001a\u00020 H\u0002¢\u0006\u0006\bÄ\u0001\u0010Å\u0001J1\u0010Ç\u0001\u001a\u0005\u0018\u00010Æ\u00012\u0007\u0010¾\u0001\u001a\u00020\t2\t\u0010º\u0001\u001a\u0004\u0018\u00010 2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0006\bÇ\u0001\u0010È\u0001J1\u0010É\u0001\u001a\u0019\u0012\u0005\u0012\u00030¤\u0001\u0012\u0007\u0012\u0005\u0018\u00010¤\u0001\u0012\u0004\u0012\u00020\u000e0¢\u00012\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0006\bÉ\u0001\u0010Ê\u0001J \u0010Ë\u0001\u001a\u0004\u0018\u00010U*\u00020 2\u0006\u0010Z\u001a\u00020\tH\u0002¢\u0006\u0006\bË\u0001\u0010Ì\u0001J \u0010Í\u0001\u001a\u0004\u0018\u00010\t*\u00020 2\u0006\u0010Z\u001a\u00020\tH\u0002¢\u0006\u0006\bÍ\u0001\u0010Î\u0001J\u001a\u0010Ð\u0001\u001a\u00020\u000e2\u0007\u0010Ï\u0001\u001a\u00020\tH\u0002¢\u0006\u0005\bÐ\u0001\u0010|R\u0015\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0004\u0010Ñ\u0001R!\u0010×\u0001\u001a\u00030Ò\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÓ\u0001\u0010Ô\u0001\u001a\u0006\bÕ\u0001\u0010Ö\u0001R!\u0010Ú\u0001\u001a\u00030Ò\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bØ\u0001\u0010Ô\u0001\u001a\u0006\bÙ\u0001\u0010Ö\u0001R5\u0010Ý\u0001\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0005\u0012\u00030Ü\u00010Û\u00018\u0006X\u0087\u0004¢\u0006\u0018\n\u0006\bÝ\u0001\u0010Þ\u0001\u0012\u0006\bá\u0001\u0010â\u0001\u001a\u0006\bß\u0001\u0010à\u0001R\u0018\u0010ä\u0001\u001a\u00030ã\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bä\u0001\u0010å\u0001R\u0017\u0010è\u0001\u001a\u00020\t8BX\u0082\u0004¢\u0006\b\u001a\u0006\bæ\u0001\u0010ç\u0001¨\u0006ê\u0001"}, d2 = {"Lcom/indeed/android/reactnative/rntarebridge/RNTareBridge;", "Lcom/indeed/android/reactnative/nativemodules/generated/IndeedRNBridgeBaseRNTareBridge;", "Lxh8;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Lcom/indeed/android/reactnative/rntarebridge/RNTareBridge$a;", "bridgedClassInstance", "", "generateInstanceUuid", "(Lcom/indeed/android/reactnative/rntarebridge/RNTareBridge$a;)Ljava/lang/String;", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lj6g;", "getAppModel", "(Lcom/facebook/react/bridge/Promise;)V", "Lcom/facebook/react/bridge/WritableMap;", "getAppModelSync", "()Lcom/facebook/react/bridge/WritableMap;", "getDeviceModel", "getDeviceModelSync", "getAppSessionInfo", "getAppSessionInfoSync", "getAccountStatus", "getAccountStatusSync", "screenName", "elementName", "logTapButton", "(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "Lcom/facebook/react/bridge/ReadableArray;", "tags", "Lcom/facebook/react/bridge/ReadableMap;", "extraParams", "logTapButtonWithExtraParams", "(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "logScreenView", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "logScreenViewWithExtraParams", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "elementType", "logElementView", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "eventName", "eventType", "logLegacyGenericEvent", "message", "", "errCode", "errDomain", "otherUserInfo", "logNonFatal", "(Ljava/lang/String;DLjava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "event", "metadata", "logRNBridgeInternal", "(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "url", "subject", "openShareSheet", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "text", "copyToClipboard", "profilePreferenceFormData", "presenter", "presentProfilePreferences", "(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "resumeMainSectionFormData", "presentResumeMainSectionForm", "resumeOtherSectionFormData", "presentResumeOtherSectionForm", "style", "from", "tk", "openPaywallModal", "sseClient", "sseClientId", "path", "sseConnect", "sseDisconnect", "requestId", "method", "body", "startNativeFetch", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "", "isRegistration", "openLoginModal", "(ZLjava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "namespace", "key", "defaultValue", "getLocalPrefsBoolean", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/facebook/react/bridge/Promise;)V", "newValue", "setLocalPrefsBoolean", "(Ljava/lang/String;Ljava/lang/String;ZLcom/facebook/react/bridge/Promise;)V", "getLocalPrefsInt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Lcom/facebook/react/bridge/Promise;)V", "setLocalPrefsInt", "(Ljava/lang/String;Ljava/lang/String;DLcom/facebook/react/bridge/Promise;)V", "getLocalPrefsLong", "setLocalPrefsLong", "getLocalPrefsString", "setLocalPrefsString", "clearLocalPrefsNamespace", "getCachedViewJobHint", "hint", "setCachedViewJobHint", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "testNames", "getProctorAllocations", "(Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/Promise;)V", "testName", "getProctorAllocation", "rootTag", "leading", "trailing", "title", "backgroundColor", "animated", "setNavBarItems", "(DLcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "addListener", "(Ljava/lang/String;)V", "count", "removeListeners", "(D)V", "homepageTk", "getCachedViewJobFeed", "viewJobFeed", "setCachedViewJobFeed", "value", "updateCachedViewJobFeed", "Lcom/facebook/react/bridge/ReactContext;", "params", "sendEvent", "(Lcom/facebook/react/bridge/ReactContext;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V", "innerGetAppModel", "Lgr7;", "orientation", "serializeOrientation", "(Lgr7;)Ljava/lang/String;", "innerGetDeviceModel", "innerGetAppSessionInfo", "innerGetAccountStatus", "readableMap", "Llx5$b;", "paramsBuilder", "addGenericEventExtraParams", "(Lcom/facebook/react/bridge/ReadableMap;Llx5$b;)V", "map", "Lkotlin/Function1;", "Lhr7;", "readableMapToJSTParamsBuilder", "(Lcom/facebook/react/bridge/ReadableMap;)Lkotlin/jvm/functions/Function1;", "readableArray", "", "readableArrayToStringList", "(Lcom/facebook/react/bridge/ReadableArray;)Ljava/util/List;", "Ltsb;", "preferenceType", "Lkotlin/Function2;", "Lhs7;", "", "createProfilePreferencesOnCompletionPromise", "(Ltsb;Lcom/facebook/react/bridge/Promise;)Lkotlin/jvm/functions/Function2;", "stringList", "readableArrayFromStringList", "(Ljava/util/List;)Lcom/facebook/react/bridge/ReadableArray;", "Lrr7;", "readableMapToJSTProfileDate", "(Lcom/facebook/react/bridge/ReadableMap;)Lrr7;", "Lsr7;", "readableMapToJSTProfileDateRange", "(Lcom/facebook/react/bridge/ReadableMap;)Lsr7;", LogAttributes.DATE, "writableMapFromJSTProfileDate", "(Lrr7;)Lcom/facebook/react/bridge/WritableMap;", "range", "writableMapFromJSTProfileDateRange", "(Lsr7;)Lcom/facebook/react/bridge/WritableMap;", "data", "Lkotlin/Pair;", "mapResumeFormDataToWritable", "(Ljava/lang/Object;)Lkotlin/Pair;", "formPrefillData", "Lgs7;", "readableMapToJSTProfilePreference", "(Ltsb;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)Lgs7;", "sectionType", "Lns7;", "readableMapToJSTProfileResumeMainSection", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)Lns7;", "skillMap", "Lqs7;", "parseSkillFromMap", "(Lcom/facebook/react/bridge/ReadableMap;)Lqs7;", "Los7;", "readableMapToJSTProfileResumeOtherSection", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)Los7;", "createResumeFormOnCompletionPromise", "(Lcom/facebook/react/bridge/Promise;)Lkotlin/jvm/functions/Function2;", "getBooleanSafeOrNull", "(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Ljava/lang/Boolean;", "getStringSafeOrNull", "(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Ljava/lang/String;", "callbackId", "onNavItemClick", "Lcom/facebook/react/bridge/ReactApplicationContext;", "Lokhttp3/OkHttpClient;", "sseOkHttpClient$delegate", "Lkotlin/Lazy;", "getSseOkHttpClient", "()Lokhttp3/OkHttpClient;", "sseOkHttpClient", "nativeFetchClient$delegate", "getNativeFetchClient", "nativeFetchClient", "Ljava/util/concurrent/ConcurrentHashMap;", "Lsid;", "sseClientInstances", "Ljava/util/concurrent/ConcurrentHashMap;", "getSseClientInstances", "()Ljava/util/concurrent/ConcurrentHashMap;", "getSseClientInstances$annotations", "()V", "Lrja;", "nonFatalErrorEventFactory", "Lrja;", "getSseBaseUrl", "()Ljava/lang/String;", "sseBaseUrl", "a", "reactnative_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RNTareBridge extends IndeedRNBridgeBaseRNTareBridge implements xh8 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: nativeFetchClient$delegate, reason: from kotlin metadata */
    private final Lazy nativeFetchClient;
    private final rja nonFatalErrorEventFactory;
    private final ReactApplicationContext reactContext;
    private final ConcurrentHashMap<String, sid> sseClientInstances;

    /* JADX INFO: renamed from: sseOkHttpClient$delegate, reason: from kotlin metadata */
    private final Lazy sseOkHttpClient;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final /* synthetic */ a[] b;
        private final String prefix = "indeed-sse";

        static {
            a aVar = new a();
            a = aVar;
            b = new a[]{aVar};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) b.clone();
        }

        public final String a() {
            return this.prefix;
        }
    }

    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[rp7.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[gr7.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[ReadableType.values().length];
            try {
                iArr3[ReadableType.String.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[ReadableType.Number.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[ReadableType.Boolean.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            a = iArr3;
            int[] iArr4 = new int[tsb.values().length];
            try {
                iArr4[0] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr4[1] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[2] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[3] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[4] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[5] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            int[] iArr5 = new int[w49.values().length];
            try {
                iArr5[0] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                w49.a aVar = w49.Companion;
                iArr5[1] = 2;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    public static final /* synthetic */ class c extends qv5 implements Function1<String, j6g> {
        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(String str) {
            String str2 = str;
            str2.getClass();
            ((RNTareBridge) this.receiver).onNavItemClick(str2);
            return j6g.a;
        }
    }

    public static final /* synthetic */ class d extends qv5 implements Function1<String, j6g> {
        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(String str) {
            String str2 = str;
            str2.getClass();
            ((RNTareBridge) this.receiver).onNavItemClick(str2);
            return j6g.a;
        }
    }

    public static final class e extends mj8 implements gu5<OkHttpClient> {
        final /* synthetic */ gu5 $parameters = null;
        final /* synthetic */ a9c $qualifier;
        final /* synthetic */ xh8 $this_inject;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(RNTareBridge rNTareBridge, lve lveVar) {
            super(0);
            this.$this_inject = rNTareBridge;
            this.$qualifier = lveVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, okhttp3.OkHttpClient] */
        @Override // defpackage.gu5
        public final OkHttpClient invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(OkHttpClient.class), a9cVar);
        }
    }

    public static final class f extends mj8 implements gu5<OkHttpClient> {
        final /* synthetic */ gu5 $parameters = null;
        final /* synthetic */ a9c $qualifier;
        final /* synthetic */ xh8 $this_inject;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(RNTareBridge rNTareBridge, lve lveVar) {
            super(0);
            this.$this_inject = rNTareBridge;
            this.$qualifier = lveVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, okhttp3.OkHttpClient] */
        @Override // defpackage.gu5
        public final OkHttpClient invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(OkHttpClient.class), a9cVar);
        }
    }

    public static final class g {
        public final void a(String str) {
            ArrayList arrayList = lz2.a;
            Log.d("SSEClient", str, null);
        }

        public final void b(String str) {
            ArrayList arrayList = lz2.a;
            lz2.d("SSEClient", str, false, null);
        }
    }

    @uh3(c = "com.indeed.android.reactnative.rntarebridge.RNTareBridge$sseConnect$1", f = "RNTareBridge.kt", l = {657}, m = "invokeSuspend")
    public static final class h extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ String $path;
        final /* synthetic */ Promise $promise;
        final /* synthetic */ String $sseClientId;
        Object L$0;
        int label;

        public static final class a<T> implements wi5 {
            public final /* synthetic */ RNTareBridge a;
            public final /* synthetic */ String b;

            public a(RNTareBridge rNTareBridge, String str) {
                this.a = rNTareBridge;
                this.b = str;
            }

            @Override // defpackage.wi5
            public final Object a(Object obj, lu2 lu2Var) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                s98.a aVar = s98.d;
                aVar.getClass();
                writableMapCreateMap.putString("payload", aVar.b(vid.Companion.serializer(), (vid) obj));
                RNTareBridge rNTareBridge = this.a;
                rNTareBridge.sendEvent(rNTareBridge.reactContext, this.b, writableMapCreateMap);
                return j6g.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, Promise promise, String str2, lu2<? super h> lu2Var) {
            super(2, lu2Var);
            this.$sseClientId = str;
            this.$promise = promise;
            this.$path = str2;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return RNTareBridge.this.new h(this.$sseClientId, this.$promise, this.$path, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((h) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            try {
                if (i == 0) {
                    r7d.b(obj);
                    sid sidVar = RNTareBridge.this.getSseClientInstances().get(this.$sseClientId);
                    if (sidVar == null) {
                        this.$promise.reject("ERROR", "No matching instance found for client id " + this.$sseClientId);
                        return j6g.a;
                    }
                    rw1 rw1VarA = sidVar.a(this.$path);
                    a aVar = new a(RNTareBridge.this, this.$sseClientId);
                    this.L$0 = null;
                    this.label = 1;
                    Object objE = rw1VarA.e(aVar, this);
                    g13 g13Var = g13.a;
                    if (objE == g13Var) {
                        return g13Var;
                    }
                } else {
                    if (i != 1) {
                        r6.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r7d.b(obj);
                }
            } catch (CancellationException unused) {
                ArrayList arrayList = lz2.a;
                lz2.d(IndeedRNBridgeBaseRNTareBridge.MODULE_NAME, l5.m("SSE Client ", this.$sseClientId, " was cancelled"), false, null);
            } catch (Exception e) {
                ArrayList arrayList2 = lz2.a;
                lz2.b(IndeedRNBridgeBaseRNTareBridge.MODULE_NAME, l5.m("SSE Client ", this.$sseClientId, " exception"), false, e);
            }
            this.$promise.resolve(null);
            return j6g.a;
        }
    }

    public static final class i implements Callback {
        public final /* synthetic */ Promise b;
        public final /* synthetic */ String c;

        @uh3(c = "com.indeed.android.reactnative.rntarebridge.RNTareBridge$startNativeFetch$1$onResponse$1", f = "RNTareBridge.kt", l = {732}, m = "invokeSuspend")
        public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            final /* synthetic */ String $requestId;
            final /* synthetic */ Response $response;
            int label;
            final /* synthetic */ RNTareBridge this$0;

            /* JADX INFO: renamed from: com.indeed.android.reactnative.rntarebridge.RNTareBridge$i$a$a, reason: collision with other inner class name */
            @uh3(c = "com.indeed.android.reactnative.rntarebridge.RNTareBridge$startNativeFetch$1$onResponse$1$1", f = "RNTareBridge.kt", l = {}, m = "invokeSuspend")
            public static final class C0179a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
                final /* synthetic */ String $requestId;
                final /* synthetic */ Response $response;
                int label;
                final /* synthetic */ RNTareBridge this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0179a(Response response, RNTareBridge rNTareBridge, String str, lu2<? super C0179a> lu2Var) {
                    super(2, lu2Var);
                    this.$response = response;
                    this.this$0 = rNTareBridge;
                    this.$requestId = str;
                }

                @Override // defpackage.x81
                public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                    return new C0179a(this.$response, this.this$0, this.$requestId, lu2Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                    return ((C0179a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
                }

                @Override // defpackage.x81
                public final Object invokeSuspend(Object obj) {
                    if (this.label != 0) {
                        r6.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r7d.b(obj);
                    try {
                        ResponseBody responseBody = this.$response.V;
                        RNTareBridge rNTareBridge = this.this$0;
                        if (responseBody == null) {
                            ReactApplicationContext reactApplicationContext = rNTareBridge.reactContext;
                            WritableMap writableMapCreateMap = Arguments.createMap();
                            writableMapCreateMap.putString("requestId", this.$requestId);
                            writableMapCreateMap.putBoolean("done", true);
                            j6g j6gVar = j6g.a;
                            rNTareBridge.sendEvent(reactApplicationContext, "NativeFetchChunk", writableMapCreateMap);
                            return j6g.a;
                        }
                        String str = this.$requestId;
                        try {
                            to1 e = responseBody.getE();
                            while (e.request(1L)) {
                                long jMin = Math.min(8192L, e.f().b);
                                if (jMin == 0) {
                                    break;
                                }
                                String strEncodeToString = Base64.encodeToString(e.l0(jMin), 2);
                                WritableMap writableMapCreateMap2 = Arguments.createMap();
                                writableMapCreateMap2.putString("requestId", str);
                                writableMapCreateMap2.putString("chunk", strEncodeToString);
                                rNTareBridge.sendEvent(rNTareBridge.reactContext, "NativeFetchChunk", writableMapCreateMap2);
                            }
                            j6g j6gVar2 = j6g.a;
                            responseBody.close();
                            RNTareBridge rNTareBridge2 = this.this$0;
                            ReactApplicationContext reactApplicationContext2 = rNTareBridge2.reactContext;
                            WritableMap writableMapCreateMap3 = Arguments.createMap();
                            writableMapCreateMap3.putString("requestId", this.$requestId);
                            writableMapCreateMap3.putBoolean("done", true);
                            rNTareBridge2.sendEvent(reactApplicationContext2, "NativeFetchChunk", writableMapCreateMap3);
                        } finally {
                        }
                    } catch (Exception e2) {
                        ((np7) cr8.p(np7.class)).c(IndeedRNBridgeBaseRNTareBridge.MODULE_NAME, t40.l("startNativeFetch stream read error: ", e2.getClass().getSimpleName(), ": ", e2.getMessage()), false, e2);
                        String simpleName = e2.getClass().getSimpleName();
                        String message = e2.getMessage();
                        if (message == null) {
                            message = "Stream error";
                        }
                        String strM = z3.m(simpleName, ": ", message);
                        RNTareBridge rNTareBridge3 = this.this$0;
                        ReactApplicationContext reactApplicationContext3 = rNTareBridge3.reactContext;
                        WritableMap writableMapCreateMap4 = Arguments.createMap();
                        writableMapCreateMap4.putString("requestId", this.$requestId);
                        writableMapCreateMap4.putString("error", strM);
                        j6g j6gVar3 = j6g.a;
                        rNTareBridge3.sendEvent(reactApplicationContext3, "NativeFetchChunk", writableMapCreateMap4);
                    }
                    return j6g.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Response response, RNTareBridge rNTareBridge, String str, lu2<? super a> lu2Var) {
                super(2, lu2Var);
                this.$response = response;
                this.this$0 = rNTareBridge;
                this.$requestId = str;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new a(this.$response, this.this$0, this.$requestId, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) throws Throwable {
                int i = this.label;
                if (i == 0) {
                    r7d.b(obj);
                    eq3 eq3Var = a74.a;
                    no3 no3Var = no3.c;
                    C0179a c0179a = new C0179a(this.$response, this.this$0, this.$requestId, null);
                    this.label = 1;
                    Object objQ0 = u63.q0(no3Var, c0179a, this);
                    g13 g13Var = g13.a;
                    if (objQ0 == g13Var) {
                        return g13Var;
                    }
                } else {
                    if (i != 1) {
                        r6.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r7d.b(obj);
                }
                return j6g.a;
            }
        }

        public i(Promise promise, String str) {
            this.b = promise;
            this.c = str;
        }

        @Override // okhttp3.Callback
        public final void h(Call call, IOException iOException) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("requestId", this.c);
            String message = iOException.getMessage();
            if (message == null) {
                message = "Network error";
            }
            writableMapCreateMap.putString("error", message);
            RNTareBridge rNTareBridge = RNTareBridge.this;
            rNTareBridge.sendEvent(rNTareBridge.reactContext, "NativeFetchChunk", writableMapCreateMap);
            this.b.reject("NETWORK_ERROR", iOException.getMessage(), iOException);
        }

        @Override // okhttp3.Callback
        public final void p(Call call, Response response) {
            TreeMap treeMapF = response.f.f();
            LinkedHashMap linkedHashMap = new LinkedHashMap(kc9.V(treeMapF.size()));
            for (Map.Entry entry : treeMapF.entrySet()) {
                Object key = entry.getKey();
                String str = (String) z92.Q0((List) entry.getValue());
                if (str == null) {
                    str = "";
                }
                linkedHashMap.put(key, str);
            }
            String string = new JSONObject(linkedHashMap).toString();
            string.getClass();
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putDouble("status", response.d);
            writableMapCreateMap.putString("headersJson", string);
            this.b.resolve(writableMapCreateMap);
            u63.Y(hh1.A(ynb.X), null, null, new a(response, RNTareBridge.this, this.c, null), 3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNTareBridge(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.getClass();
        this.reactContext = reactApplicationContext;
        e eVar = new e(this, new lve("SSE_CLIENT"));
        qt8 qt8Var = qt8.a;
        this.sseOkHttpClient = boa.E(qt8Var, eVar);
        this.nativeFetchClient = boa.E(qt8Var, new f(this, new lve("NATIVE_FETCH_CLIENT")));
        this.sseClientInstances = new ConcurrentHashMap<>();
        this.nonFatalErrorEventFactory = new rja();
    }

    private final void addGenericEventExtraParams(ReadableMap readableMap, lx5.b paramsBuilder) {
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            int i2 = b.a[readableMap.getType(strNextKey).ordinal()];
            if (i2 == 1) {
                paramsBuilder.a(strNextKey, readableMap.getString(strNextKey));
            } else if (i2 == 2) {
                paramsBuilder.b(strNextKey, Long.valueOf((long) readableMap.getDouble(strNextKey)));
            } else if (i2 == 3) {
                paramsBuilder.a(strNextKey, String.valueOf(readableMap.getBoolean(strNextKey)));
            }
        }
    }

    private final Function2<hs7, Object, j6g> createProfilePreferencesOnCompletionPromise(tsb preferenceType, Promise promise) {
        return new lx(this, promise, preferenceType, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [zr4] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.indeed.android.reactnative.rntarebridge.RNTareBridge] */
    /* JADX WARN: Type inference failed for: r6v17, types: [com.facebook.react.bridge.WritableNativeMap, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.facebook.react.bridge.Promise] */
    public static final j6g createProfilePreferencesOnCompletionPromise$lambda$30(RNTareBridge rNTareBridge, Promise promise, tsb tsbVar, hs7 hs7Var, Object obj) {
        WritableNativeMap writableNativeMap;
        ?? arrayList;
        hs7Var.getClass();
        String string = hs7Var.toString();
        if (obj instanceof is7) {
            writableNativeMap = new WritableNativeMap();
            writableNativeMap.putArray("jobTitles", rNTareBridge.readableArrayFromStringList(((is7) obj).a));
        } else if (obj instanceof cs7) {
            writableNativeMap = new WritableNativeMap();
            cs7 cs7Var = (cs7) obj;
            Double d2 = cs7Var.a;
            if (d2 != null) {
                writableNativeMap.putDouble("amount", d2.doubleValue());
            }
            String str = cs7Var.b;
            if (str != null) {
                writableNativeMap.putString("currency", str);
            }
            cs7.a aVar = cs7Var.c;
            if (aVar != null) {
                writableNativeMap.putString("payPeriod", aVar.name());
            }
        } else if (obj instanceof ls7) {
            writableNativeMap = new WritableNativeMap();
            ls7 ls7Var = (ls7) obj;
            List<String> list = ls7Var.a;
            if (list != null) {
                writableNativeMap.putArray("locations", rNTareBridge.readableArrayFromStringList(list));
            }
            ls7.a aVar2 = ls7Var.b;
            if (aVar2 != null) {
                writableNativeMap.putString("option", aVar2.name());
            }
        } else if (obj instanceof xs7) {
            writableNativeMap = new WritableNativeMap();
            Set<xs7.a> set = ((xs7) obj).a;
            if (set != null) {
                Set<xs7.a> set2 = set;
                arrayList = new ArrayList(t92.r0(set2, 10));
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((xs7.a) it.next()).name());
                }
            } else {
                arrayList = zr4.a;
            }
            writableNativeMap.putArray("selected", rNTareBridge.readableArrayFromStringList(arrayList));
        } else if (obj instanceof as7) {
            writableNativeMap = new WritableNativeMap();
            Integer num = ((as7) obj).a;
            if (num != null) {
                writableNativeMap.putInt("timeMinutes", num.intValue());
            }
        } else if (obj instanceof us7) {
            writableNativeMap = new WritableNativeMap();
            Set<us7.a> set3 = ((us7) obj).a;
            if (set3 != null) {
                WritableNativeArray writableNativeArray = new WritableNativeArray();
                for (us7.a aVar3 : set3) {
                    WritableNativeMap writableNativeMap2 = new WritableNativeMap();
                    String str2 = aVar3.a;
                    if (str2 != null) {
                        writableNativeMap2.putString("id", str2);
                    }
                    String str3 = aVar3.b;
                    if (str3 != null) {
                        writableNativeMap2.putString("label", str3);
                    }
                    writableNativeArray.pushMap(writableNativeMap2);
                }
                writableNativeMap.putArray("selected", writableNativeArray);
            }
        } else {
            writableNativeMap = null;
        }
        ?? writableNativeMap3 = new WritableNativeMap();
        writableNativeMap3.putString("result", string);
        WritableNativeMap writableNativeMap4 = new WritableNativeMap();
        writableNativeMap4.putString("type", tsbVar.name());
        if (writableNativeMap != null) {
            writableNativeMap4.putMap("data", writableNativeMap);
        }
        writableNativeMap3.putMap("data", writableNativeMap4);
        try {
            promise.resolve(writableNativeMap3);
        } catch (Exception e2) {
            ((np7) cr8.p(np7.class)).c(IndeedRNBridgeBaseRNTareBridge.MODULE_NAME, "Error resolving promise in profile preferences", false, e2);
        }
        return j6g.a;
    }

    private final Function2<Object, Object, j6g> createResumeFormOnCompletionPromise(Promise promise) {
        return new gt(6, promise, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g createResumeFormOnCompletionPromise$lambda$151(Promise promise, RNTareBridge rNTareBridge, Object obj, Object obj2) {
        String string;
        obj.getClass();
        Enum r0 = obj instanceof Enum ? (Enum) obj : null;
        if (r0 == null || (string = r0.name()) == null) {
            string = obj.toString();
        }
        Pair<String, WritableMap> pairMapResumeFormDataToWritable = obj2 != null ? rNTareBridge.mapResumeFormDataToWritable(obj2) : null;
        String strD = pairMapResumeFormDataToWritable != null ? pairMapResumeFormDataToWritable.d() : null;
        WritableMap writableMapE = pairMapResumeFormDataToWritable != null ? pairMapResumeFormDataToWritable.e() : null;
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("result", string);
        WritableNativeMap writableNativeMap2 = new WritableNativeMap();
        if (strD != null) {
            writableNativeMap2.putString("type", strD);
        }
        if (writableMapE != null) {
            writableNativeMap2.merge(writableMapE);
        }
        writableNativeMap.putMap("data", writableNativeMap2);
        try {
            promise.resolve(writableNativeMap);
        } catch (Exception e2) {
            ArrayList arrayList = lz2.a;
            lz2.b(IndeedRNBridgeBaseRNTareBridge.MODULE_NAME, "Error resolving promise", false, e2);
        }
        return j6g.a;
    }

    private final Boolean getBooleanSafeOrNull(ReadableMap readableMap, String str) {
        if (!readableMap.hasKey(str) || readableMap.isNull(str)) {
            return null;
        }
        return Boolean.valueOf(readableMap.getBoolean(str));
    }

    private final OkHttpClient getNativeFetchClient() {
        return (OkHttpClient) this.nativeFetchClient.getValue();
    }

    private final String getSseBaseUrl() {
        int iOrdinal = ((ep7) cr8.p(ep7.class)).a().ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return "https://employer-notifications-center-webserver.sandbox.qa.indeed.net/";
        }
        if (iOrdinal == 2) {
            return "https://encserv.indeed.com/";
        }
        l.g();
        return null;
    }

    public static /* synthetic */ void getSseClientInstances$annotations() {
    }

    private final OkHttpClient getSseOkHttpClient() {
        return (OkHttpClient) this.sseOkHttpClient.getValue();
    }

    private final String getStringSafeOrNull(ReadableMap readableMap, String str) {
        if (!readableMap.hasKey(str) || readableMap.isNull(str)) {
            return null;
        }
        return readableMap.getString(str);
    }

    private final WritableMap innerGetAccountStatus() {
        bp7 bp7Var = (bp7) cr8.p(bp7.class);
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putBoolean("isLoggedIn", bp7Var.e());
        String id = bp7Var.getId();
        if (id == null || id.length() <= 0) {
            id = null;
        }
        writableNativeMap.putString("id", id);
        String strC = bp7Var.c();
        if (strC == null || strC.length() <= 0) {
            strC = null;
        }
        writableNativeMap.putString("accountId", strC);
        String strB = bp7Var.b();
        if (strB == null || strB.length() <= 0) {
            strB = null;
        }
        writableNativeMap.putString("emailAddress", strB);
        writableNativeMap.putBoolean("isConfirmed", bp7Var.f());
        Date dateA = bp7Var.a();
        if (dateA != null) {
            double time = dateA.getTime();
            Double dValueOf = time > 0.0d ? Double.valueOf(time) : null;
            if (dValueOf != null) {
                writableNativeMap.putDouble("creationDate", dValueOf.doubleValue());
                return writableNativeMap;
            }
        }
        writableNativeMap.putNull("creationDate");
        return writableNativeMap;
    }

    private final WritableMap innerGetAppModel() {
        ep7 ep7Var = (ep7) cr8.p(ep7.class);
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("appVersion", BuildConfig.VERSION_NAME);
        writableNativeMap.putString("buildConfig", ep7Var.c().toString());
        writableNativeMap.putString("buildEnvironment", ep7Var.a().toString());
        WritableNativeMap writableNativeMap2 = new WritableNativeMap();
        writableNativeMap2.putString("languageCode", ep7Var.b().b);
        writableNativeMap2.putString("countryCode", ep7Var.b().a);
        writableNativeMap.putMap("locale", writableNativeMap2);
        return writableNativeMap;
    }

    private final WritableMap innerGetAppSessionInfo() {
        gp7 gp7Var = (gp7) cr8.p(gp7.class);
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("appSessionId", gp7Var.a());
        writableNativeMap.putString(RumSessionScope.RUM_SESSION_ID_BUS_MESSAGE_KEY, gp7Var.c());
        writableNativeMap.putString("installId", gp7Var.h());
        writableNativeMap.putInt("launchCount", gp7Var.f());
        writableNativeMap.putInt("sessionCount", gp7Var.g());
        writableNativeMap.putString("firstInstallVersion", gp7Var.e());
        writableNativeMap.putInt("upgradeCount", gp7Var.b());
        return writableNativeMap;
    }

    private final WritableMap innerGetDeviceModel() {
        pp7 pp7Var = (pp7) cr8.p(pp7.class);
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        String strE = pp7Var.e();
        String str = null;
        if (strE == null || strE.length() <= 0) {
            strE = null;
        }
        writableNativeMap.putString("ctk", strE);
        String strB = pp7Var.b();
        if (strB != null && strB.length() > 0) {
            str = strB;
        }
        writableNativeMap.putString("deviceId", str);
        pp7Var.c();
        writableNativeMap.putString("manufacturer", Build.MANUFACTURER);
        pp7Var.getDeviceModel();
        writableNativeMap.putString("manufacturerModel", Build.PRODUCT);
        writableNativeMap.putString("orientation", serializeOrientation(pp7Var.a()));
        pp7Var.f();
        writableNativeMap.putString("osVersion", Build.VERSION.RELEASE);
        return writableNativeMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g logLegacyGenericEvent$lambda$7(RNTareBridge rNTareBridge, ReadableMap readableMap, lx5.b bVar) {
        bVar.getClass();
        rNTareBridge.addGenericEventExtraParams(readableMap, bVar);
        return j6g.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g logNonFatal$lambda$8(ReadableMap readableMap, mja.a aVar) {
        aVar.getClass();
        Iterator<Map.Entry<String, Object>> entryIterator = readableMap.getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Object> next = entryIterator.next();
            aVar.a(next.getKey(), String.valueOf(next.getValue()));
        }
        return j6g.a;
    }

    private final Pair<String, WritableMap> mapResumeFormDataToWritable(Object data) {
        if (data instanceof vs7) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            vs7 vs7Var = (vs7) data;
            String str = vs7Var.a;
            if (str != null) {
                writableNativeMap.putString("jobTitle", str);
                j6g j6gVar = j6g.a;
            }
            String str2 = vs7Var.b;
            if (str2 != null) {
                writableNativeMap.putString("company", str2);
                j6g j6gVar2 = j6g.a;
            }
            String str3 = vs7Var.c;
            if (str3 != null) {
                writableNativeMap.putString("country", str3);
                j6g j6gVar3 = j6g.a;
            }
            String str4 = vs7Var.d;
            if (str4 != null) {
                writableNativeMap.putString("location", str4);
                j6g j6gVar4 = j6g.a;
            }
            WritableMap writableMapWritableMapFromJSTProfileDateRange = writableMapFromJSTProfileDateRange(vs7Var.e);
            if (writableMapWritableMapFromJSTProfileDateRange != null) {
                writableNativeMap.putMap("dateRange", writableMapWritableMapFromJSTProfileDateRange);
                j6g j6gVar5 = j6g.a;
            }
            String str5 = vs7Var.f;
            if (str5 != null) {
                writableNativeMap.putString("description", str5);
                j6g j6gVar6 = j6g.a;
            }
            return new Pair<>("WorkExperience", writableNativeMap);
        }
        if (data instanceof tr7) {
            WritableNativeMap writableNativeMap2 = new WritableNativeMap();
            tr7 tr7Var = (tr7) data;
            String str6 = tr7Var.a;
            if (str6 != null) {
                writableNativeMap2.putString("levelOfEducation", str6);
                j6g j6gVar7 = j6g.a;
            }
            String str7 = tr7Var.b;
            if (str7 != null) {
                writableNativeMap2.putString("fieldOfStudy", str7);
                j6g j6gVar8 = j6g.a;
            }
            String str8 = tr7Var.c;
            if (str8 != null) {
                writableNativeMap2.putString("school", str8);
                j6g j6gVar9 = j6g.a;
            }
            String str9 = tr7Var.d;
            if (str9 != null) {
                writableNativeMap2.putString("country", str9);
                j6g j6gVar10 = j6g.a;
            }
            String str10 = tr7Var.e;
            if (str10 != null) {
                writableNativeMap2.putString("schoolLocation", str10);
                j6g j6gVar11 = j6g.a;
            }
            WritableMap writableMapWritableMapFromJSTProfileDateRange2 = writableMapFromJSTProfileDateRange(tr7Var.f);
            if (writableMapWritableMapFromJSTProfileDateRange2 != null) {
                writableNativeMap2.putMap("dateRange", writableMapWritableMapFromJSTProfileDateRange2);
                j6g j6gVar12 = j6g.a;
            }
            return new Pair<>("Education", writableNativeMap2);
        }
        if (data instanceof qr7) {
            WritableNativeMap writableNativeMap3 = new WritableNativeMap();
            qr7 qr7Var = (qr7) data;
            String str11 = qr7Var.a;
            if (str11 != null) {
                writableNativeMap3.putString("certificationName", str11);
                j6g j6gVar13 = j6g.a;
            }
            WritableMap writableMapWritableMapFromJSTProfileDateRange3 = writableMapFromJSTProfileDateRange(qr7Var.b);
            if (writableMapWritableMapFromJSTProfileDateRange3 != null) {
                writableNativeMap3.putMap("dateRange", writableMapWritableMapFromJSTProfileDateRange3);
                j6g j6gVar14 = j6g.a;
            }
            String str12 = qr7Var.c;
            if (str12 != null) {
                writableNativeMap3.putString("description", str12);
                j6g j6gVar15 = j6g.a;
            }
            return new Pair<>("Certification", writableNativeMap3);
        }
        if (data instanceof pr7) {
            WritableNativeMap writableNativeMap4 = new WritableNativeMap();
            pr7 pr7Var = (pr7) data;
            String str13 = pr7Var.a;
            if (str13 != null) {
                writableNativeMap4.putString("title", str13);
                j6g j6gVar16 = j6g.a;
            }
            WritableMap writableMapWritableMapFromJSTProfileDate = writableMapFromJSTProfileDate(pr7Var.b);
            if (writableMapWritableMapFromJSTProfileDate != null) {
                writableNativeMap4.putMap("dateAwarded", writableMapWritableMapFromJSTProfileDate);
                j6g j6gVar17 = j6g.a;
            }
            String str14 = pr7Var.c;
            if (str14 != null) {
                writableNativeMap4.putString("description", str14);
                j6g j6gVar18 = j6g.a;
            }
            return new Pair<>("Award", writableNativeMap4);
        }
        if (data instanceof ks7) {
            WritableNativeMap writableNativeMap5 = new WritableNativeMap();
            ks7 ks7Var = (ks7) data;
            String str15 = ks7Var.a;
            if (str15 != null) {
                writableNativeMap5.putString("title", str15);
                j6g j6gVar19 = j6g.a;
            }
            String str16 = ks7Var.b;
            if (str16 != null) {
                writableNativeMap5.putString("url", str16);
                j6g j6gVar20 = j6g.a;
            }
            WritableMap writableMapWritableMapFromJSTProfileDate2 = writableMapFromJSTProfileDate(ks7Var.c);
            if (writableMapWritableMapFromJSTProfileDate2 != null) {
                writableNativeMap5.putMap("datePublished", writableMapWritableMapFromJSTProfileDate2);
                j6g j6gVar21 = j6g.a;
            }
            String str17 = ks7Var.d;
            if (str17 != null) {
                writableNativeMap5.putString("description", str17);
                j6g j6gVar22 = j6g.a;
            }
            return new Pair<>("Publication", writableNativeMap5);
        }
        if (data instanceof xr7) {
            WritableNativeMap writableNativeMap6 = new WritableNativeMap();
            xr7 xr7Var = (xr7) data;
            String str18 = xr7Var.a;
            if (str18 != null) {
                writableNativeMap6.putString("groupTitle", str18);
                j6g j6gVar23 = j6g.a;
            }
            WritableMap writableMapWritableMapFromJSTProfileDateRange4 = writableMapFromJSTProfileDateRange(xr7Var.b);
            if (writableMapWritableMapFromJSTProfileDateRange4 != null) {
                writableNativeMap6.putMap("dateRange", writableMapWritableMapFromJSTProfileDateRange4);
                j6g j6gVar24 = j6g.a;
            }
            String str19 = xr7Var.c;
            if (str19 != null) {
                writableNativeMap6.putString("description", str19);
                j6g j6gVar25 = j6g.a;
            }
            return new Pair<>("Group", writableNativeMap6);
        }
        if (data instanceof zr7) {
            WritableNativeMap writableNativeMap7 = new WritableNativeMap();
            writableNativeMap7.putString("url", ((zr7) data).a);
            return new Pair<>("Link", writableNativeMap7);
        }
        if (data instanceof bs7) {
            WritableNativeMap writableNativeMap8 = new WritableNativeMap();
            bs7 bs7Var = (bs7) data;
            String str20 = bs7Var.a;
            if (str20 != null) {
                writableNativeMap8.putString("countryOfService", str20);
                j6g j6gVar26 = j6g.a;
            }
            String str21 = bs7Var.b;
            if (str21 != null) {
                writableNativeMap8.putString("branch", str21);
                j6g j6gVar27 = j6g.a;
            }
            String str22 = bs7Var.c;
            if (str22 != null) {
                writableNativeMap8.putString("rank", str22);
                j6g j6gVar28 = j6g.a;
            }
            WritableMap writableMapWritableMapFromJSTProfileDateRange5 = writableMapFromJSTProfileDateRange(bs7Var.d);
            if (writableMapWritableMapFromJSTProfileDateRange5 != null) {
                writableNativeMap8.putMap("dateRange", writableMapWritableMapFromJSTProfileDateRange5);
                j6g j6gVar29 = j6g.a;
            }
            String str23 = bs7Var.e;
            if (str23 != null) {
                writableNativeMap8.putString("description", str23);
                j6g j6gVar30 = j6g.a;
            }
            return new Pair<>("Military", writableNativeMap8);
        }
        if (data instanceof or7) {
            WritableNativeMap writableNativeMap9 = new WritableNativeMap();
            String str24 = ((or7) data).a;
            if (str24 != null) {
                writableNativeMap9.putString("additionalInfo", str24);
                j6g j6gVar31 = j6g.a;
            }
            return new Pair<>("AdditionalInfo", writableNativeMap9);
        }
        WritableNativeMap writableNativeMap10 = null;
        if (data instanceof qs7) {
            WritableNativeMap writableNativeMap11 = new WritableNativeMap();
            qs7 qs7Var = (qs7) data;
            writableNativeMap11.putString("text", qs7Var.a);
            if (qs7Var.b != null) {
                writableNativeMap11.putDouble("experience", r1.intValue());
                j6g j6gVar32 = j6g.a;
            }
            ts7 ts7Var = qs7Var.c;
            if (ts7Var != null) {
                writableNativeMap10 = new WritableNativeMap();
                writableNativeMap10.putString("label", ts7Var.a);
                writableNativeMap10.putString("suid", ts7Var.b);
                String str25 = ts7Var.c;
                if (str25 != null) {
                    writableNativeMap10.putString("type", str25);
                    j6g j6gVar33 = j6g.a;
                }
                List<String> list = ts7Var.d;
                if (list != null) {
                    writableNativeMap10.putArray("sectionIds", readableArrayFromStringList(list));
                    j6g j6gVar34 = j6g.a;
                }
                List<String> list2 = ts7Var.e;
                if (list2 != null) {
                    writableNativeMap10.putArray(RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, readableArrayFromStringList(list2));
                    j6g j6gVar35 = j6g.a;
                }
            }
            writableNativeMap11.putMap("taxonomyConceptTitle", writableNativeMap10);
            return new Pair<>("Skill", writableNativeMap11);
        }
        if (data instanceof List) {
            if (!((Collection) data).isEmpty()) {
                List<qs7> list3 = (List) data;
                if (z92.O0(list3) instanceof qs7) {
                    WritableNativeArray writableNativeArray = new WritableNativeArray();
                    for (qs7 qs7Var2 : list3) {
                        WritableNativeMap writableNativeMap12 = new WritableNativeMap();
                        writableNativeMap12.putString("text", qs7Var2.a);
                        if (qs7Var2.b != null) {
                            writableNativeMap12.putDouble("experience", r2.intValue());
                            j6g j6gVar36 = j6g.a;
                        }
                        if (qs7Var2.c != null) {
                            j6g j6gVar37 = j6g.a;
                        }
                        writableNativeArray.pushMap(writableNativeMap12);
                    }
                    WritableNativeMap writableNativeMap13 = new WritableNativeMap();
                    writableNativeMap13.putArray("skills", writableNativeArray);
                    return new Pair<>("Skills", writableNativeMap13);
                }
            }
            return null;
        }
        if (data instanceof yr7) {
            WritableNativeMap writableNativeMap14 = new WritableNativeMap();
            yr7 yr7Var = (yr7) data;
            String str26 = yr7Var.b;
            if (str26 != null) {
                writableNativeMap14.putString("language", str26);
                j6g j6gVar38 = j6g.a;
            }
            String str27 = yr7Var.c;
            if (str27 != null) {
                writableNativeMap14.putString("languageTaxonomyId", str27);
                j6g j6gVar39 = j6g.a;
            }
            String str28 = yr7Var.d;
            if (str28 != null) {
                writableNativeMap14.putString("proficiency", str28);
                j6g j6gVar40 = j6g.a;
            }
            String str29 = yr7Var.e;
            if (str29 != null) {
                writableNativeMap14.putString("proficiencyTaxonomyId", str29);
                j6g j6gVar41 = j6g.a;
            }
            return new Pair<>("Language", writableNativeMap14);
        }
        if (data instanceof ss7) {
            WritableNativeMap writableNativeMap15 = new WritableNativeMap();
            String str30 = ((ss7) data).a;
            if (str30 != null) {
                writableNativeMap15.putString("summary", str30);
                j6g j6gVar42 = j6g.a;
            }
            return new Pair<>("Summary", writableNativeMap15);
        }
        if (!(data instanceof fs7)) {
            return null;
        }
        WritableNativeMap writableNativeMap16 = new WritableNativeMap();
        fs7 fs7Var = (fs7) data;
        String str31 = fs7Var.a;
        if (str31 != null) {
            writableNativeMap16.putString("firstName", str31);
            j6g j6gVar43 = j6g.a;
        }
        String str32 = fs7Var.b;
        if (str32 != null) {
            writableNativeMap16.putString("lastName", str32);
            j6g j6gVar44 = j6g.a;
        }
        String str33 = fs7Var.c;
        if (str33 != null) {
            writableNativeMap16.putString("phoneNumber", str33);
            j6g j6gVar45 = j6g.a;
        }
        String str34 = fs7Var.d;
        if (str34 != null) {
            writableNativeMap16.putString("location", str34);
            j6g j6gVar46 = j6g.a;
        }
        String str35 = fs7Var.e;
        if (str35 != null) {
            writableNativeMap16.putString("country", str35);
            j6g j6gVar47 = j6g.a;
        }
        String str36 = fs7Var.f;
        if (str36 != null) {
            writableNativeMap16.putString("streetAddress", str36);
            j6g j6gVar48 = j6g.a;
        }
        String str37 = fs7Var.g;
        if (str37 != null) {
            writableNativeMap16.putString("postalCode", str37);
            j6g j6gVar49 = j6g.a;
        }
        return new Pair<>("PersonalInfo", writableNativeMap16);
    }

    private static final j6g mapResumeFormDataToWritable$lambda$98$lambda$97$lambda$96$lambda$95$lambda$94(WritableNativeMap writableNativeMap, ts7 ts7Var, RNTareBridge rNTareBridge) {
        WritableNativeMap writableNativeMap2 = new WritableNativeMap();
        writableNativeMap2.putString("label", ts7Var.a);
        writableNativeMap2.putString("suid", ts7Var.b);
        String str = ts7Var.c;
        if (str != null) {
            writableNativeMap2.putString("type", str);
        }
        List<String> list = ts7Var.d;
        if (list != null) {
            writableNativeMap2.putArray("sectionIds", rNTareBridge.readableArrayFromStringList(list));
        }
        List<String> list2 = ts7Var.e;
        if (list2 != null) {
            writableNativeMap2.putArray(RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, rNTareBridge.readableArrayFromStringList(list2));
        }
        writableNativeMap.putMap("taxonomyConceptTitle", writableNativeMap2);
        return j6g.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onNavItemClick(String callbackId) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("callbackId", callbackId);
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("NavBarItemClick", writableMapCreateMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g openLoginModal$lambda$153$lambda$152(Promise promise, oq7.g gVar) {
        gVar.getClass();
        int iOrdinal = gVar.b.ordinal();
        if (iOrdinal == 0) {
            promise.resolve("SUCCESS");
        } else {
            if (iOrdinal != 1) {
                l.g();
                return null;
            }
            promise.reject("CANCEL", "User canceled login");
        }
        return j6g.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g openShareSheet$lambda$10(Promise promise, nt7 nt7Var) {
        nt7Var.getClass();
        promise.resolve(null);
        return j6g.a;
    }

    private final qs7 parseSkillFromMap(ReadableMap skillMap) {
        String string = skillMap.getString("text");
        if (string == null) {
            string = "";
        }
        ts7 ts7Var = null;
        Integer numValueOf = (skillMap.hasKey("experience") && skillMap.getType("experience") == ReadableType.Number) ? Integer.valueOf((int) skillMap.getDouble("experience")) : null;
        ReadableMap map = skillMap.getMap("taxonomyConceptTitle");
        if (map != null) {
            String string2 = map.getString("label");
            String str = string2 == null ? "" : string2;
            String string3 = map.getString("suid");
            String str2 = string3 == null ? "" : string3;
            String string4 = map.getString("type");
            ReadableArray array = map.getArray("sectionIds");
            List<String> list = array != null ? readableArrayToStringList(array) : null;
            ReadableArray array2 = map.getArray(RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX);
            ts7Var = new ts7(list, array2 != null ? readableArrayToStringList(array2) : null, str, str2, string4);
        }
        return new qs7(string, numValueOf, ts7Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void presentProfilePreferences$lambda$12(FragmentManager fragmentManager, String str, gs7 gs7Var) {
        ((vr7) cr8.p(vr7.class)).a(fragmentManager, gs7Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void presentResumeMainSectionForm$lambda$13(FragmentManager fragmentManager, String str, RNTareBridge rNTareBridge, ns7 ns7Var, ur7 ur7Var) {
        vr7 vr7Var = (vr7) cr8.p(vr7.class);
        if (str == null) {
            str = rNTareBridge.getName();
        }
        vr7Var.e(fragmentManager, str, ns7Var, ur7Var);
        ArrayList arrayList = lz2.a;
        Log.d(IndeedRNBridgeBaseRNTareBridge.MODULE_NAME, "Resume main section form presentation queued on UI thread", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void presentResumeOtherSectionForm$lambda$14(FragmentManager fragmentManager, String str, RNTareBridge rNTareBridge, os7 os7Var, ur7 ur7Var) {
        vr7 vr7Var = (vr7) cr8.p(vr7.class);
        if (str == null) {
            rNTareBridge.getName();
        }
        vr7Var.b(fragmentManager, os7Var, ur7Var);
    }

    private final ReadableArray readableArrayFromStringList(List<String> stringList) {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        Iterator<T> it = stringList.iterator();
        while (it.hasNext()) {
            writableNativeArray.pushString((String) it.next());
        }
        return writableNativeArray;
    }

    private final List<String> readableArrayToStringList(ReadableArray readableArray) {
        String string;
        ArrayList arrayList = new ArrayList();
        int size = readableArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (readableArray.getType(i2) == ReadableType.String && (string = readableArray.getString(i2)) != null) {
                arrayList.add(string);
            }
        }
        return arrayList;
    }

    private final Function1<hr7, j6g> readableMapToJSTParamsBuilder(ReadableMap map) {
        if (map == null) {
            return null;
        }
        return new se(map, 13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g readableMapToJSTParamsBuilder$lambda$15(ReadableMap readableMap, hr7 hr7Var) {
        hr7Var.getClass();
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            int i2 = b.a[readableMap.getType(strNextKey).ordinal()];
            if (i2 == 1) {
                hr7Var.a(strNextKey, readableMap.getString(strNextKey));
            } else if (i2 == 2) {
                hr7Var.b(strNextKey, Long.valueOf((long) readableMap.getDouble(strNextKey)));
            } else if (i2 == 3) {
                hr7Var.d(strNextKey, Boolean.valueOf(readableMap.getBoolean(strNextKey)));
            }
        }
        return j6g.a;
    }

    private final rr7 readableMapToJSTProfileDate(ReadableMap map) {
        ds7 ds7Var;
        Integer numValueOf = null;
        if (map == null) {
            return null;
        }
        String string = map.getString("month");
        if (string != null) {
            ds7[] ds7VarArrValues = ds7.values();
            int length = ds7VarArrValues.length;
            for (int i2 = 0; i2 < length; i2++) {
                ds7Var = ds7VarArrValues[i2];
                if (wl7.b(ds7Var.name(), string)) {
                    break;
                }
            }
            ds7Var = null;
        } else {
            ds7Var = null;
        }
        if (map.hasKey("year") && map.getType("year") == ReadableType.Number) {
            numValueOf = Integer.valueOf((int) map.getDouble("year"));
        }
        return new rr7(ds7Var, numValueOf);
    }

    private final sr7 readableMapToJSTProfileDateRange(ReadableMap map) {
        Boolean boolValueOf = null;
        if (map == null) {
            return null;
        }
        rr7 rr7Var = readableMapToJSTProfileDate(map.getMap("fromDate"));
        if (map.hasKey("isCurrent") && map.getType("isCurrent") == ReadableType.Boolean) {
            boolValueOf = Boolean.valueOf(map.getBoolean("isCurrent"));
        }
        return new sr7(rr7Var, boolValueOf, readableMapToJSTProfileDate(map.getMap("toDate")));
    }

    private final gs7 readableMapToJSTProfilePreference(tsb preferenceType, ReadableMap formPrefillData, Promise promise) {
        ReadableArray array;
        List<String> list;
        ReadableArray array2;
        xs7.a aVar;
        ReadableArray array3;
        int iOrdinal = preferenceType.ordinal();
        is7 is7Var = null;
        us7Var = null;
        us7Var = null;
        us7 us7Var = null;
        xs7Var = null;
        xs7 xs7Var = null;
        aVar = null;
        ls7.a aVar2 = null;
        ls7 ls7Var = null;
        aVar = null;
        cs7.a aVar3 = null;
        cs7 cs7Var = null;
        is7Var = null;
        is7Var = null;
        if (iOrdinal == 0) {
            if (formPrefillData != null && (array = formPrefillData.getArray("jobTitles")) != null && (list = readableArrayToStringList(array)) != null) {
                is7Var = new is7(list);
            }
            return new gs7.c(is7Var, createProfilePreferencesOnCompletionPromise(preferenceType, promise));
        }
        int i2 = 0;
        if (iOrdinal == 1) {
            if (formPrefillData != null) {
                double d2 = formPrefillData.getDouble("amount");
                String string = formPrefillData.getString("currency");
                String string2 = formPrefillData.getString("payPeriod");
                if (string2 != null) {
                    cs7.a[] aVarArrValues = cs7.a.values();
                    int length = aVarArrValues.length;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        }
                        cs7.a aVar4 = aVarArrValues[i2];
                        if (wl7.b(aVar4.name(), string2)) {
                            aVar3 = aVar4;
                            break;
                        }
                        i2++;
                    }
                }
                cs7Var = new cs7(Double.valueOf(d2), string, aVar3);
            }
            return new gs7.b(cs7Var, createProfilePreferencesOnCompletionPromise(preferenceType, promise));
        }
        if (iOrdinal == 2) {
            if (formPrefillData != null) {
                ReadableArray array4 = formPrefillData.getArray("locations");
                List<String> list2 = array4 != null ? readableArrayToStringList(array4) : null;
                String string3 = formPrefillData.getString("option");
                if (string3 != null) {
                    ls7.a[] aVarArrValues2 = ls7.a.values();
                    int length2 = aVarArrValues2.length;
                    while (true) {
                        if (i2 >= length2) {
                            break;
                        }
                        ls7.a aVar5 = aVarArrValues2[i2];
                        if (wl7.b(aVar5.name(), string3)) {
                            aVar2 = aVar5;
                            break;
                        }
                        i2++;
                    }
                }
                ls7Var = new ls7(list2, aVar2);
            }
            return new gs7.e(ls7Var, createProfilePreferencesOnCompletionPromise(preferenceType, promise));
        }
        if (iOrdinal != 3) {
            if (iOrdinal == 4) {
                return new gs7.a(formPrefillData != null ? new as7(formPrefillData.hasKey("timeMinutes") ? Integer.valueOf(formPrefillData.getInt("timeMinutes")) : null) : null, createProfilePreferencesOnCompletionPromise(preferenceType, promise));
            }
            if (iOrdinal != 5) {
                l.g();
                return null;
            }
            if (formPrefillData != null && (array3 = formPrefillData.getArray("selected")) != null) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                int size = array3.size();
                while (i2 < size) {
                    ReadableMap map = array3.getMap(i2);
                    if (map != null) {
                        linkedHashSet.add(new us7.a(map.getString("id"), map.getString("label")));
                    }
                    i2++;
                }
                if (!linkedHashSet.isEmpty()) {
                    us7Var = new us7(linkedHashSet);
                }
            }
            return new gs7.g(us7Var, createProfilePreferencesOnCompletionPromise(preferenceType, promise));
        }
        if (formPrefillData != null && (array2 = formPrefillData.getArray("selected")) != null) {
            List<String> list3 = readableArrayToStringList(array2);
            ArrayList arrayList = new ArrayList();
            for (String str : list3) {
                xs7.a[] aVarArrValues3 = xs7.a.values();
                int length3 = aVarArrValues3.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length3) {
                        aVar = null;
                        break;
                    }
                    aVar = aVarArrValues3[i3];
                    if (wl7.b(aVar.name(), str)) {
                        break;
                    }
                    i3++;
                }
                if (aVar != null) {
                    arrayList.add(aVar);
                }
            }
            xs7Var = new xs7(z92.E1(arrayList));
        }
        return new gs7.f(xs7Var, createProfilePreferencesOnCompletionPromise(preferenceType, promise));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final ns7 readableMapToJSTProfileResumeMainSection(String sectionType, ReadableMap formPrefillData, Promise promise) {
        String string;
        zr7Var = null;
        zr7 zr7Var = null;
        switch (sectionType.hashCode()) {
            case -1351481043:
                if (sectionType.equals("Military")) {
                    return new ns7.f(formPrefillData != null ? new bs7(formPrefillData.getString("countryOfService"), formPrefillData.getString("branch"), formPrefillData.getString("rank"), readableMapToJSTProfileDateRange(formPrefillData.getMap("dateRange")), formPrefillData.getString("description")) : null, createResumeFormOnCompletionPromise(promise));
                }
                return null;
            case 2368538:
                if (sectionType.equals("Link")) {
                    if (formPrefillData != null && (string = formPrefillData.getString("url")) != null) {
                        zr7Var = new zr7(string);
                    }
                    return new ns7.e(zr7Var, createResumeFormOnCompletionPromise(promise));
                }
                return null;
            case 63670845:
                if (sectionType.equals("Award")) {
                    return new ns7.a(formPrefillData != null ? new pr7(formPrefillData.getString("title"), readableMapToJSTProfileDate(formPrefillData.getMap("dateAwarded")), formPrefillData.getString("description")) : null, createResumeFormOnCompletionPromise(promise));
                }
                return null;
            case 69076575:
                if (sectionType.equals("Group")) {
                    return new ns7.d(formPrefillData != null ? new xr7(formPrefillData.getString("groupTitle"), readableMapToJSTProfileDateRange(formPrefillData.getMap("dateRange")), formPrefillData.getString("description")) : null, createResumeFormOnCompletionPromise(promise));
                }
                return null;
            case 154436762:
                if (sectionType.equals("Certification")) {
                    return new ns7.b(formPrefillData != null ? new qr7(formPrefillData.getString("certificationName"), readableMapToJSTProfileDateRange(formPrefillData.getMap("dateRange")), formPrefillData.getString("description")) : null, createResumeFormOnCompletionPromise(promise));
                }
                return null;
            case 589646348:
                if (sectionType.equals("Publication")) {
                    return new ns7.h(formPrefillData != null ? new ks7(formPrefillData.getString("title"), formPrefillData.getString("url"), readableMapToJSTProfileDate(formPrefillData.getMap("datePublished")), formPrefillData.getString("description")) : null, createResumeFormOnCompletionPromise(promise));
                }
                return null;
            case 1201268603:
                if (sectionType.equals("WorkExperience")) {
                    return new ns7.i(formPrefillData != null ? new vs7(readableMapToJSTProfileDateRange(formPrefillData.getMap("dateRange")), formPrefillData.getString("jobTitle"), formPrefillData.getString("company"), formPrefillData.getString("country"), formPrefillData.getString("location"), formPrefillData.getString("description")) : null, createResumeFormOnCompletionPromise(promise));
                }
                return null;
            case 1713211272:
                if (sectionType.equals("Education")) {
                    return new ns7.c(formPrefillData != null ? new tr7(readableMapToJSTProfileDateRange(formPrefillData.getMap("dateRange")), formPrefillData.getString("levelOfEducation"), formPrefillData.getString("fieldOfStudy"), formPrefillData.getString("school"), formPrefillData.getString("country"), formPrefillData.getString("schoolLocation")) : null, createResumeFormOnCompletionPromise(promise));
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final os7 readableMapToJSTProfileResumeOtherSection(String sectionType, ReadableMap formPrefillData, Promise promise) {
        ReadableArray array;
        qs7 skillFromMap;
        arrayList = null;
        ArrayList arrayList = null;
        switch (sectionType.hashCode()) {
            case -1976290923:
                if (sectionType.equals("AdditionalInfo")) {
                    return new os7.a(formPrefillData != null ? new or7(formPrefillData.getString("additionalInfo")) : null, createResumeFormOnCompletionPromise(promise));
                }
                return null;
            case -1816695710:
                if (sectionType.equals("Skills")) {
                    if (formPrefillData != null && (array = formPrefillData.getArray("skills")) != null) {
                        arrayList = new ArrayList();
                        int size = array.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            ReadableMap map = array.getMap(i2);
                            if (map != null && (skillFromMap = parseSkillFromMap(map)) != null) {
                                arrayList.add(skillFromMap);
                            }
                        }
                    }
                    return new os7.f(arrayList, createResumeFormOnCompletionPromise(promise));
                }
                return null;
            case -1548945544:
                if (sectionType.equals("Language")) {
                    return new os7.b(formPrefillData != null ? new yr7(formPrefillData.getString("id"), formPrefillData.getString("language"), formPrefillData.getString("languageTaxonomyId"), formPrefillData.getString("proficiency"), formPrefillData.getString("proficiencyTaxonomyId")) : null, createResumeFormOnCompletionPromise(promise));
                }
                return null;
            case -192987258:
                if (sectionType.equals("Summary")) {
                    return new os7.g(new ss7(formPrefillData != null ? formPrefillData.getString("summary") : null), createResumeFormOnCompletionPromise(promise));
                }
                return null;
            case -94686418:
                if (sectionType.equals("PersonalInfo")) {
                    return new os7.c(formPrefillData != null ? new fs7(formPrefillData.getString("firstName"), formPrefillData.getString("lastName"), formPrefillData.getString("phoneNumber"), formPrefillData.getString("location"), formPrefillData.getString("country"), formPrefillData.getString("streetAddress"), formPrefillData.getString("postalCode")) : null, createResumeFormOnCompletionPromise(promise));
                }
                return null;
            case 79944241:
                if (sectionType.equals("Skill")) {
                    return new os7.d(formPrefillData != null ? parseSkillFromMap(formPrefillData) : null, createResumeFormOnCompletionPromise(promise));
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendEvent(ReactContext reactContext, String eventName, WritableMap params) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(eventName, params);
    }

    private final String serializeOrientation(gr7 orientation) {
        int iOrdinal = orientation.ordinal();
        return iOrdinal != 0 ? iOrdinal != 1 ? "UNDEFINED" : "LANDSCAPE" : "PORTRAIT";
    }

    private final WritableMap writableMapFromJSTProfileDate(rr7 date) {
        if (date == null) {
            return null;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        ds7 ds7Var = date.a;
        if (ds7Var != null) {
            writableNativeMap.putString("month", ds7Var.name());
        }
        if (date.b != null) {
            writableNativeMap.putDouble("year", r4.intValue());
        }
        return writableNativeMap;
    }

    private final WritableMap writableMapFromJSTProfileDateRange(sr7 range) {
        if (range == null) {
            return null;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        WritableMap writableMapWritableMapFromJSTProfileDate = writableMapFromJSTProfileDate(range.a);
        if (writableMapWritableMapFromJSTProfileDate != null) {
            writableNativeMap.putMap("fromDate", writableMapWritableMapFromJSTProfileDate);
        }
        Boolean bool = range.b;
        if (bool != null) {
            writableNativeMap.putBoolean("isCurrent", bool.booleanValue());
        }
        WritableMap writableMapWritableMapFromJSTProfileDate2 = writableMapFromJSTProfileDate(range.c);
        if (writableMapWritableMapFromJSTProfileDate2 != null) {
            writableNativeMap.putMap("toDate", writableMapWritableMapFromJSTProfileDate2);
        }
        return writableNativeMap;
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNTareBridge
    @ReactMethod
    public void addListener(String eventName) {
        eventName.getClass();
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNTareBridge
    @ReactMethod
    public void clearLocalPrefsNamespace(String namespace, Promise promise) {
        namespace.getClass();
        promise.getClass();
        ((kq7) cr8.p(kq7.class)).g(namespace);
        promise.resolve(null);
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNTareBridge
    @ReactMethod
    public void copyToClipboard(String text, Promise promise) {
        text.getClass();
        promise.getClass();
        try {
            ((lp7) cr8.p(lp7.class)).a(text);
            promise.resolve(null);
        } catch (Exception e2) {
            ArrayList arrayList = lz2.a;
            lz2.b(IndeedRNBridgeBaseRNTareBridge.MODULE_NAME, "Error copying to clipboard", false, e2);
            promise.reject("COPY_TO_CLIPBOARD_ERROR", "Failed to copy text to clipboard: " + e2.getMessage(), e2);
        }
    }

    public final String generateInstanceUuid(a bridgedClassInstance) {
        bridgedClassInstance.getClass();
        return bridgedClassInstance.a() + "-" + UUID.randomUUID();
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNTareBridge
    @ReactMethod
    public void getAccountStatus(Promise promise) {
        promise.getClass();
        promise.resolve(innerGetAccountStatus());
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNTareBridge
    @ReactMethod
    public void getAppModel(Promise promise) {
        promise.getClass();
        promise.resolve(innerGetAppModel());
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNTareBridge
    @ReactMethod
    public void getAppSessionInfo(Promise promise) {
        promise.getClass();
        promise.resolve(innerGetAppSessionInfo());
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNTareBridge
    @ReactMethod
    public void getCachedViewJobFeed(String homepageTk, Promise promise) {
        homepageTk.getClass();
        promise.getClass();
        JSTCacheValue jSTCacheValueA = ((ep7) cr8.p(ep7.class)).d().a(homepageTk);
        ViewJobFeed viewJobFeed = jSTCacheValueA instanceof ViewJobFeed ? (ViewJobFeed) jSTCacheValueA : null;
        if (viewJobFeed == null) {
            promise.resolve(null);
            return;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        String str = viewJobFeed.a;
        if (str != null) {
            writableNativeMap.putString("homepageTk", str);
        }
        String str2 = viewJobFeed.b;
        if (str2 != null) {
            writableNativeMap.putString("jobFeedData", str2);
        }
        String str3 = viewJobFeed.c;
        if (str3 != null) {
            writableNativeMap.putString("lastViewedJobSection", str3);
        }
        String str4 = viewJobFeed.d;
        if (str4 != null) {
            writableNativeMap.putString("lastViewedJobKey", str4);
        }
        promise.resolve(writableNativeMap);
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNTareBridge
    @ReactMethod
    public void getCachedViewJobHint(String key, Promise promise) {
        key.getClass();
        promise.getClass();
        JSTCacheValue jSTCacheValueA = ((ep7) cr8.p(ep7.class)).d().a(key);
        if (jSTCacheValueA == null) {
            promise.resolve(null);
            return;
        }
        ViewJobHint viewJobHint = jSTCacheValueA instanceof ViewJobHint ? (ViewJobHint) jSTCacheValueA : null;
        if (viewJobHint == null) {
            promise.resolve(null);
            return;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        Boolean bool = viewJobHint.a;
        if (bool != null) {
            writableNativeMap.putBoolean("isSaved", bool.booleanValue());
        }
        String str = viewJobHint.b;
        if (str != null) {
            writableNativeMap.putString("title", str);
        }
        Boolean bool2 = viewJobHint.c;
        if (bool2 != null) {
            writableNativeMap.putBoolean("isFromAce", bool2.booleanValue());
        }
        String str2 = viewJobHint.d;
        if (str2 != null) {
            writableNativeMap.putString("jobResultTrackingKey", str2);
        }
        Boolean bool3 = viewJobHint.e;
        if (bool3 != null) {
            writableNativeMap.putBoolean("isDisliked", bool3.booleanValue());
        }
        String str3 = viewJobHint.f;
        if (str3 != null) {
            writableNativeMap.putString("matchFactor", str3);
        }
        promise.resolve(writableNativeMap);
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNTareBridge
    @ReactMethod
    public void getDeviceModel(Promise promise) {
        promise.getClass();
        promise.resolve(innerGetDeviceModel());
    }

    @Override // defpackage.xh8
    public vh8 getKoin() {
        return xh8.a.a();
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNTareBridge
    @ReactMethod
    public void getLocalPrefsBoolean(String namespace, String key, Boolean defaultValue, Promise promise) {
        namespace.getClass();
        key.getClass();
        promise.getClass();
        promise.resolve(Boolean.valueOf(((kq7) cr8.p(kq7.class)).j(namespace, key, defaultValue != null ? defaultValue.booleanValue() : false)));
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNTareBridge
    @ReactMethod
    public void getLocalPrefsInt(String namespace, String key, Double defaultValue, Promise promise) {
        namespace.getClass();
        key.getClass();
        promise.getClass();
        promise.resolve(((kq7) cr8.p(kq7.class)).c(namespace, defaultValue != null ? Integer.valueOf((int) defaultValue.doubleValue()) : null, key));
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNTareBridge
    @ReactMethod
    public void getLocalPrefsLong(String namespace, String key, Double defaultValue, Promise promise) {
        namespace.getClass();
        key.getClass();
        promise.getClass();
        promise.resolve(((kq7) cr8.p(kq7.class)).h(defaultValue != null ? Long.valueOf((long) defaultValue.doubleValue()) : null, namespace, key) != null ? Double.valueOf(r3.longValue()) : null);
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNTareBridge
    @ReactMethod
    public void getLocalPrefsString(String namespace, String key, String defaultValue, Promise promise) {
        namespace.getClass();
        key.getClass();
        promise.getClass();
        String strB = ((kq7) cr8.p(kq7.class)).b(namespace, key, defaultValue);
        if (strB == null || strB.length() == 0) {
            strB = null;
        }
        promise.resolve(strB);
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNTareBridge
    @ReactMethod
    public void getProctorAllocation(String testName, Promise promise) {
        testName.getClass();
        promise.getClass();
        promise.resolve(hhc.a(((kr7) cr8.p(kr7.class)).e(testName), testName));
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNTareBridge
    @ReactMethod
    public void getProctorAllocations(ReadableArray testNames, Promise promise) {
        testNames.getClass();
        promise.getClass();
        List<String> list = readableArrayToStringList(testNames);
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.getClass();
        for (String str : list) {
            writableMapCreateMap.putMap(str, hhc.a(((kr7) cr8.p(kr7.class)).e(str), str));
        }
        promise.resolve(writableMapCreateMap);
    }

    public final ConcurrentHashMap<String, sid> getSseClientInstances() {
        return this.sseClientInstances;
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNTareBridge
    @ReactMethod
    public void logElementView(String screenName, String elementName, String elementType, ReadableArray tags, ReadableMap extraParams, Promise promise) {
        screenName.getClass();
        elementName.getClass();
        elementType.getClass();
        tags.getClass();
        extraParams.getClass();
        promise.getClass();
        try {
            ((tp7) cr8.p(tp7.class)).b(new sp7.c(screenName, elementName, sp7.c.a.valueOf(elementType), readableArrayToStringList(tags), readableMapToJSTParamsBuilder(extraParams)));
            promise.resolve(null);
        } catch (IllegalArgumentException unused) {
            ArrayList arrayList = lz2.a;
            lz2.c(IndeedRNBridgeBaseRNTareBridge.MODULE_NAME, "Unknown element type: ".concat(elementType), false, null, 12);
            promise.reject("ERROR", "Unknown element type: ".concat(elementType));
        }
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNTareBridge
    @ReactMethod
    public void logLegacyGenericEvent(String eventName, String eventType, ReadableArray tags, ReadableMap extraParams, Promise promise) {
        eventName.getClass();
        eventType.getClass();
        tags.getClass();
        extraParams.getClass();
        promise.getClass();
        ((tp7) cr8.p(tp7.class)).a(new lx5(eventName, eventType, eventName, 1, readableArrayToStringList(tags), new wi1(3, this, extraParams)));
        promise.resolve(null);
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNTareBridge
    @ReactMethod
    public void logNonFatal(String message, double errCode, String errDomain, ReadableMap otherUserInfo, Promise promise) {
        message.getClass();
        errDomain.getClass();
        otherUserInfo.getClass();
        promise.getClass();
        rja rjaVar = this.nonFatalErrorEventFactory;
        a3 a3Var = new a3(otherUserInfo, 18);
        rjaVar.getClass();
        ((tp7) cr8.p(tp7.class)).f(new mja("non_fatal_error", message, "", (long) errCode, errDomain, a3Var));
        promise.resolve(null);
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNTareBridge
    @ReactMethod
    public void logRNBridgeInternal(ReadableMap event, ReadableMap metadata, Promise promise) {
        aq7 aq7Var;
        event.getClass();
        promise.getClass();
        JsonObject jsonObjectB = mqc.b(event);
        if (metadata != null) {
            aq7Var = (aq7) mqc.a.d(aq7.Companion.serializer(), mqc.b(metadata));
        } else {
            aq7Var = null;
        }
        ((tp7) cr8.p(tp7.class)).e(jsonObjectB, aq7Var);
        promise.resolve(null);
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNTareBridge
    @ReactMethod
    public void logScreenView(String screenName, Promise promise) {
        screenName.getClass();
        promise.getClass();
        q6.n(screenName, null, null, 6, (tp7) cr8.p(tp7.class));
        promise.resolve(null);
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNTareBridge
    @ReactMethod
    public void logScreenViewWithExtraParams(String screenName, ReadableArray tags, ReadableMap extraParams, Promise promise) {
        screenName.getClass();
        tags.getClass();
        extraParams.getClass();
        promise.getClass();
        ((tp7) cr8.p(tp7.class)).b(new sp7.f(screenName, readableArrayToStringList(tags), readableMapToJSTParamsBuilder(extraParams)));
        promise.resolve(null);
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNTareBridge
    @ReactMethod
    public void logTapButton(String screenName, String elementName, Promise promise) {
        screenName.getClass();
        elementName.getClass();
        promise.getClass();
        ((tp7) cr8.p(tp7.class)).b(new sp7.g(screenName, elementName, null, null, 12));
        promise.resolve(null);
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNTareBridge
    @ReactMethod
    public void logTapButtonWithExtraParams(String screenName, String elementName, ReadableArray tags, ReadableMap extraParams, Promise promise) {
        screenName.getClass();
        elementName.getClass();
        tags.getClass();
        extraParams.getClass();
        promise.getClass();
        ((tp7) cr8.p(tp7.class)).b(new sp7.g(screenName, elementName, readableArrayToStringList(tags), readableMapToJSTParamsBuilder(extraParams)));
        promise.resolve(null);
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNTareBridge
    @ReactMethod
    public void openLoginModal(boolean isRegistration, String from, Promise promise) {
        promise.getClass();
        androidx.fragment.app.g gVar = (androidx.fragment.app.g) this.reactContext.getCurrentActivity();
        if (gVar == null) {
            ((np7) cr8.p(np7.class)).c(IndeedRNBridgeBaseRNTareBridge.MODULE_NAME, "No activity available to open login modal", false, new RNTareBridgeDetachmentException());
            promise.reject("ERROR", "No activity available to open login modal");
        } else {
            lr5 lr5VarU = gVar.u();
            rq7 rq7Var = (rq7) cr8.p(rq7.class);
            lr5VarU.getClass();
            rq7Var.c(lr5VarU, new nq7.f(new qq7.h(isRegistration), new tdc(2, promise)), from);
        }
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNTareBridge
    @ReactMethod
    public void openPaywallModal(String style, String from, String tk, Promise promise) {
        style.getClass();
        promise.getClass();
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("paywallScreenResult", "FAILURE");
        writableNativeMap.putString("productId", "null");
        promise.resolve(writableNativeMap);
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNTareBridge
    @ReactMethod
    public void openShareSheet(String url, String message, String subject, Promise promise) {
        url.getClass();
        message.getClass();
        promise.getClass();
        Activity currentActivity = this.reactContext.getCurrentActivity();
        if (currentActivity != null) {
            ((rq7) cr8.p(rq7.class)).j(currentActivity, new rq7.a(url, message, subject), new xdc(1, promise));
        } else {
            promise.reject("ERROR", "No activity available to present share sheet");
        }
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNTareBridge
    @ReactMethod
    public void presentProfilePreferences(ReadableMap profilePreferenceFormData, String presenter, Promise promise) {
        profilePreferenceFormData.getClass();
        presenter.getClass();
        promise.getClass();
        if (!this.reactContext.hasCurrentActivity()) {
            promise.reject("ERROR", "No activity available to present profile preferences");
            return;
        }
        Activity currentActivity = this.reactContext.getCurrentActivity();
        currentActivity.getClass();
        lr5 lr5VarU = ((androidx.fragment.app.g) currentActivity).u();
        lr5VarU.getClass();
        String string = profilePreferenceFormData.getString("type");
        ReadableMap map = profilePreferenceFormData.getMap("data");
        int i2 = 0;
        tsb tsbVar = null;
        if (string != null) {
            tsb[] tsbVarArrValues = tsb.values();
            int length = tsbVarArrValues.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                tsb tsbVar2 = tsbVarArrValues[i3];
                if (wl7.b(tsbVar2.name(), string)) {
                    tsbVar = tsbVar2;
                    break;
                }
                i3++;
            }
        }
        if (tsbVar != null) {
            UiThreadUtil.runOnUiThread(new ghc(i2, lr5VarU, presenter, readableMapToJSTProfilePreference(tsbVar, map, promise)));
        } else {
            promise.reject(new IllegalArgumentException("Invalid profile preference type"));
        }
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNTareBridge
    @ReactMethod
    public void presentResumeMainSectionForm(ReadableMap resumeMainSectionFormData, final String presenter, Promise promise) {
        ur7 ur7Var;
        final ur7 cVar;
        resumeMainSectionFormData.getClass();
        promise.getClass();
        if (!this.reactContext.hasCurrentActivity()) {
            promise.reject("ERROR", "No activity available to present resume main section form");
            return;
        }
        Activity currentActivity = this.reactContext.getCurrentActivity();
        currentActivity.getClass();
        final lr5 lr5VarU = ((androidx.fragment.app.g) currentActivity).u();
        lr5VarU.getClass();
        String string = resumeMainSectionFormData.getString("type");
        ReadableMap map = resumeMainSectionFormData.getMap("data");
        String string2 = resumeMainSectionFormData.getString("mode");
        if (string2 == null) {
            promise.reject(new IllegalArgumentException("mode is required for resume main section form"));
            return;
        }
        String string3 = resumeMainSectionFormData.getString("itemId");
        int iHashCode = string2.hashCode();
        if (iHashCode != 65665) {
            if (iHashCode != 2155050) {
                if (iHashCode == 1596551922 && string2.equals("BuildSuggestion")) {
                    ur7Var = ur7.b.a;
                }
                cVar = ur7Var;
            } else if (string2.equals("Edit")) {
                if (string3 == null) {
                    promise.reject(new IllegalArgumentException("itemId cannot be null in Edit mode"));
                    return;
                }
                cVar = new ur7.c(string3);
            }
            cVar = ur7Var;
        } else {
            ur7Var = !string2.equals("Add") ? ur7.a.a : ur7.a.a;
            cVar = ur7Var;
        }
        if (string == null) {
            promise.reject(new IllegalArgumentException("Missing resume main section type"));
            return;
        }
        final ns7 ns7Var = readableMapToJSTProfileResumeMainSection(string, map, promise);
        if (ns7Var == null) {
            promise.reject(new IllegalArgumentException("Invalid resume main section type: ".concat(string)));
            return;
        }
        ArrayList arrayList = lz2.a;
        Log.d(IndeedRNBridgeBaseRNTareBridge.MODULE_NAME, t40.l("Presenting resume main section form for type: ", string, ", mode: ", string2), null);
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: fhc
            @Override // java.lang.Runnable
            public final void run() {
                RNTareBridge.presentResumeMainSectionForm$lambda$13(lr5VarU, presenter, this, ns7Var, cVar);
            }
        });
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNTareBridge
    @ReactMethod
    public void presentResumeOtherSectionForm(ReadableMap resumeOtherSectionFormData, String presenter, Promise promise) {
        ReadableMap map;
        ur7 ur7Var;
        ur7 cVar;
        resumeOtherSectionFormData.getClass();
        promise.getClass();
        if (!this.reactContext.hasCurrentActivity()) {
            promise.reject("ERROR", "No activity available to present resume other section form");
            return;
        }
        Activity currentActivity = this.reactContext.getCurrentActivity();
        currentActivity.getClass();
        lr5 lr5VarU = ((androidx.fragment.app.g) currentActivity).u();
        lr5VarU.getClass();
        String string = resumeOtherSectionFormData.getString("type");
        if (string == null) {
            promise.reject(new IllegalArgumentException("Missing resume other section type"));
            return;
        }
        if (resumeOtherSectionFormData.getType("data") == ReadableType.Map) {
            map = resumeOtherSectionFormData.getMap("data");
        } else if (resumeOtherSectionFormData.getType("data") == ReadableType.Array) {
            ReadableArray array = resumeOtherSectionFormData.getArray("data");
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            String lowerCase = string.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            writableNativeMap.putArray(lowerCase, array);
            map = writableNativeMap;
        } else {
            map = null;
        }
        String string2 = resumeOtherSectionFormData.getString("mode");
        if (string2 == null) {
            promise.reject(new IllegalArgumentException("mode is required for resume other section form"));
            return;
        }
        String string3 = resumeOtherSectionFormData.getString("itemId");
        int iHashCode = string2.hashCode();
        if (iHashCode != 65665) {
            if (iHashCode != 2155050) {
                if (iHashCode == 1596551922 && string2.equals("BuildSuggestion")) {
                    ur7Var = ur7.b.a;
                }
                cVar = ur7Var;
            } else if (string2.equals("Edit")) {
                if (string3 == null) {
                    promise.reject(new IllegalArgumentException("itemId cannot be null in Edit mode"));
                    return;
                }
                cVar = new ur7.c(string3);
            }
            cVar = ur7Var;
        } else {
            ur7Var = !string2.equals("Add") ? ur7.a.a : ur7.a.a;
            cVar = ur7Var;
        }
        os7 os7Var = readableMapToJSTProfileResumeOtherSection(string, map, promise);
        if (os7Var != null) {
            UiThreadUtil.runOnUiThread(new rdc(lr5VarU, presenter, this, os7Var, cVar));
        } else {
            promise.reject(new IllegalArgumentException("Invalid resume other section type: ".concat(string)));
        }
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNTareBridge
    @ReactMethod
    public void removeListeners(double count) {
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNTareBridge
    @ReactMethod
    public void setCachedViewJobFeed(String homepageTk, ReadableMap viewJobFeed, Promise promise) {
        homepageTk.getClass();
        viewJobFeed.getClass();
        promise.getClass();
        ((ep7) cr8.p(ep7.class)).d().b(homepageTk, new ViewJobFeed(getStringSafeOrNull(viewJobFeed, "homepageTk"), getStringSafeOrNull(viewJobFeed, "jobFeedData"), getStringSafeOrNull(viewJobFeed, "lastViewedJobSection"), getStringSafeOrNull(viewJobFeed, "lastViewedJobKey")));
        promise.resolve(null);
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNTareBridge
    @ReactMethod
    public void setCachedViewJobHint(String key, ReadableMap hint, Promise promise) {
        key.getClass();
        hint.getClass();
        promise.getClass();
        ((ep7) cr8.p(ep7.class)).d().b(key, new ViewJobHint(getBooleanSafeOrNull(hint, "isSaved"), getStringSafeOrNull(hint, "title"), getBooleanSafeOrNull(hint, "isFromAce"), getStringSafeOrNull(hint, "jobResultTrackingKey"), getBooleanSafeOrNull(hint, "isDisliked"), getStringSafeOrNull(hint, "matchFactor")));
        promise.resolve(null);
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNTareBridge
    @ReactMethod
    public void setLocalPrefsBoolean(String namespace, String key, boolean newValue, Promise promise) {
        namespace.getClass();
        key.getClass();
        promise.getClass();
        ((kq7) cr8.p(kq7.class)).e(namespace, key, newValue);
        promise.resolve(null);
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNTareBridge
    @ReactMethod
    public void setLocalPrefsInt(String namespace, String key, double newValue, Promise promise) {
        namespace.getClass();
        key.getClass();
        promise.getClass();
        ((kq7) cr8.p(kq7.class)).a((int) newValue, namespace, key);
        promise.resolve(null);
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNTareBridge
    @ReactMethod
    public void setLocalPrefsLong(String namespace, String key, double newValue, Promise promise) {
        namespace.getClass();
        key.getClass();
        promise.getClass();
        ((kq7) cr8.p(kq7.class)).i((long) newValue, namespace, key);
        promise.resolve(null);
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNTareBridge
    @ReactMethod
    public void setLocalPrefsString(String namespace, String key, String newValue, Promise promise) {
        namespace.getClass();
        key.getClass();
        newValue.getClass();
        promise.getClass();
        ((kq7) cr8.p(kq7.class)).f(namespace, key, newValue);
        promise.resolve(null);
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNTareBridge
    @ReactMethod
    public void setNavBarItems(double rootTag, ReadableArray leading, ReadableArray trailing, ReadableMap title, String backgroundColor, Boolean animated, String screenName, Promise promise) {
        leading.getClass();
        trailing.getClass();
        title.getClass();
        promise.getClass();
        try {
            ArrayList arrayListB = jae.b(leading, screenName, new c(1, this, RNTareBridge.class, "onNavItemClick", "onNavItemClick(Ljava/lang/String;)V", 0));
            ArrayList arrayListB2 = jae.b(trailing, screenName, new d(1, this, RNTareBridge.class, "onNavItemClick", "onNavItemClick(Ljava/lang/String;)V", 0));
            sof sofVarC = jae.c(title);
            da2 da2VarA = jae.a(backgroundColor);
            boolean zBooleanValue = animated != null ? animated.booleanValue() : false;
            if (arrayListB.isEmpty()) {
                arrayListB = null;
            }
            if (arrayListB2.isEmpty()) {
                arrayListB2 = null;
            }
            final c4g c4gVar = new c4g(sofVarC, arrayListB, arrayListB2, da2VarA, zBooleanValue);
            final ReactApplicationContext reactApplicationContext = this.reactContext;
            final int i2 = (int) rootTag;
            reactApplicationContext.getClass();
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: jhc
                @Override // java.lang.Runnable
                public final void run() throws InvalidTARETopNavHostException {
                    boolean z;
                    Fragment parentFragment;
                    ReactContext reactContext = reactApplicationContext;
                    int i3 = i2;
                    try {
                        UIManager uIManagerK = dmc.k(reactContext, i3);
                        if (uIManagerK == null) {
                            throw new UIManagerNotFoundException("UIManager not found for rootTag: " + i3);
                        }
                        View viewResolveView = uIManagerK.resolveView(i3);
                        if (viewResolveView == null) {
                            throw new ViewNotFoundException("View not found for rootTag: " + i3);
                        }
                        Fragment fragmentB = FragmentManager.B(viewResolveView);
                        ArrayList arrayList = new ArrayList();
                        Fragment fragment = fragmentB;
                        while (true) {
                            z = fragment instanceof k3g;
                            if (z || (parentFragment = fragment.getParentFragment()) == null) {
                                break;
                            }
                            arrayList.add(parentFragment.getClass().getSimpleName());
                            fragment = parentFragment;
                        }
                        k3g k3gVar = z ? (k3g) fragment : null;
                        if (k3gVar == null) {
                            throw new InvalidTARETopNavHostException(l6.i(m6.j(i3, "The host fragment for rootTag=", " '", fragmentB.getClass().getSimpleName(), "' (and none of its parent fragments: -> "), arrayList.isEmpty() ? "null" : z92.W0(arrayList, " -> ", null, null, new dc(12), 30), ") does not implement the UIPTareTopNavHost interface"));
                        }
                        u63.Y(hh1.A(fragment), null, null, new khc(k3gVar, c4gVar, null), 3);
                    } catch (Exception e2) {
                        ((np7) cr8.p(np7.class)).c("RNTareTopNav", bg.d(i3, "Error retrieving view for rootTag=", ". Ignoring this call."), false, e2);
                    }
                }
            });
            promise.resolve(null);
        } catch (Exception e2) {
            ((np7) cr8.p(np7.class)).c(IndeedRNBridgeBaseRNTareBridge.MODULE_NAME, "setNavBarItems failed", false, e2);
            promise.reject("ERROR", "setNavBarItems failed: " + e2.getMessage(), e2);
        }
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNTareBridge
    @ReactMethod
    public void sseClient(Promise promise) {
        promise.getClass();
        String strGenerateInstanceUuid = generateInstanceUuid(a.a);
        if (!this.sseClientInstances.containsKey(strGenerateInstanceUuid)) {
            this.sseClientInstances.put(strGenerateInstanceUuid, new sid(getSseOkHttpClient(), getSseBaseUrl(), new g()));
            promise.resolve(strGenerateInstanceUuid);
        } else {
            ArrayList arrayList = lz2.a;
            lz2.c(IndeedRNBridgeBaseRNTareBridge.MODULE_NAME, "Duplicate uuid generated in sse client creation", false, null, 12);
            promise.reject("ERROR", "Duplicate uuid generated in sse client creation");
        }
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNTareBridge
    @ReactMethod
    public void sseConnect(String sseClientId, String path, Promise promise) {
        sseClientId.getClass();
        path.getClass();
        promise.getClass();
        u63.Y(hh1.A(ynb.X), null, null, new h(sseClientId, promise, path, null), 3);
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNTareBridge
    @ReactMethod
    public void sseDisconnect(String sseClientId, Promise promise) {
        sseClientId.getClass();
        promise.getClass();
        sid sidVar = this.sseClientInstances.get(sseClientId);
        if (sidVar == null) {
            promise.reject("ERROR", "no matching instance found for client id ".concat(sseClientId));
            return;
        }
        g gVar = sidVar.c;
        boolean z = false;
        if (this.sseClientInstances.size() > 15) {
            ArrayList arrayList = lz2.a;
            lz2.c(IndeedRNBridgeBaseRNTareBridge.MODULE_NAME, bg.d(this.sseClientInstances.size(), "Large number of sseClient instances (", ")"), false, null, 12);
        }
        gVar.a("Disconnect called. Setting state to SHUTDOWN.");
        gse gseVar = sidVar.k;
        gseVar.getClass();
        gseVar.m(null, sqc.e);
        sidVar.f = 0L;
        EventSource eventSource = sidVar.e;
        if (eventSource != null) {
            eventSource.cancel();
        }
        EventSource eventSource2 = sidVar.d;
        if (eventSource2 != null) {
            eventSource2.cancel();
        }
        gVar.a("Heartbeat duration: " + (System.currentTimeMillis() - sidVar.f));
        if (sidVar.f != 0 && System.currentTimeMillis() - sidVar.f > 20000) {
            z = true;
        }
        promise.resolve(Boolean.valueOf(z));
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNTareBridge
    @ReactMethod
    public void startNativeFetch(String requestId, String url, String method, String body, Promise promise) {
        RequestBody$Companion$toRequestBody$2 requestBody$Companion$toRequestBody$2A;
        requestId.getClass();
        url.getClass();
        method.getClass();
        promise.getClass();
        if (body == null || zve.U(body)) {
            requestBody$Companion$toRequestBody$2A = null;
        } else {
            RequestBody.Companion companion = RequestBody.INSTANCE;
            MediaType.e.getClass();
            MediaType mediaTypeA = MediaType.Companion.a("application/json");
            companion.getClass();
            requestBody$Companion$toRequestBody$2A = RequestBody.Companion.a(body, mediaTypeA);
        }
        Request.Builder builder = new Request.Builder();
        builder.g(url);
        builder.e(method, requestBody$Companion$toRequestBody$2A);
        Request requestB = builder.b();
        OkHttpClient nativeFetchClient = getNativeFetchClient();
        nativeFetchClient.getClass();
        new RealCall(nativeFetchClient, requestB, false).R0(new i(promise, requestId));
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNTareBridge
    @ReactMethod
    public void updateCachedViewJobFeed(String homepageTk, String key, String value, Promise promise) {
        ViewJobFeed viewJobFeedA;
        homepageTk.getClass();
        key.getClass();
        value.getClass();
        promise.getClass();
        JSTCacheValue jSTCacheValueA = ((ep7) cr8.p(ep7.class)).d().a(homepageTk);
        ViewJobFeed viewJobFeed = jSTCacheValueA instanceof ViewJobFeed ? (ViewJobFeed) jSTCacheValueA : null;
        if (viewJobFeed == null) {
            promise.reject("not_found", "No cached ViewJobFeed found for homepageTk: ".concat(homepageTk), (Throwable) null);
            return;
        }
        int iHashCode = key.hashCode();
        if (iHashCode == -739475390) {
            if (key.equals("lastViewedJobSection")) {
                viewJobFeedA = ViewJobFeed.a(viewJobFeed, null, value, null, 11);
                ((ep7) cr8.p(ep7.class)).d().b(homepageTk, viewJobFeedA);
                promise.resolve(null);
                return;
            }
            promise.reject("invalid_key", "Unexpected key: ".concat(key), (Throwable) null);
        }
        if (iHashCode == -565717444) {
            if (key.equals("lastViewedJobKey")) {
                viewJobFeedA = ViewJobFeed.a(viewJobFeed, null, null, value, 7);
                ((ep7) cr8.p(ep7.class)).d().b(homepageTk, viewJobFeedA);
                promise.resolve(null);
                return;
            }
            promise.reject("invalid_key", "Unexpected key: ".concat(key), (Throwable) null);
        }
        if (iHashCode == 1293892933 && key.equals("jobFeedData")) {
            viewJobFeedA = ViewJobFeed.a(viewJobFeed, value, null, null, 13);
            ((ep7) cr8.p(ep7.class)).d().b(homepageTk, viewJobFeedA);
            promise.resolve(null);
            return;
        }
        promise.reject("invalid_key", "Unexpected key: ".concat(key), (Throwable) null);
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNTareBridge
    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getAccountStatusSync() {
        return innerGetAccountStatus();
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNTareBridge
    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getAppModelSync() {
        return innerGetAppModel();
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNTareBridge
    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getAppSessionInfoSync() {
        return innerGetAppSessionInfo();
    }

    @Override // com.indeed.android.reactnative.nativemodules.generated.IndeedRNBridgeBaseRNTareBridge
    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getDeviceModelSync() {
        return innerGetDeviceModel();
    }
}
