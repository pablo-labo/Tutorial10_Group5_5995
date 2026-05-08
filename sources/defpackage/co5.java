package defpackage;

import android.content.Context;
import defpackage.go5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class co5 implements Callable<go5.a> {
    public final /* synthetic */ String a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ bo5 c;
    public final /* synthetic */ int d;

    public co5(String str, Context context, bo5 bo5Var, int i) {
        this.a = str;
        this.b = context;
        this.c = bo5Var;
        this.d = i;
    }

    @Override // java.util.concurrent.Callable
    public final go5.a call() {
        Object[] objArr = {this.c};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        return go5.b(this.a, this.b, Collections.unmodifiableList(arrayList), this.d);
    }
}
