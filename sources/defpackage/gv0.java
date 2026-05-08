package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import androidx.fragment.app.FragmentManager;
import com.indeed.android.messaging.data.events.EventRecord;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gv0 implements Function2 {
    public final /* synthetic */ Object V;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ gv0(e eVar, kv0 kv0Var, String str, c20 c20Var, ft2 ft2Var, int i) {
        this.d = eVar;
        this.e = kv0Var;
        this.b = str;
        this.f = c20Var;
        this.V = ft2Var;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.c;
        Object obj3 = this.V;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = ka2.L(i2 | 1);
                String str = this.b;
                iv0.b((e) obj6, (kv0) obj5, str, (c20) obj4, (ft2) obj3, (b) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                h4f.b((EventRecord.TimelineModule) obj6, (FragmentManager) obj5, (Function2) obj4, (gu5) obj3, this.b, (b) obj, ka2.L(i2 | 1));
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ gv0(EventRecord.TimelineModule timelineModule, FragmentManager fragmentManager, Function2 function2, gu5 gu5Var, String str, int i) {
        this.d = timelineModule;
        this.e = fragmentManager;
        this.f = function2;
        this.V = gu5Var;
        this.b = str;
        this.c = i;
    }
}
