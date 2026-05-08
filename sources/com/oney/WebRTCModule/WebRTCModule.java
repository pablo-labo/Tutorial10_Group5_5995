package com.oney.WebRTCModule;

import android.app.Activity;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.projection.MediaProjectionManager;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.oney.WebRTCModule.WebRTCModule;
import com.oney.WebRTCModule.b;
import com.oney.WebRTCModule.b.a;
import com.oney.WebRTCModule.d;
import com.oney.WebRTCModule.e;
import defpackage.a73;
import defpackage.abc;
import defpackage.ak2;
import defpackage.b0;
import defpackage.bg2;
import defpackage.cf3;
import defpackage.cg2;
import defpackage.cp4;
import defpackage.dlf;
import defpackage.dm3;
import defpackage.dx0;
import defpackage.ed3;
import defpackage.ek9;
import defpackage.eq2;
import defpackage.et3;
import defpackage.f5;
import defpackage.fg3;
import defpackage.hy1;
import defpackage.i73;
import defpackage.jy0;
import defpackage.km9;
import defpackage.ky0;
import defpackage.l5;
import defpackage.l66;
import defpackage.ld3;
import defpackage.lm9;
import defpackage.m66;
import defpackage.md3;
import defpackage.me6;
import defpackage.n4;
import defpackage.n66;
import defpackage.ne6;
import defpackage.nmc;
import defpackage.nve;
import defpackage.o66;
import defpackage.p9;
import defpackage.ph1;
import defpackage.q20;
import defpackage.s0f;
import defpackage.sjc;
import defpackage.t7e;
import defpackage.tm1;
import defpackage.uk9;
import defpackage.uog;
import defpackage.vb0;
import defpackage.vog;
import defpackage.w71;
import defpackage.wk3;
import defpackage.wv1;
import defpackage.y7e;
import defpackage.yc4;
import defpackage.yg9;
import defpackage.z24;
import defpackage.zd3;
import defpackage.zpd;
import defpackage.zvg;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.webrtc.AddIceObserver;
import org.webrtc.AudioSource;
import org.webrtc.AudioTrack;
import org.webrtc.Camera1Enumerator;
import org.webrtc.Camera2Enumerator;
import org.webrtc.CameraEnumerator;
import org.webrtc.CryptoOptions;
import org.webrtc.DataChannel;
import org.webrtc.EglBase;
import org.webrtc.IceCandidate;
import org.webrtc.MediaConstraints;
import org.webrtc.MediaStream;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnection;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.RTCStatsReport;
import org.webrtc.RtpCapabilities;
import org.webrtc.RtpReceiver;
import org.webrtc.RtpSender;
import org.webrtc.RtpTransceiver;
import org.webrtc.SdpObserver;
import org.webrtc.SessionDescription;
import org.webrtc.SoftwareVideoDecoderFactory;
import org.webrtc.SoftwareVideoEncoderFactory;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoDecoderFactory;
import org.webrtc.VideoEncoderFactory;
import org.webrtc.VideoSource;
import org.webrtc.VideoTrack;
import org.webrtc.audio.AudioDeviceModule;
import org.webrtc.audio.JavaAudioDeviceModule;

/* JADX INFO: loaded from: classes3.dex */
@nmc(name = "WebRTCModule")
public class WebRTCModule extends ReactContextBaseJavaModule {
    private static final String GET_CAMERA_FACING_MODE_ERROR = "GET_CAMERA_FACING_MODE_ERROR";
    private static final String SWITCH_CAMERA_ERROR = "SWITCH_CAMERA_ERROR";
    static final String TAG = "com.oney.WebRTCModule.WebRTCModule";
    private com.oney.WebRTCModule.b dailyAudioManager;
    private final com.oney.WebRTCModule.d dailyWebRTCDevicesManager;
    private final com.oney.WebRTCModule.e getUserMediaImpl;
    final Map<String, MediaStream> localStreams;
    AudioDeviceModule mAudioDeviceModule;
    PeerConnectionFactory mFactory;
    private final SparseArray<com.oney.WebRTCModule.f> mPeerConnectionObservers;
    VideoDecoderFactory mVideoDecoderFactory;
    VideoEncoderFactory mVideoEncoderFactory;

    public class a {
        public final /* synthetic */ Promise a;

        public a(Promise promise) {
            this.a = promise;
        }
    }

    public class b implements SdpObserver {
        public final /* synthetic */ Promise a;
        public final /* synthetic */ PeerConnection b;
        public final /* synthetic */ ArrayList c;
        public final /* synthetic */ com.oney.WebRTCModule.f d;
        public final /* synthetic */ int e;
        public final /* synthetic */ WebRTCModule f;

        public b(int i, Promise promise, com.oney.WebRTCModule.f fVar, WebRTCModule webRTCModule, ArrayList arrayList, PeerConnection peerConnection) {
            this.f = webRTCModule;
            this.a = promise;
            this.b = peerConnection;
            this.c = arrayList;
            this.d = fVar;
            this.e = i;
        }

        @Override // org.webrtc.SdpObserver
        public final void onCreateFailure(String str) {
            dlf.a(new eq2(4, this.a, str));
        }

        @Override // org.webrtc.SdpObserver
        public final void onCreateSuccess(final SessionDescription sessionDescription) {
            final PeerConnection peerConnection = this.b;
            final ArrayList arrayList = this.c;
            final com.oney.WebRTCModule.f fVar = this.d;
            final int i = this.e;
            final Promise promise = this.a;
            dlf.a(new Runnable() { // from class: wvg
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // java.lang.Runnable
                public final void run() {
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    WritableMap writableMapCreateMap2 = Arguments.createMap();
                    SessionDescription sessionDescription2 = sessionDescription;
                    writableMapCreateMap2.putString("sdp", sessionDescription2.description);
                    writableMapCreateMap2.putString("type", sessionDescription2.type.canonicalForm());
                    WebRTCModule webRTCModule = this.a.f;
                    PeerConnection peerConnection2 = peerConnection;
                    writableMapCreateMap.putArray("transceiversInfo", webRTCModule.getTransceiversInfo(peerConnection2));
                    writableMapCreateMap.putMap("sdpInfo", writableMapCreateMap2);
                    WritableArray writableArrayCreateArray = Arguments.createArray();
                    for (RtpTransceiver rtpTransceiver : peerConnection2.getTransceivers()) {
                        if (!arrayList.contains(rtpTransceiver.getReceiver().id())) {
                            WritableMap writableMapCreateMap3 = Arguments.createMap();
                            writableMapCreateMap3.putInt("transceiverOrder", fVar.a());
                            writableMapCreateMap3.putMap("transceiver", y7e.h(i, rtpTransceiver));
                            writableArrayCreateArray.pushMap(writableMapCreateMap3);
                        }
                    }
                    writableMapCreateMap.putArray("newTransceivers", writableArrayCreateArray);
                    promise.resolve(writableMapCreateMap);
                }
            });
        }

        @Override // org.webrtc.SdpObserver
        public final void onSetFailure(String str) {
        }

        @Override // org.webrtc.SdpObserver
        public final void onSetSuccess() {
        }
    }

    public class c implements SdpObserver {
        public final /* synthetic */ Promise a;
        public final /* synthetic */ PeerConnection b;
        public final /* synthetic */ WebRTCModule c;

        public c(Promise promise, WebRTCModule webRTCModule, PeerConnection peerConnection) {
            this.c = webRTCModule;
            this.a = promise;
            this.b = peerConnection;
        }

        @Override // org.webrtc.SdpObserver
        public final void onCreateFailure(String str) {
            dlf.a(new p9(7, this.a, str));
        }

        @Override // org.webrtc.SdpObserver
        public final void onCreateSuccess(final SessionDescription sessionDescription) {
            final PeerConnection peerConnection = this.b;
            final Promise promise = this.a;
            dlf.a(new Runnable() { // from class: xvg
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // java.lang.Runnable
                public final void run() {
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    WritableMap writableMapCreateMap2 = Arguments.createMap();
                    SessionDescription sessionDescription2 = sessionDescription;
                    writableMapCreateMap2.putString("sdp", sessionDescription2.description);
                    writableMapCreateMap2.putString("type", sessionDescription2.type.canonicalForm());
                    writableMapCreateMap.putArray("transceiversInfo", this.a.c.getTransceiversInfo(peerConnection));
                    writableMapCreateMap.putMap("sdpInfo", writableMapCreateMap2);
                    promise.resolve(writableMapCreateMap);
                }
            });
        }

        @Override // org.webrtc.SdpObserver
        public final void onSetFailure(String str) {
        }

        @Override // org.webrtc.SdpObserver
        public final void onSetSuccess() {
        }
    }

    public class d implements SdpObserver {
        public final /* synthetic */ PeerConnection a;
        public final /* synthetic */ Promise b;
        public final /* synthetic */ WebRTCModule c;

        public d(Promise promise, WebRTCModule webRTCModule, PeerConnection peerConnection) {
            this.c = webRTCModule;
            this.a = peerConnection;
            this.b = promise;
        }

        @Override // org.webrtc.SdpObserver
        public final void onCreateFailure(String str) {
        }

        @Override // org.webrtc.SdpObserver
        public final void onCreateSuccess(SessionDescription sessionDescription) {
        }

        @Override // org.webrtc.SdpObserver
        public final void onSetFailure(String str) {
            dlf.a(new ek9(5, this.b, str));
        }

        @Override // org.webrtc.SdpObserver
        public final void onSetSuccess() {
            dlf.a(new abc(3, this, this.a, this.b));
        }
    }

    public class e implements SdpObserver {
        public final /* synthetic */ PeerConnection a;
        public final /* synthetic */ ArrayList b;
        public final /* synthetic */ com.oney.WebRTCModule.f c;
        public final /* synthetic */ int d;
        public final /* synthetic */ Promise e;
        public final /* synthetic */ WebRTCModule f;

        public e(int i, Promise promise, com.oney.WebRTCModule.f fVar, WebRTCModule webRTCModule, ArrayList arrayList, PeerConnection peerConnection) {
            this.f = webRTCModule;
            this.a = peerConnection;
            this.b = arrayList;
            this.c = fVar;
            this.d = i;
            this.e = promise;
        }

