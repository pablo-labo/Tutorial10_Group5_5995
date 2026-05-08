package com.oney.WebRTCModule;

import android.util.Log;
import defpackage.dlf;
import defpackage.dt3;
import defpackage.ed3;
import defpackage.ek9;
import defpackage.et3;
import defpackage.gy0;
import defpackage.iy1;
import defpackage.kz2;
import defpackage.n60;
import defpackage.ta0;
import defpackage.vog;
import java.util.HashMap;
import org.webrtc.DataChannel;
import org.webrtc.IceCandidate;
import org.webrtc.MediaStream;
import org.webrtc.PeerConnection;
import org.webrtc.RtpReceiver;
import org.webrtc.RtpSender;
import org.webrtc.RtpTransceiver;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements PeerConnection.Observer {
    public static final String j = WebRTCModule.TAG;
    public final int b;
    public PeerConnection d;
    public final vog h;
    public final WebRTCModule i;
    public int c = 0;
    public final HashMap a = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public final HashMap g = new HashMap();

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;
        public static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[PeerConnection.SignalingState.values().length];
            d = iArr;
            try {
                iArr[PeerConnection.SignalingState.STABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[PeerConnection.SignalingState.HAVE_LOCAL_OFFER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[PeerConnection.SignalingState.HAVE_LOCAL_PRANSWER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                d[PeerConnection.SignalingState.HAVE_REMOTE_OFFER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                d[PeerConnection.SignalingState.HAVE_REMOTE_PRANSWER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                d[PeerConnection.SignalingState.CLOSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[PeerConnection.IceGatheringState.values().length];
            c = iArr2;
            try {
                iArr2[PeerConnection.IceGatheringState.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                c[PeerConnection.IceGatheringState.GATHERING.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                c[PeerConnection.IceGatheringState.COMPLETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr3 = new int[PeerConnection.IceConnectionState.values().length];
            b = iArr3;
            try {
                iArr3[PeerConnection.IceConnectionState.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                b[PeerConnection.IceConnectionState.CHECKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                b[PeerConnection.IceConnectionState.CONNECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                b[PeerConnection.IceConnectionState.COMPLETED.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                b[PeerConnection.IceConnectionState.FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                b[PeerConnection.IceConnectionState.DISCONNECTED.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                b[PeerConnection.IceConnectionState.CLOSED.ordinal()] = 7;
            } catch (NoSuchFieldError unused16) {
            }
            int[] iArr4 = new int[PeerConnection.PeerConnectionState.values().length];
            a = iArr4;
            try {
                iArr4[PeerConnection.PeerConnectionState.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[PeerConnection.PeerConnectionState.CONNECTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                a[PeerConnection.PeerConnectionState.CONNECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                a[PeerConnection.PeerConnectionState.DISCONNECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                a[PeerConnection.PeerConnectionState.FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                a[PeerConnection.PeerConnectionState.CLOSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused22) {
            }
        }
    }

    public f(WebRTCModule webRTCModule, int i) {
        this.i = webRTCModule;
        this.b = i;
        this.h = new vog(webRTCModule, i);
    }

    public final synchronized int a() {
        int i;
        i = this.c;
        this.c = i + 1;
        return i;
    }

    public final RtpSender b(String str) {
        PeerConnection peerConnection = this.d;
        if (peerConnection == null) {
            return null;
        }
        for (RtpSender rtpSender : peerConnection.getSenders()) {
            if (rtpSender.id().equals(str)) {
                return rtpSender;
            }
        }
        return null;
    }

    public final RtpTransceiver c(String str) {
        PeerConnection peerConnection = this.d;
        if (peerConnection == null) {
            return null;
        }
        for (RtpTransceiver rtpTransceiver : peerConnection.getTransceivers()) {
            if (rtpTransceiver.getSender().id().equals(str)) {
                return rtpTransceiver;
            }
        }
        return null;
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final void onAddStream(MediaStream mediaStream) {
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final void onAddTrack(RtpReceiver rtpReceiver, MediaStream[] mediaStreamArr) {
        Log.d(j, "onAddTrack");
        dlf.a(new ta0(3, this, rtpReceiver, mediaStreamArr));
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final void onConnectionChange(PeerConnection.PeerConnectionState peerConnectionState) {
        dlf.a(new n60(5, this, peerConnectionState));
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final void onDataChannel(DataChannel dataChannel) {
        dlf.a(new kz2(2, this, dataChannel));
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final void onIceCandidate(IceCandidate iceCandidate) {
        Log.d(j, "onIceCandidate");
        dlf.a(new gy0(5, this, iceCandidate));
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final void onIceCandidatesRemoved(IceCandidate[] iceCandidateArr) {
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final void onIceConnectionChange(PeerConnection.IceConnectionState iceConnectionState) {
        dlf.a(new dt3(3, this, iceConnectionState));
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final void onIceConnectionReceivingChange(boolean z) {
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final void onIceGatheringChange(PeerConnection.IceGatheringState iceGatheringState) {
        Log.d(j, "onIceGatheringChange" + iceGatheringState.name());
        dlf.a(new et3(3, this, iceGatheringState));
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final void onRemoveStream(MediaStream mediaStream) {
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final void onRemoveTrack(RtpReceiver rtpReceiver) {
        dlf.a(new ek9(1, this, rtpReceiver));
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final void onRenegotiationNeeded() {
        dlf.a(new iy1(this, 1));
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final void onSignalingChange(PeerConnection.SignalingState signalingState) {
        dlf.a(new ed3(3, this, signalingState));
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final void onTrack(RtpTransceiver rtpTransceiver) {
    }
}
