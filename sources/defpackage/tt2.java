package defpackage;

import androidx.compose.runtime.b;
import com.facebook.react.bridge.Promise;
import com.indeed.android.rnprofile.RNProfileFormsModule;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tt2 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tt2(Promise promise, RNProfileFormsModule rNProfileFormsModule) {
        this.a = 2;
        this.b = promise;
        this.c = rNProfileFormsModule;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((vt2) obj4).a((st2) obj3, (b) obj, ka2.L(1));
                return j6g.a;
            case 1:
                ((Integer) obj2).getClass();
                int iL = ka2.L(1);
                dq4.a(iL, (gu5) obj3, (b) obj, (String) obj4);
                return j6g.a;
            case 2:
                return RNProfileFormsModule.presentNativeResumeOtherSectionForm$lambda$28$lambda$5((Promise) obj4, (RNProfileFormsModule) obj3, (ps7) obj, (yr7) obj2);
            default:
                ((Integer) obj2).getClass();
                m8g.a((Function1) obj4, (String) obj3, (b) obj, ka2.L(7));
                return j6g.a;
        }
    }

    public /* synthetic */ tt2(Object obj, int i, int i2, Object obj2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
    }
}
