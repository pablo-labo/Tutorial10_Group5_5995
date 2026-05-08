package defpackage;

import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.runtime.ReactHostImpl;
import com.facebook.react.runtime.ReactInstance;
import defpackage.sp7;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qz8 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qz8(int i, Object obj, Object obj2, Object obj3) {
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
                pz8 pz8Var = (pz8) obj2;
                final g4a g4aVar = (g4a) obj3;
                goa goaVar = new goa() { // from class: rz8
                    @Override // defpackage.goa
                    public final void d(Object obj5) {
                        g4aVar.setValue(obj5);
                    }
                };
                pz8Var.e((zv8) obj4, goaVar);
                break;
            case 1:
                Function2 function2 = (Function2) obj4;
                Function1 function1 = (Function1) obj3;
                String str = (String) obj;
                hvb hvbVar = hvb.d0;
                if (str != null) {
                    ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-tab", "edit-publication", null, null, 12));
                    function2.invoke(hvbVar, str);
                } else {
                    ((tp7) cr8.p(tp7.class)).b(new sp7.g("profile-tab", "add-publication", null, null, 12));
                    function1.invoke(hvbVar);
                }
                break;
            default:
                ReactInstance reactInstance = (ReactInstance) obj;
                AtomicInteger atomicInteger = ReactHostImpl.A;
                reactInstance.getClass();
                reactInstance.callFunctionOnModule((String) obj2, (String) obj4, (WritableNativeArray) obj3);
                break;
        }
        return j6g.a;
    }
}
