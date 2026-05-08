package defpackage;

import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class a42 {
    public final n8a a;
    public final pxc b;
    public final Collection<n8a> c;
    public final Function1<kv5, String> d;
    public final b32[] e;

    public a42() {
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a42(n8a n8aVar, b32[] b32VarArr, Function1<? super kv5, String> function1) {
        this(n8aVar, null, null, function1, (b32[]) Arrays.copyOf(b32VarArr, b32VarArr.length));
        n8aVar.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a42(n8a n8aVar, pxc pxcVar, Collection<n8a> collection, Function1<? super kv5, String> function1, b32... b32VarArr) {
        this.a = n8aVar;
        this.b = pxcVar;
        this.c = collection;
        this.d = function1;
        this.e = b32VarArr;
    }

    public /* synthetic */ a42(n8a n8aVar, b32[] b32VarArr) {
        this(n8aVar, b32VarArr, x32.b);
    }

    public /* synthetic */ a42(Collection collection, b32[] b32VarArr) {
        this((Collection<n8a>) collection, b32VarArr, z32.b);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a42(Collection<n8a> collection, b32[] b32VarArr, Function1<? super kv5, String> function1) {
        this(null, null, collection, function1, (b32[]) Arrays.copyOf(b32VarArr, b32VarArr.length));
        collection.getClass();
    }
}
