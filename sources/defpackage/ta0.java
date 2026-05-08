package defpackage;

import android.util.Log;
import android.view.ActionMode;
import com.datadog.android.rum.metric.interactiontonextview.TimeBasedInteractionIdentifier;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.oney.WebRTCModule.f;
import defpackage.mt3;
import defpackage.sa0;
import defpackage.vog;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import org.webrtc.AudioTrack;
import org.webrtc.MediaStream;
import org.webrtc.MediaStreamTrack;
import org.webrtc.RtpReceiver;
import org.webrtc.RtpTransceiver;
import org.webrtc.VideoTrack;
import vog.a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ta0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ta0(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

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
        int i = 0;
        RtpTransceiver rtpTransceiver = null;
        switch (this.a) {
            case 0:
                sa0 sa0Var = (sa0) this.b;
                ccf ccfVar = (ccf) this.c;
                sa0.b bVar = (sa0.b) this.d;
                ActionMode actionModeStartActionMode = sa0Var.a.startActionMode(new ti5(ccfVar), 1);
                wl7.b(sa0Var.h, actionModeStartActionMode);
                if (actionModeStartActionMode == null) {
                    bVar.close();
                    return;
                }
                return;
            case 1:
                po1 po1Var = (po1) this.b;
                ot1 ot1Var = (ot1) this.c;
                vs4 vs4Var = (vs4) this.d;
                sqe sqeVar = po1Var.g;
                ot1Var.getClass();
                try {
                    po1Var.e(ot1Var, vs4Var);
                    return;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                        vs4Var.getClass();
                        sqeVar.e(ot1Var, vs4Var);
                        vs4Var.close();
                    }
                }
            case 2:
                ((lt3) this.b).a.execute(new dt3(i, (Runnable) this.c, (mt3.a) this.d));
                return;
            case 3:
                f fVar = (f) this.b;
                RtpReceiver rtpReceiver = (RtpReceiver) this.c;
                MediaStream[] mediaStreamArr = (MediaStream[]) this.d;
                Iterator<RtpTransceiver> it = fVar.d.getTransceivers().iterator();
                while (true) {
                    if (it.hasNext()) {
                        RtpTransceiver next = it.next();
                        if (Objects.equals(next.getReceiver().id(), rtpReceiver.id())) {
                            rtpTransceiver = next;
                        }
                    }
                }
                if (rtpTransceiver == null) {
                    return;
                }
                MediaStreamTrack mediaStreamTrackTrack = rtpReceiver.track();
                if (!fVar.g.containsKey(mediaStreamTrackTrack.id())) {
                    if (mediaStreamTrackTrack.kind().equals(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                        vog vogVar = fVar.h;
                        VideoTrack videoTrack = (VideoTrack) mediaStreamTrackTrack;
                        vogVar.getClass();
                        String strId = videoTrack.id();
                        if (vogVar.a.containsKey(strId)) {
                            Log.w("vog", "Attempted to add adapter twice for track ID: " + strId);
                        } else {
                            vog.a aVar = vogVar.new a(strId);
                            Log.d("vog", "Created adapter for " + strId);
                            vogVar.a.put(strId, aVar);
                            videoTrack.addSink(aVar);
                            if (!aVar.b) {
                                synchronized (aVar) {
                                    try {
                                        uog uogVar = aVar.a;
                                        if (uogVar != null) {
                                            uogVar.cancel();
                                        }
                                        uog uogVar2 = new uog(aVar);
                                        aVar.a = uogVar2;
                                        vogVar.b.schedule(uogVar2, TimeBasedInteractionIdentifier.DEFAULT_TIME_THRESHOLD_MS, 1500L);
                                    } finally {
                                    }
                                }
                            }
                        }
                    }
                    fVar.g.put(mediaStreamTrackTrack.id(), mediaStreamTrackTrack);
                    break;
                }
                WritableMap writableMapCreateMap = Arguments.createMap();
                WritableArray writableArrayCreateArray = Arguments.createArray();
                int length = mediaStreamArr.length;
                while (i < length) {
                    MediaStream mediaStream = mediaStreamArr[i];
                    String string = (String) fVar.e.get(mediaStream.getId());
                    if (string == null) {
                        string = UUID.randomUUID().toString();
                        fVar.e.put(mediaStream.getId(), string);
                    }
                    fVar.f.put(string, mediaStream);
                    int i2 = fVar.b;
                    WritableMap writableMapCreateMap2 = Arguments.createMap();
                    writableMapCreateMap2.putString("streamId", mediaStream.getId());
                    writableMapCreateMap2.putString("streamReactTag", string);
                    WritableArray writableArrayCreateArray2 = Arguments.createArray();
                    Iterator<VideoTrack> it2 = mediaStream.videoTracks.iterator();
                    while (it2.hasNext()) {
                        writableArrayCreateArray2.pushMap(y7e.g(i2, it2.next()));
                    }
                    Iterator<AudioTrack> it3 = mediaStream.audioTracks.iterator();
                    while (it3.hasNext()) {
                        writableArrayCreateArray2.pushMap(y7e.g(i2, it3.next()));
                    }
                    writableMapCreateMap2.putArray("tracks", writableArrayCreateArray2);
                    writableArrayCreateArray.pushMap(writableMapCreateMap2);
                    i++;
                }
                writableMapCreateMap.putArray("streams", writableArrayCreateArray);
                writableMapCreateMap.putMap("receiver", y7e.c(fVar.b, rtpReceiver));
                writableMapCreateMap.putInt("transceiverOrder", fVar.a());
                writableMapCreateMap.putMap("transceiver", y7e.h(fVar.b, rtpTransceiver));
                writableMapCreateMap.putInt("pcId", fVar.b);
                fVar.i.sendEvent("peerConnectionOnTrack", writableMapCreateMap);
                return;
            default:
                ku2 ku2Var = (ku2) this.b;
                maf mafVar = (maf) this.c;
                final hzh hzhVar = (hzh) this.d;
                try {
                    maf mafVar2 = (maf) ku2Var.a(mafVar);
                    if (mafVar2 == null) {
                        hzhVar.v(null);
                    } else {
                        maf.a(mafVar2, new ku2() { // from class: laf
                            @Override // defpackage.ku2
                            public final Object a(maf mafVar3) {
                                mafVar3.getClass();
                                boolean zE = mafVar3.e();
                                hzh hzhVar2 = hzhVar;
                                if (zE) {
                                    hzhVar2.t();
                                } else if (mafVar3.f()) {
                                    hzhVar2.u(mafVar3.c());
                                } else {
                                    hzhVar2.v(mafVar3.d());
                                }
                                return j6g.a;
                            }
                        });
                    }
                    return;
                } catch (CancellationException unused) {
                    hzhVar.t();
                    return;
                } catch (Exception e) {
                    hzhVar.u(e);
                    return;
                }
        }
    }
}
