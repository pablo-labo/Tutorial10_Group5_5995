package defpackage;

import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import defpackage.vog;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes3.dex */
public final class uog extends TimerTask {
    public int a;
    public final /* synthetic */ vog.a b;

    public uog(vog.a aVar) {
        this.b = aVar;
        this.a = aVar.c.get();
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (this.b.b) {
            return;
        }
        boolean z = this.a == this.b.c.get();
        vog.a aVar = this.b;
        if (z != aVar.d) {
            aVar.d = z;
            WritableMap writableMapCreateMap = Arguments.createMap();
            vog vogVar = vog.this;
            writableMapCreateMap.putInt("pcId", vogVar.c);
            String str = aVar.e;
            writableMapCreateMap.putString("trackId", str);
            writableMapCreateMap.putBoolean("muted", z);
            StringBuilder sb = new StringBuilder();
            sb.append(z ? "Mute" : "Unmute");
            sb.append(" event pcId: ");
            sb.append(vogVar.c);
            sb.append(" trackId: ");
            sb.append(str);
            Log.d("vog", sb.toString());
            vogVar.d.sendEvent("mediaStreamTrackMuteChanged", writableMapCreateMap);
        }
        this.a = this.b.c.get();
    }
}
