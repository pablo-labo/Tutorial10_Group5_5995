package defpackage;

import android.webkit.PermissionRequest;
import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.w;
import defpackage.sp7;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yb1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yb1(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                String[] strArr = (String[]) obj4;
                PermissionRequest permissionRequest = (PermissionRequest) obj3;
                Map map = (Map) obj;
                map.getClass();
                ArrayList arrayList = new ArrayList((ArrayList) obj2);
                Object obj5 = map.get("android.permission.RECORD_AUDIO");
                Boolean bool = Boolean.TRUE;
                if (wl7.b(obj5, bool) && ut0.f0("android.webkit.resource.AUDIO_CAPTURE", strArr)) {
                    arrayList.add("android.webkit.resource.AUDIO_CAPTURE");
                }
                if (wl7.b(map.get("android.permission.CAMERA"), bool) && ut0.f0("android.webkit.resource.VIDEO_CAPTURE", strArr)) {
                    arrayList.add("android.webkit.resource.VIDEO_CAPTURE");
                }
                if (arrayList.isEmpty()) {
                    permissionRequest.deny();
                } else {
                    permissionRequest.grant((String[]) arrayList.toArray(new String[0]));
                }
                break;
            case 1:
                ta4 ta4Var = (ta4) obj4;
                w wVar = (w) obj3;
                w.a aVar = (w.a) obj;
                boolean zM0 = ((q) obj2).m0();
                d40<T> d40Var = ta4Var.d0;
                float f = zM0 ? d40Var.e().f(ta4Var.d0.h.getValue()) : d40Var.g();
                dwa dwaVar = ta4Var.f0;
                float f2 = dwaVar == dwa.b ? f : 0.0f;
                if (dwaVar != dwa.a) {
                    f = 0.0f;
                }
                aVar.r(wVar, gf9.b(f2), gf9.b(f), 0.0f);
                break;
            default:
                Function2 function2 = (Function2) obj4;
                Function1 function1 = (Function1) obj3;
                String str = (String) obj;
                hvb hvbVar = hvb.c;
                if (str != null) {
                    ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-tab", "edit-education", null, null, 12));
                    function2.invoke(hvbVar, str);
                } else {
                    ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-tab", "add-education", null, null, 12));
                    function1.invoke(hvbVar);
                }
                break;
        }
        return j6g.a;
    }
}
