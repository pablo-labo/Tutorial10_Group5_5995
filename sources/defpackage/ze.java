package defpackage;

import com.indeed.android.jsmappservices.bridge.SearchType;
import defpackage.oq7;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ze implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ ze(Function1 function1, int i) {
        this.a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        w49 w49Var;
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                function1.invoke(str);
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                function1.invoke(bool);
                break;
            case 2:
                mq7 mq7Var = (mq7) obj;
                mq7Var.getClass();
                int iOrdinal = mq7Var.ordinal();
                if (iOrdinal == 0) {
                    w49Var = w49.c;
                } else if (iOrdinal != 1) {
                    l.g();
                } else {
                    w49Var = w49.b;
                }
                function1.invoke(new oq7.g(w49Var));
                break;
            default:
                ((Boolean) obj).booleanValue();
                function1.invoke(SearchType.c);
                break;
        }
        return j6g.a;
    }
}
