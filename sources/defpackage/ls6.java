package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import androidx.fragment.app.FragmentManager;
import com.indeed.android.messaging.data.events.EventRecord;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ls6 implements Function2 {
    public final /* synthetic */ Object V;
    public final /* synthetic */ Object W;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ gu5 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ls6(fv6 fv6Var, gu5 gu5Var, e eVar, String str, vt6 vt6Var, int i, int i2) {
        this.f = fv6Var;
        this.b = gu5Var;
        this.V = eVar;
        this.c = str;
        this.W = vt6Var;
        this.d = i;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                gt6.i((fv6) this.f, this.b, (e) this.V, this.c, (vt6) this.W, (b) obj, ka2.L(this.d | 1), this.e);
                break;
            default:
                ((Integer) obj2).getClass();
                h4f.a((EventRecord.TimelineModule) this.f, (FragmentManager) this.V, this.b, (y1e) this.W, this.c, (b) obj, ka2.L(this.d | 1), this.e);
                break;
        }
        return j6g.a;
    }

    public /* synthetic */ ls6(EventRecord.TimelineModule timelineModule, FragmentManager fragmentManager, gu5 gu5Var, y1e y1eVar, String str, int i, int i2) {
        this.f = timelineModule;
        this.V = fragmentManager;
        this.b = gu5Var;
        this.W = y1eVar;
        this.c = str;
        this.d = i;
        this.e = i2;
    }
}
