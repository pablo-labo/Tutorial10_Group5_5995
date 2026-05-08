package defpackage;

import com.indeed.android.tare.broadcast.JSTBroadcastEvent;
import defpackage.lx5;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wz4 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ wz4(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 0:
                lx5.b bVar = (lx5.b) obj;
                bVar.getClass();
                bVar.a("subTabName", str);
                return j6g.a;
            case 1:
                s5e s5eVar = (s5e) obj;
                s5eVar.getClass();
                if (str.length() > 0) {
                    o5e.f(s5eVar, str);
                }
                return j6g.a;
            case 2:
                s5e s5eVar2 = (s5e) obj;
                s5eVar2.getClass();
                str.getClass();
                o5e.f(s5eVar2, str);
                return j6g.a;
            default:
                JSTBroadcastEvent.JsonCallback jsonCallback = (JSTBroadcastEvent.JsonCallback) obj;
                jsonCallback.getClass();
                return Boolean.valueOf(wl7.b(jsonCallback.getCallbackId(), str));
        }
    }
}
