package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cq9 implements goa, ev5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ cq9(Function1 function1, int i) {
        this.a = i;
        this.b = function1;
    }

    @Override // defpackage.ev5
    public final vu5 c() {
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                return (tv) function1;
            case 1:
                return (yh) function1;
            default:
                return (q3) function1;
        }
    }

    @Override // defpackage.goa
    public final /* synthetic */ void d(Object obj) {
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                ((tv) function1).invoke(obj);
                break;
            case 1:
                ((yh) function1).invoke(obj);
                break;
            default:
                ((q3) function1).invoke(obj);
                break;
        }
    }

    public final boolean equals(Object obj) {
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                if (!(obj instanceof goa) || !(obj instanceof ev5) || ((tv) function1) != ((ev5) obj).c()) {
                }
                break;
            case 1:
                if (!(obj instanceof goa) || !(obj instanceof ev5) || ((yh) function1) != ((ev5) obj).c()) {
                }
                break;
            default:
                if (!(obj instanceof goa) || !(obj instanceof ev5) || ((q3) function1) != ((ev5) obj).c()) {
                }
                break;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                return ((tv) function1).hashCode();
            case 1:
                return ((yh) function1).hashCode();
            default:
                return ((q3) function1).hashCode();
        }
    }
}