        @Override // org.webrtc.SdpObserver
        public final void onCreateFailure(String str) {
        }

        @Override // org.webrtc.SdpObserver
        public final void onCreateSuccess(SessionDescription sessionDescription) {
        }

        @Override // org.webrtc.SdpObserver
        public final void onSetFailure(String str) {
            dlf.a(new et3(6, this.e, str));
        }

        @Override // org.webrtc.SdpObserver
        public final void onSetSuccess() {
            final PeerConnection peerConnection = this.a;
            final ArrayList arrayList = this.b;
            final com.oney.WebRTCModule.f fVar = this.c;
            final int i = this.d;
            final Promise promise = this.e;
            dlf.a(new Runnable() { // from class: yvg
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // java.lang.Runnable
                public final void run() {
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    WritableMap writableMapCreateMap2 = Arguments.createMap();
                    PeerConnection peerConnection2 = peerConnection;
                    SessionDescription remoteDescription = peerConnection2.getRemoteDescription();
                    if (remoteDescription != null) {
                        writableMapCreateMap.putString("type", remoteDescription.type.canonicalForm());
                        writableMapCreateMap.putString("sdp", remoteDescription.description);
                    }
                    writableMapCreateMap2.putArray("transceiversInfo", this.a.f.getTransceiversInfo(peerConnection2));
                    writableMapCreateMap2.putMap("sdpInfo", writableMapCreateMap);
                    WritableArray writableArrayCreateArray = Arguments.createArray();
                    for (RtpTransceiver rtpTransceiver : peerConnection2.getTransceivers()) {
                        if (!arrayList.contains(rtpTransceiver.getReceiver().id())) {
                            WritableMap writableMapCreateMap3 = Arguments.createMap();
                            writableMapCreateMap3.putInt("transceiverOrder", fVar.a());
                            writableMapCreateMap3.putMap("transceiver", y7e.h(i, rtpTransceiver));
                            writableArrayCreateArray.pushMap(writableMapCreateMap3);
                        }
                    }
                    writableMapCreateMap2.putArray("newTransceivers", writableArrayCreateArray);
                    promise.resolve(writableMapCreateMap2);
                }
            });
        }
    }

    public class f implements AddIceObserver {
        public final /* synthetic */ PeerConnection a;
        public final /* synthetic */ Promise b;

        public f(PeerConnection peerConnection, Promise promise) {
            this.a = peerConnection;
            this.b = promise;
        }

        @Override // org.webrtc.AddIceObserver
        public final void onAddFailure(String str) {
            dlf.a(new ph1(4, this.b, str));
        }

        @Override // org.webrtc.AddIceObserver
        public final void onAddSuccess() {
            dlf.a(new z24(5, this.a, this.b));
        }
    }

