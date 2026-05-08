package defpackage;

import com.facebook.react.runtime.ReactHostImpl;
import com.facebook.react.runtime.ReactInstance;
import com.indeed.android.backendservices.common.api.ApiError;
import com.indeed.android.backendservices.common.api.ErrorData;
import com.indeed.android.messaging.data.events.EventRecord;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ky4 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ky4(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ((EventRecord.Attachment) obj).getClass();
                ((Function2) obj4).invoke((EventRecord) obj3, (EventRecord.Attachment) obj2);
                break;
            case 1:
                e5g e5gVar = (e5g) obj4;
                ApiError apiError = (ApiError) obj3;
                zob zobVar = (zob) obj2;
                y3b y3bVar = (y3b) obj;
                y3bVar.getClass();
                e5gVar.getClass();
                y3bVar.a.add(new kve("tk", e5gVar.toString()));
                y3bVar.b("initVersion", "v4");
                y3bVar.b("cause_class", apiError.getCause().getClass().getName());
                String message = apiError.getCause().getMessage();
                if (message != null) {
                    y3bVar.b("cause_message", message);
                }
                y3bVar.b("error_type", apiError.getErrorType().a());
                y3bVar.b("msg", apiError.getMsg());
                y3bVar.b("load_reason", zobVar.a());
                ErrorData error = apiError.getError();
                if (error != null) {
                    y3bVar.b("error", error.toString());
                }
                break;
            case 2:
                ReactInstance reactInstance = (ReactInstance) obj;
                AtomicInteger atomicInteger = ReactHostImpl.A;
                reactInstance.getClass();
                ((ReactHostImpl) obj4).t((String) obj3, "Execute");
                reactInstance.h((qoc) obj2);
                break;
            default:
                Function1 function1 = (Function1) obj3;
                g4a g4aVar = (g4a) obj2;
                jhf jhfVar = (jhf) obj;
                jhfVar.getClass();
                ((Function1) obj4).invoke(jhfVar);
                if (jhfVar.a.b.length() == 0) {
                    Boolean bool = Boolean.FALSE;
                    g4aVar.setValue(bool);
                    function1.invoke(bool);
                } else {
                    Boolean bool2 = Boolean.TRUE;
                    g4aVar.setValue(bool2);
                    function1.invoke(bool2);
                }
                break;
        }
        return j6g.a;
    }
}
