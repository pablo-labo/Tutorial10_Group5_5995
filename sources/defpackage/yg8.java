package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class yg8 {
    public static final yg8 g = new yg8(0);
    public final Function1<xg8, j6g> a;
    public final Function1<xg8, j6g> b;
    public final Function1<xg8, j6g> c;
    public final Function1<xg8, j6g> d;
    public final Function1<xg8, j6g> e;
    public final Function1<xg8, j6g> f;

    /* JADX WARN: Multi-variable type inference failed */
    public yg8(Function1<? super xg8, j6g> function1, Function1<? super xg8, j6g> function12, Function1<? super xg8, j6g> function13, Function1<? super xg8, j6g> function14, Function1<? super xg8, j6g> function15, Function1<? super xg8, j6g> function16) {
        this.a = function1;
        this.b = function12;
        this.c = function13;
        this.d = function14;
        this.e = function15;
        this.f = function16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yg8)) {
            return false;
        }
        yg8 yg8Var = (yg8) obj;
        return this.a == yg8Var.a && this.b == yg8Var.b && this.c == yg8Var.c && this.d == yg8Var.d && this.e == yg8Var.e && this.f == yg8Var.f;
    }

    public final int hashCode() {
        Function1<xg8, j6g> function1 = this.a;
        int iHashCode = (function1 != null ? function1.hashCode() : 0) * 31;
        Function1<xg8, j6g> function12 = this.b;
        int iHashCode2 = (iHashCode + (function12 != null ? function12.hashCode() : 0)) * 31;
        Function1<xg8, j6g> function13 = this.c;
        int iHashCode3 = (iHashCode2 + (function13 != null ? function13.hashCode() : 0)) * 31;
        Function1<xg8, j6g> function14 = this.d;
        int iHashCode4 = (iHashCode3 + (function14 != null ? function14.hashCode() : 0)) * 31;
        Function1<xg8, j6g> function15 = this.e;
        int iHashCode5 = (iHashCode4 + (function15 != null ? function15.hashCode() : 0)) * 31;
        Function1<xg8, j6g> function16 = this.f;
        return iHashCode5 + (function16 != null ? function16.hashCode() : 0);
    }

    public /* synthetic */ yg8(int i) {
        this(null, null, null, null, null, null);
    }
}
