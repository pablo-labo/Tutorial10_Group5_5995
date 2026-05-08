package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class da7 implements goa, ev5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ da7(Function1 function1, int i) {
        this.a = i;
        this.b = function1;
    }

    @Override // defpackage.ev5
    public final vu5 c() {
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                return (gr0) function1;
            default:
                return function1;
        }
    }

    @Override // defpackage.goa
    public final /* synthetic */ void d(Object obj) {
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                ((gr0) function1).invoke(obj);
                break;
            default:
                function1.invoke(obj);
                break;
        }
    }

    public final boolean equals(Object obj) {
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                return (obj instanceof goa) && (obj instanceof ev5) && ((gr0) function1) == ((ev5) obj).c();
            default:
                if ((obj instanceof goa) && (obj instanceof ev5)) {
                    return function1.equals(((ev5) obj).c());
                }
                return false;
        }
    }

    public final int hashCode() {
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                return ((gr0) function1).hashCode();
            default:
                return function1.hashCode();
        }
    }
}
