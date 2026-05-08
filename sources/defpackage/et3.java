package defpackage;

import android.graphics.Typeface;
import androidx.media3.session.r;
import androidx.media3.session.x;
import com.datadog.android.rum.internal.debug.UiRumDebugListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableMap;
import com.oney.WebRTCModule.f;
import defpackage.g6d;
import defpackage.j2;
import defpackage.mt3;
import java.util.ArrayList;
import java.util.List;
import org.webrtc.PeerConnection;
import org.webrtc.SessionDescription;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class et3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ et3(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
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
        switch (this.a) {
            case 0:
                Runnable runnable = (Runnable) this.b;
                mt3.a aVar = (mt3.a) this.c;
                try {
                    runnable.run();
                } catch (Exception e) {
                    aVar.a(e);
                    return;
                }
                break;
            case 1:
                ebe ebeVar = (ebe) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                if (ebeVar.a instanceof j2.b) {
                    for (int i = 0; i < arrayList.size(); i++) {
                        if (arrayList.get(i) != null) {
                            ((hz8) arrayList.get(i)).cancel(false);
                        }
                    }
                }
                break;
            case 2:
                ((x) this.b).c.d((r.d) this.c);
                break;
            case 3:
                f fVar = (f) this.b;
                PeerConnection.IceGatheringState iceGatheringState = (PeerConnection.IceGatheringState) this.c;
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putInt("pcId", fVar.b);
                int i2 = f.a.c[iceGatheringState.ordinal()];
                writableMapCreateMap.putString("iceGatheringState", i2 != 1 ? i2 != 2 ? i2 != 3 ? null : "complete" : "gathering" : "new");
                if (iceGatheringState == PeerConnection.IceGatheringState.COMPLETE) {
                    SessionDescription localDescription = fVar.d.getLocalDescription();
                    WritableMap writableMapCreateMap2 = Arguments.createMap();
                    if (localDescription != null) {
                        writableMapCreateMap2.putString("type", localDescription.type.canonicalForm());
                        writableMapCreateMap2.putString("sdp", localDescription.description);
                    }
                    writableMapCreateMap.putMap("sdp", writableMapCreateMap2);
                }
                fVar.i.sendEvent("peerConnectionIceGatheringChanged", writableMapCreateMap);
                break;
            case 4:
                ((g6d.c) this.b).c((Typeface) this.c);
                break;
            case 5:
                UiRumDebugListener.onReceiveRumActiveViews$lambda$4$lambda$3((UiRumDebugListener) this.b, (List) this.c);
                break;
            default:
                ((Promise) this.b).reject("E_OPERATION_ERROR", (String) this.c);
                break;
        }
    }
}
