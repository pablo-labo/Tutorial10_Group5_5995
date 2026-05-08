package defpackage;

import com.datadog.android.core.internal.metrics.BatchMetricsDispatcher;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.appstate.AppStateModule;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import org.webrtc.MediaStreamTrack;
import org.webrtc.RtpCapabilities;
import org.webrtc.RtpParameters;
import org.webrtc.RtpReceiver;
import org.webrtc.RtpSender;
import org.webrtc.RtpTransceiver;

/* JADX INFO: loaded from: classes3.dex */
public final class y7e {

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[RtpTransceiver.RtpTransceiverDirection.values().length];
            a = iArr;
            try {
                iArr[RtpTransceiver.RtpTransceiverDirection.INACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[RtpTransceiver.RtpTransceiverDirection.RECV_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[RtpTransceiver.RtpTransceiverDirection.SEND_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[RtpTransceiver.RtpTransceiverDirection.SEND_RECV.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[RtpTransceiver.RtpTransceiverDirection.STOPPED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static RtpTransceiver.RtpTransceiverInit a(ReadableMap readableMap) {
        ReadableArray array;
        ReadableArray array2;
        String string;
        if (readableMap == null) {
            return null;
        }
        RtpTransceiver.RtpTransceiverDirection rtpTransceiverDirection = RtpTransceiver.RtpTransceiverDirection.SEND_RECV;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (readableMap.hasKey("direction") && (string = readableMap.getString("direction")) != null) {
            switch (string) {
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
                    break;
                default:
                    throw new Error("Invalid direction");
            }
        }
        if (readableMap.hasKey("streamIds") && (array2 = readableMap.getArray("streamIds")) != null) {
            for (int i = 0; i < array2.size(); i++) {
                arrayList.add(array2.getString(i));
            }
        }
        if (readableMap.hasKey("sendEncodings") && (array = readableMap.getArray("sendEncodings")) != null) {
            for (int i2 = 0; i2 < array.size(); i2++) {
                ReadableMap map = array.getMap(i2);
                RtpParameters.Encoding encoding = new RtpParameters.Encoding(map.getString("rid"), true, Double.valueOf(1.0d));
                if (map.hasKey(AppStateModule.APP_STATE_ACTIVE)) {
                    encoding.active = map.getBoolean(AppStateModule.APP_STATE_ACTIVE);
                }
                if (map.hasKey("maxBitrate")) {
                    encoding.maxBitrateBps = Integer.valueOf(map.getInt("maxBitrate"));
                }
                if (map.hasKey("maxFramerate")) {
                    encoding.maxFramerate = Integer.valueOf(map.getInt("maxFramerate"));
                }
                if (map.hasKey("scaleResolutionDownBy")) {
                    encoding.scaleResolutionDownBy = Double.valueOf(map.getDouble("scaleResolutionDownBy"));
                }
                arrayList2.add(encoding);
            }
        }
        return new RtpTransceiver.RtpTransceiverInit(rtpTransceiverDirection, arrayList, arrayList2);
    }

    public static String b(RtpTransceiver.RtpTransceiverDirection rtpTransceiverDirection) {
        int i = a.a[rtpTransceiverDirection.ordinal()];
        if (i == 1) {
            return "inactive";
        }
        if (i == 2) {
            return "recvonly";
        }
        if (i == 3) {
            return "sendonly";
        }
        if (i == 4) {
            return "sendrecv";
        }
        if (i == 5) {
            return "stopped";
        }
        throw new Error("Invalid direction");
    }

    public static WritableMap c(int i, RtpReceiver rtpReceiver) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("id", rtpReceiver.id());
        writableMapCreateMap.putInt("peerConnectionId", i);
        if (rtpReceiver.track() != null) {
            writableMapCreateMap.putMap(BatchMetricsDispatcher.TRACK_KEY, g(i, rtpReceiver.track()));
        }
        writableMapCreateMap.putMap("rtpParameters", e(rtpReceiver.getParameters()));
        return writableMapCreateMap;
    }

    public static WritableMap d(RtpCapabilities.CodecCapability codecCapability) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("payloadType", codecCapability.preferredPayloadType);
        writableMapCreateMap.putString("mimeType", codecCapability.mimeType);
        writableMapCreateMap.putInt("clockRate", codecCapability.clockRate.intValue());
        Integer num = codecCapability.numChannels;
        if (num != null) {
            writableMapCreateMap.putInt("channels", num.intValue());
        }
        if (!codecCapability.parameters.isEmpty()) {
            Map<String, String> map = codecCapability.parameters;
            writableMapCreateMap.putString("sdpFmtpLine", (String) map.keySet().stream().map(new u7e(map)).collect(Collectors.joining(";")));
        }
        return writableMapCreateMap;
    }

    public static WritableMap e(RtpParameters rtpParameters) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        final WritableArray writableArrayCreateArray = Arguments.createArray();
        final WritableArray writableArrayCreateArray2 = Arguments.createArray();
        final WritableArray writableArrayCreateArray3 = Arguments.createArray();
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putString("cname", rtpParameters.getRtcp().getCname());
        writableMapCreateMap2.putBoolean("reducedSize", rtpParameters.getRtcp().getReducedSize());
        rtpParameters.getHeaderExtensions().forEach(new Consumer() { // from class: v7e
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                RtpParameters.HeaderExtension headerExtension = (RtpParameters.HeaderExtension) obj;
                WritableMap writableMapCreateMap3 = Arguments.createMap();
                writableMapCreateMap3.putInt("id", headerExtension.getId());
                writableMapCreateMap3.putString("uri", headerExtension.getUri());
                writableMapCreateMap3.putBoolean("encrypted", headerExtension.getEncrypted());
                writableArrayCreateArray3.pushMap(writableMapCreateMap3);
            }
        });
        rtpParameters.encodings.forEach(new Consumer() { // from class: w7e
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                RtpParameters.Encoding encoding = (RtpParameters.Encoding) obj;
                WritableMap writableMapCreateMap3 = Arguments.createMap();
                writableMapCreateMap3.putBoolean(AppStateModule.APP_STATE_ACTIVE, encoding.active);
                String str = encoding.rid;
                if (str != null) {
                    writableMapCreateMap3.putString("rid", str);
                }
                Integer num = encoding.maxBitrateBps;
                if (num != null) {
                    writableMapCreateMap3.putInt("maxBitrate", num.intValue());
                }
                Integer num2 = encoding.maxFramerate;
                if (num2 != null) {
                    writableMapCreateMap3.putInt("maxFramerate", num2.intValue());
                }
                Double d = encoding.scaleResolutionDownBy;
                if (d != null) {
                    writableMapCreateMap3.putDouble("scaleResolutionDownBy", d.doubleValue());
                }
                writableArrayCreateArray.pushMap(writableMapCreateMap3);
            }
        });
        rtpParameters.codecs.forEach(new Consumer() { // from class: x7e
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                RtpParameters.Codec codec = (RtpParameters.Codec) obj;
                WritableMap writableMapCreateMap3 = Arguments.createMap();
                writableMapCreateMap3.putInt("payloadType", codec.payloadType);
                writableMapCreateMap3.putString("mimeType", codec.name);
                writableMapCreateMap3.putInt("clockRate", codec.clockRate.intValue());
                Integer num = codec.numChannels;
                if (num != null) {
                    writableMapCreateMap3.putInt("channels", num.intValue());
                }
                if (!codec.parameters.isEmpty()) {
                    Map<String, String> map = codec.parameters;
                    writableMapCreateMap3.putString("sdpFmtpLine", (String) map.keySet().stream().map(new u7e(map)).collect(Collectors.joining(";")));
                }
                writableArrayCreateArray2.pushMap(writableMapCreateMap3);
            }
        });
        writableMapCreateMap.putString("transactionId", rtpParameters.transactionId);
        writableMapCreateMap.putMap("rtcp", writableMapCreateMap2);
        writableMapCreateMap.putArray("encodings", writableArrayCreateArray);
        writableMapCreateMap.putArray("codecs", writableArrayCreateArray2);
        writableMapCreateMap.putArray("headerExtensions", writableArrayCreateArray3);
        RtpParameters.DegradationPreference degradationPreference = rtpParameters.degradationPreference;
        if (degradationPreference != null) {
            writableMapCreateMap.putString("degradationPreference", degradationPreference.toString());
        }
        return writableMapCreateMap;
    }

