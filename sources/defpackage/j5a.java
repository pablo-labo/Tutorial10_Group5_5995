package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j5a implements goa, ev5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ j5a(Function1 function1, int i) {
        this.a = i;
        this.b = function1;
    }

    @Override // defpackage.ev5
    public final vu5 c() {
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                return (or) function1;
            default:
                return (cu) function1;
        }
    }

    @Override // defpackage.goa
    public final /* synthetic */ void d(Object obj) {
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                ((or) function1).invoke(obj);
                break;
            default:
                ((cu) function1).invoke(obj);
                break;
        }
    }

    public final boolean equals(Object obj) {
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                if (!(obj instanceof goa) || !(obj instanceof ev5) || ((or) function1) != ((ev5) obj).c()) {
                }
                break;
            default:
                if (!(obj instanceof goa) || !(obj instanceof ev5) || ((cu) function1) != ((ev5) obj).c()) {
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
                return ((or) function1).hashCode();
            default:
                return ((cu) function1).hashCode();
        }
    }
}
