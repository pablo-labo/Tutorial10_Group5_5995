package defpackage;

import androidx.compose.runtime.b;
import com.facebook.react.runtime.ReactHostImpl;
import com.facebook.react.runtime.ReactInstance;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fi6 implements Function2 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ fi6(fv6 fv6Var, String str, fv6 fv6Var2, String str2, int i) {
        this.d = fv6Var;
        this.b = str;
        this.e = fv6Var2;
        this.c = str2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.d;
        Object obj4 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ji6.a(this.b, this.c, (Long) obj4, (String) obj3, (b) obj, ka2.L(1));
                return j6g.a;
            case 1:
                ((Integer) obj2).getClass();
                gt6.a((fv6) obj3, this.b, (fv6) obj4, this.c, (b) obj, ka2.L(1));
                return j6g.a;
            default:
                ReactHostImpl reactHostImpl = (ReactHostImpl) obj4;
                String str = (String) obj3;
                maf mafVar = (maf) obj;
                String str2 = (String) obj2;
                AtomicInteger atomicInteger = ReactHostImpl.A;
                mafVar.getClass();
                str2.getClass();
                ReactInstance reactInstance = (ReactInstance) mafVar.d();
                ReactInstance reactInstance2 = reactHostImpl.l;
                String strConcat = "Stage: ".concat(str2);
                String str3 = this.b;
                String strM = z3.m(str3, " reason: ", this.c);
                if (mafVar.f()) {
                    Exception excC = mafVar.c();
                    if (excC == null) {
                        r6.g("Required value was null.");
                        return null;
                    }
                    String strL = l5.l("Fault reason: ", excC.getMessage());
                    StringBuilder sb = new StringBuilder();
                    sb.append(str3);
                    sb.append(": ReactInstance task faulted. ");
                    sb.append(strConcat);
                    sb.append(". ");
                    sb.append(strL);
                    reactHostImpl.u(str, l6.i(sb, ". ", strM), null);
                } else if (mafVar.e()) {
                    reactHostImpl.u(str, str3 + ": ReactInstance task cancelled. " + strConcat + ". " + strM, null);
                } else {
                    if (reactInstance != null) {
                        if (reactInstance2 == null || reactInstance == reactInstance2) {
                            return reactInstance;
                        }
                        reactHostImpl.u(str, str3 + ": Detected two different ReactInstances. Returning old. " + strConcat + ". " + strM, null);
                        return reactInstance;
                    }
                    reactHostImpl.u(str, str3 + ": ReactInstance task returned null. " + strConcat + ". " + strM, null);
                }
                return reactInstance2;
        }
    }

    public /* synthetic */ fi6(ReactHostImpl reactHostImpl, String str, String str2, String str3) {
        this.e = reactHostImpl;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public /* synthetic */ fi6(String str, String str2, Long l, String str3, int i) {
        this.b = str;
        this.c = str2;
        this.e = l;
        this.d = str3;
    }
}