    public static WritableMap f(int i, RtpSender rtpSender) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("id", rtpSender.id());
        writableMapCreateMap.putInt("peerConnectionId", i);
        if (rtpSender.track() != null) {
            writableMapCreateMap.putMap(BatchMetricsDispatcher.TRACK_KEY, g(i, rtpSender.track()));
        }
        writableMapCreateMap.putMap("rtpParameters", e(rtpSender.getParameters()));
        return writableMapCreateMap;
    }

    public static WritableMap g(int i, MediaStreamTrack mediaStreamTrack) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("id", mediaStreamTrack.id());
        writableMapCreateMap.putInt("peerConnectionId", i);
        writableMapCreateMap.putString("kind", mediaStreamTrack.kind());
        writableMapCreateMap.putBoolean("enabled", mediaStreamTrack.enabled());
        writableMapCreateMap.putString("readyState", mediaStreamTrack.state().toString().toLowerCase());
        writableMapCreateMap.putBoolean("remote", true);
        return writableMapCreateMap;
    }

    public static WritableMap h(int i, RtpTransceiver rtpTransceiver) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("id", rtpTransceiver.getSender().id());
        writableMapCreateMap.putInt("peerConnectionId", i);
        writableMapCreateMap.putString("mid", rtpTransceiver.getMid());
        writableMapCreateMap.putString("direction", b(rtpTransceiver.getDirection()));
        if (rtpTransceiver.getCurrentDirection() != null) {
            writableMapCreateMap.putString("currentDirection", b(rtpTransceiver.getCurrentDirection()));
        }
        writableMapCreateMap.putBoolean("isStopped", rtpTransceiver.isStopped());
        writableMapCreateMap.putMap("receiver", c(i, rtpTransceiver.getReceiver()));
        writableMapCreateMap.putMap("sender", f(i, rtpTransceiver.getSender()));
        return writableMapCreateMap;
    }

    public static RtpParameters i(ReadableMap readableMap, RtpParameters rtpParameters) {
        ReadableArray array = readableMap.getArray("encodings");
        List<RtpParameters.Encoding> list = rtpParameters.encodings;
        if (array.size() != list.size()) {
            return null;
        }
        for (int i = 0; i < array.size(); i++) {
            ReadableMap map = array.getMap(i);
            RtpParameters.Encoding encoding = list.get(i);
            Integer numValueOf = map.hasKey("maxBitrate") ? Integer.valueOf(map.getInt("maxBitrate")) : null;
            Integer numValueOf2 = map.hasKey("maxFramerate") ? Integer.valueOf(map.getInt("maxFramerate")) : null;
            Double dValueOf = map.hasKey("scaleResolutionDownBy") ? Double.valueOf(map.getDouble("scaleResolutionDownBy")) : null;
            encoding.active = map.getBoolean(AppStateModule.APP_STATE_ACTIVE);
            encoding.rid = map.getString("rid");
            encoding.maxBitrateBps = numValueOf;
            encoding.maxFramerate = numValueOf2;
            encoding.scaleResolutionDownBy = dValueOf;
        }
        if (readableMap.hasKey("degradationPreference")) {
            rtpParameters.degradationPreference = RtpParameters.DegradationPreference.valueOf(readableMap.getString("degradationPreference"));
        }
        return rtpParameters;
    }
}