    public static /* synthetic */ class g {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            a = iArr;
            try {
                iArr[ReadableType.String.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ReadableType.Array.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public WebRTCModule(ReactApplicationContext reactApplicationContext) {
        VideoEncoderFactory softwareVideoEncoderFactory;
        VideoDecoderFactory softwareVideoDecoderFactory;
        super(reactApplicationContext);
        this.mPeerConnectionObservers = new SparseArray<>();
        this.localStreams = new HashMap();
        zvg.a().getClass();
        PeerConnectionFactory.initialize(PeerConnectionFactory.InitializationOptions.builder(reactApplicationContext).setFieldTrials(null).setNativeLibraryLoader(new ak2(22)).setInjectableLogger(null, null).createInitializationOptions());
        EglBase.Context contextA = cp4.a();
        if (contextA != null) {
            softwareVideoEncoderFactory = new ne6(contextA);
            softwareVideoDecoderFactory = new me6(contextA);
        } else {
            softwareVideoEncoderFactory = new SoftwareVideoEncoderFactory();
            softwareVideoDecoderFactory = new SoftwareVideoDecoderFactory();
        }
        JavaAudioDeviceModule javaAudioDeviceModuleCreateAudioDeviceModule = JavaAudioDeviceModule.builder(reactApplicationContext).setEnableVolumeLogger(false).createAudioDeviceModule();
        String str = TAG;
        Log.d(str, "Using video encoder factory: " + softwareVideoEncoderFactory.getClass().getCanonicalName());
        Log.d(str, "Using video decoder factory: " + softwareVideoDecoderFactory.getClass().getCanonicalName());
        this.mFactory = PeerConnectionFactory.builder().setAudioDeviceModule(javaAudioDeviceModuleCreateAudioDeviceModule).setVideoEncoderFactory(softwareVideoEncoderFactory).setVideoDecoderFactory(softwareVideoDecoderFactory).createPeerConnectionFactory();
        javaAudioDeviceModuleCreateAudioDeviceModule.release();
        this.mVideoEncoderFactory = softwareVideoEncoderFactory;
        this.mVideoDecoderFactory = softwareVideoDecoderFactory;
        this.mAudioDeviceModule = javaAudioDeviceModuleCreateAudioDeviceModule;
        this.getUserMediaImpl = new com.oney.WebRTCModule.e(this, reactApplicationContext);
        this.dailyWebRTCDevicesManager = new com.oney.WebRTCModule.d(this, reactApplicationContext);
        zvg.a().a = true;
    }

    private PeerConnection.IceServer createIceServer(String str, String str2, String str3) {
        return PeerConnection.IceServer.builder(str).setUsername(str2).setPassword(str3).createIceServer();
    }

    private List<PeerConnection.IceServer> createIceServers(ReadableArray readableArray) {
        int size = readableArray == null ? 0 : readableArray.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            ReadableMap map = readableArray.getMap(i);
            boolean z = map.hasKey("username") && map.hasKey("credential");
            if (map.hasKey("urls")) {
                int i2 = g.a[map.getType("urls").ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        ReadableArray array = map.getArray("urls");
                        for (int i3 = 0; i3 < array.size(); i3++) {
                            String string = array.getString(i3);
                            if (z) {
                                arrayList.add(createIceServer(string, map.getString("username"), map.getString("credential")));
                            } else {
                                arrayList.add(createIceServer(string));
                            }
                        }
                    }
                } else if (z) {
                    arrayList.add(createIceServer(map.getString("urls"), map.getString("username"), map.getString("credential")));
                } else {
                    arrayList.add(createIceServer(map.getString("urls")));
                }
            }
        }
        return arrayList;
    }

    private PeerConnection getPeerConnection(int i) {
        com.oney.WebRTCModule.f fVar = this.mPeerConnectionObservers.get(i);
        if (fVar == null) {
            return null;
        }
        return fVar.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ReadableArray getTransceiversInfo(PeerConnection peerConnection) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        for (RtpTransceiver rtpTransceiver : peerConnection.getTransceivers()) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            RtpTransceiver.RtpTransceiverDirection currentDirection = rtpTransceiver.getCurrentDirection();
            if (currentDirection != null) {
                writableMapCreateMap.putString("currentDirection", y7e.b(currentDirection));
            }
            writableMapCreateMap.putString("transceiverId", rtpTransceiver.getSender().id());
            writableMapCreateMap.putString("mid", rtpTransceiver.getMid());
            writableMapCreateMap.putBoolean("isStopped", rtpTransceiver.isStopped());
            writableMapCreateMap.putMap("senderRtpParameters", y7e.e(rtpTransceiver.getSender().getParameters()));
            writableMapCreateMap.putMap("receiverRtpParameters", y7e.e(rtpTransceiver.getReceiver().getParameters()));
            writableArrayCreateArray.pushMap(writableMapCreateMap);
        }
        return writableArrayCreateArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object lambda$createDataChannel$38(int i, String str, ReadableMap readableMap) {
        com.oney.WebRTCModule.f fVar = this.mPeerConnectionObservers.get(i);
        if (fVar == null || fVar.d == null) {
            Log.d(TAG, "createDataChannel() peerConnection is null");
            return null;
        }
        int i2 = fVar.b;
        DataChannel.Init init = new DataChannel.Init();
        if (readableMap != null) {
            if (readableMap.hasKey("id")) {
                init.id = readableMap.getInt("id");
            }
            if (readableMap.hasKey("ordered")) {
                init.ordered = readableMap.getBoolean("ordered");
            }
            if (readableMap.hasKey("maxRetransmitTime")) {
                init.maxRetransmitTimeMs = readableMap.getInt("maxRetransmitTime");
            }
            if (readableMap.hasKey("maxRetransmits")) {
                init.maxRetransmits = readableMap.getInt("maxRetransmits");
            }
            if (readableMap.hasKey("protocol")) {
                init.protocol = readableMap.getString("protocol");
            }
            if (readableMap.hasKey("negotiated")) {
                init.negotiated = readableMap.getBoolean("negotiated");
            }
        }
        DataChannel dataChannelCreateDataChannel = fVar.d.createDataChannel(str, init);
        if (dataChannelCreateDataChannel == null) {
            return null;
        }
        String string = UUID.randomUUID().toString();
        zd3 zd3Var = new zd3(fVar.i, i2, string, dataChannelCreateDataChannel);
        fVar.a.put(string, zd3Var);
        dataChannelCreateDataChannel.registerObserver(zd3Var);
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("peerConnectionId", i2);
        writableMapCreateMap.putString("reactTag", string);
        writableMapCreateMap.putString("label", dataChannelCreateDataChannel.label());
        writableMapCreateMap.putInt("id", dataChannelCreateDataChannel.id());
        writableMapCreateMap.putBoolean("ordered", init.ordered);
        writableMapCreateMap.putInt("maxPacketLifeTime", init.maxRetransmitTimeMs);
        writableMapCreateMap.putInt("maxRetransmits", init.maxRetransmits);
        writableMapCreateMap.putString("protocol", init.protocol);
        writableMapCreateMap.putBoolean("negotiated", init.negotiated);
        writableMapCreateMap.putString("readyState", zd3.a(dataChannelCreateDataChannel.state()));
        return writableMapCreateMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$dataChannelClose$39(int i, String str) {
        com.oney.WebRTCModule.f fVar = this.mPeerConnectionObservers.get(i);
        if (fVar == null || fVar.d == null) {
            Log.d(TAG, "dataChannelClose() peerConnection is null");
            return;
        }
        zd3 zd3Var = (zd3) fVar.a.get(str);
        if (zd3Var == null) {
            Log.d(com.oney.WebRTCModule.f.j, "dataChannelClose() dataChannel is null");
        } else {
            zd3Var.b.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$dataChannelDispose$40(int i, String str) {
        com.oney.WebRTCModule.f fVar = this.mPeerConnectionObservers.get(i);
        if (fVar == null || fVar.d == null) {
            Log.d(TAG, "dataChannelDispose() peerConnection is null");
            return;
        }
        HashMap map = fVar.a;
        zd3 zd3Var = (zd3) map.get(str);
        if (zd3Var == null) {
            Log.d(com.oney.WebRTCModule.f.j, "dataChannelDispose() dataChannel is null");
        } else {
            zd3Var.b.unregisterObserver();
            map.remove(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$dataChannelSend$41(int i, String str, String str2, String str3) {
        byte[] bArrDecode;
        com.oney.WebRTCModule.f fVar = this.mPeerConnectionObservers.get(i);
        if (fVar == null || fVar.d == null) {
            Log.d(TAG, "dataChannelSend() peerConnection is null");
            return;
        }
        String str4 = com.oney.WebRTCModule.f.j;
        zd3 zd3Var = (zd3) fVar.a.get(str);
        if (zd3Var == null) {
            Log.d(str4, "dataChannelSend() dataChannel is null");
            return;
        }
        if (str3.equals("text")) {
            bArrDecode = str2.getBytes(StandardCharsets.UTF_8);
        } else {
            if (!str3.equals("binary")) {
                Log.e(str4, "Unsupported data type: ".concat(str3));
                return;
            }
            bArrDecode = Base64.decode(str2, 2);
        }
        zd3Var.b.send(new DataChannel.Buffer(ByteBuffer.wrap(bArrDecode), str3.equals("binary")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$enumerateDevices$12(Callback callback) {
        com.oney.WebRTCModule.d dVar = this.dailyWebRTCDevicesManager;
        dVar.getClass();
        WritableArray writableArrayCreateArray = Arguments.createArray();
        final CameraEnumerator cameraEnumerator = dVar.b;
        String[] deviceNames = cameraEnumerator.getDeviceNames();
        Log.d("com.oney.WebRTCModule.d", "fillVideoInputDevices video devices: " + Arrays.toString(deviceNames));
        boolean zAnyMatch = Arrays.stream(deviceNames).anyMatch(new Predicate() { // from class: nd3
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return cameraEnumerator.isFrontFacing((String) obj);
            }
        });
        d.c cVar = d.c.VIDEO_INPUT;
        if (zAnyMatch) {
            WritableMap writableMapA = com.oney.WebRTCModule.d.a("CAMERA_USER", "Front camera", cVar.a());
            writableMapA.putString("facing", "user");
            writableArrayCreateArray.pushMap(writableMapA);
        }
        if (Arrays.stream(deviceNames).anyMatch(new dx0(cameraEnumerator, 1))) {
            WritableMap writableMapA2 = com.oney.WebRTCModule.d.a("CAMERA_ENVIRONMENT", "Rear camera", cVar.a());
            writableMapA2.putString("facing", "environment");
            writableArrayCreateArray.pushMap(writableMapA2);
        }
        AudioDeviceInfo[] devices = dVar.c.getDevices(2);
        boolean zAnyMatch2 = Arrays.stream(devices).anyMatch(new ld3());
        d.c cVar2 = d.c.AUDIO;
        writableArrayCreateArray.pushMap(zAnyMatch2 ? com.oney.WebRTCModule.d.a("WIRED_OR_EARPIECE", "Wired headset", cVar2.a()) : com.oney.WebRTCModule.d.a("WIRED_OR_EARPIECE", "Phone earpiece", cVar2.a()));
        writableArrayCreateArray.pushMap(com.oney.WebRTCModule.d.a("SPEAKERPHONE", "Speakerphone", cVar2.a()));
        if (Arrays.stream(devices).anyMatch(new md3())) {
            writableArrayCreateArray.pushMap(com.oney.WebRTCModule.d.a("BLUETOOTH", "Bluetooth", cVar2.a()));
        }
        callback.invoke(writableArrayCreateArray);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$getAudioDevice$43(Promise promise) {
        AudioManager audioManager = this.dailyWebRTCDevicesManager.c;
        promise.resolve((audioManager.isBluetoothScoOn() || audioManager.isBluetoothA2dpOn()) ? "BLUETOOTH" : audioManager.isSpeakerphoneOn() ? "SPEAKERPHONE" : "WIRED_OR_EARPIECE");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$getDisplayMedia$10(Promise promise) {
        com.oney.WebRTCModule.e eVar = this.getUserMediaImpl;
        if (eVar.e != null) {
            promise.reject(new RuntimeException("Another operation is pending."));
            return;
        }
        Activity currentActivity = eVar.b.getCurrentActivity();
        if (currentActivity == null) {
            promise.reject(new RuntimeException("No current Activity."));
            return;
        }
        eVar.e = promise;
        MediaProjectionManager mediaProjectionManager = (MediaProjectionManager) currentActivity.getApplication().getSystemService("media_projection");
        if (mediaProjectionManager != null) {
            UiThreadUtil.runOnUiThread(new fg3(currentActivity, mediaProjectionManager));
        } else {
            promise.reject(new RuntimeException("MediaProjectionManager is null."));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$getStreamForReactTag$1(String str) {
        MediaStream mediaStream = this.localStreams.get(str);
        if (mediaStream != null) {
            return mediaStream;
        }
        int size = this.mPeerConnectionObservers.size();
        for (int i = 0; i < size; i++) {
            MediaStream mediaStream2 = (MediaStream) this.mPeerConnectionObservers.valueAt(i).f.get(str);
            if (mediaStream2 != null) {
                return mediaStream2;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$getUserMedia$11(ReadableMap readableMap, Callback callback, Callback callback2) {
        AudioTrack audioTrackCreateAudioTrack;
        com.oney.WebRTCModule.e eVar = this.getUserMediaImpl;
        ReactApplicationContext reactApplicationContext = eVar.b;
        String str = com.oney.WebRTCModule.e.g;
        VideoTrack videoTrackB = null;
        if (readableMap.hasKey(MediaStreamTrack.AUDIO_TRACK_KIND)) {
            ReadableMap map = readableMap.getMap(MediaStreamTrack.AUDIO_TRACK_KIND);
            Log.d(str, "getUserMedia(audio): " + map);
            String string = UUID.randomUUID().toString();
            WebRTCModule webRTCModule = eVar.d;
            PeerConnectionFactory peerConnectionFactory = webRTCModule.mFactory;
            MediaConstraints mediaConstraintsConstraintsForOptions = webRTCModule.constraintsForOptions(map);
            ArrayList arrayList = new ArrayList(mediaConstraintsConstraintsForOptions.mandatory.size());
            for (MediaConstraints.KeyValuePair keyValuePair : mediaConstraintsConstraintsForOptions.mandatory) {
                if (keyValuePair.getValue() != null) {
                    arrayList.add(keyValuePair);
                } else {
                    Log.d(str, "constraint " + keyValuePair.getKey() + " is null, ignoring it");
                }
            }
            mediaConstraintsConstraintsForOptions.mandatory.clear();
            mediaConstraintsConstraintsForOptions.mandatory.addAll(arrayList);
            AudioSource audioSourceCreateAudioSource = peerConnectionFactory.createAudioSource(mediaConstraintsConstraintsForOptions);
            audioTrackCreateAudioTrack = peerConnectionFactory.createAudioTrack(string, audioSourceCreateAudioSource);
            eVar.c.put(string, new e.c(audioTrackCreateAudioTrack, audioSourceCreateAudioSource, null, null));
        } else {
            audioTrackCreateAudioTrack = null;
        }
        if (readableMap.hasKey(MediaStreamTrack.VIDEO_TRACK_KIND)) {
            ReadableMap map2 = readableMap.getMap(MediaStreamTrack.VIDEO_TRACK_KIND);
            Log.d(str, "getUserMedia(video): " + map2);
            Activity currentActivity = reactApplicationContext.getCurrentActivity();
            if (eVar.a == null) {
                if (Camera2Enumerator.isSupported(reactApplicationContext)) {
                    Log.d(str, "Creating camera enumerator using the Camera2 API");
                    eVar.a = new Camera2Enumerator(reactApplicationContext);
                } else {
                    Log.d(str, "Creating camera enumerator using the Camera1 API");
                    eVar.a = new Camera1Enumerator(false);
                }
            }
            videoTrackB = eVar.b(new wv1(currentActivity, eVar.a, map2));
        }
        if (audioTrackCreateAudioTrack == null && videoTrackB == null) {
            callback2.invoke("DOMException", "AbortError");
        } else {
            eVar.a(new MediaStreamTrack[]{audioTrackCreateAudioTrack, videoTrackB}, new q20(callback, 5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$mediaStreamAddTrack$14(String str, int i, String str2) {
        MediaStream mediaStream = this.localStreams.get(str);
        if (mediaStream == null) {
            Log.d(TAG, "mediaStreamAddTrack() could not find stream " + str);
            return;
        }
        MediaStreamTrack track = getTrack(i, str2);
        if (track == null) {
            Log.d(TAG, "mediaStreamAddTrack() could not find track " + str2);
            return;
        }
        String strKind = track.kind();
        if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(strKind)) {
            mediaStream.addTrack((AudioTrack) track);
        } else if (MediaStreamTrack.VIDEO_TRACK_KIND.equals(strKind)) {
            mediaStream.addTrack((VideoTrack) track);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$mediaStreamCreate$13(String str) {
        this.localStreams.put(str, this.mFactory.createLocalMediaStream(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$mediaStreamRelease$16(String str) {
        MediaStream mediaStream = this.localStreams.get(str);
        if (mediaStream == null) {
            Log.d(TAG, "mediaStreamRelease() stream is null");
        } else {
            this.localStreams.remove(str);
            mediaStream.dispose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$mediaStreamRemoveTrack$15(String str, int i, String str2) {
        MediaStream mediaStream = this.localStreams.get(str);
        if (mediaStream == null) {
            Log.d(TAG, "mediaStreamRemoveTrack() could not find stream " + str);
            return;
        }
        MediaStreamTrack track = getTrack(i, str2);
        if (track == null) {
            Log.d(TAG, "mediaStreamRemoveTrack() could not find track " + str2);
            return;
        }
        String strKind = track.kind();
        if (MediaStreamTrack.AUDIO_TRACK_KIND.equals(strKind)) {
            mediaStream.removeTrack((AudioTrack) track);
        } else if (MediaStreamTrack.VIDEO_TRACK_KIND.equals(strKind)) {
            mediaStream.removeTrack((VideoTrack) track);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$mediaStreamTrackApplyConstraints$21(String str, ReadableMap readableMap, Promise promise) {
        f5 f5Var;
        if (getLocalTrack(str) == null) {
            promise.reject(new Exception(l5.l("mediaStreamTrackApplyConstraints() could not find track ", str)));
            return;
        }
        e.c cVar = (e.c) this.getUserMediaImpl.c.get(str);
        if (cVar == null || (f5Var = cVar.c) == null) {
            b0.p("Camera track not found!", promise);
        } else {
            f5Var.a(readableMap, new o66(promise, f5Var));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$mediaStreamTrackGetCameraFacingMode$20(String str, Promise promise) {
        if (getLocalTrack(str) == null) {
            promise.reject(GET_CAMERA_FACING_MODE_ERROR, "Local track not found when attempting to get camera facing mode");
            return;
        }
        try {
            e.c cVar = (e.c) this.getUserMediaImpl.c.get(str);
            if (cVar != null) {
                f5 f5Var = cVar.c;
                if (f5Var instanceof wv1) {
                    promise.resolve(((wv1) f5Var).h());
                    return;
                }
            }
            throw new Exception("Track not found when attempting to get camera facing mode");
        } catch (Exception e2) {
            promise.reject(GET_CAMERA_FACING_MODE_ERROR, e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$mediaStreamTrackRelease$17(String str) {
        MediaStreamTrack localTrack = getLocalTrack(str);
        if (localTrack == null) {
            Log.d(TAG, "mediaStreamTrackRelease() track is null");
            return;
        }
        localTrack.setEnabled(false);
        e.c cVar = (e.c) this.getUserMediaImpl.c.remove(str);
        if (cVar != null) {
            SurfaceTextureHelper surfaceTextureHelper = cVar.d;
            f5 f5Var = cVar.c;
            if (cVar.e) {
                return;
            }
            if (f5Var != null && f5Var.g()) {
                f5Var.c();
            }
            if (surfaceTextureHelper != null) {
                surfaceTextureHelper.stopListening();
                surfaceTextureHelper.dispose();
            }
            cVar.a.dispose();
            cVar.b.dispose();
            cVar.e = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$mediaStreamTrackSetEnabled$18(int i, String str, boolean z) {
        f5 f5Var;
        MediaStreamTrack track = getTrack(i, str);
        if (track == null) {
            Log.d(TAG, "mediaStreamTrackSetEnabled() could not find track " + str);
            return;
        }
        if (track.enabled() == z) {
            return;
        }
        track.setEnabled(z);
        e.c cVar = (e.c) this.getUserMediaImpl.c.get(str);
        if (cVar == null || (f5Var = cVar.c) == null) {
            return;
        }
        if (z) {
            f5Var.f();
        } else {
            f5Var.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$mediaStreamTrackSetVideoEffects$23(String str, ReadableArray readableArray) {
        e.c cVar = (e.c) this.getUserMediaImpl.c.get(str);
        if (cVar == null || !(cVar.c instanceof wv1)) {
            return;
        }
        VideoSource videoSource = (VideoSource) cVar.a;
        SurfaceTextureHelper surfaceTextureHelper = cVar.d;
        if (readableArray != null) {
            videoSource.setVideoProcessor(new zpd((List) readableArray.toArrayList().stream().filter(new l66()).map(new m66()).filter(new n66()).collect(Collectors.toList()), surfaceTextureHelper));
        } else {
            videoSource.setVideoProcessor(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$mediaStreamTrackSetVolume$22(int i, String str, double d2) {
        MediaStreamTrack track = getTrack(i, str);
        if (track == null) {
            Log.d(TAG, "mediaStreamTrackSetVolume() could not find track " + str);
            return;
        }
        if (track instanceof AudioTrack) {
            ((AudioTrack) track).setVolume(d2);
        } else {
            Log.d(TAG, "mediaStreamTrackSetVolume() track is not an AudioTrack!");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$mediaStreamTrackSwitchCamera$19(String str, Promise promise) {
        if (getLocalTrack(str) == null) {
            promise.reject(SWITCH_CAMERA_ERROR, "Local track not found when attempting to switch camera");
            return;
        }
        try {
            this.getUserMediaImpl.c(str, new a(promise));
        } catch (Exception e2) {
            promise.reject(SWITCH_CAMERA_ERROR, e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$peerConnectionAddICECandidate$33(int i, Promise promise, ReadableMap readableMap) {
        PeerConnection peerConnection = getPeerConnection(i);
        if (peerConnection == null) {
            Log.d(TAG, "peerConnectionAddICECandidate() peerConnection is null");
            promise.reject(new Exception("PeerConnection not found"));
        } else if (readableMap.hasKey("sdpMid") || readableMap.hasKey("sdpMLineIndex")) {
            peerConnection.addIceCandidate(new IceCandidate((!readableMap.hasKey("sdpMid") || readableMap.isNull("sdpMid")) ? "" : readableMap.getString("sdpMid"), (!readableMap.hasKey("sdpMLineIndex") || readableMap.isNull("sdpMLineIndex")) ? 0 : readableMap.getInt("sdpMLineIndex"), readableMap.getString("candidate")), new f(peerConnection, promise));
        } else {
            promise.reject("E_TYPE_ERROR", "Invalid argument");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object lambda$peerConnectionAddTrack$3(int i, String str, ReadableMap readableMap) {
        ReadableArray array;
        com.oney.WebRTCModule.f fVar = this.mPeerConnectionObservers.get(i);
        if (fVar == null) {
            Log.d(TAG, "peerConnectionAddTrack() peerConnection is null");
            return null;
        }
        MediaStreamTrack localTrack = getLocalTrack(str);
        if (localTrack == null) {
            Log.w(TAG, "peerConnectionAddTrack() couldn't find track " + str);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (readableMap.hasKey("streamIds") && (array = readableMap.getArray("streamIds")) != null) {
            for (int i2 = 0; i2 < array.size(); i2++) {
                arrayList.add(array.getString(i2));
            }
        }
        RtpSender rtpSenderAddTrack = fVar.d.addTrack(localTrack, arrayList);
        RtpTransceiver rtpTransceiverC = fVar.c(rtpSenderAddTrack.id());
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("transceiverOrder", fVar.a());
        writableMapCreateMap.putMap("transceiver", y7e.h(i, rtpTransceiverC));
        writableMapCreateMap.putMap("sender", y7e.f(i, rtpSenderAddTrack));
        return writableMapCreateMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object lambda$peerConnectionAddTransceiver$2(int r6, com.facebook.react.bridge.ReadableMap r7) {
        /*
            r5 = this;
            android.util.SparseArray<com.oney.WebRTCModule.f> r0 = r5.mPeerConnectionObservers
            java.lang.Object r0 = r0.get(r6)
            com.oney.WebRTCModule.f r0 = (com.oney.WebRTCModule.f) r0
            r1 = 0
            if (r0 != 0) goto L13
            java.lang.String r5 = com.oney.WebRTCModule.WebRTCModule.TAG
            java.lang.String r6 = "peerConnectionAddTransceiver() peerConnection is null"
            android.util.Log.d(r5, r6)
            return r1
        L13:
            java.lang.String r2 = "type"
            boolean r3 = r7.hasKey(r2)
            java.lang.String r4 = "init"
            if (r3 == 0) goto L54
            java.lang.String r5 = r7.getString(r2)
            r5.getClass()
            java.lang.String r2 = "audio"
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L3f
            java.lang.String r2 = "video"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L37
            org.webrtc.MediaStreamTrack$MediaType r5 = org.webrtc.MediaStreamTrack.MediaType.MEDIA_TYPE_VIDEO
            goto L41
        L37:
            java.lang.Error r5 = new java.lang.Error
            java.lang.String r6 = "Unknown media type"
            r5.<init>(r6)
            throw r5
        L3f:
            org.webrtc.MediaStreamTrack$MediaType r5 = org.webrtc.MediaStreamTrack.MediaType.MEDIA_TYPE_AUDIO
        L41:
            com.facebook.react.bridge.ReadableMap r7 = r7.getMap(r4)
            org.webrtc.RtpTransceiver$RtpTransceiverInit r7 = defpackage.y7e.a(r7)
            org.webrtc.PeerConnection r2 = r0.d
            if (r2 != 0) goto L4f
        L4d:
            r5 = r1
            goto L75
        L4f:
            org.webrtc.RtpTransceiver r5 = r2.addTransceiver(r5, r7)
            goto L75
        L54:
            java.lang.String r2 = "trackId"
            boolean r3 = r7.hasKey(r2)
            if (r3 == 0) goto L96
            java.lang.String r2 = r7.getString(r2)
            org.webrtc.MediaStreamTrack r5 = r5.getLocalTrack(r2)
            com.facebook.react.bridge.ReadableMap r7 = r7.getMap(r4)
            org.webrtc.RtpTransceiver$RtpTransceiverInit r7 = defpackage.y7e.a(r7)
            org.webrtc.PeerConnection r2 = r0.d
            if (r2 != 0) goto L71
            goto L4d
        L71:
            org.webrtc.RtpTransceiver r5 = r2.addTransceiver(r5, r7)
        L75:
            if (r5 != 0) goto L7f
            java.lang.String r5 = com.oney.WebRTCModule.WebRTCModule.TAG
            java.lang.String r6 = "peerConnectionAddTransceiver() Error adding transceiver"
            android.util.Log.d(r5, r6)
            return r1
        L7f:
            com.facebook.react.bridge.WritableMap r7 = com.facebook.react.bridge.Arguments.createMap()
            java.lang.String r1 = "transceiverOrder"
            int r0 = r0.a()
            r7.putInt(r1, r0)
            java.lang.String r0 = "transceiver"
            com.facebook.react.bridge.WritableMap r5 = defpackage.y7e.h(r6, r5)
            r7.putMap(r0, r5)
            return r7
        L96:
            java.lang.String r5 = com.oney.WebRTCModule.WebRTCModule.TAG
            java.lang.String r6 = "peerConnectionAddTransceiver() no type nor trackId provided in options"
            android.util.Log.d(r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.oney.WebRTCModule.WebRTCModule.lambda$peerConnectionAddTransceiver$2(int, com.facebook.react.bridge.ReadableMap):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$peerConnectionClose$35(int i) {
        com.oney.WebRTCModule.f fVar = this.mPeerConnectionObservers.get(i);
        if (fVar == null || fVar.d == null) {
            Log.d(TAG, "peerConnectionClose() peerConnection is null");
            return;
        }
        Log.d(com.oney.WebRTCModule.f.j, "PeerConnection.close() for " + fVar.b);
        fVar.d.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$peerConnectionCreateAnswer$26(int i, Promise promise, ReadableMap readableMap) {
        PeerConnection peerConnection = getPeerConnection(i);
        if (peerConnection != null) {
            peerConnection.createAnswer(new c(promise, this, peerConnection), constraintsForOptions(readableMap));
        } else {
            Log.d(TAG, "peerConnectionCreateAnswer() peerConnection is null");
            promise.reject(new Exception("PeerConnection not found"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$peerConnectionCreateOffer$25(int i, Promise promise, ReadableMap readableMap) {
        com.oney.WebRTCModule.f fVar = this.mPeerConnectionObservers.get(i);
        PeerConnection peerConnection = fVar.d;
        if (peerConnection == null) {
            Log.d(TAG, "peerConnectionCreateOffer() peerConnection is null");
            promise.reject(new Exception("PeerConnection not found"));
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<RtpTransceiver> it = peerConnection.getTransceivers().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getReceiver().id());
        }
        peerConnection.createOffer(new b(i, promise, fVar, this, arrayList, peerConnection), constraintsForOptions(readableMap));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$peerConnectionDispose$36(int i) {
        com.oney.WebRTCModule.f fVar = this.mPeerConnectionObservers.get(i);
        if (fVar == null || fVar.d == null) {
            Log.d(TAG, "peerConnectionDispose() peerConnection is null");
        }
        Log.d(com.oney.WebRTCModule.f.j, "PeerConnection.dispose() for " + fVar.b);
        for (MediaStreamTrack mediaStreamTrack : fVar.g.values()) {
            if (mediaStreamTrack instanceof VideoTrack) {
                vog vogVar = fVar.h;
                VideoTrack videoTrack = (VideoTrack) mediaStreamTrack;
                vogVar.getClass();
                String strId = videoTrack.id();
                vog.a aVar = (vog.a) vogVar.a.remove(strId);
                if (aVar == null) {
                    Log.w("vog", "removeAdapter - no adapter for " + strId);
                } else {
                    videoTrack.removeSink(aVar);
                    aVar.b = true;
                    synchronized (aVar) {
                        try {
                            uog uogVar = aVar.a;
                            if (uogVar != null) {
                                uogVar.cancel();
                                aVar.a = null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    Log.d("vog", "Deleted adapter for " + strId);
                }
            }
        }
        Iterator it = fVar.a.values().iterator();
        while (it.hasNext()) {
            ((zd3) it.next()).b.unregisterObserver();
        }
        fVar.d.dispose();
        fVar.e.clear();
        fVar.f.clear();
        fVar.g.clear();
        fVar.a.clear();
        this.mPeerConnectionObservers.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$peerConnectionGetStats$34(int i, Promise promise) {
        PeerConnection peerConnection;
        com.oney.WebRTCModule.f fVar = this.mPeerConnectionObservers.get(i);
        if (fVar != null && (peerConnection = fVar.d) != null) {
            peerConnection.getStats(new i73(promise, 9));
        } else {
            Log.d(TAG, "peerConnectionGetStats() peerConnection is null");
            promise.resolve(nve.b(new RTCStatsReport(0L, new HashMap())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Boolean lambda$peerConnectionInit$0(int i, PeerConnection.RTCConfiguration rTCConfiguration) {
        com.oney.WebRTCModule.f fVar = new com.oney.WebRTCModule.f(this, i);
        PeerConnection peerConnectionCreatePeerConnection = this.mFactory.createPeerConnection(rTCConfiguration, fVar);
        if (peerConnectionCreatePeerConnection == null) {
            return Boolean.FALSE;
        }
        fVar.d = peerConnectionCreatePeerConnection;
        this.mPeerConnectionObservers.put(i, fVar);
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object lambda$peerConnectionRemoveTrack$4(int i, String str) {
        com.oney.WebRTCModule.f fVar = this.mPeerConnectionObservers.get(i);
        if (fVar == null) {
            Log.d(TAG, "peerConnectionRemoveTrack() peerConnection is null");
            return Boolean.FALSE;
        }
        RtpSender rtpSenderB = fVar.b(str);
        if (rtpSenderB != null) {
            return Boolean.valueOf(fVar.d.removeTrack(rtpSenderB));
        }
        Log.w(TAG, "peerConnectionRemoveTrack() sender is null");
        return Boolean.FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$peerConnectionRestartIce$37(int i) {
        PeerConnection peerConnection = getPeerConnection(i);
        if (peerConnection == null) {
            Log.w(TAG, "peerConnectionRestartIce() peerConnection is null");
        } else {
            peerConnection.restartIce();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$peerConnectionSetConfiguration$24(int i, ReadableMap readableMap) {
        PeerConnection peerConnection = getPeerConnection(i);
        if (peerConnection == null) {
            Log.d(TAG, "peerConnectionSetConfiguration() peerConnection is null");
        } else {
            peerConnection.setConfiguration(parseRTCConfiguration(readableMap));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$peerConnectionSetLocalDescription$27(int i, Promise promise, ReadableMap readableMap) {
        PeerConnection peerConnection = getPeerConnection(i);
        if (peerConnection == null) {
            Log.d(TAG, "peerConnectionSetLocalDescription() peerConnection is null");
            promise.reject(new Exception("PeerConnection not found"));
            return;
        }
        d dVar = new d(promise, this, peerConnection);
        if (readableMap == null) {
            peerConnection.setLocalDescription(dVar);
            return;
        }
        String string = readableMap.getString("type");
        Objects.requireNonNull(string);
        peerConnection.setLocalDescription(dVar, new SessionDescription(SessionDescription.Type.fromCanonicalForm(string), readableMap.getString("sdp")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$peerConnectionSetRemoteDescription$28(int i, Promise promise, ReadableMap readableMap) {
        com.oney.WebRTCModule.f fVar = this.mPeerConnectionObservers.get(i);
        PeerConnection peerConnection = fVar.d;
        if (peerConnection == null) {
            Log.d(TAG, "peerConnectionSetRemoteDescription() peerConnection is null");
            promise.reject(new Exception("PeerConnection not found"));
            return;
        }
        SessionDescription sessionDescription = new SessionDescription(SessionDescription.Type.fromCanonicalForm(readableMap.getString("type")), readableMap.getString("sdp"));
        ArrayList arrayList = new ArrayList();
        Iterator<RtpTransceiver> it = peerConnection.getTransceivers().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getReceiver().id());
        }
        peerConnection.setRemoteDescription(new e(i, promise, fVar, this, arrayList, peerConnection), sessionDescription);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object lambda$receiverGetCapabilities$29(String str) {
        MediaStreamTrack.MediaType mediaType;
        if (str.equals(MediaStreamTrack.AUDIO_TRACK_KIND)) {
            mediaType = MediaStreamTrack.MediaType.MEDIA_TYPE_AUDIO;
        } else {
            if (!str.equals(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                return Arguments.createMap();
            }
            mediaType = MediaStreamTrack.MediaType.MEDIA_TYPE_VIDEO;
        }
        RtpCapabilities rtpReceiverCapabilities = this.mFactory.getRtpReceiverCapabilities(mediaType);
        WritableMap writableMapCreateMap = Arguments.createMap();
        WritableArray writableArrayCreateArray = Arguments.createArray();
        rtpReceiverCapabilities.codecs.forEach(new t7e(writableArrayCreateArray));
        writableMapCreateMap.putArray("codecs", writableArrayCreateArray);
        return writableMapCreateMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$receiverGetStats$31(int i, Promise promise, String str) {
        PeerConnection peerConnection;
        RtpReceiver next;
        com.oney.WebRTCModule.f fVar = this.mPeerConnectionObservers.get(i);
        if (fVar == null || (peerConnection = fVar.d) == null) {
            Log.d(TAG, "receiverGetStats() peerConnection is null");
            promise.resolve(nve.b(new RTCStatsReport(0L, new HashMap())));
            return;
        }
        Iterator<RtpReceiver> it = peerConnection.getReceivers().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next.id().equals(str)) {
                    break;
                }
            }
        }
        if (next != null) {
            fVar.d.getStats(next, new wk3(promise, 6));
            return;
        }
        Log.w(com.oney.WebRTCModule.f.j, "receiverGetStats(): Receiver ID " + str + " not found");
        promise.resolve(nve.b(new RTCStatsReport(0L, new HashMap())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object lambda$senderGetCapabilities$30(String str) {
        MediaStreamTrack.MediaType mediaType;
        if (str.equals(MediaStreamTrack.AUDIO_TRACK_KIND)) {
            mediaType = MediaStreamTrack.MediaType.MEDIA_TYPE_AUDIO;
        } else {
            if (!str.equals(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                return Arguments.createMap();
            }
            mediaType = MediaStreamTrack.MediaType.MEDIA_TYPE_VIDEO;
        }
        RtpCapabilities rtpSenderCapabilities = this.mFactory.getRtpSenderCapabilities(mediaType);
        WritableMap writableMapCreateMap = Arguments.createMap();
        WritableArray writableArrayCreateArray = Arguments.createArray();
        rtpSenderCapabilities.codecs.forEach(new t7e(writableArrayCreateArray));
        writableMapCreateMap.putArray("codecs", writableArrayCreateArray);
        return writableMapCreateMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$senderGetStats$32(int i, Promise promise, String str) {
        PeerConnection peerConnection;
        RtpSender next;
        com.oney.WebRTCModule.f fVar = this.mPeerConnectionObservers.get(i);
        if (fVar == null || (peerConnection = fVar.d) == null) {
            Log.d(TAG, "senderGetStats() peerConnection is null");
            promise.resolve(nve.b(new RTCStatsReport(0L, new HashMap())));
            return;
        }
        Iterator<RtpSender> it = peerConnection.getSenders().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (next.id().equals(str)) {
                    break;
                }
            }
        }
        if (next != null) {
            fVar.d.getStats(next, new a73(promise, 4));
            return;
        }
        Log.w(com.oney.WebRTCModule.f.j, "senderGetStats(): Sender ID " + str + " not found");
        promise.resolve(nve.b(new RTCStatsReport(0L, new HashMap())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$senderReplaceTrack$7(int i, Promise promise, String str, String str2) {
        try {
            com.oney.WebRTCModule.f fVar = this.mPeerConnectionObservers.get(i);
            if (fVar == null) {
                Log.d(TAG, "senderReplaceTrack() peerConnectionObserver is null");
                promise.reject(new Exception("Peer Connection is not initialized"));
                return;
            }
            RtpSender rtpSenderB = fVar.b(str);
            if (rtpSenderB == null) {
                Log.w(TAG, "senderReplaceTrack() sender is null");
                promise.reject(new Exception("Could not get sender"));
            } else {
                rtpSenderB.setTrack(getLocalTrack(str2), false);
                promise.resolve(Boolean.TRUE);
            }
        } catch (Exception e2) {
            Log.d(TAG, "senderReplaceTrack(): " + e2.getMessage());
            promise.reject(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$senderSetParameters$5(int i, Promise promise, String str, ReadableMap readableMap) {
        try {
            com.oney.WebRTCModule.f fVar = this.mPeerConnectionObservers.get(i);
            if (fVar == null) {
                Log.d(TAG, "senderSetParameters() peerConnectionObserver is null");
                promise.reject(new Exception("Peer Connection is not initialized"));
                return;
            }
            RtpSender rtpSenderB = fVar.b(str);
            if (rtpSenderB == null) {
                Log.w(TAG, "senderSetParameters() sender is null");
                promise.reject(new Exception("Could not get sender"));
            } else {
                rtpSenderB.setParameters(y7e.i(readableMap, rtpSenderB.getParameters()));
                promise.resolve(y7e.e(rtpSenderB.getParameters()));
            }
        } catch (Exception e2) {
            Log.d(TAG, "senderSetParameters: " + e2.getMessage());
            promise.reject(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$setAudioDevice$42(String str) {
        this.dailyWebRTCDevicesManager.b(str);
        com.oney.WebRTCModule.b bVar = this.dailyAudioManager;
        if (bVar != null) {
            bVar.e.execute(new ed3(0, bVar, b.EnumC0189b.d));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$transceiverSetCodecPreferences$9(int i, String str, ReadableArray readableArray) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        Arguments.createMap();
        writableMapCreateMap.putInt("peerConnectionId", i);
        writableMapCreateMap.putString("transceiverId", str);
        try {
            com.oney.WebRTCModule.f fVar = this.mPeerConnectionObservers.get(i);
            if (fVar == null) {
                Log.d(TAG, "transceiverSetDirection() peerConnectionObserver is null");
                return;
            }
            RtpTransceiver rtpTransceiverC = fVar.c(str);
            if (rtpTransceiverC == null) {
                Log.d(TAG, "transceiverSetDirection() transceiver is null");
                return;
            }
            RtpTransceiver.RtpTransceiverDirection direction = rtpTransceiverC.getDirection();
            ArrayList arrayList = new ArrayList();
            if (direction.equals(RtpTransceiver.RtpTransceiverDirection.SEND_RECV) || direction.equals(RtpTransceiver.RtpTransceiverDirection.SEND_ONLY)) {
                for (RtpCapabilities.CodecCapability codecCapability : this.mFactory.getRtpSenderCapabilities(rtpTransceiverC.getMediaType()).codecs) {
                    arrayList.add(new Pair(y7e.d(codecCapability).toHashMap(), codecCapability));
                }
            }
            if (direction.equals(RtpTransceiver.RtpTransceiverDirection.SEND_RECV) || direction.equals(RtpTransceiver.RtpTransceiverDirection.RECV_ONLY)) {
                for (RtpCapabilities.CodecCapability codecCapability2 : this.mFactory.getRtpReceiverCapabilities(rtpTransceiverC.getMediaType()).codecs) {
                    arrayList.add(new Pair(y7e.d(codecCapability2).toHashMap(), codecCapability2));
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < readableArray.size(); i2++) {
                HashMap<String, Object> hashMap = readableArray.getMap(i2).toHashMap();
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        if (hashMap.equals((Map) pair.first)) {
                            arrayList2.add((RtpCapabilities.CodecCapability) pair.second);
                            break;
                        }
                    }
                }
            }
            rtpTransceiverC.setCodecPreferences(arrayList2);
        } catch (Exception e2) {
            Log.d(TAG, "transceiverSetCodecPreferences(): " + e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$transceiverSetDirection$8(int i, String str, Promise promise, String str2) {
        RtpTransceiver.RtpTransceiverDirection rtpTransceiverDirection;
        WritableMap writableMapCreateMap = Arguments.createMap();
        Arguments.createMap();
        writableMapCreateMap.putInt("peerConnectionId", i);
        writableMapCreateMap.putString("transceiverId", str);
        try {
            com.oney.WebRTCModule.f fVar = this.mPeerConnectionObservers.get(i);
            if (fVar == null) {
                Log.d(TAG, "transceiverSetDirection() peerConnectionObserver is null");
                promise.reject(new Exception("Peer Connection is not initialized"));
                return;
            }
            RtpTransceiver rtpTransceiverC = fVar.c(str);
            if (rtpTransceiverC == null) {
                Log.d(TAG, "transceiverSetDirection() transceiver is null");
                promise.reject(new Exception("Could not get sender"));
                return;
            }
            str2.getClass();
            switch (str2) {
                case "recvonly":
                    rtpTransceiverDirection = RtpTransceiver.RtpTransceiverDirection.RECV_ONLY;
                    break;
                case "inactive":
                    rtpTransceiverDirection = RtpTransceiver.RtpTransceiverDirection.INACTIVE;
                    break;
                case "sendonly":
                    rtpTransceiverDirection = RtpTransceiver.RtpTransceiverDirection.SEND_ONLY;
                    break;
                case "sendrecv":
                    rtpTransceiverDirection = RtpTransceiver.RtpTransceiverDirection.SEND_RECV;
                    break;
                default:
                    throw new Error("Invalid direction");
            }
            rtpTransceiverC.setDirection(rtpTransceiverDirection);
            promise.resolve(Boolean.TRUE);
        } catch (Exception e2) {
            Log.d(TAG, "transceiverSetDirection(): " + e2.getMessage());
            promise.reject(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$transceiverStop$6(int i, Promise promise, String str) {
        try {
            com.oney.WebRTCModule.f fVar = this.mPeerConnectionObservers.get(i);
            if (fVar == null) {
                Log.d(TAG, "transceiverStop() peerConnectionObserver is null");
                promise.reject(new Exception("Peer Connection is not initialized"));
                return;
            }
            RtpTransceiver rtpTransceiverC = fVar.c(str);
            if (rtpTransceiverC == null) {
                Log.w(TAG, "transceiverStop() transceiver is null");
                promise.reject(new Exception("Could not get transceiver"));
            } else {
                rtpTransceiverC.stopStandard();
                promise.resolve(Boolean.TRUE);
            }
        } catch (Exception e2) {
            Log.d(TAG, "transceiverStop(): " + e2.getMessage());
            promise.reject(e2);
        }
    }

    private PeerConnection.RTCConfiguration parseRTCConfiguration(ReadableMap readableMap) {
        int i;
        String string;
        String string2;
        String string3;
        String string4;
        int i2;
        String string5;
        String string6;
        String string7;
        PeerConnection.RTCConfiguration rTCConfiguration = new PeerConnection.RTCConfiguration(createIceServers((readableMap == null || !readableMap.hasKey("iceServers")) ? null : readableMap.getArray("iceServers")));
        rTCConfiguration.sdpSemantics = PeerConnection.SdpSemantics.UNIFIED_PLAN;
        rTCConfiguration.enableImplicitRollback = true;
        rTCConfiguration.cryptoOptions = CryptoOptions.builder().setEnableGcmCryptoSuites(true).setEnableAes128Sha1_32CryptoCipher(false).setEnableEncryptedRtpHeaderExtensions(false).setRequireFrameEncryption(false).createCryptoOptions();
        if (readableMap != null) {
            if (readableMap.hasKey("iceTransportPolicy") && readableMap.getType("iceTransportPolicy") == ReadableType.String && (string7 = readableMap.getString("iceTransportPolicy")) != null) {
                switch (string7) {
                    case "nohost":
                        rTCConfiguration.iceTransportsType = PeerConnection.IceTransportsType.NOHOST;
                        break;
                    case "all":
                        rTCConfiguration.iceTransportsType = PeerConnection.IceTransportsType.ALL;
                        break;
                    case "none":
                        rTCConfiguration.iceTransportsType = PeerConnection.IceTransportsType.NONE;
                        break;
                    case "relay":
                        rTCConfiguration.iceTransportsType = PeerConnection.IceTransportsType.RELAY;
                        break;
                }
            }
            if (readableMap.hasKey("bundlePolicy") && readableMap.getType("bundlePolicy") == ReadableType.String && (string6 = readableMap.getString("bundlePolicy")) != null) {
                switch (string6) {
                    case "balanced":
                        rTCConfiguration.bundlePolicy = PeerConnection.BundlePolicy.BALANCED;
                        break;
                    case "max-bundle":
                        rTCConfiguration.bundlePolicy = PeerConnection.BundlePolicy.MAXBUNDLE;
                        break;
                    case "max-compat":
                        rTCConfiguration.bundlePolicy = PeerConnection.BundlePolicy.MAXCOMPAT;
                        break;
                }
            }
            if (readableMap.hasKey("rtcpMuxPolicy") && readableMap.getType("rtcpMuxPolicy") == ReadableType.String && (string5 = readableMap.getString("rtcpMuxPolicy")) != null) {
                if (string5.equals("negotiate")) {
                    rTCConfiguration.rtcpMuxPolicy = PeerConnection.RtcpMuxPolicy.NEGOTIATE;
                } else if (string5.equals("require")) {
                    rTCConfiguration.rtcpMuxPolicy = PeerConnection.RtcpMuxPolicy.REQUIRE;
                }
            }
            if (readableMap.hasKey("iceCandidatePoolSize") && readableMap.getType("iceCandidatePoolSize") == ReadableType.Number && (i2 = readableMap.getInt("iceCandidatePoolSize")) > 0) {
                rTCConfiguration.iceCandidatePoolSize = i2;
            }
            if (readableMap.hasKey("tcpCandidatePolicy") && readableMap.getType("tcpCandidatePolicy") == ReadableType.String && (string4 = readableMap.getString("tcpCandidatePolicy")) != null) {
                if (string4.equals("enabled")) {
                    rTCConfiguration.tcpCandidatePolicy = PeerConnection.TcpCandidatePolicy.ENABLED;
                } else if (string4.equals("disabled")) {
                    rTCConfiguration.tcpCandidatePolicy = PeerConnection.TcpCandidatePolicy.DISABLED;
                }
            }
            if (readableMap.hasKey("candidateNetworkPolicy") && readableMap.getType("candidateNetworkPolicy") == ReadableType.String && (string3 = readableMap.getString("candidateNetworkPolicy")) != null) {
                if (string3.equals("low_cost")) {
                    rTCConfiguration.candidateNetworkPolicy = PeerConnection.CandidateNetworkPolicy.LOW_COST;
                } else if (string3.equals("all")) {
                    rTCConfiguration.candidateNetworkPolicy = PeerConnection.CandidateNetworkPolicy.ALL;
                }
            }
            if (readableMap.hasKey("keyType") && readableMap.getType("keyType") == ReadableType.String && (string2 = readableMap.getString("keyType")) != null) {
                if (string2.equals("RSA")) {
                    rTCConfiguration.keyType = PeerConnection.KeyType.RSA;
                } else if (string2.equals("ECDSA")) {
                    rTCConfiguration.keyType = PeerConnection.KeyType.ECDSA;
                }
            }
            if (readableMap.hasKey("continualGatheringPolicy") && readableMap.getType("continualGatheringPolicy") == ReadableType.String && (string = readableMap.getString("continualGatheringPolicy")) != null) {
                if (string.equals("gather_once")) {
                    rTCConfiguration.continualGatheringPolicy = PeerConnection.ContinualGatheringPolicy.GATHER_ONCE;
                } else if (string.equals("gather_continually")) {
                    rTCConfiguration.continualGatheringPolicy = PeerConnection.ContinualGatheringPolicy.GATHER_CONTINUALLY;
                }
            }
            if (readableMap.hasKey("audioJitterBufferMaxPackets") && readableMap.getType("audioJitterBufferMaxPackets") == ReadableType.Number && (i = readableMap.getInt("audioJitterBufferMaxPackets")) > 0) {
                rTCConfiguration.audioJitterBufferMaxPackets = i;
            }
            if (readableMap.hasKey("iceConnectionReceivingTimeout") && readableMap.getType("iceConnectionReceivingTimeout") == ReadableType.Number) {
                rTCConfiguration.iceConnectionReceivingTimeout = readableMap.getInt("iceConnectionReceivingTimeout");
            }
            if (readableMap.hasKey("iceBackupCandidatePairPingInterval") && readableMap.getType("iceBackupCandidatePairPingInterval") == ReadableType.Number) {
                rTCConfiguration.iceBackupCandidatePairPingInterval = readableMap.getInt("iceBackupCandidatePairPingInterval");
            }
            if (readableMap.hasKey("audioJitterBufferFastAccelerate") && readableMap.getType("audioJitterBufferFastAccelerate") == ReadableType.Boolean) {
                rTCConfiguration.audioJitterBufferFastAccelerate = readableMap.getBoolean("audioJitterBufferFastAccelerate");
            }
            if (readableMap.hasKey("pruneTurnPorts") && readableMap.getType("pruneTurnPorts") == ReadableType.Boolean) {
                rTCConfiguration.pruneTurnPorts = readableMap.getBoolean("pruneTurnPorts");
            }
            if (readableMap.hasKey("presumeWritableWhenFullyRelayed") && readableMap.getType("presumeWritableWhenFullyRelayed") == ReadableType.Boolean) {
                rTCConfiguration.presumeWritableWhenFullyRelayed = readableMap.getBoolean("presumeWritableWhenFullyRelayed");
            }
        }
        return rTCConfiguration;
    }

    @ReactMethod
    public void addListener(String str) {
    }

    public MediaConstraints constraintsForOptions(ReadableMap readableMap) {
        MediaConstraints mediaConstraints = new MediaConstraints();
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            mediaConstraints.mandatory.add(new MediaConstraints.KeyValuePair(strNextKey, sjc.a(readableMap, strNextKey)));
        }
        return mediaConstraints;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap createDataChannel(final int i, final String str, final ReadableMap readableMap) {
        try {
            return (WritableMap) dlf.a.submit(new Callable() { // from class: fvg
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.lambda$createDataChannel$38(i, str, readableMap);
                }
            }).get();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    public void createStream(MediaStreamTrack[] mediaStreamTrackArr, e.b<String, ArrayList<WritableMap>> bVar) {
        this.getUserMediaImpl.a(mediaStreamTrackArr, bVar);
    }

    public VideoTrack createVideoTrack(f5 f5Var) {
        return this.getUserMediaImpl.b(f5Var);
    }

    @ReactMethod
    public void dataChannelClose(final int i, final String str) {
        dlf.a(new Runnable() { // from class: kvg
            @Override // java.lang.Runnable
            public final void run() {
                this.a.lambda$dataChannelClose$39(i, str);
            }
        });
    }

    @ReactMethod
    public void dataChannelDispose(int i, String str) {
        dlf.a(new bg2(this, i, 2, str));
    }

    @ReactMethod
    public void dataChannelSend(final int i, final String str, final String str2, final String str3) {
        dlf.a(new Runnable() { // from class: nvg
            @Override // java.lang.Runnable
            public final void run() {
                this.a.lambda$dataChannelSend$41(i, str, str2, str3);
            }
        });
    }

    @ReactMethod
    public void enumerateDevices(Callback callback) {
        dlf.a(new ky0(8, this, callback));
    }

    @ReactMethod
    public void getAudioDevice(Promise promise) {
        dlf.a(new w71(5, this, promise));
    }

    @ReactMethod
    public void getDisplayMedia(Promise promise) {
        dlf.a(new yc4(3, this, promise));
    }

    public MediaStreamTrack getLocalTrack(String str) {
        e.c cVar = (e.c) this.getUserMediaImpl.c.get(str);
        if (cVar == null) {
            return null;
        }
        return cVar.b;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "WebRTCModule";
    }

    public MediaStream getStreamForReactTag(final String str) {
        try {
            return (MediaStream) dlf.a.submit(new Callable() { // from class: mvg
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.lambda$getStreamForReactTag$1(str);
                }
            }).get();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    public MediaStreamTrack getTrack(int i, String str) {
        if (i == -1) {
            return getLocalTrack(str);
        }
        com.oney.WebRTCModule.f fVar = this.mPeerConnectionObservers.get(i);
        if (fVar != null) {
            return (MediaStreamTrack) fVar.g.get(str);
        }
        Log.d(TAG, "getTrack(): could not find PeerConnection");
        return null;
    }

    @ReactMethod
    public void getUserMedia(final ReadableMap readableMap, final Callback callback, final Callback callback2) {
        dlf.a(new Runnable() { // from class: uvg
            @Override // java.lang.Runnable
            public final void run() {
                this.a.lambda$getUserMedia$11(readableMap, callback, callback2);
            }
        });
    }

    @ReactMethod
    public void mediaStreamAddTrack(final String str, final int i, final String str2) {
        dlf.a(new Runnable() { // from class: pvg
            @Override // java.lang.Runnable
            public final void run() {
                this.a.lambda$mediaStreamAddTrack$14(str, i, str2);
            }
        });
    }

    @ReactMethod
    public void mediaStreamCreate(String str) {
        dlf.a(new vb0(5, this, str));
    }

    @ReactMethod
    public void mediaStreamRelease(String str) {
        dlf.a(new tm1(7, this, str));
    }

    @ReactMethod
    public void mediaStreamRemoveTrack(final String str, final int i, final String str2) {
        dlf.a(new Runnable() { // from class: lvg
            @Override // java.lang.Runnable
            public final void run() {
                this.a.lambda$mediaStreamRemoveTrack$15(str, i, str2);
            }
        });
    }

    @ReactMethod
    public void mediaStreamTrackApplyConstraints(String str, ReadableMap readableMap, Promise promise) {
        dlf.a(new lm9(this, str, readableMap, promise, 1));
    }

    @ReactMethod
    public void mediaStreamTrackGetCameraFacingMode(String str, Promise promise) {
        dlf.a(new n4(2, this, str, promise));
    }

    @ReactMethod
    public void mediaStreamTrackRelease(String str) {
        dlf.a(new cg2(5, this, str));
    }

    @ReactMethod
    public void mediaStreamTrackSetEnabled(final int i, final String str, final boolean z) {
        dlf.a(new Runnable() { // from class: ivg
            @Override // java.lang.Runnable
            public final void run() {
                this.a.lambda$mediaStreamTrackSetEnabled$18(i, str, z);
            }
        });
    }

    @ReactMethod
    public void mediaStreamTrackSetVideoEffects(String str, ReadableArray readableArray) {
        dlf.a(new dm3(3, this, str, readableArray));
    }

    @ReactMethod
    public void mediaStreamTrackSetVolume(final int i, final String str, final double d2) {
        dlf.a(new Runnable() { // from class: yug
            @Override // java.lang.Runnable
            public final void run() {
                this.a.lambda$mediaStreamTrackSetVolume$22(i, str, d2);
            }
        });
    }

    @ReactMethod
    public void mediaStreamTrackSwitchCamera(String str, Promise promise) {
        dlf.a(new km9(1, this, str, promise));
    }

    @ReactMethod
    public void peerConnectionAddICECandidate(final int i, final ReadableMap readableMap, final Promise promise) {
        dlf.a(new Runnable() { // from class: vvg
            @Override // java.lang.Runnable
            public final void run() {
                this.a.lambda$peerConnectionAddICECandidate$33(i, promise, readableMap);
            }
        });
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap peerConnectionAddTrack(final int i, final String str, final ReadableMap readableMap) {
        try {
            try {
                return (WritableMap) dlf.a.submit(new Callable() { // from class: avg
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.a.lambda$peerConnectionAddTrack$3(i, str, readableMap);
                    }
                }).get();
            } catch (ExecutionException e2) {
                e = e2;
                Log.d(TAG, "peerConnectionAddTrack() " + e.getMessage());
                return null;
            }
        } catch (InterruptedException | ExecutionException e3) {
            e = e3;
        }
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap peerConnectionAddTransceiver(final int i, final ReadableMap readableMap) {
        try {
            try {
                return (WritableMap) dlf.a.submit(new Callable() { // from class: bvg
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.a.lambda$peerConnectionAddTransceiver$2(i, readableMap);
                    }
                }).get();
            } catch (ExecutionException e2) {
                e = e2;
                Log.d(TAG, "peerConnectionAddTransceiver() " + e.getMessage());
                return null;
            }
        } catch (InterruptedException | ExecutionException e3) {
            e = e3;
        }
    }

    @ReactMethod
    public void peerConnectionClose(final int i) {
        dlf.a(new Runnable() { // from class: evg
            @Override // java.lang.Runnable
            public final void run() {
                this.a.lambda$peerConnectionClose$35(i);
            }
        });
    }

    @ReactMethod
    public void peerConnectionCreateAnswer(final int i, final ReadableMap readableMap, final Promise promise) {
        dlf.a(new Runnable() { // from class: jvg
            @Override // java.lang.Runnable
            public final void run() {
                this.a.lambda$peerConnectionCreateAnswer$26(i, promise, readableMap);
            }
        });
    }

    @ReactMethod
    public void peerConnectionCreateOffer(int i, ReadableMap readableMap, Promise promise) {
        dlf.a(new uk9(i, 1, this, promise, readableMap));
    }

    @ReactMethod
    public void peerConnectionDispose(final int i) {
        dlf.a(new Runnable() { // from class: vug
            @Override // java.lang.Runnable
            public final void run() {
                this.a.lambda$peerConnectionDispose$36(i);
            }
        });
    }

    @ReactMethod
    public void peerConnectionGetStats(int i, Promise promise) {
        dlf.a(new bg2(this, i, 1, promise));
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean peerConnectionInit(ReadableMap readableMap, final int i) {
        final PeerConnection.RTCConfiguration rTCConfiguration = parseRTCConfiguration(readableMap);
        try {
        } catch (InterruptedException | ExecutionException e2) {
            e = e2;
        }
        try {
            return ((Boolean) dlf.a.submit(new Callable() { // from class: tvg
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.lambda$peerConnectionInit$0(i, rTCConfiguration);
                }
            }).get()).booleanValue();
        } catch (InterruptedException e3) {
            e = e3;
            e.printStackTrace();
            l5.r(e);
            return false;
        }
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean peerConnectionRemoveTrack(final int i, final String str) {
        try {
        } catch (InterruptedException | ExecutionException e2) {
            e = e2;
        }
        try {
            return ((Boolean) dlf.a.submit(new Callable() { // from class: qvg
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.lambda$peerConnectionRemoveTrack$4(i, str);
                }
            }).get()).booleanValue();
        } catch (ExecutionException e3) {
            e = e3;
            Log.d(TAG, "peerConnectionRemoveTrack() " + e.getMessage());
            return false;
        }
    }

    @ReactMethod
    public void peerConnectionRestartIce(int i) {
        dlf.a(new s0f(this, i, 1));
    }

    @ReactMethod
    public void peerConnectionSetConfiguration(ReadableMap readableMap, int i) {
        dlf.a(new yg9(this, i, readableMap));
    }

    @ReactMethod
    public void peerConnectionSetLocalDescription(final int i, final ReadableMap readableMap, final Promise promise) {
        dlf.a(new Runnable() { // from class: wug
            @Override // java.lang.Runnable
            public final void run() {
                this.a.lambda$peerConnectionSetLocalDescription$27(i, promise, readableMap);
            }
        });
    }

    @ReactMethod
    public void peerConnectionSetRemoteDescription(final int i, final ReadableMap readableMap, final Promise promise) {
        dlf.a(new Runnable() { // from class: gvg
            @Override // java.lang.Runnable
            public final void run() {
                this.a.lambda$peerConnectionSetRemoteDescription$28(i, promise, readableMap);
            }
        });
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap receiverGetCapabilities(final String str) {
        try {
        } catch (InterruptedException | ExecutionException e2) {
            e = e2;
        }
        try {
            return (WritableMap) dlf.a.submit(new Callable() { // from class: rvg
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.lambda$receiverGetCapabilities$29(str);
                }
            }).get();
        } catch (InterruptedException e3) {
            e = e3;
            Log.d(TAG, "receiverGetCapabilities() " + e.getMessage());
            return null;
        }
    }

    @ReactMethod
    public void receiverGetStats(final int i, final String str, final Promise promise) {
        dlf.a(new Runnable() { // from class: dvg
            @Override // java.lang.Runnable
            public final void run() {
                this.a.lambda$receiverGetStats$31(i, promise, str);
            }
        });
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }

    public void sendEvent(String str, ReadableMap readableMap) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, readableMap);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap senderGetCapabilities(String str) {
        try {
        } catch (InterruptedException | ExecutionException e2) {
            e = e2;
        }
        try {
            return (WritableMap) dlf.a.submit(new cf3(this, str, 2)).get();
        } catch (InterruptedException e3) {
            e = e3;
            Log.d(TAG, "senderGetCapabilities() " + e.getMessage());
            return null;
        }
    }

    @ReactMethod
    public void senderGetStats(final int i, final String str, final Promise promise) {
        dlf.a(new Runnable() { // from class: cvg
            @Override // java.lang.Runnable
            public final void run() {
                this.a.lambda$senderGetStats$32(i, promise, str);
            }
        });
    }

    @ReactMethod
    public void senderReplaceTrack(final int i, final String str, final String str2, final Promise promise) {
        dlf.a(new Runnable() { // from class: hvg
            @Override // java.lang.Runnable
            public final void run() {
                String str3 = str;
                String str4 = str2;
                this.lambda$senderReplaceTrack$7(i, promise, str3, str4);
            }
        });
    }

    @ReactMethod
    public void senderSetParameters(final int i, final String str, final ReadableMap readableMap, final Promise promise) {
        dlf.a(new Runnable() { // from class: zug
            @Override // java.lang.Runnable
            public final void run() {
                this.a.lambda$senderSetParameters$5(i, promise, str, readableMap);
            }
        });
    }

    @ReactMethod
    public void setAudioDevice(String str) {
        dlf.a(new jy0(5, this, str));
    }

    @ReactMethod
    public void setDailyAudioMode(String str) {
        b.EnumC0189b enumC0189b;
        Log.d(TAG, "setDailyAudioMode: " + str);
        str.getClass();
        int i = 1;
        int i2 = 0;
        switch (str) {
            case "idle":
                enumC0189b = b.EnumC0189b.a;
                break;
            case "video":
                enumC0189b = b.EnumC0189b.b;
                break;
            case "voice":
                enumC0189b = b.EnumC0189b.c;
                break;
            default:
                l5.q(str);
                return;
        }
        com.oney.WebRTCModule.b bVar = this.dailyAudioManager;
        if (bVar != null) {
            bVar.e.execute(new ed3(i2, bVar, enumC0189b));
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        com.oney.WebRTCModule.d dVar = this.dailyWebRTCDevicesManager;
        com.oney.WebRTCModule.b bVar2 = new com.oney.WebRTCModule.b();
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        bVar2.e = executorServiceNewSingleThreadExecutor;
        bVar2.V = bVar2.new a();
        reactApplicationContext.addLifecycleEventListener(new com.oney.WebRTCModule.c(bVar2));
        bVar2.a = dVar;
        bVar2.b = (AudioManager) reactApplicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        bVar2.c = (DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
        bVar2.d = enumC0189b;
        executorServiceNewSingleThreadExecutor.execute(new hy1(bVar2, i));
        this.dailyAudioManager = bVar2;
    }

    @ReactMethod
    public void startMediaDevicesEventMonitor() {
        com.oney.WebRTCModule.d dVar = this.dailyWebRTCDevicesManager;
        dVar.c.registerAudioDeviceCallback(dVar.a, null);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean transceiverSetCodecPreferences(final int i, final String str, final ReadableArray readableArray) {
        dlf.a(new Runnable() { // from class: xug
            @Override // java.lang.Runnable
            public final void run() {
                this.a.lambda$transceiverSetCodecPreferences$9(i, str, readableArray);
            }
        });
        return true;
    }

    @ReactMethod
    public void transceiverSetDirection(final int i, final String str, final String str2, final Promise promise) {
        dlf.a(new Runnable() { // from class: svg
            @Override // java.lang.Runnable
            public final void run() {
                Promise promise2 = promise;
                String str3 = str2;
                this.lambda$transceiverSetDirection$8(i, str, promise2, str3);
            }
        });
    }

    @ReactMethod
    public void transceiverStop(final int i, final String str, final Promise promise) {
        dlf.a(new Runnable() { // from class: ovg
            @Override // java.lang.Runnable
            public final void run() {
                this.a.lambda$transceiverStop$6(i, promise, str);
            }
        });
    }

    private PeerConnection.IceServer createIceServer(String str) {
        return PeerConnection.IceServer.builder(str).createIceServer();
    }
}
