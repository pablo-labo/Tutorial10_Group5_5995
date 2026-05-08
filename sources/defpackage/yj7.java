package defpackage;

import defpackage.lx5;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class yj7 {
    public final boolean a;
    public final String b;
    public final Function1<lx5.b, j6g> c;

    /* JADX WARN: Multi-variable type inference failed */
    public yj7(boolean z, String str, Function1<? super lx5.b, j6g> function1) {
        this.a = z;
        this.b = str;
        this.c = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yj7)) {
            return false;
        }
        yj7 yj7Var = (yj7) obj;
        return this.a == yj7Var.a && this.b.equals(yj7Var.b) && this.c.equals(yj7Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + akb.d(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "InterviewNowData(showInterviewNowContent=" + this.a + ", joinSessionUrl=" + this.b + ", logParams=" + this.c + ")";
    }
}
