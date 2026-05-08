package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class r5e<T> {
    public final String a;
    public final Function2<T, T, T> b;
    public final boolean c;

    public r5e() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r5e(String str, Function2<? super T, ? super T, ? extends T> function2) {
        this.a = str;
        this.b = function2;
    }

    public final String toString() {
        return "AccessibilityKey: " + this.a;
    }

    public /* synthetic */ r5e(String str) {
        this(str, q5e.a);
    }

    public r5e(String str, int i) {
        this(str);
        this.c = true;
    }

    public r5e(String str, Function2 function2, boolean z) {
        this(str, function2);
        this.c = z;
    }
}
